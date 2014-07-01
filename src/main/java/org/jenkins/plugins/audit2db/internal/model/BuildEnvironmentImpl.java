/**
 *
 */
package org.jenkins.plugins.audit2db.internal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.jenkins.plugins.audit2db.model.BuildDetails;
import org.jenkins.plugins.audit2db.model.BuildEnvironment;

/*

   USE JENKINS

   create table  JENKINS_BUILD_NODE (
   `URL`     varchar(120) NOT NULL, #      Primary Key.
   `NAME`     varchar(120),    # The internal name of the node where builds get
      executed.
   `DISPLAYNAME`     varchar(120),    # The name of the node as displayed to the
      user.
   `MASTERHOSTNAME`     varchar(120),    # The hostname of the master that owns
      the build node.
   `MASTERADDRESS`     varchar(120),    # The IP address of the master that owns
      the build node.
   `LABEL`     varchar(120),     # The label associated with this node in
      Jenkins
   `DESCRIPTION`     varchar(120),     # The description of this node in Jenkins
   PRIMARY KEY ( `URL` )
   ) engine=InnoDB;


   create table  JENKINS_BUILD_DETAILS(
   `ID` varchar(120) NOT NULL, # Primary Key
   `NAME` varchar(120), # The name of the project that the build refers to.
   `FULLNAME` varchar(120) , # Full name of the build, includes the project name
      and build number. E.g. "TestProj #44"
   `NODE_URL` varchar(120),     # Foreign key on JENKINS_BUILD_NODE.
   `STARTDATE` DATE, # The build's start date.
   `ENDDATE`  DATE,  # The build's end date.
   `DURATION` int , # The build's duration in milliseconds.
   `USERID`     varchar(120), #  The id of the user who started the build (NULL
      for Anonymous).
   `USERNAME` varchar(120),  #  The name of the user who started the build.
   `RESULT`     varchar(120),  # The build result.
   PRIMARY KEY ( `ID` ),
   FOREIGN KEY(`NODE_URL`) references JENKINS_BUILD_NODE(`URL`)
   ) engine=InnoDB;


   create table  JENKINS_BUILD_PARAMS (
   `ID`     varchar(120),    #  Primary Key
   `NAME`     varchar(120),    # The parameter name
   `VALUE`     varchar(120),    #  The parameter value
   `BUILDDETAILS_ID`     varchar(120),    #  Foreign key on
      JENKINS_BUILD_DETAILS
   PRIMARY KEY ( `ID` ),
   FOREIGN KEY(`BUILDDETAILS_ID`) references JENKINS_BUILD_DETAILS(`ID`)
   ) engine=InnoDB;


   create table  JENKINS_BUILD_ENVIRONMENT (
   `ID`     varchar(120),    #  Primary Key
   `NAME`     varchar(120),    # The parameter name
   `VALUE`     varchar(1024),    #  The parameter value
   `BUILDDETAILS_ID`     varchar(120),    #  Foreign key on
      JENKINS_BUILD_DETAILS
   PRIMARY KEY ( `ID` ),
   FOREIGN KEY(`BUILDDETAILS_ID`) references JENKINS_BUILD_DETAILS(`ID`)
   ) engine=InnoDB;


 */

/**
 * Data class for build parameters.
 *
 * @author Marco Scata
 *
 */
@Entity(name = "JENKINS_BUILD_ENVIRONMENT")
public class BuildEnvironmentImpl implements BuildEnvironment {
  private String id;
  private String name;
  private String value;
  private BuildDetails buildDetails;

  public BuildEnvironmentImpl() {
    super();
  }

  public BuildEnvironmentImpl(final String       id,
                              final String       name,
                              final String       value,
                              final BuildDetails buildDetails) {
    this.id           = id;
    this.name         = name;
    this.value        = value;
    this.buildDetails = buildDetails;
  }

  /**
   * @see org.jenkins.plugins.audit2db.model.BuildEnvironment#getId()
   */
  @Id

  //    @GeneratedValue(strategy = GenerationType.IDENTITY)
                @Column(nullable = false, unique = true)
  @Override
  public String getId() {
    return id;
  }

  /**
   * @see
   *org.jenkins.plugins.audit2db.model.BuildEnvironment#setId(java.lang.String)
   */
  @Override
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * @see org.jenkins.plugins.audit2db.model.BuildEnvironment#getName()
   */
  @Column(nullable = false, unique = false)
  @Override
  public String getName() {
    return name;
  }

  /**
   * @see
   *org.jenkins.plugins.audit2db.model.BuildEnvironment#setName(java.lang.String)
   */
  @Override
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * @see org.jenkins.plugins.audit2db.model.BuildEnvironment#getValue()
   */
  @Column(nullable = true, unique = false)
  @Override
  public String getValue() {
    return value;
  }

  /**
   * @see
   *org.jenkins.plugins.audit2db.model.BuildEnvironment#setValue(java.lang.String)
   */
  @Override
  public void setValue(final String value) {
    this.value = value;
  }

  /**
   * @see org.jenkins.plugins.audit2db.model.BuildEnvironment#getBuildDetails()
   */
  @ManyToOne(targetEntity = BuildDetailsImpl.class )
  @JoinColumn(nullable = false, unique = false)
  @Override
  public BuildDetails getBuildDetails() {
    return buildDetails;
  }

  /**
   * @see
   *org.jenkins.plugins.audit2db.model.BuildEnvironment#setBuildDetails(java.lang.String)
   */
  @Override
  public void setBuildDetails(final BuildDetails buildDetails) {
    this.buildDetails = buildDetails;
  }

  @Override
  public String toString() {
    return String.format("%s=%s",
                         this.id, this.value);
  }

  @Override
  public int hashCode() {
    return this.id.hashCode();
  }

  @Override
  public boolean equals(final Object obj) {
    // fail-fast logic
    if (this == obj) return true;

    if (null == obj) return false;

    if (!(obj instanceof BuildEnvironment)) return false;

    final BuildEnvironment other = (BuildEnvironment)obj;

    return other.hashCode() == this.hashCode();
  }
}

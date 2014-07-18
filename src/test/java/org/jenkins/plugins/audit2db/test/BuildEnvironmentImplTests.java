package org.jenkins.plugins.audit2db.test;

import java.util.Date;

import junit.framework.Assert;

import org.jenkins.plugins.audit2db.internal.model.BuildDetailsImpl;
import org.jenkins.plugins.audit2db.internal.model.BuildEnvironmentImpl;
import org.jenkins.plugins.audit2db.internal.model.BuildEnvironmentImpl;

import org.jenkins.plugins.audit2db.model.BuildDetails;
import org.jenkins.plugins.audit2db.model.BuildEnvironment;
import org.jenkins.plugins.audit2db.model.BuildEnvironment;


import org.junit.Test;

/**
 * Unit tests for the {@link BuildEnvironmentImpl} class.
 *
 * @author Marco Scata
 *
 */
public class BuildEnvironmentImplTests {
    private final BuildDetails details = new BuildDetailsImpl(
            "BUILDID", "BUILD NAME", "BUILD_FULLNAME", new Date(),
            new Date(), 10L, "USERID", "USERNAME", null, null, null);

    private final BuildDetails otherDetails = new BuildDetailsImpl(
            "BUILDIDXXX", "BUILD NAME", "BUILD_FULLNAME", new Date(),
            new Date(), 10L, "USERID", "USERNAME", null, null, null);

    private final BuildEnvironment expected = new BuildEnvironmentImpl(
            "ENVIRON_ID", "ENVIRON NAME", "ENVIRON VALUE", details);

    @Test
    public void differentAttributesShouldPreserveEquality(){
        final BuildEnvironment actual = new BuildEnvironmentImpl(
                expected.getId(),
                expected.getName() + "DIFFERENT",
                expected.getValue() + "DIFFERENT",
                otherDetails);
        Assert.assertEquals("Broken equality", expected, actual);
    }

    @Test
    public void differentIdShouldBreakEquality(){
        final BuildEnvironment actual = new BuildEnvironmentImpl(
                expected.getId() + "DIFFERENT",
                expected.getName(),
                expected.getValue(),
                expected.getBuildDetails());
        Assert.assertFalse("Broken inequality logic", actual.equals(expected));
    }

    @Test
    public void equalsNullShouldBeFalse() {
        Assert.assertFalse("Broken inequality logic", expected.equals(null));
    }

    @Test
    public void equalsSomethingElseShouldBeFalse() {
        Assert.assertFalse("Broken inequality logic", expected.equals("SOMESTRING"));
    }
}

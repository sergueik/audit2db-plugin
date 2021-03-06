/**
 *
 */
package org.jenkins.plugins.audit2db.test.integration.webpages;

import java.io.IOException;
import java.util.List;

import org.jvnet.hudson.test.HudsonTestCase.WebClient;

import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * @author Marco Scata
 *
 */
public class JobsByDateReportPage extends AbstractJenkinsPage {
  private final static String urlPath = "audit2db.reports/jobsByDate";
  private HtmlForm reportFilter;

  public JobsByDateReportPage(final WebClient client) {
    super(client, urlPath);
  }

  @Override
  public void load() {
    super.load();
    reportFilter = getPage().getFormByName("reportFilter");
  }

  public String getStartDate() {
    return getInputValue(reportFilter, "startDate");
  }

  public void setStartDate(final String startDate) {
    setInputValue(reportFilter, "startDate", startDate);
  }

  public String getEndDate() {
    return getInputValue(reportFilter, "endDate");
  }

  public void setEndDate(final String endDate) {
    setInputValue(reportFilter, "endDate", endDate);
  }

  public HtmlPage submit() {
    try {
      final List<HtmlElement> buttons = reportFilter
                                        .getHtmlElementsByTagName("button");

	    // just trust that the submit button is the last one
	    // see https://wiki.jenkins-ci.org/display/JENKINS/Unit+Test#UnitTest-Submittingforms
	    return ((HtmlButton) buttons.get(buttons.size() - 1)).click();
	} catch (final IOException e) {
	    throw new RuntimeException(e);
	}
    }
}

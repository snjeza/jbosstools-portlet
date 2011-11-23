package org.jboss.tools.portlet.ui.bot.test;

import org.jboss.tools.portlet.ui.bot.test.create.CreateJavaPortlet;
import org.jboss.tools.portlet.ui.bot.test.create.CreateJavaPortletProject;
import org.jboss.tools.portlet.ui.bot.test.create.RunJavaPortletOnServer;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(RequirementAwareUsageWindowClosingSuite.class)
@Suite.SuiteClasses({
	CreateJavaPortletProject.class,
	CreateJavaPortlet.class, 
	RunJavaPortletOnServer.class
	})
public class JavaPortletTestSuite {

}
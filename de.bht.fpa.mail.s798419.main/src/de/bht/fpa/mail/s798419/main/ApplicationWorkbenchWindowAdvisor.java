package de.bht.fpa.mail.s798419.main;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

  static final int WINDOW_WIDTH = 800;
  static final int WINDOW_HEIGHT = 600;

  public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
    super(configurer);
  }

  @Override
  public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
    return new ApplicationActionBarAdvisor(configurer);
  }

  @Override
  public void preWindowOpen() {
    IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
    configurer.setInitialSize(new Point(WINDOW_WIDTH, WINDOW_HEIGHT));
    configurer.setShowCoolBar(false);
    configurer.setShowStatusLine(true);
    configurer.setShowProgressIndicator(true);
    configurer.setTitle("FPA Mailer"); //$NON-NLS-1$
  }

}

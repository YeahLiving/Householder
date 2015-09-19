package com.yeahliving.api.services;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by xingfeiy on 8/17/15.
 */
public class WebServiceConfigInitializer implements ServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent initEvent) {

        //final LogContext logContext = this.LOG.enter("WebServiceConfigInitializer.contextInitialized");

        try {

            //this.LOG.info("************************************************************************************");
            //this.LOG.info("*             Server Configuration Done Successfully, Server Started NOW           *");
            //this.LOG.info("************************************************************************************");

            //ResourceController controller = new ResourceController();
            //controller.startUp(null, null);
            startup();

            //ThreadHandler.getInstance().start();
        }
        catch (final Exception e) {
            e.printStackTrace();
            //this.LOG.error(e, "[WebServiceConfigInitializer] - ", e);
        }

        //this.LOG.exit(logContext, "WebServiceConfigInitializer.contextInitialized");
    }

    protected void startup () {
        System.out.println("Start initialize");


        System.out.println("Finished initialize");

    }

    @Override
    public void contextDestroyed(final ServletContextEvent destroyEvent) {


    }
}

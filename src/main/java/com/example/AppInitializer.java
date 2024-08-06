package com.example;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {
//    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        AnnotationConfigWebApplicationContext ctx =new AnnotationConfigWebApplicationContext();
//        ctx.scan("com.example");
        ctx.register(WebConfig.class);
        ctx.setServletContext(sc);
        sc.addListener(new ContextLoaderListener(ctx));
        ServletRegistration.Dynamic appServlet = sc.addServlet("mvc", new DispatcherServlet(ctx));
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping("/");
    }
}



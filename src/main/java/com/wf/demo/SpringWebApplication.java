package com.wf.demo;

import java.sql.SQLException;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) throws BeansException, SQLException {
		ApplicationContext ac = SpringApplication.run(SpringWebApplication.class, args);
	}
	/*
	 * @Bean public ServletWebServerFactory servletContainer() {
	 * TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
	 * 
	 * @Override protected void postProcessContext(Context context) {
	 * SecurityConstraint sc= new SecurityConstraint();
	 * sc.setUserConstraint("CONFIDENTIAL"); SecurityCollection collection = new
	 * SecurityCollection(); collection.addPattern("/*");
	 * sc.addCollection(collection); context.addConstraint(sc); } };
	 * tomcat.addAdditionalTomcatConnectors(getHttpConnector()); return tomcat; }
	 * 
	 * private Connector getHttpConnector() { Connector connector = new
	 * Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
	 * connector.setScheme("http"); connector.setPort(8090);
	 * connector.setSecure(false); connector.setRedirectPort(8443); return
	 * connector; }
	 */

}

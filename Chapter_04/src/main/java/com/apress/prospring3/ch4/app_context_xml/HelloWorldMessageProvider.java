/**
 * Created on Sep 11, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;


/**
 * @author Clarence
 *
 */
public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		
		return "Hello World!";
	}
	
}

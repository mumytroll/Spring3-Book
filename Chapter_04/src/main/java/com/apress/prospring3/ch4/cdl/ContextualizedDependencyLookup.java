/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.cdl;

/**
 * @author Clarence
 *
 */
public class ContextualizedDependencyLookup implements ManagedComponent {

    private Dependency dependency;

    public void performLookup(Container container) {
        this.dependency = (Dependency) container.getDependency("myDependency");
    }
	
}

package co.edureka;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
//import org.junit.runner.Result;

public class DemoClass {

	public static void main(String[] args) {
		
		Result result=JUnitCore.runClasses(Junticlass.class);

	for(Failure failure : result.getFailures())
	{
		System.out.println(failure.toString());
	}	
		System.out.println("resutlt=="+result.wasSuccessful());
	
	}

}

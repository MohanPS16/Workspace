package b1_listenerTest;

import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class MyListener implements IInvokedMethodListener, IReporter,ISuiteListener,ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart(ITestResult result)");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess(ITestResult result)");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure(ITestResult result)");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped(ITestResult result)");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage(ITestResult result)");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart(ITestContext context)");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish(ITestContext context)");
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("onStart(ISuite suite)");
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("onFinish(ISuite suite)");
	}

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		System.out.println("generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) ");
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("beforeInvocation(IInvokedMethod method, ITestResult testResult)");
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("afterInvocation(IInvokedMethod method, ITestResult testResult) ");
	}

}

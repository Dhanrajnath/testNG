package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class PostActionsUsingListeners implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        System.out.println("PostActionsUsingListeners.onStart");
        System.out.println("context = " + context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.println("PostActionsUsingListeners.onFinish");
        System.out.println("context = " + context);
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println("PostActionsUsingListeners.onTestStart");
        System.out.println("result = " + result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println("PostActionsUsingListeners.onTestSuccess");
        System.out.println("result = " + result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("PostActionsUsingListeners.onTestFailure");
        System.out.println("result = " + result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println("PostActionsUsingListeners.onTestSkipped");
        System.out.println("result = " + result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        System.out.println("PostActionsUsingListeners.onTestFailedButWithinSuccessPercentage");
        System.out.println("result = " + result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println("PostActionsUsingListeners.onTestFailedWithTimeout");
        System.out.println("result = " + result);
    }
}

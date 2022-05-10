//package reportManager;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class ExtentManager {
//
//    private static ExtentReports extentReports = null;
//
//    //private static ExtentTest report = null;
//    private static ThreadLocal<ExtentReports> extent = new ThreadLocal();
//    private static ThreadLocal<ExtentTest> test = new ThreadLocal();
//    private static ThreadLocal<ExtentTest> child = new ThreadLocal();
//    private static ThreadLocal<ExtentTest> subchild = new ThreadLocal();
//
//    public static ExtentTest logger;
//
//    public ExtentManager() {
//    }
//
//
//    public synchronized static ThreadLocal<ExtentTest> getTest() {
//        return test;
//    }
//
//    public synchronized static void setTest(ExtentTest test) {
//        getTest().set(test);
//    }
//
//    public synchronized static ThreadLocal<ExtentTest> getChild() {
//        return child;
//    }
//
//    public synchronized static void setChild(ExtentTest child) {
//        getChild().set(child);
//    }
//
//    public static ThreadLocal<ExtentReports> getExtent() {
//        return extent;
//    }
//
//    public static void setExtent(ExtentReports extent) {
//        getExtent().set(extent);
//    }
//
//    public static ExtentReports getInstance() {
//        return extentReports;
//    }
//
////{    public ExtentReports report; ---extentReports
////
////    public ExtentTest logger;
////
////    //            ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/UiTestingPlayGroundReport+"+utility.dateAndTime()+".html"));
//////            report= new ExtentReports();
//////            report.attachReporter(extent);
////
////        // logger=report.createTest("DYNAMIC_LINK_VALIDATION");}
//
//    public static ExtentReports createInstance(String reportFolderPath, String reportName) {
//        if (extentReports == null) {
//            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportFolderPath + reportName);
//            htmlReporter.config().setDocumentTitle("Automation Report");
//            htmlReporter.config().setReportName("Automation Reports ");
//            htmlReporter.config().setTheme(Theme.STANDARD);
//            htmlReporter.config().setEncoding("utf-8");
//            extentReports = new ExtentReports();
//            extentReports.attachReporter(htmlReporter);
//            logger=extentReports.createTest("DYNAMIC_LINK_VALIDATION");
//            setExtent(extentReports);
//            return getExtent().get();
//        }
//        return extentReports;
//    }
//
//    public static void addExecutionDetails_ExtentReport() {
//        getExtent().get().flush();
//    }
//}
//

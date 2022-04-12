Thank you for getting to this point. This repository was created for a training related to TestNG. How to use the test framework. 

## Topics Covered
- Setting up TestNG in Eclipse for a Java Project
- @Test & TestNG Annotations
	- @BeforeTest. Ex. Base Url, clear DB, etc
	- @AfterTest - Clear Cookies, quit browser, Close connections, etc
	- XML File usage (Test Suite > Test Folder (Module/Shell) > Test Case)
	- @BeforeSuite (different URl, environment details/variables) and @AfterSuite
	- @BeforeMethod @AfterMethod
	- @BeforeClass @AfterClass
- Prioritizing Test Cases based on desires
- Include/Exclude to mechanism to control test cases
- Executing test cases at Package level with regex (Example: Mobile.*)
- Naming Conventions
- Groups
- Helper Attibutes
	- dependsOnMethods={""} 
	- (enabled=false) - Skips test cases fails
	- (timeOut=4000) - wait until fail.


## Install / Usage Process (My personal setup)
1. Open Eclipse > Help > Eclipse Marketplace
2. Search for TestNG > Install
3. End Installation and Restart IDE

**Prerequisites (in this case):**
- Java
- Eclipse IDE
- Proper setup for System variables environment

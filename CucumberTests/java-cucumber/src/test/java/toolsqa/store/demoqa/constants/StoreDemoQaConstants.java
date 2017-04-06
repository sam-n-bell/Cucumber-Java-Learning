package toolsqa.store.demoqa.constants;

public enum StoreDemoQaConstants {
	
	STORE_QA_HOME("http://store.demoqa.com/"),
	LOGIN_PAGE_TEXT("You must be logged in to use this page. Please use the form below to login to your account.");
	private String val;
	
	StoreDemoQaConstants(String val)
	{
		this.val = val;
	}
	
	public String value() {
		return this.val;
	}
}

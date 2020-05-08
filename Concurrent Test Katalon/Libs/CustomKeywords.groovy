
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "customKeywords.FintegrityCommonKey.refreshBrowser"() {
    (new customKeywords.FintegrityCommonKey()).refreshBrowser()
}

def static "customKeywords.FintegrityCommonKey.clickElement"(
    	TestObject to	) {
    (new customKeywords.FintegrityCommonKey()).clickElement(
        	to)
}

def static "customKeywords.FintegrityCommonKey.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new customKeywords.FintegrityCommonKey()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "customKeywords.FintegrityCommonKey.LoginFintegrity"(
    	String userName	
     , 	String password	) {
    (new customKeywords.FintegrityCommonKey()).LoginFintegrity(
        	userName
         , 	password)
}

def static "customKeywords.LoginHelper.DoLogin"(
    	String aplicationURL	
     , 	String userName	
     , 	String password	) {
    (new customKeywords.LoginHelper()).DoLogin(
        	aplicationURL
         , 	userName
         , 	password)
}

def static "customKeywords.CustomKeywordJS.clickUsingJS"(
    	TestObject to	
     , 	int timeout	) {
    (new customKeywords.CustomKeywordJS()).clickUsingJS(
        	to
         , 	timeout)
}

def static "customKeywords.CustomKeywordJS.setDateUsingJS"(
    	TestObject to	
     , 	String dateValue	
     , 	int timeout	) {
    (new customKeywords.CustomKeywordJS()).setDateUsingJS(
        	to
         , 	dateValue
         , 	timeout)
}

def static "customKeywords.CustomKeywordJS.setDateUsingJSIframe"(
    	TestObject frame	
     , 	TestObject to	
     , 	String dateValue	
     , 	int timeout	) {
    (new customKeywords.CustomKeywordJS()).setDateUsingJSIframe(
        	frame
         , 	to
         , 	dateValue
         , 	timeout)
}

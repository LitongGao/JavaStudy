package com.Study.XMLCreate;

import java.util.ArrayList;
import java.util.HashMap;

public interface IGetMaps {
	
	public ArrayList<HashMap<String, Object>> getMap(String testDataLocation, String TestCaseName);
	public HashMap<String,Object>getBusinessMap(ArrayList<HashMap<String, Object>> mainMap);
	public ArrayList<HashMap<String,Object>>getCustomersList(ArrayList<HashMap<String, Object>> mainMap);
	ArrayList<HashMap<String, Object>> getChildForCurrentNode(String childName, HashMap<String, Object> node);
}

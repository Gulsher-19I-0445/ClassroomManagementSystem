package BusinessLogic;

import java.util.ArrayList;

import DataBase.Oracle_DataBase;

public class AssessmentCatalog 
{
	static ArrayList<Assessment> obj = new ArrayList<Assessment>();
	
	static public void addAssessment(Assessment assessment)
	{
		obj.add(assessment);
		Oracle_DataBase.addAssessment(assessment);
	}

	public static ArrayList<Assessment> getObj() {
		return obj;
	}

	public static void setObj(ArrayList<Assessment> obj) {
		AssessmentCatalog.obj = obj;
	}
	
	
	
}

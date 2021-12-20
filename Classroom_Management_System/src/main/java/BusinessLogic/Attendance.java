package BusinessLogic;

import java.sql.SQLException;

import DataBase.Oracle_DataBase;


public class Attendance 
{
	String date;
	int AttendanceId;
	
	Attendance(String date1,int id) throws SQLException
	{
		date = date1;
		AttendanceId=id;
		
		
		System.out.println(this.AttendanceId);
		Oracle_DataBase.addAttendance(this);
	}
	public Attendance()
	{
		
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setAttendanceId(int attendanceId) {
		AttendanceId = attendanceId;
	}
	public String getDate()
	{
		return date;
	}
	public int getAttendanceId()
	{
		return AttendanceId;
	}
	
	
}
package com.Study.ClassAndObject;
import java.time.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.time.Instant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class ConvertDate {
	 
	//ArrayList<HashMap<String,Object>> clonedModelMap = 
	private Instant before;
	private Instant after;
	public Instant getTimeSpan(Instant time){
		
		return after;
	}
	
	public static void main(String args[]){
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat time = new SimpleDateFormat("yyyy MM dd HH mm ss");
		System.out.println(time.format(now));
		
		Calendar gc = GregorianCalendar.getInstance();
		System.out.println("gc.gettime:"+ gc.getTime());
		System.out.println("gc.getTimeInMillis():" + new Date(gc.getTimeInMillis()));
		dataTest();
	}
	
	public static void dataTest() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("D E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Currect date is " + ft.format(dNow));
		String str = String.format("Peter's time, %tc", dNow);
		System.out.println(str);
		System.out.printf("%1$s %2$tb %2$td, %2$tY", 
                "Due date:", dNow);
	}
}

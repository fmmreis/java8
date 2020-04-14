package javatime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.joda.time.DateTimeZone;

public class TimeZoneTest {
	
	public static void main(String[] args) {
		
		String format = "yyyy-MM-dd-HH-mm-ss";
		String timezone = "America/Santiago";
		
		
		String sourceTimeZone = "UTC" ;
		LocalDateTime originalDate = LocalDateTime.now(ZoneId.of(sourceTimeZone));
		
		String result = "20200329 232344";
		
		LocalDateTime resultDate = LocalDateTime.parse(result, DateTimeFormatter.ofPattern(format));
		
		Date date = Date.from(originalDate.atZone(ZoneId.of(sourceTimeZone)).toInstant());
		Date date1 = Date.from(resultDate.atZone(ZoneId.of(timezone)).toInstant());
		
		int offsetOrig = DateTimeZone.forID(sourceTimeZone).getOffset(date.getTime()) / 3600000;
		int offsetTarget = DateTimeZone.forID(sourceTimeZone).getOffset(date1.getTime()) / 3600000;
		
		//int diff = 
		
	}
	

}

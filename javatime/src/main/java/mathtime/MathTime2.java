package mathtime;

import java.math.BigDecimal;
import java.math.MathContext;

public class MathTime2 {

    public static String toTime(String value){
                                                          
        BigDecimal milliPerDay = new BigDecimal(24*60*60*1000);
        BigDecimal milliPerHour =  new BigDecimal(60*60*1000);
        BigDecimal milliPerMinute = new BigDecimal(60*1000);
        BigDecimal milliPerSecond = new BigDecimal(1000);
        BigDecimal milliPerMilli = new BigDecimal(1);

        BigDecimal toConvert = new BigDecimal(value).remainder(BigDecimal.ONE).multiply(milliPerDay);
        
        BigDecimal hour = toConvert.divide(milliPerHour, MathContext.DECIMAL128);
        BigDecimal hora = new BigDecimal(hour.intValue());
        System.out.println(hora);

        toConvert =  toConvert.subtract(new BigDecimal(hora.multiply(milliPerHour).intValue()));
        BigDecimal minute = toConvert.divide(milliPerMinute, MathContext.DECIMAL128);
        BigDecimal minuto = new BigDecimal(minute.intValue());
        System.out.println(minuto);

        toConvert =  toConvert.subtract(new BigDecimal(minuto.multiply(milliPerMinute).intValue()));
        BigDecimal second = toConvert.divide(milliPerSecond, MathContext.DECIMAL128);
        BigDecimal segundo = new BigDecimal(second.intValue());
        System.out.println(segundo);

        toConvert =  toConvert.subtract(new BigDecimal(segundo.multiply(milliPerSecond).intValue()));
        BigDecimal millisecond = toConvert.divide(milliPerMilli, MathContext.DECIMAL128);
        BigDecimal milisegundo = new BigDecimal(millisecond.intValue());
        System.out.println(milisegundo);

        return null;
    }

    public static void main(String[] args) {
        toTime("43868.160274838003");
    	System.out.println("----");
        toTime("43868.160277777700");
        System.out.println("----");
        toTime("43868.160271711000");
    }

}
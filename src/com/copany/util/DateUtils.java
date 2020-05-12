package com.copany.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateUtils {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.atStartOfDay());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getEra());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


    }
    // Date, format,

    // date

    // local date
    // local date time

    // mm/dd/yyyy, mm-dd-yy,
    // mm/dd/ yyyy hh:mm:ss    --> mm/dd/yyyy, mm-dd-yy,
    // mm/dd/yyyy, mm-dd-yy,   ---> dd/mm/yyyy


}

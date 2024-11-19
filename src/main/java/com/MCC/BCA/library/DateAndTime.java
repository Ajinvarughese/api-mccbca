package com.MCC.BCA.library;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static String currentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mma");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }
}

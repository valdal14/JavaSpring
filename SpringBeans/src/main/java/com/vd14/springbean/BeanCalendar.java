package com.vd14.springbean;

import java.util.Calendar;

public class BeanCalendar {
    private Calendar calendar;

    public BeanCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }
}

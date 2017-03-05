package com.amigo.consultant.appflowmanager;

import java.util.HashMap;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public class AppFlow {
    private HashMap<String,String> mEvents = new HashMap<>();

    public static final String EVENT_WELCOME = "EVENT_WELCOME";
    public static final String EVENT_INITIALIZATION = "EVENT_INITIALIZATION";
    public static final String EVENT_TUTORIAL = "EVENT_TUTORIAL";
    public static final String EVENT_REGISTRATION = "EVENT_REGISTRATION";
    public static final String EVENT_HOME = "EVENT_HOME";
    public static final String EVENT_SETTINGS = "EVENT_SETTINGS";
    public static final String EVENT_NOTIFICATIONS = "EVENT_NOTIFICATIONS";
    public static final String EVENT_PROFILE = "EVENT_PROFILE";
    public static final String EVENT_CALENDAR = "EVENT_CALENDAR";
    public static final String EVENT_PATIENTSHISTORY = "EVENT_PATIENTSHISTORY";
    public static final String EVENT_PERMISSIONS = "EVENT_PERMISSIONS";
    public static final String EVENT_SCHEDULE = "EVENT_CALENDARSCHEDULE";
    public static final String EVENT_ADDCALENDAREVENT = "EVENT_ADDCALENDAREVENT";

    private static AppFlow ourInstance = new AppFlow();

    public static AppFlow getInstance() {
        return ourInstance;
    }

    private AppFlow() {
    }

    public void InitializeAppFlow() {

    }
}

package com.amigo.consultant.appflowmanager;

import android.content.Context;

import com.amigo.consultant.appflowmanager.appstates.CalendarState;
import com.amigo.consultant.appflowmanager.appstates.HomeState;
import com.amigo.consultant.appflowmanager.appstates.InitializationState;
import com.amigo.consultant.appflowmanager.appstates.NewCalendarEventState;
import com.amigo.consultant.appflowmanager.appstates.NotificationsState;
import com.amigo.consultant.appflowmanager.appstates.PatientsRecordState;
import com.amigo.consultant.appflowmanager.appstates.ProfileState;
import com.amigo.consultant.appflowmanager.appstates.RegistrationState;
import com.amigo.consultant.appflowmanager.appstates.ScheduleState;
import com.amigo.consultant.appflowmanager.appstates.SettingsState;
import com.amigo.consultant.appflowmanager.appstates.TutorialState;
import com.amigo.consultant.appflowmanager.appstates.WelcomeState;
import com.amigo.consultant.statemanager.StateManager;

import java.util.HashMap;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public class AppFlow {
    private HashMap<String,String> mTransitions = new HashMap<>();

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

    private StateManager mStateManager;

    private static AppFlow ourInstance = new AppFlow();

    public static AppFlow getInstance() {
        return ourInstance;
    }

    private AppFlow() {

    }

    public void InitializeAppFlow(Context context) {
        mStateManager = new ConsultantManager(context);

        addTransition(WelcomeState.IDENTIFIER,EVENT_INITIALIZATION, InitializationState.IDENTIFIER);

        addTransition(InitializationState.IDENTIFIER,EVENT_HOME, HomeState.IDENTIFIER);
        addTransition(InitializationState.IDENTIFIER,EVENT_TUTORIAL, TutorialState.IDENTIFIER);

        addTransition(InitializationState.IDENTIFIER,EVENT_REGISTRATION, RegistrationState.IDENTIFIER);
        addTransition(TutorialState.IDENTIFIER,EVENT_REGISTRATION, RegistrationState.IDENTIFIER);

        addTransition(RegistrationState.IDENTIFIER,EVENT_HOME, HomeState.IDENTIFIER);

        addTransition(HomeState.IDENTIFIER,EVENT_SETTINGS, SettingsState.IDENTIFIER);
        addTransition(SettingsState.IDENTIFIER,EVENT_HOME, HomeState.IDENTIFIER);

        addTransition(HomeState.IDENTIFIER,EVENT_PROFILE, ProfileState.IDENTIFIER);
        addTransition(ProfileState.IDENTIFIER,EVENT_HOME, HomeState.IDENTIFIER);

        addTransition(HomeState.IDENTIFIER,EVENT_NOTIFICATIONS, NotificationsState.IDENTIFIER);
        addTransition(NotificationsState.IDENTIFIER,EVENT_HOME, HomeState.IDENTIFIER);

        addTransition(HomeState.IDENTIFIER,EVENT_CALENDAR, CalendarState.IDENTIFIER);
        addTransition(CalendarState.IDENTIFIER,EVENT_HOME, HomeState.IDENTIFIER);

        addTransition(CalendarState.IDENTIFIER,EVENT_ADDCALENDAREVENT, NewCalendarEventState.IDENTIFIER);
        addTransition(NewCalendarEventState.IDENTIFIER,EVENT_CALENDAR, CalendarState.IDENTIFIER);

        addTransition(HomeState.IDENTIFIER,EVENT_PATIENTSHISTORY, PatientsRecordState.IDENTIFIER);
        addTransition(PatientsRecordState.IDENTIFIER,EVENT_HOME, HomeState.IDENTIFIER);

        addTransition(HomeState.IDENTIFIER,EVENT_SCHEDULE, ScheduleState.IDENTIFIER);
        addTransition(ScheduleState.IDENTIFIER,EVENT_HOME, HomeState.IDENTIFIER);
    }

    private void addTransition(String fromState, String event, String toState) {
        mTransitions.put(event,fromState);
    }

    public StateManager getStateManager() {
        return mStateManager;
    }

    public boolean isSessionFlowInitialized() {
        return mStateManager != null;
    }
}
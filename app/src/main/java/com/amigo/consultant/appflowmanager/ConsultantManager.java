package com.amigo.consultant.appflowmanager;

import android.content.Context;

import com.amigo.consultant.appflowmanager.appstates.CalendarState;
import com.amigo.consultant.appflowmanager.appstates.HomeState;
import com.amigo.consultant.appflowmanager.appstates.InitializationState;
import com.amigo.consultant.appflowmanager.appstates.NewCalendarEventState;
import com.amigo.consultant.appflowmanager.appstates.NotificationsState;
import com.amigo.consultant.appflowmanager.appstates.PatientsRecordState;
import com.amigo.consultant.appflowmanager.appstates.PermissionsState;
import com.amigo.consultant.appflowmanager.appstates.ProfileState;
import com.amigo.consultant.appflowmanager.appstates.RegistrationState;
import com.amigo.consultant.appflowmanager.appstates.ScheduleState;
import com.amigo.consultant.appflowmanager.appstates.SettingsState;
import com.amigo.consultant.appflowmanager.appstates.TutorialState;
import com.amigo.consultant.appflowmanager.appstates.WelcomeState;
import com.amigo.consultant.statemanager.BaseAppState;
import com.amigo.consultant.statemanager.StateManager;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public class ConsultantManager extends StateManager {

    public ConsultantManager(Context context) {
        super(context);
    }

    @Override
    public BaseAppState getStateByIdentifier(String Identifier) {
        if(Identifier.equals(WelcomeState.IDENTIFIER)) {
            return new WelcomeState();
        } else if(Identifier.equals(InitializationState.IDENTIFIER)) {
            return new InitializationState();
        } else if(Identifier.equals(CalendarState.IDENTIFIER)) {
            return new CalendarState();
        } else if(Identifier.equals(HomeState.IDENTIFIER)) {
            return new HomeState();
        } else if( Identifier.equals(NewCalendarEventState.IDENTIFIER)) {
            return new NewCalendarEventState();
        } else if(Identifier.equals(NotificationsState.IDENTIFIER)) {
            return new NotificationsState();
        } else if(Identifier.equals(PatientsRecordState.IDENTIFIER)) {
            return new PatientsRecordState();
        } else if(Identifier.equals(PermissionsState.IDENTIFIER)) {
            return new PermissionsState();
        } else if(Identifier.equals(ProfileState.IDENTIFIER)) {
            return new ProfileState();
        } else if(Identifier.equals(RegistrationState.IDENTIFIER)) {
            return new RegistrationState();
        } else if(Identifier.equals(ScheduleState.IDENTIFIER)) {
            return new ScheduleState();
        } else if(Identifier.equals(SettingsState.IDENTIFIER)) {
            return new SettingsState();
        } else if(Identifier.equals(TutorialState.IDENTIFIER)) {
            return new TutorialState();
        }
        return null;
    }
}

package com.amigo.consultant.appflowmanager.appstates;

import android.os.Bundle;

import com.amigo.consultant.statemanager.BaseAppState;

/**
 * Created by skaribasappa on 3/11/2017.
 */
public class ProfileState extends BaseAppState{
    public static String IDENTIFIER = "ProfileState";

    @Override
    public void reEnter(String event, Bundle data) {

    }

    @Override
    public void onEnter(String event, Bundle data) {

    }

    @Override
    public void onExit() {

    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public void handleExternalEvent(String event) {

    }
}

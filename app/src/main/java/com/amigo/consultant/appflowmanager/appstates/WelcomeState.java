package com.amigo.consultant.appflowmanager.appstates;

import android.content.Context;
import android.os.Bundle;

import com.amigo.consultant.statemanager.BaseAppState;
import com.amigo.consultant.statemanager.StateManager;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public class WelcomeState extends BaseAppState {
    public static String IDENTIFIER = "WelcomeState";

    private StateManager mStateManager;

    @Override
    public void initialize(StateManager stateManager, Context context) {
        mStateManager = stateManager;
    }

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

    @Override
    public boolean gotoNextStateOnEvent(String event, Bundle data) {
        return false;
    }

    @Override
    public boolean canBeCached() {
        return false;
    }

    @Override
    public void clean() {
        mStateManager = null;
    }
}

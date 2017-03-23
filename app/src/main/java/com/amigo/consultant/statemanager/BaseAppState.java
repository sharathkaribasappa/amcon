package com.amigo.consultant.statemanager;

import android.content.Context;
import android.os.Bundle;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public abstract class BaseAppState {

    protected Context mContext;

    public void initialize(StateManager stateManager, Context context) {
        mContext = context;
    }

    public abstract void reEnter(String event, Bundle data);

    public abstract void onEnter(String event, Bundle data);

    public abstract void onExit();

    public abstract String getIdentifier();

    public abstract void handleExternalEvent(String event);

    public abstract boolean gotoNextStateOnEvent(String event, Bundle data);

    public abstract boolean canBeCached();

    public abstract void clean();
}
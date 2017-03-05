package com.amigo.consultant.statemanager;

import android.os.Bundle;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public abstract class StateManager {

    BaseAppState mCurrentState;
    BaseAppState mPreviousState;

    public void gotoState(String event,Bundle data) {

    }

    public void gotoStateOnEvent(String event, Bundle data) {
        gotoState(event, data);
    }

    public abstract BaseAppState getStateByIdentifier(String event);


}

package com.amigo.consultant.statemanager;

import android.content.Context;
import android.os.Bundle;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public abstract class StateManager {

    public Context mContext;

    BaseAppState mCurrentState;
    BaseAppState mPreviousState;

    public StateManager(Context context) {
        mContext = context;
    }

    public void gotoState(String state,String event, Bundle data) {

        //get the current state and exit that need to call onExit

        //get the new state object and do on enter, need to call onEnter
    }

    public void gotoStateOnEvent(String event, Bundle data) {
        //gotoState(event, data);
    }

    public BaseAppState getCurrentAppState() {
        return mCurrentState;
    }

    public abstract BaseAppState getStateByIdentifier(String event);
}

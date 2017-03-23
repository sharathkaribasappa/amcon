package com.amigo.consultant.statemanager;

import android.content.Context;
import android.os.Bundle;

import com.amigo.consultant.appflowmanager.AppFlow;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public abstract class StateManager {

    public Context mContext;

    private BaseAppState mCurrentState = null;
    private BaseAppState mPreviousState = null;

    public StateManager(Context context) {
        mContext = context;
    }

    public void gotoState(String stateIdentifier,String event, Bundle data) {
        //get the new state to which transition has to be made
        BaseAppState state = AppFlow.getInstance().getStateManager().getStateByIdentifier(stateIdentifier);

        boolean isSelfTransition = (state == mCurrentState ? true : false);

        if(isSelfTransition) {
            mCurrentState.reEnter(event, data);
        } else {
            mPreviousState = mCurrentState;
            mCurrentState = state;

            //exit from the previous state
            if(mPreviousState != null) {
                mPreviousState.onExit();
                mPreviousState.clean();
            }

            //enter the new state
            mCurrentState.onEnter(event, data);
        }
    }

    public void gotoNextStateOnEvent(String event, Bundle data) {
        if(mCurrentState != null) {
            String stateIdentifier = AppFlow.getInstance().getStateTransition(event + "_" + mCurrentState);
            if (stateIdentifier != null) {
                gotoState(stateIdentifier, event, data);
            }
        }
    }

    public BaseAppState getCurrentAppState() {
        return mCurrentState;
    }

    public abstract BaseAppState getStateByIdentifier(String event);
}
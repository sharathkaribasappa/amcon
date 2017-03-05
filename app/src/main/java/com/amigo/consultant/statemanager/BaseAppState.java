package com.amigo.consultant.statemanager;

import android.os.Bundle;

/**
 * Created by skaribasappa on 3/4/2017.
 */
public abstract class BaseAppState {

    public abstract void reEnter();

    public abstract void onEnter(String event, Bundle data);

    public abstract void onExit();

}

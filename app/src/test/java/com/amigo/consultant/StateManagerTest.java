package com.amigo.consultant;

import android.app.Activity;

import com.amigo.consultant.appflowmanager.AppFlow;
import com.amigo.consultant.appflowmanager.appstates.WelcomeState;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by skaribasappa on 3/22/17.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class StateManagerTest {
    @Test
    public void testStateTransitions(){
        Activity activity = Robolectric.setupActivity(AmigoConsulantActivity.class);
        AppFlow.getInstance().InitializeAppFlow(activity);

        AppFlow.getInstance().getStateManager().gotoState(WelcomeState.IDENTIFIER,AppFlow.EVENT_WELCOME,null);

        Assert.assertTrue(AppFlow.getInstance().getStateManager().getCurrentAppState().getIdentifier() == WelcomeState.IDENTIFIER);
    }
}
package com.amigo.consultant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amigo.consultant.appflowmanager.AppFlow;
import com.amigo.consultant.statemanager.BaseAppState;

public class AmigoConsulantActivity extends AppCompatActivity {

    private static final String EVENT_BACK_PRESSED = "event_back_pressed";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigo_consulant);

        //start the statemachine
        if (savedInstanceState == null) {
            AppFlow.getInstance().InitializeAppFlow(this);
        } else {
            String state = savedInstanceState.getString("state");
            restoreAppState(AppFlow.getInstance().getStateManager().getStateByIdentifier(state));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        AppFlow.getInstance().getStateManager().getCurrentAppState().handleExternalEvent(EVENT_BACK_PRESSED);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if(AppFlow.getInstance().isSessionFlowInitialized()) {
            outState.putString("state",AppFlow.getInstance().getStateManager().getCurrentAppState().getIdentifier());
        }

        super.onSaveInstanceState(outState);
    }

    private void restoreAppState(BaseAppState appState) {

    }
}
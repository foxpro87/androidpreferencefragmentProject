package com.example.androidpreferencefragment;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by sbwoo on 13. 6. 18.
 */
public class SetPreferenceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PrefsFragment()).commit();
    }
}

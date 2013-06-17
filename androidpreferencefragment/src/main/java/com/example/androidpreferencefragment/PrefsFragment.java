package com.example.androidpreferencefragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by sbwoo on 13. 6. 18.
 */
public class PrefsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

    }
}


package com.nao20010128nao.DexConverterAndroid.App;
import android.preference.*;
import com.nao20010128nao.ToolBox.*;

public class SHablePreferenceActivity extends PreferenceActivity{
	void sH(Preference pref,HandledPreference.OnClickListener handler){
		if(!(pref instanceof HandledPreference))return;
		((HandledPreference)pref).setOnClickListener(handler);
	}
	void sH(String pref,HandledPreference.OnClickListener handler){
		sH(findPreference(pref),handler);
	}
}

package com.privatemembersnetwork.android.pmn01;

import com.privatemembersnetwork.android.pmn01.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WelcomeFragment extends Fragment {
	private static final String TAG="Friendica/WelcomeFragment";
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.welcomefragment, container, false);
	}
	
}

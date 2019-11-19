package com.example.uts001;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentMiniquestions extends Fragment{
	EditText eminiq1, eminiq2, eminiq3;
	Button bminiq1, bminiq2, bminiq3;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_miniquestions, container, false);
		
		eminiq1 = (EditText)rootView.findViewById(R.id.etminiq1);
		eminiq2 = (EditText)rootView.findViewById(R.id.etminiq2);
		eminiq3 = (EditText)rootView.findViewById(R.id.etminiq3);
		bminiq1 = (Button)rootView.findViewById(R.id.btnminiq1);
		bminiq2 = (Button)rootView.findViewById(R.id.btnminiq2);
		bminiq3 = (Button)rootView.findViewById(R.id.btnminiq3);
		
		bminiq1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans1 = eminiq1.getText().toString();
				if(ans1.equalsIgnoreCase("iya")){
					Toast.makeText(getActivity(), "Oh Begitu", Toast.LENGTH_LONG).show();
				}
				else if(ans1.equalsIgnoreCase("tidak")){
					Toast.makeText(getActivity(), "Heeemmmmm", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		bminiq2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans2 = eminiq2.getText().toString();
				if(ans2.equalsIgnoreCase("iya")){
					Toast.makeText(getActivity(), "Begitu ya",Toast.LENGTH_LONG).show();
				}
				else if(ans2.equalsIgnoreCase("tidak")){
					Toast.makeText(getActivity(), "Ternyata Begitu", Toast.LENGTH_LONG ).show();
				}
			}
		});
		
		bminiq3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans3 = eminiq2.getText().toString();
				if(ans3.equalsIgnoreCase("iya")){
					Toast.makeText(getActivity(), "Suka Main Game Ternyata",Toast.LENGTH_LONG).show();
				}
				else if(ans3.equalsIgnoreCase("tidak")){
					Toast.makeText(getActivity(), "Kalo Gak Suka Game Pindah Jurusan", Toast.LENGTH_LONG ).show();
				}
			}
		});
		
		return rootView;
	}
}


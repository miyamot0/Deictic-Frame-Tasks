package com.backwardsblade.daedalus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selectionscreen);
		
		Button simpleProbe = (Button) findViewById(R.id.selectSimple);
		Button revProbe = (Button) findViewById(R.id.selectReversed);
		Button doublerevProbe = (Button) findViewById(R.id.selectDoubleReversed);
		
		simpleProbe.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEPICKER"));		
			}
		});
		
		revProbe.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEPICKER"));		
			}
		});
		
		doublerevProbe.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.DOUBLEREVERSEPICKER"));		
			}
		});

	}
}

package com.backwardsblade.daedalus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoubleReversePicker extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.doublereverseframeselection);

		Button DoubleReverseFrameSet1 = (Button) findViewById(R.id.DoubleReversedFrameSet1);
		Button DoubleReverseFrameSet2 = (Button) findViewById(R.id.DoubleReversedFrameSet2);
		Button DoubleReverseFrameSet3 = (Button) findViewById(R.id.DoubleReversedFrameSet3);
		
		DoubleReverseFrameSet1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.DOUBLEREVERSEFRAME1"));				
			}
		});
		
		DoubleReverseFrameSet2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.DOUBLEREVERSEFRAME2"));				
			}
		});

		DoubleReverseFrameSet3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.DOUBLEREVERSEFRAME3"));				
			}
		});	
	}
}
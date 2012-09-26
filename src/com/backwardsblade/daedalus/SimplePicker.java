package com.backwardsblade.daedalus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SimplePicker extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simpleframeselection);

		Button SimpleFrameSet1 = (Button) findViewById(R.id.simpleFrameSet1);
		Button SimpleFrameSet2 = (Button) findViewById(R.id.simpleFrameSet2);	
		Button SimpleFrameSet3 = (Button) findViewById(R.id.simpleFrameSet3);	
		Button SimpleFrameSet4 = (Button) findViewById(R.id.simpleFrameSet4);
		Button SimpleFrameSet5 = (Button) findViewById(R.id.simpleFrameSet5);	
		Button SimpleFrameSet6 = (Button) findViewById(R.id.simpleFrameSet6);	
		Button SimpleFrameSet7 = (Button) findViewById(R.id.simpleFrameSet7);	
		Button SimpleFrameSet8 = (Button) findViewById(R.id.simpleFrameSet8);
		Button SimpleFrameSet9 = (Button) findViewById(R.id.simpleFrameSet9);		
		Button SimpleFrameSet10 = (Button) findViewById(R.id.simpleFrameSet10);		
		Button SimpleFrameSet11 = (Button) findViewById(R.id.simpleFrameSet11);			
		Button SimpleFrameSet12 = (Button) findViewById(R.id.simpleFrameSet12);					
		Button SimpleFrameSet13 = (Button) findViewById(R.id.simpleFrameSet13);
		Button SimpleFrameSet14 = (Button) findViewById(R.id.simpleFrameSet14);
		Button SimpleFrameSet15 = (Button) findViewById(R.id.simpleFrameSet15);		
		
		SimpleFrameSet1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME1"));				
			}
		});

		SimpleFrameSet2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME2"));				
			}
		});	

		SimpleFrameSet3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME3"));				
			}
		});	

		SimpleFrameSet4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME4"));				
			}
		});			
		
		SimpleFrameSet5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME5"));				
			}
		});			
		
		SimpleFrameSet6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME6"));				
			}
		});					
		
		SimpleFrameSet7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME7"));				
			}
		});							
		
		SimpleFrameSet8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME8"));				
			}
		});									
	
		SimpleFrameSet9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME9"));				
			}
		});									
		
		SimpleFrameSet10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME10"));				
			}
		});									
		
		SimpleFrameSet11.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME11"));				
			}
		});											

		SimpleFrameSet12.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME12"));				
			}
		});													
		
		SimpleFrameSet13.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME13"));				
			}
		});													
		
		SimpleFrameSet14.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME14"));				
			}
		});															
		
		SimpleFrameSet15.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SIMPLEFRAME15"));				
			}
		});																	
		
	}	
}

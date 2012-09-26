package com.backwardsblade.daedalus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReversePicker extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reverseframeselection);

		Button ReverseFrameSet1 = (Button) findViewById(R.id.ReversedFrameSet1);
		Button ReverseFrameSet2 = (Button) findViewById(R.id.ReversedFrameSet2);
		Button ReverseFrameSet3 = (Button) findViewById(R.id.ReversedFrameSet3);
		Button ReverseFrameSet4 = (Button) findViewById(R.id.ReversedFrameSet4);
		Button ReverseFrameSet5 = (Button) findViewById(R.id.ReversedFrameSet5);
		Button ReverseFrameSet6 = (Button) findViewById(R.id.ReversedFrameSet6);
		Button ReverseFrameSet7 = (Button) findViewById(R.id.ReversedFrameSet7);
		Button ReverseFrameSet8 = (Button) findViewById(R.id.ReversedFrameSet8);
		Button ReverseFrameSet9 = (Button) findViewById(R.id.ReversedFrameSet9);
		Button ReverseFrameSet10 = (Button) findViewById(R.id.ReversedFrameSet10);
		Button ReverseFrameSet11 = (Button) findViewById(R.id.ReversedFrameSet11);
		Button ReverseFrameSet12 = (Button) findViewById(R.id.ReversedFrameSet12);
		Button ReverseFrameSet13 = (Button) findViewById(R.id.ReversedFrameSet13);
		Button ReverseFrameSet14 = (Button) findViewById(R.id.ReversedFrameSet14);
		Button ReverseFrameSet15 = (Button) findViewById(R.id.ReversedFrameSet15);
		
		ReverseFrameSet1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME1"));				
			}
		});
		
		ReverseFrameSet2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME2"));				
			}
		});
		
		ReverseFrameSet3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME3"));				
			}
		});
		
		ReverseFrameSet4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME4"));				
			}
		});
		
		ReverseFrameSet5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME5"));				
			}
		});
		
		ReverseFrameSet6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME6"));				
			}
		});		
		
		ReverseFrameSet7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME7"));				
			}
		});		
		
		ReverseFrameSet8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME8"));				
			}
		});		
		
		ReverseFrameSet9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME9"));				
			}
		});	
		
		ReverseFrameSet10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME10"));				
			}
		});	
		
		ReverseFrameSet11.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME11"));				
			}
		});	
		
		ReverseFrameSet12.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME12"));				
			}
		});	
		
		ReverseFrameSet13.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME13"));				
			}
		});	
		
		ReverseFrameSet14.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME14"));				
			}
		});	
		
		ReverseFrameSet15.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.REVERSEFRAME15"));				
			}
		});	
	}
}
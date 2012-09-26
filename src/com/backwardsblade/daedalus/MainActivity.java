package com.backwardsblade.daedalus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);        

		Button ButtonStart = (Button) findViewById(R.id.startButton);
		Button ButtonProbe = (Button) findViewById(R.id.probeButton);
		Button ButtonSettings = (Button) findViewById(R.id.settingsButton);
		
		ButtonStart.setOnClickListener(new View.OnClickListener() 
			{
				public void onClick(View v) 
					{
				// TODO Auto-generated method stub
				startActivity(new Intent("com.backwardsblade.daedalus.SELECTIONSCREEN"));
					}
			}
		);

		ButtonProbe.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
				{
			// TODO Auto-generated method stub
			startActivity(new Intent("com.backwardsblade.daedalus.PROBEPICKER"));
				}
			}
		);
    
		ButtonSettings.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) 
				{
			// TODO Auto-generated method stub
			startActivity(new Intent("com.backwardsblade.daedalus.SETTINGS"));
				}
		}
	);
		
		
    }

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

    
    
}

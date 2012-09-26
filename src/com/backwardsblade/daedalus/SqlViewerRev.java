package com.backwardsblade.daedalus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SqlViewerRev extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqlviewerreverse);
		DataHolder info = new DataHolder(this);

		TextView tv = (TextView) findViewById(R.id.tvSQLreverse);
		
		info.open();
		String data = info.getReversedData();
		info.close();
		tv.setText(data);
	}
}

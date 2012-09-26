package com.backwardsblade.daedalus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SqlViewerDoubleRev extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqlviewerdoublereverse);
		DataHolder info = new DataHolder(this);

		TextView tv = (TextView) findViewById(R.id.tvSQLdoublereverse);
		
		info.open();
		String data = info.getDoubleReversedData();
		info.close();
		tv.setText(data);
	}
}

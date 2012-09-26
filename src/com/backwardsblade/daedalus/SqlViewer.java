package com.backwardsblade.daedalus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SqlViewer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqlviewer);
		DataHolder info = new DataHolder(this);
		TextView tv = (TextView) findViewById(R.id.tvSQLinfo);
		
		info.open();
		String data = info.getSimpleData();
		info.close();
		tv.setText(data);
	}
}

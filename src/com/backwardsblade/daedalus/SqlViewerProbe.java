package com.backwardsblade.daedalus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SqlViewerProbe extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqlviewerprobe);
		DataHolder info = new DataHolder(this);

		TextView tv = (TextView) findViewById(R.id.tvSQLprobeinfo);
		
		info.open();
		String data = info.getProbeData();
		info.close();
		tv.setText(data);
	}
}

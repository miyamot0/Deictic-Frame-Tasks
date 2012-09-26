package com.backwardsblade.daedalus;

import java.util.ArrayList;

import org.achartengine.ChartFactory;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.TimeSeries;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Settings extends Activity implements OnClickListener {

	String student="";
	DataHolder info = new DataHolder(this);
	ArrayList<Double> mySimpleIYList  = new ArrayList<Double>();		
	ArrayList<Double> mySimpleHTList  = new ArrayList<Double>();		
	ArrayList<Double> mySimpleNTList  = new ArrayList<Double>();
	ArrayList<Double> myReversedIYList  = new ArrayList<Double>();		
	ArrayList<Double> myReversedHTList  = new ArrayList<Double>();		
	ArrayList<Double> myReversedNTList  = new ArrayList<Double>();		
	ArrayList<Double> myDReversedHTList  = new ArrayList<Double>();		
	ArrayList<Double> myDReversedNTList  = new ArrayList<Double>();	
	ArrayList<Integer> mySimpleIYListGrapher  = new ArrayList<Integer>();		
	ArrayList<Integer> mySimpleHTListGrapher  = new ArrayList<Integer>();		
	ArrayList<Integer> mySimpleNTListGrapher  = new ArrayList<Integer>();
	ArrayList<Integer> myReversedIYListGrapher  = new ArrayList<Integer>();		
	ArrayList<Integer> myReversedHTListGrapher  = new ArrayList<Integer>();		
	ArrayList<Integer> myReversedNTListGrapher  = new ArrayList<Integer>();		
	ArrayList<Integer> myDReversedHTListGrapher  = new ArrayList<Integer>();		
	ArrayList<Integer> myDReversedNTListGrapher  = new ArrayList<Integer>();	
    AlertDialog.Builder builder; 
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		final CharSequence[] names = getResources().getStringArray(R.array.studentNames);		
		
		builder = new AlertDialog.Builder(this);
		
        builder.setTitle("What is your name?");
        builder.setItems(names, new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), names[which], Toast.LENGTH_SHORT).show();
				student = names[which].toString();
				return;
			}
		});
        
        builder.show();				

		
		Button prober = (Button) findViewById(R.id.buttonProber);
		Button simpler = (Button) findViewById(R.id.buttonSimpler);
		Button reverser = (Button) findViewById(R.id.buttonReverser);
		Button dreverser = (Button) findViewById(R.id.buttonDReverser);
		Button graph = (Button) findViewById(R.id.chartButton);				
		Button graph2 = (Button) findViewById(R.id.chartButtonAGG);
		Button selector = (Button) findViewById(R.id.chartButtonSelector);

		prober.setOnClickListener(this); 		simpler.setOnClickListener(this);
		reverser.setOnClickListener(this); 		dreverser.setOnClickListener(this);		
		graph.setOnClickListener(this); 		graph2.setOnClickListener(this);
		selector.setOnClickListener(this); 		
	}
	
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.buttonProber:
			startActivity(new Intent("com.backwardsblade.daedalus.SQLVIEWERPROBE"));			
			break;
			
		case R.id.buttonSimpler:
			startActivity(new Intent("com.backwardsblade.daedalus.SQLVIEWER"));
			break;
			
		case R.id.buttonReverser:
			startActivity(new Intent("com.backwardsblade.daedalus.SQLVIEWERREV"));			
			break;
			
		case R.id.buttonDReverser:
			startActivity(new Intent("com.backwardsblade.daedalus.SQLVIEWERDOUBLEREV"));			
			break;

		case R.id.chartButton:
			TimeSeries series = new TimeSeries("I-You");
			TimeSeries series2 = new TimeSeries("Here-There");
			TimeSeries series3 = new TimeSeries("Now-Then");
			TimeSeries series4 = new TimeSeries("Reversed I-You");
			TimeSeries series5 = new TimeSeries("Reversed Here-There");
			TimeSeries series6 = new TimeSeries("Reversed Now-Then");
			TimeSeries series7 = new TimeSeries("Double Reversed Here-There");
			TimeSeries series8 = new TimeSeries("Double Reversed Now-Then");
			
			info.open();
			mySimpleIYList = info.getSimpleIYdataDouble(student);
			mySimpleHTList = info.getSimpleHTdataDouble(student);
			mySimpleNTList = info.getSimpleNTdataDouble(student);
			myReversedIYList = info.getReversedIYdataDouble(student);
			myReversedHTList = info.getReversedHTdataDouble(student);
			myReversedNTList = info.getReversedNTdataDouble(student);
			myDReversedHTList = info.getDReversedHTdataDouble(student);
			myDReversedNTList = info.getDReversedNTdataDouble(student);
			info.close();

			series=Grapher.makeSimpleIYArrayDouble(mySimpleIYList);
			series2=Grapher.makeSimpleHTArrayDouble(mySimpleHTList);	
			series3=Grapher.makeSimpleNTArrayDouble(mySimpleNTList);
			series4=Grapher.makeReversedIYArrayDouble(myReversedIYList);
			series5=Grapher.makeReversedHTArrayDouble(myReversedHTList);		
			series6=Grapher.makeReversedNTArrayDouble(myReversedNTList);
			series7=Grapher.makeDReversedHTArrayDouble(myDReversedHTList);
			series8=Grapher.makeDReversedNTArrayDouble(myDReversedNTList);

			XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
			dataset.addSeries(series);
			dataset.addSeries(series2);
			dataset.addSeries(series3);
			dataset.addSeries(series4);
			dataset.addSeries(series5);
			dataset.addSeries(series6);
			dataset.addSeries(series7);
			dataset.addSeries(series8);
			
			XYSeriesRenderer renderer = new XYSeriesRenderer();
			renderer.setColor(Color.BLUE);		// sets color of line
			renderer.setPointStyle(PointStyle.DIAMOND); 		//pattern for points
			renderer.setFillPoints(true);	//fills in points with a selected color
			renderer.setLineWidth(3.0f);
			
			XYSeriesRenderer renderer2 = new XYSeriesRenderer();		//SECOND LINE
			renderer2.setColor(Color.YELLOW);		// sets color of line
			renderer2.setPointStyle(PointStyle.CIRCLE); 		//pattern for points
			renderer2.setFillPoints(true);	//fills in points with a selected color
			renderer2.setLineWidth(3.0f);

			XYSeriesRenderer renderer3 = new XYSeriesRenderer();		//THIRD LINE
			renderer3.setColor(Color.RED);		// sets color of line
			renderer3.setPointStyle(PointStyle.TRIANGLE); 		//pattern for points
			renderer3.setFillPoints(true);	//fills in points with a selected color
			renderer3.setLineWidth(3.0f);

			XYSeriesRenderer renderer4 = new XYSeriesRenderer();
			renderer4.setColor(Color.GREEN);		// sets color of line
			renderer4.setPointStyle(PointStyle.DIAMOND); 		//pattern for points
			renderer4.setFillPoints(true);	//fills in points with a selected color
			renderer4.setLineWidth(3.0f);

			XYSeriesRenderer renderer5 = new XYSeriesRenderer();		//SECOND LINE
			renderer5.setColor(Color.CYAN);		// sets color of line
			renderer5.setPointStyle(PointStyle.CIRCLE); 		//pattern for points
			renderer5.setFillPoints(true);	//fills in points with a selected color
			renderer5.setLineWidth(3.0f);

			XYSeriesRenderer renderer6 = new XYSeriesRenderer();		//THIRD LINE
			renderer6.setColor(Color.MAGENTA);		// sets color of line
			renderer6.setPointStyle(PointStyle.TRIANGLE); 		//pattern for points
			renderer6.setFillPoints(true);	//fills in points with a selected color
			renderer6.setLineWidth(3.0f);

			XYSeriesRenderer renderer7 = new XYSeriesRenderer();		//SECOND LINE
			renderer7.setColor(Color.WHITE);		// sets color of line
			renderer7.setPointStyle(PointStyle.CIRCLE); 		//pattern for points
			renderer7.setFillPoints(true);	//fills in points with a selected color
			renderer7.setLineWidth(3.0f);

			XYSeriesRenderer renderer8 = new XYSeriesRenderer();		//THIRD LINE
			renderer8.setColor(Color.LTGRAY);		// sets color of line
			renderer8.setPointStyle(PointStyle.TRIANGLE); 		//pattern for points
			renderer8.setFillPoints(true);	//fills in points with a selected color
			renderer8.setLineWidth(3.0f);

			XYMultipleSeriesRenderer mRenderer = new XYMultipleSeriesRenderer();
			mRenderer.addSeriesRenderer(renderer);
			mRenderer.addSeriesRenderer(renderer2);
			mRenderer.addSeriesRenderer(renderer3);
			mRenderer.addSeriesRenderer(renderer4);
			mRenderer.addSeriesRenderer(renderer5);
			mRenderer.addSeriesRenderer(renderer6);		
			mRenderer.addSeriesRenderer(renderer7);
			mRenderer.addSeriesRenderer(renderer8);		
			
			mRenderer.setChartTitle(student + "s Progress");
			mRenderer.setApplyBackgroundColor(true);
			mRenderer.setBackgroundColor(Color.BLACK);
			mRenderer.setYAxisMax(100);
			mRenderer.setYAxisMin(0);
			mRenderer.setPointSize(5.5f);
			
			double zoomlimits[]={0,100,0,100};
			mRenderer.setPanLimits(zoomlimits);
			
			Intent intent = ChartFactory.getLineChartIntent(this, dataset, mRenderer, "Daedalus BETA");
			startActivity(intent);
			break;
			
		case R.id.chartButtonAGG:
			TimeSeries simpleSeries = new TimeSeries("Simple Frames");
			TimeSeries reverseSeries = new TimeSeries("Reversed Frames");
			TimeSeries dreverseSeries = new TimeSeries("Double Reversed Frames");
					
			info.open();
			mySimpleIYListGrapher = info.getSimpleIYdata(student);
			mySimpleHTListGrapher = info.getSimpleHTdata(student);
			mySimpleNTListGrapher = info.getSimpleNTdata(student);
			myReversedIYListGrapher = info.getReversedIYdata(student);
			myReversedHTListGrapher = info.getReversedHTdata(student);
			myReversedNTListGrapher = info.getReversedNTdata(student);
			myDReversedHTListGrapher = info.getDReversedHTdata(student);
			myDReversedNTListGrapher = info.getDReversedNTdata(student);
			info.close();

			simpleSeries=Grapher.computeSimpleOnesDouble(mySimpleIYListGrapher, mySimpleHTListGrapher, mySimpleNTListGrapher);
			reverseSeries=Grapher.computeReversedOnesDouble(myReversedIYListGrapher, myReversedHTListGrapher, myReversedNTListGrapher);
			dreverseSeries=Grapher.computeDReverseOnesDouble(myDReversedHTListGrapher, myDReversedNTListGrapher);

			XYMultipleSeriesDataset dataset2 = new XYMultipleSeriesDataset();
			dataset2.addSeries(simpleSeries);
			dataset2.addSeries(reverseSeries);
			dataset2.addSeries(dreverseSeries);
			
			XYSeriesRenderer renderer9 = new XYSeriesRenderer();
			renderer9.setColor(Color.GREEN);		// sets color of line
			renderer9.setPointStyle(PointStyle.DIAMOND); 		//pattern for points
			renderer9.setFillPoints(true);	//fills in points with a selected color
			renderer9.setLineWidth(3.0f);

			XYSeriesRenderer renderer10 = new XYSeriesRenderer();
			renderer10.setColor(Color.BLUE);		// sets color of line
			renderer10.setPointStyle(PointStyle.TRIANGLE); 		//pattern for points
			renderer10.setFillPoints(true);	//fills in points with a selected color
			renderer10.setLineWidth(3.0f);

			XYSeriesRenderer renderer11 = new XYSeriesRenderer();
			renderer11.setColor(Color.RED);		// sets color of line
			renderer11.setPointStyle(PointStyle.SQUARE); 		//pattern for points
			renderer11.setFillPoints(true);	//fills in points with a selected color
			renderer11.setLineWidth(3.0f);
			
			XYMultipleSeriesRenderer mRenderer2 = new XYMultipleSeriesRenderer();
			mRenderer2.addSeriesRenderer(renderer9);
			mRenderer2.addSeriesRenderer(renderer10);
			mRenderer2.addSeriesRenderer(renderer11);
			
			mRenderer2.setChartTitle(student + "s Progress");
			mRenderer2.setApplyBackgroundColor(true);
			mRenderer2.setBackgroundColor(Color.BLACK);
			mRenderer2.setYAxisMax(100);
			mRenderer2.setYAxisMin(0);
			double panlimits[]={0,100,0,100};
			mRenderer2.setPanLimits(panlimits);
			mRenderer2.setPointSize(5.5f);

			Intent intent2 = ChartFactory.getLineChartIntent(this, dataset2, mRenderer2, "Daedalus BETA");
			startActivity(intent2);
			
			break;
		case R.id.chartButtonSelector:
	        builder.show();				
			break;
			
//		case R.id.buttonBackup:
//			try {
//				info.copyDataBase();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
		}
	}
}

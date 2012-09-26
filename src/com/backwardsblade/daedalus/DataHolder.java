package com.backwardsblade.daedalus;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

public class DataHolder {

	public static final String KEY_ROWID = "_id";
	public static final String KEY_NAME = "kids_name";
	public static final String KEY_LESSON = "lesson_number";
	public static final String KEY_sIYOU = "Simple_IYOU";
	public static final String KEY_sHTHERE = "Simple_HTHERE";
	public static final String KEY_sNTHEN = "Simple_NTHEN";
	public static final String KEY_rIYOU = "Reversed_IYOU";
	public static final String KEY_rHTHERE = "Reversed_HTHERE";
	public static final String KEY_rNTHEN = "Reversed_NTHEN";
	public static final String KEY_drHTHERE = "DReversed_HTHERE";
	public static final String KEY_drNTHEN = "DReversed_NTHEN";
	public static final String KEY_DATE = "date";
	
	private static final String DATABASE_NAME = "FramingDB";
	private static final String DATABASE_TABLE = "scoreTable";
	private static final String DATABASE_PATH = Environment.getExternalStorageDirectory().getPath();
	private static final int DATABASE_VERSION = 1;

	private DbHelper ourHelper;
	private final Context ourContext;
	private SQLiteDatabase ourDatabase;
	
	private static class DbHelper extends SQLiteOpenHelper {

		public DbHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE " + DATABASE_TABLE + " (" +
					KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
					KEY_NAME + " TEXT NOT NULL, " + 
					KEY_LESSON + " INTEGER, " +
					KEY_sIYOU + " INTEGER, " +
					KEY_sHTHERE + " INTEGER, " +
					KEY_sNTHEN + " INTEGER, " +
					KEY_rIYOU + " INTEGER, " +
					KEY_rHTHERE + " INTEGER, " +
					KEY_rNTHEN + " INTEGER, " +					
					KEY_drHTHERE + " INTEGER, " +
					KEY_drNTHEN + " INTEGER, " +					
					KEY_DATE + " TEXT NOT NULL);");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
			onCreate(db);
		}
	}
	
	public DataHolder(Context c) {
		ourContext = c;
	}

	public DataHolder open() throws SQLException {
		ourHelper = new DbHelper(ourContext);
		ourDatabase = ourHelper.getWritableDatabase();
		return this;
	}

	public void close(){
		ourHelper.close();
	}
	
	public void copyDataBase() throws IOException {
		InputStream myInput = ourContext.getAssets().open(DATABASE_NAME);
		String outFilename = DATABASE_PATH + DATABASE_NAME;
		OutputStream myOutput = new FileOutputStream(outFilename);
		
		byte[] buffer = new byte[1024];
		int length;
		while ((length = myInput.read(buffer))>0) {
			myOutput.write(buffer, 0, length);
		}
		
		myOutput.flush();
		myOutput.close();
		myInput.close();
	}

	public long createSimpleEntry(String name, int lessonNumber, int ourFirst, int ourSecond, int ourThird) {
		// TODO Auto-generated method stub
		
		ContentValues cv = new ContentValues();
		cv.put(KEY_NAME, name);
		cv.put(KEY_LESSON, lessonNumber);		
		cv.put(KEY_sIYOU, ourFirst);
		cv.put(KEY_sHTHERE, ourSecond);
		cv.put(KEY_sNTHEN, ourThird);
		cv.put(KEY_rIYOU, 999);
		cv.put(KEY_rHTHERE, 999);
		cv.put(KEY_rNTHEN, 999);
		cv.put(KEY_drHTHERE, 999);
		cv.put(KEY_drNTHEN, 999);		
				
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");			
		cv.put(KEY_DATE, dateFormat.format(new Date()));

		return ourDatabase.insert(DATABASE_TABLE, null, cv);
	}
	
	public long createReversedEntry(String name, int lessonNumber, int RIYOU, int RHTHERE, int RNTHEN) {
		// TODO Auto-generated method stub

		ContentValues cv = new ContentValues();
		cv.put(KEY_NAME, name);
		cv.put(KEY_LESSON, lessonNumber);		
		cv.put(KEY_sIYOU, 999);
		cv.put(KEY_sHTHERE, 999);
		cv.put(KEY_sNTHEN, 999);
		cv.put(KEY_rIYOU, RIYOU);
		cv.put(KEY_rHTHERE, RHTHERE);
		cv.put(KEY_rNTHEN, RNTHEN);
		cv.put(KEY_drHTHERE, 999);
		cv.put(KEY_drNTHEN, 999);		
				
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");			
		cv.put(KEY_DATE, dateFormat.format(new Date()));

		return ourDatabase.insert(DATABASE_TABLE, null, cv);
	} 
	
	public long createDoubleReversedEntry(String name, int lessonNumber, int dRHTHERE, int dRNTHEN) {
		// TODO Auto-generated method stub

		ContentValues cv = new ContentValues();
		cv.put(KEY_NAME, name);
		cv.put(KEY_LESSON, lessonNumber);
		cv.put(KEY_sIYOU, 999);
		cv.put(KEY_sHTHERE, 999);
		cv.put(KEY_sNTHEN, 999);
		cv.put(KEY_rIYOU, 999);
		cv.put(KEY_rHTHERE, 999);
		cv.put(KEY_rNTHEN, 999);
		cv.put(KEY_drHTHERE, dRHTHERE);
		cv.put(KEY_drNTHEN, dRNTHEN);
				
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");			
		cv.put(KEY_DATE, dateFormat.format(new Date()));

		return ourDatabase.insert(DATABASE_TABLE, null, cv);
	}
	
	public long createProbeEntry(String name, int lessonNumber, int psIYOU, int psHTHERE, int psNTHEN, int prIYOU, int prHTHERE, int prNTHEN, int pdRHTHERE, int pdRNTHEN) {
		// TODO Auto-generated method stub

		ContentValues cv = new ContentValues();
		cv.put(KEY_NAME, name);
		cv.put(KEY_LESSON, lessonNumber);
		cv.put(KEY_sIYOU, psIYOU);
		cv.put(KEY_sHTHERE, psHTHERE);
		cv.put(KEY_sNTHEN, psNTHEN);
		cv.put(KEY_rIYOU, prIYOU);
		cv.put(KEY_rHTHERE, prHTHERE);
		cv.put(KEY_rNTHEN, prNTHEN);		
		cv.put(KEY_drHTHERE, pdRHTHERE);
		cv.put(KEY_drNTHEN, pdRNTHEN);
				
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");			
		cv.put(KEY_DATE, dateFormat.format(new Date()));

		return ourDatabase.insert(DATABASE_TABLE, null, cv);
	} 
	
	public String getSimpleData() {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_LESSON, KEY_sIYOU, KEY_sHTHERE, KEY_sNTHEN, KEY_DATE};
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		
		String result = "";
		
		int iRow = c.getColumnIndex(KEY_ROWID);
		int iName = c.getColumnIndex(KEY_NAME);
		int iLesson = c.getColumnIndex(KEY_LESSON);
		int iDate = c.getColumnIndex(KEY_DATE);
		int iSIYOU = c.getColumnIndex(KEY_sIYOU);
		int iSHTHERE = c.getColumnIndex(KEY_sHTHERE);
		int iSNTHEN = c.getColumnIndex(KEY_sNTHEN);
		
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			result = result + c.getString(iRow) + " " + c.getString(iName) + ": " + c.getString(iDate) + "; Lesson #" + c.getString(iLesson) + "; " +
					c.getString(iSIYOU) + " sIY; " + c.getString(iSHTHERE) + " sHT; " + c.getString(iSNTHEN) + " sNT.\n\n";
		}		
		return result;
	} 
		
	public ArrayList<Integer> getSimpleIYdata(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_sIYOU};
		String[] query = new String[] {passer};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_sIYOU)));
			c.moveToNext();
		}

		return result;
	} 
	
	public ArrayList<Double> getSimpleIYdataDouble(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_sIYOU};
		String[] query = new String[] {passer};
		ArrayList<Double> result = new ArrayList<Double>();
		double holder;
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			holder=(double)c.getInt(c.getColumnIndex(DataHolder.KEY_sIYOU));
			holder=((holder/4)*100);
			result.add(holder);
			c.moveToNext();
		}

		return result;
	} 
	
	public ArrayList<Integer> getSimpleHTdata(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_sHTHERE};
		String[] query = new String[] {passer};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_sHTHERE)));
			c.moveToNext();
		}

		return result;
	} 	
	
	public ArrayList<Double> getSimpleHTdataDouble(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_sHTHERE};
		String[] query = new String[] {passer};
		ArrayList<Double> result = new ArrayList<Double>();
		double holder;
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			holder=(double)c.getInt(c.getColumnIndex(DataHolder.KEY_sHTHERE));
			holder=((holder/4)*100);
			result.add(holder);
			c.moveToNext();
		}

		return result;
	} 	
	
	public ArrayList<Integer> getSimpleNTdata(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_sNTHEN};
		String[] query = new String[] {passer};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_sNTHEN)));
			c.moveToNext();
		}

		return result;
	} 	
	
	public ArrayList<Double> getSimpleNTdataDouble(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_sNTHEN};
		String[] query = new String[] {passer};
		ArrayList<Double> result = new ArrayList<Double>();
		double holder;
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			holder=(double)c.getInt(c.getColumnIndex(DataHolder.KEY_sNTHEN));
			holder=((holder/4)*100);
			result.add(holder);		
			c.moveToNext();
		}

		return result;
	} 	
	
	public ArrayList<Integer> getReversedIYdata(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_rIYOU};
		String[] query = new String[] {passer};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_rIYOU)));
			c.moveToNext();
		}

		return result;
	} 
	
	public ArrayList<Double> getReversedIYdataDouble(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_rIYOU};
		String[] query = new String[] {passer};
		ArrayList<Double> result = new ArrayList<Double>();
		double holder;
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			holder=(double)c.getInt(c.getColumnIndex(DataHolder.KEY_rIYOU));
			holder=((holder/4)*100);
			result.add(holder);
//			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_rIYOU)));
			c.moveToNext();
		}

		return result;
	} 
	
	public ArrayList<Integer> getReversedHTdata(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_rHTHERE};
		String[] query = new String[] {passer};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_rHTHERE)));
			c.moveToNext();
		}

		return result;
	} 		

	public ArrayList<Double> getReversedHTdataDouble(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_rHTHERE};
		String[] query = new String[] {passer};
		ArrayList<Double> result = new ArrayList<Double>();
		double holder;
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			holder=(double)c.getInt(c.getColumnIndex(DataHolder.KEY_rHTHERE));
			holder=((holder/4)*100);
			result.add(holder);
//			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_rHTHERE)));
			c.moveToNext();
		}

		return result;
	} 		
	
	public ArrayList<Integer> getReversedNTdata(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_rNTHEN};
		String[] query = new String[] {passer};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_rNTHEN)));
			c.moveToNext();
		}

		return result;
	} 	
		
	public ArrayList<Double> getReversedNTdataDouble(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_rNTHEN};
		String[] query = new String[] {passer};
		ArrayList<Double> result = new ArrayList<Double>();
		double holder;
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			holder=(double)c.getInt(c.getColumnIndex(DataHolder.KEY_rNTHEN));
			holder=((holder/6)*100);
			result.add(holder);
//			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_rNTHEN)));
			c.moveToNext();
		}

		return result;
	} 	
	
	public ArrayList<Integer> getDReversedHTdata(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_drHTHERE};
		String[] query = new String[] {passer};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_drHTHERE)));
			c.moveToNext();
		}

		return result;
	} 	

	public ArrayList<Double> getDReversedHTdataDouble(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_drHTHERE};
		String[] query = new String[] {passer};
		ArrayList<Double> result = new ArrayList<Double>();
		double holder;
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			holder=(double)c.getInt(c.getColumnIndex(DataHolder.KEY_drHTHERE));
			holder=((holder/4)*100);
//			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_drHTHERE)));
			result.add(holder);
			c.moveToNext();
		}

		return result;
	} 		
	
	public ArrayList<Integer> getDReversedNTdata(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_drNTHEN};
		String[] query = new String[] {passer};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_drNTHEN)));
			c.moveToNext();
		}

		return result;
	} 	
	
	public ArrayList<Double> getDReversedNTdataDouble(String passer) {
		// TODO Auto-generated method stub

		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_drNTHEN};
		String[] query = new String[] {passer};
		ArrayList<Double> result = new ArrayList<Double>();
		double holder;
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_NAME + "=?", query, null, null, KEY_NAME);
		
		c.moveToFirst();
		while(!c.isAfterLast()) {
			holder=(double)c.getInt(c.getColumnIndex(DataHolder.KEY_drNTHEN));
			holder=((holder/6)*100);
			result.add(holder);
//			result.add(c.getInt(c.getColumnIndex(DataHolder.KEY_drNTHEN)));
			c.moveToNext();
		}

		return result;
	}	
	
	public String getReversedData() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_LESSON, KEY_rIYOU, KEY_rHTHERE, KEY_rNTHEN, KEY_DATE};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "";
		
		int iRow = c.getColumnIndex(KEY_ROWID);
		int iName = c.getColumnIndex(KEY_NAME);
		int iLesson = c.getColumnIndex(KEY_LESSON);
		int iDate = c.getColumnIndex(KEY_DATE);
		int iSIYOU = c.getColumnIndex(KEY_rIYOU);
		int iSHTHERE = c.getColumnIndex(KEY_rHTHERE);
		int iSNTHEN = c.getColumnIndex(KEY_rNTHEN);
		
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			result = result + c.getString(iRow) + " " + c.getString(iName) + ": " + c.getString(iDate) + "; Lesson #" +	c.getString(iLesson) + "; " +
					c.getString(iSIYOU) + " rIY; " + c.getString(iSHTHERE) + " rHT; " + c.getString(iSNTHEN) + " rNT\n\n";
		}
		
		return result;
	} 
	
	public String getDoubleReversedData() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_ROWID, KEY_NAME, KEY_LESSON, KEY_drHTHERE, KEY_drNTHEN, KEY_DATE};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "";
		
		int iRow = c.getColumnIndex(KEY_ROWID);
		int iName = c.getColumnIndex(KEY_NAME);
		int iLesson = c.getColumnIndex(KEY_LESSON);
		int iDate = c.getColumnIndex(KEY_DATE);
		int iDRht = c.getColumnIndex(KEY_drHTHERE);
		int iDRnt = c.getColumnIndex(KEY_drNTHEN);
		
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			result = result + c.getString(iRow) + " " + c.getString(iName) + ": " + c.getString(iDate) + "; Lesson #" +	c.getString(iLesson) + "; " +
					c.getString(iDRht) + " drHT; " + c.getString(iDRnt) + " drNT\n\n";
		}
		return result;
	} 
	
	public String getProbeData() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_ROWID, KEY_DATE, KEY_NAME, KEY_LESSON, KEY_sIYOU, KEY_sHTHERE, KEY_sNTHEN, 
				KEY_rIYOU, KEY_rHTHERE, KEY_rNTHEN, KEY_drHTHERE, KEY_drNTHEN};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "";

		int iRow = c.getColumnIndex(KEY_ROWID);
		int iName = c.getColumnIndex(KEY_NAME);
		int iLesson = c.getColumnIndex(KEY_LESSON);
		int iDate = c.getColumnIndex(KEY_DATE);
		
		int iSIYOU = c.getColumnIndex(KEY_sIYOU);
		int iSHTHERE = c.getColumnIndex(KEY_sHTHERE);
		int iSNTHEN = c.getColumnIndex(KEY_sNTHEN);
		
		int iRIYOU = c.getColumnIndex(KEY_rIYOU);
		int iRHTHERE = c.getColumnIndex(KEY_rHTHERE);
		int iRNTHEN = c.getColumnIndex(KEY_rNTHEN);
		
		int iDRHTHERE = c.getColumnIndex(KEY_drHTHERE);
		int iDRNTHEN = c.getColumnIndex(KEY_drNTHEN);
		
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			result = result + c.getString(iRow) + " " + c.getString(iName) + ": " + c.getString(iDate) + "; Lesson #" +	c.getString(iLesson) + "\n" + 
					c.getString(iSIYOU) + " sIY; " + c.getString(iSHTHERE) + " sHT; " + c.getString(iSNTHEN) + " sNT;\n" + 
					c.getString(iRIYOU) + " rIY; " + c.getString(iRHTHERE) + " rHT; " + c.getString(iRNTHEN) + " rNT;\n" +
					c.getString(iDRHTHERE) + " drHT; " +c.getString(iDRNTHEN) + " drNT\n\n";
		}
		
		return result;
	} 

	
}

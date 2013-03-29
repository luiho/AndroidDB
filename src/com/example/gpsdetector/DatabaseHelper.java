package com.example.gpsdetector;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
	public static final String dbName = "hellodemo";
	public static final int ver = 1;
	public SQLiteDatabase database = null; 
	
	public DatabaseHelper(Context context) {
		
		// TODO Auto-generated constructor stub
		super(context, dbName, null, ver);
		database = this.getWritableDatabase();
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		String DATABASE_CREATION = "create table demo(localtion_id integer, x_1 integer, x_2 integer);";
		Log.v("testing","database is " + arg0.toString());
		arg0.execSQL(DATABASE_CREATION);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		database.execSQL("drop table if exists hellodemo");
		onCreate(database);
	}
	
	public Cursor getAll() {
		String allData = "select * from demo";
		
		return database.rawQuery(allData, null);
	}
	
}

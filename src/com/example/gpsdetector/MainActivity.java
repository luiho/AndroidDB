package com.example.gpsdetector;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;

public class MainActivity extends Activity {
	
	public DatabaseHelper databaseHelper = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		databaseHelper = new DatabaseHelper(this);
//		
//		ContentValues cv = new ContentValues();
//		cv.put("x_1", 20);
//		cv.put("x_2", 30);
//		
//		SQLiteDatabase db = databaseHelper.getWritableDatabase();
//		
//		db.insert("demo", null, cv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

package com.myweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class WeatherOpenHelper extends SQLiteOpenHelper {
	
	//Province表建表语句
	private static final String CREATE_PROVICE = "create table province("
			+ "id integer primary key autoincrement,"
			+ "province_name text,"
			+ "province_code text)";
	//City表建表语句
	private static final String CREATE_CITY = "create table city("
			+ "id integer primary key autoincrement,"
			+ "city_name text,"
			+ "city_code text,"
			+ "province_id integer)";
	//County表建表语句
	private static final String CREATE_COUNTY = "create table county("
			+ "id integer primary key autoincrement,"
			+ "county_name text,"
			+ "county_code text,"
			+ "city_id integer)";
	
	public WeatherOpenHelper(Context context, String name, CursorFactory factory, int version){
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		//创建数据库时执行建表语句
		db.execSQL(CREATE_PROVICE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
}

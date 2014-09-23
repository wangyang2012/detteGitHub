package com.example.dette;

import java.util.Date;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	final static String DATABASENAME		= "db_tetee";
	final static int VERSION				= 1;
	final static String TABLENAME			= "tetee";
	final static String col_date			= "date";
	final static String col_heure			= "heure";
	final static String col_gauche			= "gauche";
	final static String col_droite			= "droite";
	final static String col_debut			= "debut";
	final static String col_pipi			= "pipi";
	final static String col_caca			= "caca";
	
	public DatabaseHelper(Context context) {
		super(context, DATABASENAME, null, VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "CREATE TABLE " + TABLENAME + "('" + col_date + "' DATE, '" + col_heure + "' TIME, '" + col_gauche + "' TIME, '" + col_droite + "' TIME, '" + col_debut + "' CHAR[0], '" + col_pipi + "' BOOLEAN, '" + col_caca + "' BOOLEAN);";
		db.execSQL(sql);
		
		String sqlInsert = "INSERT INTO " + TABLENAME + " VALUES ('2011-7-8', '25:00', '10:00', '15:00', 'G', TRUE, FALSE);";
		db.execSQL(sqlInsert);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}

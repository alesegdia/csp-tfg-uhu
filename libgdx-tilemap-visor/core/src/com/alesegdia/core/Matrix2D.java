package com.alesegdia.core;

import java.util.ArrayList;

public class Matrix2D <T> {
	
	protected ArrayList<T> data = null;
	protected int cols, rows;
	
	public Matrix2D( int rows, int cols, T def )
	{
		data = new ArrayList<T>();
		for( int i = 0; i < rows * cols; i++ )
		{
			data.add(def);
		}
		this.rows = rows;
		this.cols = cols;
	}

	public T Get( int row, int col )
	{
		return data.get( GetPos( row, col ) );
	}
	
	public int GetPos( int row, int col )
	{
		return row * this.rows + col;
	}
	
	public void Set( int row, int col, T val )
	{
		if( row < 0 ) row = 0;
		if( row > rows ) row = rows - 1;
		if( col < 0 ) col = 0;
		if( col > cols ) col = cols - 1;
		
		data.set( GetPos( row, col ), val );
	}
	
	public void Fill( T val )
	{
		for( int i = 0; i < data.size(); i++ )
		{
			data.set(i, val);
		}
	}

}

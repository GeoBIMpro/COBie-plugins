package org.erdc.cobie.sqlite.entities.relationships;

import org.erdc.cobie.sqlite.Column;
import org.erdc.cobie.sqlite.Columns;

public class FloorSpace extends Relationship 
{
	public enum ColumnName
	{	
		RefFloor("RefFloor"), 
		RefSpace("RefSpace");

		private String columName;

		private ColumnName(final String columnName)
		{
			columName = columnName;
		}

		@Override
		public final String toString()
		{
			return columName;
		}
	}
	
	public FloorSpace()
	{
		super();
		
		Columns columns = new Columns(
				new Column<Integer>(ColumnName.RefFloor.toString(), null, true),
				new Column<Integer>(ColumnName.RefSpace.toString(), null, true));
		
		addColumns(columns);
	}
	
	@Override
	public String getTableName() 
	{
		return "FloorSpace";
	}
}
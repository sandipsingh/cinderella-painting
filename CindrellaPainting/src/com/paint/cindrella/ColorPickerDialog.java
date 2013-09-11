package com.paint.cindrella;

import com.paint.cindrella.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.GridView;

public class ColorPickerDialog extends Activity
{
	RadioButton btn_red;
	Context context;
/*	public ColorPickerDialog(Context c)
	{
		super(c);
		this.setTitle("Color Picker Dialog");
	}
	*/
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.color_picker);
		
		btn_red=(RadioButton) findViewById(R.id.btn_red);
		
		GridView gridViewColors = (GridView) findViewById(R.id.gridViewColors);
		gridViewColors.setAdapter(new ColorPickerAdapter(getBaseContext()));
		
		// close the dialog on item click
		gridViewColors.setOnItemClickListener(new OnItemClickListener() 
		{
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
			{
//				ColorPickerDialog.this.dismiss();
				String color=((ColorPickerAdapter) parent.getAdapter()).getItem(position);
				//String c=color.toString();
			//	Integer c1=Integer.valueOf(c);
			//	int c2=Integer.parseInt(c);
				
			//	int col=Integer.parseInt(color,16);
				Toast.makeText(getBaseContext(), "You selected " +position ,Toast.LENGTH_LONG).show();
				System.out.println("You selected : "+position);
				Intent i=new Intent(getApplicationContext(),ColorCindrellaActivity.class);
				i.putExtra("val", color);
				i.putExtra("id", position);
				
				startActivity(i);
				
			}


			
		});
	}
}

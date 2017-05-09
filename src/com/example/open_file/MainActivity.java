package com.example.open_file;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		File str = Environment.getExternalStorageDirectory();
		
		final String str1 = str.getName();
		final TextView TV = (TextView)findViewById(R.id.textView1);
		
		Button OF = (Button)findViewById(R.id.OpenFile);
		
		OF.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// open mobile phone file 
				TV.setText(str1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

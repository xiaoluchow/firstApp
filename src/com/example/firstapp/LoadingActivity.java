package com.example.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoadingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);
		Button button = (Button) findViewById(R.id.button_1);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), MainActivity.class);
				
				
				/*Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:18617093954"));
				*/
				
				/*Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("tel:18617093954"));*/
				
				/*Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));*/
				
				/*Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("mailto:531525195@qq.com"));*/
				intent.putExtra("name", "hello, second activity");
				startActivity(intent);
			}
			
		});
	}
	
}

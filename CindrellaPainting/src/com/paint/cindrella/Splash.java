package com.paint.cindrella;

import com.Leadbolt.AdController;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Splash extends Activity {
	MediaPlayer mp;
	public boolean count = false;
	// public Button b1;
	RelativeLayout rl2;
	private AdView ad;
	private AdController myController, myController1;
	// Handler hRefresh;
	private static final String TAG = "BillingService";

	private Context mContext;
	private ImageView purchaseableItem;
	private Button purchaseButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.home);
		mContext = this;

		rl2 = (RelativeLayout) findViewById(R.id.relative_home);
		String id = "a150096d76a7e6e";
		ad = new AdView(this, AdSize.BANNER, id);
		rl2.addView(ad);

		ad.loadAd(new AdRequest());
		final Activity act = Splash.this;
		myController = new AdController(getApplicationContext(), "991024063");
		myController.loadIcon();

		myController1 = new AdController(getApplicationContext(), "354100493");
		myController1.loadNotification();

		// b1=(Button)findViewById(R.id.button1);
		/*
		 * new Thread() { public void run() { try {
		 * 
		 * 
		 * hRefresh.sendEmptyMessage(1); } catch (Exception e) { } } }.start();
		 */

		ImageView more_apps = (ImageView) findViewById(R.id.imageView2);
		ImageView b2 = (ImageView) findViewById(R.id.image_start);
		ImageView b3 = (ImageView) findViewById(R.id.image_feedback);
		ImageView b4 = (ImageView) findViewById(R.id.imageView1);
		// more_apps.setVisibility(View.INVISIBLE);

		more_apps.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri uri = Uri
						.parse("https://play.google.com/store/apps/developer?id=kewl+apps");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);

			}
		});

		b2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				Splash.this.startActivity(new Intent(Splash.this,
						ColorCindrellaActivity.class));
			}
		});

		b4.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Splash.this.startActivity(new Intent(Splash.this,
						ViewImages.class));
			}
		});

		// More Images
		b3.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri uri = Uri
						.parse("https://play.google.com/store/apps/details?id=princess.paint");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);

			}
		});

		/*
		 * hRefresh = new Handler() { public void handleMessage(Message msg){
		 * switch (msg.what) { case 1: ad.loadAd(new AdRequest()); myController
		 * = new AdController(getApplicationContext(), "991024063");
		 * myController.loadIcon(); // myController.loadNotification();
		 * 
		 * break;
		 * 
		 * default: break; } }};
		 */

	}

}

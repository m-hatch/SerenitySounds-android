package com.example.serenitysounds;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	Button btSpace, btJourney;
	MediaPlayer mpSpace, mpJourney;
	int playing;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btSpace=(Button)findViewById(R.id.btnSpace);
		btJourney=(Button)findViewById(R.id.btnJourney);
		btSpace.setOnClickListener(bSpace);
		btJourney.setOnClickListener(bJourney);
		mpSpace=new MediaPlayer();
		mpSpace=MediaPlayer.create(this,R.raw.relax1);
		mpJourney=new MediaPlayer();
		mpJourney=MediaPlayer.create(this, R.raw.relax2);
		playing=0;
	}
	Button.OnClickListener bSpace = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(playing){
			case 0:
				mpSpace.start();
				playing=1;
				btSpace.setText("Pause Space Odyssey");
				btJourney.setVisibility(View.INVISIBLE);
				break;
			case 1:
				mpSpace.pause();
				playing=0;
				btSpace.setText("Play Space Odyssey");
				btJourney.setVisibility(View.VISIBLE);
				break;
			}
		}
		
	};
	Button.OnClickListener bJourney = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(playing){
			case 0:
				mpJourney.start();
				playing=1;
				btJourney.setText("Pause Mindful Journey");
				btSpace.setVisibility(View.INVISIBLE);
				break;
			case 1:
				mpJourney.pause();
				playing=0;
				btJourney.setText("Play Mindful Journey");
				btSpace.setVisibility(View.VISIBLE);
				break;
		}
		
	};
	};

}

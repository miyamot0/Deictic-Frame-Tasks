package com.backwardsblade.daedalus;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DoubleReverseFrame3 extends Activity {

	boolean p1q1=true;  boolean p1q2=true; 	boolean p2q1=true;	boolean p2q2=true;
	boolean p3q1=true;	boolean p3q2=true;	boolean p4q1=true;	boolean p4q2=true;	
	boolean p5q1=true;	boolean p5q2=true;	
	
	int p1=0; int p2=0;	int p3=0; int p4=0; int p5=0; int lesson=303;
	
	String student="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.doublereverseframe3);
	
		final CharSequence[] names = getResources().getStringArray(R.array.studentNames);		
				
		final LinearLayout linearLayoutOne = (LinearLayout)findViewById(R.id.layoutNumberOne);
		final LinearLayout linearLayoutTwo = (LinearLayout)findViewById(R.id.layoutNumberTwo);
		final LinearLayout linearLayoutThree = (LinearLayout)findViewById(R.id.layoutNumberThree);
		final LinearLayout linearLayoutFour = (LinearLayout)findViewById(R.id.layoutNumberFour);
		final LinearLayout linearLayoutFive = (LinearLayout)findViewById(R.id.layoutNumberFive);
		
        AlertDialog.Builder builder = new AlertDialog.Builder(this);		
		
		OnClickListener listener = null;
		final AlertDialog alertDialog = new AlertDialog.Builder(this).setNeutralButton("DONE",listener).create();
		final AlertDialog perfectLesson = new AlertDialog.Builder(this).setNeutralButton("ALL DONE", listener).create();
		final AlertDialog notYet = new AlertDialog.Builder(this).setNeutralButton("DONE", listener).create();
		final MediaPlayer correctSound=MediaPlayer.create(this, R.raw.coin);
		final MediaPlayer wrongSound=MediaPlayer.create(this, R.raw.incorrect);		
		final MediaPlayer awesome=MediaPlayer.create(this, R.raw.smoneup);
		final MediaPlayer perfect=MediaPlayer.create(this, R.raw.powerup);		
		
		Button OneYes = (Button) findViewById(R.id.DoubleReversedThreeButton1);
		Button OneNo = (Button) findViewById(R.id.DoubleReversedThreeButton2);		
		Button OneYesOne = (Button) findViewById(R.id.DoubleReversedThreeButton3);
		Button OneNoTwo = (Button) findViewById(R.id.DoubleReversedThreeButton4);		
		Button TwoYes = (Button) findViewById(R.id.DoubleReversedThreeButton5);
		Button TwoNo = (Button) findViewById(R.id.DoubleReversedThreeButton6);		
		Button TwoYesOne = (Button) findViewById(R.id.DoubleReversedThreeButton7);
		Button TwoNoTwo = (Button) findViewById(R.id.DoubleReversedThreeButton8);				
		Button ThreeYes = (Button) findViewById(R.id.DoubleReversedThreeButton9);
		Button ThreeNo = (Button) findViewById(R.id.DoubleReversedThreeButton10);		
		Button ThreeYesOne = (Button) findViewById(R.id.DoubleReversedThreeButton11);
		Button ThreeNoTwo = (Button) findViewById(R.id.DoubleReversedThreeButton12);
		Button FourYes = (Button) findViewById(R.id.DoubleReversedThreeButton13);
		Button FourNo = (Button) findViewById(R.id.DoubleReversedThreeButton14);				
		Button FourYesOne = (Button) findViewById(R.id.DoubleReversedThreeButton15);
		Button FourNoTwo = (Button) findViewById(R.id.DoubleReversedThreeButton16);		
		Button FiveYes = (Button) findViewById(R.id.DoubleReversedThreeButton17);
		Button FiveNo = (Button) findViewById(R.id.DoubleReversedThreeButton18);
		Button FiveYesOne = (Button) findViewById(R.id.DoubleReversedThreeButton19);
		Button FiveNoTwo = (Button) findViewById(R.id.DoubleReversedThreeButton20);				
		
        builder.setTitle("What is your name?");
        builder.setItems(names, new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), names[which], Toast.LENGTH_SHORT).show();
				student = names[which].toString();
				return;
			}
		});
        
        builder.show();				

	OneYes.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p1q1) {
				p1=p1+1;
				p1q1=false;
				correctSound.start();						
				}
		}
	});	

	OneNo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p1q1) {
				alertDialog.setTitle("Oops! Let's try that again!");
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionOne));
				alertDialog.show();
				wrongSound.start();
				p1q1=false;
				}
		}
	});		
	
	OneYesOne.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p1q2 && !p1q1) {
				p1=p1+1;
				p1q2=false;
					if (p1==2) {
						awesome.start();
						} else {
							correctSound.start();						
								}
			linearLayoutOne.setBackgroundResource(R.drawable.background_red);
		}}
	});	

	OneNoTwo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p1q2 && !p1q1) {
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionTwo));
				alertDialog.show();
				wrongSound.start();
				p1q2=false;
			linearLayoutOne.setBackgroundResource(R.drawable.background_red);
		}}
	});		
	
	TwoYes.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p2q1 && !p1q2) {
				p2q1=false;
				p2=p2+1;
					if (p2==2) {
						awesome.start();
						} else {
							correctSound.start();						
								}
			}
		}
	});	

	TwoNo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p2q1 && !p1q2) {
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionThree));
				alertDialog.show();
				wrongSound.start();
				p2q1=false;
				}				
			
		}
	});		
	
	TwoYesOne.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p2q2 && !p2q1) {
				p2q2=false;
				p2=p2+1;
				if (p2==2) {
					awesome.start();
					} else {
						correctSound.start();
							}
			linearLayoutTwo.setBackgroundResource(R.drawable.background_red);
		}}
	});	

	TwoNoTwo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p2q2 && !p2q1) {
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionFour));
				alertDialog.show();
				wrongSound.start();
				p2q2=false;
			linearLayoutTwo.setBackgroundResource(R.drawable.background_red);
		}}
	});	
	
		ThreeYes.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p3q1 && !p2q2) {
				p3q1=false;
				p3=p3+1;
				if (p3==2) {
					awesome.start();
					} else {
						correctSound.start();
							}

			}								
		}
	});	

	ThreeNo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p3q1 && !p2q2) {
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionFive));
				alertDialog.show();
				wrongSound.start();
				p3q1=false;
			}

		}
	});	
	
		ThreeYesOne.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p3q2 && !p3q1) {
				p3q2=false;
				p3=p3+1;
				if (p3==2) {
					awesome.start();
					} else {
						correctSound.start();						
							}

			linearLayoutThree.setBackgroundResource(R.drawable.background_red);
		}}
	});	

	ThreeNoTwo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p3q2 && !p3q1) {
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionSix));
				alertDialog.show();
				wrongSound.start();
				p3q2=false;

			linearLayoutThree.setBackgroundResource(R.drawable.background_red);
		}}
	});			

		FourYes.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p4q1 && !p3q2) {
				p4q1=false;
				p4=p4+1;
				if (p4==2) {
					awesome.start();
					} else {
						correctSound.start();
							}

			}								
		}
	});	

	FourNo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p4q1 && !p3q2) {
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionSeven));
				alertDialog.show();
				wrongSound.start();
				p4q1=false;
				}

		}
	});	
	
		FourYesOne.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p4q2 && !p4q1) {
				p4q2=false;
				p4=p4+1;
				if (p4==2) {
					awesome.start();
					} else {
						correctSound.start();
							}

			linearLayoutFour.setBackgroundResource(R.drawable.background_red);
		}}
	});	

	FourNoTwo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p4q2 && !p4q1) {
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionEight));
				alertDialog.show();
				wrongSound.start();
				p4q2=false;
			linearLayoutFour.setBackgroundResource(R.drawable.background_red);
		}}
	});					

		FiveYes.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p5q1 && !p4q2) {
				p5q1=false;
				p5=p5+1;
				if (p5==2) {
					awesome.start();
					} else {
						correctSound.start();
							}
			
			}								
		}
	});	

	FiveNo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p5q1 && !p4q2) {
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionNine));
				alertDialog.show();
				wrongSound.start();
				p5q1=false;
				}

		}
	});	
	
		FiveYesOne.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p5q2 && !p5q1) {
				p5q2=false;
				p5=p5+1;
			
				
				if (p1+p2+p3+p4+p5==10) {
					perfect.start();
					perfectLesson.setTitle(getResources().getString(R.string.perfectScore));
					perfectLesson.setMessage(getResources().getString(R.string.perfectScoreText));
					perfectLesson.show();
					} else if (p5==2) {
						awesome.start();
						double IYHT = (((double)p1+p2)/4) * 100;
						double IYNT = (((double)p3+p4+p5)/6) * 100;
							notYet.setTitle("Not quite yet!");
							notYet.setMessage("You got " + 
							IYHT + "% of all the I-YOU/HERE-THERE frame questions and " + 
							IYNT + " % of all the I-YOU/NOW-THEN frame questions. Keep up the good work!");
							notYet.show();
							} else {
								correctSound.start();								
								double IYHT = (((double)p1+p2)/4) * 100;
								double IYNT = (((double)p3+p4+p5)/6) * 100;
									notYet.setTitle("Not quite yet!");
									notYet.setMessage("You got " + 
									IYHT + "% of all the I-YOU/HERE-THERE frame questions and " + 
									IYNT + " % of all the I-YOU/NOW-THEN frame questions. Keep up the good work!");
									notYet.show();
							}

				DataHolder entry = new DataHolder(DoubleReverseFrame3.this);
				boolean didItWork=true;
				
				try {
					String client = student;
					int ourFirst = p1+p2;
					int ourSecond = p3+p4+p5;
	
					entry.open();
					entry.createDoubleReversedEntry(client, lesson, ourFirst, ourSecond);
					entry.close();
					} catch (Exception e) {
						didItWork = false;
						} finally {
							if (didItWork) {
								Toast.makeText(getApplicationContext(), "went through fine", Toast.LENGTH_SHORT).show();
							}}

				
				linearLayoutFive.setBackgroundResource(R.drawable.background_red);
		}}
	});	

	FiveNoTwo.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (p5q2 && !p5q1) {
				double IYHT = (((double)p1+p2)/4) * 100;
				double IYNT = (((double)p3+p4+p5)/6) * 100;
					notYet.setTitle("Not quite yet!");
					notYet.setMessage("You got " + 
					IYHT + "% of all the I-YOU/HERE-THERE frame questions and " + 
					IYNT + " % of all the I-YOU/NOW-THEN frame questions. Keep up the good work!");
					notYet.show();
				wrongSound.start();
				p5q2=false;
				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.DoubleReversedThreeErrorCorrectionTen));
				alertDialog.show();
			linearLayoutFive.setBackgroundResource(R.drawable.background_red);
			
			DataHolder entry = new DataHolder(DoubleReverseFrame3.this);
			boolean didItWork=true;
			
			try {
				String client = student;
				int ourFirst = p1+p2;
				int ourSecond = p3+p4+p5;

				entry.open();
				entry.createDoubleReversedEntry(client, lesson, ourFirst, ourSecond);
				entry.close();
				} catch (Exception e) {
					didItWork = false;
					} finally {
						if (didItWork) {
							Toast.makeText(getApplicationContext(), "went through fine", Toast.LENGTH_SHORT).show();
						}}
		}}
	});			

	
}}

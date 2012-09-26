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

public class SimpleFrame11 extends Activity {

	boolean p1q1=true;  boolean p1q2=true; 	boolean p2q1=true;	boolean p2q2=true;
	boolean p3q1=true;	boolean p3q2=true;	boolean p4q1=true;	boolean p4q2=true;	
	boolean p5q1=true;	boolean p5q2=true;	boolean p6q1=true;	boolean p6q2=true;

	int p1=0; int p2=0;	int p3=0; int p4=0; int p5=0; int p6=0; int lesson=111;
	
	String student="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simpleframe11);

		final CharSequence[] names = getResources().getStringArray(R.array.studentNames);		
				
		final LinearLayout linearLayoutOne = (LinearLayout)findViewById(R.id.layoutNumberOne);
		final LinearLayout linearLayoutTwo = (LinearLayout)findViewById(R.id.layoutNumberTwo);
		final LinearLayout linearLayoutThree = (LinearLayout)findViewById(R.id.layoutNumberThree);
		final LinearLayout linearLayoutFour = (LinearLayout)findViewById(R.id.layoutNumberFour);
		final LinearLayout linearLayoutFive = (LinearLayout)findViewById(R.id.layoutNumberFive);
		final LinearLayout linearLayoutSix = (LinearLayout)findViewById(R.id.layoutNumberSix);
		
		OnClickListener listener = null;
		final AlertDialog alertDialog = new AlertDialog.Builder(this).setNeutralButton("DONE",listener).create();
		final AlertDialog perfectLesson = new AlertDialog.Builder(this).setNeutralButton("ALL DONE", listener).create();
		final AlertDialog notYet = new AlertDialog.Builder(this).setNeutralButton("DONE", listener).create();
		final MediaPlayer correctSound=MediaPlayer.create(this, R.raw.coin);
		final MediaPlayer wrongSound=MediaPlayer.create(this, R.raw.incorrect);		
		final MediaPlayer awesome=MediaPlayer.create(this, R.raw.smoneup);
		final MediaPlayer perfect=MediaPlayer.create(this, R.raw.powerup);		
		
        AlertDialog.Builder builder = new AlertDialog.Builder(this);		
		
		Button OneYes = (Button) findViewById(R.id.SimpleElevenButton1);
		Button OneNo = (Button) findViewById(R.id.SimpleElevenButton2);		
		Button OneYesOne = (Button) findViewById(R.id.SimpleElevenButton3);
		Button OneNoTwo = (Button) findViewById(R.id.SimpleElevenButton4);		
		Button TwoYes = (Button) findViewById(R.id.SimpleElevenButton5);
		Button TwoNo = (Button) findViewById(R.id.SimpleElevenButton6);		
		Button TwoYesOne = (Button) findViewById(R.id.SimpleElevenButton7);
		Button TwoNoTwo = (Button) findViewById(R.id.SimpleElevenButton8);				
		Button ThreeYes = (Button) findViewById(R.id.SimpleElevenButton9);
		Button ThreeNo = (Button) findViewById(R.id.SimpleElevenButton10);		
		Button ThreeYesOne = (Button) findViewById(R.id.SimpleElevenButton11);
		Button ThreeNoTwo = (Button) findViewById(R.id.SimpleElevenButton12);
		Button FourYes = (Button) findViewById(R.id.SimpleElevenButton13);
		Button FourNo = (Button) findViewById(R.id.SimpleElevenButton14);				
		Button FourYesOne = (Button) findViewById(R.id.SimpleElevenButton15);
		Button FourNoTwo = (Button) findViewById(R.id.SimpleElevenButton16);		
		Button FiveYes = (Button) findViewById(R.id.SimpleElevenButton17);
		Button FiveNo = (Button) findViewById(R.id.SimpleElevenButton18);
		Button FiveYesOne = (Button) findViewById(R.id.SimpleElevenButton19);
		Button FiveNoTwo = (Button) findViewById(R.id.SimpleElevenButton20);		
		Button SixYes = (Button) findViewById(R.id.SimpleElevenButton21);
		Button SixNo = (Button) findViewById(R.id.SimpleElevenButton22);
		Button SixYesOne = (Button) findViewById(R.id.SimpleElevenButton23);
		Button SixNoTwo = (Button) findViewById(R.id.SimpleElevenButton24);

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
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionOne));
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
				
				linearLayoutOne.setBackgroundResource(R.drawable.nice_background_greener);
			}}
		});	

		OneNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p1q2 && !p1q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionTwo));
					alertDialog.show();
					wrongSound.start();
					p1q2=false;
						
				linearLayoutOne.setBackgroundResource(R.drawable.nice_background_greener);
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
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionThree));
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

				linearLayoutTwo.setBackgroundResource(R.drawable.nice_background_greener);
			}}
		});	

		TwoNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p2q2 && !p2q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionFour));
					alertDialog.show();
					wrongSound.start();
					p2q2=false;

				linearLayoutTwo.setBackgroundResource(R.drawable.nice_background_greener);
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
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionFive));
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

				linearLayoutThree.setBackgroundResource(R.drawable.nice_background_greener);
			}}
		});	

		ThreeNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p3q2 && !p3q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionSix));
					alertDialog.show();
					wrongSound.start();
					p3q2=false;
					}

				linearLayoutThree.setBackgroundResource(R.drawable.nice_background_greener);
			}
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
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionSeven));
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

				linearLayoutFour.setBackgroundResource(R.drawable.nice_background_greener);
				}}
		});	

		FourNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p4q2 && !p4q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionEight));
					alertDialog.show();
					wrongSound.start();
					p4q2=false;

				linearLayoutFour.setBackgroundResource(R.drawable.nice_background_greener);
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
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionNine));
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
				
					if (p5==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				linearLayoutFive.setBackgroundResource(R.drawable.nice_background_greener);
			}}
		});	

		FiveNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p5q2 && !p5q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionTen));
					alertDialog.show();
					wrongSound.start();
					p5q2=false;
					}

				linearLayoutFive.setBackgroundResource(R.drawable.nice_background_greener);
			}
		});			

 		SixYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p6q1 && !p5q2) {
					p6q1=false;
					p6=p6+1;
					if (p6==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	

		SixNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p6q1 && !p5q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionEleven));
					alertDialog.show();
					wrongSound.start();
					p6q1=false;
					}
				
			}
		});	
		
 		SixYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p6q2 && !p6q1) {
					correctSound.start();
					p6=p6+1;
					p6q2=false;
					linearLayoutSix.setBackgroundResource(R.drawable.nice_background_greener);
				
					if (p1+p2+p3+p4+p5+p6==12) {
						perfect.start();
						perfectLesson.setTitle(getResources().getString(R.string.perfectScore));
						perfectLesson.setMessage(getResources().getString(R.string.perfectScoreText));
						perfectLesson.show();
						} else if (p6==2) {
							double iYOU = (((double)p1+p2)/4) * 100;
							double hTHERE = (((double)p3+p4)/4) * 100;
							double nTHEN = (((double)p5+p6)/4) * 100;
								notYet.setTitle("Not quite yet!");
								notYet.setMessage("You got " + iYOU + "% of all the I-YOU frame questions, " + hTHERE + " % of all the HERE-THERE frame questions, and " + nTHEN + "% of all the NOW-THEN frame questions. Keep up the good work!");
								notYet.show();
								}

					
					DataHolder entry = new DataHolder(SimpleFrame11.this);
					boolean didItWork=true;
					
					try {
						String client = student;
						int ourFirst = p1+p2;
						int ourSecond = p3+p4;
						int ourThird = p5+p6;
		
//						entry.open();
						entry.open();
						entry.createSimpleEntry(client, lesson, ourFirst, ourSecond, ourThird);
						entry.close();
						} catch (Exception e) {
							didItWork = false;
							} finally {
								if (didItWork) {
									Toast.makeText(getApplicationContext(), "went through fine", Toast.LENGTH_SHORT).show();
												}
										}
				}								
			}
		});	

		SixNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p6q2  && !p6q1) {
					wrongSound.start();
					p6q2=false;
					linearLayoutSix.setBackgroundResource(R.drawable.nice_background_greener);
					}
						double iYOU = (((double)p1+p2)/4) * 100;
						double hTHERE = (((double)p3+p4)/4) * 100;
						double nTHEN = (((double)p5+p6)/4) * 100;
							notYet.setTitle("Not quite yet!");
							notYet.setMessage("You got " + iYOU + "% of all the I-YOU frame questions, " + hTHERE + " % of all the HERE-THERE frame questions, and " + nTHEN + "% of all the NOW-THEN frame questions. Keep up the good work!");
							notYet.show();

							alertDialog.setTitle(getResources().getString(R.string.oops));
							alertDialog.setMessage(getResources().getString(R.string.SimpleElevenErrorCorrectionTwelve));
							alertDialog.show();
							
							DataHolder entry = new DataHolder(SimpleFrame11.this);
							boolean didItWork=true;
							
							try {
								String client = student;
								int ourFirst = p1+p2;
								int ourSecond = p3+p4;
								int ourThird = p5+p6;
				
								entry.open();
								entry.createSimpleEntry(client, lesson, ourFirst, ourSecond, ourThird);
								entry.close();
								} catch (Exception e) {
									didItWork = false;
									} finally {
										if (didItWork) {
											Toast.makeText(getApplicationContext(), "went through fine", Toast.LENGTH_SHORT).show();
														}
												}							
					}
		});					
	}	
}
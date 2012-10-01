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

public class CheckupFrame1 extends Activity {

	boolean p1q1=true;  boolean p1q2=true; 	boolean p2q1=true;	boolean p2q2=true;
	boolean p3q1=true;	boolean p3q2=true;	boolean p4q1=true;	boolean p4q2=true;	
	boolean p5q1=true;	boolean p5q2=true;	boolean p6q1=true;	boolean p6q2=true;
	
	boolean p7q1=true;	boolean p7q2=true;	boolean p8q1=true;	boolean p8q2=true;
	boolean p9q1=true;	boolean p9q2=true;	boolean p10q1=true;	boolean p10q2=true;
	boolean p11q1=true;	boolean p11q2=true;	boolean p12q1=true;	boolean p12q2=true;
	boolean p13q1=true;	boolean p13q2=true;

	boolean p14q1=true;	boolean p14q2=true;	boolean p15q1=true;	boolean p15q2=true;
	boolean p16q1=true;	boolean p16q2=true;	boolean p17q1=true;	boolean p17q2=true;
	boolean p18q1=true;	boolean p18q2=true;		
	
	int p1=0; int p2=0;	int p3=0; int p4=0; int p5=0; int p6=0;
	int p7=0; int p8=0;	int p9=0; int p10=0; int p11=0; int p12=0; int p13=0;
	int p14=0; int p15=0; int p16=0; int p17=0; int p18=0; 
	
	int lesson=401;
	
	String student="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.checkupframe1);

		final CharSequence[] names = getResources().getStringArray(R.array.studentNames);		
				
		final LinearLayout linearLayoutOne = (LinearLayout)findViewById(R.id.layoutNumberOne);
		final LinearLayout linearLayoutTwo = (LinearLayout)findViewById(R.id.layoutNumberTwo);
		final LinearLayout linearLayoutThree = (LinearLayout)findViewById(R.id.layoutNumberThree);
		final LinearLayout linearLayoutFour = (LinearLayout)findViewById(R.id.layoutNumberFour);
		final LinearLayout linearLayoutFive = (LinearLayout)findViewById(R.id.layoutNumberFive);
		final LinearLayout linearLayoutSix = (LinearLayout)findViewById(R.id.layoutNumberSix);

		final LinearLayout ReversedlinearLayoutOne = (LinearLayout)findViewById(R.id.layoutNumberSeven);
		final LinearLayout ReversedlinearLayoutTwo = (LinearLayout)findViewById(R.id.layoutNumberEight);
		final LinearLayout ReversedlinearLayoutThree = (LinearLayout)findViewById(R.id.layoutNumberNine);
		final LinearLayout ReversedlinearLayoutFour = (LinearLayout)findViewById(R.id.layoutNumberTen);
		final LinearLayout ReversedlinearLayoutFive = (LinearLayout)findViewById(R.id.layoutNumberEleven);
		final LinearLayout ReversedlinearLayoutSix = (LinearLayout)findViewById(R.id.layoutNumberTwelve);
		final LinearLayout ReversedlinearLayoutSeven = (LinearLayout)findViewById(R.id.layoutNumberThirteen);

		final LinearLayout DoubleReversedlinearLayoutOne = (LinearLayout)findViewById(R.id.layoutNumberFourteen);
		final LinearLayout DoubleReversedlinearLayoutTwo = (LinearLayout)findViewById(R.id.layoutNumberFifteen);
		final LinearLayout DoubleReversedlinearLayoutThree = (LinearLayout)findViewById(R.id.layoutNumberSixteen);
		final LinearLayout DoubleReversedlinearLayoutFour = (LinearLayout)findViewById(R.id.layoutNumberSeventeen);
		final LinearLayout DoubleReversedlinearLayoutFive = (LinearLayout)findViewById(R.id.layoutNumberEighteen);
		
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
		
		OnClickListener listener = null;
		final AlertDialog alertDialog = new AlertDialog.Builder(this).setNeutralButton("DONE",listener).create();
		final AlertDialog perfectLesson = new AlertDialog.Builder(this).setNeutralButton("ALL DONE", listener).create();
		final AlertDialog notYet = new AlertDialog.Builder(this).setNeutralButton("DONE", listener).create();
		final MediaPlayer correctSound=MediaPlayer.create(this, R.raw.coin);
		final MediaPlayer wrongSound=MediaPlayer.create(this, R.raw.incorrect);		
		final MediaPlayer awesome=MediaPlayer.create(this, R.raw.smoneup);
		final MediaPlayer perfect=MediaPlayer.create(this, R.raw.powerup);		
		
		Button OneYes = (Button) findViewById(R.id.CheckOneSimpleButton1);
		Button OneNo = (Button) findViewById(R.id.CheckOneSimpleButton2);		
		Button OneYesOne = (Button) findViewById(R.id.CheckOneSimpleButton3);
		Button OneNoTwo = (Button) findViewById(R.id.CheckOneSimpleButton4);		
		Button TwoYes = (Button) findViewById(R.id.CheckOneSimpleButton5);
		Button TwoNo = (Button) findViewById(R.id.CheckOneSimpleButton6);		
		Button TwoYesOne = (Button) findViewById(R.id.CheckOneSimpleButton7);
		Button TwoNoTwo = (Button) findViewById(R.id.CheckOneSimpleButton8);				
		Button ThreeYes = (Button) findViewById(R.id.CheckOneSimpleButton9);
		Button ThreeNo = (Button) findViewById(R.id.CheckOneSimpleButton10);		
		Button ThreeYesOne = (Button) findViewById(R.id.CheckOneSimpleButton11);
		Button ThreeNoTwo = (Button) findViewById(R.id.CheckOneSimpleButton12);
		Button FourYes = (Button) findViewById(R.id.CheckOneSimpleButton13);
		Button FourNo = (Button) findViewById(R.id.CheckOneSimpleButton14);				
		Button FourYesOne = (Button) findViewById(R.id.CheckOneSimpleButton15);
		Button FourNoTwo = (Button) findViewById(R.id.CheckOneSimpleButton16);		
		Button FiveYes = (Button) findViewById(R.id.CheckOneSimpleButton17);
		Button FiveNo = (Button) findViewById(R.id.CheckOneSimpleButton18);
		Button FiveYesOne = (Button) findViewById(R.id.CheckOneSimpleButton19);
		Button FiveNoTwo = (Button) findViewById(R.id.CheckOneSimpleButton20);		
		Button SixYes = (Button) findViewById(R.id.CheckOneSimpleButton21);
		Button SixNo = (Button) findViewById(R.id.CheckOneSimpleButton22);
		Button SixYesOne = (Button) findViewById(R.id.CheckOneSimpleButton23);
		Button SixNoTwo = (Button) findViewById(R.id.CheckOneSimpleButton24);

		Button ReversedOneYes = (Button) findViewById(R.id.CheckOneReversedButton1);
		Button ReversedOneNo = (Button) findViewById(R.id.CheckOneReversedButton2);		
		Button ReversedOneYesOne = (Button) findViewById(R.id.CheckOneReversedButton3);
		Button ReversedOneNoTwo = (Button) findViewById(R.id.CheckOneReversedButton4);		
		Button ReversedTwoYes = (Button) findViewById(R.id.CheckOneReversedButton5);
		Button ReversedTwoNo = (Button) findViewById(R.id.CheckOneReversedButton6);		
		Button ReversedTwoYesOne = (Button) findViewById(R.id.CheckOneReversedButton7);
		Button ReversedTwoNoTwo = (Button) findViewById(R.id.CheckOneReversedButton8);				
		Button ReversedThreeYes = (Button) findViewById(R.id.CheckOneReversedButton9);
		Button ReversedThreeNo = (Button) findViewById(R.id.CheckOneReversedButton10);		
		Button ReversedThreeYesOne = (Button) findViewById(R.id.CheckOneReversedButton11);
		Button ReversedThreeNoTwo = (Button) findViewById(R.id.CheckOneReversedButton12);
		Button ReversedFourYes = (Button) findViewById(R.id.CheckOneReversedButton13);
		Button ReversedFourNo = (Button) findViewById(R.id.CheckOneReversedButton14);				
		Button ReversedFourYesOne = (Button) findViewById(R.id.CheckOneReversedButton15);
		Button ReversedFourNoTwo = (Button) findViewById(R.id.CheckOneReversedButton16);		
		Button ReversedFiveYes = (Button) findViewById(R.id.CheckOneReversedButton17);
		Button ReversedFiveNo = (Button) findViewById(R.id.CheckOneReversedButton18);
		Button ReversedFiveYesOne = (Button) findViewById(R.id.CheckOneReversedButton19);
		Button ReversedFiveNoTwo = (Button) findViewById(R.id.CheckOneReversedButton20);		
		Button ReversedSixYes = (Button) findViewById(R.id.CheckOneReversedButton21);
		Button ReversedSixNo = (Button) findViewById(R.id.CheckOneReversedButton22);
		Button ReversedSixYesOne = (Button) findViewById(R.id.CheckOneReversedButton23);
		Button ReversedSixNoTwo = (Button) findViewById(R.id.CheckOneReversedButton24);
		Button ReversedSevenYes = (Button) findViewById(R.id.CheckOneReversedButton25);
		Button ReversedSevenNo = (Button) findViewById(R.id.CheckOneReversedButton26);
		Button ReversedSevenYesOne = (Button) findViewById(R.id.CheckOneReversedButton27);
		Button ReversedSevenNoTwo = (Button) findViewById(R.id.CheckOneReversedButton28);		
		
		Button DoubleReversedOneYes = (Button) findViewById(R.id.CheckOneDoubleReversedButton1);
		Button DoubleReversedOneNo = (Button) findViewById(R.id.CheckOneDoubleReversedButton2);		
		Button DoubleReversedOneYesOne = (Button) findViewById(R.id.CheckOneDoubleReversedButton3);
		Button DoubleReversedOneNoTwo = (Button) findViewById(R.id.CheckOneDoubleReversedButton4);		
		Button DoubleReversedTwoYes = (Button) findViewById(R.id.CheckOneDoubleReversedButton5);
		Button DoubleReversedTwoNo = (Button) findViewById(R.id.CheckOneDoubleReversedButton6);		
		Button DoubleReversedTwoYesOne = (Button) findViewById(R.id.CheckOneDoubleReversedButton7);
		Button DoubleReversedTwoNoTwo = (Button) findViewById(R.id.CheckOneDoubleReversedButton8);				
		Button DoubleReversedThreeYes = (Button) findViewById(R.id.CheckOneDoubleReversedButton9);
		Button DoubleReversedThreeNo = (Button) findViewById(R.id.CheckOneDoubleReversedButton10);		
		Button DoubleReversedThreeYesOne = (Button) findViewById(R.id.CheckOneDoubleReversedButton11);
		Button DoubleReversedThreeNoTwo = (Button) findViewById(R.id.CheckOneDoubleReversedButton12);
		Button DoubleReversedFourYes = (Button) findViewById(R.id.CheckOneDoubleReversedButton13);
		Button DoubleReversedFourNo = (Button) findViewById(R.id.CheckOneDoubleReversedButton14);				
		Button DoubleReversedFourYesOne = (Button) findViewById(R.id.CheckOneDoubleReversedButton15);
		Button DoubleReversedFourNoTwo = (Button) findViewById(R.id.CheckOneDoubleReversedButton16);		
		Button DoubleReversedFiveYes = (Button) findViewById(R.id.CheckOneDoubleReversedButton17);
		Button DoubleReversedFiveNo = (Button) findViewById(R.id.CheckOneDoubleReversedButton18);
		Button DoubleReversedFiveYesOne = (Button) findViewById(R.id.CheckOneDoubleReversedButton19);
		Button DoubleReversedFiveNoTwo = (Button) findViewById(R.id.CheckOneDoubleReversedButton20);		
		
        builder.setTitle("What is your name?");
        builder.setCancelable(false);
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionOne));
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionTwo));
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionThree));
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionFour));
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionFive));
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionSix));
					alertDialog.show();
					wrongSound.start();
					p3q2=false;

				linearLayoutThree.setBackgroundResource(R.drawable.nice_background_greener);
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionSeven));
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionEight));
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionNine));
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionTen));
					alertDialog.show();
					wrongSound.start();
					p5q2=false;
				linearLayoutFive.setBackgroundResource(R.drawable.nice_background_greener);
			}}
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
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionEleven));
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
					p6q2=false;
					p6=p6+1;
				
					if (p6==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				linearLayoutSix.setBackgroundResource(R.drawable.nice_background_greener);
			}}
		});	
 		
		SixNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p6q2  && !p6q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneSimpleErrorCorrectionTwelve));
					alertDialog.show();
					wrongSound.start();
					p6q2=false;
					linearLayoutSix.setBackgroundResource(R.drawable.nice_background_greener);					
				}}
		});					

		ReversedOneYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p7q1 && !p6q2) {
					p7q1=false;
					p7=p7+1;
					if (p7==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	
	
		ReversedOneNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p7q1 && !p6q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionOne));
					alertDialog.show();
					wrongSound.start();
					p7q1=false;
					}
				
			}
		});	

		ReversedOneYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p7q2 && !p7q1) {
					p7q2=false;
					p7=p7+1;
				
					if (p7==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				ReversedlinearLayoutOne.setBackgroundResource(R.drawable.background_blue);
			}}
		});	

		ReversedOneNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p7q2 && !p7q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionTwo));
					alertDialog.show();
					wrongSound.start();
					p7q2=false;
				ReversedlinearLayoutOne.setBackgroundResource(R.drawable.background_blue);
			}}
		});			
		
		ReversedTwoYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p8q1 && !p7q2) {
					p8q1=false;
					p8=p8+1;
					if (p8==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	

	
		ReversedTwoNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p8q1 && !p7q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionThree));
					alertDialog.show();
					wrongSound.start();
					p8q1=false;
					}
				
			}
		});	

		ReversedTwoYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p8q2 && !p8q1) {
					p8q2=false;
					p8=p8+1;
				
					if (p8==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				ReversedlinearLayoutTwo.setBackgroundResource(R.drawable.background_blue);
			}}
		});	

		ReversedTwoNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p8q2 && !p8q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionFour));
					alertDialog.show();
					wrongSound.start();
					p8q2=false;
				ReversedlinearLayoutTwo.setBackgroundResource(R.drawable.background_blue);
			}}
		});			
		
		ReversedThreeYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p9q1 && !p8q2) {
					p9q1=false;
					p9=p9+1;
					if (p9==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				}								
			}
		});	

	
		ReversedThreeNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p9q1 && !p8q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionFive));
					alertDialog.show();
					wrongSound.start();
					p9q1=false;
					}
			}
		});	

		ReversedThreeYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p9q2 && !p9q1) {
					p9q2=false;
					p9=p9+1;
				
					if (p9==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				ReversedlinearLayoutThree.setBackgroundResource(R.drawable.background_blue);
			}}
		});	

		ReversedThreeNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p9q2 && !p9q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionSix));
					alertDialog.show();
					wrongSound.start();
					p9q2=false;
				ReversedlinearLayoutThree.setBackgroundResource(R.drawable.background_blue);
			}}
		});			
		
		ReversedFourYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p10q1 && !p9q2) {
					p10q1=false;
					p10=p10+1;
					if (p10==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	

	
		ReversedFourNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p10q1 && !p9q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionSeven));
					alertDialog.show();
					wrongSound.start();
					p10q1=false;
					}
			}
		});	

		ReversedFourYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p10q2 && !p10q1) {
					p10q2=false;
					p10=p10+1;
				
					if (p10==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				ReversedlinearLayoutFour.setBackgroundResource(R.drawable.background_blue);
			}}
		});	

		ReversedFourNoTwo.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p10q2 && !p10q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionEight));
					alertDialog.show();
					wrongSound.start();
					p10q2=false;
				ReversedlinearLayoutFour.setBackgroundResource(R.drawable.background_blue);
			}}
		});			
		
		ReversedFiveYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p11q1 && !p10q2) {
					p11q1=false;
					p11=p11+1;
					if (p11==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				}								
			}
		});	

	
		ReversedFiveNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p11q1 && !p10q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionNine));
					alertDialog.show();
					wrongSound.start();
					p11q1=false;
					}
				
			}
		});	

		ReversedFiveYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p11q2 && !p11q1) {
					p11q2=false;
					p11=p11+1;
				
					if (p11==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				ReversedlinearLayoutFive.setBackgroundResource(R.drawable.background_blue);
			}}
		});	

		ReversedFiveNoTwo.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p11q2 && !p11q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionTen));
					alertDialog.show();
					wrongSound.start();
					p11q2=false;
				ReversedlinearLayoutFive.setBackgroundResource(R.drawable.background_blue);
			}}
		});			
	
		ReversedSixYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p12q1 && !p11q2) {
					p12q1=false;
					p12=p12+1;
					if (p12==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				}								
			}
		});	
	
		ReversedSixNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p12q1 && !p11q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionEleven));
					alertDialog.show();
					wrongSound.start();
					p12q1=false;
					}
			}
		});	

		ReversedSixYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p12q2 && !p12q1) {
					p12q2=false;
					p12=p12+1;
				
					if (p12==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				ReversedlinearLayoutSix.setBackgroundResource(R.drawable.background_blue);
			}}
		});	

		ReversedSixNoTwo.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p12q2 && !p12q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionTwelve));
					alertDialog.show();
					wrongSound.start();
					p12q2=false;
				ReversedlinearLayoutSix.setBackgroundResource(R.drawable.background_blue);
			}}
		});			
	
		ReversedSevenYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p13q1 && !p12q2) {
					p13q1=false;
					p13=p13+1;
					if (p13==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				}								
			}
		});	
	
		ReversedSevenNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p13q1 && !p12q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionThirteen));
					alertDialog.show();
					wrongSound.start();
					p13q1=false;
					}
			}
		});	

		ReversedSevenYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p13q2 && !p13q1) {
					p13q2=false;
					p13=p13+1;
				
					if (p13==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				ReversedlinearLayoutSeven.setBackgroundResource(R.drawable.background_blue);
			}}
		});	

		ReversedSevenNoTwo.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p13q2 && !p13q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneReversedErrorCorrectionFourteen));
					alertDialog.show();
					wrongSound.start();
					p13q2=false;
				ReversedlinearLayoutSeven.setBackgroundResource(R.drawable.background_blue);
			}}
		});			
 
		DoubleReversedOneYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p14q1 && !p13q2) {
					p14q1=false;
					p14=p14+1;
					if (p14==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	
	
		DoubleReversedOneNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p14q1 && !p13q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionOne));
					alertDialog.show();
					wrongSound.start();
					p14q1=false;
					}
			}
		});	

		DoubleReversedOneYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p14q2 && !p14q1) {
					p14q2=false;
					p14=p14+1;
				
					if (p14==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				DoubleReversedlinearLayoutOne.setBackgroundResource(R.drawable.background_red);
			}}
		});	
		
		DoubleReversedOneNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p14q2 && !p14q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionTwo));
					alertDialog.show();
					wrongSound.start();
					p14q2=false;
				DoubleReversedlinearLayoutOne.setBackgroundResource(R.drawable.background_red);
			}}
		});			
		
		DoubleReversedTwoYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p15q1 && !p14q2) {
					p15q1=false;
					p15=p15+1;
					if (p15==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	
	
		DoubleReversedTwoNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p15q1 && !p14q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionThree));
					alertDialog.show();
					wrongSound.start();
					p15q1=false;
					}
			}
		});	

		DoubleReversedTwoYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p15q2 && !p15q1) {
					p15q2=false;
					p15=p15+1;
				
					if (p15==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				DoubleReversedlinearLayoutTwo.setBackgroundResource(R.drawable.background_red);
			}}
		});	

		DoubleReversedTwoNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p15q2 && !p15q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionFour));
					alertDialog.show();
					wrongSound.start();
					p15q2=false;
				DoubleReversedlinearLayoutTwo.setBackgroundResource(R.drawable.background_red);
			}}
		});			
		
		DoubleReversedThreeYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p16q1 && !p15q2) {
					p16q1=false;
					p16=p16+1;
					if (p16==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	
	
		DoubleReversedThreeNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p16q1 && !p15q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionFive));
					alertDialog.show();
					wrongSound.start();
					p16q1=false;
					}
			}
		});	

		DoubleReversedThreeYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p16q2 && !p16q1) {
					p16q2=false;
					p16=p16+1;
				
					if (p16==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				DoubleReversedlinearLayoutThree.setBackgroundResource(R.drawable.background_red);
			}}
		});	

		DoubleReversedThreeNoTwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p16q2 && !p16q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionSix));
					alertDialog.show();
					wrongSound.start();
					p16q2=false;
				DoubleReversedlinearLayoutThree.setBackgroundResource(R.drawable.background_red);
			}}
		});			
		
		DoubleReversedFourYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p17q1 && !p16q2) {
					p17q1=false;
					p17=p17+1;
					if (p17==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	
	
		DoubleReversedFourNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p17q1 && !p16q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionSeven));
					alertDialog.show();
					wrongSound.start();
					p17q1=false;
					}
			}
		});	

		DoubleReversedFourYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p17q2 && !p17q1) {
					p17q2=false;
					p17=p17+1;
				
					if (p17==2) {
						awesome.start();
						} else {
							correctSound.start();
								}
				DoubleReversedlinearLayoutFour.setBackgroundResource(R.drawable.background_red);
			}}
		});	

		DoubleReversedFourNoTwo.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p17q2 && !p17q1) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionEight));
					alertDialog.show();
					wrongSound.start();
					p17q2=false;
				DoubleReversedlinearLayoutFour.setBackgroundResource(R.drawable.background_red);
			}}
		});		
		
		DoubleReversedFiveYes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p18q1 && !p17q2) {
					p18q1=false;
					p18=p18+1;
					if (p18==2) {
						awesome.start();
						} else {
							correctSound.start();
								}

				}								
			}
		});	
	
		DoubleReversedFiveNo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p18q1 && !p17q2) {
					alertDialog.setTitle(getResources().getString(R.string.oops));
					alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionNine));
					alertDialog.show();
					wrongSound.start();
					p18q1=false;
					}
			}
		});	

		DoubleReversedFiveYesOne.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p18q2 && !p18q1) {
					p18q2=false;
					p18=p18+1;
			
					if (p1+p2+p3+p4+p5+p6+p7+p8+p9+p10+p11+p12+p13+p14+p15+p16+p17+p18==36) {
						perfect.start();
						perfectLesson.setTitle(getResources().getString(R.string.perfectScore));
						perfectLesson.setMessage(getResources().getString(R.string.perfectScoreText));
						perfectLesson.show();
						} else if (p18==2) {
							awesome.start();
							double iYOU = (((double)p1+p2)/4) * 100;
							double hTHERE = (((double)p3+p4)/4) * 100;
							double nTHEN = (((double)p5+p6)/4) * 100;
							
							double RiYOU = (((double)p7+p8)/4) * 100;
							double RhTHERE = (((double)p9+p10)/4) * 100;
							double RnTHEN = (((double)p11+p12+p13)/6) * 100;								

							double DRiYOU = (((double)p14+p15)/4) * 100;
							double DRhTHERE = (((double)p16+p17+p18)/6) * 100;
							
								notYet.setTitle("Not quite yet!");
								notYet.setMessage("You got " + iYOU + "% of all the I-YOU frame questions, " + 
										hTHERE + " % of all the HERE-THERE frame questions, and " + 
										nTHEN + "% of all the NOW-THEN frame questions. \nYou got " +
										RiYOU + "% of the Reversed I-YOU frames, " +
										RhTHERE + "% of the Reversed HERE-THERE frames, and " +
										RnTHEN + "% of the Reversed NOW-THEN frames. \nYou answered " +
										DRiYOU + "% of the Double Reversed HERE-THERE frames and " +
										DRhTHERE + "% of the Double Reversed NOW-THEN frames. Keep up the good work!");
										notYet.show();
											} else {
												correctSound.start();
												double iYOU = (((double)p1+p2)/4) * 100;
												double hTHERE = (((double)p3+p4)/4) * 100;
												double nTHEN = (((double)p5+p6)/4) * 100;
								
												double RiYOU = (((double)p7+p8)/4) * 100;
												double RhTHERE = (((double)p9+p10)/4) * 100;
												double RnTHEN = (((double)p11+p12+p13)/6) * 100;								

												double DRiYOU = (((double)p14+p15)/4) * 100;
												double DRhTHERE = (((double)p16+p17+p18)/6) * 100;
								
												notYet.setTitle("Not quite yet!");
												notYet.setMessage("You got " + iYOU + "% of all the I-YOU frame questions, " + 
														hTHERE + " % of all the HERE-THERE frame questions, and " + 
														nTHEN + "% of all the NOW-THEN frame questions. \n\nYou got " +
														RiYOU + "% of the Reversed I-YOU frames, " +
														RhTHERE + "% of the Reversed HERE-THERE frames, and " +
														RnTHEN + "% of the Reversed NOW-THEN frames. \n\nYou answered " +
														DRiYOU + "% of the Double Reversed HERE-THERE frames and " +
														DRhTHERE + "% of the Double Reversed NOW-THEN frames. \n\nKeep up the good work!");
														notYet.show();
													}

					DataHolder entry = new DataHolder(CheckupFrame1.this);
					boolean didItWork=true;
					
					try {
						String client = student;
						int ourFirst = p1+p2;
						int ourSecond = p3+p4;
						int ourThird = p5+p6;
						
						int ourFourth = p7+p8;
						int ourFifth = p9+p10;
						int ourSixth = p11+p12+p13;
						
						int ourSeventh = p14+p15;
						int ourEighth = p16+p17+p18;
						
		
						entry.open();
						entry.createProbeEntry(client, lesson, ourFirst, ourSecond, ourThird, 
						ourFourth, ourFifth, ourSixth, ourSeventh, ourEighth);
						entry.close();
						} catch (Exception e) {
							didItWork = false;
							} finally {
								if (didItWork) {
									Toast.makeText(getApplicationContext(), "went through fine", Toast.LENGTH_SHORT).show();
								}}
					DoubleReversedlinearLayoutFive.setBackgroundResource(R.drawable.background_red);
				}}
		});	

		DoubleReversedFiveNoTwo.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (p18q2 && !p18q1) {
					wrongSound.start();
					p18q2=false;
					DoubleReversedlinearLayoutFive.setBackgroundResource(R.drawable.background_red);
					}

				double iYOU = (((double)p1+p2)/4) * 100;
				double hTHERE = (((double)p3+p4)/4) * 100;
				double nTHEN = (((double)p5+p6)/4) * 100;

				double RiYOU = (((double)p7+p8)/4) * 100;
				double RhTHERE = (((double)p9+p10)/4) * 100;
				double RnTHEN = (((double)p11+p12+p13)/6) * 100;								

				double DRiYOU = (((double)p14+p15)/4) * 100;
				double DRhTHERE = (((double)p16+p17+p18)/6) * 100;

				notYet.setTitle("Not quite yet!");
				notYet.setMessage("You got " + iYOU + "% of all the I-YOU frame questions, " + 
						hTHERE + " % of all the HERE-THERE frame questions, and " + 
						nTHEN + "% of all the NOW-THEN frame questions. \n\nYou got " +
						RiYOU + "% of the Reversed I-YOU frames, " +
						RhTHERE + "% of the Reversed HERE-THERE frames, and " +
						RnTHEN + "% of the Reversed NOW-THEN frames. \n\nYou answered " +
						DRiYOU + "% of the Double Reversed HERE-THERE frames and " +
						DRhTHERE + "% of the Double Reversed NOW-THEN frames. \n\nKeep up the good work!");
						notYet.show();

				alertDialog.setTitle(getResources().getString(R.string.oops));
				alertDialog.setMessage(getResources().getString(R.string.CheckOneDoubleReversedErrorCorrectionTen));
				alertDialog.show();

				DataHolder entry = new DataHolder(CheckupFrame1.this);
				boolean didItWork=true;
				
				try {
					String client = student;
					int ourFirst = p1+p2;
					int ourSecond = p3+p4;
					int ourThird = p5+p6;
					
					int ourFourth = p7+p8;
					int ourFifth = p9+p10;
					int ourSixth = p11+p12+p13;
					
					int ourSeventh = p14+p15;
					int ourEighth = p16+p17+p18;
					
	
					entry.open();
					entry.createProbeEntry(client, lesson, ourFirst, ourSecond, ourThird, 
					ourFourth, ourFifth, ourSixth, ourSeventh, ourEighth);
					entry.close();
					} catch (Exception e) {
						didItWork = false;
						} finally {
							if (didItWork) {
								Toast.makeText(getApplicationContext(), "went through fine", Toast.LENGTH_SHORT).show();
							}}
				}
		});		
	}
}
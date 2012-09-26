package com.backwardsblade.daedalus;

import java.util.ArrayList;

import org.achartengine.model.TimeSeries;
import org.achartengine.util.MathHelper;

public class Grapher {

//	private GraphSelector ourGraphSelector;
//	private Context ourContext;
	
//	public void Methods(Context c) {
//			ourContext=c;
//		}

		public static TimeSeries makeSimpleIYArray(ArrayList<Integer> mySimpleIYList) {
		// TODO Auto-generated method stub
		final int[] x = new int[mySimpleIYList.size()];
		final int[] y = new int[mySimpleIYList.size()];
		TimeSeries series = new TimeSeries("I-You");
		
		for (int i = 0; i < mySimpleIYList.size(); i++) {
			if (mySimpleIYList.get(i)==999) {
				y[i] = (int) MathHelper.NULL_VALUE;
			} else {
				y[i] = mySimpleIYList.get(i).intValue();	
			}
				x[i] = i+1;
			}		
		
		for (int i=0; i<mySimpleIYList.size(); i++) {
			if (mySimpleIYList.get(i)==999)
			{ 
				series.add(x[i], MathHelper.NULL_VALUE);		
			} else {
				series.add(x[i], y[i]);				
			}
		}
		return series;}
	
		public static TimeSeries makeSimpleIYArrayDouble(ArrayList<Double> mySimpleIYList) {
		// TODO Auto-generated method stub
		final double[] x = new double[mySimpleIYList.size()];
		final double[] y = new double[mySimpleIYList.size()];
		TimeSeries series = new TimeSeries("I-You");
		
		for (int i = 0; i < mySimpleIYList.size(); i++) {
			if (mySimpleIYList.get(i)>100) {
				y[i] = (int) MathHelper.NULL_VALUE;
			} else {
				y[i] = mySimpleIYList.get(i).intValue();	
			}
				x[i] = i+1;
			}		
		
		for (int i=0; i<mySimpleIYList.size(); i++) {
			if (mySimpleIYList.get(i)>100)
			{ 
				series.add(x[i], MathHelper.NULL_VALUE);		
			} else {
				series.add(x[i], y[i]);				
			}
		}
		return series;}
	
		public static TimeSeries makeSimpleHTArray(ArrayList<Integer> mySimpleIYList) {
			// TODO Auto-generated method stub
			final int[] x = new int[mySimpleIYList.size()];
			final int[] y = new int[mySimpleIYList.size()];
			TimeSeries series = new TimeSeries("Here-There");
			
			for (int i = 0; i < mySimpleIYList.size(); i++) {
				if (mySimpleIYList.get(i)==999) {
					y[i] = (int) MathHelper.NULL_VALUE;
				} else {
					y[i] = mySimpleIYList.get(i).intValue();	
				}
					x[i] = i+1;
				}		
			
			for (int i=0; i<mySimpleIYList.size(); i++) {
				if (mySimpleIYList.get(i)==999)
				{ 
					series.add(x[i], MathHelper.NULL_VALUE);		
				} else {
					series.add(x[i], y[i]);				
				}
			}
			return series;}
		
		public static TimeSeries makeSimpleHTArrayDouble(ArrayList<Double> mySimpleIYList) {
			// TODO Auto-generated method stub
			final double[] x = new double[mySimpleIYList.size()];
			final double[] y = new double[mySimpleIYList.size()];
			TimeSeries series = new TimeSeries("Here-There");
			
			for (int i = 0; i < mySimpleIYList.size(); i++) {
				if (mySimpleIYList.get(i)>100) {
					y[i] = (int) MathHelper.NULL_VALUE;
				} else {
					y[i] = mySimpleIYList.get(i).intValue();	
				}
					x[i] = i+1;
				}		
			
			for (int i=0; i<mySimpleIYList.size(); i++) {
				if (mySimpleIYList.get(i)>100)
				{ 
					series.add(x[i], MathHelper.NULL_VALUE);		
				} else {
					series.add(x[i], y[i]);				
				}
			}
			return series;}
		
		public static TimeSeries makeSimpleNTArray(ArrayList<Integer> mySimpleIYList) {
				// TODO Auto-generated method stub
				final int[] x = new int[mySimpleIYList.size()];
				final int[] y = new int[mySimpleIYList.size()];
				TimeSeries series = new TimeSeries("Now-Then");
				
				for (int i = 0; i < mySimpleIYList.size(); i++) {
					if (mySimpleIYList.get(i)==999) {
						y[i] = (int) MathHelper.NULL_VALUE;
					} else {
						y[i] = mySimpleIYList.get(i).intValue();	
					}
						x[i] = i+1;
					}		
				
				for (int i=0; i<mySimpleIYList.size(); i++) {
					if (mySimpleIYList.get(i)==999)
					{ 
						series.add(x[i], MathHelper.NULL_VALUE);		
					} else {
						series.add(x[i], y[i]);				
					}
				}			
		return series;
	}
			
		public static TimeSeries makeSimpleNTArrayDouble(ArrayList<Double> mySimpleIYList) {
				// TODO Auto-generated method stub
				final double[] x = new double[mySimpleIYList.size()];
				final double[] y = new double[mySimpleIYList.size()];
				TimeSeries series = new TimeSeries("Now-Then");
				
				for (int i = 0; i < mySimpleIYList.size(); i++) {
					if (mySimpleIYList.get(i)>100) {
						y[i] = (int) MathHelper.NULL_VALUE;
					} else {
						y[i] = mySimpleIYList.get(i).intValue();	
					}
						x[i] = i+1;
					}		
				
				for (int i=0; i<mySimpleIYList.size(); i++) {
					if (mySimpleIYList.get(i)>100)
					{ 
						series.add(x[i], MathHelper.NULL_VALUE);		
					} else {
						series.add(x[i], y[i]);				
					}
				}			
		return series;
	}			

		public static TimeSeries makeReversedIYArray( ArrayList<Integer> myReversedIYList) {
		// TODO Auto-generated method stub
		final int[] x = new int[myReversedIYList.size()];
		final int[] y = new int[myReversedIYList.size()];
		TimeSeries series = new TimeSeries("Reversed I-You");
	
		for (int i = 0; i < myReversedIYList.size(); i++) {
	    	y[i] = myReversedIYList.get(i).intValue();
	    	x[i] = i+1;
			}

		for (int i=0; i<myReversedIYList.size(); i++) {
			if (myReversedIYList.get(i)==999) {
				series.add(x[i], MathHelper.NULL_VALUE);
			} else {
				series.add(x[i], y[i]);				
			}
		}
		
		return series;
	}
		
		public static TimeSeries makeReversedIYArrayDouble( ArrayList<Double> myReversedIYList) {
			// TODO Auto-generated method stub
			final double[] x = new double[myReversedIYList.size()];
			final double[] y = new double[myReversedIYList.size()];
			TimeSeries series = new TimeSeries("Reversed I-You");
		
			for (int i = 0; i < myReversedIYList.size(); i++) {
				if (myReversedIYList.get(i)>100) {
					y[i] = (int) MathHelper.NULL_VALUE;					
				} else {
					y[i] = myReversedIYList.get(i).intValue();
				}
					x[i] = i+1;
				}

			for (int i=0; i<myReversedIYList.size(); i++) {
				if (myReversedIYList.get(i)>100) {
					series.add(x[i], MathHelper.NULL_VALUE);
				} else {
					series.add(x[i], y[i]);				
				}
			}
			
			return series;
		}
	
		public static TimeSeries makeReversedHTArray( ArrayList<Integer> myReversedIYList) {
		// TODO Auto-generated method stub
		final int[] x = new int[myReversedIYList.size()];
		final int[] y = new int[myReversedIYList.size()];
		TimeSeries series = new TimeSeries("Reversed Here-There");
	
		for (int i = 0; i < myReversedIYList.size(); i++) {
	    	y[i] = myReversedIYList.get(i).intValue();
	    	x[i] = i+1;
			}

		for (int i=0; i<myReversedIYList.size(); i++) {
			if (myReversedIYList.get(i)==999) {
				series.add(x[i], MathHelper.NULL_VALUE);
			} else {
				series.add(x[i], y[i]);				
			}
		}
		
		return series;
	}
	
		public static TimeSeries makeReversedHTArrayDouble( ArrayList<Double> myReversedHTList) {
		// TODO Auto-generated method stub
		final double[] x = new double[myReversedHTList.size()];
		final double[] y = new double[myReversedHTList.size()];
		TimeSeries series = new TimeSeries("Reversed Here-There");
	
		for (int i = 0; i < myReversedHTList.size(); i++) {
			if (myReversedHTList.get(i)>100) {
				y[i] = (int) MathHelper.NULL_VALUE;					
			} else {
				y[i] = myReversedHTList.get(i).intValue();
			}
				x[i] = i+1;
			}

		for (int i=0; i<myReversedHTList.size(); i++) {
			if (myReversedHTList.get(i)>100) {
				series.add(x[i], MathHelper.NULL_VALUE);
			} else {
				series.add(x[i], y[i]);				
			}
		}
		
		return series;
	}		
		
		public static TimeSeries makeReversedNTArray( ArrayList<Integer> myReversedIYList) {
		// TODO Auto-generated method stub
		final int[] x = new int[myReversedIYList.size()];
		final int[] y = new int[myReversedIYList.size()];
		TimeSeries series = new TimeSeries("Reversed Now-Then");
	
		for (int i = 0; i < myReversedIYList.size(); i++) {
	    	y[i] = myReversedIYList.get(i).intValue();
	    	x[i] = i+1;
			}

		for (int i=0; i<myReversedIYList.size(); i++) {
			if (myReversedIYList.get(i)==999) {
				series.add(x[i], MathHelper.NULL_VALUE);
			} else {
				series.add(x[i], y[i]);				
			}
		}
		
		return series;
	}
				
		public static TimeSeries makeReversedNTArrayDouble( ArrayList<Double> myReversedNTList) {
			// TODO Auto-generated method stub
			final double[] x = new double[myReversedNTList.size()];
			final double[] y = new double[myReversedNTList.size()];
			TimeSeries series = new TimeSeries("Reversed NOW-Then");
		
			for (int i = 0; i < myReversedNTList.size(); i++) {
				if (myReversedNTList.get(i)>100) {
					y[i] = (int) MathHelper.NULL_VALUE;					
				} else {
					y[i] = myReversedNTList.get(i).intValue();
				}
					x[i] = i+1;
				}

			for (int i=0; i<myReversedNTList.size(); i++) {
				if (myReversedNTList.get(i)>100) {
					series.add(x[i], MathHelper.NULL_VALUE);
				} else {
					series.add(x[i], y[i]);				
				}
			}
			
			return series;
		}		

		public static TimeSeries makeDReversedHTArray( ArrayList<Integer> myDReversedHTList) {
		// TODO Auto-generated method stub
		final int[] x7 = new int[myDReversedHTList.size()];
		final int[] y7 = new int[myDReversedHTList.size()];
		TimeSeries series = new TimeSeries("Double Reversed Here-There");
		
		for (int i = 0; i < myDReversedHTList.size(); i++) {
	    	y7[i] = myDReversedHTList.get(i).intValue();
	    	x7[i] = i+1;
			}

		for (int i=0; i<myDReversedHTList.size(); i++) {
			if (myDReversedHTList.get(i)==999) {
				series.add(x7[i], MathHelper.NULL_VALUE);
			} else {
				series.add(x7[i], y7[i]);				
			}
		}
		
		return series;
	}

		public static TimeSeries makeDReversedHTArrayDouble( ArrayList<Double> myDReversedHTList) {
		// TODO Auto-generated method stub
		final double[] x7 = new double[myDReversedHTList.size()];
		final double[] y7 = new double[myDReversedHTList.size()];
		TimeSeries series = new TimeSeries("Double Reversed Here-There");
		
		for (int i = 0; i < myDReversedHTList.size(); i++) {
			if (myDReversedHTList.get(i)>100) {
				y7[i] = (int) MathHelper.NULL_VALUE;
			} else {
				y7[i] = myDReversedHTList.get(i).intValue();
			}
				x7[i] = i+1;			
		}
		for (int i=0; i<myDReversedHTList.size(); i++) {
			if (myDReversedHTList.get(i)>100) {
				series.add(x7[i], MathHelper.NULL_VALUE);
			} else {
				series.add(x7[i], y7[i]);				
			}
		}
		
		return series;
	}		
		
		public static TimeSeries makeDReversedNTArray(
			ArrayList<Integer> myDReversedNTList) {
		// TODO Auto-generated method stub
		final int[] x8 = new int[myDReversedNTList.size()];
		final int[] y8 = new int[myDReversedNTList.size()];
		TimeSeries series = new TimeSeries("Double Reversed Now-Then");
		
		for (int i = 0; i < myDReversedNTList.size(); i++) {
	    	y8[i] = myDReversedNTList.get(i).intValue();
	    	x8[i] = i+1;
			}

		for (int i=0; i<myDReversedNTList.size(); i++) {
			if (myDReversedNTList.get(i)==999) {
				series.add(x8[i], MathHelper.NULL_VALUE);
			} else {
				series.add(x8[i], y8[i]);				
			}
		}

		
		return series;
	}
		
		public static TimeSeries makeDReversedNTArrayDouble(
				ArrayList<Double> myDReversedNTList) {
			// TODO Auto-generated method stub
			final double[] x8 = new double[myDReversedNTList.size()];
			final double[] y8 = new double[myDReversedNTList.size()];
			TimeSeries series = new TimeSeries("Double Reversed Now-Then");
			
			for (int i = 0; i < myDReversedNTList.size(); i++) {
				if (myDReversedNTList.get(i)>100) {
					y8[i] = (int) MathHelper.NULL_VALUE;
				} else {
					y8[i] = myDReversedNTList.get(i).intValue();
				}
					x8[i] = i+1;
				}

			for (int i=0; i<myDReversedNTList.size(); i++) {
				if (myDReversedNTList.get(i)>100) {
					series.add(x8[i], MathHelper.NULL_VALUE);
				} else {
					series.add(x8[i], y8[i]);				
				}
			}
			return series;
		}

		public static TimeSeries computeSimpleOnes(
			ArrayList<Integer> mySimpleIYList,
			ArrayList<Integer> mySimpleHTList, 
			ArrayList<Integer> mySimpleNTList) {

		TimeSeries series = new TimeSeries("Simple Frames");
		
		final int[] x = new int[mySimpleIYList.size()];
		final int[] y = new int[mySimpleIYList.size()];
	
		for (int i = 0; i < mySimpleIYList.size(); i++) {
			if (mySimpleIYList.get(i)==999) {
				y[i] = (int) MathHelper.NULL_VALUE;
			} else {
				y[i] = mySimpleIYList.get(i).intValue();
			}
			x[i] = i+1;
			}
		
		final int[] x2 = new int[mySimpleHTList.size()];
		final int[] y2 = new int[mySimpleHTList.size()];

		for (int i = 0; i < mySimpleHTList.size(); i++) {
			if (mySimpleHTList.get(i)==999) {
				y2[i] = (int) MathHelper.NULL_VALUE;
			} else {
				y2[i] = mySimpleHTList.get(i).intValue();
			}
			x2[i] = i+1;
			}
		
		final int[] x3 = new int[mySimpleNTList.size()];
		final int[] y3 = new int[mySimpleNTList.size()];

		for (int i = 0; i < mySimpleNTList.size(); i++) {
			if (mySimpleIYList.get(i)==999) {
				y2[i] = (int) MathHelper.NULL_VALUE;
			} else {
			y3[i] = mySimpleNTList.get(i).intValue();
			}
			x3[i] = i+1;
			}

		
	// Cooker
		
		for (int i=0; i<mySimpleIYList.size(); i++) {
			if (mySimpleIYList.get(i)==999) {
				series.add(x[i], MathHelper.NULL_VALUE);
			} else {
				double holder = (y[i]+y2[i]+y3[i]);
				series.add(x[i], holder);
		}}

		
		// TODO Auto-generated method stub
		return series;
	}
		
		public static TimeSeries computeSimpleOnesDouble(
				ArrayList<Integer> mySimpleIYList,
				ArrayList<Integer> mySimpleHTList, 
				ArrayList<Integer> mySimpleNTList) {

			TimeSeries series = new TimeSeries("Simple Frames");
			
			final double[] x = new double[mySimpleIYList.size()];
			final double[] y = new double[mySimpleIYList.size()];
		
			for (int i = 0; i < mySimpleIYList.size(); i++) {
				if (mySimpleIYList.get(i)>100) {
					y[i] = (int) MathHelper.NULL_VALUE;
				} else {
					y[i] = mySimpleIYList.get(i).intValue();
				}
				x[i] = i+1;
				}
			
			final double[] x2 = new double[mySimpleHTList.size()];
			final double[] y2 = new double[mySimpleHTList.size()];

			for (int i = 0; i < mySimpleHTList.size(); i++) {
				if (mySimpleHTList.get(i)>100) {
					y2[i] = (int) MathHelper.NULL_VALUE;
				} else {
					y2[i] = mySimpleHTList.get(i).intValue();
				}
				x2[i] = i+1;
				}
			
			final double[] x3 = new double[mySimpleNTList.size()];
			final double[] y3 = new double[mySimpleNTList.size()];

			for (int i = 0; i < mySimpleNTList.size(); i++) {
				if (mySimpleIYList.get(i)>100) {
					y2[i] = (int) MathHelper.NULL_VALUE;
				} else {
				y3[i] = mySimpleNTList.get(i).intValue();
				}
				x3[i] = i+1;
				}
			
		// Cooker
			
			for (int i=0; i<mySimpleIYList.size(); i++) {
				if (mySimpleIYList.get(i)>100) {
					series.add(x[i], MathHelper.NULL_VALUE);
				} else {
					double holder = (double)(((y[i]+y2[i]+y3[i])/12)*100);
					series.add(x[i], holder);
			}}

			
			// TODO Auto-generated method stub
			return series;
		}		
		
		public static TimeSeries computeReversedOnes(
			ArrayList<Integer> myReversedIYList,
			ArrayList<Integer> myReversedHTList,
			ArrayList<Integer> myReversedNTList) {
		// TODO Auto-generated method stub
		
  		final int[] x4 = new int[myReversedIYList.size()];
		final int[] y4 = new int[myReversedIYList.size()];

		TimeSeries series2 = new TimeSeries("Reversed Frames");
		
		for (int i = 0; i < myReversedNTList.size(); i++) {
			if (myReversedIYList.get(i)==999) {
				y4[i] = (int) MathHelper.NULL_VALUE;
			} else {
			y4[i] = myReversedNTList.get(i).intValue();
			}
			x4[i] = i+1;
			}
								
		final int[] x5 = new int[myReversedHTList.size()];
		final int[] y5 = new int[myReversedHTList.size()];

		for (int i = 0; i < myReversedHTList.size(); i++) {
			if (myReversedHTList.get(i)==999) {
				y5[i] = (int) MathHelper.NULL_VALUE;
			} else {
			y5[i] = myReversedHTList.get(i).intValue();
			}
			x5[i] = i+1;
			}
		
		final int[] x6 = new int[myReversedNTList.size()];
		final int[] y6 = new int[myReversedNTList.size()];

		for (int i = 0; i < myReversedNTList.size(); i++) {
			if (myReversedIYList.get(i)==999) {
				y6[i] = (int) MathHelper.NULL_VALUE;
			} else {
			y6[i] = myReversedNTList.get(i).intValue();
			}
			x6[i] = i+1;
			}

		for (int i=0; i<myReversedIYList.size(); i++) {
			if (myReversedIYList.get(i)==999) {
				series2.add(x4[i], MathHelper.NULL_VALUE);
			} else {
				double holder = (y4[i]+y5[i]+y6[i]);
				series2.add(x4[i], holder);
		}}
		
		return series2;
	}
		
		public static TimeSeries computeReversedOnesDouble(
				ArrayList<Integer> myReversedIYList,
				ArrayList<Integer> myReversedHTList,
				ArrayList<Integer> myReversedNTList) {
			// TODO Auto-generated method stub
			
	  		final double[] x4 = new double[myReversedIYList.size()];
			final double[] y4 = new double[myReversedIYList.size()];

			TimeSeries series2 = new TimeSeries("Reversed Frames");
			
			for (int i = 0; i < myReversedIYList.size(); i++) {
				if (myReversedIYList.get(i)>100) {
					y4[i] = (int) MathHelper.NULL_VALUE;
				} else {
				y4[i] = myReversedIYList.get(i).intValue();
				}
				x4[i] = i+1;
				}
									
			final double[] x5 = new double[myReversedHTList.size()];
			final double[] y5 = new double[myReversedHTList.size()];

			for (int i = 0; i < myReversedHTList.size(); i++) {
				if (myReversedHTList.get(i)>100) {
					y5[i] = (int) MathHelper.NULL_VALUE;
				} else {
				y5[i] = myReversedHTList.get(i).intValue();
				}
				x5[i] = i+1;
				}
			
			final double[] x6 = new double[myReversedNTList.size()];
			final double[] y6 = new double[myReversedNTList.size()];

			for (int i = 0; i < myReversedNTList.size(); i++) {
				if (myReversedNTList.get(i)>100) {
					y6[i] = (int) MathHelper.NULL_VALUE;
				} else {
				y6[i] = myReversedNTList.get(i).intValue();
				}
				x6[i] = i+1;
				}

			for (int i=0; i<myReversedIYList.size(); i++) {
				if (myReversedIYList.get(i)>100) {
					series2.add(x4[i], MathHelper.NULL_VALUE);
				} else {
					double holder = (double)(((y4[i]+y5[i]+y6[i])/14)*100);
					series2.add(x4[i], holder);
			}}
			
			return series2;
		}

		public static TimeSeries computeDReverseOnes(
			ArrayList<Integer> myDReversedHTList,
			ArrayList<Integer> myDReversedNTList) {
		// TODO Auto-generated method stub
		final int[] x7 = new int[myDReversedHTList.size()];
		final int[] y7 = new int[myDReversedHTList.size()];
		TimeSeries series3 = new TimeSeries("Double Reversed Frames");
		
		for (int i = 0; i < myDReversedHTList.size(); i++) {
			if (myDReversedHTList.get(i)==999) {
				y7[i] = (int) MathHelper.NULL_VALUE;
			} else {
				y7[i] = myDReversedHTList.get(i).intValue();
			}
				x7[i] = i+1;
			}
		
		final int[] x8 = new int[myDReversedNTList.size()];
		final int[] y8 = new int[myDReversedNTList.size()];

		for (int i = 0; i < myDReversedNTList.size(); i++) {
			if (myDReversedNTList.get(i)==999) {
				y8[i] = (int) MathHelper.NULL_VALUE;
			} else {
				y8[i] = myDReversedNTList.get(i).intValue();
			}
				x8[i] = i+1;
			}
			
		for (int i=0; i<myDReversedHTList.size(); i++) {
			if (myDReversedHTList.get(i)==999) {
				series3.add(x7[i], MathHelper.NULL_VALUE);
			} else {
				double holder = (y7[i]+y8[i]);
				series3.add(x7[i], holder);
		}}
		
		return series3;
	}
		
		public static TimeSeries computeDReverseOnesDouble(
				ArrayList<Integer> myDReversedHTList,
				ArrayList<Integer> myDReversedNTList) {
			// TODO Auto-generated method stub
			final double[] x7 = new double[myDReversedHTList.size()];
			final double[] y7 = new double[myDReversedHTList.size()];
			TimeSeries series3 = new TimeSeries("Double Reversed Frames");
			
			for (int i = 0; i < myDReversedHTList.size(); i++) {
				if (myDReversedHTList.get(i)>100) {
					y7[i] = (int) MathHelper.NULL_VALUE;
				} else {
					y7[i] = myDReversedHTList.get(i).intValue();
				}
					x7[i] = i+1;
				}
			
			final int[] x8 = new int[myDReversedNTList.size()];
			final int[] y8 = new int[myDReversedNTList.size()];

			for (int i = 0; i < myDReversedNTList.size(); i++) {
				if (myDReversedNTList.get(i)>100) {
					y8[i] = (int) MathHelper.NULL_VALUE;
				} else {
					y8[i] = myDReversedNTList.get(i).intValue();
				}
					x8[i] = i+1;
				}
				
			for (int i=0; i<myDReversedHTList.size(); i++) {
				if (myDReversedHTList.get(i)>100) {
					series3.add(x7[i], MathHelper.NULL_VALUE);
				} else {
					double holder = (double)(((y7[i]+y8[i])/10)*100);
					series3.add(x7[i], holder);
			}}
			
			return series3;
		}
}
	

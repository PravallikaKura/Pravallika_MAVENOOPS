package com.epam.NewYear;


	public class sweets {
		int cost;
		int weight;
		int num;
		sweets(int wt,int c,int n){
			this.cost =c;
			this.num = n;
			this.weight= wt;
			
		}
		
		public String convert() {
			return "Cost = " + this.cost + "Weight = "+ this.weight + "Number = "+ this.num;
		}

	}
	
	
	
	


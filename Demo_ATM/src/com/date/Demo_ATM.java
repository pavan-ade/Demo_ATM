package com.date;

import java.util.Scanner;

public class Demo_ATM {
	public static void printLogic(int Balance,int wd,int dep) {
		int choice,acc=1092384534,acc2,acc3,opp;
		boolean conf=true;
		String pin="1234",pin1,pin2,pin3,name="Pavan",name3,name2;
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Options: ");
		System.out.println("1) Withdrawal ");
		System.out.println("2) Deposite ");
		System.out.println("3) Balance ");
		System.out.println("4) Fast Cash ");
		System.out.println("5) ATM pin change ");
		System.out.println("6) Acc Transtraction");
		System.out.println("7) Exit(Select out of Options)\n");
		System.out.println("Enter your Choice ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:  
			 System.out.println("Enter your amount : ");
		  	 wd=sc.nextInt();			 
		  	 	 if(wd <= Balance) {				 
		  	 		 Balance -= wd;
					 System.out.println("Collect your money "+wd);
				  }else {
					 System.out.println("Infulence Balance!");
				  } System.out.println("Do you wanna perform Again true/false");
				    conf=sc.nextBoolean(); 
		      if(conf == true) {
		    		printLogic(Balance, wd, dep);
		      } else{System.out.println("Invalid Entered "); 
		       } break;
			 
		case 2: 
				 System.out.println("Enter your account num (1092384534) ");
				 acc2=sc.nextInt();
				 if(acc2==acc) {
				 		System.out.println("Enter your amount ");
				 		dep=sc.nextInt();
				 		Balance += dep;
				 		System.out.println("Your Money has been successfully depsited\n");
				 }
				        System.out.println("Do you wanna perform Again true/false");
				      conf=sc.nextBoolean(); 
		      if(conf == true) {
		    		printLogic(Balance, wd, dep);
		      } else{System.out.println("Invalid Entered "); 
		      } break;
				
		case 3: 
				  System.out.println("Balance : "+Balance);
				  System.out.println("Do you wanna perform Again true/false");
				    conf=sc.nextBoolean(); 
	    	 if(conf == true) {
	    		printLogic(Balance, wd, dep);
	    	 } else{System.out.println("Invalid Entered "); 
	    	 } break;						
		case 4: 
			      System.out.println("Option : ");
				  System.out.println("1) 100");
				  System.out.println("2) 500");

				  System.out.println("Enter your option \n");
				  opp=sc.nextInt();
				  if(100 <= Balance && 500 <= Balance) {
				 	if(opp == 1) {
				 		Balance -= 100;
				 		System.out.println("Collect your money 100");
				 	 }else if(opp == 2) {
						Balance -= 500;
						System.out.println("Collect your money 500");
				 	 }else {
						System.out.println("Invalid Details entered check it again!!!!");
				 	 }	
				  }else{ 
					  System.out.println("Infulence Balance!");
				  }
				  System.out.println("Do you wanna perform Again true/false");
					    conf=sc.nextBoolean(); 
			     if(conf == true) {
			    		printLogic(Balance, wd, dep);
			     }	else{System.out.println("Invalid Entered "); 
		         }  break;		 		
		case 5:  		
		   	  	System.out.println("Enter your old pin");
		   	  	pin1=sc.next();
		   	  	System.out.println("Enter your new pin");
		   	  	pin2=sc.next();
		   	  	System.out.println("Entr your conform pin");
		   	  	pin3=sc.next();
		 			if(pin.equals(pin1) && pin2.equals(pin3)) {
		 				pin = pin2;
		 				System.out.println("Succusfully Changed ");
		 			}else {
		 				System.out.println("Invalid Details entered check it again!!!!");
		 			} System.out.println("Do you wanna perform Again true/false");
				      conf=sc.nextBoolean(); 
			     if(conf == true) {
			    		printLogic(Balance, wd, dep);
			    } else{System.out.println("Invalid Entered"); 
			    } break;		 			
		case 6 : 
			    System.out.println("Enter your acc no(1092384534) ?");
			    acc2=sc.nextInt();
			    System.out.println("Enter your name (Pavan)?");
			    name2=sc.next();
			    if((acc==acc2)&&(name.equals(name2))) {
			    	sc.nextLine();
			    	System.out.println("To \nonwer name : ");
			    	name3=sc.nextLine();
			    	System.out.println("Account number : ");
			    	acc3=sc.nextInt();
			    	System.out.println("Enter your amount: ");
			    	wd=sc.nextInt();
			    if(wd <= Balance) {
			    	Balance -= wd;
			    	System.out.println("succussfully completed your transation..");
			    	System.out.println("Sender Details: ");
			    	System.out.println("name 	: "+name2);
			    	System.out.println("Acc no  : "+acc2);
			    	System.out.println("\nReaciver Details: ");
			    	System.out.println("name 	: "+name3);
			    	System.out.println("Acc no  : "+acc3);
			    	System.out.println("Debited amount : "+wd);	
			    }else {
			    		System.out.println("Infulence Balance!");
			    	}
			    }else {
			    	System.out.println("Invalid Details entered check it again!!!!");
			    }   System.out.println("Do you wanna perform Again true/false");
			        conf=sc.nextBoolean(); 
			     if(conf == true) {
			    		printLogic(Balance, wd, dep);
			     }else {
			    	 System.out.println("Invalid entered!");
			     }
			    	
		   break;
		default: 
			break;
			
		}sc.close();	
	}
	public static void main(String[] args) {
		boolean conf;
		String pin="1234",pin2;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nWELCOME TO ATM");
		System.out.println("--------------\n");
		System.out.println("Plese Insert your Card ...true/false");
		conf=sc.nextBoolean();
		if(conf == true) {
			 System.out.println("Enter your pin(1234) ");
			 pin2=sc.next();
			if(pin.equals(pin2)) {
			printLogic(1000, 0, 0);
			}
		}
		System.out.println("\nTHANK YOU FOR VISITING \n");
		System.out.println("HAVE A NICE DAY ");
		sc.close();
		}
}

package filesPAckage;

import java.util.Scanner;

class Operations{
	
	double airtime_bal,amount;
	int choice,rec_Num,pinc,paybil,metre,metre1,bank_acc,till,new_pin,new_pinc,bank_pinc,agent,atm_Num;
	Scanner scan = new Scanner(System.in);
	int pin = 2222;
	double balance = 2000;
	int my_bank = 1260486766;
	int bank_pin = 3333;
	int my_Num = 711223344;
	double bank_bal = 3000;
	
	public void buy_Airtime() {	
		System.out.println("\n***** BUY AIRTIME options *****\n1.Own number\n2.Other number\n3.Phone book\n");
			choice = validInt(scan,"Enter choice here: ");
			if(choice==1) {
				amount=validDouble(scan,"Enter top up amount: ");
				pinc = validInt(scan,"Enter pin: ");
					if(pinc==pin) {
						if(amount>balance) {
							System.out.println("Insufficient funds! Your account balance is "+balance+"\n");
						}
						else {
						airtime_bal +=amount;
						balance -= amount;
						System.out.println("Top up of "+amount+" was successful. New airtime balance is "+ airtime_bal+" New account balance is "+ balance+"\n");
						}
					}
					else {
						System.out.println("Wrong pin\n");
						}
				}
				else if(choice==2) {
					rec_Num = validInt(scan,"Enter the recipient number: ");
					amount=validDouble(scan,"Enter amount: ");
					pinc = validInt(scan,"Enter pin: ");
					if(pinc==pin) {
						if(amount>balance) {
							System.out.println("Insufficient funds! Your account balance is "+balance+"\n");
						}
						else {
						airtime_bal +=amount;
						balance -= amount;
						System.out.println("Artime purchase of"+amount+ " for "+rec_Num+" was successful\n");
						}
					}
					else {
						System.out.println("Wrong pin\n");
						}
					
				}
				else {
					System.out.println("invalid choice\n");
				}
	}
	
	public void make_Payments() {
		System.out.println("\n*****Make payments options *****\n1.Paybill\n2.Buy Goods and Services\n");
		choice = validInt(scan,"Enter your choice: ");
		switch(choice) {
			case 1:
				System.out.println("Pay bill to Airtel Paybills & Rudishiwa 50% of Transaction fees as Airtime.\n\n1.Airtel Paybill\n2.Mpesa Paybill\n");
				choice = validInt(scan,"Enter your choice here: ");
				switch(choice) {
					case 1:
						System.out.println("1.ENter Business Number\n2.KPLC\n3.Airtel Post Paid\n4.Banking\n5.Water\n");
						choice = validInt(scan,"Enter the merchant option: ");
						switch(choice) {
							case 1:
								paybil = validInt(scan,"Enter airtel money paybill number: ");
								amount = validDouble(scan,"Enter the amount to pay: ");
								pinc = validInt(scan,"Enter Pin: ");
								if(pinc==pin) {
									if(amount>balance) {
										System.out.println("Insufficient funds your account balance is "+balance);
									}
									else {
										balance -= amount;
										System.out.println("Payment of "+amount+" to "+paybil+" was successful. New Account balance is "+balance+"\n");	
										}
									}
								else {
										System.out.println("Incorrect pin.\n");
									}
								break;
							case 2:
								System.out.println("1.KPLC Prepaid\n2.KPLC Postpaid\n");
								choice = validInt(scan,"Enter your choice: ");
								switch(choice) {
									case 1:
										metre = validInt(scan, "Enter metre number: ");
										amount = validDouble(scan,"Enter amount: ");
										pinc = validInt(scan,"Enter pin: ");
										if(pinc==pin) {
											if(amount>balance) {
												System.out.println("Insufficient funds! Your account balance is "+balance+"\n");
											}
											else {
												balance -= amount;
												System.out.println("Token payment of "+amount+" to your prepaid metre account "+metre+"\n was successful. New account balance is "+balance+"\n");
											}
										}
										else {
											System.out.println("Wrong pin!!\n");
										}
										break;
									case 2:
										metre1 = validInt(scan, "Enter metre number: ");
										amount = validDouble(scan,"Enter amount: ");
										pinc = validInt(scan,"Enter pin: ");
										if(pinc==pin) {
											if(amount>balance) {
												System.out.println("Insufficient funds! Your account balance is "+balance+"\n");
											}
											else {
												balance -= amount;
												System.out.println("Token payment of "+amount+" to your postpaid metre account "+metre1+"\n was successful. New account balance is "+balance+"\n");
											}
										}
										else {
											System.out.println("Wrong pin!!\n");
										}
										break;
									default:
											System.out.println("Invalid choice!\n");
									}
								break;
							case 3:
								System.out.println("Welcome to Airtel Post Paid Customer service");
								rec_Num = validInt(scan,"Enter recipient Number being paid for: ");
								amount = validDouble(scan,"Enter amount to pay: ");
								pinc = validInt(scan,"Enter pin: ");
								if(pinc==pin) {
									if(amount>balance) {
										System.out.println("Insufficient funds!\n");
									}
									else {
										balance -= amount;
										System.out.println("Payment of "+amount+" to "+rec_Num+" was succeeeful. New account balance is "+balance+"\n");
									}
								}
								else {
									System.out.println("Wrong pin!!!\n");
								}
								break;
							case 4:
								System.out.println("Banking options Select your bank");
								System.out.println("1.Equity\n2.KCB\n3.DTB\n4.IM Bank\n5.MAISHABANK\n");
								choice = validInt(scan,"Choose your bank: ");
								switch(choice){
									case 1:
										bank_acc = validInt(scan,"Enter equity bank account number: ");
										amount = validDouble(scan,"ENter amount to transfer: ");
										pinc = validInt(scan,"Enter pin: ");
										if(pinc==pin) {
											if(amount>balance) {
												System.out.println("Insufficient funds!!\n");
											}
											else {
												balance -= amount;
												System.out.println("Payment of "+amount+" to Equity account number "+bank_acc+" was successful. New balance is "+balance+"\n");
											}
										}
										else {
											System.out.println("Invalid pin!!!\n");
										}
										break;
									case 2:
										bank_acc = validInt(scan,"Enter KCB bank account number: ");
										amount = validDouble(scan,"ENter amount to transfer: ");
										pinc = validInt(scan,"Enter pin: ");
										if(pinc==pin) {
											if(amount>balance) {
												System.out.println("Insufficient funds!!\n");
											}
											else {
												balance -= amount;
												System.out.println("Payment of "+amount+" to KCB account number "+bank_acc+" was successful. New balance is "+balance+"\n");
											}
										}
										else {
											System.out.println("Invalid pin!!!\n");
										}
										break;
									case 3:
										bank_acc = validInt(scan,"Enter DTB bank account number: ");
										amount = validDouble(scan,"ENter amount to transfer: ");
										pinc = validInt(scan,"Enter pin: ");
										if(pinc==pin) {
											if(amount>balance) {
												System.out.println("Insufficient funds!!\n");
											}
											else {
												balance -= amount;
												System.out.println("Payment of "+amount+" to DTB account number "+bank_acc+" was successful. New balance is "+balance+"\n");
											}
										}
										else {
											System.out.println("Invalid pin!!!\n");
										}
										break;
									case 4:
										bank_acc = validInt(scan,"Enter IM bank account number: ");
										amount = validDouble(scan,"ENter amount to transfer: ");
										pinc = validInt(scan,"Enter pin: ");
										if(pinc==pin) {
											if(amount>balance) {
												System.out.println("Insufficient funds!!");
											}
											else {
												balance -= amount;
												System.out.println("Payment of "+amount+" to IM bank account number "+bank_acc+" was successful. New balance is "+balance+"\n");
											}
										}
										else {
											System.out.println("Invalid pin!!!\n");
										}
										break;
									case 5:
										bank_acc = validInt(scan,"Enter MAISHABANK account number: ");
										amount = validDouble(scan,"ENter amount to transfer: ");
										pinc = validInt(scan,"Enter pin: ");
										if(pinc==pin) {
											if(amount>balance) {
												System.out.println("Insufficient funds!!");
											}
											else {
												balance -= amount;
												System.out.println("Payment of "+amount+" to MAISHABANK account number "+bank_acc+" was successful. New balance is "+balance+"\n");
											}
										}
										else {
											System.out.println("Invalid pin!!!\n");
										}
										break;
									default:{
										System.out.println("INvalid choice!!!\n");
										break;
									}
								}
								break;
							case 5:
								System.out.println("1.Mombasa Water\n2.Nairobi Water");
								choice = validInt(scan,"ENter an option: ");
								switch(choice) {
									case 1:
										 metre = validInt(scan,"Enter account Number: ");
										 amount = validDouble(scan,"Enter amount: ");
										 pinc = validInt(scan,"Enter pin: ");
										 if(pinc==pin) {
											 if(amount>balance) {
												 System.out.println("Insufficient funds!!\n");
											 }
											 else {
												 balance -= amount;
												 System.out.println("Water bill payment of "+amount+" to Mombasa Water service account Number "+metre+" was successful.\nNew account balance is "+balance+"\n");
											 }
										 }
										 else {
											 System.out.println("Wrong pin!!!\n");
										 }
										 break;
									case 2:
										metre = validInt(scan,"Enter account Number: ");
										 amount = validDouble(scan,"Enter amount: ");
										 pinc = validInt(scan,"Enter pin: ");
										 if(pinc==pin) {
											 if(amount>balance) {
												 System.out.println("Insufficient funds!!\n");
											 }
											 else {
												 balance -= amount;
												 System.out.println("Water bill payment of "+amount+" to Nairobi Water service account Number "+metre+" was successful.\nNew account balance is "+balance+"\n");
											 }
										 }
										 else {
											 System.out.println("Wrong pin!!!\n");
										 }
										 break;
									default:
										System.out.println("INvalid input!\n");
										break;
								}
							default:
								System.out.println("Invalid Input!!\n");
								break;
						}
					break;
					case 2:
						paybil = validInt(scan,"Enter Paybill Number: ");
						amount = validDouble(scan,"ENter amount: ");
						pinc = validInt(scan,"ENter pin: ");
						if(pinc==pin) {
							if(amount>balance) {
								System.out.println("Insufficient funds!\n");
							}
							else {
								balance -=amount;
								System.out.println("Payment of "+amount+" to MPESA Paybill Number "+paybil+" wa ssuccessful. New balance is "+balance+"\n");
							}
						}
						else {
							System.out.println("Invalid pin!!\n");
						}
						break;
					default:
						System.out.println("Invalid input\n");
				}	
			break;
			case 2:
				System.out.println("1.Airtel Money Till\n2.Mpesa Till");
				choice = validInt(scan,"Enter choice: ");
				switch(choice) {
					case 1:
						System.out.println("1.Till NUmber\n2.Favourites");
						choice = validInt(scan,"enter your Choice: ");
						switch(choice) {
							case 1:
								till = validInt(scan,"enter till number: ");
								amount = validDouble(scan,"Enter amount: ");
								pinc = validInt(scan,"eNTER PIN: ");
								if(pinc==pin){
									if(amount>balance) {
										System.out.println("Not enough funds:!\n");
									}
									else {
										balance -= amount;
										System.out.println("Payment of "+amount+" to AIrtel Money Till "+till+" was successful. New balance is "+balance+"\n");
									}
								}
								else {
									System.out.println("Wrong pin!\n");
								}
								break;
							case 2:
								System.out.println("STill under construction. We appologise!!!\n");
								break;
							default:
								System.out.println("Invalid Choice\n");
								break;
						}
						break;
					case 2:
						till = validInt(scan,"Enter MPESA till: ");
						amount = validDouble(scan,"Enter amount: ");
						pinc = validInt(scan,"eNTER PIN: ");
						if(pinc==pin){
							if(amount>balance) {
								System.out.println("Not enough funds:!\n");
							}
							else {
								balance -= amount;
								System.out.println("Payment of "+amount+" to MPESA Till "+till+" was successful. New balance is "+balance+"\n");
							}
						}
						else {
							System.out.println("Wrong pin!\n");
						}
						break;
					default:
						System.out.println("INvalid Entry\n");
						break;
				}
			break;
			default:
				System.out.println("Not a valid options from paybill/ tillpayments\n");
				break;
			}	
	}
	
	public void my_Account() {
		System.out.println("\n***** Account Options *****\n1.BAlance\n2.Change pin\n3.REports");
		choice = validInt(scan,"Enter choice below");
		switch(choice) {
			case 1:
				System.out.println("Your Airtel Money Balance is "+balance+"\n");
			break;
			case 2:
				new_pin = validInt(scan,"Enter the new pin: ");
				new_pinc = validInt(scan,"Confirm new pin: ");
				if(new_pin==new_pinc) {
					pin = new_pin;
					System.out.println("PIN changed successfully. New pin is "+pin+"\n");
				}
				else {
					System.out.println("Pin doesn't match\n");
				}
			break;
			case 3:
				System.out.println("Transactions report is under maintaenance\n");
			break;
			default:
				System.out.println("Invalid choice!\n");
				break;
		}
	}
	public void bank_Service() {
		System.out.println("\n***** Choose your banking option *****\n1.From Airtel Money Account\n2.From Bank Account\n3.Bank Balance\n4.Bank Statement\n5.Bank INFO\n");
		choice = validInt(scan,"Enter choice: ");
		switch(choice) {
			case 1: 
				System.out.println("1.To own Bank Account\n2.To Other bank account\n");
				choice = validInt(scan,"Enter choice: ");
				switch(choice) {
					case 1:
						amount = validDouble(scan,"Enter amount: ");
						pinc = validInt(scan,"Enter pin: ");
						if(pinc==pin){
							if(amount>balance) {
								System.out.println("Not enough funds:!\n");
							}
							else {
								balance -= amount;
								bank_bal +=amount;
								System.out.println("Transfer of "+amount+" to your bank account "+my_bank+" was successful. New balance is "+balance+"\n");
								System.out.println("Transfer of KSHS "+amount+" from mobile account "+my_Num+" was successfl! New Bank balance is "+bank_bal+"\n");
							}
						}
						else {
							System.out.println("Wrong pin!\n");
						}
					break;
					case 2:
						bank_acc = validInt(scan,"Enter recipient account number: ");
						amount = validDouble(scan,"Enter amount: ");
						pinc = validInt(scan,"Enter pin: ");
						if(pinc==pin){
							if(amount>balance) {
								System.out.println("Not enough funds:!\n");
							}
							else {
								balance -= amount;
								System.out.println("Transfer of "+amount+" to "+bank_acc+" was successful. New balance is "+balance+"\n");
							}
						}
						else {
							System.out.println("Wrong pin!\n");
						}
					break;
					default:
						System.out.println("Not a valid choice\n");
						break;
						
					}
			break;
			case 2:
				System.out.println("1.To my Airtel Money account\n2.To Another bank account\n3.To another Mobile Wallet\n");
				choice = validInt(scan,"EMter choice here: ");
				switch(choice) {
				case 1:
					amount = validDouble(scan,"Enter amount: ");
					bank_pinc = validInt(scan,"Enter pin: ");
					if(bank_pinc==bank_pin){
						if(amount>bank_bal) {
							System.out.println("Not enough funds:!\n");
						}
						else {
							bank_bal -= amount;
							balance += amount;
							System.out.println("Transfer of "+amount+" to your Airtel Money account "+my_Num+" was successful. New Bank balance is "+bank_bal+"\n");
							System.out.println("Transfer of KSH "+amount+" from your bank account was successful.New Airtel money balance is "+balance+"\n");
						}
					}
					else {
						System.out.println("Wrong pin!\n");
					}
				break;
				case 2:
					bank_acc = validInt(scan,"Enter recipient account number: ");
					amount = validDouble(scan,"Enter amount: ");
					bank_pinc = validInt(scan,"Enter pin: ");
					if(bank_pinc==bank_pin){
						if(amount>bank_bal) {
							System.out.println("Not enough funds:!\n");
						}
						else {
							bank_bal -= amount;
							System.out.println("Transfer of "+amount+" to "+bank_acc+" was successful. New Bank balance is "+bank_bal+"\n");
						}
					}
					else {
						System.out.println("Wrong pin!\n");
					}
				break;
				case 3:
					rec_Num = validInt(scan,"Enter the recipient phone Number");
					amount = validDouble(scan,"Enter amount: ");
					bank_pinc = validInt(scan,"Enter pin: ");
					if(bank_pinc==bank_pin){
						if(amount>bank_bal) {
							System.out.println("Not enough funds:!\n");
						}
						else {
							bank_bal -= amount;
							System.out.println("Transfer of "+amount+" to "+rec_Num+" was successful. New Bank balance is "+bank_bal+"\n");
						}
					}
					else {
						System.out.println("Wrong pin!\n");
					}
				break;
				default:
					System.out.println("Not a valid choice\n");
					break;
					
				}
			break;
			case 3:
				System.out.println("Your bank balance is "+bank_bal+"\n");
			break;
			case 4: 
				System.out.println("Coming soon\n");
			break;
			case 5: 
				System.out.println("Your account number is "+my_bank+" And your bank balance is "+bank_bal+"\nWould you like to change your bank pin??? '1.Yes'  '2.No'\n");
				choice = validInt(scan,"Enter '1' to change pin or '2' to quit");
					if(choice==1) {
						new_pin = validInt(scan,"Enter Your new bank pin: ");
						new_pinc = validInt(scan,"Confirm your new pin: ");
						if(new_pin==new_pinc) {
							bank_pin = new_pin;
							System.out.println("Bank pin changed successfully> New pin is "+bank_pin+"\n");
						}
						else {
							System.out.println("PIn doesnt match!!!!!!!!\n");
						}
					}
					else {
						System.out.println("QUITing....\n");
					}
			break;
			default:
				System.out.println("Not a valid choice!!\n");
			break;
		}
	}
	
	public void withdraw() {
		System.out.println("\n***** Withdrawal Options *****\n1.From Agent\n2.From ATM\n");
		choice =validInt(scan,"Choose from the options: ");
		switch(choice) {
			case 1: 
				agent = validInt(scan,"Enter agent Number: ");
				amount = validDouble(scan,"Enter withdrawal Amount: ");
				pinc = validInt(scan,"Enter airtel money pin: ");
				if(pinc==pin){
					if(amount>balance) {
						System.out.println("Not enough funds:!");
					}
					else {
						balance -= amount;
						System.out.println("Withdrawalr of "+amount+" was successful. New Airtel money balance is "+balance+"\n");
					}
				}
				else {
					System.out.println("Wrong pin!\n");
				}
			break;
			case 2: 
				System.out.println("1.Pesa point\n2.Family bank\n");
				choice =validInt(scan,"Choose from the options: ");
				switch(choice) {
					case 1: 
						agent = validInt(scan,"Enter PESA POINT atm Number: ");
						amount = validDouble(scan,"Enter withdrawal Amount: ");
						pinc = validInt(scan,"Enter airtel money pin: ");
						if(pinc==pin){
							if(amount>balance) {
								System.out.println("Not enough funds:\n");
							}
							else {
								balance -= amount;
								System.out.println("Withdrawalr of "+amount+" from PESA POINT ATM "+agent+" was successful. New Airtel money balance is "+balance+"\n");
							}
						}
						else {
							System.out.println("Wrong pin!\n");
						}
					break;
					case 2: 
						agent = validInt(scan,"Enter FAMILY BANKT atm Number: ");
						amount = validDouble(scan,"Enter withdrawal Amount: ");
						pinc = validInt(scan,"Enter airtel money pin: ");
						if(pinc==pin){
							if(amount>balance) {
								System.out.println("Not enough funds:!\n");
							}
							else {
								balance -= amount;
								System.out.println("Withdrawalr of "+amount+" from FAMILY bank ATM "+agent+" was successful. New Airtel money balance is "+balance+"\n");
							}
						}
						else {
							System.out.println("Wrong pin!\n");
						}
					break;
					default:
						System.out.println("INvalid option please choose pesa point or family bank\n");
					}
				break;
			default: 
				System.out.println("Invalid option please choose between agent or ATM withdrawalk\n");
			break;
			}
	}
	
	public void send_Money() {
		System.out.println("\n***** SEND MONEY options *****\n1.Send to Airtel Money \n2.Send to M-Pesa\n");
		choice =validInt(scan,"Choose from the options: ");
		switch(choice) {
			case 1: 
				rec_Num = validInt(scan,"Enter recipient phone Number: ");
				amount = validDouble(scan,"Enter Amount to send to Airtel Money: ");
				pinc = validInt(scan,"Enter airtel money pin: ");
				if(pinc==pin){
					if(amount>balance) {
						System.out.println("Not enough funds:!\n");
					}
					else {
						balance -= amount;
						System.out.println("Transaction of "+amount+" to "+rec_Num+" was successful. New Airtel money balance is "+balance+"\n");
					}
				}
				else {
					System.out.println("Wrong pin!\n");
				}
			break;
			case 2: 
				rec_Num = validInt(scan,"Enter M-pesa phone  Number: ");
				amount = validDouble(scan,"Enter Transaction Amount: ");
				pinc = validInt(scan,"Enter airtel money pin: ");
				if(pinc==pin){
					if(amount>balance) {
						System.out.println("Not enough funds:!\n");
					}
					else {
						balance -= amount;
						System.out.println("Transaction of "+amount+" to M-Pesa number "+rec_Num+" was successful. New Airtel money balance is "+balance+"\n");
					}
				}
				else {
					System.out.println("Wrong pin!\n");
				}
			break;
		default:
			System.out.println("INvalid option please choose pesa point or family bank\n");
		break;
			}
	}
	
	public void start() {
		Operations op = new Operations();
		System.out.println("***** WELCOME TO AIRTEL MONEY EMULATOR ***** \n1.Buy Airtime\n2.Send Money \n3.Withdraw \n4.Make Payments \n5.Bank Services \n6.MY Account");
		choice = validInt(scan,"Enter your choice: ");
		switch(choice) {
			case 1:op.buy_Airtime();break;
			case 2:send_Money();break;
			case 3:op.withdraw();break;
			case 4:op.make_Payments();break;
			case 5:op.bank_Service();break;
			case 6:op.my_Account();break;
			default:System.out.println("Invalid choice");break;
		}
	}
	
	int validInt(Scanner sc,String prompt) {
		int choose = 0;
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextInt()) {
				choose = sc.nextInt();
				//sc.next();
				break;
				//sc.next();
				
			}
			else {
				System.out.println("Invalid Input\n");
				sc.next();
			}
		}
		return choose;
	}
	
	double validDouble(Scanner sc,String prompt){
		double dub;
		while(true) {
			System.out.print(prompt);
			if(sc.hasNextDouble()) {
				dub = sc.nextDouble();
				break;
			}
			else {
				System.out.println("Enter a valid amount!\n");
				sc.next();
			}
		}
		return dub;
	}	
	
}




public class MobileMoneyEmulator {
	public static void main(String[] args) {
		while(true) {
			Operations play = new Operations();
			play.start();
		}
	}
}

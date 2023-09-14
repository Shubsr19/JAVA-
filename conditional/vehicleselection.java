package conditional;


import java.util.*;
public class vehicleselection {
	public static void main(String[] args) {
		System.out.println("-----------------WELCOME TO SHOWROOM-----------------");
		System.out.println("1. 4 VEHILER");
		System.out.println("2. 2 VEHILER");
		Scanner scanner = new Scanner(System.in);
		System.out.print("SELECT THE VEHICLE :-");
		int select=scanner.nextInt();
		if(select==1) {
			System.out.println(" --------YOU SELECTED 4 VEHILER--------");
			System.out.println("SELECT BRAND ");
			System.out.println(" 1- TATA");
			System.out.println(" 2- MAHINDRA");
			System.out.print(" ENTER YOUR SELECTION NO. -");
			int select_4V=scanner.nextInt();
			if(select_4V==1) {
				System.out.println("----- WELCOME TO TATAMOTORS-----");
				System.out.println("SELECT CAR TYPE");
				System.out.println("1 SUV");
				System.out.println("2 SEDAN");
				System.out.print("ENTER YOUR CHOISE NO -");
				int select_TATA=scanner.nextInt();
				if(select_TATA==1) {
					System.out.println("---- SUV MODEL-----");
					System.out.println("1. NEXON");
					System.out.println("2. SAFARI");
					System.out.println("3. HARIOR");
					System.out.println("4. PUNCH");
					System.out.print("ENTER YOUR CHOISE NO -");
					int select_suv=scanner.nextInt();
					switch (select_suv) {
					 case 1:
						System.out.println("-----NEXON------");
						System.out.println("AVAIABLE COLOUR- blue,red,orange");
						System.out.println("MILAGE- 13/KMPH");
						System.out.println("TANK TYPE- PETROL/DISEAL");
						System.out.println("ENGINE HP- 120");
						System.out.println("PRICE RANGE - RS 8,00,000 - RS 12,00,000");
						break;
					 case 2:
							System.out.println("-----SAFARI------");
							System.out.println("AVAIABLE COLOUR- blue,red,orange");
							System.out.println("MILAGE- 12/KMPH");
							System.out.println("TANK TYPE- DISEAL");
							System.out.println("ENGINE HP- 135");
							System.out.println("PRICE RANGE - RS 16,00,000 - RS 20,00,000");
							break;
					 case 3:
							System.out.println("-----HARIOR------");
							System.out.println("AVAIABLE COLOUR- blue,red,orange");
							System.out.println("MILAGE- 14/KMPH");
							System.out.println("TANK TYPE- DISEAL");
							System.out.println("ENGINE HP- 120");
							System.out.println("PRICE RANGE - RS 14,00,000 - RS 24,00,000");
							break;
					 case 4:
							System.out.println("-----PUNCH------");
							System.out.println("AVAIABLE COLOUR- blue,red,orange");
							System.out.println("MILAGE- 10/KMPH");
							System.out.println("TANK TYPE- DISEAL");
							System.out.println("ENGINE HP- 120");
							System.out.println("PRICE RANGE - RS 5,00,000 - RS 9,00,000");
							break;
			        default:
			        	System.out.println("INVALID CHOISE");
			        	
					}
				}
				else {
					System.out.println("---SEDAN----");
					System.out.println("1. TIAGO");
					System.out.println("2. TIGOR");
					System.out.println("3. ALTOZ");
					//System.out.println("4. PUNCH");
		        	System.out.print("ENTER YOUR CHOISE NO -");
					int select_sedan=scanner.nextInt();
				switch (select_sedan) {
				case 1:
					System.out.println("-----TIAGO------");
					System.out.println("AVAIABLE COLOUR- blue,red,orange");
					System.out.println("MILAGE- 20/KMPH");
					System.out.println("TANK TYPE- PETROL");
					System.out.println("ENGINE HP- 139");
					System.out.println("PRICE RANGE - RS 6,00,000 - RS 10,00,000");
					break;
				case 2:
					System.out.println("-----TIGOR------");
					System.out.println("AVAIABLE COLOUR- blue,red,orange");
					System.out.println("MILAGE- 17/KMPH");
					System.out.println("TANK TYPE- PETROL");
					System.out.println("ENGINE HP- 120");
					System.out.println("PRICE RANGE - RS 6,00,000 - RS 13,00,000");
					break;
				case 3:
					System.out.println("-----ALTOZ------");
					System.out.println("AVAIABLE COLOUR- blue,red,orange");
					System.out.println("MILAGE- 18/KMPH");
					System.out.println("TANK TYPE- PETROL");
					System.out.println("ENGINE HP- 133");
					System.out.println("PRICE RANGE - RS 6,50,000 - RS 11,00,000");
					break;
				default:
					System.out.println("INVALID CHOISE");
				}
					
					
				}
			}
			else {
				System.out.println("----WELCOME To MAHINDRA-----");
				System.out.println("SELECT CAR TYPE");
				System.out.println("1 SUV");
				System.out.println("2 SEDAN");
				System.out.print("ENTER YOUR CHOISE NO -");
				int select_mahindra=scanner.nextInt();
				if(select_mahindra==1) {
					System.out.println("----SUV MODEL----");
					System.out.println("1. SCARPIO");
					System.out.println("2. MAHINDRA XUV");
					System.out.println("3. MAHINDRA XUV 500");
					System.out.println("4. MAHINDRA THAR ");
					System.out.print("ENTER YOUR CHOISE NO -");
					int select_suvmahindra=scanner.nextInt();
					switch(select_suvmahindra) {
					 case 1:
							System.out.println("-----SCARPIO------");
							System.out.println("AVAIABLE COLOUR- black,white");
							System.out.println("MILAGE- 13-16 KMPH");
							System.out.println("TANK TYPE- PETROL/DISEAL");
							System.out.println("ENGINE HP- 120");
							System.out.println("PRICE RANGE - RS 12,00,000 - RS 24,00,000");
							break;
					case 2:
								System.out.println("-----MAHINDRA XUV------");
								System.out.println("AVAIABLE COLOUR- blue,red,orange");
								System.out.println("MILAGE- 12/KMPH");
								System.out.println("TANK TYPE- DISEAL");
								System.out.println("ENGINE HP- 135");
								System.out.println("PRICE RANGE - RS 16,00,000 - RS 20,00,000");
								break;
					case 3:
								System.out.println("-----MAHINDRA XUV 500------");
								System.out.println("AVAIABLE COLOUR- blue,red,orange");
								System.out.println("MILAGE- 12.5/KMPH");
								System.out.println("TANK TYPE- DISEAL");
								System.out.println("ENGINE HP- 125");
								System.out.println("PRICE RANGE - RS 8,00,000 - RS 10,00,000");
								break;
				    case 4:
								System.out.println("-----MAHINDRA THAR------");
								System.out.println("AVAIABLE COLOUR- blue,red,orange");
								System.out.println("MILAGE- 10-16KMPH");
								System.out.println("TANK TYPE- DISEAL");
								System.out.println("ENGINE HP- 150");
								System.out.println("PRICE RANGE - RS 20,00,000 - RS 25,00,000");
								break;
						default:
							    System.out.println("INVALID SELECTION");
							    
					}
				}
				else {
					System.out.println("---------SEDAN----------");
					System.out.println("1. MAHINDRA LOGAN GLE ");
					System.out.println("2. MAHINDRA LOGAN EDGE");
					System.out.println("3. MAHINDRA VERITO D4");
					System.out.println("4. MAHINDRA VERITO D2 ");
					System.out.print("ENTER YOUR CHOISE NO -");
					int select_sedanmahindra=scanner.nextInt();
					switch(select_sedanmahindra) {
					case 1:
						System.out.println("-----MAHINDRA LOGAN GLE ------");
						System.out.println("AVAIABLE COLOUR- red,black,white");
						System.out.println("MILAGE- 14 KMPH");
						System.out.println("TANK TYPE- PETROL/DISEAL");
						System.out.println("ENGINE HP- 120");
						System.out.println("PRICE RANGE - RS 5,00,000 - RS 6,00,000");
						break;
				case 2:
							System.out.println("-----MAHINDRA LOGAN EDGE------");
							System.out.println("AVAIABLE COLOUR- blue,red,orange");
							System.out.println("MILAGE- 15/KMPH");
							System.out.println("TANK TYPE- DISEAL");
							System.out.println("ENGINE HP- 138");
							System.out.println("PRICE RANGE - RS 7,00,000 - RS 8,00,000");
							break;
				case 3:
							System.out.println("-----MAHINDRA VERITO D4------");
							System.out.println("AVAIABLE COLOUR- blue,red,orange");
							System.out.println("MILAGE- 13.5/KMPH");
							System.out.println("TANK TYPE- DISEAL");
							System.out.println("ENGINE HP- 135");
							System.out.println("PRICE RANGE - RS 9,00,000 - RS 10,00,000");
							break;
			    case 4:
							System.out.println("-----MAHINDRA VERITO D2------");
							System.out.println("AVAIABLE COLOUR- blue,red,orange");
							System.out.println("MILAGE- 16KMPH");
							System.out.println("TANK TYPE- DISEAL");
							System.out.println("ENGINE HP- 130");
							System.out.println("PRICE RANGE - RS 15,00,000 - RS 16,00,000");
							break;
					default:
						    System.out.println("INVALID SELECTION"); 
					}
				}
			}
			
		}
		else if (select == 2){
			System.out.println("YOU SELECTED 2 VEHILER");
			 System.out.println("SELECT BRAND");
	            System.out.println("1. HERO");
	            System.out.println("2. HONDA");
	            System.out.print("ENTER YOUR SELECTION:-");
	            int select_2w=scanner.nextInt();
	            if (select_2w==1) {
	            	System.out.println("-----HERO-------");
	            	System.out.println("1. NORMAL");
	            	System.out.println("2. SPORTS ");
	            	System.out.print("ENTER YOUR SELECTION NO. -");
		            int select_2Whero = scanner.nextInt();
		            if (select_2Whero == 1) {
		            	System.out.println("---- NORMAL BIKE ----");
	                    System.out.println("1. HERO SPLENDOR");
	                    System.out.println("2. HERO PASSION");
	                    System.out.println("3. HERO HF DELUXE");
	                    System.out.print("ENTER YOUR CHOICE NO -");
	                    int select_commuter = scanner.nextInt();
	                    switch (select_commuter) {
	                    case 1:
	                        System.out.println("----- HERO SPLENDOR -----");
	                        System.out.println("AVAILABLE COLORS: Black, Red, Blue");
	                        System.out.println("MILEAGE: 65 kmpl");
	                        System.out.println("FUEL TYPE: Petrol");
	                        System.out.println("ENGINE HP: 8.36");
	                        System.out.println("PRICE RANGE: Rs. 60,000 - Rs. 70,000");
	                        break;
	                    case 2:
	                        System.out.println("----- HERO PASSION -----");
	                        System.out.println("AVAILABLE COLORS: Black, Red, Blue");
	                        System.out.println("MILEAGE: 60 kmpl");
	                        System.out.println("FUEL TYPE: Petrol");
	                        System.out.println("ENGINE HP: 7.91");
	                        System.out.println("PRICE RANGE: Rs. 58,000 - Rs. 68,000");
	                        break;
	                    case 3:
	                        System.out.println("----- HERO HF DELUXE -----");
	                        System.out.println("AVAILABLE COLORS: Black, Red, Blue");
	                        System.out.println("MILEAGE: 65 kmpl");
	                        System.out.println("FUEL TYPE: Petrol");
	                        System.out.println("ENGINE HP: 8.36");
	                        System.out.println("PRICE RANGE: Rs. 60,000 - Rs. 70,000");
	                        break;
	                    default:
	                        System.out.println("INVALID CHOICE");
	                    }
		            }
		            else if (select_2Whero == 2) {
		            	System.out.println("---- SPORTS BIKE ----");
		                System.out.println("1. HERO XTREME");
		                System.out.println("2. HERO KARIZMA");
		                System.out.println("3. HERO HUNK");
		                System.out.print("ENTER YOUR CHOICE NO -");
		                int select_sports = scanner.nextInt();
		                switch (select_sports) {
		                case 1:
		                    System.out.println("----- HERO XTREME -----");
		                    System.out.println("AVAILABLE COLORS: Black, Red, Blue");
		                    System.out.println("MILEAGE: 50 kmpl");
		                    System.out.println("FUEL TYPE: Petrol");
		                    System.out.println("ENGINE HP: 14.2");
		                    System.out.println("PRICE RANGE: Rs. 80,000 - Rs. 90,000");
		                    break;
		                case 2:
		                    System.out.println("----- HERO KARIZMA -----");
		                    System.out.println("AVAILABLE COLORS: Black, Red");
		                    System.out.println("MILEAGE: 45 kmpl");
		                    System.out.println("FUEL TYPE: Petrol");
		                    System.out.println("ENGINE HP: 16.8");
		                    System.out.println("PRICE RANGE: Rs. 90,000 - Rs. 1,00,000");
		                    break;
		                case 3:
		                    System.out.println("----- HERO HUNK -----");
		                    System.out.println("AVAILABLE COLORS: Black, Red, Blue");
		                    System.out.println("MILEAGE: 55 kmpl");
		                    System.out.println("FUEL TYPE: Petrol");
		                    System.out.println("ENGINE HP: 15.6");
		                    System.out.println("PRICE RANGE: Rs. 75,000 - Rs. 85,000");
		                    break;
		                default:
		                    System.out.println("INVALID CHOICE");
		            }  
		            }
	            }
	            else if (select_2w==2) {
	            	 System.out.println("----- WELCOME TO HONDA MOTORCYCLE -----");
	            	    System.out.println("SELECT BIKE TYPE");
	            	    System.out.println("1. NORMAL");
	            	    System.out.println("2. SPORTS");
	            	    System.out.print("ENTER YOUR CHOICE NO -");
	            	    int select_Honda = scanner.nextInt();

	            	    if (select_Honda == 1) {
	            	    	 System.out.println("---- NORMAL BIKES ----");
	            	         System.out.println("1. HONDA SPLENDOR");
	            	         System.out.println("2. HONDA SHINE");
	            	         System.out.println("3. HONDA CD 110 Dream");
	            	         System.out.print("ENTER YOUR CHOICE NO -");
	            	         int select_normalHonda = scanner.nextInt();
	            	         switch (select_normalHonda) {
	            	            case 1:
	            	                System.out.println("----- HONDA SPLENDOR -----");
	            	                System.out.println("AVAILABLE COLORS: Black, Red, Blue");
	            	                System.out.println("MILEAGE: 65 kmpl");
	            	                System.out.println("FUEL TYPE: Petrol");
	            	                System.out.println("ENGINE HP: 7.91");
	            	                System.out.println("PRICE RANGE: Rs. 60,000 - Rs. 70,000");
	            	                break;
	            	            case 2:
	            	                System.out.println("----- HONDA SHINE -----");
	            	                System.out.println("AVAILABLE COLORS: Black, Red, Blue");
	            	                System.out.println("MILEAGE: 65 kmpl");
	            	                System.out.println("FUEL TYPE: Petrol");
	            	                System.out.println("ENGINE HP: 10.74");
	            	                System.out.println("PRICE RANGE: Rs. 70,000 - Rs. 80,000");
	            	                break;
	            	            case 3:
	            	                System.out.println("----- HONDA CD 110 Dream -----");
	            	                System.out.println("AVAILABLE COLORS: Black, Red, Blue");
	            	                System.out.println("MILEAGE: 74 kmpl");
	            	                System.out.println("FUEL TYPE: Petrol");
	            	                System.out.println("ENGINE HP: 8.79");
	            	                System.out.println("PRICE RANGE: Rs. 50,000 - Rs. 60,000");
	            	                break;
	            	            default:
	            	                System.out.println("INVALID CHOICE");
	            	        }
	            	    } 
	            	    else if (select_Honda == 2) {
	            	        System.out.println("---- SPORTS BIKE ----");
	            	        System.out.println("1. HONDA CBR");
	            	        System.out.println("2. HONDA CB");
	            	        System.out.println("3. HONDA CRF");
	            	        System.out.print("ENTER YOUR CHOICE NO -");
	            	        int select_sportsHonda = scanner.nextInt();

	            	        switch (select_sportsHonda) {
	            	            case 1:
	            	                System.out.println("----- HONDA CBR -----");
	            	                System.out.println("AVAILABLE COLORS: Red, Black, White");
	            	                System.out.println("MILEAGE: 30 kmpl");
	            	                System.out.println("FUEL TYPE: Petrol");
	            	                System.out.println("ENGINE HP: 44.4");
	            	                System.out.println("PRICE RANGE: Rs. 1,80,000 - Rs. 2,00,000");
	            	                break;
	            	            case 2:
	            	                System.out.println("----- HONDA CB -----");
	            	                System.out.println("AVAILABLE COLORS: Black, Red, Blue");
	            	                System.out.println("MILEAGE: 35 kmpl");
	            	                System.out.println("FUEL TYPE: Petrol");
	            	                System.out.println("ENGINE HP: 28.6");
	            	                System.out.println("PRICE RANGE: Rs. 1,60,000 - Rs. 1,80,000");
	            	                break;
	            	            case 3:
	            	                System.out.println("----- HONDA CRF -----");
	            	                System.out.println("AVAILABLE COLORS: Red, Black, White");
	            	                System.out.println("MILEAGE: 25 kmpl");
	            	                System.out.println("FUEL TYPE: Petrol");
	            	                System.out.println("ENGINE HP: 40.5");
	            	                System.out.println("PRICE RANGE: Rs. 1,70,000 - Rs. 1,90,000");
	            	                break;
	            	            default:
	            	                System.out.println("INVALID CHOICE");
	            	        }
	            	    } else {
	            	        System.out.println("INVALID CHOICE");
	            	    }
	            }
		}
	}
}

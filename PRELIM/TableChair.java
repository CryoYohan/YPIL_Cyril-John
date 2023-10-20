package PRELIM;
public class TableChair {
	public static void main(String[] args) {
		int across = 22, down = 6;
		for(int i =1; i <= down; i++) {
			for(int k =1; k <= across; k++) {
					// Border				// Babaw sa Lamesa			 // Lingkoranan sa taw left ; Lingkoranan sa taw right // Haligi ni sya			// The rest of the haligi sa ubos					
				
					System.out.print((k==1 || k==across-1) || (i == 3 && k>=7 && k<=15) 
							|| (i==4 && (k>=2 && k<=5) || i==4 &&(k>=17 && k<=20) 
							|| i ==4 &&(k==7 || k ==15) || (i == 5 || i ==6 || i == 7) 
							&& (k==5 || k==7 || k==15 || k==17)) ? "X" : " ");
					
			}
			System.out.println();
		}
	}
}


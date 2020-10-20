//LabEx2.java
//CoreyDennison T00185828	
/*This programe writes a ASCII Artwork using formatting*/

public class Lab3Ex2 {
	public static void main(String[] args) {
		
		//"Hello, World!"
		String line1 = String.format("%-5s%-4s%-8s%-8s%-9s%-14s%-6s%-5s%-7s%-9s%-8s%-7s%-6s\n",
									"H","H","EEEEE","L","L","OOO","W","W","OOO","RRRR","L","DDDD","! !");
									
		String line2 = String.format("%-9s%-8s%-8s%-8s%-16s%-9s%-8s%-9s%-8s%-7s%-5s\n",
									"H    H","E","L","L","O   O", "W W W","O   O","R   R","L","D   D","! !");
		
		String line3 = String.format("%-9s%-8s%-8s%-8s%-16s%-9s%-8s%-9s%-8s%-7s%-5s\n",
									"HHHHHH","EEEEE","L","L","O   O", "W W W","O   O","RRRR","L","D   D","! !");
									
		String line4 = String.format("%-9s%-8s%-8s%-8s%-7s%-2s%-8s%-8s%-8s%-9s%-8s%-7s\n",
									"H    H","E","L","L","O   O",",",",","W W","O   O","R   R","L","D   D");
									
		String line5 = String.format("%-9s%-8s%-8s%-9s%-5s%-2s%-9s%-9s%-7s%-9s%-8s%-7s%-3s\n",
									"H    H","EEEEE","LLLLL","LLLLL","OOO",",",",","W W","OOO","R   R","LLLLL","DDDD","! !\n");
									
		System.out.println(line1 + line2 + line3 + line4 + line5);	
		
		
		//Rabbit
		String rabbit1 = String.format("%-1s%-1s%-1s%-1s%-1s\n",
										" (","\\","_","/",")");
								
		String rabbit2 = String.format("%-1s%-1s%-1s%-1s%-1s%-1s%-1s\n",
										"(","=","'",".","'","=",")");
		
		String rabbit3 = String.format("%-1s%-1s%-1s%-1s%-1s%-1s%-1s\n",
										"(","\"",")","_","(","\"",")");
		
		System.out.println(rabbit1 + rabbit2 + rabbit3);
									
	}
}
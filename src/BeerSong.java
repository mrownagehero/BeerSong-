package Beer;

public class BeerSong {
	public static void main(String[]args) {  
		
	
	
	Ninety_Nine_Bottles_of_Beer();
	}
	public static void Ninety_Nine_Bottles_of_Beer() {
	int numBeer = 99;
	String BottleWord = "bottles";

	While (numBeer > 0){

		if (numBeer ==1){
		BottleWord = "bottle";
		}
		System.out.print(numBeer +" "+ BottleWord +" of beer on the wall, ");
		System.out.print(numBeer +" "+ BottleWord + " of beer take one down, pass it around, ");
		numBeer--;
	
		If(numBeer > 0){
			System.out.println(numBeer+""+BottleWord+" of beer on the wall.");
		}
		else {
		System.out.println("no more bottles of beer on the wall.");
		}
		
	}
}
}

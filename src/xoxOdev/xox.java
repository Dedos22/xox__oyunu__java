package xoxOdev;
import java.util.Scanner ;
public class xox {
	public static class oyun{
	public static final char kare[ ]={'1','2','3','4','5','6','7','8','9'};
	}
	//oyunun görünümünü ayarladik
public static void gorunum() {
	System.out.print(oyun.kare[0] + " | " + oyun.kare[1] +" | " +oyun.kare[2] +"\n"); 
	System.out.print("__________" + " \n\n ");
	System.out.print( oyun.kare[3] + " | " + oyun.kare[4] +" | " + oyun.kare[5] + "\n") ;
	System.out.print("__________" + " \n\n ");
	System.out.print(oyun.kare[6] +" | " + oyun.kare[7] + " | " + oyun.kare[8]);
	
}
public static void main(String[] args) {
	    int oyuncu=1,sayac=1;
		int secim;
		char isaretleme = 0;
		boolean kazanan=false;	
		System.out.print( "\t\tXOX OYUNU\n");
		System.out.print("\tOyuncu 1(X)\tOyuncu 2(O)\n");
		gorunum();
		System.out.print("\n\n");
		
		oyuncu=oyuncu+1;
		//sýranýn 1. oyuncuda mý 2. oyuncuda mý olduðunu belirledik ve ona göre iþaretlemeleri yaptýk
		while(kazanan==false && sayac<=9){
			oyuncu=oyuncu%2;
			if(oyuncu==0){
				System.out.print( oyuncu+1 + ". oyuncu rakam seciniz=\n" );
				isaretleme='X';
				Scanner s=new Scanner(System.in);
				secim=s.nextInt();
			}
			else{
				System.out.print(oyuncu+1 + ". oyuncu rakam seciniz="); 
				isaretleme='O';
				Scanner s=new Scanner(System.in);
				secim=s.nextInt();
			}		
			oyuncu++;
			sayac++;
			//yapýlan secimle birlikte secilen kareyi isaretlettik
		 switch(secim){
		 	case 1:
		 		oyun.kare[0]=isaretleme;
		 		break;
		 	case 2:
		 		oyun.kare[1]=isaretleme;
		 		break;
		 	case 3:
		 		oyun.kare[2]=isaretleme;
		 		break;
		 	case 4:
		 		oyun.kare[3]=isaretleme;
		 		break;
		 	case 5:
		 		oyun.kare[4]=isaretleme;
		 		break;
		 	case 6:
		 		oyun.kare[5]=isaretleme;
		 		break;
		 	case 7:
		 		oyun.kare[6]=isaretleme;
		 		break;
		 	case 8:
		 		oyun.kare[7]=isaretleme;
		 		break;
			case 9:
		 		oyun.kare[8]=isaretleme;
		 		break;
		}
		gorunum();
		//kazananý belirleme bölümü
		if(oyun.kare[0]==oyun.kare[1] && oyun.kare[1]==oyun.kare[2]){
			kazanan=true;	
		}
		else if(oyun.kare[3]==oyun.kare[4] && oyun.kare[4]==oyun.kare[5]){
			kazanan=true;
		}
		else if(oyun.kare[6]==oyun.kare[7] &&oyun. kare[7]==oyun.kare[8]){
			kazanan=true;
		}
	    else if(oyun.kare[2]==oyun.kare[4] && oyun.kare[4]==oyun.kare[6]){
	    	kazanan=true;
		}
	    else if(oyun.kare[0]==oyun.kare[4] && oyun.kare[4]==oyun.kare[8]){
	    	kazanan=true;
		}
	    else if(oyun.kare[1]==oyun.kare[4] && oyun.kare[4]==oyun.kare[7]){
	    	kazanan=true;
		}
		else if(oyun.kare[0]==oyun.kare[3] && oyun.kare[3]==oyun.kare[6]){
			kazanan=true;
		}
	    else if(oyun.kare[2]==oyun.kare[5] &&oyun.kare[5]==oyun.kare[8]){
	    	kazanan=true;
		} else {
			kazanan=false;
		}
		System.out.println();
	}
		//
	if (kazanan==true){
		if(isaretleme=='X'){
			System.out.print( "1. oyuncu kazandi.");
		}
		else{
			System.out.print( "2. oyuncu kazandi.");
		}
	} else{
		System.out.print( "berabere");
	}
	
   }
	
 }
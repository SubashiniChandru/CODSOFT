import java.util.*;
public class numberGuess 
{
    static int wons=0;
    static int rounds=0;
	public static void main(String[] args) {
	    
	    Scanner in=new Scanner(System.in);
	    System.out.println("Welcome to Number Guessing Game ");
	    System.out.println("You have 5 free trials!!");
	    System.out.println("Guess the generated Random number between 1 to 100 ");
	    
	    guessnum(in);
	}
	
	public static void playornot(Scanner in){
	    System.out.println("Do you want to play again ?. Press 1 to play and 2 to quit ");
	    int a=in.nextInt();
	    
	    switch(a)
	    {
	        case 1:
	            
	            guessnum(in);
	            break;
	        case 2:
	            System.out.println("Thank you for playing!");
	            System.out.println("Your Score card is :");
	            System.out.println("You have played totally "+rounds+" Rounds and won in "+wons+" Rounds ");
	            break;
	        default:
	             break;
	    
	    }
	}
	  
	public static void guessnum(Scanner in)
	{
	    rounds+=1;
	    Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
	    int k=5;
	    int guess=0;
	    int attempts=0;
	    while(k>0){
	        System.out.println("Guess the number : ");
	        guess=in.nextInt();
	        attempts+=1;
	        if(guess==numberToGuess){
	            System.out.println("Congratulations!!! You have guessed the number in "+attempts +" Attempts ");
	            wons++;
	            playornot(in);
	            
	        }
	        else if(guess<numberToGuess){
	            System.out.println("Your guess is too low !. Try again ");
	        }
	        else if(guess>numberToGuess){
	            System.out.println("Your guess is too high !. Try again ");
	        }
	        k--;
	        
	        
	    }
	    if(guess!=numberToGuess){
	        System.out.println("Sorry ! your chance is over. please try again...");
	        playornot(in);
	    } 
	 }
	     
	}


import java.util.*;
public class studentGrade
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Student Grade Calculator ");
		int[] arr=new int[5];
		inputMarks(arr);
		int totmarks=calcuTotalMark(arr);
		System.out.println("Total Marks obtained is : "+totmarks);
		float avgper=calcuAvgPercent(totmarks);
		System.out.println("The Average of Marks is : "+avgper);
		switch((int)avgper/10)
		{
		    case 10:
		    case 9:
		        System.out.println("Your Grade is A");
		        break;
		    case 8:
		        System.out.println("Your Grade is B");
		        break;
		    case 7:
		        System.out.println("Your Grade is C");
		        break;
		   case 6:
		        System.out.println("Your Grade is D");
		        break;
		   case 5:
		        System.out.println("Your Grade is E");
                break;
            default:
                System.out.println("Sorry! You are failed");
		}
        in.close();
		
	}
	public static void inputMarks(int[] arr){
	    Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++){
		    System.out.println("Enter Mark in Subject "+(i+1)+" : ");
		    arr[i]=in.nextInt();
		}
        in.close();
	}
	public static int calcuTotalMark(int[] arr){
	    int tot=0;
	    for(int i=0;i<5;i++){
	        tot+=arr[i];
	    }
	    return tot;
	}
	public static float calcuAvgPercent(int tot){
	    float avg=tot/5;
	    return avg;
	}

		
	}

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        int i, num, pos=0;
        int []arr = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 10 elements: ");
        for(i=0; i<10; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter an element to search: ");
        num = s.nextInt();

        for(i=0; i<10; i++){
            if(num==arr[i]){
                pos = i+1;
                break;
            }
        }

        if(pos==0)
            System.out.println("The element not found.");
        else
            System.out.println("The element found at position: " +pos);
    }
}

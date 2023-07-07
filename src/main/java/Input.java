import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number if you want : ");
        String inputNum = scanner.nextLine();
        if(StringUtils.isNumeric(inputNum)){
            System.out.println("Your input is number");
        }else{
            System.out.println("It is not a number");
        }
        System.out.print("Input anything : ");
        String inputFlip = scanner.nextLine();
        System.out.println(StringUtils.swapCase(inputFlip));
        System.out.print("Input anything : ");
        String inputReverse = scanner.nextLine();
        System.out.println(StringUtils.reverse(inputReverse));
    }
}

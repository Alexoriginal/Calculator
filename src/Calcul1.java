import java.util.Scanner;

public class Calcul1 {
    public static void main(String[] args) {
        int num1=getInt();
        int num2=getInt();
        char operation=getOperation();
        int result=calcul(num1,num2,operation);
        System.out.println("Ваше ответ="+result);



    }

    public static int getInt(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите число:");
        int num;

        num = scan.nextInt();

        return num;
    }
    public static char getOperation(){
        System.out.println("Введите требуемую операцию");
        Scanner scan1=new Scanner(System.in);
        char operation;
        operation=scan1.next().charAt(0);
        return operation;
    }
    public static int calcul(int num1,int num2,char operation){
        int result;
        switch(operation){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
            case '/':
                result=num1/num2;
                default:
                    System.out.println("Операция отсутствуе.Спробуй ще раз");
                    result=calcul(num1,num2,getOperation());
        }
        return result;
    }

}

import java.util.Scanner;

public class Calendar {
  private static final int[] monthInfo = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("반복횟수 : ");
    int repeatInput = scanner.nextInt();

    int[] inputMonth = new int[repeatInput];
    System.out.println("월을 입력하세요.");
    for(int i=0;i<repeatInput;i++){
      inputMonth[i] = scanner.nextInt();
    }

    for(int i=0;i<repeatInput;i++){
      System.out.println(inputMonth[i] + "월은 " + monthInfo[inputMonth[i] - 1] + "일까지 있습니다.");
    }

//    System.out.println("일  월  화  수  목  금  토");
//    System.out.println("---------------------");
//    System.out.println("1   2   3   4   5   6   7");
//    System.out.println("8   9   10  11  12  13  14");
//    System.out.println("15  16  17  18  19  20  21");
//    System.out.println("22  23  24  25  26  27  28");
  }
}

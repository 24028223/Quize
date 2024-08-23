import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        char[] player1=new char[10];
        char[] player2=new char[10];
        int a = 0;
        do{
        String[][] board = {
            {"| 1 "+player1[1]+player2[1]+"|", "2 "+player1[2]+player2[2]+"|", "3 "+player1[3]+player2[3]+"|"},
            {"| 4 "+player1[4]+player2[4]+"|", "5 "+player1[5]+player2[5]+"|", "6 "+player1[6]+player2[6]+"|"},
            {"| 7 "+player1[7]+player2[7]+"|", "8 "+player1[8]+player2[8]+"|", "9 "+player1[9]+player2[9]+"|"}
        };
        System.out.println("==Board==");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " "); 
            }
            System.out.println();
        }
        Scanner uScanner = new Scanner(System.in);
        System.out.println("PlayerX Enter (1-9) for X:");
        int uInt = uScanner.nextInt();
        System.out.println("PlayerO Enter (1-9) for O:");
        int uInt1 = uScanner.nextInt();
        switch (uInt) {
            case 1:
                player1[1]='X';
                break;
            case 2:
                player1[2]='x';
                break;
            case 3:
                player1[3]='X';
                break;
            case 4:
                player1[4]='X';
                break;
            case 5:
                player1[5]='X';
                break;
            case 6:
                player1[6]='X';
                break;
            case 7:
                player1[7]='X';
                break;
            case 8:
                player1[8]='X';
                break;
            case 9:
                player1[9]='X';
                break;
        
            default:
                break;
        }
        switch (uInt1) {
            case 1:
                player2[1]='O';
                break;
            case 2:
                player2[2]='O';
                break;
            case 3:
                player2[3]='O';
                break;
            case 4:
                player2[4]='O';
                break;
            case 5:
                player2[5]='O';
                break;
            case 6:
                player2[6]='O';
                break;
            case 7:
                player2[7]='O';
                break;

            case 8:
                player2[8]='O';
                break;
            case 9:
                player2[9]='O';
                break;
        
            default:
                break;
        }
        if (uInt==uInt1) {
            System.out.println("Position taken, please pick a new one!!");
            break;
        }
        a++;
        if(a==3){
            System.out.print("Game Over!! \n******Check Scores******");
        }
        }while(a!=3);
    }
}

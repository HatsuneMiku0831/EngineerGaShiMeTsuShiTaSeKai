package AreaD;
/*
    あなたは残高からお金を引き出すプログラムを作成しています。

    残高 n と引き出したい額 w が与えられます。

    この時、引き出し額が残高を上回ってマイナスになる場合は "error" と出力し、引き出せる場合は残高を出力するプログラムを作成してください。
 */

import java.util.Scanner;

public class お金が引き出せない銀行 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] amount = new int[2];
        for (int i = 0; i <2 ; i++) {
            amount[i] = in.nextInt();
            //残高と引き出す額を配列の0と1に保存する
        }
        if (amount[0]-amount[1] >= 0){
            //足りる
            System.out.println(amount[0]-amount[1]);
        }
        else {
            //足りない
            System.out.println("error");
        }
    }
}

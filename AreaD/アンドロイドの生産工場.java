package AreaD;
/*
    ある暗号化された文字列 S が与えられます。
    文字列 S のうち奇数文字目を取り出せば解読できることがわかりました。

    文字列 S が与えられるので奇数文字目の文字を取り出して解読した文字列を出力してください。
 */

import java.util.Scanner;

public class アンドロイドの生産工場 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chs = s.toCharArray();
        //読み込んだデータを分けてchar[]に一つずつ保存する
        for (int i = 0; i <chs.length ; i+=2) {
            //奇数だけ出力する i=0はデータの1、i=2はデータの3...
            System.out.print(chs[i]);
        }
    }
}

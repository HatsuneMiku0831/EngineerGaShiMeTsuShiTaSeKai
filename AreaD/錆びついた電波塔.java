package AreaD;
/*
        電波でデータ通信するプログラムが壊れてしまっており、あなたはそれを直そうとしています。

        n回の通信をしたとき、受信した各データ各電波強度 d_i が与えられます。各電波強度 d_i は 1 から 9 の整数で表され、 5 以下では通信に失敗します。

        n 回の通信のうち通信に成功した回数を出力してください。
 */

import java.util.ArrayList;
import java.util.Scanner;

public class 錆びついた電波塔 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //通信回数を保存する
        int a = in.nextInt();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i <a ; i++) {
            int c = in.nextInt();
            if (c > 5){
                //強度5以上の電波を保存する
                b.add(c);
            }
        }
        //保存している電波の数を出力する
        System.out.println(b.size());
    }
}

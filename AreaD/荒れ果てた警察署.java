package AreaD;
/*
    あなたは 0 から 9 の数字を 3 つ入力すると開く扉を開こうとしています。

    鍵の番号は左から 2 つまで判明しています。 3 つ目に関しては以下の法則で決まることがわかりました。

    ・2 つ目までをすべて足す
    ・足したものを 10 で割ったときの余り

    2 つ目までの数字が与えられるので 3 つ目を計算し出力してください。
 */

import java.util.Scanner;

public class 荒れ果てた警察署 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prime = 0;
        for (int i = 0; i <2; i++) {
            prime += in.nextInt();
            //入力を足し算する
        }
        System.out.println(prime%10);
        //引き算の余りを出力
    }
}

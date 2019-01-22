package AreaD;
/*
    あなたは書類の整理をしています。

    書類には 1 から 3 までの重要度 e が設定されています。数字が大きいほど重要な書類とされています。

    書類のタイトル文字列 S_i と重要度 e_i が n 件与えられます。

    重要度が 3 の書類のタイトルのみを入力された順に出力してください。
 */

import java.util.ArrayList;
import java.util.Scanner;

public class 荒れ果てたオフィス {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //総数nを保存する
        int a = in.nextInt();
        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i <=a ; i++) {
            //タイトルと重要度を文字列で保存する
            String s= in.nextLine();
            if (s.endsWith("3")){
                //重要度3だけの本を最後にある重要度と空白を除いて配列に保存する
                ar.add(s.substring(0,s.length()-2));
            }
        }
        for (int i = 0; i <ar.size() ; i++) {
            System.out.println(ar.get(i));
        }
    }
}

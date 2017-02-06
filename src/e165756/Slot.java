package e165756;

public class Slot {
    public static void main(String[] args) {
      /*
        * 初期値設定
        * */
        double Num = 10.0;
        int count = 50;
        int Lucky = 7;
        int i, n1, n2, n3,p1 = 0;
            for (i = 0; i < count; i++) {
                n1 = (int) (Math.random() * Num);
                n2 = (int) (Math.random() * Num);
                n3 = (int) (Math.random() * Num);
                System.out.println(n1 + "" + n2 + "" + n3);
                if (n1 == n2 && n1 == n3) {
                    System.out.println("ゾロ目！！(" + (i + 1) + "回目)");
                    p1 += 2;
                    if(n1 == Lucky){
                        System.out.println("ラッキー！！");
                        p1 += 5;
                    }
                } else if (n1 == n2 || n1 == n3 || n2 == n3) {
                    System.out.println("惜しい！！");
                    p1 += 1;
                }
            }
            if (i == count) {
                System.out.println("終了！！");
            }
            System.out.println("得点は" + p1 + "点です");
        if(p1 >= 25){
            System.out.println("あなたの勝ちです");
        }else{
            System.out.println("あなたの負けです");
        }
    }

}

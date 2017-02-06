package e165756;

public class Slot {
    public static void main(String[] args) {
        final double Num = 10.0;
        final int count = 50;
        int i,n1,n2,n3;

        for(i = 0;i < count;i++){
            n1 = (int)(Math.random()*Num);
            n2 = (int)(Math.random()*Num);
            n3 = (int)(Math.random()*Num);
            if(n1 == n2 && n1 == n3){
                System.out.println("ゾロ目！！(" + (i+1) + "回目)");
                break;
            }else if(n1 == n2 || n1 == n3 || n2 == n3){
                System.out.println("惜しい！！");
            }
            System.out.println();
        }
        if(i == count){
            System.out.println("ダメでした");
        }
    }
}

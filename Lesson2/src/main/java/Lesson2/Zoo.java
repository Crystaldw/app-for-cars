package Lesson2;

public class Zoo {

    public static void main(String[] args) {

        Tiger bigTiger = new Tiger();
        bigTiger.weight = 150;
        System.out.println(bigTiger.weight);
        bigTiger.sleep();

        System.out.println(Tiger.legsCount);

        int i = 7;
        System.out.println(i);
    }
}

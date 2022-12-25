public class FlowControl_Loop {
    public static void main(String[] args) {

        System.out.println("While");
        int i = 0;
        while (i < 3) {
            System.out.println(1);
            System.out.println(2);
            i++;
        }
        // 자유도는 높지만 다른 코드와 엉킬 가능성 있음

        System.out.println("for");
        for(int j = 0; j < 3; j++) {
            System.out.println(1);
            System.out.println(2);
        }
        // 조건, 반복횟수, 마침이 한 곳에 있어서 단순 반복에 좋음

    }

}

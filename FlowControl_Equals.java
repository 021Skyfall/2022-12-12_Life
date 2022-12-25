public class FlowControl_Equals {
    public static void main(String[] args) {

//		원시 데이터 타입 = boolean , int , double , short , long , float , char


//		String o1 = new String("java");
        String o1 = "java";
        String o2 = new String("java");
//		new는 같은 값이지만 겹치지 않게 하고 싶을 때
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

//		equals는 내용이 같은지 판단해주는 메소드, 원시 데이터 타입은 쓸 수 없음

        String o3 = "java2";
        String o4 = "java2";
        System.out.println(o3 == o4);
//		보통 값이 같으면 같은 곳에 저장됨
//		원시 데이터 타입이면 == , 아닌 경우는 equals


    }

}

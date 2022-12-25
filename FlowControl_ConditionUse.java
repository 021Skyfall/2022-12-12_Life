import javax.swing.JOptionPane;

public class FlowControl_ConditionUse {
    public static void main(String[] args) {

        String inputid = JOptionPane.showInputDialog(args);
        String id = "commander";

        String inputpwd = JOptionPane.showInputDialog(args);
        String pwd = "1111";
        String pwd2 = "2222";

        System.out.println("Hi.");

//		if (inputid.equals(id)) {
//			if (inputpwd.equals(pwd)) {
//				System.out.println("Master!");
//			} else {
//				System.out.println("Wrong Password");
//				System.out.println("Who are you?");
//			}
//		} else {
//			System.out.println("Who are you?");
//		}

        boolean pass = (inputpwd.equals(pwd) || inputpwd.equals(pwd2));

        if (inputid.equals(id) && pass ) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
        // 논리연산자 &&는 두 조건이 true 혹은 false일 때 묶어서 출력해줌
    }

}

import javax.swing.JOptionPane;

public class FlowControl_AuthApp {
    public static void main(String[] args) {

//		String[] users = {"Han", "Lee", "Kim", "Ko", "Jeong", "Choi", "Ahn"};
        String[][] users = {
                {"Han", "1111"},
                {"Lee", "2222"},
                {"Kim", "3333"}
        };
        String inputid = JOptionPane.showInputDialog(args);
        String inputpwd = JOptionPane.showInputDialog(args);

        boolean islogin = false;
        for (int i = 0; i < users.length; i++) {
            String[] current = users[i];
            if (current[0].equals(inputid) && current[1].equals(inputpwd)) {
                islogin = true;
                break;
            }
        }
        System.out.println("Hi,");
        if(islogin) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }

    }

}

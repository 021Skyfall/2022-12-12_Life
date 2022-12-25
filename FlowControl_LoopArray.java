public class FlowControl_LoopArray {
    public static void main(String[] args) {

        String[] U = new String[3];
        U[0] = "A";
        U[1] = "B";
        U[2] = "C";

        for (int i = 0; i < U.length; i++) {
            System.out.println("<li>"+U[i]+"</li>");
        }

        // * <li>A</li> ...
        int j = 0;
        while (j < U.length) {
            System.out.println("!!!"+U[j]+"!!!");
            j++;
        }
    }

}

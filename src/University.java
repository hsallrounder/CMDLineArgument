public class University {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("At least 2 arguments must be entered.");
        }
        else{
            if (args[0].equals("GLA") && args[1].equals("Mathura"))
                System.out.println("GLA University Mathura");
            else if (args[0].equals("AAA") && args[1].equals("Delhi"))
                System.out.println("AAA Technologies Delhi");
        }
    }
}

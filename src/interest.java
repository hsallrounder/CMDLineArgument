public class interest {
    public static void main(String[] args) {
        String s = args[0];
        int age = Integer.parseInt(args[1]);
        if(s.equals("Female") && age>=1 && age<=58){
            System.out.println("Percentage of interest : "+ 8.2);
        }
        else if(s.equals("Female") && age>=59 && age<=100)
            System.out.println("Percentage of interest : "+ 9.2);
        else if(s.equals("Male") && age>=1 && age<=58)
            System.out.println("Percentage of interest : "+8.4);
        else if(s.equals("Male") && age>=59 && age<=100)
            System.out.println("Percentage of interest : "+10.5);
    }
}
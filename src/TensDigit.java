public class TensDigit {
    /*
    If N is 264, the tens digit is 6.

    If N is 4136, the tens digit is 3.

    If N is 101, the tens digit is 0.
    Report a typo
    Sample Input 1:
    173
    Sample Output 1:
    7
     */
    public static void main(String[] args) {
        if (args.length == 1) {
            int N = Integer.parseInt(args[0]);
            if(N>=0 && N<=1000000)
            {
                System.out.println(args[0].charAt(args[0].length()-2));
            }
            else
            {
                System.out.println("Only Non-Negative Integer must be entered.");
            }
        }
        else {
            System.out.println("Only 1 argument should be passed.");
        }
    }
}

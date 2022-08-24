public class Main {
    public static void main(String[] args) {
        int a = 50, b = 100, vastaus = 0;

        if (a >= 100)
        {
            if(b <= 50)
                vastaus = 1;
        }
        else
            vastaus = 0;
        if (b >= 100)
        {
            if(a <= 50) {
                vastaus = 1;
            }
        }
        System.out.println(vastaus);
    }
}

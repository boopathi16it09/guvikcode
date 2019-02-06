class Largest {

    public static void main(String[] args) {

        double n1 = 6.5, n2 = -73.9, n3 = 62.5;

        if( n1 >= n2 && n1 >= n3)
        {
            System.out.println(n1 + "  the is the largest number.");
        }

        else if (n2 >= n1 && n2 >= n3)
        {
            System.out.println(n2 + "the is the largest number.");
        }

        else
        {
            System.out.println(n3 + "the is the largest number.");
        }
    }
}

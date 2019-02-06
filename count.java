class Count {

    public static void main(String[] args) {
        String line = "This website is aw3som2.";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }

        System.out.println("Vow: " + vowels);
        System.out.println("Cons: " + consonants);
        System.out.println("Dig: " + digits);
        System.out.println("White spaces: " + spaces);
    }
}

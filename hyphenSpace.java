class hyphenSpace
{
    static void moveSpaceInFront(char str[])
    {
        int i = str.length-1;
        for (int j = i; j >= 0; j--)
            if (str[j] != ' ')
            {
                char c = str[i];
                str[i] = str[j];
                str[j] = c;
                i--;
            }
    }
    public static void main(String[] args)
    {
        char str[] = "Move, space to front of the string".toCharArray();
        moveSpaceInFront(str);
        System.out.println(String.valueOf(str));
    }
}

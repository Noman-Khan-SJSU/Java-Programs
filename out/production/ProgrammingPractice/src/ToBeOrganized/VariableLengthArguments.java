package ToBeOrganized;

class VariableLengthArguments
{
    public static void main(String[] args)
    {
        System.out.println(average(10,20,30));          // Can pass any number of arguments here
    }

    public static int average(int ... numbers)
    {
        int total = 0;
        for (Integer x : numbers)
            total += x;
        return total/numbers.length;
    }

}
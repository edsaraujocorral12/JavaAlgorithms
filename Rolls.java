public class Rolls
{
    public static void main(String[] args)
    {
        int T = Integer.parseInt(args[0]);
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1]; //Create the array

        for (int i = 1; i <= SIDES; i++)
            rolls[i] = new Counter(i + " 's"); //Create each object in the array;
        for (int i = 0; i < T; i++)
        {
            int result = StdRandom.uniform(1, SIDES+1);
            rolls[result].increment();
        }
        for (int i = 1; i <= SIDES; i++)
            StdOut.println(rolls[i]);
    }
}
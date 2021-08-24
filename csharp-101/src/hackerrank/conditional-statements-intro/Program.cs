using System;

namespace conditional_statements_intro
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine().Trim());
            string weird = "Weird", notweird = "Not Weird";

            if (n % 2 == 1)
                Console.WriteLine(weird);
            else
                if ((n >= 2 && n <= 5) || n > 20)
                Console.WriteLine(notweird);
            else if (n >= 6)
                Console.WriteLine(weird);
        }
    }
}

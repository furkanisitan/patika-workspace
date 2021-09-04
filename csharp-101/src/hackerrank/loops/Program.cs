using System;

namespace loops
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a number: ");
            int number = Convert.ToInt32(Console.ReadLine().Trim());
            printMultiples(number, 10);
        }

        static void printMultiples(int number, int limit)
        {
            for (int i = 1; i <= limit; i++)
                Console.WriteLine($"{number} x {i} = {number * i}");

        }

    }
}

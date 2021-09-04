using System;

namespace for_break_continue
{
    class Program
    {
        static void Main(string[] args)
        {

            // print odd numbers
            Console.Write("Enter a number: ");
            int counter = int.Parse(Console.ReadLine());
            for (int i = 1; i <= counter; i++)
                if (i % 2 == 1)
                    Console.WriteLine(i);


            // Print sum of odd and even numbers from 1 to 1000.
            int sumOfOddNumbers = 0;
            int sumOfEvenNumbers = 0;
            for (int i = 1; i <= 1000; i++)
                if (i % 2 == 1)
                    sumOfOddNumbers += i;
                else
                    sumOfEvenNumbers += i;

            Console.WriteLine("Sum of odd numbers from 1 to 1000: " + sumOfOddNumbers);
            Console.WriteLine("Sum of even numbers from 1 to 1000: " + sumOfEvenNumbers);


            // break, continue
            for (int i = 1; i < 10; i++)
            {
                if (i == 4)
                    break;
                Console.WriteLine(i);
            }

            for (int i = 1; i < 10; i++)
            {
                if (i == 4)
                    continue;
                Console.WriteLine(i);
            }

        }
    }
}

using System;

namespace console_programming
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");


            Console.Write("Enter firstname: ");
            string firstname = Console.ReadLine();

            Console.Write("Enter lastname: ");
            string lastname = Console.ReadLine();

            Console.WriteLine($"Hello {firstname} {lastname}.");
        }
    }
}

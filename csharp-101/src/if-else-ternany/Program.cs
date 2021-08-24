using System;

namespace if_else_ternany
{
    class Program
    {
        static void Main(string[] args)
        {
            int time = DateTime.Now.Hour;
            if (time >= 6 && time < 11)
            {
                Console.WriteLine("Good morning.");
            }
            else if (time <= 18)
            {
                Console.WriteLine("Good afternoon.");
            }
            else
            {
                Console.WriteLine("Good night.");
            }

            string res = time <= 18 ? "Good morning." : "Good night.";
            res = time >= 6 && time < 11 ? "Good morning." : time <= 18 ? "Good afternoon." : "Good night.";
            Console.WriteLine(res);
        }
    }
}

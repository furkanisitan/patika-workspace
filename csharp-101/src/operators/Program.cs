using System;

namespace operators
{
    class Program
    {
        static void Main(string[] args)
        {
            // assignment operators
            int x = 3;
            int y = 3;
            y = y + 2;

            Console.WriteLine(y);
            y += 2;
            Console.WriteLine(y);
            y /= 1;
            Console.WriteLine(y);
            x *= 2;
            Console.WriteLine(x);


            // logical operators
            bool isSuccess = true;
            bool isCompleted = false;

            if (isSuccess && isCompleted)
                Console.WriteLine("Perfect!");

            if (isSuccess || isCompleted)
                Console.WriteLine("Great!");

            if (isSuccess && !isCompleted)
                Console.WriteLine("Fine!");


            // comparison operators
            int a = 3;
            int b = 4;
            bool res = a < b;

            Console.WriteLine(res);
            res = a > b;
            Console.WriteLine(res);
            res = a >= b;
            Console.WriteLine(res);
            res = a <= b;
            Console.WriteLine(res);
            res = a == b;
            Console.WriteLine(res);
            res = a != b;
            Console.WriteLine(res);


            // arithmetic operators
            int num1 = 10;
            int num2 = 5;
            int res1 = num1 / num2;

            Console.WriteLine(res1);
            res1 = num1 * num2;
            Console.WriteLine(res1);
            res1 = num1 + num2;
            Console.WriteLine(res1);
            res1 = num1++;
            Console.WriteLine(res1);

            int res2 = 20 % 3;
            Console.WriteLine(res2);
        }
    }
}

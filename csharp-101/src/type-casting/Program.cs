using System;

namespace type_casting
{
    class Program
    {
        static void Main(string[] args)
        {
            // implicit conversion (bilinçsiz dönüşüm)
            byte a = 5;
            sbyte b = 30;
            short c = 10;

            int d = a + b + c;
            Console.WriteLine("value of 'd': " + d);

            long h = d;
            Console.WriteLine("value of 'h': " + h);

            float i = h;
            Console.WriteLine("value of 'i': " + i);

            string e = "Furkan";
            char f = 'F';
            object g = e + f + d;
            Console.WriteLine("value of 'g': " + g);


            // explicit conversion (bilinçli dönüşüm)
            int x = 4;
            byte y = (byte)x;
            Console.WriteLine("value of 'y': " + y);

            int z = 100;
            byte t = (byte)z;
            Console.WriteLine("value of 't': " + t);

            float w = 10.3f;
            byte v = (byte)w;
            Console.WriteLine("value of 'v': " + v);


            // ToString() method
            int xx = 6;
            string yy = xx.ToString();
            Console.WriteLine("value of 'yy': " + yy);

            string zz = 12.5f.ToString();
            Console.WriteLine("value of 'zz': " + zz);


            // System.Convert
            string s1 = "10", s2 = "20";
            int num1, num2;
            int sum;

            num1 = Convert.ToInt32(s1);
            num2 = Convert.ToInt32(s2);
            sum = num1 + num2;
            Console.WriteLine("sum: " + sum);


            // Parse
            ParseMethod();
        }

        public static void ParseMethod()
        {
            string text1 = "10";
            string text2 = "10.25";
            int num1;
            double double1;

            num1 = Int32.Parse(text1);
            double1 = Double.Parse(text2);

            Console.WriteLine("value of 'num1': " + num1);
            Console.WriteLine("value of 'double1': " + double1);
        }
    }
}

using System;

namespace variables_and_data_types
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            byte b = 5; // 1 byte
            sbyte sb = 5; // 1 byte

            short s = 5; // 2 byte
            ushort us = 5; // 2 byte

            Int16 i16 = 2; // 2 byte
            int i = 2; // 4 byte
            Int32 i32 = 2; // 4 byte
            Int64 i64 = 2; // 8 byte

            uint ui = 2; // 4 byte
            long l = 4; // 8 byte
            ulong ul = 4; // 8 byte

            float f = 5; // 4 byte
            double d = 5; // 8 byte
            decimal de = 5; // 16 byte

            char ch = '2'; // 2 byte
            string str = "Furkan"; // unlimited

            bool b1 = true;
            bool b2 = false;

            DateTime dt = DateTime.Now;
            Console.WriteLine(dt);

            object o1 = "Furkan";
            object o2 = 'F';
            object o3 = 4;
            object o4 = 4.5;

            // string expressions
            string name = string.Empty;
            name = "Furkan Işıtan";
            string firstName = "Furkan";
            string lastName = "Işıtan";
            string fullName = firstName + " " + lastName;

            // integer
            int i1 = 5;
            int i2 = 3;
            int i3 = i1 * i2;

            // boolean
            bool bool1 = 10 > 2;

            // type casting
            string str20 = "20";
            int int20 = 20;
            string newValue = str20 + int20.ToString();
            Console.WriteLine("New String Value: " + newValue);

            int int21 = int20 + Convert.ToInt32(str20);
            Console.WriteLine("New Integer DeValueğer: " + int21);

            int int22 = int20 + int.Parse(str20);
            Console.WriteLine("New Integer Value: " + int22);

            // datetime
            string datetime = DateTime.Now.ToString("dd.MM.yyyy");
            Console.WriteLine(datetime);

            string datetime1 = DateTime.Now.ToString("dd/MM/yyyy");
            Console.WriteLine(datetime1);

            string hour = DateTime.Now.ToString("HH:mm");
            Console.WriteLine(hour);
        }
    }
}

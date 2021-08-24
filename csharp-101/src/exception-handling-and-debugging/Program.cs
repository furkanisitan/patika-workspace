using System;

namespace exception_handling_and_debugging
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter a number: ");
                int number = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("The number you entered: " + number);
            }
            catch (Exception e)
            {
                Console.WriteLine("Error: " + e.Message.ToString());
            }
            finally
            {
                Console.WriteLine("Process completed.");
            }

            // ****************************************************************

            try
            {
                //int a = int.Parse(null);
                //int a = int.Parse("test");
                int a = int.Parse("-20000000000");
            }
            catch (ArgumentNullException e)
            {
                Console.WriteLine("You entered an empty value.");
                Console.WriteLine(e);
            }
            catch (FormatException e)
            {
                Console.WriteLine("The data type is not suitable.");
                Console.WriteLine(e);
            }
            catch (OverflowException e)
            {
                Console.WriteLine("You entered a value that is too small or too large.");
                Console.WriteLine(e);
            }
            finally
            {
                Console.WriteLine("The operation completed successfully.");
            }
        }
    }
}

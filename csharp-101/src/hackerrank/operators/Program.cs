using System;

namespace operators
{
    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    class Program
    {
        static void Main(string[] args)
        {
            double meal_cost = Convert.ToDouble(Console.ReadLine().Trim());

            int tip_percent = Convert.ToInt32(Console.ReadLine().Trim());

            int tax_percent = Convert.ToInt32(Console.ReadLine().Trim());

            solve(meal_cost, tip_percent, tax_percent);
        }

        public static void solve(double meal_cost, int tip_percent, int tax_percent)
        {
            Console.WriteLine(Math.Round(meal_cost + meal_cost / 100 * (tip_percent + tax_percent)));
        }

    }

}

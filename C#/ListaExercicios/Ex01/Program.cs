using System;

class Program
{
    static void Main(string[] args)
    {
        int[] desordenado = new int[100];
        Random random = new Random();
        for (int i = 0; i < desordenado.Length; i++)
        {
            desordenado[i] = random.Next(100);
        }

        Console.WriteLine("Array desordenado:");
        for (int i = 0; i < desordenado.Length; i++)
        {
            Console.Write(desordenado[i] + " ");
        }

        // Bubble Sort
        int n = desordenado.Length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (desordenado[j] > desordenado[j + 1])
                {
                    int temp = desordenado[j];
                    desordenado[j] = desordenado[j + 1];
                    desordenado[j + 1] = temp;
                }
            }
        }

        Console.WriteLine("\nArray ordenado:");
        for (int i = 0; i < desordenado.Length; i++)
        {
            Console.Write(desordenado[i] + " ");
        }
    }
}

using System;

class Program
{
    static void Main(string[] args)
    {
        int[] desordenado = new int[100];
        Random random = new Random();
        for (int i = 0; i < desordenado.Length; i++)
        {
            desordenado[i] = random.Next[100];
        }
        Console.WriteLine(random.Next(100));
    }
}

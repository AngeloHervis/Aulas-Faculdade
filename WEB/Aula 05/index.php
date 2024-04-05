<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 05 - Função</title>
</head>

<body>
    <h1>Aula 05 - Função</h1>

    <?php

    //Exercício 01:
    function calcularMedia($nome, $nota1, $nota2, $nota3, $nota4)
    {
        $media = ($nota1 + $nota2 + $nota3 + $nota4) / 4;
        echo "Aluno: $nome - Média: $media - Situação: ";
        if ($media >= 7) {
            echo "Aprovado";
        } elseif ($media < 7 && $media >= 4) {
            echo "Recuperação";
        } else {
            echo "Reprovado";
        }
        echo "<br>";
    }

    calcularMedia("João", 8, 7, 6, 9);
    calcularMedia("Maria", 5, 6, 4, 7);
    calcularMedia("Pedro", 6, 5, 7, 8);

    //Exercício 02
    function somar($valor1, $valor2)
    {
        $soma = $valor1 + $valor2;
        if ($soma < 0) {
            return 0;
        } else {
            return $soma;
        }
    }

    // Exemplos de uso da função
    $resultado1 = somar(5, 3); // Retorna 8
    $resultado2 = somar(-5, 3); // Retorna 0
    
    echo "Resultado 1: $resultado1 <br>";
    echo "Resultado 2: $resultado2 <br>";
    //Exercício 03
    //Exercício 04
    //Exercício 05
    ?>

</body>

</html>
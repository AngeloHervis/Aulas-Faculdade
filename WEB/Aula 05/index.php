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
    function calcularOperacao($operacao, $numero1, $numero2)
    {
        switch ($operacao) {
            case 'soma':
                $resultado = $numero1 + $numero2;
                echo "Resultado da soma: $resultado";
                break;
            case 'subtracao':
                $resultado = $numero1 - $numero2;
                echo "Resultado da subtração: $resultado";
                break;
            case 'multiplicacao':
                $resultado = $numero1 * $numero2;
                echo "Resultado da multiplicação: $resultado";
                break;
            case 'divisao':
                if ($numero2 != 0) {
                    $resultado = $numero1 / $numero2;
                    echo "Resultado da divisão: $resultado";
                } else {
                    echo "Não é possível dividir por zero.";
                }
                break;
            case 'exponenciacao':
                $resultado = pow($numero1, $numero2);
                echo "Resultado da exponenciação: $resultado";
                break;
            default:
                echo "Operação inválida.";
                break;
        }
    }

    if (isset ($_POST['submit'])) {
        $operacao = $_POST['operacao'];
        $numero1 = $_POST['numero1'];
        $numero2 = $_POST['numero2'];
        calcularOperacao($operacao, $numero1, $numero2);
    }




    //Exercício 04
    function calcularMediaAluno($notas_aluno)
    {
        $soma_notas = array_sum($notas_aluno);
        $quantidade_notas = count($notas_aluno);
        $media_aluno = $soma_notas / $quantidade_notas;

        if ($media_aluno > 10) {
            echo "Alguma(s) das notas digitadas pelo usuário é inválida.";
        } elseif ($media_aluno >= 6) {
            echo "Aluno aprovado! Média final: $media_aluno";
        } else {
            echo "Aluno reprovado! Média final: $media_aluno";
        }
    }

    // Exemplo de uso da função
    $notas_aluno1 = array(7, 8, 6, 9);
    calcularMediaAluno($notas_aluno1);
    //Exercício 05
    ?>

    <form method="post" action="">
        Escolha a operação:
        <select name="operacao">
            <option value="soma">Soma</option>
            <option value="subtracao">Subtração</option>
            <option value="multiplicacao">Multiplicação</option>
            <option value="divisao">Divisão</option>
            <option value="exponenciacao">Exponenciação</option>
        </select>
        <br>
        Digite o primeiro número: <input type="number" name="numero1"><br>
        Digite o segundo número: <input type="number" name="numero2"><br>
        <input type="submit" name="submit" value="Calcular">
    </form>

</body>

</html>
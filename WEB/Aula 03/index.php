<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
</head>

<body>
    <h1>Calculadora Simples</h1>

    <?php
    function calcular($numero1, $numero2, $operacao)
    {
        // Switch para determinar  a operação a ser realizada
        switch ($operacao) {
            case "1":
                $resultado = $numero1 + $numero2;
                break;
            case "2":
                $resultado = $numero1 - $numero2;
                break;
            case "3":
                $resultado = $numero1 * $numero2;
                break;
            case "4":
                if ($numero2 != 0) {
                    $resultado = $numero1 / $numero2;
                } else {
                    $resultado = "Erro: divisão por zero";
                }
                break;
            default:
                $resultado = "Operação inválida";
        }
        // Retornando os números e a operação desejada
        return $resultado;
    }

    // Definindo os números e a operação desejada
    $numero1 = 10;
    $numero2 = 5;
    $operacao = '1';

    // Chamando a função calcular e exibindo o resultado
    echo "O resultado da operação é: " . calcular($numero1, $numero2, $operacao);
    ?>
</body>

</html>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exercício</title>
</head>

<body>
    <form action="index.php" method="get">
        Peso: <input type="text" name="peso" /> <br>
        Idade: <input type="text" name="idade" /> <br>
        <input type="submit" name="submit" value="Enviar">
    </form>

    <?php
    if (isset ($_GET["idade"]) && isset ($_GET["peso"])) {
        $idade = $_GET["idade"];
        $peso = $_GET["peso"];
        $risco = "";

        if ($idade < 18 && $peso < 50) {
            $risco = "Médio";
            echo "A idade é $idade anos e o peso é: $peso kg. A pessoa está no grupo de risco: $risco.";
        } elseif ($idade < 18 && $peso > 90 && $peso <= 120) {
            $risco = "Alto";
            echo "A idade é $idade anos e o peso é: $peso kg. A pessoa está no grupo de risco: $risco.";
        } else if ($idade > 30 && $peso > 80) {
            $risco = "Obesidade";
            echo "A idade é $idade anos e o peso é: $peso kg. A pessoa está no grupo de risco: $risco.";
        } else {
            echo "Valor Inválido.";
        }
    } else {
        echo "Por favor, preencha os campos corretamente.";
    }
    ?>
</body>

</html>
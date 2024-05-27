<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Divisão palavras</title>
</head>
<body>
    <form action="" method="post">
        <span>Digite uma palavra</span>
        <input type="text" name="word"/><br>

        <span>Digite um número</span>
        <input type="number" name="numero"/><br>

        <input type="submit" value="Dividir palavra">
    </form>

    <?php 
        //ceil() - Retorna  o próximo valor inteiro arredondando-se o número para cima, caso necessário.
        $word = $_POST['word'];
        $number = $_POST['numero'];
        $pedacos = ceil(strlen($word) / $number);
        echo "Os $number - pedaços da palavra $word são:<br>";

        for($i = 0; $i < $pedacos; $i++)
        {
            $pedaco = substr($word, $i * $number, $number);
           // var_dump($i*$number);
           echo $i + 1 . " - $pedaco <br>";
        }
    ?>

</body>
</html>
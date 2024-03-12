<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 02</title>
</head>

<body>

    <?php
    /* 
    1 - Variáveis sempre começam com o símbolo $;
    2 - Variáveis aceitam caracteres acentuados á, ç, õ, etc.
    3 - A linguagem é case sensitive em relação aos nomes;
    4 - Algumas palavras possuem uso reservado ($this, por exemplo);
    5 - Tente dar nomes claros e de fácil identificação;
    6 - Evite nomes muito curtos ou muito longos;
    */

    echo "Hello World!! <br> <br>";
    print "Hello World!! <br> <br>";

    $varPrint = print "Hello World!! <br> <br>";

    $varCorreto = "Correto";
    $_varCorreto = "Correto também";

    echo "Essa variável é do tipo: " . gettype($varCorreto);

    $varInt = 55;
    echo "Essa variável é do tipo: " . gettype($varInt);

    ?>



</body>

</html>
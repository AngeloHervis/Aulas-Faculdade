<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $lado1 = $_GET['lado1'];
        $lado2 = $_GET['lado2'];

        $area = $lado1*$lado2;
        $perimetro = 2*$lado1+2*$lado2;
    ?>

    <h2>Área</h2>

    <?php 
        if((!empty($lado1) and !empty($lado2)) and $lado1 > 0 and $lado2 > 0)
        {
            echo "A área do retângulo é " . $area;
        }
        else
        {
            echo "A área do retângulo não pode ser calculada, um dos lados é igual ou menor que zero";
        }
    ?>

    <h2>Perímetro</h2>

    <?php 
        if((!empty($lado1) and !empty($lado2)) and $lado1 > 0 and $lado2 > 0)
        {
            echo "O perímetro do retângulo é " . $perimetro;
        }
        else
        {
            echo "O perímetro do retângulo não pode ser calculado, um dos lados é igual ou menor que zero";
        }
    ?>

    <p><a href="javascript:history.go(-1)">Voltar para a página anterior</a></p>

</body>
</html>
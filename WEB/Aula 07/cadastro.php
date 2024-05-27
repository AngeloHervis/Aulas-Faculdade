<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
    <header>
        <h1>Usuário cadastrado</h1>
    </header>
    <main>
        <?php 

            $nome = $_GET['nome'];
            $sobrenome = $_GET['sobrenome'];

            if(!empty($nome) && !empty($_GET['sobrenome']))
            {
                echo "<p> Bem vindo ao site $nome $sobrenome</p>";
            }
            else
            {
                echo "Existem campos em branco. Favor verificar.";
            }
            
        ?>

        <p><a href="javascript:history.go(-1)">Voltar para a página anterior</a></p>

    </main>

    <?php 
    
    /*
        Implemente uma página onde o usuário informe os valores do lado de um retângulo (campos devem ficar centralizados na página criada). Crie outra página que receba os dados e exiba o valor da área e do perímetro do retângulo. Crie também um botão para voltar a página anterior e outro para limpar os campos do formulário. Faça as devidas validações nas entradas de dados.
    */
    
    ?>

</body>
</html>


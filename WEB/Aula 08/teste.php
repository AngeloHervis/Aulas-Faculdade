<?php 
    /*
    Crie um formulário onde o usuário informe os seguintes dados:
    - Nome;
    - E-mail;
    - Assunto;
    - Valor Custo;
    - Valor Venda;
    - Conteúdo (Deve ser um textArea).

    - Dados não devem ser enviados se algum campo estiver vazio (Não utilizar REQUIRED);
    - Dados não devem ser enviados se o preço de venda for menor que o preço de custo;
    - Dados não devem ser enviados se a estrutura do e-mail for inválido;
    - Caso os dados estejam corretos os dados devem ser enviados;
    - Deve-se implementar uma máscara para os inputs que contém valor monetário;
    - Mensagem(ns) para o usuário devem ser apresentada(s) em caso de sucesso ou erro.

-------------------------------------------------------------------------------------------------
        Desenvolva um código onde o usuário informe uma palavra qualquer, sendo que tal 
        palavra pode ser dividida em um número determinado de letras conforme a escolha 
        do usuário.
        Por exemplo:

        A palavra LINGUAGEM deve ser dividida em sílabas com 3 caracteres, logo tem-se:
        LIN
        GUA
        GEM

        Implemente um rodapé na página.

    */
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<script>
    function mascara(valor) {
        var valorAlterado = valor.value;
        valorAlterado = valorAlterado.replace(/\D/g, ""); // Remove todos os não dígitos
        valorAlterado = valorAlterado.replace(/(\d+)(\d{2})$/, "$1,$2"); // Adiciona a parte de centavos
        valorAlterado = valorAlterado.replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1."); // Adiciona pontos a cada três dígitos
        valorAlterado = "R$" + valorAlterado;
        valor.value = valorAlterado;
    }
</script>


<body>
    <h2>Formulário de vendas</h2>

    <form action="" method="POST">
        <label>Nome: </label>
        <input type="text" name="nome" placeholder="Digite seu nome"><br><br>

        <label>E-mail: </label>
        <input type="text" name="email" placeholder="Digite seu e-mail"><br><br>

        <label>Assunto: </label>
        <input type="text" name="assunto" placeholder="Assunto da mensagem"><br><br>

        <!--onkeyup - Tal evento executa a função toda vez que o usuário soltar a tecla digitada-->
        <!--Nesse contexto, a palavra-chave this faz referência ao elemento HTML que está acionando o evento HTML, neste caso o próprio INPUT-->

        <label>Valor Custo: </label>
        <input type="text" name="valorCusto" placeholder="Informe o valor" onkeyup="mascara(this)"><br><br>

        <label>Valor Venda: </label>
        <input type="text" name="valorVenda" placeholder="Informe o valor" onkeyup="mascara(this)"><br><br>

        <label>Conteúdo: </label>
        <textarea name="conteudo" rows="3" cols="50" placeholder="Conteúdo da mensagem"></textarea><br><br>

        <input type="submit" name="enviarMsg" value="Enviar"><br><br>
    </form>

        <?php 
            if(isset($_POST['enviarMsg']))
            {
                $nome = $_POST['nome'];
                $email = $_POST['email'];
                $assunto = $_POST['assunto'];
                $conteudo = $_POST['conteudo'];
                $precoCusto = $_POST['valorCusto'];
                $precoVenda = $_POST['valorVenda'];

                if(empty($_POST['nome']) || empty($_POST['email']) || empty($_POST['assunto']) || empty($_POST['conteudo']) || empty($_POST['valorCusto']) || empty($_POST['valorVenda']))
                {
                    echo "<p style='color:red;'>Erro! Necessário preencher todos os campos </p>";
                }
                if($precoVenda < $precoCusto)
                {
                    echo "O preço de venda precisa ser maior que o preço de custo";
                }
                
                //A função filter_var() filtra uma variável de um tipo especificado, neste caso um e-mail.
                //
                if(!filter_var($_POST['email'], FILTER_VALIDATE_EMAIL))
                {
                    echo "<p style='color:red;'>Erro! E-mail informado não é válido </p>";
                }

                if(($precoVenda > $precoCusto) and filter_var($_POST['email'], FILTER_VALIDATE_EMAIL))
                {
                    echo "<p style='color:green;'>Dados enviados com sucesso!</p>";
                }

            }

        ?>

</body>
</html>
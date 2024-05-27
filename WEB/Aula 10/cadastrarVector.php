<?php 
    include_once('./conexao.php');
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar</title>
</head>

<script>
    function mascaraCPF() 
    {
        var cpf = document.getElementById('cpf');
        if(cpf.value.length == 3 || cpf.value.length == 7)
        {
          cpf.value += ".";
        }
        else if(cpf.value.length == 11)
        {
          cpf.value += "-";
        }
    }
</script>

<body>
    <h1>Cadastrar</h1>

    <?php 
        /*if(empty($_GET['nome']))
        {
            echo "Informe o nome do usuário <br>";
        }
        else
        {
            $nome = $_GET['nome'];
        }*/

        $dados = filter_input_array(INPUT_GET, FILTER_DEFAULT);

        if(!empty($dados['cadastrarUsu']))
        {

            $dadosCpf = str_replace(".", "", $dados['cpf']);
            $dados['cpf'] = str_replace("-", "", $dadosCpf);
            //var_dump($dadosCpf);

            $queryUsu = "INSERT INTO teste.tab_usuario (nomeUsu, estadoCivil, cpf, profissao) VALUES ('".$dados['nome']."',
            '".$dados['estadoCivil']."', '".$dados['cpf']."', '".$dados['profissao']."')";

            $cadUsuario = $pdo->prepare($queryUsu);
            $cadUsuario->execute();

            //rowCount() retorna o número de linhas afetadas por um INSERT/UPDATE/DELETE
            if($cadUsuario->rowCount())
            {
                echo "<p style='color: green;'> Usuário cadastrado com sucesso!</p><br>";
            }
            else
            {
                echo "<p style='color: red;'> ERRO: Usuário não cadastrado!</p><br>";
            }
        }
    ?>

    <form name="cadastrarUsuario" method="GET" action="">
        <label>Nome:</label>
        <input type="text" name="nome" id="nome" placeholder="Nome completo"><br><br>

        <label>Estado Civil:</label>
        <select name="estadoCivil" id="estadoCivil">
            <option value="opcao">Escolha uma opção</option>
            <option value="Casado">Casado</option>
            <option value="Solteiro">Solteiro</option>
            <option value="Não Informar">Não Informar</option>
        </select><br><br>

        <label>CPF:</label>
        <input type="text" name="cpf" id="cpf" placeholder="Informe seu CPF" maxlength="14" onkeyup="mascaraCPF()"><br><br>

        <label>Profissão:</label>
        <input type="text" name="profissao" id="profissao" placeholder="Informe sua Profissão"><br><br>

        <input type="submit" value="cadastrar" name="cadastrarUsu"><br><br>
    </form>

    

</body>
</html>
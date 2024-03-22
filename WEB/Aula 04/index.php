<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Tarefas</title>
</head>

<body>
    <h1>Lista de Tarefas</h1>

    <?php
    // Verifica se há tarefas enviadas via método POST e adiciona à lista
    if (isset ($_POST["tarefa"]) && !empty ($_POST["tarefa"])) {
        $tarefa = $_POST["tarefa"];
        $listaTarefas[] = $tarefa;
    } else {
        // Caso não haja tarefas, define a lista como vazia
        $listaTarefas = array();
    }

    // Exibe a lista de tarefas
    if (!empty ($listaTarefas)) {
        echo "<ul>";
        foreach ($listaTarefas as $tarefa) {
            echo "<li>$tarefa</li>";
        }
        echo "</ul>";
    } else {
        echo "<p>Não há tarefas na lista.</p>";
    }
    ?>

    <!-- Formulário para adicionar novas tarefas -->
    <h2>Adicionar Nova Tarefa</h2>
    <form method="POST" action="">
        <input type="text" name="tarefa" placeholder="Digite uma nova tarefa">
        <button type="submit">Adicionar Tarefa</button>
    </form>
</body>

</html>
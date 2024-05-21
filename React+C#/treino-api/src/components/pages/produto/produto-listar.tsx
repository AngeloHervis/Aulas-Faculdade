import { useEffect } from "react";

function ProdutoListar() {
  useEffect(() => {
    console.log("Listar Produtos");
    carregarDados();
  }, []);

  function carregarDados() {
    //FETCH ou AXIOS
    fetch("https://viacep.com.br/ws/83810000/json/")
      .then((resposta) => resposta.json())
      .then((dados) => console.log(dados));
  }

  return (
    <div>
      <h1>Listar Produtos</h1>
    </div>
  );
}

export default ProdutoListar;

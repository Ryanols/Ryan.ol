let lista_usuarios = [];
let livros = [
    "Harry Potter e a Pedra Filosofal",
    "O Pequeno Príncipe",
    "Diários de um Banana",
    "Alice no País das Maravilhas"
];

// Carrega a lista de usuários do localStorage
function carregar_usuarios() {
    let usuarios = localStorage.getItem("usuarios");
    lista_usuarios = usuarios ? JSON.parse(usuarios) : [];
}

// Salva a lista de usuários no localStorage
function salvar_usuarios() {
    localStorage.setItem("usuarios", JSON.stringify(lista_usuarios));
}

// Função para salvar um novo usuário no cadastro
function salvar_cadastro() {
    carregar_usuarios(); // Garante que temos a lista atualizada

    let novonome = document.getElementById("novo_usuario").value.trim();
    let novasenha = document.getElementById("nova_senha").value.trim();

    if (novonome === "" || novasenha === "") {
        alert("Preencha os campos!");
        return;
    }

    // Verifica se o usuário já existe
    let usuario_existente = lista_usuarios.find(usuario => usuario.nome === novonome);
    if (usuario_existente) {
        alert("Usuário já cadastrado!");
        return;
    }

    // Adiciona o novo usuário à lista
    lista_usuarios.push({ nome: novonome, senha: novasenha });
    salvar_usuarios(); // Salva no localStorage

    alert("Cadastro realizado com sucesso!");

    // Limpa os campos após o cadastro
    document.getElementById("novo_usuario").value = "";
    document.getElementById("nova_senha").value = "";

    // Fecha a janela de cadastro, se for aberta via `window.open`
    if (window.opener) {
        window.close();
    }
}

// Função para abrir a tela de cadastro
function cadastro() {
    // Redireciona para a página de cadastro
    window.location.href = "Cadastro.html";
}

// Função de login
function entrar() {
    carregar_usuarios(); // Carrega os usuários antes de verificar o login

    let nome = document.getElementById("usuario").value.trim();
    let senha = document.getElementById("senha").value.trim();

    if (nome === "" || senha === "") {
        alert("Preencha todos os campos!");
        return;
    }

    // Verifica se o usuário existe na lista
    let usuario_encontrado = lista_usuarios.find(usuario => usuario.nome === nome && usuario.senha === senha);

    if (usuario_encontrado) {
        alert("Login bem-sucedido!");
        window.location.href = "Principal.html"; // Certifique-se de que esta página existe
    } else {
        alert("Usuário ou senha incorretos!");
    }
}

// Função para pesquisar livros e exibir os resultados
function mandar() {
    let termoPesquisa = document.getElementById("pesquisa").value.trim().toLowerCase();
    let resultados = livros.filter(livro => livro.toLowerCase().includes(termoPesquisa));

    mostrarResultados(resultados);
}

// Exibe os livros encontrados na tela
function mostrarResultados(resultados) {
    let resultadosDiv = document.getElementById("resultados");
    resultadosDiv.innerHTML = ''; // Limpa resultados anteriores

    if (resultados.length === 0) {
        const mensagem = document.createElement("p");
        mensagem.textContent = "Nenhum livro encontrado.";
        resultadosDiv.appendChild(mensagem);
    } else {
        const lista = document.createElement("ul");
        resultados.forEach(livro => {
            const item = document.createElement("li");
            item.textContent = livro;
            lista.appendChild(item);
        });
        resultadosDiv.appendChild(lista);
    }
}

// Permite pesquisar pressionando "Enter"
document.getElementById("pesquisa").addEventListener("keypress", function(event) {
    if (event.key === "Enter") {
        mandar();
    }
});

function carregar() {
    // Obtém a referência para o elemento com o id 'msg'
    var msg = window.document.getElementById('msg');

    // Obtém a referência para o elemento com o id 'imagem'
    var img = window.document.getElementById('imagem');

    // Cria um novo objeto Date para obter a hora atual do sistema
    var data = new Date();

    // Obtém a hora atual do sistema
    var hora = data.getHours();

    // Define o conteúdo do elemento 'msg' com a hora atual
    msg.innerHTML = `Agora são ${hora} horas.`;
    
    // Verifica em qual período do dia estamos e atualiza a imagem de acordo com a hora
    if (hora >= 0 && hora < 12 ){
        img.src = 'manha.jpg'; // Define a imagem da manhã
        document.body.style.background = '#e2cd9f'; // Define o fundo do corpo como cor clara para a manhã
    } else if (hora >= 12 && hora < 18 ) {
        img.src = 'tarde.jpg'; // Define a imagem da tarde
        document.body.style.background = '#b9846f'; // Define o fundo do corpo como cor mais escura para a tarde
    } else {
        img.src = 'noite.jpg'; // Define a imagem da noite
        document.body.style.background = '#515154'; // Define o fundo do corpo como cor escura para a noite
    }
}
a
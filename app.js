(function() {
    emailjs.init("CVZxDNmGpMxDe65At"); // Pegue no painel do EmailJS
})();

function sendEmail(event) {
    event.preventDefault();

    emailjs.sendForm("service_286gy4i", "template_utrtxtu", event.target)
        .catch(() => alert("Mensagem enviada com sucesso!"))
        event.target.reset()
}


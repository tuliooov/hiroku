/*!
    * Start Bootstrap - Freelancer v6.0.1 (https://startbootstrap.com/themes/freelancer)
    * Copyright 2013-2020 Start Bootstrap
    * Licensed under MIT (https://github.com/BlackrockDigital/startbootstrap-freelancer/blob/master/LICENSE)
    */

/*
Coisas para implementar:
- modal para o suário explicar o motivo do status ok
- alert que aparece quando o usuário checka o status de uma URL: com a quantidade dos votos em cada status
*/

let usuarios = JSON.parse(localStorage.getItem("usuarios"));

if (usuarios == null) {
  localStorage.setItem("usuarios", "[]");
  usuarios = [];
}


/*
login e senha:
ID: 
nome:
saldo:
*/

const verificacao = JSON.parse(localStorage.getItem("logado"));

if (!verificacao) {
  $('#loginModal').modal('show')
}else{
  opcaoSair.style.display = "";
}

function iniciarLogin(json){
  opcaoSair.style.display = "";
  $('#loginModal').modal('hide')
  $('#cadastrarModal').modal('hide')
  usuario.value = "";
  senha.value = "";
  localStorage.setItem("logado", JSON.stringify(json));
}

$(window).on('load', function() {
  $("#form-login").submit(function(e){      
    e.preventDefault();       
    // Exemplo de requisição POST
    var ajax = new XMLHttpRequest();

    // Seta tipo de requisição: Post e a URL da API
    ajax.open("POST", "http://localhost:9393/login", true);
    ajax.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    // Seta paramêtros da requisição e envia a requisição
    ajax.send(`usuario=${usuario.value}&senha=${senha.value}`);

    // Cria um evento para receber o retorno.
    ajax.onreadystatechange = function() {
      
      // Caso o state seja 4 e o http.status for 200, é porque a requisiçõe deu certo.
      if (ajax.status == 200) {
        console.log(ajax);
        var data = JSON.parse(ajax.responseText);
        console.log(data);
        if(data.idUsuario != -1){
          iniciarLogin(data)
        }else{
          alert("Não foi possivel realizar seu login")
        }
      }else{
        console.log("Algo deu errado ao fazer login")
      }
    }
  });


  $("#form-cadastro").submit(function(e){      
    e.preventDefault();       
    // Exemplo de requisição POST
    var ajax = new XMLHttpRequest();

    // Seta tipo de requisição: Post e a URL da API
    ajax.open("POST", "http://localhost:9393/adicionarUsuario", true);
    ajax.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    // Seta paramêtros da requisição e envia a requisição
    ajax.send(`usuario=${usuarioC.value}&senha=${senhaC.value}`);

    // Cria um evento para receber o retorno.
    ajax.onreadystatechange = function() {
      
      // Caso o state seja 4 e o http.status for 200, é porque a requisiçõe deu certo.
      if (ajax.status == 200) {
        console.log(ajax);
        var data = JSON.parse(ajax.responseText);
        console.log(data);
        
        if(data.idUsuario != -1 ){
          iniciarLogin(data);
        }else{
          alert("Não foi possivel cadastrar seu usuario");
        }
        
      }else{
        console.log("Algo deu errado ao fazer cadastrar usuario")
      }
    }
  });


})

function buscarCidadesDoEstado(){
  // console.log(cidade.value)
  var ajax = new XMLHttpRequest();

  // Seta tipo de requisição: Post e a URL da API
  ajax.open("POST", "http://localhost:9393/buscarCidadesDoEstado", true);
  ajax.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

  // Seta paramêtros da requisição e envia a requisição
  ajax.send(`estado=${estado.value}`);

  // Cria um evento para receber o retorno.
  ajax.onreadystatechange = function() {
    
    // Caso o state seja 4 e o http.status for 200, é porque a requisiçõe deu certo.
    if (ajax.status == 200) {
      console.log(ajax);
      var data = JSON.parse(ajax.responseText);
      console.log("retorno cidades> ", data);
      
      if(data != null && data.length > 0){
        inserirCidadesSelect(data);
      }else{
        divSelectCidades.style.display = "none"
        buscarCandidatos.style.display = "none"
        candidatos.style.display = "none"
        // alert("Estado não disponivel");
      }
      
    }else{
      console.log("Algo deu errado ao buscar por cidade")
    }
  }
}

function inserirCidadesSelect(cidades){
  var string = `<option selected value="-1">Nenhum</option>`
  cidades.forEach((cidade, index) => {
    string += `<option value="${cidade}">${cidade}</option>`
  });

  selectCidades.innerHTML = string
  divSelectCidades.style.display = ""
  buscarCandidatos.style.display = ""
  // 

}

function buscarCandidadosPorCidade(){
  // console.log(cidade.value)
  var ajax = new XMLHttpRequest();
  const logado = JSON.parse(localStorage.getItem('logado'))
  // Seta tipo de requisição: Post e a URL da API
  ajax.open("POST", "http://localhost:9393/buscarCandidadosPorCidade", true);
  ajax.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

  // Seta paramêtros da requisição e envia a requisição
  ajax.send(`cidade=${selectCidades.value}&estado=${estado.value}&idUsuario=${logado.idUsuario}`);

  // Cria um evento para receber o retorno.
  ajax.onreadystatechange = function() {
    
    // Caso o state seja 4 e o http.status for 200, é porque a requisiçõe deu certo.
    if (ajax.status == 200) {
      console.log(ajax);
      var data = JSON.parse(ajax.responseText);
      console.log("retorno candidatos> ", data);
      
      if(data != null && data.length > 0 ){
        inserirCandidatus(data);
      }else{
        alert("Nenhuma candidatura encontrada!");
        candidatos.style.display = "none"
      }
      
    }else{
      console.log("Algo deu errado ao buscar por cidade")
    }
  }
}

function inserirCandidatus(candidaturas){
  var prefeitos = "";
  var vereadores = "";

  candidaturas.forEach(candidatura => {
    var string = `<div class="col-sm-3" style="margin: 0.5em 0;">
                    <div class="card">
                      <div class="card-body">
                        <h5 class="card-title">${candidatura.candidato.nomeUrna}</h5>
                        <p class="card-text">${candidatura.candidato.ocupacao}</p>
                        <p class="card-text">${candidatura.id} - ${candidatura.partidoComposicao}</p>
                        <button class="btn btn-default" onClick="like(${candidatura.id})">
                          <i style="color: ${candidatura.liked ? '#28a745' : ''}" class="${candidatura.liked ? 'fas' : 'far'} fa-thumbs-up" id="like_${candidatura.id}" cidade="${candidatura.cidade}" estado="${candidatura.uf}"></i><span id="likes_${candidatura.id}" >${candidatura.avaliacoes.likes}</span>
                        </button>
                        <button class="btn btn-default" onClick="deslike(${candidatura.id})">
                          <i style="color: ${candidatura.desliked ? '#dc3545' : ''}" class="${candidatura.desliked ? 'fas' : 'far'} fa-thumbs-down" id="deslike_${candidatura.id}" cidade="${candidatura.cidade}" estado="${candidatura.uf}"></i><span id="deslikes_${candidatura.id}">${candidatura.avaliacoes.deslikes}</span>
                        </button>
                        <button class="btn btn-default" data-toggle="modal" data-target="#mensagemModal" onClick="buscarComentarios(${candidatura.id}, '${candidatura.cidade}', '${candidatura.uf}')"><i class="far fa-comments"></i><span id="comentarios_${candidatura.id}">${candidatura.avaliacoes.comentarios}</button>
                      </div>
                    </div>
                  </div>`

    if(candidatura.cargo == "PREFEITO"){
      prefeitos +=  string
    }else if(candidatura.cargo == "VEREADOR"){
      vereadores += string
    }    
  });


  divPaiPrefeito.innerHTML = prefeitos
  divPaiVereador.innerHTML = vereadores
  candidatos.style.display = ""
  // window.location.href += "#candidatos"
  scroll("candidatos");

}


function buscarComentarios(candidaturaId, cidade, estado){
  var ajax = new XMLHttpRequest();
  const logado = JSON.parse(localStorage.getItem('logado'))

  // Seta tipo de requisição: Post e a URL da API
  ajax.open("POST", "http://localhost:9393/buscarComentarios", true);
  ajax.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

  // Seta paramêtros da requisição e envia a requisição
  ajax.send(`candidaturaId=${candidaturaId}&cidade=${cidade}&estado=${estado}`);

  // Cria um evento para receber o retorno.
  ajax.onreadystatechange = function() {
    
    // Caso o state seja 4 e o http.status for 200, é porque a requisiçõe deu certo.
      console.log(ajax);
      var data = JSON.parse(ajax.responseText);
      console.log(data);
      var comentarios = ``
      if(data){
        data.forEach(comentario => {
            comentarios += `<div class="col-12" style="margin: 0.5em 0;">
            <div class="card">
                <div class="card-header">
                ${comentario.nomeUsuario}
                </div>
                <div class="card-body">
                    <blockquote class="blockquote mb-0">
                    <p>${comentario.comentario}</p>
                    <footer class="blockquote-footer">${comentario.nomeUsuario}</footer>
                    </blockquote>
                </div>
            </div>
        </div>`
          });
      }
      comentarios+=`
      <div class="col-12" style="margin: 0.5em 0;" >
                    <div class="input-group mb-3">
                      <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">Comentar:</span>
                      </div>
                      <input required id="comentar" name="comentar"  class="form-control" placeholder="Comentario" aria-label="Comentario" aria-describedby="basic-addon1">
                    </div></div>
                    <div class="col-12" style="margin: 0.5em 0;">
                      <button onClick="comentar(${candidaturaId}, ${logado.idUsuario}, '${cidade}', '${estado}')" class="btn btn-primary" >Comentar</button>
                    </div>
                    `
      document.getElementById('comentarios').innerHTML = comentarios
    
  }
}

function comentar(candidaturaId, idUsuario, cidade, estado){
  const comentario = document.getElementById('comentar').value


  var ajax = new XMLHttpRequest();

  // Seta tipo de requisição: Post e a URL da API
  ajax.open("POST", "http://localhost:9393/avaliar", true);
  ajax.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

  // Seta paramêtros da requisição e envia a requisição
  ajax.send(`candidaturaId=${candidaturaId}&usuarioId=${idUsuario}&cidade=${cidade}&estado=${estado}&comentario=${comentario}&acao=comentario`);


  // Cria um evento para receber o retorno.
  ajax.onreadystatechange = function() {
    
    if (ajax.status == 200) {
      console.log(ajax);
      var data = JSON.parse(ajax.responseText);
      console.log(data);
      buscarComentarios(candidaturaId, cidade, estado)
    }
  }

  return false

}

function like(id){
  const like = document.querySelector(`#like_${id}`)
  like.setAttribute("data-prefix", "fas");

  const deslike = document.querySelector(`#deslike_${id}`)
  deslike.setAttribute("data-prefix", "far");

  if(like.getAttribute("votado") != "true" ){
    const logado = JSON.parse(localStorage.getItem('logado'))
    var ajax = new XMLHttpRequest();

    // Seta tipo de requisição: Post e a URL da API
    ajax.open("POST", "http://localhost:9393/avaliar", true);
    ajax.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    // Seta paramêtros da requisição e envia a requisição
    ajax.send(`candidaturaId=${id}&usuarioId=${logado.idUsuario}&like=true&deslike=false&cidade=${like.getAttribute("cidade")}&estado=${like.getAttribute("estado")}&acao=likeDeslike`);

    // Cria um evento para receber o retorno.
    ajax.onreadystatechange = function() {
      
      // Caso o state seja 4 e o http.status for 200, é porque a requisiçõe deu certo.
      if (ajax.status == 200) {
        console.log(ajax);
        var data = JSON.parse(ajax.responseText);
        console.log(data);
        if(data.candidaturaId != -1){
          document.getElementById(`likes_${id}`).innerText = data.likes
          document.getElementById(`deslikes_${id}`).innerText = data.deslikes
          document.getElementById(`comentarios_${id}`).innerText = data.comentarios
        }else{
          // alert("Não foi possivel realizar seu login")
        }
      }else{
        // console.log("Algo deu errado ao fazer login")
      }
    }
    like.setAttribute("votado", "true")
    deslike.setAttribute("votado", "false")
  }
  

  like.style.color="#28a745"
  deslike.style.color=""
}

function deslike(id){
  const like = document.querySelector(`#like_${id}`)
  like.setAttribute("data-prefix", "far");

  const deslike = document.querySelector(`#deslike_${id}`)
  deslike.setAttribute("data-prefix", "fas");

  if(deslike.getAttribute("votado") != "true" ){
    const logado = JSON.parse(localStorage.getItem('logado'))
    var ajax = new XMLHttpRequest();

    // Seta tipo de requisição: Post e a URL da API
    ajax.open("POST", "http://localhost:9393/avaliar", true);
    ajax.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    // Seta paramêtros da requisição e envia a requisição
    ajax.send(`candidaturaId=${id}&usuarioId=${logado.idUsuario}&like=false&deslike=true&cidade=${like.getAttribute("cidade")}&estado=${like.getAttribute("estado")}&acao=likeDeslike`);

    // Cria um evento para receber o retorno.
    ajax.onreadystatechange = function() {
      
      // Caso o state seja 4 e o http.status for 200, é porque a requisiçõe deu certo.
      if (ajax.status == 200) {
        console.log(ajax);
        var data = JSON.parse(ajax.responseText);
        console.log(data);
        if(data.candidaturaId != -1){
          document.getElementById(`likes_${id}`).innerText = data.likes
          document.getElementById(`deslikes_${id}`).innerText = data.deslikes
          document.getElementById(`comentarios_${id}`).innerText = data.comentarios
        }else{
          // alert("Não foi possivel realizar seu login")
        }
      }else{
        // console.log("Algo deu errado ao fazer login")
      }
    }
    deslike.setAttribute("votado", "true")
    like.setAttribute("votado", "false")
  }

  like.style.color=""
  deslike.style.color="#dc3545"
}

function cadastrar(event){
  event.preventDefault();
  console.log("cadastrar");
  const nome = nomeC.value
  const email = emailC.value
  const senha1 = senha1C.value
  const senha2 = senha2C.value
    if(senha1 != senha2){
      alert("As senhas não são iguais")
      return false;
    }
    for(let i = 0; i < usuarios.length; i++){
      if(usuarios[i].email == email){
          alert("Já está cadastrado este e-mail!");
          return false
      }
    }
    const date = {
      "id": usuarios.length+1,
      "nome": nome,
      "email": email,
      "senha": senha1,
      "saldo": 0,
    };

    usuarios.push(date);
    localStorage.setItem("usuarios", JSON.stringify(usuarios));
    $('#cadastrarModal').modal('hide')
    nomeC.value = "";
    emailC.value = "";
    senha1C.value = "";
    senha2C.value = "";
}

function deslogar(){
  localStorage.removeItem("logado");
  opcaoSair.style.display = "none";
  $('#loginModal').modal('show')
}






(function ($) {
  "use strict"; // Start of use strict

  // Smooth scrolling using jQuery easing
  $('a.js-scroll-trigger[href*="#"]:not([href="#"])').click(function () {
    if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') && location.hostname == this.hostname) {
      var target = $(this.hash);
      target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
      if (target.length) {
        $('html, body').animate({
          scrollTop: (target.offset().top - 71)
        }, 1000, "easeInOutExpo");
        return false;
      }
    }
  });

  // Scroll to top button appear
  $(document).scroll(function () {
    var scrollDistance = $(this).scrollTop();
    if (scrollDistance > 100) {
      $('.scroll-to-top').fadeIn();
    } else {
      $('.scroll-to-top').fadeOut();
    }
  });

  // Closes responsive menu when a scroll trigger link is clicked
  $('.js-scroll-trigger').click(function () {
    $('.navbar-collapse').collapse('hide');
  });

  // Activate scrollspy to add active class to navbar items on scroll
  $('body').scrollspy({
    target: '#mainNav',
    offset: 80
  });

  // Collapse Navbar
  var navbarCollapse = function () {
    if ($("#mainNav").offset().top > 100) {
      $("#mainNav").addClass("navbar-shrink");
    } else {
      $("#mainNav").removeClass("navbar-shrink");
    }
  };
  // Collapse now if page is not at top
  navbarCollapse();
  // Collapse the navbar when page is scrolled
  $(window).scroll(navbarCollapse);

  // Floating label headings for the contact form
  $(function () {
    $("body").on("input propertychange", ".floating-label-form-group", function (e) {
      $(this).toggleClass("floating-label-form-group-with-value", !!$(e.target).val());
    }).on("focus", ".floating-label-form-group", function () {
      $(this).addClass("floating-label-form-group-with-focus");
    }).on("blur", ".floating-label-form-group", function () {
      $(this).removeClass("floating-label-form-group-with-focus");
    });
  });

})(jQuery); // End of use strict


function scroll(element){   
  var ele = document.getElementById(element);   
  window.scrollTo(ele.offsetLeft,ele.offsetTop); }
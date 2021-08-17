document.addEventListener("DOMContentLoaded", function() {

    var boton = document.getElementById("boton");
    boton.addEventListener("click", () => {
        var num = document.getElementById('num').value;
        console.log("num:", num);
                
        for (var i = 0; i < num; i++){ 
            var text = document.createElement('h2');
            var input = document.createElement('input');

            text.innerText = "Parametro "+i;
            input.setAttribute("type","text");
            input.setAttribute("name","Parametro_"+i);

            document.getElementById("form").appendChild(text);
            document.getElementById("form").appendChild(input);
        }

        var submit = document.createElement('input');
        submit.setAttribute('type','submit');
        document.getElementById("form").appendChild(submit);
    });
});
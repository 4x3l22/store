function guardar(){
    $("#btnRegistrar").prop("disabled", true);
    const url = "http://localhost:9000/shoes-store/api/v1/clientes/registrocliente";
    const data ={
        "tipoidentificacion": $("#tipedocumento").val(),
        "identificacion": $("#identifi").val(),
        "nombreCliente": $("#name").val(),
        "apellidoCliente": $("#apellido").val(),
        "telefono": $("#telefono").val(),
        "direccion": $("#direccion").val(),
        "ciudad": $("#ciudad").val(),
        "estado": true
    }
    $.ajax({
        url: url,
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(data),
        success: function(response){

            Swal.fire({
                title: "¡Bien Hecho!",
                text: "Dados de cliente guardados",
                icon: "success"
            });
            $('#modalClienteRegistro').modal('hide');
        },
        error: function(response){
            Swal.fire({
                title: "¡No se pudo!",
                text: "no se puden guardar los datos",
                icon: "error"
            });

        }
    })
}

function loadCliente(){
    console.log("ejecutando loadData");
    $.ajax({
        url: "http://localhost:9000/shoes-store/api/v1/clientes/listarclientes",
        method: "GET",
        dataType: "json",
        success: function(response) {
            console.log(response);
            var html = "";
            response.forEach(function(item) {
                let esta = item.estado;
                if (esta === true) {
                   var estado = "activo"
                }else{
                    var estado = "Inactivo"
                }

                var checkedAttr = esta === true ? 'checked' : '';

                if (!item.deletedAt) {

                    html += `
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.tipoidentificacion}</td>
                        <td>${item.identificacion}</td>
                        <td>${item.nombreCliente}</td>
                        <td>${item.apellidoCliente}</td>
                        <td>${item.telefono}</td>
                        <td>${item.direccion}</td>
                        <td>${item.ciudad}</td>
                        <td>${estado}</td>
                        <td>
                            <button class="btn btn-primary"><i class="bi bi-pencil-square"></i> Editar</button>
                            <button class="btn btn-danger"><i class="bi bi-trash3-fill"></i>Eliminar</button>
                            <div class="form-check form-switch">
                                <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" value="${item.estado}" ${checkedAttr} onclick="alerta()">                                
                            </div>
                        </td>
                    </tr>
                    `;
                }
            });
            $("#resumenVentas").html(html);
        },

        error: function (error) {
            console.error("Error en la solicitud:", error);
        },
    });
}
function alerta(){
    alert($("#flexSwitchCheckDefault").val());
}
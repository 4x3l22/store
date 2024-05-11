function clientes() {
    let html = `
        <h1>Clientes</h1>
        <div class="row">
            <div class="parametrosform">
                <div class="row">
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="filtronombre">Filtrar por Nombre:</label>
                            <input type="text" class="form-control" name="filtronombre" id="filtronombre">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="filtrociudad">Filtrar por Ciudad:</label>
                            <input type="date" class="form-control" name="filtrociudad" id="filtrociudad">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="filtroestado">Filtrar por Estado:</label>
                            <input type="text" class="form-control" name="filtroestado" id="filtroestado">
                        </div>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6">
                        <button class="btn btn-primary">Filtrar</button>
                    </div>
                     <div class="col-md-6 aliniarderecha">
                        <button data-bs-toggle="modal" data-bs-target="#modalClienteRegistro" class="btn btn-success"><i class="bi bi-person-plus-fill"></i>  Agregar Nuevo Cliente</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="row cuadrar_tabla">
            <table id="ventas">
                <tr class="mitr">
                    <th scope="col">ID Cliente</th>
                    <th scope="col">Tipo Identificación</th>
                    <th scope="col">identificacion</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Télefono</th>
                    <th scope="col">Dirección</th>
                    <th scope="col">Ciudad</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Acciones</th>
                </tr>
                <tbody id="resumenVentas">
                
                </tbody>
                <!--<tfoot id="pagination">
                    <nav aria-label="Page navigation example">
                      <ul class="pagination">
                        <li class="page-item">
                          <a class="page-link" href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                          </a>
                        </li>
                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item">
                          <a class="page-link" href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                          </a>
                        </li>
                      </ul>
                    </nav>
                </tfoot>-->
            </table>
        </div>
        <div class="modal fade" id="modalClienteRegistro" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Registrar Cliente</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="">
                            <form id="formularioCliente" method="post">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="name">Nombre</label>
                                            <input type="text" id="name" name="name" class="form-control" required>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="apellido">apellido</label>
                                            <input type="text" id="apellido" name="apellido" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="ciudad">Ciudad</label>
                                            <input type="text" id="ciudad" name="ciudad" class="form-control" required>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="direccion">Dirección</label>
                                            <input type="text" id="direccion" name="direccion" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="identifi">identificación</label>
                                            <input type="text" id="identifi" name="identifi" class="form-control" required>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="telefono">Teléfono</label>
                                            <input type="text" id="telefono" name="telefono" class="form-control" required>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="tipedocumento">Tipo documento</label>
                                            <input type="text" id="tipedocumento" name="tipedocumento" class="form-control" required>
                                        </div>
                                    </div>
                                    <div class="col-md-6 ajus">
                                        <div class="boton">
                                            <button type="button" id="btnRegistrar" class="btn btn-primary" onclick="guardar()">Registrar</button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                    </div>
                </div>
            </div>
        </div>
      
        <script>
            loadCliente();
        </script>
    `;

    $(".active").removeClass("active").addClass("none");
    $("#clientes").addClass("active");
    $("#contenido").html(html);
}

function ventas(){

    let html = `
    
        <h1>Ventas</h1>
        <div class="row">
            <div class="parametrosform">
                <div class="row">
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="filtrocliente">Filtrar por Cliente:</label>
                            <input type="text" class="form-control" name="filtrocliente" id="filtrocliente">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="fechadesde">Fecha de venta desde:</label>
                            <input type="date" class="form-control" name="fechadesde" id="fechadesde">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="fechahasta">Fecha de venta hasta:</label>
                            <input type="date" class="form-control" name="fechahasta" id="fechahasta">
                        </div>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-4">
                        <button class="btn btn-primary">Filtrar</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <table id="ventas">
                <tr class="mitr">
                    <th scope="col">ID venta</th>
                    <th scope="col">ID Cliente</th>
                    <th scope="col">Fecha de la venta</th>
                    <th scope="col">Estado venta</th>
                    <th scope="col">Total</th>
                    <th scope="col">Acciones</th>
                </tr>
                <tr id="resumenVentas">
                
                </tr>
            </table>
        </div>
    
    `;

    $(".active").removeClass("active").addClass("none");
    $("#ventas").addClass("active");
    $("#contenido").html(html);
}
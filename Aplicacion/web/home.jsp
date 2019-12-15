<%-- 
    Document   : home
    Created on : 09-dic-2019, 17:17:17
    Author     : Christian Quiroz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="views/header.jsp"></jsp:include>
    <main style="height: " class="container">
        <form class="p-5">
            <section class="datos-empresa row d-flex justify-content-center">
                <div class="col-xl-8">
                    <div>
                        <h4 class="text-center">Empresa</h4>
                        <div class="form-group row">
                            <label for="txtRrt" class="col-sm-2 col-form-label">Rut</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="txtRut" placeholder="Ingrese rut de la empresa" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="txtRrt" class="col-sm-2 col-form-label">Nombre</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="txtRut" placeholder="Ingrese nombre de la empresa" required>
                            </div>
                        </div>               
                        <div class="form-group row">
                            <label for="txtRrt" class="col-sm-2 col-form-label">Direccion</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="txtRut" placeholder="Ingrese direccion de la empresa" required>
                            </div>
                        </div>             
                        <div class="form-group row">
                            <label for="txtRrt" class="col-sm-2 col-form-label">Nombre del comprador</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="txtRut" placeholder="Ingrese su nombre" required>
                            </div>
                        </div>
                    </div>
                </div>

            </section>
            <section class>
                <div class="m-5">
                    <!-- aqui va el agregar--><select class="browser-default custom-select custom-select-lg mb-3">
                        <option selected>Open this select menu</option>
                        <option value="1">One</option>
                        <option value="2">Two</option>
                        <option value="3">Three</option>
                    </select>
                </div>
                <div class="row">
                    <div class="col-sm-2">
                        <div class="m-2">
                            <div class="h6">Seleccione opcion de pago</div>
                            <div class="custom-control custom-radio">
                                <input type="radio" class="custom-control-input" id="defaultUnchecked" name="defaultExampleRadios">
                                <label class="custom-control-label text-white" for="defaultUnchecked">
                                    Default unchecked
                                </label>
                            </div>

                            <!-- Default checked -->
                            <div class="custom-control custom-radio">
                                <input type="radio" class="custom-control-input text-white" id="defaultChecked" name="defaultExampleRadios" checked>
                                <label class="custom-control-label text-white" for="defaultChecked">Default chec ked</label>
                            </div>
                        </div>
                        <div class="m-2">
                            <div class="h6">Seleccione opcion de retiro</div>
                            <div class="custom-control custom-radio">
                                <input type="radio" class="custom-control-input "id="defaultUnchecked1" name="defaultExampleRadios1">
                                <label class="custom-control-label text-white" for="defaultUnchecked1">Default unchecked</label>
                            </div>

                            <!-- Default checked -->
                            <div class="custom-control custom-radio">
                                <input type="radio" class="custom-control-input text-white" id="defaultChecked1" name="defaultExampleRadios1" checked>
                                <label class="custom-control-label text-white" for="defaultChecked1">Default chec ked</label>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-10 table-wrapper-scroll-y my-custom-scrollbar">
                        <table class="highlight  table-sm" scrollY>
                            <thead>
                                <tr>
                                    <th>Name</th>
                                    <th>Item Name</th>
                                    <th>Item Price</th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr>
                                    <td>Alvin</td>
                                    <td>Eclair</td>
                                    <td>$0.87</td>
                                </tr>
                                <tr>
                                    <td>Alan</td>
                                    <td>Jellybean</td>
                                    <td>$3.76</td>
                                </tr>
                                <tr>
                                    <td>Jonathan</td>
                                    <td>Lollipop</td>
                                    <td>$7.00</td>
                                </tr>
                                <tr>
                                    <td>Jonathan</td>
                                    <td>Lollipop</td>
                                    <td>$7.00</td>
                                </tr>
                                <tr>
                                    <td>Jonathan</td>
                                    <td>Lollipop</td>
                                    <td>$7.00</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <div class="col-xl-12">
                        <div class="row m-5">
                            <div class="col-lg-8 h1">
                                TOTAL A PAGAR $
                            </div>
                            <div class="col-lg-4 d-flex justify-content-center">
                                <button type="submit" class="btn btn-default">Default</button>
                            </div>
                        </div>
                    </div>
                </div>



            </section>
        </form>
    </main>
<jsp:include page="views/footer.jsp"></jsp:include>

<?php 
    include_once("datos.php");
    include_once("utiles.php");
?>

<header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
    <a href="index.php" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
        <svg class="bi me-2" width="40" height="32">
            <use xlink:href="#bootstrap"></use>
        </svg>
        <span class="fs-4">Portfolio <?php echo(getAnyoActual()) ?></span>
    </a>

    <ul class="nav nav-pills">
        <!-- UD3.2.a -->
        <li class="nav-item"><a href="index.php" class="nav-link
                <?php if ($_SERVER['SCRIPT_NAME'] == '/index.php' && ( /* UD3.2.g */ !isset($_GET['categoria']))) {
                    echo 'active';
                } ?>
            " aria-current="page">INICIO</a></li>

            <!-- UD3.3.e -->
            <li class="nav-item" >
                <a class="nav-link dropdown-toggle 
                <?php /* UD3.2.g */ if (isset($_GET['categoria'])) {
                echo ("active");
            } ?>
            " id="dropdownMenu1" data-bs-toggle="dropdown" ariahaspopup="true">
                    CATEGORÍAS
                    <span class="caret"></span>
                </a>
                <div class="dropdown-menu" aria-labelledby="dropdownMenu1">
                    <?php 
                        /* UD3.3.e UD3.4.b*/
                        foreach($categorias as $clave => $categoria):
                    ?>
                    <!-- UD3.3.e -->
                    <a class="dropdown-item" href="index.php?categoria=<?php echo($clave) ?>"><?php echo($categoria["titulo"]); ?></a>
                    <?php endforeach; ?>
                </div>
            </li>




        <!-- UD3.2.b -->
        <li class="nav-item"><a href="contacto.php" class="nav-link
                <?php if ($_SERVER['SCRIPT_NAME'] == '/contacto.php') {
                    echo 'active';
                } ?>
            ">CONTACTO</a></li>

        <!-- UD3.2.e -->
        <?php if ($loggedIn) { ?>
            <li class="nav-item">
                <a href="administracion.php" class="nav-link <?php if ($_SERVER['SCRIPT_NAME'] == "/administracion.php") {
                                                                    echo ("active");
                                                                } ?>">ADMINISTRACIÓN</a>
            </li>
        <?php }; ?>
    </ul>
</header>
<header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
    <a href="index.php" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
        <svg class="bi me-2" width="40" height="32">
            <use xlink:href="#bootstrap"></use>
        </svg>
        <span class="fs-4">Portfolio</span>
    </a>

    <ul class="nav nav-pills">
        <!-- UD3.2.a -->
        <li class="nav-item"><a href="index.php" class="nav-link
                <?php if ($_SERVER['SCRIPT_NAME'] == '/index.php' && ( /* UD3.2.g */ !isset($_GET['categoria']))) {
                    echo 'active';
                } ?>
            " aria-current="page">INICIO</a></li>
        <li class="nav-item">
            <a class="nav-link dropdown-toggle 
            <?php /* UD3.2.g */ if (isset($_GET['categoria'])) {
                echo ("active");
            } ?>
            " id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true">
                CATEGORÍAS
                <span class="caret"></span>
            </a>
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
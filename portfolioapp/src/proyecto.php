<?php
include("datos.php");

$proyectoWeb = null;
foreach ($proyectos as $proyecto) {
    if (isset($_GET['id'])) {
        if ($_GET['id'] == $proyecto['clave']) {
            $proyectoWeb = $proyecto;
            break;
        }
    }
}

if (!$proyectoWeb) {
    header('location:404.php');
    exit;
}
?>

<!--DOCTYPE html -->
<html lang="es">

<head>
    <title><?php echo $proyectoWeb['titulo']; ?></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/flatly/bootstrap.min.css" integrity="sha384-qF/QmIAj5ZaYFAeQcrQ6bfVMAh4zZlrGwTPY7T/M+iTTLJqJBJjwwnsE5Y0mV7QK" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<!-- https://radu.link/make-footer-stay-bottom-page-bootstrap/ -->

<body class="d-flex flex-column min-vh-100">
    <?php include_once("utiles.php"); ?>
    <?php include_once("templates/header.php"); ?>

    <?php /* UD3.3.d */
    $proyectoEntrante = $_GET['id'];

    $datosProyecto = ['Proyecto No Existente', 'N/A', 'static/images/defaultImage.jpg', date('DD-MM-YYYY'), 'Sin Categorias'];

    foreach ($proyectos as $proyecto) {
        if ($proyecto["clave"] === $proyectoEntrante) {
            $datosProyecto = [$proyecto["titulo"], $proyecto["descripcion"], $proyecto["imagen"], $proyecto["fecha"], $proyecto["categorias"]];
        };
    };
    ?>

    <div class="container">
        <!-- UD3.3.d -->
        <h2><?php echo ($datosProyecto[0]) ?></h2>
        <h4><a href="#"><?php echo ($datosProyecto[3]) ?></a></h4>
        <span>Categorías:</span>
        <a href="#"><button class="btn btn-sm btn-default">
                <?php
                /* UD3.3.d */
                foreach ($datosProyecto[4] as $categoria) {
                    echo ((strtoupper($categoria["clave"]) . " "));
                }
                ?>
            </button></a>
        <br> <br>
        <div class="row">
            <div class="col-sm">
                <!-- UD3.2.d y UD3.3.d-->
                <img src="<?php echo (!is_file($datosProyecto[2]) ? $defaultImage : $datosProyecto[2]) ?>" alt="Proyecto 1" class="img-responsive" style="width: 400px;"><br>
            </div>
            <!-- UD3.3.d -->
            <div class="col-sm"><?php echo (nl2br($datosProyecto[1])) ?></div>
        </div>
    </div>

    <?php include_once("templates/footer.php"); ?>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>

</html>
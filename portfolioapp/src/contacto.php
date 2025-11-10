<!--DOCTYPE html -->
<html lang="es">

<head>
    <title>Portfolio de proyectos</title>
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
    <?php include("datos.php"); ?>
    <?php include("utiles.php"); ?>
    <?php include("templates/header.php"); ?>

    <div class="container">
        <h2 class="mb-5">Contacto</h2>
        <div class="row">
            <div class="col-md">
                <img src="static/images/businessman.jpg" class="img-fluid rounded" style="width: 250px;">
            </div>
            <div class="col-md">
                <!-- UD3.2.c -->
                <h3><?php echo ($datosUsuario) ?></h3>
                <p>Ciclo Superior DAW.</p>
                <p>Apasionado del mundo de la programación en general, y de las tecnologías web en particular.</p>
                <p>Si tienes cualquier tipo de pregunta, contacta conmigo por favor.</p>
                <p>Teléfono: 87654321</p>
            </div>
        </div>
    </div>

    <?php include("templates/footer.php"); ?>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>

</html>
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
  <?php include_once("datos.php"); ?>
  <?php include_once("utiles.php"); ?>
  <?php include_once "./templates/header.php" ?>

  <!-- UD3.2.f -->
  <div style="margin-left: 30vh;">
    <a href="?formaOrdenar=0"><button>Ordenar Ascendentemente</button></a>
    <a href="?formaOrdenar=1"><button>Ordenar Descendentemente</button></a>
  </div>
  <br><br>

  <div class="container mb-5">
    <div class="row">
      <?php
      if (!isset($_GET['sort_date'])){
        /* UD3.2.f */
        $forma = 0;
        if (isset($_GET['formaOrdenar'])) {
          $forma = $_GET['formaOrdenar'];
        }

        /* UD3.2.f */
        usort($proyectos, $forma == 1 ? function ($a, $b) {
          return $b['titulo'] <=> $a['titulo'];
        } : function ($a, $b) {
          return $a['titulo'] <=> $b['titulo'];
        });
      }
      
      /* UD3.3.f */
      if (isset($_GET['categoria']) && $_GET['categoria']){
        $categoriaFiltrada = $_GET['categoria'];
        $proyectos_nuevos = array_filter($proyectos, function($proyecto) use ($categoriaFiltrada){
          foreach($proyecto["categorias"] as $categoria){
            if ($categoria["clave"] == $categoriaFiltrada) {
              return true;
            };
          }
          return false;
        });
      }

      /* UD3.3.h */
      if (isset($_GET['delete']) && $_GET['delete'] == true){
        array_pop($proyectos);
      }

      /* UD3.3.f */
      foreach ((isset($_GET['categoria']) && $_GET['categoria']) ? $proyectos_nuevos : $proyectos as $proyecto): ?>
        <div class="col-sm-3">
          <!-- UD3.3.d -->
          <a href="proyecto.php?id=<?php echo $proyecto['clave'] ?>" class="p-5">
            <div class="card">
              <!-- UD3.2.d -->
              <img class="card-img-top" src="<?php echo (!is_file($proyecto['imagen']) ? $defaultImage : $proyecto['imagen']) ?>" alt="<?php echo $proyecto['titulo'] ?>">
              <div class="card-body">
                <h5 class="card-title"><?php echo $proyecto['titulo'] ?></h5>
                <p class="card-text"><?php echo $proyecto['descripcion'] ?></p>
                <!-- UD3.3.c UD3.4.a -->
                <p class="card-text">
                  <?php
                  $textoMostrar = "";
                  foreach ($proyecto['categorias'] as $categoria) {
                    if (array_key_exists($categoria['clave'], $categorias)) {
                      $textoMostrar .= ($categorias[$categoria['clave']]['titulo'] . ' ');
                    }
                  }
                  echo trim($textoMostrar);
                  ?>
                </p>
              </div>
            </div>
          </a>
        </div>
      <?php endforeach; ?>
    </div>
  </div>

  <?php include_once "./templates/footer.php" ?>


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>

</html>
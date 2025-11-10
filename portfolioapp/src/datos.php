<?php
/* UD3.3.a UD3.3.g*/

$json1 = json_decode(file_get_contents("data/datos1.json"), true);
$json2 = json_decode(file_get_contents("data/datos2.json"), true);

/* UD3.3.g */
$proyectos = array_merge($json1, $json2);

$categorias = [
    'categoria1' => [
        "titulo" => 'Categoria 1',
        "descripcion" => 'Descripción Categoria 1'
    ],
    'categoria2' => [
        "titulo" => 'Categoria 2',
        "descripcion" => 'Descripción Categoria 2'
    ],
    'categoria3' => [
        "titulo" => 'Categoria 3',
        "descripcion" => 'Descripción Categoria 3'
    ],
];

/* UD3.2.c */
$datosUsuario = 'Daniel García';
/* UD3.2.d */
$defaultImage = "static/images/defaultImage.jpg";

/* UD3.2.e */
$loggedIn = true;

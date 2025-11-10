<?php
/* UD3.3.a */
$proyectos = [
    [
        "clave" => "app_gestion",
        "titulo" => "App Móvil Tareas",
        "descripcion" => "Desarrollo de una aplicación nativa (iOS/Android) para la gestión de tareas y equipos.",
        "imagen" => "static/images/pexels-mobile-app.jpg",
        "fecha" => "06/09/2025",
        "categorias" => [
            ["clave" => "categoria1"]
        ]
    ],
    [
        "clave" => "campana_seo",
        "titulo" => "Campaña SEO",
        "descripcion" => "Estrategia de optimización on-page y link building para mejorar el ranking orgánico.",
        "imagen" => "static/images/pexels-seo-strategy.jpg",
        "fecha" => "10/10/2025",
        "categorias" => [
            ["clave" => "categoria2"],
            ["clave" => "categoria3"]
        ]
    ],
    [
        "clave" => "migracion_cloud",
        "titulo" => "Migración a la Nube",
        "descripcion" => "Traslado de la infraestructura de servidores locales a una solución cloud (AWS/Azure).",
        "imagen" => "static/images/pexels-cloud-servers.jpg",
        "fecha" => "15/09/2025",
        "categorias" => [
            ["clave" => "categoria1"],
            ["clave" => "categoria2"]
        ]
    ],
    [
        "clave" => "dashboard_bi",
        "titulo" => "Dashboard BI",
        "descripcion" => "Implementación de un panel de Business Intelligence para la visualización de KPIs de ventas.",
        "imagen" => "static/images/pexels-data-dashboard.jpg",
        "fecha" => "21/09/2025",
        "categorias" => [
            ["clave" => "categoria3"]
        ]
    ],
    [
        "clave" => "sistema_crm",
        "titulo" => "Implantación de CRM",
        "descripcion" => "Configuración e integración de un sistema CRM (Customer Relationship Management) para el equipo de ventas.",
        "imagen" => "static/images/pexels-crm-sales.jpg",
        "fecha" => "21/10/2025",
        "categorias" => [
            ["clave" => "categoria2"]
        ]
    ]
];

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

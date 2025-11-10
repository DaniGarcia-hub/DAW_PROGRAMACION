<?php
    /* UD3.2.f */
    
    function ordenaTituloProyectoDesc($a, $b){
        return strcmp($b['titulo'], $a['titulo']);
    };
    /* UD3.2.f */
    function ordenaTituloProyectoAsc($a, $b){
        return  strcmp($a['titulo]'], $b['titulo']);
    };

    /* UD3.5.a */
    function getAnyoActual(){
        return Date("Y");
    };

    /* UD3.5.b */
    function updateDatesProyectos($proyectos){
        $proyectosBase = $proyectos;
        foreach($proyectosBase as $proyecto){
            $proyecto["fecha"] = strtotime($proyecto["fecha"]);
        }
        return $proyectosBase;
    };

    function sortProyectosByDate(&$proyectos, $tipoOrdenacion){
        $listadoFechas = [];
        updateDatesProyectos($proyectos);
        foreach($proyectos as $proyecto){
            $listadoFechas[] = $proyecto["fecha"];
        }

        array_multisort($listadoFechas, ($tipoOrdenacion == 1 ? SORT_ASC : SORT_DESC), SORT_NUMERIC, $proyectos);
    }
?>
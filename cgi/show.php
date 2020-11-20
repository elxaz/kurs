<?php 
    function print_pre($arr){
        echo "<pre>";
        print_r($arr);
        echo "</pre>";

    }

 ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../styles/show.css">
    <title>Plates</title>
</head>
<body>
    <?php 
        require_once 'db.php';

        if ($_GET['type'] == 'rand') {
            $id = $_GET['id'];
        }elseif ($_GET['type'] == 'yearFilter') {
            $id = $_GET['id'];
        }elseif ($_GET['type'] == 'search'){
             $id = $_GET['id'];
        }



        $films =[];//массив в котором будут храниться фильмы

        foreach ($id as $key => $value) {//взятие всех уникальных фильмов
            $films[$key] = R::findOne('film', 'id = ?', [$value]);
        }

        $posters = [];//массив для постеров
        $names = [];//массив для имен фильмов
        $links = [];//массив для ссылок на фильмы
        $id = [];//массив для айди фильмов

        foreach ($films as $key => $value) {//разбиение глобального массива фильмы на три специалезированных массива
            $posters[$key] = $value['poster'];
            $names[$key] = $value['name'];
            $links[$key] = $value['link'];
            $id[$key] = $value['id'];
        }
       
        foreach ($posters as $key => $value) {
            echo "<div class=\"plates\">";            
            echo "<a href=\"http://localhost:8080/cgi/view.php?id=$id[$key]\"><img src=\"$posters[$key]\" width=\"201\" height=\"300\" class = \"posterInDiv\"></a>"; 
            echo "<xmp class = \"filmNameDiv\">$names[$key]</xmp>";
            echo "</div>";
        }
        ?>
        

    
</body>
</html>





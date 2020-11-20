<?php 
		require_once 'db.php';
 	 	$id = $_GET['id'];
 	 	$film = R::findOne('film', 'id = ?', [$id]);
 	 	$poster = $film['poster'];
 	 	$name = $film['name'];
 	 	$link = $film['link'];
 	 	$description = $film['description'];
?>
	
	<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=9, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="../styles/template.css">
	<link rel="shortcut icon" href="../img/smallest.png" type="image/x-icon">
	<title><?php echo "$name"; ?></title>
</head>
<body>
		<div class="header" align="center">
		<img src="../img/smalllogo.png" class="smalllogo">
<!-- Вся страничка с контентом -->
<div class="film" align="center">

		<div class="filmHead">
			<!-- Постер -->
			<div class="poster">
				<img src="<?php echo "$poster" ?>" width="189" height="255" alt="lorem">
			</div>
			<div class="name" align="left">
			<!-- Имя фильма -->
				<h1><?php echo "$name"; ?></h1>
			</div>
			<div class="filmDescription" align="left">
				<p><?php echo "$description"; ?></p>
			</div>
		</div>
		<!-- Видео -->
		<div class="filmCenter">
			<iframe src="<?php echo "$link"; ?>" align="center" width="640" height="360" frameborder="0" allowfullscreen></iframe>
		</div>

		
		

</div>



	<div class="footer">
		<div class="copy">&#169; ICS-media 2020</div>
		<span class="media"><a href=""><img src="../img/inst.png"></a> <a href=""><img src="../img/telega.png"></a></span>
	</div>
		</body>	
</html>


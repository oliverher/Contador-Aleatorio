<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/Bootsnip.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="fundoTela">
   <div class = "container">
	<div class="wrapper">
		<form action="" name="Login_Form" class="form-signin">       
		    <h3 class="form-signin-heading">Contador Aleatório de 10 Números</h3>
			  <hr class="colorgraph"><br>
			  
			  <%
				classes.Contador contador = (classes.Contador) session
						.getAttribute("numeros");
			%>
			<h1 align="center"><%=contador.sorteado()%></h1>   		  
			  <br/>
			  <button class="btn btn-lg btn-primary btn-block" type="submit" name="acao" value="sortear">Sortear</button>			
			  <button class="btn btn-lg btn-primary btn-block" type="submit" name="acao" value="reiniciar">Reiniciar</button>
				<br>
		</form>			
	</div>
</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
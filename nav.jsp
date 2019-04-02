<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<body class="d-flex flex-column h-100">
    <header>
  <!-- UHealth  -->
  <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">Fixed navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="abouts.jsp">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="#" tabindex="-1" aria-disabled="false">Contact Us</a>
        </li>
      </ul>
      <form class="form-inline mt-2 mt-md-0">
        <input class="form-control mr-sm-2" type="text" id="search-text" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="button" 
        	onclick="search(document.getElementById('search-text').value);">Search</button>
      </form>
    </div>
  </nav>
</header>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="WEB-INF/templates/header.jsp"></jsp:include>
<main>
    <p class="mt-4"> </p>

   <div class="columns is-centered has-text-centered">
       
   <div class="column is-8 has-text-centered">
    
    <div class="card has-text-centered">
        
     <div class="card-header is-size-2 has-text-centered ">
         <h1> Registrar Persona</h1>
         </div>     
        
    <div class="card-content ">
      
    <div class="field">
<label class="label" for ="rut-txt"> Rut del Cliente</label>
<div class="control">
<input type="text" class="input" id="rut-txt" name="rut-txt">
</div>
    </div>
<div class="field">
<label class="label" for ="nombre-txt"> Nombre</label>
<div class="control">
<input type="text" class="input" id="nombre-txt" name="nombre-txt">
</div>
</div>
  <div class="field">
<label class="label" for ="edad-txt"> Edad</label>
<div class="control">
<input type="text" class="input" id="edad-txt" name="nombre-txt">
</div>
</div>
  <div class="field">
<label class="label" for ="empresa-txt"> Empresa</label>
<div class="control">
<input type="text" class="input" id="empresa-txt" name="nombre-txt">
</div>
</div>      
<div class="field">
 <label class="label">Etado</label>
  <div class="control">
      <div class="select">
          </div>
      <select name="tipo-select" id="tipo-select">
        <option>Pagada</option>
        <option>Con deuda</option>
       </select>
        <div class="field">
 <label class="label">Región</label>
  <div class="control">
    <div class="select">
      <select name="tipo-select" id="tipo-select">
        <option>Valparaiso</option>
        <option>Santiago</option>
        <option>Norte de Chile</option>
        <option>Sur de Chile</option>
        <option>Internacional</option>
       </select>
        
       </div>        
      <div class="card-footer has-text-centered">  
          <div class="card-footer-item">
<button type="submit" class="button is-primary">Registrar </button>
         </div>     
            
          </div>   
   </div> 
  </div>      
   </div>       
    </div>
    </div>  
   </div>
   </div> 
    </div>
</main>
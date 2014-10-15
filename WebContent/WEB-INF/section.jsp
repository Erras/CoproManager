<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<section>
    <!-- Blocs -->

   	<div class="container-fluid">
  		<div class="row-fluid">

    		<div class="span3">
      			<%@include file="aside.jsp"%>
    		</div>

    		<div class="span9">
    		<%  
    			String c = request.getParameter("contenu");
    			if(c==null)
    				c = " ";
    			String b = "application";
    			if(c.equals(b)){
    		%>
    				<%@include file="application.jsp"%>
    		<%
    			}
    			else{
    		%>
 		   			<%@include file="article.jsp"%>
 		   	<%}%>
    		</div>
    		
  		</div>
	</div>

</section>
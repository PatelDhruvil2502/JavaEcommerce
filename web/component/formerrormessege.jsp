<% 
    
    if(session.getAttribute("formerroemessege")!=null) 
    { 
        out.println("<div class='alert alert-danger'>");
        out.println((String)session.getAttribute("formerroemessege"));
        out.println("</div>");
        
        session.removeAttribute("formerroemessege");

    }
    
%>

<%if(session.getAttribute("regitersuccmess")!=null){
    out.println("<script>");
    out.println("alert(`"+(String)session.getAttribute("regitersuccmess")+"`);");
    out.println("</script>");
    session.removeAttribute("regitersuccmess");
}
%>

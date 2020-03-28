<%--
  Created by IntelliJ IDEA.
  User: SXT
  Date: 2019/8/24
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    
    <script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
    
    
    <script type="text/javascript">
        
        $(function () {
            
            $("#aj").click(function () {
              
                $.post("ajax2","name=sxt",function (data1) {

                    alert(data1.name);
                })
                
                
            })
        })
        
        
    </script>
</head>
<body>

<input type="button" value="ajax请求" id="aj"/>

</body>
</html>

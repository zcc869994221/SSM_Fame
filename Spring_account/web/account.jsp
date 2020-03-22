<%--
  Created by IntelliJ IDEA.
  User: SXT
  Date: 2019/8/22
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>银行转账系统</title>

    <script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>

    <script type="text/javascript">
        var flag1 = false;
        var flag2 = false;
        var flag3 = false;
        $(function(){
            $("#pwd").blur(function(){
                var cno = $("#cno").val();
                var pwd = $("#pwd").val();
               //发送ajax请求，判断账户信息是否正确
                $.ajax({
                    type: "POST",
                    url: "AccountController",
                    async: false,
                    data: "method=checkUser&cno="+cno+"&pwd="+pwd,
                    dataType:"text",
                    success: function(msg){
                        if(msg=="true"){//汇款人信息正确
                            flag1 = true;
                            $("#pwd_span").html("√汇款人信息正确").css("color","green");
                        }else{
                            $("#pwd_span").html("×汇款人信息错误").css("color","red");
                        }

                    }
                })
            })

            //判断金额的操作
            $("#money").blur(function () {
                //获取金额，用户名
                var cno = $("#cno").val();
                var pwd = $("#pwd").val();
                var money = $("#money").val();
                $.ajax({
                    type: "POST",
                    url: "AccountController",
                    async: false,
                    data: "method=checkUser&cno="+cno+"&pwd="+pwd+"&money="+money,
                    dataType:"text",
                    success: function(msg) {
                        if (msg=="true") {//汇款人信息正确
                            flag2 = true;
                            $("#money_span").html("√汇款金额正确").css("color", "green");
                        } else {
                            $("#money_span").html("×账户余额不足").css("color", "red");
                        }

                    }
                })
            })

            $("#cno2").blur(function(){
                var cno2 = $("#cno2").val();
                var cno = $("#cno").val();
                if(cno2==cno){
                    $("#cno2_span").html("×收款人不能是自己").css("color","red");
                }else{
                    //发送ajax请求，判断账户信息是否正确
                    $.ajax({
                        type: "POST",
                        url: "AccountController",
                        async: false,
                        data: "method=checkUser&cno="+cno2,
                        dataType:"text",
                        success: function(msg){
                            if(msg=="true"){//收款人信息正确
                                flag3 = true;
                                $("#cno2_span").html("√收款人信息正确").css("color","green");
                            }else{
                                $("#cno2_span").html("×收款人信息错误").css("color","red");
                            }

                        }
                    })
                }
            })
        })

        function change(){
            //返回true false
            return flag1&&flag2&&flag3;
        }
    </script>

</head>
<body>

<h3>银行转账系统</h3>

  <form action="AccountController?method=inOutMoney" method="post" onsubmit="return change()">

      <p>
          转账账号:<input type="text" id="cno" name="outCno"/>

      </p>
      <p>
          转账密码:<input type="text" id="pwd"/><span id="pwd_span"></span>

      </p>
      <p>
          转账金额:<input type="text" id="money" name="money"/><span id="money_span"></span>

      </p>
      <p>
          收款账号:<input type="text" id="cno2" name="inCno"/><span id="cno2_span"></span>

      </p>
      <p>
          <input type="submit" value="确认转账"/>

      </p>


  </form>

</body>
</html>

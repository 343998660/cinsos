$(function () {
        $("button").click(function () {
            let userName=$("#LogName").val().trim();
            let passWord=$("#LogPassword").val();
            const url="/login";
            let date={'userName':name,'passWord':passWord };
            if(userName != ""){
                $("#tips").html('源于信，成于索！').css("color","#FFFFFF");
                $.post(url,date,function (e) {
                    $("#tips").html(e).css("color","#FF0000");
                if(e=="登录成功"){
                    location.href = ctx + 'a';
                }
                });
            }else {
                $("#tips").html('用户名不允许为空').css("color","#FF0000");
                 }
        })
    })

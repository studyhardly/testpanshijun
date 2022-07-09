function login() {
    var username = $("#username").val();
    var password = $("#password").val();
    var data ={"username": username,"password":password};
    //校验
    if(username=='' || username == undefined){
        alert("账号不能为空");
        return false;
    } else
    if(password =='' || password == undefined){
        alert("密码不能为空");
        return false;
    }else{
        $.ajax({
            type: 'get',
            url: "/demo/user/login",
            data: data,
            // jsonp:"callback",
            success: function (data) {
                console.log(data);
                if(data){
                    //跳转到页面
                    alert("登录成功");
                    /*实际业务中跳转到系统页面*/
                    alert("showAllUsers");
                    debugger;


                    //location.href=("../view/showAllUsers.html");
                    //失败，跳转到登录页面
                }else{
                    alert("用户名或密码错误");
                    /*返回登录页面*/
                    location.href="../view/login.html";
                }
            }
        })
    }
}
function  refresh(){
    location.href="/demo/user/selectAllUsers";

}
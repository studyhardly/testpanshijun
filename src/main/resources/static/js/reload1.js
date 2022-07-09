function proj(){
    location.href="/test/proj/showAllProj";
}
function room() {
    location.href = "/test/room/selectAllRoom";
}

function del1() {
    var rid=$(".rid").val();
    $.ajax({
            type: 'get',
            url: "/test/room/delRoom",
            data: {"rid":rid},
            // jsonp:"callback",
            success: function (data) {
                console.log(data);
                if(data){

                    alert("showAllProjects");
                    debugger;


                    location.href="/test/proj/delProject";
                }else{
                    alert("用户名或密码错误");
                    
                    location.href="../templates/showAllRoom.html";
                }
            }
        })

}
function  refresh(){
    location.href="/test/user/selectAllUsers";

}
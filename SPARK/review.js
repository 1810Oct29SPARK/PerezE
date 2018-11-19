window.onload = function(){
    console.log("Hello");
    document.getElementById("submit").addEventListener("click",function(){
    document.getElementById("userName").innerHTML="User: "+username.value;
    document.getElementById("review").innerHTML=star.value + " stars " + reply.value;
    });
}
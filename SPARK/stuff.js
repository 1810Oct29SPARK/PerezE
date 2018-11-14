window.onload = function(){
    console.log("Hello");
    document.getElementById("login").addEventListener("click",function(){
    document.getElementById("hello").innerHTML="Hello " + username.value;
    document.getElementById("user").innerHTML="";
    });
}
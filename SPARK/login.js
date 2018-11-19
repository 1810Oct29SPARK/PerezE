window.onload = function(){
    console.log("Hello");
    document.getElementById("login").addEventListener("click",function(){
    document.getElementById("hello").innerHTML="Hello " + username.value;
    document.getElementById("user").innerHTML="";
    let newPara1 = document.createElement('p');
    newPara1.innerText = "Your points: 1500 pt"; 
    document.getElementById("user").appendChild(newPara1);
    let newPara2 = document.createElement('p');
    newPara2.innerText = "Would you like to cancel your reservation?"; 
    document.getElementById("user").appendChild(newPara2);
    var x = document.createElement("BUTTON");
    var t = document.createTextNode("Click me");
    x.appendChild(t);
    document.getElementById("user").appendChild(x);
    });
}
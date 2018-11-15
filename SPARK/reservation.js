window.onload = function(){
    console.log("Hello");
    document.getElementById("submit").addEventListener("click",function(){
    document.getElementById("title").innerHTML="Reservation created!";
    document.getElementById("dine").innerHTML="Your reservation of " + num.value + " has been created on " + date.value;
    });
}
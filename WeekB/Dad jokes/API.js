window.onload = function(){
    console.log("working");
    document.getElementById("advice").addEventListener("click",function(){
    let userNum = document.getElementById("num").value;
    document.getElementById("advice-field").innerHTML=getFetch(userNum);
    });
}

getFetch = function(number) {
    for(i = number ; i > 0 ; i--) {
    fetch('https://api.adviceslip.com/advice')
    .then(response =>
        response.json())
    .then(result => {
        console.log(result);
        let advicetest = result.slip.advice;
        console.log(advicetest);
        var AdviceElement = document.createElement("li");
        var AdviceText = document.createTextNode((advicetest));
        AdviceElement.appendChild(AdviceText);
        document.getElementById('advice-field').innerHTML=advicetest;
    });
    }
 }
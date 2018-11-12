let getAdvice = function() {
    fetch('https://api.adviceslip.com/advice')
    //define behavior for when the response returns
    .then(response => response.json())
        //utilize unwrapped promise a javascript object
    .then(result => {
        console.log(result);
        var jsonStr = JSON.stringify(result);
        document.body.innerHTML = jsonStr;
    })

 }
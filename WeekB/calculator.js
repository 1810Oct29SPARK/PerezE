//applying an event listener to the Widnow object
//when the window loads, this function will be executed
window.onload = function(){
    console.log("hello world");
    //selecting the element from the DOM with id="calculate"
    //add an event listener so that the annonymous function provided
    //is executed when the element is clicked.
    document.getElementById("calulate").addEventListener("click",function(){
        //retrieve values from user input on the form
        let num1FromForm = document.getElementById("num1").value;
        let num2FromForm = document.getElementById("num2").value;
        let chosenOperaton;
        let opoerationRadios = document.getElementsByName("operation");
        for (let i=0; i < opoerationRadios.length; i++){
            if (opoerationRadios[i].checked) {
                chosenOperaton = opoerationRadios[i].value;
            } 
        }
        console.log(num1FromForm);
        console.log(num2FromForm);
        console.log(chosenOperaton);
        //call caluclate fucntion with those values and display result
        console.log(calculate(num1FromForm,num2FromForm,chosenOperaton));
        document.getElementById("answer").innerHTML=calculate(num1FromForm,num2FromForm,chosenOperaton);
    });
}

function calculate(num1, num2, operation){
    let result=NaN;
    if (operation === "add"){
        result = parseFloat(num1)+parseFloat(num2);
    }
    if (operation === "subtract"){
        result = parseFloat(num1)-parseFloat(num2);
    }
    if (operation === "divide"){
        result = parseFloat(num1)/parseFloat(num2);
    }
    if (operation === "multiply"){
        result = parseFloat(num1)*parseFloat(num2);
    }
    return result;
}
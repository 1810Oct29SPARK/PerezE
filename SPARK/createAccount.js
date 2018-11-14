window.onload = function(){
    console.log("Hello");
    document.getElementById("create").addEventListener("click",function(){
        if (password1.value!=password2.value)
        {
            document.getElementById("text").innerHTML="Passwords do not macth, try again.";
            setTimeout(backToCreate, 2000);
            function backToCreate() {
                window.location.replace("createUser.html");
            }
        }
        else 
        {
            document.getElementById("text").innerHTML="Account created! Login in to new account.";
            setTimeout(backToLogin, 2000);
            function backToLogin() {
                window.location.replace("login.html");
            }
        } 
    });
}
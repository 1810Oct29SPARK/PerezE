window.onload = function(){
    let weatherApiUrl = 'http://api.openweathermap.org/data/2.5/weather?q=Venice,us&units=imperial&APPID=859d47520ac736ebe8bbce1fef74269c';
    fetch(weatherApiUrl).then((response) => {return response.json();
    }).then((data) => {
        tampaWeather = data;
        console.log(data);
        console.log('the temperature is: '+tampaWeather.main.temp+' degrees');
        document.getElementById('temp').innerHTML = 'The weather in San Marco, Venice is: '+tampaWeather.main.temp+' degrees Fahrenheit';
    });
}
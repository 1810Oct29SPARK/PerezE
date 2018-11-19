let weatherApiUrl = 'http://api.openweathermap.org/data/2.5/weather?q=Tampa,us&units=imperial&APPID=859d47520ac736ebe8bbce1fef74269c';
function getTampaWeather() {
    fetch(weatherApiUrl).then((response) => {return response.json();
    }).then((data) => {
        tampaWeather = data;
        console.log(data);
        console.log('the temperature is: '+tampaWeather.main.temp+' degrees');
        document.getElementById('weatherDiv').innerHTML = tampaWeather.main.temp;
    });
}
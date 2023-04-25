// https://dog.ceo/api/breeds/image/random

// comment out on of the methods for it to work

const fetchDogImage = () => {
    fetch("https://dog.ceo/api/breeds/image/random")
    .then(response => response.json()) //fetch http response
    .then(data => document.getElementById("dog_img").src = data.message); // returns json data
}
// fetch returns a promise
// semi-colon only used on last line bc its essentially one line but broken up

// fetchDogImage();

// event listener to respond to the click of the button
document.getElementById("dog_button").addEventListener("click", fetchDogImage);

// ---------------------- OR ----------------------------------------

// ASYNC/AWAIT version ----------------------------------------------
// does same thing but more brief syntax 
const fetchDogImages = async () => {
    const response = await fetch("https://dog.ceo/api/breeds/image/random");
    const jsonData = await response.json();
    document.getElementById("dog_img").src = jsonData.message;
}
// await makes it so that its not a promise 
// it waits for the promise to resolve and brings forward the result of the resolved promise 
// so essentially await returns the data produced by the carried out promise 

// async function myFunction(){}
document.getElementById("dog_button").addEventListener("click", fetchDogImage);

// console.log("JS Loaded");
// to test that it works and see that its linked properly in your console (dev tools)

// console.log(button);
// can see all the events that can take place using a button as a list on console - can also be accessed through mdn

//adding and linking ids
const button = document.querySelector("#btn");
const box = document.querySelector("#box");
const caption = document.querySelector("#caption");
const textInput = document.querySelector("#text-input");
const colourPicker = document.querySelector("#colour-picker");
const historyList = document.querySelector("#history");


// look out for associated events - when something (click) happens, do this (event) through function - two arguments needed to be passed
button.addEventListener("click", () => {
    console.log("button clicked");
    // log wont be logged until event happens "fired"
});

textInput.addEventListener("input", (event) => {
    const newText = event.target.value;
    caption.innerText = newText;
});

const createAndAppendNewList = (content) => {
    const newListItem = document.createElement("li");
    newListItem.innerText = `Colour changed to ${newColour}`;
    historyList.appendChild(newListItem);
}

colourPicker.addEventListener("change", (event) => {
    const newColour = event.target.value;
    box.setAttribute("style", `background-color: ${newColour}`);
});

// js events all start with 'on' - e.g. ondrop, ontransition etc
// so many different things we can do with the button through the js events


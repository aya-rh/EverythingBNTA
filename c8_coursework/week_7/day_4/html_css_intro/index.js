const hello = () => {
    const response = prompt("Hello! Say something..");
    document.getElementsByTagName("body")[0].innerText = response; 
    // this will destrory the page after input - not useful
    // use alert instead

}

document.getElementById("say_hi").addEventListener("click", hello);
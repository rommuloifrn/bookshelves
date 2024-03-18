url = "http://localhost:8080/books";
const list = document.getElementById("list");

const req = fetch(url)
.then((response) => {
    return response.json()
})
.then( (jsonBody) => {
    for (const book of jsonBody) {
        i = document.createElement("li");
        i.appendChild(document.createElement("p")).textContent = book.title;
        console.log(book)
        list.appendChild(i);
    }
    
})
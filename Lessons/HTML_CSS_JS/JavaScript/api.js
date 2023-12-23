let URL = "https://animechan.xyz/api/random";
let anime = document.querySelector(".anime");
let character = document.querySelector(".char");
let quote = document.querySelector(".quote");
let btn = document.querySelector("#fact");
const getQuotes = async ()=>{
    let response = await fetch(URL);
    console.log("getting data....")
    console.log(response); //JSON format
    let data = await response.json();
    console.log(data);
    anime.innerText = "Anime : " +data.anime;
    character.innerText = "Character : " +data.character;
    quote.innerText ="Quote : " +data.quote;
}
btn.addEventListener("click",getQuotes);
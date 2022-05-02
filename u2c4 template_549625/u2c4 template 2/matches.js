// write js code here corresponding to matches.html
var arr = JSON.parse(localStorage.getItem("schedule"))
  console.log(arr)
  var Favourites;
   if(JSON.parse(localStorage.getItem("favourites"))==null){
    var Favourites = [];
   }
   else{
    var Favourites = JSON.parse(localStorage.getItem("favourites"))
   }
   formatchtable(arr)
  function formatchtable(data){
    data.forEach(function(ele){

     var tr = document.createElement("tr");
   
     var td1 = document.createElement("td");
     td1.innerText = ele.number
   
     var td2 = document.createElement("td");
     td2.innerText = ele.teamA
   
     var td3 = document.createElement("td");
     td3.innerText = ele.teamB
   
     var td4 = document.createElement("td");
     td4.innerText = ele.date

     var td5 = document.createElement("td");
     td5.innerText = ele.vanue

     var td6 = document.createElement("td");
     td6.innerText = "Favourite"
     td6.style.color = "red"
     td6.addEventListener("click",function(){
      forfavourite(ele)
     })

     tr.append(td1,td2,td3,td4,td5,td6);
     document.querySelector("tbody").append(tr)
     
    })
  }
  
  function forfavourite(ele){
    Favourites.push(ele);
    localStorage.setItem("favourites", JSON.stringify(Favourites));
    window.location.href="favourites.html"
  }
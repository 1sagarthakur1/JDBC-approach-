// write js code here corresponding to index.html
// You should add submit event on the form
document.querySelector("#masaiForm").addEventListener("submit", forsubmit);
    var arr;
    if(JSON.parse(localStorage.getItem("schedule"))==null){
      var arr = [];
    }
    else{
      var arr = JSON.parse(localStorage.getItem("schedule"))
    }
    function forsubmit(){
      event.preventDefault()
      var obj = {
        number: document.querySelector("#matchNum").value,

        teamA : document.querySelector("#teamA").value,

        teamB : document.querySelector("#teamB").value,

        date : document.querySelector("#date").value,

        vanue :document.querySelector("#venue").value,
      }
      arr.push(obj);
      // console.log(arr);
      localStorage.setItem("schedule", JSON.stringify(arr))
      window.location.href="matches.html"
    }
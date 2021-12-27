
console.log("script running")
document.querySelector('.options').style.display = 'none';
document.querySelector('.signs').addEventListener("click", ()=>{
    // if we would have used querySelectorAll, so it will select all the classes
    // of the name .sidebar but since we don't want that so we will use querySelector
    // which returns the first appearance
    document.querySelector('.sidebar').classList.toggle('sidebarGo');
    if(document.querySelector('.sidebar').classList.contains('sidebarGo')){
        document.querySelector('.cross').style.display = 'none';
        setTimeout(() => {
            document.querySelector('.infocontainer').style.width = '90vw';
            document.querySelector('.infocontainer').style.margin = '20vh 5vw 20vh 5vw';
            document.querySelector('.options').style.display = 'inline';
        }, 300);
        
    }else{
        document.querySelector('.options').style.display = 'none';
        setTimeout(() => {
            document.querySelector('.infocontainer').style.width = '75vw';
            document.querySelector('.infocontainer').style.margin = '20vh 5vw 20vh 19vw';
            document.querySelector('.cross').style.display = 'inline';
            
        }, 300);
    }
})



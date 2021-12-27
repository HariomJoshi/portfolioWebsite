console.log("script running")
document.querySelector('.options').style.display = 'none';
document.querySelector('.signs').addEventListener("click", ()=>{
    document.querySelector('.sidebar').classList.toggle('sidebarGo');
    if(document.querySelector('.sidebar').classList.contains('sidebarGo')){
        document.querySelector('.cross').style.display = 'none';
        setTimeout(() => {
            document.querySelectorAll('.institute').forEach(elem =>elem.style.width = '85vw');
            document.querySelectorAll('.institute').forEach(elem => elem.style.margin = '10vh 5vw 10vh 5vw');
            document.querySelector('.myEducation').style.margin = '10vh 5vw 10vh 5vw';
            document.querySelector('.options').style.display = 'inline';
        }, 300);
        
    }else{
        document.querySelector('.options').style.display = 'none';
        setTimeout(() => {
            document.querySelectorAll('.institute').forEach(elem => elem.style.width = '40vw');
            document.querySelectorAll('.institute').forEach(elem => elem.style.margin = '10vh 5vw 10vh 19vw');
            document.querySelector('.myEducation').style.margin = '10vh 5vw 10vh 19vw';
            document.querySelector('.cross').style.display = 'inline';
            
        }, 300);
    }
})

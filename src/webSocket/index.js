    const socket = new  WebSocket('ws://localhost:3000')
    var jsonFile = [];
    socket.addEventListener('open',function(event){
         console.log('conectado')
        
    })
    socket.addEventListener('message', function (event) {
            jsonFile = event.data;
            console.log('mensaje del server :',event.data);
           
        })
    const sendMess = ()=>{
        socket.send('hello, I am client ')
    }
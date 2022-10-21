    const socket = new  WebSocket('ws://localhost:3000')
    socket.addEventListener('open',function(event){
         console.log('conectado')
        
    })
    socket.addEventListener('message', function (event) {
            console.log('mensaje del server :',event.data);
           
        })
    const sendMess = ()=>{
        socket.send('hello, I am client ')
    }
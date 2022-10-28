const socket = new WebSocket("ws://localhost:3000");
socket.addEventListener("open", function (event) {
  console.log("conectado");
});

socket.addEventListener("message", function (event) {
  console.log("chaor");
  console.log("mensaje desde el servidor " + event.data);
});

function enviar() {
  socket.send("hola desde el cliente");
}

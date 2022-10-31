const express = require("express");
const app = express();
const path = require("path");
const server = require("http").createServer(app);
const WebSocket = require("ws");
const wss = new WebSocket.Server({ server: server });
const fs = require("fs");
const { send } = require("process");

app.use(express.static(path.join(__dirname, "./public")));

wss.on("connection", function connection(ws) {
  console.log("new cliente connect");
  for (var i = 0; i < 9; i++) {
    var json = {
      nombre: "Pablooo vasquez",
      cedulaRuc: "12345456" + i,
      correo: "pepito@hotmail.com",
      direccion: "mz l3 villa 4",
    };
    ws.send(JSON.stringify(json));
  }

  ws.on("message", function incoming(message) {});
});

app.get("/");
server.listen(3000, () => {
  console.log("port 3000");
});

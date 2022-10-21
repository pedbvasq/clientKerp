const express = require("express");
const app = express();
const path = require("path");
const server = require("http").createServer(app);
const WebSocket = require("ws");
const wss = new WebSocket.Server({ server: server });
const fs = require("fs");

app.use(express.static(path.join(__dirname, "./public")));

wss.on("connection", function connection(ws) {
  const jsonClient = fs.readFileSync("cliente.json", "utf-8");
  const clientes = JSON.parse(jsonClient);
  console.log("new cliente connect");
  ws.send(JSON.stringify(clientes));

  ws.on("message", function incoming(message) {
    console.log("recibido por el servidor : " + message);
    ws.send("got " + message);
  });
});

app.get("/");
server.listen(3000, () => {
  console.log("port 3000");
});

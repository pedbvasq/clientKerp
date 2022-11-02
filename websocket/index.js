const express = require("express");
const app = express();
const path = require("path");
const server = require("http").createServer(app);
const WebSocket = require("ws");
const wss = new WebSocket.Server({ server: server });
const fs = require("fs");
var clients = [];
app.use(express.static(path.join(__dirname, "./public")));

wss.on("connection", function connection(ws) {
  clients.push(ws);

  ws.on("message", function incoming(message) {
    clients.forEach(function (client) {
      client.send(String(message));
    });
  });
});

app.get("/");
server.listen(3000, () => {
  console.log("port 3000");
});

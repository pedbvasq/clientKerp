const express = require("express");
const app = express();
const path = require("path");
const server = require("http").createServer(app);
const WebSocket = require("ws");
const wss = new WebSocket.Server({ server: server });
app.use(express.static(path.join(__dirname, "./public")));

wss.on("connection", function connection(ws) {
  console.log("new cliente");
  ws.send("new client");

  ws.on("message", function incoming(message) {
    console.log("recibido" + message);
    ws.send("got " + message);
  });
});

app.get("/", (req, res) => res.send("hello world"));
server.listen(3000, () => {
  console.log("port 3000");
});

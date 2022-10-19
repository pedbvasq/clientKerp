const WebSocket = require("ws");
const ws = new WebSocket("localhost:3000");
ws.on("open", function open() {
  ws.on("message", function message(data) {});
});

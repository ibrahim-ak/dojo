
const mongoose = require('mongoose');
const express = require("express");
const app = express();
require('dotenv').config();
const port = process.env.PORT;

require("./SERVER/config/mongoose.config.js");

app.use(express.json(), express.urlencoded({ extended: true }));

const AllMyJokesRoutes = require("./SERVER/routes/joke.route.js");
AllMyJokesRoutes(app);

app.listen(port, () => console.log(`Listening on port: ${port}`));
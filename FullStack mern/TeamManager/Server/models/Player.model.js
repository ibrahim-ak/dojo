const mongoose = require('mongoose');
const PlayerSchema = new mongoose.Schema({
     Name: {
          type: String,
          required: [true, "name is required"],
          minlength: [3, "name must be at least 3 characters long"]
     },
     possition: {
          type: String,
          required: [true, "name is required"],
          minlength: [3, "name must be at least 3 characters long"]
     }
}, { timestamps: true });
module.exports = mongoose.model('Player', PlayerSchema);

const Player = require('../models/Player.model');



module.exports.findAllPlayers = (req, res) => {
     Player.find()
          .then(allplyers =>
               res.json({ players: allplyers })
          )
          .catch((err) => {
               res.json(err)
          });
}

module.exports.findOnePlayer = (req, res) => {
     Player.findOne({ _id: req.params.id })
          .then(oneSinglePlayer => {
               res.json({ Player: oneSinglePlayer })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.createNewPlayer = (req, res) => {
     Player.create(req.body)
          .then(newlyCreatedPlayer => {
               res.json({ Player: newlyCreatedPlayer })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.updateExistingPlayer = (req, res) => {
     Player.findOneAndUpdate(
          { _id: req.params.id },
          req.body,
          { new: true, runValidators: true }
     )
          .then(updatedPlayer => {
               res.json({ Player: updatedPlayer })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.deleteAnExistingPlayer = (req, res) => {
     Player.deleteOne({ _id: req.params.id })
          .then(result => {
               res.json({ result: result })
          })
          .catch((err) => {
               res.json(err)
          });
}

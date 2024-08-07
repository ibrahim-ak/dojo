const Joke = require('../models/jokes.model');

module.exports.findAllJokes = (req, res) => {
     Joke.find()
          .then((allthejoke) => {
               res.json({ jokes: allthejoke })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.findOneJoke = (req, res) => {
     Joke.findOne({ _id: req.params.id })
          .then(findOneJoke => {
               res.json({ joke: findOneJoke })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.createNewJoke = (req, res) => {
     Joke.create(req.body)
          .then(newlyJoke => {
               res.json({ joke: newlyJoke })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.updateExistingJoke = (req, res) => {
     Joke.findOneAndUpdate(
          { _id: req.params.id },
          req.body,
          { new: true, runValidators: true }
     )
          .then(updatedJoke => {
               res.json({ joke: updatedJoke })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.deleteAnExistingJoke = (req, res) => {
     Joke.deleteOne({ _id: req.params.id })
          .then(result => {
               res.json({ result: result })
          })
          .catch((err) => {
               res.json(err)
          });
}

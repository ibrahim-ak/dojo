const Author = require('../models/Author.model');




module.exports.findAllAuthor = (req, res) => {
     Author.find()
          .then((allAuthor) => {
               res.json({ Authors: allAuthor })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.findOneAuthor = (req, res) => {
     Author.findOne({ _id: req.params.id })
          .then(findOneAuthor => {
               res.json({ Author: findOneAuthor })
          })
          .catch((err) => {
               res.json(err)
          });
}

module.exports.createNewAuthor = (req, res) => {
     Author.create(req.body)
          .then(newlyCreatedAuthor => {
               res.json({ Author: newlyCreatedAuthor })
          })
          .catch((err) => {
               res.status(400).json(err)
          });
}

module.exports.updateExistingAuthor = (req, res) => {
     Author.findOneAndUpdate(
          { _id: req.params.id },
          req.body,
          { new: true, runValidators: true }
     )
          .then(updatedAuthor => {
               res.json({ Author: updatedAuthor })
          })
          .catch((err) => {
               res.status(400).json(err)
          });
}

module.exports.deleteAnExistingAuthor = (req, res) => {
     Author.deleteOne({ _id: req.params.id })
          .then(result => {
               res.json({ result: result })
          })
          .catch((err) => {
               res.json(err)
          });
}

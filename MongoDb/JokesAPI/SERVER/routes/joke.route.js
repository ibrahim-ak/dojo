const JokeController = require('../controllers/joke.controller');
module.exports = app => {
     app.get('/api/joke', JokeController.findAllJokes);
     app.get('/api/joke/:id', JokeController.findOneJoke);
     app.patch('/api/joke/:id', JokeController.updateExistingJoke);
     app.post('/api/joke', JokeController.createNewJoke);
     app.delete('/api/joke/:id', JokeController.deleteAnExistingJoke);
}
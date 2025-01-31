const Playercontroller = require('../controllers/Plyer.controller');

module.exports = app => {
     app.get('/api/players', Playercontroller.findAllPlayers);
     app.get('/api/player/:id', Playercontroller.findOnePlayer);
     app.patch('/api/player/:id', Playercontroller.updateExistingPlayer);
     app.post('/api/player', Playercontroller.createNewPlayer);
     app.delete('/api/player/:id', Playercontroller.deleteAnExistingPlayer);
     
}

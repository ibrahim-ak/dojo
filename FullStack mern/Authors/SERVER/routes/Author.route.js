const Authorcontroller = require('../controllers/Author.controller');

module.exports = app => {
     app.get('/api/authors', Authorcontroller.findAllAuthor);
     app.get('/api/author/:id', Authorcontroller.findOneAuthor);
     app.patch('/api/author/:id', Authorcontroller.updateExistingAuthor);
     app.post('/api/author', Authorcontroller.createNewAuthor);
     app.delete('/api/author/:id', Authorcontroller.deleteAnExistingAuthor);
     
}

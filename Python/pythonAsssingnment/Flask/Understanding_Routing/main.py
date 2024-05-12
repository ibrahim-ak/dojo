from flask import Flask  # Import Flask to allow us to create our app
app = Flask(__name__)

@app.route('/')          # The "@" decorator associates this route with the function immediately following        
def hello_world():

    return 'Hello World!'  # Return the string 'Hello World!' as a response

@app.route('/say/<name>')
def dojo (name):
    return f"HI {name}"
@app.route('/repeat/<id>/<name>')
def repeat(id,name):
    return f"{name} "*int(id)


@app.route('/<path:path>')
def error(path):
    return "bala habal emsheeeee"

if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.
    
    

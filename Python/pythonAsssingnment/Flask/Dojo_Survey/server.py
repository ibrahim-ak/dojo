from flask import Flask ,render_template,request , redirect, session
app = Flask (__name__)

app.secret_key = 'keep it secret, keep it safe'

@app.route('/')
def showingTheForm():
     return render_template('index.html')

@app.route('/result', methods =['POST'] )
def signup():
     
     session['username']= request.form['name']
     session['location']= request.form['location']
     session['language'] = request.form['language']
     session['comment'] = request.form['comment']
     return redirect ( '/final')
@app.route('/final')
def final():
     return render_template('result.html')

if __name__ == '__main__':
     app.run(debug=True)

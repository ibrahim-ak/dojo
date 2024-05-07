from flask import Flask ,render_template,session, redirect,request
app = Flask (__name__)
app.secret_key = 'ibrahim'
@app.route('/')
def showingTheForm():
     if 'counter' and 'counter2' in session:
          print('key exists!')
          session['counter2']+=1
          session['counter']+=1
     else:
          print("key 'key_name' does NOT exist")
          session['counter']=1
          session['counter2']=1

     return render_template('index.html' , count= session['counter'], counter2=session['counter2']  )

@app.route('/batata' , methods = ['POST'])
def batat():
     session.clear()
     return redirect('/')

@app.route('/incremntbyuser' ,methods = ['POST'] )
def incremtbyuser():
          
     
     numberuser = int(request.form['inputuser'])
     session['counter2']+=  numberuser -1
     return redirect('/')

@app.route('/two',methods =['POST'] )
def incrementbytwo():

     session['counter2']+=1
     return redirect('/')


if __name__ == '__main__':
     app.run(debug=True)

from flask import Flask ,render_template
app=Flask(__name__)

arry = ["/",'/name/times','/name/times/backgroundcolor' ]
@app.route('/')
def level1():
     return render_template('playground.html', numOfTimes = 3)

@app.route('/<name>/<times>/')
def level2(name,times):
     return render_template ('playground.html' , nameinsidehtml=name , numOfTimes = int(times))

@app.route('/<name>/<times>/<backgroundcolor>')
def level3(name,times ,backgroundcolor ):
     return render_template ('playground.html' , nameinsidehtml=name , numOfTimes = int(times),bcolor = backgroundcolor)


@app.route('/<path:path>')
def error(path):
     return f'this page is not working you can use the folowing paths only {arry}'
if __name__=="__main__":
     app.run(debug=True)
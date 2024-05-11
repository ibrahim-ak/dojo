from flask import Flask , render_template 
app  = Flask (__name__)
@app.route('/<numOfTimes1>/<numOfTimes2>/<fcolor>/<scolor>')
def checkbord(numOfTimes1 ,numOfTimes2 ,fcolor,scolor):
     totalmatrix = int(numOfTimes1)*int(numOfTimes2)
     return render_template('index.html' , numOfTimes1=int(numOfTimes1) ,numOfTimes2=int(numOfTimes2) ,
                         totalmatrix=int(totalmatrix)  ,fcolor=fcolor , scolor =scolor)

if __name__=="__main__":
     app.run(debug=True)

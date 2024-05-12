from flask import Flask, render_template, request, redirect
app = Flask(__name__)  

@app.route('/')         
def index():
    return render_template("index.html")

@app.route('/checkout', methods=['POST'])         
def checkout():
    stra=request.form['strawberry']
    ras=request.form['raspberry']
    apple=request.form['apple']
    first_name =request.form['first_name']
    last_name = request.form['last_name']
    print('*'*80)
    print (f'user name {first_name} , {last_name} ,the total fruits have been orderd {int(stra) +int(ras)+int(apple)}')
    print('*'*80)
    return render_template("checkout.html",first_name=first_name , last_name=last_name , stra=stra , ras=ras , apple=apple)

@app.route('/fruits')         
def fruits():
    return render_template("fruits.html")

if __name__=="__main__":   
    app.run(debug=True)    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Insert title here</title>
        </head>

        <body>
            <form action="/play" method='post'>
                <p>Pick any number between 5 and 25</p>
                <input type="number" name="num" min=5 max=25 value=5> <br> <br>
                <p>Enter the name of any city</p>
                <input type="text" name="city">
                <p>Enter the name of any real person</p>
                <input type="text" name="name">
                <p>Enter professional endeavor or hobby</p>
                <input type="text" name="hobby">
                <p>Enter any type of living thing</p>
                <input type="text" name="typeOfLiving">
                <p>Say something nice to someone</p>
                <textarea name="smth" rows="6" cols="40"></textarea>
                <p>Send and show a friend</p>
                <button>Send</button>

            </form>
        </body>

        </html>
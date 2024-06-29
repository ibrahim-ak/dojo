

<!DOCTYPE html>
<html lang="en">

     <head>
          <meta charset="UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
     </head>

     <body>
          <h1>
               <h1>Here is you Omikugi</h1>
               <p>In <c:out value="${num}"></c:out> years, you will live in <c:out value="${city }"></c:out> with
                    <c:out value="${name}"></c:out> as your room mate, <c:out value="${hobby}"></c:out> for a living.
                    The next time you see a <c:out value="${typeOfLiving }"></c:out> you will have a good luck.Also, <c:out
                         value="${smth}"></c:out>.</p>
               <a href="/omikugi">Go back</a>
          </h1>


     </body>

</html>
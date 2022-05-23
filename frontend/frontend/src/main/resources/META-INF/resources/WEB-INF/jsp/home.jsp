<%@ page import="java.util.ArrayList" %>
<%@ page import="com.frontend.frontend.models.User" %><%--
        Created by IntelliJ IDEA.
        User: Daniel
        Date: 13/05/2022
        Time: 16:04
        To change this template use File | Settings | File Templates.
        --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList<User> users= (ArrayList<User>) request.getAttribute("users"); %>

   <!DOCTYPE html>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<div class="container">
    <div class="card" onclick="flip(event)">
        <div class="front">
            <h1>Hey Joyce!</h1>
            <p> Please click me...</p>
            <% for (int i = 0; i < users.size(); i++) { %>
                <p><%= users.get(i).getFirstName() %></p>
                <p><%= users.get(i).getLastName() %></p>
            <% } %>
        </div>
        <div class="back">
            <h1>I love you and the food was good, so you don't need to sleep outside</h1>
        </div>
    </div>
</div>
<div>

</div>
<style>
    body {
        margin: 0;
        width: 100%;
        height: 100%;
        display: flex;
        justify-content: space-around;
        align-items: center;
        flex-wrap: wrap;
    }

    div {
        width: 100%;
        height: 100%;
    }

    .container {
        margin: 20px;
        width: 500px;
        height: 500px;
        perspective: 1000px;
    }

    .card {
        transition: transform 2s;
        transform-style: preserve-3d;
        cursor: pointer;
    }

    .front, .back {
        position: absolute;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        backface-visibility: hidden;
    }

    .front {
        border: 2px solid black;

    }

    .front:hover {
        bottom: 2px;
        left: 2px;
        box-shadow: 0px 0px 20px 1px #000;
    }

    .back {
        border: 2px solid black;

        transform: rotateY(180deg);
    }

    .back:hover {
        bottom: 2px;
        right: 2px;
        box-shadow: 0px 0px 20px 1px #000;
    }
</style>
<script>
    function flip(event){
        var element = event.currentTarget;
        if (element.className === "card") {
            if(element.style.transform == "rotateY(180deg)") {
                element.style.transform = "rotateY(0deg)";
            }
            else {
                element.style.transform = "rotateY(180deg)";
            }
        }
    };
</script>
</body>
</html>
<%@ page import="Entity.Event" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <content tag="nav">

    </content>

    <h1>List Events - Names</h1>

    <div id="content" role="main">
        <g:each var="evento" in="${Entity.Event.findAll()}">
            <h2>${evento.name}</h2>
            <ul>
                <g:each var="attendant" in="${evento.attendees}">
                    <li>
                        ${attendant.firstName}
                    </li>
                </g:each>

            </ul>

        </g:each>
    </div>

</body>
</html>

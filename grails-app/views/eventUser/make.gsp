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

<h1>Sign In</h1>

<td>
    <g:select id="person" name="selectedPersonId" from="${Person.list(sort:name, order:asc)}" value="name" optionValue="name" optionKey="id" noSelection="['0':'--Select--']" />
</td>
<!--<td>
    < g:select id="telephone" name="selectedTelephoneId" from ="${[]}" value="tNumber" optionValue="tNumber" optionKey="id" noSelection="['0','--Select--']"/>
</td>-->

</body>
</html>

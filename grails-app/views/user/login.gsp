<g:applyLayout name="bootstrapTemplate">
    <content tag="body">
        <div class="jumbotron text-center">
            <h1>Login</h1>
        </div>

        <g:if test="${flash.error}">
            <div class="alert alert-danger">
                ${flash.error}
            </div>
        </g:if>

        <g:form action="processLogin" >
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" name="username" id="username" class="form-control" />
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" name="password" id="password" class="form-control" />
            </div>

            <div class="form-group">
                <button type="submit" class="btn btn-lg btn-primary">Login</button>
            </div>
        </g:form>

    </content>
</g:applyLayout>
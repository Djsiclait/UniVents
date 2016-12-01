<g:applyLayout name="bootstrapTemplate">
    <content tag="body">
        <div class="jumbotron text-center">
            <h1>Edit Department</h1>
        </div>

        <div id="edit-department" class="content scaffold-edit" role="main">
            <h1>Department Fields</h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.department}">
                <ul class="errors" role="alert">
                    <g:eachError bean="${this.department}" var="error">
                        <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                    </g:eachError>
                </ul>
            </g:hasErrors>
            <g:form resource="${this.department}" method="PUT">
                <g:hiddenField name="version" value="${this.department?.version}" />
                <fieldset class="form">
                    <f:all bean="department"/>
                </fieldset>
                <g:submitButton name="update" class="btn btn-lg btn-success" value="Update" />
                <g:link class="btn btn-lg btn-danger" action="index">Cancel</g:link>
            </g:form>
            <br />
        </div>
    </content>
</g:applyLayout>

<g:applyLayout name="bootstrapTemplate">
    <content tag="body">
        <div id="show-contact" class="content scaffold-show" role="main">
            <h1>Contact Fields</h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:display bean="contact" />
            <g:form resource="${this.contact}" method="DELETE">
                <g:link class="btn btn-lg btn-info" action="edit" resource="${this.contact}">
                    <g:message code="default.button.edit.label" default="Edit" />
                </g:link>
                <input class="btn btn-lg btn-danger" type="submit" value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                       onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
            </g:form>
        </div>
    </content>
</g:applyLayout>

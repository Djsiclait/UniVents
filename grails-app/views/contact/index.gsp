<g:applyLayout name="bootstrapTemplate">
    <content tag="body">
        <div class="jumbotron text-center">
            <h1>Contacts</h1>
        </div>

        <div class="row">
            <div class="col-xs-3">
                <a class="btn btn-md btn-primary" href="/contact/create">Add New Contact</a>
            </div>
        </div>
        <br />

        <div id="list-contact" class="content scaffold-list" role="main">
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${contactList}" />

            <div class="pagination">
                <g:paginate total="${contactCount ?: 0}" />
            </div>
        </div>
    </content>
</g:applyLayout>
<g:applyLayout name="bootstrapTemplate">
    <content tag="body">
        <div class="jumbotron text-center">
            <h1>Categories</h1>
        </div>

        <div class="row">
            <div class="col-xs-3">
                <a class="btn btn-md btn-primary" href="/category/create">Add New Category</a>
            </div>
        </div>
        <br />

        <div id="list-category" class="content scaffold-list" role="main">
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${categoryList}" />

            <div class="pagination">
                <g:paginate total="${categoryCount ?: 0}" />
            </div>
        </div>
    </content>
</g:applyLayout>
<g:applyLayout name="bootstrapTemplate">

    <content tag="header">
        <gvisualization:apiImport />
    </content>

    <content tag="body">
        <div class="jumbotron text-center">
            <h1>Charts and Statistics</h1>
        </div>
        <br />
        <gvisualization:pieCoreChart elementId="dept-pie-chart" title="Contacts Per Department" width="${600}" height="${300}"
                                     columns="${deptColumns}" data="${deptData}" />

        <gvisualization:pieCoreChart elementId="cat-pie-chart" title="Contacts Per Category" width="${600}" height="${300}"
                                     columns="${catColumns}" data="${catData}" />

        <div id="dept-pie-chart" class="col-xs-6"></div>
        <div id="cat-pie-chart" class="col-xs-6"></div>

    </content>
</g:applyLayout>
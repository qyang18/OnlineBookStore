<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


</head>
	<body>
		<table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                <th>Name</th>
                <th>Url </th>
                <th>Type</th>
                <th>Last modified</th>
            </tr>
        </thead>
        <tbody>
        
        </tbody>
    </table>
	</body>
	
<script type="text/javascript">
$(document).ready(function() {
	$('#example').DataTable(
	{
		"bServerSide": true,
		"sAjaxSource":"http://localhost:8181/sample.json",
		"aoColumns":
		[
			{"aTargets": [1]},
			{"mData":"url"},
			{"mData":"editor.name"},
			{"mData":"editor.email"},
			
		]	
	}
	);
	
} );
</script>

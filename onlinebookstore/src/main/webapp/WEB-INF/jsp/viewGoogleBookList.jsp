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
                <th>Book Name</th>
                <th>Author</th>
                <th>Publisher</th>
                <th>PublishedDate</th>
                <th>AverageRating</th>
                <th>Language</th>
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
		/*"ServerSide": true,*/
		/*"ajax": 
		{
			"url": "https://www.googleapis.com/books/v1/volumes/s1gVAAAAYAAJ",
			"contentType": "application/json",
			"type": "GET"
		},*/
		/*"sAjaxSource":"http://localhost:8181/book.json",
		"aoColumns":
		[
			{"mData":"title"},
			{"mData":"authors"},
			{"mData":"publisher"},
			{"mData":"publishedDate"},
			{"mData":"averageRating"},
			{"mData":"language"}
		]*/
		serverSide: true,
		ajax: 
		{
			/*"url":"https://www.googleapis.com/books/v1/volumes/s1gVAAAAYAAJ",*/
			/*"url": "http://localhost:8181/sample2.json",*/
			"url": "http://localhost:8181/GoogleBook.json",
			"dataSrc": "volumeInfo"
			
		},
		columns:
		[
			{"data":"title"},
			{"data":"authors"},
			{"data":"publisher"},
			{"data":"publishedDate"},
			{"data":"averageRating"},
			{"data":"language"}
		]
		/*[
			{"data":"first_name"},
			{"data":"last_name"},
			{"data":"position"},
			{"data":"office"},
			{"data":"start_date"},
			{"data":"salary"}
		]*/
	}
	);
	
} );
</script>

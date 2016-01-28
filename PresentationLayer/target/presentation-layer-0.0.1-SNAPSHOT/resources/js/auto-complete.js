$(document).ready(function() {
	// Custom autocomplete instance.
	$.widget( "app.autocomplete", $.ui.autocomplete, {

	    // Which class get's applied to matched text in the menu items.
	    options: {
	        highlightClass: "ui-state-highlight"
	    },

	    _renderItem: function( ul, item ) {

	        // Replace the matched text with a custom span. This
	        // span uses the class found in the "highlightClass" option.
	        var re = new RegExp( "(" + this.term + ")", "gi" ),
	            cls = this.options.highlightClass,
	            template = "<span class='" + cls + "'>$1</span>",
	            label = item.label.replace( re, template ),
	            $li = $( "<li/>" ).appendTo( ul );

	        // Create and return the custom menu item content.
	        $( "<a/>" ).attr( "href", "#" )
	            .html( label )
	            .appendTo( $li );

	        return $li;

	    }

	});

	/*$( "#first-name" ).autocomplete({
		source: 'services.html'
	});*/
	
});
$( "#first-name" ).autocomplete({
	source: 'services.html'
});
/*
$.ajax({"type": "GET",
    "contentType": "text/html;charset=utf-8",
    "url": "services.html",
    "success": function(resp) {alert(resp);}
});

$.ajax({
    url : 'services',
    success : function(data) {
    	console.log(data)
        var docs = JSON.stringify(data.response.docs);
        var jsonData = JSON.parse(docs);

        resp = $.map(jsonData, function(value) {
            return {
                label : value.title[0],
                value : value.title[0]

            }
        });
        $("#first-name").autocomplete({
            highlightClass: "bold-text",
            minLength : 1,
            source :resp
        });

    },
    type: "POST",
    "dataType": "json"
});*/
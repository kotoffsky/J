<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--<footer class="page-footer"> 2016 &copy; Amani&Mykyta </footer>-->

<script src="<c:url value="/resources/lib/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/lib/jquery-pjax/jquery.pjax.js"/>"></script>
<script
	src="<c:url value="/resources/lib/bootstrap-sass/assets/javascripts/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/lib/widgster/widgster.js"/>"></script>
<script src="<c:url value="/resources/lib/underscore/underscore.js"/>"></script>
<script src="<c:url value="/resources/js/app.js"/>"></script>
<script src="<c:url value="/resources/js/settings.js"/>"></script>
<script
	src="<c:url value="/resources/lib/bootstrap-select/dist/js/bootstrap-select.min.js" />"></script>
<script src="<c:url value="/resources/js/lib/jquery-ui.js"/>"></script>
<script src="<c:url value="/resources/lib/select2/select2.min.js"/>"></script>
<script src="<c:url value="/resources/lib/moment/moment.js"/>"></script>
<script
	src="<c:url value="/resources/lib/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>"></script>
<script
	src="<c:url value="/resources/lib/parsleyjs/dist/parsley.min.js"/>"></script>
<script src="<c:url value="/resources/js/forms-account.js" />"></script>
<script src="<c:url value="/resources/lib/magnific-popup/dist/jquery.magnific-popup.min.js"/>"></script>
<script src="<c:url value="/resources/js/component-gallery.js"/>"></script>

<script src="<c:url value="/resources/lib/slimScroll/jquery.slimscroll.min.js"/>"></script>
        <script src="<c:url value="/resources/lib/jquery.sparkline/index.js"/>"></script>

        <script src="<c:url value="/resources/lib/backbone/backbone.js"/>"></script>
        <script src="<c:url value="/resources/lib/backbone.localStorage/backbone.localStorage-min.js"/>"></script>

        <script src="<c:url value="/resources/lib/d3/d3.min.js"/>"></script>
        <script src="<c:url value="/resources/lib/nvd3/build/nv.d3.min.js"/>"></script>

        <script src="<c:url value="/resources/js/index.js"/>"></script>
        <script src="<c:url value="/resources/js/chat.js"/>"></script>
        <script src="<c:url value="/resources/js/auto-complete.js"/>"></script>
        
        
	<script src="http://listjs.com/no-cdn/list.js"></script>
	<script type="text/javascript">
		var options = {
		  valueNames: [ 'serviceTitle', 'serviceDescription' ]
		};
		
		var userList = new List('servicesList', options);
	</script>
	
	<script>
		$(function () {
            $('#datetimepicker12').datetimepicker({
                inline: true
            });
        });
        var link = '';
		$('.demande, .offre').click(function(e){
			e.preventDefault();
			e.stopPropagation();
			link = $(this).attr('href');
			$('.bs-example-modal-sm').find('.datevalue').val('');
			$('.bs-example-modal-sm').modal('show');
			if($(this).hasClass('demande')) {
				$('.bs-example-modal-sm').find('.modal-title').html('Précisez la date limite de votre demande');
			}
			if($(this).hasClass('offre')) {
				$('.bs-example-modal-sm').find('.modal-title').html('Précisez la date limite de votre offre');
			}
		});
		$('.save-assoc').click(function(event) {
			var datevalue = $('.bs-example-modal-sm').find('.datevalue').val();
			console.log(datevalue);
			if(datevalue=="" || datevalue==undefined){
				console.log("Choisissez la date de limite pour le service");
				var timestampVal = new Date().getTime();
			} else {
				var timestampVal = new Date(datevalue).getTime();
			}
			console.log(timestampVal);
			if (timestampVal < new Date().getTime()) {
				console.log("La date est périmée");
				alert("La date est périmée. Choisissez une bonne date");
				return false;
			}
			link += '/'+timestampVal;
			console.log(link);
			$('.bs-example-modal-sm').modal('hide');
			window.location.replace(link);
		});
	</script>
</body>
</html>

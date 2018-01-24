// Head.xhtml
function resetForm(){
	document.getElementById('headerForm:resetForm').click();
	console.info("showLogin");
}

function newUserAccount(){
	document.getElementById('myForm:newUser').click();
	console.info("newUser");
}

function goProducts(){
	document.getElementById('headerForm:products').click();
	console.info("products");
}

function validateNumber(evt) {
	  var theEvent = evt || window.event;
	  var key = theEvent.keyCode || theEvent.which;
	  	  key = String.fromCharCode( key );
		  	  
	  var regex = /[0-9]/;
	  if( !regex.test(key) ) {
	    theEvent.returnValue = false;
	    if(theEvent.preventDefault) theEvent.preventDefault();
	  }
		  
	  return false;
}

// products.xhtml
$(document).on('click', '.number-spinner button', function () {    
	var btn = $(this),
		oldValue = btn.closest('.number-spinner').find('input').val().trim(),
		newVal = 0;
	
	if (btn.attr('data-dir') == 'up') {
		newVal = parseInt(oldValue) + 1;
	} else {
		if (oldValue > 1) {
			newVal = parseInt(oldValue) - 1;
		} else {
			newVal = 1;
		}
	}
	btn.closest('.number-spinner').find('input').val(newVal);
});
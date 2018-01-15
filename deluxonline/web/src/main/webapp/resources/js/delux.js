// Head.xhtml
function resetForm(){
	document.getElementById('headerForm:resetForm').click();
	console.info("showLogin");
}

function newUserAccount(){
	document.getElementById('myForm:newUser').click();
	console.info("newUser");
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


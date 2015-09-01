$(document).ready(function() {
    $.ajax(
    {
      url: "http://localhost:8080/resources/webservice.html",
      dataType: 'json'
    })
.done (function(data) { $('.greeting-id').append(data.id); $('.greeting-content').append(data.content); })                                              //alert("Success: " + data.id + " " + data.content) ; })
.fail   (function()     { alert("Error")   ; })
});
    
    
    
    
    /*.then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
    });
});
    */
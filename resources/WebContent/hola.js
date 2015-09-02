
$(document).ready(function() {
    $.ajax(
    {
       type: "GET", 
    	url: "http://localhost:8080/resources/webservice.html",
       /*headers: {
           Accept:"application/json",
           "Access-Control-Allow-Origin": "http://localhost:8080*"
       },*/
       dataType: "json",
      // url: "http://rest-service.guides.spring.io/greeting",
      
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
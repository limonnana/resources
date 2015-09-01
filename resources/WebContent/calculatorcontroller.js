app.controller("Calculator", function($scope)
	 { 
	   
	
	$scope.add = function(number){
		   
		   var uno = number.uno;
		   var dos = number.dos;
		   var result = uno + dos;
		  
		   $scope.number = {};
		   return result;
	   }
	 }
);
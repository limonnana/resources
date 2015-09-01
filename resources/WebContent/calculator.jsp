<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="MyApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  <link rel="stylesheet" type="text/css" href="bootstrap.min.css" />
  <script src="app.js" type="text/javascript"></script>
   <script src="calculatorcontroller.js" type="text/javascript"></script>
</head>
<body>
<div class="container">
   <div ng-controller="Calculator">
   <br><br>
    <table class="table table-bordered">
                    <tr>
                        <td> number 1: </td>
                        <td>
                            <input type="text" ng-model="number.uno" />
                        </td>
                    </tr>
                    <tr>
                        <td>number 2: </td>
                        <td>
                            <input type="text" ng-model="number.dos" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="Button" value="Add" ng-click="add(number)" />
                        </td>
                    </tr>
                    
                     <tr>
                        <td colspan="2">
                           {{add()}}
                        </td>
                    </tr>
     </table>               
   
   </div>
</div>
</body>
</html>
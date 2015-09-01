<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <html ng-app="MyApp">
<head>
<title>Books</title>
 <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
    <link rel="stylesheet" type="text/css" href="bootstrap.min.css" />
    <script src="app.js" type="text/javascript"></script>
    <script src="maincontroller.js" type="text/javascript"></script>
  </head>
<body>
    <div class="container">
        <div ng-controller="BookStore">
            <br />
            <h2>Add New Book</h2>
            <div style="border: 1px solid silver;">

                <table class="table">
                    <tr>
                        <td>ISBN: </td>
                        <td>
                            <input type="text" ng-model="item.ISBN" />
                        </td>
                    </tr>
                    <tr>
                        <td>Name: </td>
                        <td>
                            <input type="text" ng-model="item.Name" /></td>
                    </tr>
                    <tr>
                        <td>Price(In Rupee): </td>
                        <td>
                            <input type="number" ng-model="item.Price" /></td>
                    </tr>
                    <tr>
                        <td>Quantity: </td>
                        <td>
                            <input type="number" ng-model="item.Quantity" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="Button" value="Add to list" ng-click="addItem(item)" />
                        </td>
                    </tr>
                </table>
            </div>
            <div style="padding-top: 15px;">
                <table border="1" class="table">

                    <tr>
                        <td>ISBN</td>
                        <td>Name</td>
                        <td>Price</td>
                        <td>Quantity</td>
                        <td>Total Price</td>
                        <td>Action</td>
                    </tr>
                    <tr ng-repeat="item in items">
                        <td>{{item.ISBN}}</td>
                        <td>
                            <span ng-hide="editMode">{{item.Name}}</span>
                            <input type="text" ng-show="editMode" ng-model="item.Name" />
                        </td>
                        <td>
                            <span ng-hide="editMode">{{item.Price}}</span>
                            <input type="number" ng-show="editMode" ng-model="item.Price" /></td>
                        <td>
                            <span ng-hide="editMode">{{item.Quantity}}</span>
                            <input type="number" ng-show="editMode" ng-model="item.Quantity" /></td>
                        <td>{{(item.Quantity) * (item.Price)}}</td>
                        <td><span>
                            <button type="submit" ng-hide="editMode" ng-click="editMode = true; editItem(item)">Edit</button></span>
                            <span>
                                <button type="submit" ng-show="editMode" ng-click="editMode = false">Save</button></span>
                            <span>
                                <input type="button" value="Delete" ng-click="removeItem($index)" /></span></td>
                    </tr>

                </table>
            </div>
            <br />
            <div style="font-weight: bold">Grand Total: {{totalPrice()}}</div>
            <br />
        </div>
    </div>
    
</body>
</html>

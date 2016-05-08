/**
 * Created by Sebastian on 2016-05-08.
 */
var mainApp = angular.module("mainApp", ['ngRoute', 'ProductControllers'
            , 'ClientControllers', 'InvoiceControllers', 'WarehouseControllers']);

mainApp.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.

        when('/client/:id', {
            templateUrl: '/templates/client.html',
            controller: 'ClientController'
        }).

        when('/product/:id', {
            templateUrl: '/templates/product.html',
            controller: 'ProductController'
        }).

        when('/invoice/:id', {
            templateUrl: '/templates/invoice.html',
            controller: 'InvoiceController'
        }).

        when('/warehouse/:id', {
            templateUrl: '/templates/warehouse.html',
            controller: 'WarehouseController'
        }).

        otherwise({
            templateUrl: '/templates/main.html',
            controller: 'MainPageController'
        });

}])
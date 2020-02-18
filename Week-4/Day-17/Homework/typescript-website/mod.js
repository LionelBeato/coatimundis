var Admin = /** @class */ (function () {
    function Admin(name, age, loggedIn) {
        this.name = name;
        this.age = age;
        this.loggedIn = loggedIn;
    }
    Admin.prototype.getStatus = function () {
        console.log(this.loggedIn);
        return this.loggedIn;
    };
    return Admin;
}());
var Mike = new Admin("Mike", 34, true);
var myFunc = function () {
    Mike.getStatus();
};

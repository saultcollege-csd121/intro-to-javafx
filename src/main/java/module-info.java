module javafx.from.scratch {

    requires javafx.controls;  // Declare that this module uses the javafx.controls module

    // Every package that contains classes that are 'used' by other modules must be exported
    // This includes classes that extend other classes, implement interfaces, etc.
    // For example, all the packages below have at least one class that extends javafx.application.Application
    exports helloworld;
    exports iheartui;
}
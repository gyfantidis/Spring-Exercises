package sfgdi.sfgdi.controllers;

import sfgdi.sfgdi.services.GreetingService;

public class ConstructorInjectedContoller {
    private final GreetingService greetingService;

    public ConstructorInjectedContoller(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

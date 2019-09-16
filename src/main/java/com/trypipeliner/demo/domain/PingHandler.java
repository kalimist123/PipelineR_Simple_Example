package com.trypipeliner.demo.domain;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import com.trypipeliner.demo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class PingHandler implements Command.Handler<Ping, Voidy> {

    @Autowired
    SomeService someService;

    @Override
    public Voidy handle(Ping command) {
        String host = command.host;
        // ... ping logic here ...

        String thing = someService.someMessage();
        return new Voidy();
    }
}

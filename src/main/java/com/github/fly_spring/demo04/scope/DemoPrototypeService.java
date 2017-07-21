package com.github.fly_spring.demo04.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") //声明Scope为Prototype
public class DemoPrototypeService {

}

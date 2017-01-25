package com.hotel.core.development;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;


@Component(metatype=true,label="Enter the website name:",description = "Simple demo for cron-job like task with properties")
@Service
@Property(name = "scheduler.expression", value = "*/30 * * * * ?",
description = "Cron-job expression")
public class MyFirstOsgiComponent {

}

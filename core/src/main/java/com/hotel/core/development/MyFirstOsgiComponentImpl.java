package com.hotel.core.development;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;


@Component(label="Enter the website name:",description = "Simple demo for cron-job like task with properties")
@Service(value=MyFirstOsgiComponent.class)
@Property(name = "scheduler.concurrent", boolValue=false,
description = "Whether or not to schedule this task concurrently")
public class MyFirstOsgiComponentImpl implements MyFirstOsgiComponent {

}

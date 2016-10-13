package com.ex.test;

import com.ex.page.HelloWorldPage;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sean on 10/9/16.
 */
public class HelloWorldAppTest extends TestBase {

    @Autowired protected HelloWorldPage helloWorldPage;
}

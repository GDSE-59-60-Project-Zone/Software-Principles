package service.impl;

import service.Observer;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Dasun implements Observer {
    @Override
    public void update(String message) {
        System.out.println(" In Dasun's Wall :"+message);
    }
}

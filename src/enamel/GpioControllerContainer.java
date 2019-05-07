package enamel;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;

/**
 * Write a description of class GpioControllerContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GpioControllerContainer
{
   final GpioController gpio = GpioFactory.getInstance();
   
   public GpioController getGPIO() {
       return gpio;
   }
}

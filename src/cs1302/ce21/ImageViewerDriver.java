package cs1302.ce21;

import javafx.application.Application;

public class ImageViewerDriver {

    public static void main(String[] args) {
        try {
            Application.launch(ImageViewerApp.class, args);
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Likely due to X11 timeout. Logout and log back in...");
            System.exit(1);
        } // try
    } // main

} // ImageViewerDriver

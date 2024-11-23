#!/bin/bash

# Start Xvfb
Xvfb :99 -screen 0 1280x1024x24 &

# Start Fluxbox for GUI rendering
fluxbox &

# Start the Java application
java -cp "/app/classes:/app/lib/flatlaf-3.5.1.jar:/app/lib/flatlaf-intellij-themes-3.5.1.jar:/app/lib/material-themes-jetbrains-9.5.0.jar:/app/lib/*" jframes.JFrameLogin
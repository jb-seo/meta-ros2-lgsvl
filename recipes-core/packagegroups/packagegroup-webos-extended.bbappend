# Copyright (c) 2018 LG Electronics, Inc.

# You don't need to change this value when you're changing just a RDEPENDS_${PN} variable.
EXTENDPRAUTO_append = "ros2-lgsvl1"

RDEPENDS_${PN}_append = " \
    cv-bridge \
    python3-opencv \
    ros2-web-bridge \
    ros2-joy \
    com.enactjs.app.face \
    packagegroup-duckietown2 \
    packagegroup-duckietown-dependencies \
    com.palm.service.devmode \
    kernel-module-ff-memless \
    kernel-module-i2c-dev \
    kernel-module-joydev \
    kernel-module-panel-raspberrypi-touchscreen \
    kernel-module-rpi-ft5406 \
    kernel-module-spi-bcm2835 \
    kernel-module-spi-bcm2835aux \
    kernel-module-xpad \
"

RDEPENDS_${PN}_remove = "iotivity-node node-inspector nodejs-module-node-red nodejs-module-webos-service com.webos.service.contextintentmgr mojoservicelauncher"

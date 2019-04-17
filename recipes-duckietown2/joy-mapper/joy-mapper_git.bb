SUMMARY = "Joy mapper package for ROS2."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

inherit ros_common ament-python

RDEPENDS_${PN} = " \
    rclpy \
    sensor-msgs \
    geometry-msgs \
    duckietown-msgs \
    python3-rpi-gpio \
"

SRCREV = "6e3e342f2363bea10460a4acf4a004a3b3490901"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=05-teleop/joy_mapper \
"

S="${WORKDIR}/joy_mapper"

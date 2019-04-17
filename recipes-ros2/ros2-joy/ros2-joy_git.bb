SUMMARY = "Joy package for ROS2."

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

inherit ros_common ament

DEPENDS = " \
    rclcpp \
    sensor-msgs \
"

SRCREV = "2cb5fd9a2dceade2771db1e0801251f406dfe106"
SRC_URI = " \
    git://github.com/ros2/joystick_drivers.git;protocol=https;branch=ros2;subpath=joy \
"

# temporary to check joystick /dev/input/by-path
FILEXEXTRAPATHS_prepend := "${THISDIR}/files:"

ROS_BPN = "ros2-joy"

S="${WORKDIR}/joy"

FILES_${PN} = " \
    /usr/share/* \
    ${libdir}/* \
"

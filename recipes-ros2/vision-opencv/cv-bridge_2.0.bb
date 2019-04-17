SUMMARY = "C++ nodes which were previously in the ros2/examples repository but are now just used for demo purposes."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"
DEPENDS = " \
    opencv (>= 3.1) \
    boost \
    builtin-interfaces \
    geometry-msgs \
    sensor-msgs \
    ${PYTHON_PN}-numpy-native \
    ament-cmake-ros-native \
"

include vision-opencv.inc

S = "${WORKDIR}/git/${ROS_BPN}"

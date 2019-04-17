SUMMARY = "Dagu-car package for ROS2."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM="file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

inherit ros_common ament-python

PR = "r1"

DEPENDS += " \
    rclpy \
    builtin-interfaces \
    duckietown-msgs \
    python3-numpy-native \
"

RDEPENDS_${PN} = " \
    rclpy \
    builtin-interfaces \
    duckietown-msgs \
    python3-numpy \
"

SRCREV = "6e3e342f2363bea10460a4acf4a004a3b3490901"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=05-teleop/dagu_car \
"

S="${WORKDIR}/dagu_car"

do_install_append() {
    install -d ${D}/etc/modules-load.d
    echo "i2c-dev" > ${D}/etc/modules-load.d/i2c_dev.conf
}

FILES_${PN} += " /etc/modules-load.d"

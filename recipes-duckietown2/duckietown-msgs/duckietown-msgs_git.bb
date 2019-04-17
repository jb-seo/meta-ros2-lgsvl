SUMMARY = "Duckietown package for ROS2. Provides helper functions used in the Duckietown project."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

inherit ros_common ament

DEPENDS = " \
    builtin-interfaces \
    rosidl-default-generators \
    rosidl-adapter-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
    rosidl-generator-py-native \
    python-cmake-module-native \
    rosidl-typesupport-c-native \
    rosidl-typesupport-cpp-native \
    rosidl-typesupport-introspection-c-native \
    rosidl-typesupport-introspection-cpp-native \
    std-msgs \
    geometry-msgs \
    sensor-msgs \
    visualization-msgs \
"

RDEPENDS_${PN} = " \
    std-msgs \
    geometry-msgs \
    sensor-msgs\
"

SRCREV = "6e3e342f2363bea10460a4acf4a004a3b3490901"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=00-infrastructure/duckietown_msgs \
"

S="${WORKDIR}/duckietown_msgs"



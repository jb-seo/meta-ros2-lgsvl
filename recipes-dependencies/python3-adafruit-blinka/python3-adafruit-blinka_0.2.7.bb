SUMMARY = "Adafruit-Blinka 0.2.7 package for python 3"
LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=660e614bc7efb0697cc793d8a22a55c2"

PYPI_PACKAGE = "Adafruit-Blinka"

inherit pypi setuptools3

DEPENDS += " python3-setuptools-scm-native"

SRC_URI[sha256sum] = "e09bcdc9a332a2574e3d53c2b5100c7e5256e4f7ebdc251a1ec7080fd12fe19b"

RDEPENDS_${PN} += " \
    python3-adafruit-pureio \
"

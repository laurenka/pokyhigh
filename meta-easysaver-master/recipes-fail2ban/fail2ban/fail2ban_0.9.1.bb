require ${BPN}.inc

LICENSE = "GPLv2"
SRCREV = "${PV}"
LIC_FILES_CHKSUM = "file://COPYING;md5=ecabc31e90311da843753ba772885d9f"
SRC_URI[md5sum] = "6073a6e0d865587defacc4ea00b6c298"
SRC_URI[sha256sum] = "6e7e5b953ae1350e246fd50b87a1b1a0ea628a4a66f641117a1d2521e0a309ec"

SRC_URI += "file://0001-enable-fail2ban.patch"
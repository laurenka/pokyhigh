SUMMARY = "Smart OnOff System"
LICENSE = "CLOSED"

# Add missing RDEPENDS (should be implemented by npm class)
RDEPENDS_${PN} += "nodejs nodejs-npm"

SRC_URI = "http://dykim@192.168.0.88/smartonoff/production.git;protocol=http"

SRCREV = "7b44de07cdf2f08d94ee1f33a31699fc471004ca"
SRC_URI[md5sum] = "f3723dd6971d17b58df42cfd115b1718"

inherit npm

S = "${WORKDIR}/smartonoff"

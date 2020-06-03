#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Simple helloworld application"
SECTION = "examples"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
#SRC_URI = "file://helloworld.c"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

S = "${WORKDIR}"

IMAGE_INSTALL_append = " glibc"

do_install() {
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/rc5.d
	install -d ${D}${sysconfdir}/rc6.d
	install -d ${D}/home/root
	install -d ${D}${libdir}
	cp -r  ${THISDIR}/${P}/AppUpdate ${D}${sysconfdir}/init.d
	cp -r  ${THISDIR}/${P}/ncp_gateway ${D}${sysconfdir}/init.d
	cp -r  ${THISDIR}/${P}/NcpGateway ${D}/home/root
	cp -r  ${THISDIR}/${P}/gateway-infos.txt ${D}/home/root
	install -m 0755 ${THISDIR}/${P}/NcpGateway ${D}/home/root
	ln -sf ../init.d/ncp_gateway ${D}${sysconfdir}/rc5.d/S100ncp_gateway
	ln -sf ../init.d/AppUpdate ${D}${sysconfdir}/rc6.d/K100AppUpdate
	chmod +x ${D}${sysconfdir}/init.d/ncp_gateway
	chmod +x ${D}${sysconfdir}/init.d/AppUpdate
	chmod +x ${D}/home/root/NcpGateway
}

do_package_qa() {
}

FILES_${PN} += "${sysconfdir}/init.d"
FILES_${PN} += "${sysconfdir}/rc5.d"
FILES_${PN} += "${sysconfdir}/rc6.d"
FILES_${PN} += "${libdir}"
FILES_${PN} += "/home/root"

INSANE_SKIP_${PN}-dev += "ldflags"

INSANE_SKIP_${PN} += "ldflags"
INSANE_SKIP_${PN} += "already-stripped"


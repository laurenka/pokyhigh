DESCRIPTION = "New Realtek wifi driver"
SECTION = "kernel/modules"
HOMEPAGE = "https://github.com/lwfinger/rtlwifi_new"
LICENSE = "CLOSED"
#LICENSE = "ATMEL_LLA"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=8b6acde4490765c7b838377ac61e2d2d"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

RDEPENDS_rtlwifi = "kernel (${KERNEL_VERSION})"
DEPENDS = "virtual/kernel"

PR = "r0"

#SRCREV = "2d4f192f54fd78df5911089a49d172a9"
#SRC_URI[md5sum] = "2d4f192f54fd78df5911089a49d172a9"
SRC_URI = "git://github.com/lwfinger/rtlwifi_new.git;protocol=git;tag=master"

S = "${WORKDIR}/git"

inherit module

#KERNEL_MODULE_AUTOLOAD += "rtlwifi"

FILES_${PN} += "/lib/firmware"
FILES_${PN} += "/lib/firmware/rtl8812aefw.bin"
FILES_${PN} += "/lib/firmware/rtl8723befw.bin"
FILES_${PN} += "/lib/firmware/rtl8192sefw.old.bin"
FILES_${PN} += "/lib/firmware/rtl8192cfwU_B.bin"
FILES_${PN} += "/lib/firmware/rtl8821aefw_wowlan.bin"
FILES_${PN} += "/lib/firmware/rtl8192cfwU.bin"
FILES_${PN} += "/lib/firmware/rtl8821aefw_29.bin"
FILES_${PN} += "/lib/firmware/rtl8192sefw.bin"
FILES_${PN} += "/lib/firmware/rtl8821aefw.bin"
FILES_${PN} += "/lib/firmware/rtl8188efw.bin"
FILES_${PN} += "/lib/firmware/rtl8192eefw.bin"
FILES_${PN} += "/lib/firmware/rtl8192cfw.bin"
FILES_${PN} += "/lib/firmware/rtl8192defw_12.bin"
FILES_${PN} += "/lib/firmware/rtl8723fw.bin"
FILES_${PN} += "/lib/firmware/rtl8192eefw_new.bin"
FILES_${PN} += "/lib/firmware/rtl8723fw_B.bin"
FILES_${PN} += "/lib/firmware/Realtek-Firmware-License.txt"
FILES_${PN} += "/lib/firmware/rtl8723befw_36.bin"
FILES_${PN} += "/lib/firmware/rtl8812aefw_wowlan.bin"
FILES_${PN} += "/lib/firmware/rtl8192defw.bin"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.dep"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.alias.bin"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.dep.bin"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.devname"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.symbols.bin"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.symbols"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.alias"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.softdep"
FILES_${PN} += "/lib/modules/4.4.26-linux4sam_5.5-dirty/modules.builtin.bin"

do_package() {
}

do_package_qa() {
}

do_package_write_rpm() {
}

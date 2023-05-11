require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc
LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

UBOOT_INITIAL_ENV = "u-boot-initial-env"

COMPATIBLE_MACHINE = "(stm32f7x)"

SRCREV = "fd4ed6b7e83ec3aea9a2ce21baea8ca9676f40dd"

SRC_URI  = "git://source.denx.de/u-boot/u-boot.git;protocol=https;branch=master"
SRC_URI += "file://stm32f769-disco_defconfig.patch"

DEPENDS += "bc-native dtc-native python3-setuptools-native"


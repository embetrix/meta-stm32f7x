DESCRIPTION = "Mainline Linux Kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

DEPENDS += "lzop-native"

LINUX_VERSION_EXTENSION = ""

PV = "${LINUX_VERSION}+git${SRCPV}"

KCONFIG_MODE="--alldefconfig"

#COMPATIBLE_MACHINE:append = " stm32f769-disco"

COMPATIBLE_MACHINE = "(stm32f7x)"

KERNEL_VERSION_SANITY_SKIP="1"

SRC_URI  = "git://github.com/torvalds/linux.git;protocol=https;branch=${SRCBRANCH}"
SRC_URI += "file://defconfig"

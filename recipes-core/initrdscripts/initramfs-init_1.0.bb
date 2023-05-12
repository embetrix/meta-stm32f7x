SUMMARY = "basic initramfs image init script"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://initramfs-init.sh"

RDEPENDS:${PN} = "busybox"

S = "${WORKDIR}"

do_install() {

    install -m 0755 ${WORKDIR}/initramfs-init.sh ${D}/init

    install -d ${D}/dev
    install -d ${D}/tmp
    install -d ${D}/proc
    install -d ${D}/sys

    mknod -m 622 ${D}/dev/console c 5 1
}

FILES:${PN} += "/"

DESCRIPTION = "A STM32F7x initramfs"
LICENSE = "MIT"

inherit core-image

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""

IMAGE_INSTALL = "busybox"
PACKAGE_INSTALL = "busybox"

IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"

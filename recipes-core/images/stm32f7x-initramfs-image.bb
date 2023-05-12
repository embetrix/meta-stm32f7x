DESCRIPTION = "A STM32F7x initramfs"
LICENSE = "MIT"

inherit core-image

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""

PACKAGE_INSTALL = "initramfs-init"

IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"

IMAGE_FSTYPES = "cpio"


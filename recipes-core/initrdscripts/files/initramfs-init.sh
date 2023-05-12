#!/bin/sh

export PATH=$PATH:/sbin:/usr/sbin

# Init
INIT="/sbin/init"

mount -t devtmpfs none /dev
mount -t tmpfs tmp /tmp
mount -t proc proc /proc
mount -t sysfs sysfs /sys


sh
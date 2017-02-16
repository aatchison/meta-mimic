#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Mimic TTS Engine"
SECTION = "Mycroft"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://github.com/MycroftAI/mimic.git;protocol=http"

SRC_URI[md5sum] = "ab097b9f88a1e78f3fdb2ce6afd19869"

S = "${WORKDIR}"

DEPENDS = " gcc pulseaudio pkgconfig "

RDEPENDS_${PN} = " gcc pulseaudio pkgconfig "

inherit autotools


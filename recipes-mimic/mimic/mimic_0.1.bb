#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Mimic TTS Engine"
SECTION = "Mycroft"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://github.com/MycroftAI/mimic.git;protocol=http"

S = "${WORKDIR}"

do_compile() {
             ./configure # --prefix=
             make
}

do_install() {
             echo "install here"
             #make install
}

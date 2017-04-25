KV = "4.1.21"
SRCDATE = "20170424"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlx.info/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "8ec9eb0acdc1f97fb3eef409255674a5"
SRC_URI[sha256sum] = "ff934575fcc6ff527dd7118c73a0669eec65906f0bed0ea293f19e4f5e3ca45d"

COMPATIBLE_MACHINE = "xpeedc"

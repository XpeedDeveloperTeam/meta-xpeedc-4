KV = "4.1.21"
SRCDATE = "20160613"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlx.info/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "1d1edbb2a03f9854e85101e3b8effcb7"
SRC_URI[sha256sum] = "903fb43361ffb796a1036e311d0e3c6ba855603780869ca71d27bc4c86c2e168"

COMPATIBLE_MACHINE = "xpeedc"

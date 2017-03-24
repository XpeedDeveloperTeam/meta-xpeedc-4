KV = "4.1.21"
SRCDATE = "20170318"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlx.info/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "2f10f5f17a0f61162a1b7478a253abbf"
SRC_URI[sha256sum] = "09a8e1da09454fd571704dba2bfe35300c10634b44e61313a56e0a334944ec29"

COMPATIBLE_MACHINE = "xpeedc"

package com.vkornee.kampap

import java.util.Locale


class DesktopPlatform: Platform {
    override val name: String = System.getProperty("os.name").lowercase(Locale.ROOT)
}

actual fun getPlatform(): Platform = DesktopPlatform()

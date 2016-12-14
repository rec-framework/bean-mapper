package net.kimleo.rec

inline fun <T, U> T?.bind(fn: (T) -> U?): U? =
        if (this == null) null else fn.invoke(this)

inline fun <T> T?.orElse(fn: () -> T) =
        if (this != null) this else fn.invoke()

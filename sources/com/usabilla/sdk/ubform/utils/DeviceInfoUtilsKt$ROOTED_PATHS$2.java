package com.usabilla.sdk.ubform.utils;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, mo22516d2 = {"", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class DeviceInfoUtilsKt$ROOTED_PATHS$2 extends Lambda implements C11289a<String[]> {

    /* renamed from: f */
    public static final DeviceInfoUtilsKt$ROOTED_PATHS$2 f27826f = new DeviceInfoUtilsKt$ROOTED_PATHS$2();

    public DeviceInfoUtilsKt$ROOTED_PATHS$2() {
        super(0);
    }

    @C12579k
    /* renamed from: a */
    public final String[] invoke() {
        return new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
    }
}

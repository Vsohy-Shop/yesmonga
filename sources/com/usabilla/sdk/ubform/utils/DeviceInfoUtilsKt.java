package com.usabilla.sdk.ubform.utils;

import java.io.File;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class DeviceInfoUtilsKt {
    @C12579k

    /* renamed from: a */
    public static final C11677z f27825a = C10864b0.m38748c(DeviceInfoUtilsKt$ROOTED_PATHS$2.f27826f);

    /* renamed from: b */
    public static final String[] m38271b() {
        return (String[]) f27825a.getValue();
    }

    /* renamed from: d */
    public static final /* synthetic */ boolean m38273d() {
        for (String stringPlus : m38271b()) {
            if (new File(Intrinsics.stringPlus(stringPlus, "su")).exists()) {
                return true;
            }
        }
        return false;
    }
}

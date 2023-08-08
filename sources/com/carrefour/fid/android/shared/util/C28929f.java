package com.carrefour.fid.android.shared.util;

import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCacheUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheUtils.kt\ncom/carrefour/fid/android/shared/util/CacheUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4:1\n1#2:5\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.util.f */
public final class C28929f {
    /* renamed from: a */
    public static final boolean m119636a(@C12580l Long l, int i) {
        if (l == null) {
            return false;
        }
        return System.currentTimeMillis() - ((long) i) < l.longValue();
    }
}

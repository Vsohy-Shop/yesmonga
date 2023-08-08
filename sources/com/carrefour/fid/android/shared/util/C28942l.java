package com.carrefour.fid.android.shared.util;

import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.util.l */
public final class C28942l {
    @C12579k
    /* renamed from: a */
    public static final <T, R> Map<T, R> m119736a(@C12579k Map<T, ? extends R> map, @C12580l Map<T, ? extends R> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map2 == null) {
            return map;
        }
        return C10977s0.m41473n0(map, map2);
    }
}

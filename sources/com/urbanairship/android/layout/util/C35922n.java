package com.urbanairship.android.layout.util;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.util.n */
public final class C35922n {
    /* renamed from: a */
    public static final void m148121a(@C12580l String str, @C12579k C11300l<? super String, C11079d2> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lVar.invoke(str);
        }
    }
}

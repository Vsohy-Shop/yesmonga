package com.contentsquare.android.error;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.error.c */
public final class C14119c {
    /* renamed from: a */
    public static final void m60669a(C14118b bVar, C11300l<? super C14118b, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(bVar, "$this$trace");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        bVar.mo34378c();
        try {
            lVar.invoke(bVar);
        } finally {
            C11322b0.m43481d(1);
            bVar.mo34379d();
            C11322b0.m43480c(1);
        }
    }
}

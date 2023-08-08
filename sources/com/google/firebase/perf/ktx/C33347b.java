package com.google.firebase.perf.ktx;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.firebase.ktx.C33135b;
import com.google.firebase.perf.C33314e;
import com.google.firebase.perf.metrics.C33380h;
import com.google.firebase.perf.metrics.Trace;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.google.firebase.perf.ktx.b */
public final class C33347b {
    @C12579k

    /* renamed from: a */
    public static final String f81039a = "fire-perf-ktx";

    @C12579k
    /* renamed from: a */
    public static final C33314e m134445a(@C12579k C33135b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        C33314e c = C33314e.m134397c();
        Intrinsics.checkNotNullExpressionValue(c, "getInstance()");
        return c;
    }

    /* renamed from: b */
    public static final <T> T m134446b(@C12579k Trace trace, @C12579k C11300l<? super Trace, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(trace, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        trace.start();
        try {
            return lVar.invoke(trace);
        } finally {
            C11322b0.m43481d(1);
            trace.stop();
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: c */
    public static final <T> T m134447c(@C12579k String str, @C12579k C11300l<? super Trace, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        Trace c = Trace.m134506c(str);
        Intrinsics.checkNotNullExpressionValue(c, "create(name)");
        c.start();
        try {
            return lVar.invoke(c);
        } finally {
            C11322b0.m43481d(1);
            c.stop();
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: d */
    public static final void m134448d(@C12579k C33380h hVar, @C12579k C11300l<? super C33380h, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        hVar.mo96531h();
        try {
            lVar.invoke(hVar);
        } finally {
            C11322b0.m43481d(1);
            hVar.mo96532i();
            C11322b0.m43480c(1);
        }
    }
}

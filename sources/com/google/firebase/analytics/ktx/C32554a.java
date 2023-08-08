package com.google.firebase.analytics.ktx;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.C33135b;
import com.google.firebase.ktx.C33136c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.google.firebase.analytics.ktx.a */
public final class C32554a {
    @C12580l

    /* renamed from: a */
    public static volatile FirebaseAnalytics f79022a = null;
    @C12579k

    /* renamed from: b */
    public static final Object f79023b = new Object();
    @C12579k

    /* renamed from: c */
    public static final String f79024c = "fire-analytics-ktx";

    @C12580l
    /* renamed from: a */
    public static final FirebaseAnalytics m131584a() {
        return f79022a;
    }

    @C12579k
    /* renamed from: b */
    public static final FirebaseAnalytics m131585b(@C12579k C33135b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (f79022a == null) {
            synchronized (f79023b) {
                if (f79022a == null) {
                    f79022a = FirebaseAnalytics.getInstance(C33136c.m133646c(C33135b.f80374a).mo95721n());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f79022a;
        Intrinsics.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @C12579k
    /* renamed from: c */
    public static final Object m131586c() {
        return f79023b;
    }

    /* renamed from: d */
    public static final void m131587d(@C12579k FirebaseAnalytics firebaseAnalytics, @C12579k String str, @C12579k C11300l<? super C32556c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C32556c cVar = new C32556c();
        lVar.invoke(cVar);
        firebaseAnalytics.mo94632c(str, cVar.mo94668a());
    }

    /* renamed from: e */
    public static final void m131588e(@C12580l FirebaseAnalytics firebaseAnalytics) {
        f79022a = firebaseAnalytics;
    }

    /* renamed from: f */
    public static final void m131589f(@C12579k FirebaseAnalytics firebaseAnalytics, @C12579k C11300l<? super C32555b, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C32555b bVar = new C32555b();
        lVar.invoke(bVar);
        firebaseAnalytics.mo94635f(bVar.mo94663a());
    }
}

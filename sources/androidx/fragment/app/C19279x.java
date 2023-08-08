package androidx.fragment.app;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.fragment.app.x */
public final class C19279x {
    /* renamed from: a */
    public static final void m90417a(@C12579k FragmentManager fragmentManager, boolean z, @C12579k C11300l<? super C19234h0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "body");
        C19234h0 u = fragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        lVar.invoke(u);
        if (z) {
            u.mo57053r();
        } else {
            u.mo57052q();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m90418b(FragmentManager fragmentManager, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "body");
        C19234h0 u = fragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        lVar.invoke(u);
        if (z) {
            u.mo57053r();
        } else {
            u.mo57052q();
        }
    }

    /* renamed from: c */
    public static final void m90419c(@C12579k FragmentManager fragmentManager, boolean z, @C12579k C11300l<? super C19234h0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "body");
        C19234h0 u = fragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        lVar.invoke(u);
        if (z) {
            u.mo57055t();
        } else {
            u.mo57054s();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m90420d(FragmentManager fragmentManager, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "body");
        C19234h0 u = fragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        lVar.invoke(u);
        if (z) {
            u.mo57055t();
        } else {
            u.mo57054s();
        }
    }

    @C11395k(message = "Use commit { .. } or commitNow { .. } extensions")
    /* renamed from: e */
    public static final void m90421e(@C12579k FragmentManager fragmentManager, boolean z, boolean z2, @C12579k C11300l<? super C19234h0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "body");
        C19234h0 u = fragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        lVar.invoke(u);
        if (z) {
            if (z2) {
                u.mo57055t();
            } else {
                u.mo57054s();
            }
        } else if (z2) {
            u.mo57053r();
        } else {
            u.mo57052q();
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m90422f(FragmentManager fragmentManager, boolean z, boolean z2, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "body");
        C19234h0 u = fragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        lVar.invoke(u);
        if (z) {
            if (z2) {
                u.mo57055t();
            } else {
                u.mo57054s();
            }
        } else if (z2) {
            u.mo57053r();
        } else {
            u.mo57052q();
        }
    }
}

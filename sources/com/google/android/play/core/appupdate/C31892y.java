package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.splitcompat.C32150r;

/* renamed from: com.google.android.play.core.appupdate.y */
public final /* synthetic */ class C31892y {

    /* renamed from: a */
    public static C31866a0 f77785a;

    /* renamed from: a */
    public static synchronized C31866a0 m129374a(Context context) {
        C31866a0 a0Var;
        synchronized (C31892y.class) {
            if (f77785a == null) {
                C31893z zVar = new C31893z((byte[]) null);
                zVar.mo92456b(new C31876j(C32150r.m130103c(context)));
                f77785a = zVar.mo92455a();
            }
            a0Var = f77785a;
        }
        return a0Var;
    }
}

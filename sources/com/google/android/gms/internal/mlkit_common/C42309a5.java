package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.mlkit_common.a5 */
public final class C42309a5 {

    /* renamed from: d */
    public static final C42309a5 f106831d;

    /* renamed from: e */
    public static final C42309a5 f106832e;

    /* renamed from: a */
    public final boolean f106833a;

    /* renamed from: b */
    public final boolean f106834b = false;

    /* renamed from: c */
    public final zzan<C42434l9> f106835c;

    static {
        C42567y2 y2Var = new C42567y2((C42556x1) null);
        y2Var.mo137837a();
        f106831d = y2Var.mo137839c();
        C42567y2 y2Var2 = new C42567y2((C42556x1) null);
        y2Var2.mo137838b();
        f106832e = y2Var2.mo137839c();
    }

    public /* synthetic */ C42309a5(boolean z, boolean z2, zzan zzan, C42578z3 z3Var) {
        this.f106833a = z;
        this.f106835c = zzan;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ int m171396c(C42309a5 a5Var, Context context, C42423k9 k9Var) {
        zzan<C42434l9> zzan = a5Var.f106835c;
        int size = zzan.size();
        int i = 0;
        while (i < size) {
            int a = zzan.get(i).mo137733a();
            int i2 = a - 1;
            if (a != 0) {
                i++;
                if (i2 == 0) {
                    return 1;
                }
                if (i2 == 1) {
                    return 2;
                }
            } else {
                throw null;
            }
        }
        return 3;
    }
}

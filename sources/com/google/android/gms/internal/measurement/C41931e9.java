package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e9 */
public final class C41931e9 {

    /* renamed from: b */
    public static volatile boolean f106094b = false;

    /* renamed from: c */
    public static volatile C41931e9 f106095c;

    /* renamed from: d */
    public static final C41931e9 f106096d = new C41931e9(true);

    /* renamed from: e */
    public static final /* synthetic */ int f106097e = 0;

    /* renamed from: a */
    public final Map f106098a;

    public C41931e9() {
        this.f106098a = new HashMap();
    }

    /* renamed from: a */
    public static C41931e9 m169822a() {
        C41931e9 e9Var = f106095c;
        if (e9Var != null) {
            return e9Var;
        }
        synchronized (C41931e9.class) {
            C41931e9 e9Var2 = f106095c;
            if (e9Var2 != null) {
                return e9Var2;
            }
            C41931e9 b = C42057l9.m170493b(C41931e9.class);
            f106095c = b;
            return b;
        }
    }

    /* renamed from: b */
    public final C42126p9 mo136720b(C42246wa waVar, int i) {
        return (C42126p9) this.f106098a.get(new C41913d9(waVar, i));
    }

    public C41931e9(boolean z) {
        this.f106098a = Collections.emptyMap();
    }
}

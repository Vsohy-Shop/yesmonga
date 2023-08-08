package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
public abstract class C42252x {

    /* renamed from: a */
    public final List f106488a = new ArrayList();

    /* renamed from: a */
    public abstract C42133q mo136495a(String str, C41909d5 d5Var, List list);

    /* renamed from: b */
    public final C42133q mo137448b(String str) {
        if (this.f106488a.contains(C41928e6.m169807e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}

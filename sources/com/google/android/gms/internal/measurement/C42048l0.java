package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
public final class C42048l0 extends C42252x {
    /* renamed from: a */
    public final C42133q mo136495a(String str, C41909d5 d5Var, List list) {
        if (str == null || str.isEmpty() || !d5Var.mo136679h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C42133q d = d5Var.mo136675d(str);
        if (d instanceof C42011j) {
            return ((C42011j) d).mo136725a(d5Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}

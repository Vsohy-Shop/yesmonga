package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.w0 */
public final class C31998w0 {

    /* renamed from: a */
    public final Map<String, Double> f78168a = new HashMap();

    /* renamed from: a */
    public final synchronized void mo92702a(String str) {
        this.f78168a.put(str, Double.valueOf(0.0d));
    }

    /* renamed from: b */
    public final synchronized double mo92703b(String str) {
        Double d = this.f78168a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* renamed from: c */
    public final synchronized double mo92704c(String str, C31951l1 l1Var) {
        double d;
        d = (((double) ((C31978r0) l1Var).f78065g) + 1.0d) / ((double) ((C31978r0) l1Var).f78066h);
        this.f78168a.put(str, Double.valueOf(d));
        return d;
    }
}

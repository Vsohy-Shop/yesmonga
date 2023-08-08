package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C42095nc;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
public final class C30924w4 implements C42095nc {

    /* renamed from: a */
    public final /* synthetic */ String f74042a;

    /* renamed from: b */
    public final /* synthetic */ C30936x4 f74043b;

    public C30924w4(C30936x4 x4Var, String str) {
        this.f74043b = x4Var;
        this.f74042a = str;
    }

    /* renamed from: a */
    public final String mo87562a(String str) {
        Map map = (Map) this.f74043b.f74068d.get(this.f74042a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}

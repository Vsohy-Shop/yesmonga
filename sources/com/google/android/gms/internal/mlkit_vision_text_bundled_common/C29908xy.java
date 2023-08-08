package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy */
public final class C29908xy {

    /* renamed from: b */
    public static volatile boolean f71536b = false;

    /* renamed from: c */
    public static volatile C29908xy f71537c;

    /* renamed from: d */
    public static volatile C29908xy f71538d;

    /* renamed from: e */
    public static final C29908xy f71539e = new C29908xy(true);

    /* renamed from: a */
    public final Map<C29871wy, C29428kz<?, ?>> f71540a;

    public C29908xy() {
        this.f71540a = new HashMap();
    }

    /* renamed from: a */
    public static C29908xy m121340a() {
        C29908xy xyVar = f71537c;
        if (xyVar == null) {
            synchronized (C29908xy.class) {
                xyVar = f71537c;
                if (xyVar == null) {
                    xyVar = f71539e;
                    f71537c = xyVar;
                }
            }
        }
        return xyVar;
    }

    /* renamed from: b */
    public static C29908xy m121341b() {
        C29908xy xyVar = f71538d;
        if (xyVar != null) {
            return xyVar;
        }
        synchronized (C29908xy.class) {
            C29908xy xyVar2 = f71538d;
            if (xyVar2 != null) {
                return xyVar2;
            }
            C29908xy b = C29207ez.m120369b(C29908xy.class);
            f71538d = b;
            return b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends x00> C29428kz<ContainingType, ?> mo84913c(ContainingType containingtype, int i) {
        return this.f71540a.get(new C29871wy(containingtype, i));
    }

    public C29908xy(boolean z) {
        this.f71540a = Collections.emptyMap();
    }
}

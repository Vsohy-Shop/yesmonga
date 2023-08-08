package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1 */
public final class C39101z1 {

    /* renamed from: b */
    public static volatile boolean f98974b = false;

    /* renamed from: c */
    public static volatile C39101z1 f98975c;

    /* renamed from: d */
    public static final C39101z1 f98976d = new C39101z1(true);

    /* renamed from: a */
    public final Map<C39092y1, C38985m2<?, ?>> f98977a;

    public C39101z1() {
        this.f98977a = new HashMap();
    }

    /* renamed from: a */
    public static C39101z1 m160998a() {
        C39101z1 z1Var = f98975c;
        if (z1Var == null) {
            synchronized (C39101z1.class) {
                z1Var = f98975c;
                if (z1Var == null) {
                    z1Var = f98976d;
                    f98975c = z1Var;
                }
            }
        }
        return z1Var;
    }

    /* renamed from: b */
    public final <ContainingType extends C39076w3> C38985m2<ContainingType, ?> mo123132b(ContainingType containingtype, int i) {
        return this.f98977a.get(new C39092y1(containingtype, i));
    }

    public C39101z1(boolean z) {
        this.f98977a = Collections.emptyMap();
    }
}

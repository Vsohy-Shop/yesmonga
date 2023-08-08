package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b2 */
public final class C38875b2 extends C38865a2<C38975l2> {
    /* renamed from: a */
    public final int mo122777a(Map.Entry<?, ?> entry) {
        return ((C38975l2) entry.getKey()).f98885a;
    }

    /* renamed from: b */
    public final C38905e2<C38975l2> mo122778b(Object obj) {
        return ((C38965k2) obj).zza;
    }

    /* renamed from: c */
    public final C38905e2<C38975l2> mo122779c(Object obj) {
        return ((C38965k2) obj).mo122948B();
    }

    /* renamed from: d */
    public final Object mo122780d(C39101z1 z1Var, C39076w3 w3Var, int i) {
        return z1Var.mo123132b(w3Var, i);
    }

    /* renamed from: e */
    public final void mo122781e(Object obj) {
        ((C38965k2) obj).zza.mo122865g();
    }

    /* renamed from: f */
    public final boolean mo122782f(C39076w3 w3Var) {
        return w3Var instanceof C38965k2;
    }

    /* renamed from: g */
    public final void mo122783g(C39065v1 v1Var, Map.Entry<?, ?> entry) throws IOException {
        C38975l2 l2Var = (C38975l2) entry.getKey();
        zzhp zzhp = zzhp.DOUBLE;
        switch (l2Var.f98886b.ordinal()) {
            case 0:
                v1Var.mo123092r(l2Var.f98885a, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                v1Var.mo123064A(l2Var.f98885a, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                v1Var.mo123069F(l2Var.f98885a, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                v1Var.mo123086k(l2Var.f98885a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                v1Var.mo123067D(l2Var.f98885a, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                v1Var.mo123099y(l2Var.f98885a, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                v1Var.mo123097w(l2Var.f98885a, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                v1Var.mo123088n(l2Var.f98885a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                v1Var.mo123082g(l2Var.f98885a, (String) entry.getValue());
                return;
            case 9:
                v1Var.mo123066C(l2Var.f98885a, entry.getValue(), C38917f4.m160495a().mo122883b(entry.getValue().getClass()));
                return;
            case 10:
                v1Var.mo123071H(l2Var.f98885a, entry.getValue(), C38917f4.m160495a().mo122883b(entry.getValue().getClass()));
                return;
            case 11:
                v1Var.mo123090p(l2Var.f98885a, (zzdc) entry.getValue());
                return;
            case 12:
                v1Var.mo123084i(l2Var.f98885a, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                v1Var.mo123067D(l2Var.f98885a, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                v1Var.mo123073J(l2Var.f98885a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                v1Var.mo123075L(l2Var.f98885a, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                v1Var.mo123077b(l2Var.f98885a, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                v1Var.mo123079d(l2Var.f98885a, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}

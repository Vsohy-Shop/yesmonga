package androidx.compose.foundation.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;

/* renamed from: androidx.compose.foundation.text.z */
public final class C2852z {
    /* renamed from: b */
    public static final long m13161b(long j, C15098i iVar) {
        float f;
        float f2;
        if (C15094f.m64880p(j) < iVar.mo42279t()) {
            f = iVar.mo42279t();
        } else if (C15094f.m64880p(j) > iVar.mo42283x()) {
            f = iVar.mo42283x();
        } else {
            f = C15094f.m64880p(j);
        }
        if (C15094f.m64882r(j) < iVar.mo42249B()) {
            f2 = iVar.mo42249B();
        } else if (C15094f.m64882r(j) > iVar.mo42271j()) {
            f2 = iVar.mo42271j();
        } else {
            f2 = C15094f.m64882r(j);
        }
        return C15096g.m64898a(f, f2);
    }
}

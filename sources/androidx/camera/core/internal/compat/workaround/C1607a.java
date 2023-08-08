package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.C0359n0;
import androidx.camera.core.C1353a2;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.internal.compat.quirk.C1599a;
import androidx.camera.core.internal.compat.quirk.C1601c;

/* renamed from: androidx.camera.core.internal.compat.workaround.a */
public class C1607a {
    /* renamed from: a */
    public boolean mo5597a() {
        C1601c cVar = (C1601c) C1599a.m6623a(C1601c.class);
        if (cVar != null) {
            return cVar.mo5596c(C1583y.f4496g);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo5598b(@C0359n0 C1353a2 a2Var) {
        C1601c cVar = (C1601c) C1599a.m6623a(C1601c.class);
        if ((cVar == null || cVar.mo5596c(C1583y.f4496g)) && a2Var.getFormat() == 256) {
            return true;
        }
        return false;
    }
}

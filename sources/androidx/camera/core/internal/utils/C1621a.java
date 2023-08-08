package androidx.camera.core.internal.utils;

import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.utils.C1515c;

/* renamed from: androidx.camera.core.internal.utils.a */
public final class C1621a {
    /* renamed from: a */
    public static void m6677a(@C0359n0 C1488o1.C1489a<?, ?, ?> aVar, int i) {
        Size N;
        C1491p0 p0Var = (C1491p0) aVar.mo4862o();
        int F = p0Var.mo5293F(-1);
        if (F == -1 || F != i) {
            ((C1491p0.C1492a) aVar).mo4853d(i);
        }
        if (F != -1 && i != -1 && F != i) {
            if (Math.abs(C1515c.m6375c(i) - C1515c.m6375c(F)) % 180 == 90 && (N = p0Var.mo5295N((Size) null)) != null) {
                ((C1491p0.C1492a) aVar).mo4860m(new Size(N.getHeight(), N.getWidth()));
            }
        }
    }
}

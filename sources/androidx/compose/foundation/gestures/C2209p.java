package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;

/* renamed from: androidx.compose.foundation.gestures.p */
public interface C2209p {

    /* renamed from: androidx.compose.foundation.gestures.p$a */
    public static final class C2210a {
    }

    /* renamed from: b */
    static /* synthetic */ void m9577b(C2209p pVar, float f, long j, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            if ((i & 2) != 0) {
                j = C15094f.f37256b.mo42248e();
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            pVar.mo7366a(f, j, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
    }

    /* renamed from: a */
    void mo7366a(float f, long j, float f2);
}

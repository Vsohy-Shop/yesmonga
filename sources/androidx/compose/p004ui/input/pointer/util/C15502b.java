package androidx.compose.p004ui.input.pointer.util;

import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.pointer.util.b */
public final class C15502b {
    @C12579k

    /* renamed from: a */
    public final C15503c[] f38557a;

    public C15502b(int i, int i2) {
        C15503c[] cVarArr = new C15503c[i];
        for (int i3 = 0; i3 < i; i3++) {
            cVarArr[i3] = new C15503c(i2);
        }
        this.f38557a = cVarArr;
    }

    /* renamed from: a */
    public final float mo44148a(int i, int i2) {
        return this.f38557a[i].mo44151a(i2);
    }

    @C12579k
    /* renamed from: b */
    public final C15503c mo44149b(int i) {
        return this.f38557a[i];
    }

    /* renamed from: c */
    public final void mo44150c(int i, int i2, float f) {
        this.f38557a[i].mo44155e(i2, f);
    }
}

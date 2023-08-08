package androidx.compose.runtime.snapshots;

import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.snapshots.s */
public final class C8666s {
    @C12579k

    /* renamed from: a */
    public static final Object f23219a = new Object();

    /* renamed from: d */
    public static final Void m31819d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* renamed from: e */
    public static final void m31820e(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }
}

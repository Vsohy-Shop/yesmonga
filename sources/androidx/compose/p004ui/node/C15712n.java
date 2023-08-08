package androidx.compose.p004ui.node;

/* renamed from: androidx.compose.ui.node.n */
public final class C15712n {
    /* renamed from: a */
    public static final long m70431a(float f, boolean z) {
        long j;
        long floatToIntBits = (long) Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return C15690h.m70274c((j & 4294967295L) | (floatToIntBits << 32));
    }
}

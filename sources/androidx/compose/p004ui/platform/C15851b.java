package androidx.compose.p004ui.platform;

/* renamed from: androidx.compose.ui.platform.b */
public interface C15851b {

    /* renamed from: androidx.compose.ui.platform.b$a */
    public static final class C15852a {
    }

    /* renamed from: a */
    static /* synthetic */ long m71255a(C15851b bVar, long j, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return bVar.mo45677b(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
    }

    /* renamed from: b */
    long mo45677b(long j, boolean z, boolean z2, boolean z3);
}

package kotlin;

/* renamed from: kotlin.i1 */
public final /* synthetic */ class C11104i1 {
    /* renamed from: a */
    public static /* synthetic */ long m42815a(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if ((j3 ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
            j2 = 0;
        }
        return j3 - j2;
    }
}

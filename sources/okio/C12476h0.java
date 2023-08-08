package okio;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.h0 */
public final class C12476h0 implements C12510p0 {

    /* renamed from: a */
    public final C12500m f30419a;

    /* renamed from: b */
    public C12498l0 f30420b;

    /* renamed from: c */
    public int f30421c;

    /* renamed from: d */
    public boolean f30422d;

    /* renamed from: e */
    public long f30423e;

    /* renamed from: f */
    public final C12507o f30424f;

    public C12476h0(@C12579k C12507o oVar) {
        int i;
        Intrinsics.checkNotNullParameter(oVar, "upstream");
        this.f30424f = oVar;
        C12500m e = oVar.mo27292e();
        this.f30419a = e;
        C12498l0 l0Var = e.f30464a;
        this.f30420b = l0Var;
        if (l0Var != null) {
            i = l0Var.f30458b;
        } else {
            i = -1;
        }
        this.f30421c = i;
    }

    public void close() {
        this.f30422d = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f30458b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long read(@org.jetbrains.annotations.C12579k okio.C12500m r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f30422d
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x007b
            okio.l0 r5 = r8.f30420b
            if (r5 == 0) goto L_0x002a
            okio.m r6 = r8.f30419a
            okio.l0 r6 = r6.f30464a
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f30421c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r6 = r6.f30458b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x006f
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            okio.o r0 = r8.f30424f
            long r1 = r8.f30423e
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo27269E1(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            okio.l0 r0 = r8.f30420b
            if (r0 != 0) goto L_0x0053
            okio.m r0 = r8.f30419a
            okio.l0 r0 = r0.f30464a
            if (r0 == 0) goto L_0x0053
            r8.f30420b = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.f30458b
            r8.f30421c = r0
        L_0x0053:
            okio.m r0 = r8.f30419a
            long r0 = r0.mo27362c0()
            long r2 = r8.f30423e
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.m r2 = r8.f30419a
            long r4 = r8.f30423e
            r3 = r9
            r6 = r10
            r2.mo27383s(r3, r4, r6)
            long r0 = r8.f30423e
            long r0 = r0 + r10
            r8.f30423e = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12476h0.read(okio.m, long):long");
    }

    @C12579k
    public C12516r0 timeout() {
        return this.f30424f.timeout();
    }
}

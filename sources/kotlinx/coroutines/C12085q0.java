package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11289a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.q0 */
public final class C12085q0 {
    @C12579k

    /* renamed from: a */
    public static final String f29737a = "kotlinx.coroutines.debug";
    @C12579k

    /* renamed from: b */
    public static final String f29738b = "kotlinx.coroutines.stacktrace.recovery";
    @C12579k

    /* renamed from: c */
    public static final String f29739c = "auto";
    @C12579k

    /* renamed from: d */
    public static final String f29740d = "on";
    @C12579k

    /* renamed from: e */
    public static final String f29741e = "off";

    /* renamed from: f */
    public static final boolean f29742f = false;

    /* renamed from: g */
    public static final boolean f29743g;

    /* renamed from: h */
    public static final boolean f29744h;
    @C12579k

    /* renamed from: i */
    public static final AtomicLong f29745i = new AtomicLong(0);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r0.equals(f29740d) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.equals("") != false) goto L_0x0041;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.C12016r0.m47947d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0063
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x0039
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0030
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0027
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0043
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0063
        L_0x0027:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0063
        L_0x0030:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0041
        L_0x0039:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            r0 = r1
            goto L_0x0064
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0063:
            r0 = r2
        L_0x0064:
            f29743g = r0
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.C12016r0.m47949f(r0, r1)
            if (r0 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r1 = r2
        L_0x0072:
            f29744h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f29745i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12085q0.<clinit>():void");
    }

    @C11110f
    /* renamed from: a */
    public static final void m48280a(C11289a<Boolean> aVar) {
    }

    /* renamed from: b */
    public static final boolean m48281b() {
        return f29742f;
    }

    @C12579k
    /* renamed from: c */
    public static final AtomicLong m48282c() {
        return f29745i;
    }

    /* renamed from: d */
    public static final boolean m48283d() {
        return f29743g;
    }

    /* renamed from: e */
    public static final boolean m48284e() {
        return f29744h;
    }

    /* renamed from: f */
    public static final void m48285f() {
        f29745i.set(0);
    }
}

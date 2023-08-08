package okio;

import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "-GzipSourceExtensions")
/* renamed from: okio.g */
public final class C12473g {

    /* renamed from: a */
    public static final int f30409a = 1;

    /* renamed from: b */
    public static final int f30410b = 2;

    /* renamed from: c */
    public static final int f30411c = 3;

    /* renamed from: d */
    public static final int f30412d = 4;

    /* renamed from: e */
    public static final byte f30413e = 0;

    /* renamed from: f */
    public static final byte f30414f = 1;

    /* renamed from: g */
    public static final byte f30415g = 2;

    /* renamed from: h */
    public static final byte f30416h = 3;

    /* renamed from: b */
    public static final boolean m50542b(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }

    @C12579k
    /* renamed from: c */
    public static final C12525x m50543c(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "$this$gzip");
        return new C12525x(p0Var);
    }
}

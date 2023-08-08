package kotlin.math;

import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.math.a */
public final class C11406a {
    @C12579k

    /* renamed from: a */
    public static final C11406a f28539a = new C11406a();
    @C11287e

    /* renamed from: b */
    public static final double f28540b = Math.log(2.0d);
    @C11287e

    /* renamed from: c */
    public static final double f28541c;
    @C11287e

    /* renamed from: d */
    public static final double f28542d;
    @C11287e

    /* renamed from: e */
    public static final double f28543e;
    @C11287e

    /* renamed from: f */
    public static final double f28544f;
    @C11287e

    /* renamed from: g */
    public static final double f28545g;

    static {
        double ulp = Math.ulp(1.0d);
        f28541c = ulp;
        double sqrt = Math.sqrt(ulp);
        f28542d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f28543e = sqrt2;
        double d = (double) 1;
        f28544f = d / sqrt;
        f28545g = d / sqrt2;
    }
}

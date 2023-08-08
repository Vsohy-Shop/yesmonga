package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* renamed from: kotlin.time.f */
public final class C11638f {

    /* renamed from: a */
    public static final boolean f28959a = false;
    @C12579k

    /* renamed from: b */
    public static final ThreadLocal<DecimalFormat>[] f28960b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f28960b = threadLocalArr;
    }

    /* renamed from: a */
    public static final DecimalFormat m45583a(int i) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @C12579k
    /* renamed from: b */
    public static final String m45584b(double d, int i) {
        DecimalFormat decimalFormat;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f28960b;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormat2 = threadLocal.get();
            if (decimalFormat2 == null) {
                decimalFormat2 = m45583a(i);
                threadLocal.set(decimalFormat2);
            } else {
                Intrinsics.checkNotNullExpressionValue(decimalFormat2, "get() ?: default().also(this::set)");
            }
            decimalFormat = decimalFormat2;
        } else {
            decimalFormat = m45583a(i);
        }
        String format = decimalFormat.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "format.format(value)");
        return format;
    }

    @C12579k
    /* renamed from: c */
    public static final String m45585c(double d, int i) {
        DecimalFormat a = m45583a(0);
        a.setMaximumFractionDigits(i);
        String format = a.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "createFormatForDecimals(… }\n        .format(value)");
        return format;
    }

    /* renamed from: d */
    public static final boolean m45586d() {
        return f28959a;
    }
}

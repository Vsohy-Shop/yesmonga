package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.util.j */
public final class C17987j {
    @C0376v0(26)
    @C12579k
    /* renamed from: a */
    public static final Half m81715a(double d) {
        Half a = Half.valueOf((float) d);
        Intrinsics.checkNotNullExpressionValue(a, "valueOf(this)");
        return a;
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: b */
    public static final Half m81716b(float f) {
        Half a = Half.valueOf(f);
        Intrinsics.checkNotNullExpressionValue(a, "valueOf(this)");
        return a;
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: c */
    public static final Half m81717c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Half a = Half.valueOf(str);
        Intrinsics.checkNotNullExpressionValue(a, "valueOf(this)");
        return a;
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: d */
    public static final Half m81718d(short s) {
        Half a = Half.valueOf(s);
        Intrinsics.checkNotNullExpressionValue(a, "valueOf(this)");
        return a;
    }
}

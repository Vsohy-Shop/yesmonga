package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.util.b0 */
public final class C17965b0 {
    @C0376v0(21)
    /* renamed from: a */
    public static final float m81607a(@C12579k SizeF sizeF) {
        Intrinsics.checkNotNullParameter(sizeF, "<this>");
        return sizeF.getWidth();
    }

    /* renamed from: b */
    public static final float m81608b(@C12579k C17962a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return a0Var.mo52414b();
    }

    @C0376v0(21)
    /* renamed from: c */
    public static final int m81609c(@C12579k Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return size.getWidth();
    }

    @C0376v0(21)
    /* renamed from: d */
    public static final float m81610d(@C12579k SizeF sizeF) {
        Intrinsics.checkNotNullParameter(sizeF, "<this>");
        return sizeF.getHeight();
    }

    /* renamed from: e */
    public static final float m81611e(@C12579k C17962a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return a0Var.mo52413a();
    }

    @C0376v0(21)
    /* renamed from: f */
    public static final int m81612f(@C12579k Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return size.getHeight();
    }
}

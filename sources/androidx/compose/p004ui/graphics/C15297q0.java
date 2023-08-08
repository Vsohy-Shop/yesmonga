package androidx.compose.p004ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import androidx.compose.p004ui.graphics.C15234i4;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,66:1\n35#2,5:67\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n53#1:67,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.q0 */
public final class C15297q0 {
    @C12579k
    /* renamed from: a */
    public static final C15242j3 m66433a(@C12579k C15242j3 j3Var, @C12579k C15242j3 j3Var2) {
        Intrinsics.checkNotNullParameter(j3Var, "outer");
        Intrinsics.checkNotNullParameter(j3Var2, "inner");
        return new C15286p0(new ComposePathEffect(((C15286p0) j3Var).mo42934a(), ((C15286p0) j3Var2).mo42934a()));
    }

    @C12579k
    /* renamed from: b */
    public static final C15242j3 m66434b(float f) {
        return new C15286p0(new CornerPathEffect(f));
    }

    @C12579k
    /* renamed from: c */
    public static final C15242j3 m66435c(@C12579k float[] fArr, float f) {
        Intrinsics.checkNotNullParameter(fArr, "intervals");
        return new C15286p0(new DashPathEffect(fArr, f));
    }

    @C12579k
    /* renamed from: d */
    public static final C15242j3 m66436d(@C12579k C15231i3 i3Var, float f, float f2, int i) {
        Intrinsics.checkNotNullParameter(i3Var, "shape");
        if (i3Var instanceof C15279o0) {
            return new C15286p0(new PathDashPathEffect(((C15279o0) i3Var).mo42922y(), f, f2, m66438f(i)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @C12579k
    /* renamed from: e */
    public static final PathEffect m66437e(@C12579k C15242j3 j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return ((C15286p0) j3Var).mo42934a();
    }

    @C12579k
    /* renamed from: f */
    public static final PathDashPathEffect.Style m66438f(int i) {
        C15234i4.C15235a aVar = C15234i4.f37542b;
        if (C15234i4.m66036g(i, aVar.mo42829a())) {
            return PathDashPathEffect.Style.MORPH;
        }
        if (C15234i4.m66036g(i, aVar.mo42830b())) {
            return PathDashPathEffect.Style.ROTATE;
        }
        if (C15234i4.m66036g(i, aVar.mo42831c())) {
            return PathDashPathEffect.Style.TRANSLATE;
        }
        return PathDashPathEffect.Style.TRANSLATE;
    }

    @C12579k
    /* renamed from: g */
    public static final C15242j3 m66439g(@C12579k PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(pathEffect, "<this>");
        return new C15286p0(pathEffect);
    }
}

package androidx.compose.foundation.layout;

import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,674:1\n76#2:675\n155#3:676\n155#3:677\n155#3:678\n155#3:679\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n243#1:675\n276#1:676\n277#1:677\n278#1:678\n279#1:679\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.f1 */
public final class C2358f1 {
    @C12579k
    /* renamed from: a */
    public static final C2354e1 m10388a(int i, int i2, int i3, int i4) {
        return new C2403r(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static /* synthetic */ C2354e1 m10389b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return m10388a(i, i2, i3, i4);
    }

    @C12579k
    /* renamed from: c */
    public static final C2354e1 m10390c(float f, float f2, float f3, float f4) {
        return new C2399q(f, f2, f3, f4, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C2354e1 m10391d(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C16483g.m74435M((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C16483g.m74435M((float) 0);
        }
        return m10390c(f, f2, f3, f4);
    }

    @C12579k
    /* renamed from: e */
    public static final C2354e1 m10392e(@C12579k C2354e1 e1Var, @C12579k C2354e1 e1Var2) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        Intrinsics.checkNotNullParameter(e1Var2, "insets");
        return new C2337a(e1Var, e1Var2);
    }

    @C12579k
    /* renamed from: f */
    public static final C2354e1 m10393f(@C12579k C2366i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        return new C2378l0(i0Var);
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: g */
    public static final C2366i0 m10394g(@C12579k C2354e1 e1Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1485016250, i, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:242)");
        }
        C2417w wVar = new C2417w(e1Var, (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i()));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return wVar;
    }

    @C12579k
    /* renamed from: h */
    public static final C2366i0 m10395h(@C12579k C2354e1 e1Var, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "density");
        return new C2417w(e1Var, dVar);
    }

    @C12579k
    /* renamed from: i */
    public static final C2354e1 m10396i(@C12579k C2354e1 e1Var, @C12579k C2354e1 e1Var2) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        Intrinsics.checkNotNullParameter(e1Var2, "insets");
        return new C2393o(e1Var, e1Var2);
    }

    @C12579k
    /* renamed from: j */
    public static final C2354e1 m10397j(@C12579k C2354e1 e1Var, int i) {
        Intrinsics.checkNotNullParameter(e1Var, "$this$only");
        return new C2341b0(e1Var, i, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: k */
    public static final C2354e1 m10398k(@C12579k C2354e1 e1Var, @C12579k C2354e1 e1Var2) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        Intrinsics.checkNotNullParameter(e1Var2, "insets");
        return new C2339a1(e1Var, e1Var2);
    }
}

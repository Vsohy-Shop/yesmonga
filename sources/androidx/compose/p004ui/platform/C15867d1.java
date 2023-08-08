package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nNestedScrollInteropConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,236:1\n76#2:237\n36#3:238\n1114#4,6:239\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n233#1:237\n234#1:238\n234#1:239,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.d1 */
public final class C15867d1 {

    /* renamed from: a */
    public static final float f39521a = 0.5f;

    /* renamed from: e */
    public static final float m71317e(float f) {
        return (float) (f >= 0.0f ? Math.ceil((double) f) : Math.floor((double) f));
    }

    /* renamed from: f */
    public static final int m71318f(float f) {
        return ((int) m71317e(f)) * -1;
    }

    /* renamed from: g */
    public static final int m71319g(long j) {
        int i;
        if (Math.abs(C15094f.m64880p(j)) >= 0.5f) {
            i = 1;
        } else {
            i = 0;
        }
        if (Math.abs(C15094f.m64882r(j)) >= 0.5f) {
            return i | 2;
        }
        return i;
    }

    @C8540g
    @C12579k
    /* renamed from: h */
    public static final C15446a m71320h(@C12580l View view, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(1260107652);
        if ((i2 & 1) != 0) {
            view = (View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k());
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1260107652, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.kt:231)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(view);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C15860c1(view);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C15860c1 c1Var = (C15860c1) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c1Var;
    }

    /* renamed from: i */
    public static final float m71321i(int i) {
        return ((float) i) * -1.0f;
    }

    /* renamed from: j */
    public static final long m71322j(int[] iArr, long j) {
        float f;
        float f2;
        if (C15094f.m64880p(j) >= 0.0f) {
            f = C11479u.m44310A(m71321i(iArr[0]), C15094f.m64880p(j));
        } else {
            f = C11479u.m44444t(m71321i(iArr[0]), C15094f.m64880p(j));
        }
        if (C15094f.m64882r(j) >= 0.0f) {
            f2 = C11479u.m44310A(m71321i(iArr[1]), C15094f.m64882r(j));
        } else {
            f2 = C11479u.m44444t(m71321i(iArr[1]), C15094f.m64882r(j));
        }
        return C15096g.m64898a(f, f2);
    }

    /* renamed from: k */
    public static final int m71323k(int i) {
        return C15448b.m68343g(i, C15448b.f38435b.mo43964a()) ^ true ? 1 : 0;
    }

    /* renamed from: l */
    public static final float m71324l(float f) {
        return f * -1.0f;
    }
}

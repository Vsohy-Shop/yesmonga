package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLocalSoftwareKeyboardController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,76:1\n76#2:77\n76#2:78\n36#3:79\n1114#4,6:80\n*S KotlinDebug\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n*L\n42#1:77\n47#1:78\n48#1:79\n48#1:80,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.LocalSoftwareKeyboardController */
public final class LocalSoftwareKeyboardController {
    @C12579k

    /* renamed from: a */
    public static final LocalSoftwareKeyboardController f39366a = new LocalSoftwareKeyboardController();
    @C12579k

    /* renamed from: b */
    public static final C8550i1<C15991w3> f39367b = CompositionLocalKt.m29858d((C8410b2) null, C15800x568c8b93.f39369f, 1, (Object) null);

    /* renamed from: c */
    public static final int f39368c = 0;

    @C8761g
    /* renamed from: c */
    public static /* synthetic */ void m71068c() {
    }

    @C8540g
    /* renamed from: a */
    public final C15991w3 mo45553a(C8592o oVar, int i) {
        oVar.mo14918M(1835581880);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1835581880, i, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.delegatingController (LocalSoftwareKeyboardController.kt:45)");
        }
        C16321t0 t0Var = (C16321t0) oVar.mo15032w(CompositionLocalsKt.m71022t());
        if (t0Var == null) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            return null;
        }
        int i2 = C16321t0.f40545c;
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(t0Var);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C15931n0(t0Var);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C15931n0 n0Var = (C15931n0) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return n0Var;
    }

    @C8540g
    @C12580l
    @C11314h(name = "getCurrent")
    /* renamed from: b */
    public final C15991w3 mo45554b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1059476185);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1059476185, i, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.<get-current> (LocalSoftwareKeyboardController.kt:40)");
        }
        C15991w3 w3Var = (C15991w3) oVar.mo15032w(f39367b);
        if (w3Var == null) {
            w3Var = mo45553a(oVar, i & 14);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return w3Var;
    }

    @C12579k
    /* renamed from: d */
    public final C8572j1<C15991w3> mo45555d(@C12579k C15991w3 w3Var) {
        Intrinsics.checkNotNullParameter(w3Var, "softwareKeyboardController");
        return f39367b.mo16141f(w3Var);
    }
}

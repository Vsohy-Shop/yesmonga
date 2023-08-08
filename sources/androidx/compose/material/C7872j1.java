package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material.j1 */
public final class C7872j1 {
    @C12579k

    /* renamed from: a */
    public static final C7872j1 f18857a = new C7872j1();

    /* renamed from: b */
    public static final float f18858b = 0.8f;

    /* renamed from: c */
    public static final int f18859c = 0;

    @C8540g
    @C11314h(name = "getBackgroundColor")
    /* renamed from: a */
    public final long mo10849a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1630911716);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1630911716, i, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:200)");
        }
        C7933t0 t0Var = C7933t0.f19075a;
        long h = C15258l2.m66183h(C15240j2.m66080w(t0Var.mo11075a(oVar, 6).mo10970i(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null), t0Var.mo11075a(oVar, 6).mo10975n());
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return h;
    }

    @C8540g
    @C11314h(name = "getPrimaryActionColor")
    /* renamed from: b */
    public final long mo10850b(@C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-810329402);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-810329402, i, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        C7901q a = C7933t0.f19075a.mo11075a(oVar, 6);
        if (a.mo10976o()) {
            j = C15258l2.m66183h(C15240j2.m66080w(a.mo10975n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), a.mo10971j());
        } else {
            j = a.mo10972k();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j;
    }
}

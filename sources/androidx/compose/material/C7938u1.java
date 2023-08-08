package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11363r0({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,855:1\n76#2:856\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n844#1:856\n*E\n"})
/* renamed from: androidx.compose.material.u1 */
public final class C7938u1 {
    @C8540g
    /* renamed from: b */
    public static final C8578k2<C2223i> m25326b(boolean z, boolean z2, C2241e eVar, C7930s1 s1Var, float f, float f2, C8592o oVar, int i) {
        float f3;
        C8578k2 k2Var;
        C8592o oVar2 = oVar;
        int i2 = i;
        oVar.mo14918M(1097899920);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1097899920, i2, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:835)");
        }
        C8578k2<Boolean> a = FocusInteractionKt.m9673a(eVar, oVar, (i2 >> 6) & 14);
        C7930s1 s1Var2 = s1Var;
        boolean z3 = z;
        boolean z4 = z2;
        C8578k2<C15240j2> e = s1Var2.mo10705e(z3, z4, eVar, oVar, (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168));
        if (m25327c(a)) {
            f3 = f;
        } else {
            f3 = f2;
        }
        if (z) {
            oVar.mo14918M(1685712066);
            k2Var = AnimateAsStateKt.m7970d(f3, C1972h.m8392q(150, 0, (C2022z) null, 6, (Object) null), (C11300l) null, oVar, 48, 4);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(1685712164);
            k2Var = C8415c2.m30251t(C16483g.m74451w(f2), oVar, (i2 >> 15) & 14);
            oVar.mo15002m0();
        }
        C8578k2<C2223i> t = C8415c2.m30251t(new C2223i(((C16483g) k2Var.getValue()).mo47823t0(), new C15225h4(e.getValue().mo42833M(), (DefaultConstructorMarker) null), (DefaultConstructorMarker) null), oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return t;
    }

    /* renamed from: c */
    public static final boolean m25327c(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }
}

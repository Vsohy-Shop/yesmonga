package androidx.compose.material3;

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
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11363r0({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2124:1\n76#2:2125\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaultsKt\n*L\n2113#1:2125\n*E\n"})
/* renamed from: androidx.compose.material3.e3 */
public final class C8195e3 {
    @C8540g
    /* renamed from: b */
    public static final C8578k2<C2223i> m27068b(boolean z, boolean z2, C2241e eVar, C8189d3 d3Var, float f, float f2, C8592o oVar, int i) {
        float f3;
        C8578k2<C16483g> k2Var;
        C8592o oVar2 = oVar;
        int i2 = i;
        oVar2.mo14918M(-1633063017);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1633063017, i2, -1, "androidx.compose.material3.animateBorderStrokeAsState (TextFieldDefaults.kt:2104)");
        }
        C8578k2<Boolean> a = FocusInteractionKt.m9673a(eVar, oVar2, (i2 >> 6) & 14);
        C8189d3 d3Var2 = d3Var;
        boolean z3 = z;
        boolean z4 = z2;
        C8578k2<C15240j2> f4 = d3Var2.mo12542f(z3, z4, eVar, oVar, (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168));
        if (m27069c(a)) {
            f3 = f;
        } else {
            f3 = f2;
        }
        if (z) {
            oVar2.mo14918M(-1927737384);
            k2Var = AnimateAsStateKt.m7969c(f3, C1972h.m8392q(150, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C16483g, C11079d2>) null, oVar, 48, 12);
            oVar.mo15002m0();
        } else {
            oVar2.mo14918M(-1927737286);
            k2Var = C8415c2.m30251t(C16483g.m74451w(f2), oVar2, (i2 >> 15) & 14);
            oVar.mo15002m0();
        }
        C8578k2<C2223i> t = C8415c2.m30251t(new C2223i(k2Var.getValue().mo47823t0(), new C15225h4(f4.getValue().mo42833M(), (DefaultConstructorMarker) null), (DefaultConstructorMarker) null), oVar2, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return t;
    }

    /* renamed from: c */
    public static final boolean m27069c(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }
}

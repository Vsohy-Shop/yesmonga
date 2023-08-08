package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,69:1\n76#2:70\n174#3:71\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n*L\n50#1:70\n50#1:71\n*E\n"})
public final class DividerKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m25704a(@C12580l C8767m mVar, float f, long j, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(1562471785);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14968d(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) != 0 || !o.mo14980g(j)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            o.mo14930Q();
            if ((i & 1) == 0 || o.mo14977f0()) {
                if (i7 != 0) {
                    mVar = C8767m.f23478j;
                }
                if (i8 != 0) {
                    f = C8214i0.f20177a.mo12651b();
                }
                if ((i2 & 4) != 0) {
                    j = C8214i0.f20177a.mo12650a(o, 6);
                }
            } else {
                o.mo14958a0();
            }
            o.mo14899E();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1562471785, i, -1, "androidx.compose.material3.Divider (Divider.kt:43)");
            }
            o.mo14918M(1232935509);
            if (C16483g.m74440e0(f, C16483g.f40871b.mo47826a())) {
                f2 = C16483g.m74435M(1.0f / ((C16479d) o.mo15032w(CompositionLocalsKt.m71011i())).getDensity());
            } else {
                f2 = f;
            }
            o.mo15002m0();
            BoxKt.m9839a(BackgroundKt.m8825d(SizeKt.m10115o(SizeKt.m10114n(mVar, 0.0f, 1, (Object) null), f2), j, (C15218g4) null, 2, (Object) null), o, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        float f3 = f;
        long j2 = j;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DividerKt$Divider$1(mVar2, f3, j2, i, i2));
        }
    }
}

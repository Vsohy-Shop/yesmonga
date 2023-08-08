package androidx.compose.material;

import androidx.compose.foundation.shape.C2683e;
import androidx.compose.foundation.shape.C2684f;
import androidx.compose.foundation.shape.C2685g;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,522:1\n154#2:523\n154#2:524\n154#2:525\n154#2:526\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n*L\n507#1:523\n494#1:524\n499#1:525\n512#1:526\n*E\n"})
/* renamed from: androidx.compose.material.c */
public final class C3031c {
    @C12579k

    /* renamed from: a */
    public static final C3031c f8085a = new C3031c();

    /* renamed from: b */
    public static final float f8086b = C16483g.m74435M((float) 56);

    /* renamed from: c */
    public static final float f8087c = C16483g.m74435M((float) 48);

    /* renamed from: d */
    public static final float f8088d = C16483g.m74435M((float) 1);

    /* renamed from: e */
    public static final int f8089e = 0;

    /* renamed from: a */
    public final float mo10720a() {
        return f8088d;
    }

    @C8540g
    @C11314h(name = "getFrontLayerScrimColor")
    /* renamed from: b */
    public final long mo10721b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1806270648);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1806270648, i, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:517)");
        }
        long w = C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar, 6).mo10975n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return w;
    }

    @C8540g
    @C11314h(name = "getFrontLayerShape")
    @C12579k
    /* renamed from: c */
    public final C15218g4 mo10722c(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1580588700);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1580588700, i, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:505)");
        }
        float f = (float) 16;
        C2683e d = C2683e.m12106d(C7933t0.f19075a.mo11076b(oVar, 6).mo10756c(), C2685g.m12118c(C16483g.m74435M(f)), C2685g.m12118c(C16483g.m74435M(f)), (C2684f) null, (C2684f) null, 12, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    /* renamed from: d */
    public final float mo10723d() {
        return f8087c;
    }

    /* renamed from: e */
    public final float mo10724e() {
        return f8086b;
    }
}

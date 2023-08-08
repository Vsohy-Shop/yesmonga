package androidx.compose.material;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C3044g0
@C8567o(parameters = 0)
@C11363r0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,731:1\n76#2:732\n76#2:733\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n353#1:732\n456#1:733\n*E\n"})
public final class ExposedDropdownMenuDefaults {
    @C12579k

    /* renamed from: a */
    public static final ExposedDropdownMenuDefaults f7666a = new ExposedDropdownMenuDefaults();

    /* renamed from: b */
    public static final int f7667b = 0;

    @C3044g0
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo10204a(boolean z, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(876077373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14961b(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                aVar = ExposedDropdownMenuDefaults$TrailingIcon$1.f7668f;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(876077373, i3, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:285)");
            }
            IconButtonKt.m13536a(aVar, SemanticsModifierKt.m71866a(C8767m.f23478j, ExposedDropdownMenuDefaults$TrailingIcon$2.f7669f), false, (C2243g) null, C8553b.m31048b(o, 726122713, true, new ExposedDropdownMenuDefaults$TrailingIcon$3(z)), o, ((i3 >> 3) & 14) | C12888a.f31808q, 12);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C11289a<C11079d2> aVar2 = aVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ExposedDropdownMenuDefaults$TrailingIcon$4(this, z, aVar2, i, i2));
        }
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final C7930s1 mo10205b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, @C12580l C8592o oVar, int i, int i2, int i3, int i4) {
        C8592o oVar2 = oVar;
        int i5 = i4;
        oVar2.mo14918M(1162641182);
        long w = (i5 & 1) != 0 ? C15240j2.m66080w(((C15240j2) oVar2.mo15032w(ContentColorKt.m13406a())).mo42833M(), ((Number) oVar2.mo15032w(ContentAlphaKt.m13404a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        long w2 = (i5 & 2) != 0 ? C15240j2.m66080w(w, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long s = (i5 & 4) != 0 ? C15240j2.f37547b.mo42850s() : j3;
        long j23 = (i5 & 8) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j() : j4;
        long d = (i5 & 16) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j5;
        long w3 = (i5 & 32) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long w4 = (i5 & 64) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long w5 = (i5 & 128) != 0 ? C15240j2.m66080w(w4, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long d2 = (i5 & 256) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j9;
        long w6 = (i5 & 512) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long w7 = (i5 & 1024) != 0 ? C15240j2.m66080w(w6, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long j24 = (i5 & 2048) != 0 ? w6 : j12;
        long w8 = (i5 & 4096) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long w9 = (i5 & 8192) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j14;
        long w10 = (i5 & 16384) != 0 ? C15240j2.m66080w(w8, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long d3 = (32768 & i5) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j16;
        long w11 = (65536 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long w12 = (131072 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10993d(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j18;
        long w13 = (262144 & i5) != 0 ? C15240j2.m66080w(w12, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        long d4 = (524288 & i5) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j20;
        long w14 = (1048576 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10993d(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long w15 = (i5 & 2097152) != 0 ? C15240j2.m66080w(w14, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j22;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1162641182, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:454)");
        }
        C3029b0 b0Var = new C3029b0(w, w2, j23, d, w3, w4, d2, w5, w6, w7, j24, w8, w9, w10, d3, s, w11, w12, w13, d4, w14, w15, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b0Var;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C7930s1 mo10206c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, @C12580l C8592o oVar, int i, int i2, int i3, int i4) {
        C8592o oVar2 = oVar;
        int i5 = i4;
        oVar2.mo14918M(1208167904);
        long w = (i5 & 1) != 0 ? C15240j2.m66080w(((C15240j2) oVar2.mo15032w(ContentColorKt.m13406a())).mo42833M(), ((Number) oVar2.mo15032w(ContentAlphaKt.m13404a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        long w2 = (i5 & 2) != 0 ? C15240j2.m66080w(w, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long w3 = (i5 & 4) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long j23 = (i5 & 8) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j() : j4;
        long d = (i5 & 16) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j5;
        long w4 = (i5 & 32) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long w5 = (i5 & 64) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long w6 = (i5 & 128) != 0 ? C15240j2.m66080w(w5, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long d2 = (i5 & 256) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j9;
        long w7 = (i5 & 512) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long w8 = (i5 & 1024) != 0 ? C15240j2.m66080w(w7, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long j24 = (i5 & 2048) != 0 ? w7 : j12;
        long w9 = (i5 & 4096) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long w10 = (i5 & 8192) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j14;
        long w11 = (i5 & 16384) != 0 ? C15240j2.m66080w(w9, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long d3 = (32768 & i5) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j16;
        long w12 = (65536 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long w13 = (131072 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10993d(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j18;
        long w14 = (262144 & i5) != 0 ? C15240j2.m66080w(w13, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        long d4 = (524288 & i5) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j20;
        long w15 = (1048576 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10993d(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long w16 = (i5 & 2097152) != 0 ? C15240j2.m66080w(w15, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j22;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1208167904, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:351)");
        }
        C3029b0 b0Var = new C3029b0(w, w2, j23, d, w4, w5, d2, w6, w7, w8, j24, w9, w10, w11, d3, w3, w12, w13, w14, d4, w15, w16, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b0Var;
    }
}

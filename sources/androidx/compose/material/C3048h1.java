package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material.h1 */
public final class C3048h1 {
    @C12579k

    /* renamed from: a */
    public static final C3048h1 f8126a = new C3048h1();

    /* renamed from: b */
    public static final float f8127b = 0.24f;

    /* renamed from: c */
    public static final float f8128c = 0.12f;

    /* renamed from: d */
    public static final float f8129d = 0.32f;

    /* renamed from: e */
    public static final float f8130e = 0.54f;

    /* renamed from: f */
    public static final float f8131f = 0.12f;

    /* renamed from: g */
    public static final int f8132g = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C3045g1 mo10774a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @C12580l C8592o oVar, int i, int i2, int i3) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        C8592o oVar2 = oVar;
        int i4 = i;
        int i5 = i3;
        oVar2.mo14918M(436017687);
        if ((i5 & 1) != 0) {
            j11 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j();
        } else {
            j11 = j;
        }
        if ((i5 & 2) != 0) {
            C7933t0 t0Var = C7933t0.f19075a;
            j12 = C15258l2.m66183h(C15240j2.m66080w(t0Var.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), t0Var.mo11075a(oVar2, 6).mo10975n());
        } else {
            j12 = j2;
        }
        if ((i5 & 4) != 0) {
            j13 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j();
        } else {
            j13 = j3;
        }
        if ((i5 & 8) != 0) {
            j14 = C15240j2.m66080w(j13, 0.24f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j4;
        }
        if ((i5 & 16) != 0) {
            j15 = C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j5;
        }
        if ((i5 & 32) != 0) {
            j16 = C15240j2.m66080w(j15, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j16 = j6;
        }
        if ((i5 & 64) != 0) {
            j17 = C15240j2.m66080w(ColorsKt.m13381b(j13, oVar2, (i4 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j7;
        }
        if ((i5 & 128) != 0) {
            j18 = C15240j2.m66080w(j13, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j18 = j8;
        }
        if ((i5 & 256) != 0) {
            j19 = C15240j2.m66080w(j17, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j19 = j9;
        }
        if ((i5 & 512) != 0) {
            j20 = C15240j2.m66080w(j16, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j20 = j10;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(436017687, i4, i2, "androidx.compose.material.SliderDefaults.colors (Slider.kt:478)");
        }
        C7947y yVar = new C7947y(j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return yVar;
    }
}

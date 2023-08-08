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
/* renamed from: androidx.compose.material.q1 */
public final class C7903q1 {
    @C12579k

    /* renamed from: a */
    public static final C7903q1 f18967a = new C7903q1();

    /* renamed from: b */
    public static final int f18968b = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C7892p1 mo10989a(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, @C12580l C8592o oVar, int i, int i2, int i3) {
        long j9;
        long j10;
        float f3;
        long j11;
        long j12;
        float f4;
        float f5;
        long j13;
        long j14;
        long j15;
        long j16;
        int i4;
        long j17;
        long j18;
        C8592o oVar2 = oVar;
        int i5 = i3;
        oVar2.mo14918M(-1032127534);
        if ((i5 & 1) != 0) {
            j9 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10974m();
        } else {
            j9 = j;
        }
        if ((i5 & 2) != 0) {
            j10 = j9;
        } else {
            j10 = j2;
        }
        if ((i5 & 4) != 0) {
            f3 = 0.54f;
        } else {
            f3 = f;
        }
        if ((i5 & 8) != 0) {
            j11 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10975n();
        } else {
            j11 = j3;
        }
        if ((i5 & 16) != 0) {
            j12 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i();
        } else {
            j12 = j4;
        }
        if ((i5 & 32) != 0) {
            f4 = 0.38f;
        } else {
            f4 = f2;
        }
        if ((i5 & 64) != 0) {
            f5 = f3;
            j13 = C15258l2.m66183h(C15240j2.m66080w(j9, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), C7933t0.f19075a.mo11075a(oVar2, 6).mo10975n());
        } else {
            f5 = f3;
            j13 = j5;
        }
        if ((i5 & 128) != 0) {
            j14 = j9;
            j15 = C15258l2.m66183h(C15240j2.m66080w(j10, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), C7933t0.f19075a.mo11075a(oVar2, 6).mo10975n());
        } else {
            j14 = j9;
            j15 = j6;
        }
        if ((i5 & 256) != 0) {
            i4 = 6;
            j16 = j13;
            j17 = C15258l2.m66183h(C15240j2.m66080w(j11, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), C7933t0.f19075a.mo11075a(oVar2, 6).mo10975n());
        } else {
            j16 = j13;
            i4 = 6;
            j17 = j7;
        }
        if ((i5 & 512) != 0) {
            j18 = C15258l2.m66183h(C15240j2.m66080w(j12, C7904r.f18969a.mo10991b(oVar2, i4), 0.0f, 0.0f, 0.0f, 14, (Object) null), C7933t0.f19075a.mo11075a(oVar2, 6).mo10975n());
        } else {
            j18 = j8;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1032127534, i, i2, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:282)");
        }
        C7949z zVar = new C7949z(j14, C15240j2.m66080w(j10, f5, 0.0f, 0.0f, 0.0f, 14, (Object) null), j11, C15240j2.m66080w(j12, f4, 0.0f, 0.0f, 0.0f, 14, (Object) null), j16, C15240j2.m66080w(j15, f5, 0.0f, 0.0f, 0.0f, 14, (Object) null), j17, C15240j2.m66080w(j18, f4, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return zVar;
    }
}

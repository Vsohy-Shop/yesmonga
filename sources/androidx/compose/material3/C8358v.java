package androidx.compose.material3;

import androidx.compose.material3.tokens.C8295d;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.v */
public final class C8358v {
    @C12579k

    /* renamed from: a */
    public static final C8358v f22436a = new C8358v();

    /* renamed from: b */
    public static final int f22437b = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8353u mo14734a(long j, long j2, long j3, long j4, long j5, long j6, @C12580l C8592o oVar, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-89536160);
        if ((i2 & 1) != 0) {
            j7 = ColorSchemeKt.m25519f(C8215i1.f20180a.mo12652a(oVar2, 6), C8295d.f20875a.mo13317e());
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.m25519f(C8215i1.f20180a.mo12652a(oVar2, 6), C8295d.f20875a.mo13309T());
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = ColorSchemeKt.m25519f(C8215i1.f20180a.mo12652a(oVar2, 6), C8295d.f20875a.mo13338z());
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = C15240j2.m66080w(ColorSchemeKt.m25519f(C8215i1.f20180a.mo12652a(oVar2, 6), C8295d.f20875a.mo13318f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = C15240j2.m66080w(ColorSchemeKt.m25519f(C8215i1.f20180a.mo12652a(oVar2, 6), C8295d.f20875a.mo13296G()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = j10;
        } else {
            j12 = j6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-89536160, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:197)");
        }
        C8353u uVar = new C8353u(j9, C15240j2.m66080w(j9, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j7, C15240j2.m66080w(j7, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j10, C15240j2.m66080w(j11, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j12, j7, j8, j10, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return uVar;
    }
}

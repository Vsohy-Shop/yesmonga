package androidx.compose.material3;

import androidx.compose.material3.tokens.C8338s0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.a2 */
public final class C8171a2 {
    @C12579k

    /* renamed from: a */
    public static final C8171a2 f19986a = new C8171a2();

    /* renamed from: b */
    public static final int f19987b = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8378z1 mo12448a(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-351083046);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8338s0.f22041a.mo14392f(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25524k(C8338s0.f22041a.mo14397k(), oVar2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8338s0.f22041a.mo14387a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8338s0.f22041a.mo14388b(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-351083046, i, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:144)");
        }
        C8378z1 z1Var = new C8378z1(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return z1Var;
    }
}

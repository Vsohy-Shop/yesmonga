package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.C8311i0;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,876:1\n154#2:877\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n*L\n773#1:877\n*E\n"})
/* renamed from: androidx.compose.material3.q1 */
public final class C8268q1 {
    @C12579k

    /* renamed from: a */
    public static final C8268q1 f20423a = new C8268q1();
    @C12579k

    /* renamed from: b */
    public static final C2366i0 f20424b = PaddingKt.m10016c(C16483g.m74435M((float) 12), 0.0f, 2, (Object) null);

    /* renamed from: c */
    public static final int f20425c = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8263p1 mo12933a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @C12580l C8592o oVar, int i, int i2) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        C8592o oVar2 = oVar;
        int i3 = i2;
        oVar2.mo14918M(-1574983348);
        if ((i3 & 1) != 0) {
            j9 = ColorSchemeKt.m25524k(C8311i0.f21364a.mo13764f(), oVar2, 6);
        } else {
            j9 = j;
        }
        if ((i3 & 2) != 0) {
            j10 = ColorSchemeKt.m25524k(C8311i0.f21364a.mo13772n(), oVar2, 6);
        } else {
            j10 = j2;
        }
        if ((i3 & 4) != 0) {
            j11 = ColorSchemeKt.m25524k(C8311i0.f21364a.mo13763e(), oVar2, 6);
        } else {
            j11 = j3;
        }
        if ((i3 & 8) != 0) {
            j12 = ColorSchemeKt.m25524k(C8311i0.f21364a.mo13783y(), oVar2, 6);
        } else {
            j12 = j4;
        }
        if ((i3 & 16) != 0) {
            j13 = ColorSchemeKt.m25524k(C8311i0.f21364a.mo13768j(), oVar2, 6);
        } else {
            j13 = j5;
        }
        if ((i3 & 32) != 0) {
            j14 = ColorSchemeKt.m25524k(C8311i0.f21364a.mo13784z(), oVar2, 6);
        } else {
            j14 = j6;
        }
        if ((i3 & 64) != 0) {
            j15 = j13;
        } else {
            j15 = j7;
        }
        if ((i3 & 128) != 0) {
            j16 = j14;
        } else {
            j16 = j8;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1574983348, i, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:748)");
        }
        C8197f0 f0Var = new C8197f0(j11, j12, j13, j14, j9, j10, j15, j16, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f0Var;
    }

    @C12579k
    /* renamed from: b */
    public final C2366i0 mo12934b() {
        return f20424b;
    }
}

package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.C8302f0;
import androidx.compose.p004ui.graphics.C15240j2;
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
@C11363r0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,443:1\n154#2:444\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n*L\n260#1:444\n*E\n"})
/* renamed from: androidx.compose.material3.j1 */
public final class C8228j1 {
    @C12579k

    /* renamed from: a */
    public static final C8228j1 f20233a = new C8228j1();
    @C12579k

    /* renamed from: b */
    public static final C2366i0 f20234b = PaddingKt.m10015b(MenuKt.f19476b, C16483g.m74435M((float) 0));

    /* renamed from: c */
    public static final int f20235c = 0;

    @C12579k
    /* renamed from: a */
    public final C2366i0 mo12715a() {
        return f20234b;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final C8234k1 mo12716b(long j, long j2, long j3, long j4, long j5, long j6, @C12580l C8592o oVar, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-1278543580);
        if ((i2 & 1) != 0) {
            j7 = ColorSchemeKt.m25524k(C8302f0.f21080a.mo13513k(), oVar2, 6);
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.m25524k(C8302f0.f21080a.mo13517o(), oVar2, 6);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = ColorSchemeKt.m25524k(C8302f0.f21080a.mo13524v(), oVar2, 6);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8302f0.f21080a.mo13508f(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8302f0.f21080a.mo13509g(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8302f0.f21080a.mo13510h(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1278543580, i, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:234)");
        }
        C8234k1 k1Var = new C8234k1(j7, j8, j9, j10, j11, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k1Var;
    }
}

package androidx.compose.material3;

import androidx.compose.material3.tokens.C8308h0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.o1 */
public final class C8257o1 {
    @C12579k

    /* renamed from: a */
    public static final C8257o1 f20393a = new C8257o1();

    /* renamed from: b */
    public static final int f20394b = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8252n1 mo12884a(long j, long j2, long j3, long j4, long j5, long j6, long j7, @C12580l C8592o oVar, int i, int i2) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-1618564327);
        if ((i2 & 1) != 0) {
            j8 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13673e(), oVar2, 6);
        } else {
            j8 = j;
        }
        if ((i2 & 2) != 0) {
            j9 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13678j(), oVar2, 6);
        } else {
            j9 = j2;
        }
        if ((i2 & 4) != 0) {
            j10 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13674f(), oVar2, 6);
        } else {
            j10 = j3;
        }
        if ((i2 & 8) != 0) {
            j11 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13691w(), oVar2, 6);
        } else {
            j11 = j4;
        }
        if ((i2 & 16) != 0) {
            j12 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13692x(), oVar2, 6);
        } else {
            j12 = j5;
        }
        if ((i2 & 32) != 0) {
            j13 = C15240j2.m66080w(j11, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j13 = j6;
        }
        if ((i2 & 64) != 0) {
            j14 = C15240j2.m66080w(j12, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j7;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1618564327, i, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:293)");
        }
        C8252n1 n1Var = new C8252n1(j8, j9, j10, j11, j12, j13, j14, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return n1Var;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Use overload with disabledIconColor and disabledTextColor")
    /* renamed from: b */
    public final /* synthetic */ C8252n1 mo12885b(long j, long j2, long j3, long j4, long j5, C8592o oVar, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-213647161);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13673e(), oVar2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13678j(), oVar2, 6);
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13674f(), oVar2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13691w(), oVar2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13692x(), oVar2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-213647161, i, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:316)");
        }
        C8252n1 n1Var = new C8252n1(j6, j7, j8, j9, j10, C15240j2.m66080w(j9, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C15240j2.m66080w(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return n1Var;
    }
}

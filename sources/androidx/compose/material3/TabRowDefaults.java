package androidx.compose.material3;

import androidx.compose.material3.tokens.C8336r0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,505:1\n135#2:506\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n407#1:506\n*E\n"})
public final class TabRowDefaults {
    @C12579k

    /* renamed from: a */
    public static final TabRowDefaults f19830a = new TabRowDefaults();

    /* renamed from: b */
    public static final int f19831b = 0;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12152a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r14, float r15, long r16, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r18, int r19, int r20) {
        /*
            r13 = this;
            r6 = r19
            r0 = 1454716052(0x56b53494, float:9.9618713E13)
            r1 = r18
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r20 & 1
            if (r2 == 0) goto L_0x0014
            r3 = r6 | 6
            r4 = r3
            r3 = r14
            goto L_0x0026
        L_0x0014:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0024
            r3 = r14
            boolean r4 = r1.mo15006n0(r14)
            if (r4 == 0) goto L_0x0021
            r4 = 4
            goto L_0x0022
        L_0x0021:
            r4 = 2
        L_0x0022:
            r4 = r4 | r6
            goto L_0x0026
        L_0x0024:
            r3 = r14
            r4 = r6
        L_0x0026:
            r5 = r20 & 2
            if (r5 == 0) goto L_0x002d
            r4 = r4 | 48
            goto L_0x003f
        L_0x002d:
            r7 = r6 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x003f
            r7 = r15
            boolean r8 = r1.mo14968d(r15)
            if (r8 == 0) goto L_0x003b
            r8 = 32
            goto L_0x003d
        L_0x003b:
            r8 = 16
        L_0x003d:
            r4 = r4 | r8
            goto L_0x0040
        L_0x003f:
            r7 = r15
        L_0x0040:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0059
            r8 = r20 & 4
            if (r8 != 0) goto L_0x0053
            r8 = r16
            boolean r10 = r1.mo14980g(r8)
            if (r10 == 0) goto L_0x0055
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0053:
            r8 = r16
        L_0x0055:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r4 = r4 | r10
            goto L_0x005b
        L_0x0059:
            r8 = r16
        L_0x005b:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r4 != r10) goto L_0x0070
            boolean r4 = r1.mo15011p()
            if (r4 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r1.mo14958a0()
            r2 = r3
            r3 = r7
            r4 = r8
            goto L_0x00d9
        L_0x0070:
            r1.mo14930Q()
            r4 = r6 & 1
            if (r4 == 0) goto L_0x0085
            boolean r4 = r1.mo14977f0()
            if (r4 == 0) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            r1.mo14958a0()
            r2 = r3
            r3 = r7
        L_0x0083:
            r4 = r8
            goto L_0x00aa
        L_0x0085:
            if (r2 == 0) goto L_0x008a
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x008b
        L_0x008a:
            r2 = r3
        L_0x008b:
            if (r5 == 0) goto L_0x0094
            androidx.compose.material3.tokens.r0 r3 = androidx.compose.material3.tokens.C8336r0.f21997a
            float r3 = r3.mo14350g()
            goto L_0x0095
        L_0x0094:
            r3 = r7
        L_0x0095:
            r4 = r20 & 4
            if (r4 == 0) goto L_0x0083
            androidx.compose.material3.i1 r4 = androidx.compose.material3.C8215i1.f20180a
            r5 = 6
            androidx.compose.material3.z r4 = r4.mo12652a(r1, r5)
            androidx.compose.material3.tokens.r0 r5 = androidx.compose.material3.tokens.C8336r0.f21997a
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r5 = r5.mo14349f()
            long r4 = androidx.compose.material3.ColorSchemeKt.m25519f(r4, r5)
        L_0x00aa:
            r1.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00b9
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:382)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r7, r8)
        L_0x00b9:
            r0 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r0, r8, r7)
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r3)
            r10 = 0
            r11 = 2
            r12 = 0
            r8 = r4
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8825d(r7, r8, r10, r11, r12)
            r7 = 0
            androidx.compose.foundation.layout.BoxKt.m9839a(r0, r1, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00d9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d9:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x00e0
            goto L_0x00ee
        L_0x00e0:
            androidx.compose.material3.TabRowDefaults$Indicator$1 r9 = new androidx.compose.material3.TabRowDefaults$Indicator$1
            r0 = r9
            r1 = r13
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.mo15202a(r9)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowDefaults.mo12152a(androidx.compose.ui.m, float, long, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C11314h(name = "getContainerColor")
    /* renamed from: b */
    public final long mo12153b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-2026555673);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2026555673, i, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:366)");
        }
        long k = ColorSchemeKt.m25524k(C8336r0.f21997a.mo14355l(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    @C8540g
    @C11314h(name = "getContentColor")
    /* renamed from: c */
    public final long mo12154c(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1163072359);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1163072359, i, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:370)");
        }
        long k = ColorSchemeKt.m25524k(C8336r0.f21997a.mo14352i(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    @C12579k
    /* renamed from: d */
    public final C8767m mo12155d(@C12579k C8767m mVar, @C12579k C8184c3 c3Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c3Var, "currentTabPosition");
        if (InspectableValueKt.m71063e()) {
            lVar = new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(c3Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new TabRowDefaults$tabIndicatorOffset$2(c3Var));
    }
}

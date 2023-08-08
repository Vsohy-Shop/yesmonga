package androidx.compose.material;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,618:1\n154#2:619\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n154#2:624\n154#2:625\n154#2:626\n154#2:627\n154#2:628\n154#2:638\n154#2:639\n154#2:640\n154#2:641\n154#2:642\n154#2:643\n154#2:644\n154#2:645\n83#3,3:629\n1114#4,6:632\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n347#1:619\n348#1:620\n349#1:621\n354#1:622\n355#1:623\n373#1:624\n374#1:625\n375#1:626\n376#1:627\n377#1:628\n295#1:638\n296#1:639\n312#1:640\n318#1:641\n325#1:642\n332#1:643\n470#1:644\n481#1:645\n379#1:629,3\n379#1:632,6\n*E\n"})
/* renamed from: androidx.compose.material.i */
public final class C3049i {
    @C12579k

    /* renamed from: a */
    public static final C3049i f8133a = new C3049i();

    /* renamed from: b */
    public static final float f8134b;

    /* renamed from: c */
    public static final float f8135c;
    @C12579k

    /* renamed from: d */
    public static final C2366i0 f8136d;

    /* renamed from: e */
    public static final float f8137e = C16483g.m74435M((float) 64);

    /* renamed from: f */
    public static final float f8138f = C16483g.m74435M((float) 36);

    /* renamed from: g */
    public static final float f8139g = C16483g.m74435M((float) 18);

    /* renamed from: h */
    public static final float f8140h;

    /* renamed from: i */
    public static final float f8141i = 0.12f;

    /* renamed from: j */
    public static final float f8142j = C16483g.m74435M((float) 1);

    /* renamed from: k */
    public static final float f8143k;
    @C12579k

    /* renamed from: l */
    public static final C2366i0 f8144l;

    /* renamed from: m */
    public static final int f8145m = 0;

    static {
        float M = C16483g.m74435M((float) 16);
        f8134b = M;
        float f = (float) 8;
        float M2 = C16483g.m74435M(f);
        f8135c = M2;
        C2366i0 d = PaddingKt.m10017d(M, M2, M, M2);
        f8136d = d;
        f8140h = C16483g.m74435M(f);
        float M3 = C16483g.m74435M(f);
        f8143k = M3;
        f8144l = PaddingKt.m10017d(M3, d.mo8093d(), M3, d.mo8090a());
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C3046h mo10775a(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        int i3 = i;
        oVar2.mo14918M(1870371134);
        if ((i2 & 1) != 0) {
            j5 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorsKt.m13381b(j5, oVar2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            C7933t0 t0Var = C7933t0.f19075a;
            j7 = C15258l2.m66183h(C15240j2.m66080w(t0Var.mo11075a(oVar2, 6).mo10970i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), t0Var.mo11075a(oVar2, 6).mo10975n());
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1870371134, i3, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:405)");
        }
        C7928s sVar = new C7928s(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return sVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.material.DefaultButtonElevation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.compose.material.DefaultButtonElevation} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r1 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x009c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.C7870j mo10776b(float r14, float r15, float r16, float r17, float r18, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r19, int r20, int r21) {
        /*
            r13 = this;
            r0 = r19
            r1 = -737170518(0xffffffffd40fabaa, float:-2.46824147E12)
            r0.mo14918M(r1)
            r2 = r21 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0014
            float r2 = (float) r3
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r5 = r2
            goto L_0x0015
        L_0x0014:
            r5 = r14
        L_0x0015:
            r2 = r21 & 2
            if (r2 == 0) goto L_0x0022
            r2 = 8
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r6 = r2
            goto L_0x0023
        L_0x0022:
            r6 = r15
        L_0x0023:
            r2 = r21 & 4
            r4 = 0
            if (r2 == 0) goto L_0x002f
            float r2 = (float) r4
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r16
        L_0x0031:
            r2 = r21 & 8
            r8 = 4
            if (r2 == 0) goto L_0x003c
            float r2 = (float) r8
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            goto L_0x003e
        L_0x003c:
            r2 = r17
        L_0x003e:
            r9 = r21 & 16
            if (r9 == 0) goto L_0x0048
            float r9 = (float) r8
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            goto L_0x004a
        L_0x0048:
            r9 = r18
        L_0x004a:
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x0058
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.ButtonDefaults.elevation (Button.kt:371)"
            r12 = r20
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r12, r10, r11)
        L_0x0058:
            r1 = 5
            java.lang.Object[] r10 = new java.lang.Object[r1]
            androidx.compose.ui.unit.g r11 = androidx.compose.p004ui.unit.C16483g.m74451w(r5)
            r10[r4] = r11
            androidx.compose.ui.unit.g r11 = androidx.compose.p004ui.unit.C16483g.m74451w(r6)
            r12 = 1
            r10[r12] = r11
            androidx.compose.ui.unit.g r11 = androidx.compose.p004ui.unit.C16483g.m74451w(r7)
            r10[r3] = r11
            r3 = 3
            androidx.compose.ui.unit.g r11 = androidx.compose.p004ui.unit.C16483g.m74451w(r2)
            r10[r3] = r11
            androidx.compose.ui.unit.g r3 = androidx.compose.p004ui.unit.C16483g.m74451w(r9)
            r10[r8] = r3
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.mo14918M(r3)
            r3 = r4
        L_0x0082:
            if (r4 >= r1) goto L_0x008e
            r8 = r10[r4]
            boolean r8 = r0.mo15006n0(r8)
            r3 = r3 | r8
            int r4 = r4 + 1
            goto L_0x0082
        L_0x008e:
            java.lang.Object r1 = r19.mo14921N()
            if (r3 != 0) goto L_0x009c
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r1 != r3) goto L_0x00a7
        L_0x009c:
            androidx.compose.material.DefaultButtonElevation r1 = new androidx.compose.material.DefaultButtonElevation
            r10 = 0
            r4 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo14893C(r1)
        L_0x00a7:
            r19.mo15002m0()
            androidx.compose.material.DefaultButtonElevation r1 = (androidx.compose.material.DefaultButtonElevation) r1
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00b5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00b5:
            r19.mo15002m0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C3049i.mo10776b(float, float, float, float, float, androidx.compose.runtime.o, int, int):androidx.compose.material.j");
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Use another overload of elevation")
    /* renamed from: c */
    public final /* synthetic */ C7870j mo10777c(float f, float f2, float f3, C8592o oVar, int i, int i2) {
        float f4;
        float f5;
        float f6;
        int i3 = i;
        oVar.mo14918M(1428576874);
        if ((i2 & 1) != 0) {
            f4 = C16483g.m74435M((float) 2);
        } else {
            f4 = f;
        }
        if ((i2 & 2) != 0) {
            f5 = C16483g.m74435M((float) 8);
        } else {
            f5 = f2;
        }
        if ((i2 & 4) != 0) {
            f6 = C16483g.m74435M((float) 0);
        } else {
            f6 = f3;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1428576874, i3, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:345)");
        }
        float f7 = (float) 4;
        C7870j b = mo10776b(f4, f5, f6, C16483g.m74435M(f7), C16483g.m74435M(f7), oVar, (i3 & 14) | 27648 | (i3 & 112) | (i3 & 896) | ((i3 << 6) & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    @C12579k
    /* renamed from: d */
    public final C2366i0 mo10778d() {
        return f8136d;
    }

    /* renamed from: e */
    public final float mo10779e() {
        return f8139g;
    }

    /* renamed from: f */
    public final float mo10780f() {
        return f8140h;
    }

    /* renamed from: g */
    public final float mo10781g() {
        return f8138f;
    }

    /* renamed from: h */
    public final float mo10782h() {
        return f8137e;
    }

    @C8540g
    @C11314h(name = "getOutlinedBorder")
    @C12579k
    /* renamed from: i */
    public final C2223i mo10783i(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-2091313033);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2091313033, i, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        C2223i a = C2250j.m9695a(f8142j, C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar, 6).mo10970i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }

    /* renamed from: j */
    public final float mo10784j() {
        return f8142j;
    }

    @C12579k
    /* renamed from: k */
    public final C2366i0 mo10785k() {
        return f8144l;
    }

    @C8540g
    @C12579k
    /* renamed from: l */
    public final C3046h mo10786l(long j, long j2, long j3, @C12580l C8592o oVar, int i, int i2) {
        long j4;
        long j5;
        long j6;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-2124406093);
        if ((i2 & 1) != 0) {
            j4 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10975n();
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j();
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            j6 = C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j6 = j3;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2124406093, i, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:428)");
        }
        C7928s sVar = new C7928s(j4, j5, j4, j6, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return sVar;
    }

    @C8540g
    @C12579k
    /* renamed from: m */
    public final C3046h mo10787m(long j, long j2, long j3, @C12580l C8592o oVar, int i, int i2) {
        long j4;
        long j5;
        long j6;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(182742216);
        if ((i2 & 1) != 0) {
            j4 = C15240j2.f37547b.mo42850s();
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j();
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            j6 = C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j6 = j3;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:449)");
        }
        C7928s sVar = new C7928s(j4, j5, j4, j6, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return sVar;
    }
}

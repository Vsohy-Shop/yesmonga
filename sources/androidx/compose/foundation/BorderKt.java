package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.draw.C8751i;
import androidx.compose.p004ui.draw.CacheDrawScope;
import androidx.compose.p004ui.geometry.C15088a;
import androidx.compose.p004ui.geometry.C15090b;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15101k;
import androidx.compose.p004ui.geometry.C15103l;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15266m3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15179a;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15197l;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 5 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n135#2:460\n1#3:461\n1#3:487\n181#4,25:462\n206#4,4:488\n215#4,6:501\n221#4:528\n222#4,2:537\n558#5,9:492\n567#5,8:529\n120#6,2:507\n173#6,6:509\n261#6,11:515\n122#6,2:526\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n149#1:460\n290#1:487\n290#1:462,25\n290#1:488,4\n290#1:501,6\n290#1:528\n290#1:537,2\n290#1:492,9\n290#1:529,8\n296#1:507,2\n304#1:509,6\n304#1:515,11\n296#1:526,2\n*E\n"})
public final class BorderKt {
    @C12579k
    /* renamed from: f */
    public static final C8767m m8850f(@C12579k C8767m mVar, @C12579k C2223i iVar, @C12579k C15218g4 g4Var) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(iVar, OutlinedTextFieldKt.f7748c);
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return m8854j(mVar, iVar.mo7587d(), iVar.mo7586c(), g4Var);
    }

    /* renamed from: g */
    public static /* synthetic */ C8767m m8851g(C8767m mVar, C2223i iVar, C15218g4 g4Var, int i, Object obj) {
        if ((i & 2) != 0) {
            g4Var = C15321t3.m66567a();
        }
        return m8850f(mVar, iVar, g4Var);
    }

    @C12579k
    /* renamed from: h */
    public static final C8767m m8852h(@C12579k C8767m mVar, float f, long j, @C12579k C15218g4 g4Var) {
        Intrinsics.checkNotNullParameter(mVar, "$this$border");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return m8854j(mVar, f, new C15225h4(j, (DefaultConstructorMarker) null), g4Var);
    }

    /* renamed from: i */
    public static /* synthetic */ C8767m m8853i(C8767m mVar, float f, long j, C15218g4 g4Var, int i, Object obj) {
        if ((i & 4) != 0) {
            g4Var = C15321t3.m66567a();
        }
        return m8852h(mVar, f, j, g4Var);
    }

    @C12579k
    /* renamed from: j */
    public static final C8767m m8854j(@C12579k C8767m mVar, float f, @C12579k C15421z1 z1Var, @C12579k C15218g4 g4Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$border");
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        if (InspectableValueKt.m71063e()) {
            lVar = new BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1(f, z1Var, g4Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new BorderKt$border$2(f, g4Var, z1Var));
    }

    /* renamed from: k */
    public static final C15101k m8855k(float f, C15101k kVar) {
        float f2 = f;
        return new C15101k(f, f2, kVar.mo42308v() - f2, kVar.mo42301p() - f2, m8862r(kVar.mo42305t(), f), m8862r(kVar.mo42307u(), f), m8862r(kVar.mo42300o(), f), m8862r(kVar.mo42299n(), f), (DefaultConstructorMarker) null);
    }

    /* renamed from: l */
    public static final C15231i3 m8856l(C15231i3 i3Var, C15101k kVar, float f, boolean z) {
        i3Var.reset();
        i3Var.mo42817r(kVar);
        if (!z) {
            C15231i3 a = C15318t0.m66550a();
            a.mo42817r(m8855k(f, kVar));
            i3Var.mo42819s(i3Var, a, C15266m3.f37589b.mo42899a());
        }
        return i3Var;
    }

    /* renamed from: m */
    public static final C8751i m8857m(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.mo17094h(BorderKt$drawContentWithoutBorder$1.f5728f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b7, code lost:
        if (androidx.compose.p004ui.graphics.C15410x2.m67286h(r13, r3) != false) goto L_0x00b9;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.draw.C8751i m8858n(androidx.compose.p004ui.draw.CacheDrawScope r42, androidx.compose.p004ui.node.C15695i1<androidx.compose.foundation.C2219h> r43, androidx.compose.p004ui.graphics.C15421z1 r44, androidx.compose.p004ui.graphics.C15174d3.C15175a r45, boolean r46, float r47) {
        /*
            r0 = r42
            r10 = r44
            if (r46 == 0) goto L_0x0013
            androidx.compose.foundation.BorderKt$drawGenericBorder$1 r1 = new androidx.compose.foundation.BorderKt$drawGenericBorder$1
            r2 = r45
            r1.<init>(r2, r10)
            androidx.compose.ui.draw.i r0 = r0.mo17094h(r1)
            goto L_0x026c
        L_0x0013:
            r2 = r45
            boolean r1 = r10 instanceof androidx.compose.p004ui.graphics.C15225h4
            r3 = 0
            if (r1 == 0) goto L_0x0034
            androidx.compose.ui.graphics.x2$a r1 = androidx.compose.p004ui.graphics.C15410x2.f38097b
            int r1 = r1.mo43576a()
            androidx.compose.ui.graphics.k2$a r4 = androidx.compose.p004ui.graphics.C15249k2.f37569b
            r5 = r10
            androidx.compose.ui.graphics.h4 r5 = (androidx.compose.p004ui.graphics.C15225h4) r5
            long r5 = r5.mo42781c()
            r7 = 0
            r8 = 2
            r9 = 0
            androidx.compose.ui.graphics.k2 r4 = androidx.compose.p004ui.graphics.C15249k2.C15250a.m66144d(r4, r5, r7, r8, r9)
            r13 = r1
            r18 = r4
            goto L_0x003d
        L_0x0034:
            androidx.compose.ui.graphics.x2$a r1 = androidx.compose.p004ui.graphics.C15410x2.f38097b
            int r1 = r1.mo43577b()
            r13 = r1
            r18 = r3
        L_0x003d:
            androidx.compose.ui.graphics.i3 r1 = r45.mo42646b()
            androidx.compose.ui.geometry.i r9 = r1.getBounds()
            androidx.compose.foundation.h r1 = m8861q(r43)
            androidx.compose.ui.graphics.i3 r8 = r1.mo7583n()
            r8.reset()
            r8.mo42814o(r9)
            androidx.compose.ui.graphics.i3 r4 = r45.mo42646b()
            androidx.compose.ui.graphics.m3$a r5 = androidx.compose.p004ui.graphics.C15266m3.f37589b
            int r5 = r5.mo42899a()
            r8.mo42819s(r8, r4, r5)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            float r4 = r9.mo42253G()
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = r9.mo42278r()
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            long r19 = androidx.compose.p004ui.unit.C16502r.m74668a(r4, r5)
            androidx.compose.ui.graphics.w2 r4 = r1.f5968a
            androidx.compose.ui.graphics.b2 r5 = r1.f5969b
            if (r4 == 0) goto L_0x0092
            int r6 = r4.mo42789f()
            androidx.compose.ui.graphics.x2 r6 = androidx.compose.p004ui.graphics.C15410x2.m67284f(r6)
            goto L_0x0093
        L_0x0092:
            r6 = r3
        L_0x0093:
            androidx.compose.ui.graphics.x2$a r11 = androidx.compose.p004ui.graphics.C15410x2.f38097b
            int r11 = r11.mo43577b()
            r12 = 0
            if (r6 != 0) goto L_0x009e
            r6 = r12
            goto L_0x00a6
        L_0x009e:
            int r6 = r6.mo43574m()
            boolean r6 = androidx.compose.p004ui.graphics.C15410x2.m67287i(r6, r11)
        L_0x00a6:
            r15 = 1
            if (r6 != 0) goto L_0x00b9
            if (r4 == 0) goto L_0x00b3
            int r3 = r4.mo42789f()
            androidx.compose.ui.graphics.x2 r3 = androidx.compose.p004ui.graphics.C15410x2.m67284f(r3)
        L_0x00b3:
            boolean r3 = androidx.compose.p004ui.graphics.C15410x2.m67286h(r13, r3)
            if (r3 == 0) goto L_0x00ba
        L_0x00b9:
            r12 = r15
        L_0x00ba:
            if (r4 == 0) goto L_0x00e7
            if (r5 == 0) goto L_0x00e7
            long r16 = r42.mo17089b()
            float r3 = androidx.compose.p004ui.geometry.C15104m.m65023t(r16)
            int r6 = r4.getWidth()
            float r6 = (float) r6
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x00e7
            long r16 = r42.mo17089b()
            float r3 = androidx.compose.p004ui.geometry.C15104m.m65016m(r16)
            int r6 = r4.getHeight()
            float r6 = (float) r6
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x00e7
            if (r12 != 0) goto L_0x00e3
            goto L_0x00e7
        L_0x00e3:
            r11 = r4
            r12 = r5
            r6 = r15
            goto L_0x0107
        L_0x00e7:
            int r11 = androidx.compose.p004ui.unit.C16500q.m74662m(r19)
            int r12 = androidx.compose.p004ui.unit.C16500q.m74659j(r19)
            r14 = 0
            r3 = 0
            r16 = 24
            r17 = 0
            r6 = r15
            r15 = r3
            androidx.compose.ui.graphics.w2 r4 = androidx.compose.p004ui.graphics.C15417y2.m67304b(r11, r12, r13, r14, r15, r16, r17)
            r1.f5968a = r4
            androidx.compose.ui.graphics.b2 r5 = androidx.compose.p004ui.graphics.C15173d2.m65563a(r4)
            r1.f5969b = r5
            r11 = r4
            r12 = r5
        L_0x0107:
            androidx.compose.ui.graphics.drawscope.a r3 = r1.f5970c
            if (r3 != 0) goto L_0x0115
            androidx.compose.ui.graphics.drawscope.a r3 = new androidx.compose.ui.graphics.drawscope.a
            r3.<init>()
            r1.f5970c = r3
        L_0x0115:
            r13 = r3
            long r3 = androidx.compose.p004ui.unit.C16502r.m74673f(r19)
            androidx.compose.ui.unit.LayoutDirection r1 = r42.getLayoutDirection()
            androidx.compose.ui.graphics.drawscope.a$a r5 = r13.mo42656A()
            androidx.compose.ui.unit.d r14 = r5.mo42687a()
            androidx.compose.ui.unit.LayoutDirection r15 = r5.mo42688b()
            r43 = r8
            androidx.compose.ui.graphics.b2 r8 = r5.mo42689c()
            r46 = r7
            r16 = r8
            long r7 = r5.mo42690d()
            androidx.compose.ui.graphics.drawscope.a$a r5 = r13.mo42656A()
            r5.mo42699l(r0)
            r5.mo42700m(r1)
            r5.mo42698k(r12)
            r5.mo42701n(r3)
            r12.mo42422E()
            androidx.compose.ui.graphics.j2$a r1 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r22 = r1.mo42841a()
            r24 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            androidx.compose.ui.graphics.u1$a r17 = androidx.compose.p004ui.graphics.C15325u1.f37708b
            int r31 = r17.mo43017a()
            r32 = 58
            r33 = 0
            r21 = r13
            r26 = r3
            androidx.compose.p004ui.graphics.drawscope.C15187e.m65710e5(r21, r22, r24, r26, r28, r29, r30, r31, r32, r33)
            float r1 = r9.mo42279t()
            float r5 = -r1
            float r1 = r9.mo42249B()
            float r4 = -r1
            androidx.compose.ui.graphics.drawscope.d r1 = r13.mo42683q5()
            androidx.compose.ui.graphics.drawscope.i r1 = r1.mo42703a()
            r1.mo42712e(r5, r4)
            androidx.compose.ui.graphics.i3 r2 = r45.mo42646b()
            r21 = 0
            androidx.compose.ui.graphics.drawscope.m r30 = new androidx.compose.ui.graphics.drawscope.m
            r1 = 2
            float r1 = (float) r1
            float r23 = r47 * r1
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 30
            r22 = r30
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r22 = 0
            r23 = 0
            r24 = 52
            r25 = 0
            r1 = r13
            r3 = r44
            r34 = r4
            r4 = r21
            r35 = r5
            r5 = r30
            r6 = r22
            r36 = r7
            r8 = r46
            r7 = r23
            r38 = r8
            r39 = r16
            r16 = r43
            r8 = r24
            r21 = r9
            r9 = r25
            androidx.compose.p004ui.graphics.drawscope.C15187e.m65694J4(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            long r1 = r13.mo42718b()
            float r1 = androidx.compose.p004ui.geometry.C15104m.m65023t(r1)
            r2 = 1
            float r2 = (float) r2
            float r1 = r1 + r2
            long r3 = r13.mo42718b()
            float r3 = androidx.compose.p004ui.geometry.C15104m.m65023t(r3)
            float r1 = r1 / r3
            long r3 = r13.mo42718b()
            float r3 = androidx.compose.p004ui.geometry.C15104m.m65016m(r3)
            float r3 = r3 + r2
            long r4 = r13.mo42718b()
            float r2 = androidx.compose.p004ui.geometry.C15104m.m65016m(r4)
            float r3 = r3 / r2
            long r4 = r13.mo42717U()
            androidx.compose.ui.graphics.drawscope.d r9 = r13.mo42683q5()
            long r7 = r9.mo42704b()
            androidx.compose.ui.graphics.b2 r2 = r9.mo42705c()
            r2.mo42422E()
            androidx.compose.ui.graphics.drawscope.i r2 = r9.mo42703a()
            r2.mo42713j(r1, r3, r4)
            r4 = 0
            r5 = 0
            r6 = 0
            int r17 = r17.mo43017a()
            r22 = 28
            r23 = 0
            r1 = r13
            r2 = r16
            r3 = r44
            r40 = r7
            r7 = r17
            r8 = r22
            r10 = r9
            r9 = r23
            androidx.compose.p004ui.graphics.drawscope.C15187e.m65694J4(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.graphics.b2 r1 = r10.mo42705c()
            r1.mo42443q()
            r1 = r40
            r10.mo42706d(r1)
            androidx.compose.ui.graphics.drawscope.d r1 = r13.mo42683q5()
            androidx.compose.ui.graphics.drawscope.i r1 = r1.mo42703a()
            r2 = r35
            float r2 = -r2
            r3 = r34
            float r3 = -r3
            r1.mo42712e(r2, r3)
            r12.mo42443q()
            androidx.compose.ui.graphics.drawscope.a$a r1 = r13.mo42656A()
            r1.mo42699l(r14)
            r1.mo42700m(r15)
            r2 = r39
            r1.mo42698k(r2)
            r2 = r36
            r1.mo42701n(r2)
            r11.mo42786c()
            r1 = r38
            r1.element = r11
            androidx.compose.foundation.BorderKt$drawGenericBorder$3 r2 = new androidx.compose.foundation.BorderKt$drawGenericBorder$3
            r4 = r2
            r5 = r21
            r6 = r1
            r7 = r19
            r9 = r18
            r4.<init>(r5, r6, r7, r9)
            androidx.compose.ui.draw.i r0 = r0.mo17094h(r2)
        L_0x026c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderKt.m8858n(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.node.i1, androidx.compose.ui.graphics.z1, androidx.compose.ui.graphics.d3$a, boolean, float):androidx.compose.ui.draw.i");
    }

    /* renamed from: o */
    public static final C8751i m8859o(CacheDrawScope cacheDrawScope, C15421z1 z1Var, long j, long j2, boolean z, float f) {
        long j3;
        long j4;
        C15192h hVar;
        if (z) {
            j3 = C15094f.f37256b.mo42248e();
        } else {
            j3 = j;
        }
        if (z) {
            j4 = cacheDrawScope.mo17089b();
        } else {
            j4 = j2;
        }
        if (z) {
            hVar = C15197l.f37504a;
        } else {
            hVar = new C15198m(f, 0.0f, 0, 0, (C15242j3) null, 30, (DefaultConstructorMarker) null);
        }
        return cacheDrawScope.mo17094h(new BorderKt$drawRectBorder$1(z1Var, j3, j4, hVar));
    }

    /* renamed from: p */
    public static final C8751i m8860p(CacheDrawScope cacheDrawScope, C15695i1<C2219h> i1Var, C15421z1 z1Var, C15174d3.C15177c cVar, long j, long j2, boolean z, float f) {
        CacheDrawScope cacheDrawScope2 = cacheDrawScope;
        float f2 = f;
        if (!C15103l.m65001q(cVar.mo42652b())) {
            return cacheDrawScope.mo17094h(new BorderKt$drawRoundRectBorder$2(m8856l(m8861q(i1Var).mo7583n(), cVar.mo42652b(), f2, z), z1Var));
        }
        return cacheDrawScope.mo17094h(new BorderKt$drawRoundRectBorder$1(z, z1Var, cVar.mo42652b().mo42305t(), f2 / ((float) 2), f, j, j2, new C15198m(f, 0.0f, 0, 0, (C15242j3) null, 30, (DefaultConstructorMarker) null)));
    }

    /* renamed from: q */
    public static final C2219h m8861q(C15695i1<C2219h> i1Var) {
        C2219h a = i1Var.mo45026a();
        if (a != null) {
            return a;
        }
        C2219h hVar = new C2219h((C15403w2) null, (C15118b2) null, (C15179a) null, (C15231i3) null, 15, (DefaultConstructorMarker) null);
        i1Var.mo45027b(hVar);
        return hVar;
    }

    /* renamed from: r */
    public static final long m8862r(long j, float f) {
        return C15090b.m64845a(Math.max(0.0f, C15088a.m64833m(j) - f), Math.max(0.0f, C15088a.m64835o(j) - f));
    }
}

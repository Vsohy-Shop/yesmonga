package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.vector.C15383q;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8548i;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.urbanairship.iam.C9127a0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n1#3:422\n50#4:423\n49#4:424\n25#4:431\n1114#5,6:425\n1114#5,6:432\n173#6,6:438\n261#6,11:444\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n127#1:421\n134#1:423\n134#1:424\n142#1:431\n134#1:425,6\n142#1:432,6\n281#1:438,6\n281#1:444,11\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt */
public final class VectorPainterKt {
    @C12579k

    /* renamed from: a */
    public static final String f37804a = "VectorRootGroup";

    /* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$a */
    public static final class C15336a implements C15376l {
    }

    /* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$b */
    public static final class C15337b implements C15376l {
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    /* renamed from: a */
    public static final void m66822a(@C12579k C15378m mVar, @C12580l Map<String, ? extends C15376l> map, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        Map<String, ? extends C15376l> map2;
        C8592o oVar2;
        Map<String, ? extends C15376l> map3;
        Map<String, ? extends C15376l> map4;
        Map<String, ? extends C15376l> map5;
        int i4;
        C15378m mVar2 = mVar;
        int i5 = i;
        int i6 = i2;
        Intrinsics.checkNotNullParameter(mVar2, "group");
        C8592o o = oVar.mo15009o(-446179233);
        if ((i6 & 1) != 0) {
            i3 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i5;
        } else {
            i3 = i5;
        }
        int i7 = i6 & 2;
        if (i7 != 0) {
            i3 |= 16;
        }
        if (i7 == 2 && (i3 & 91) == 18 && o.mo15011p()) {
            o.mo14958a0();
            map2 = map;
            oVar2 = o;
        } else {
            if (i7 != 0) {
                map3 = C10977s0.m41492z();
            } else {
                map3 = map;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-446179233, i5, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            Iterator<C15381o> it = mVar.iterator();
            while (it.hasNext()) {
                C15381o next = it.next();
                if (next instanceof C15382p) {
                    o.mo14918M(-326285735);
                    C15382p pVar = (C15382p) next;
                    C15376l lVar = (C15376l) map3.get(pVar.mo43565i());
                    if (lVar == null) {
                        lVar = new C15336a();
                    }
                    C15376l lVar2 = lVar;
                    Iterator<C15381o> it2 = it;
                    C15376l lVar3 = lVar2;
                    C8592o oVar3 = o;
                    Map<String, ? extends C15376l> map6 = map3;
                    VectorComposeKt.m66778b((List) lVar2.mo43534b(C15383q.C15386c.f38066b, pVar.mo43566q()), pVar.mo43567r(), pVar.mo43565i(), (C15421z1) lVar2.mo43534b(C15383q.C15384a.f38062b, pVar.mo43559e()), ((Number) lVar2.mo43534b(C15383q.C15385b.f38064b, Float.valueOf(pVar.mo43563h()))).floatValue(), (C15421z1) lVar2.mo43534b(C15383q.C15392i.f38078b, pVar.mo43568w()), ((Number) lVar2.mo43534b(C15383q.C15393j.f38080b, Float.valueOf(pVar.mo43569y()))).floatValue(), ((Number) lVar2.mo43534b(C15383q.C15394k.f38082b, Float.valueOf(pVar.mo43557W()))).floatValue(), pVar.mo43554H(), pVar.mo43555M(), pVar.mo43556Q(), ((Number) lVar3.mo43534b(C15383q.C15399p.f38092b, Float.valueOf(pVar.mo43562f0()))).floatValue(), ((Number) lVar3.mo43534b(C15383q.C15397n.f38088b, Float.valueOf(pVar.mo43558X()))).floatValue(), ((Number) lVar3.mo43534b(C15383q.C15398o.f38090b, Float.valueOf(pVar.mo43560e0()))).floatValue(), oVar3, 8, 0, 0);
                    oVar3.mo15002m0();
                    C15378m mVar3 = mVar;
                    it = it2;
                    map5 = map6;
                    int i8 = i2;
                    o = oVar3;
                } else {
                    Iterator<C15381o> it3 = it;
                    Map<String, ? extends C15376l> map7 = map3;
                    C8592o oVar4 = o;
                    if (next instanceof C15378m) {
                        oVar4.mo14918M(-326283877);
                        C15378m mVar4 = (C15378m) next;
                        map4 = map7;
                        C15376l lVar4 = (C15376l) map4.get(mVar4.mo43545q());
                        if (lVar4 == null) {
                            lVar4 = new C15337b();
                        }
                        String q = mVar4.mo43545q();
                        float floatValue = ((Number) lVar4.mo43534b(C15383q.C15389f.f38072b, Float.valueOf(mVar4.mo43548y()))).floatValue();
                        float floatValue2 = ((Number) lVar4.mo43534b(C15383q.C15390g.f38074b, Float.valueOf(mVar4.mo43535H()))).floatValue();
                        float floatValue3 = ((Number) lVar4.mo43534b(C15383q.C15391h.f38076b, Float.valueOf(mVar4.mo43536M()))).floatValue();
                        float floatValue4 = ((Number) lVar4.mo43534b(C15383q.C15395l.f38084b, Float.valueOf(mVar4.mo43538W()))).floatValue();
                        float floatValue5 = ((Number) lVar4.mo43534b(C15383q.C15396m.f38086b, Float.valueOf(mVar4.mo43539X()))).floatValue();
                        VectorComposeKt.m66777a(q, floatValue, ((Number) lVar4.mo43534b(C15383q.C15387d.f38068b, Float.valueOf(mVar4.mo43546r()))).floatValue(), ((Number) lVar4.mo43534b(C15383q.C15388e.f38070b, Float.valueOf(mVar4.mo43547w()))).floatValue(), floatValue2, floatValue3, floatValue4, floatValue5, (List) lVar4.mo43534b(C15383q.C15386c.f38066b, mVar4.mo43543i()), C8553b.m31048b(oVar4, 1450046638, true, new VectorPainterKt$RenderVectorGroup$1(next, map4)), oVar4, 939524096, 0);
                        oVar4.mo15002m0();
                    } else {
                        map4 = map7;
                        oVar4.mo14918M(-326282407);
                        oVar4.mo15002m0();
                    }
                    C15378m mVar5 = mVar;
                    int i9 = i2;
                    o = oVar4;
                    map5 = map4;
                    it = it3;
                }
                int i10 = i;
            }
            map2 = map3;
            oVar2 = o;
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new VectorPainterKt$RenderVectorGroup$2(mVar, map2, i, i2));
        }
    }

    /* renamed from: b */
    public static final void m66823b(C15187e eVar, C11300l<? super C15187e, C11079d2> lVar) {
        long U = eVar.mo42717U();
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42713j(-1.0f, 1.0f, U);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public static final VectorPainter m66824c(@C12579k C15340c cVar, @C12580l C8592o oVar, int i) {
        C15340c cVar2 = cVar;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(cVar, C9127a0.f24709d);
        oVar.mo14918M(1413834416);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        VectorPainter e = m66826e(cVar.mo43172c(), cVar.mo43171b(), cVar.mo43180i(), cVar.mo43178h(), cVar.mo43173d(), cVar.mo43177g(), cVar.mo43176f(), cVar.mo43170a(), C8553b.m31048b(oVar, 1873274766, true, new VectorPainterKt$rememberVectorPainter$3(cVar)), oVar, 100663296, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return e;
    }

    @C11395k(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @C11587t0(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @C8540g
    @C8548i(index = -1)
    @C12579k
    /* renamed from: d */
    public static final VectorPainter m66825d(float f, float f2, float f3, float f4, @C12580l String str, long j, int i, @C12579k C11306r<? super Float, ? super Float, ? super C8592o, ? super Integer, C11079d2> rVar, @C12580l C8592o oVar, int i2, int i3) {
        float f5;
        float f6;
        long j2;
        int i4;
        int i5 = i2;
        Intrinsics.checkNotNullParameter(rVar, "content");
        oVar.mo14918M(-964365210);
        if ((i3 & 4) != 0) {
            f5 = Float.NaN;
        } else {
            f5 = f3;
        }
        if ((i3 & 8) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f4;
        }
        String str2 = (i3 & 16) != 0 ? f37804a : str;
        if ((i3 & 32) != 0) {
            j2 = C15240j2.f37547b.mo42851u();
        } else {
            j2 = j;
        }
        if ((i3 & 64) != 0) {
            i4 = C15325u1.f37708b.mo43042z();
        } else {
            i4 = i;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-964365210, i5, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:73)");
        }
        VectorPainter e = m66826e(f, f2, f5, f6, str2, j2, i4, false, rVar, oVar, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return e;
    }

    @C8540g
    @C8548i(index = -1)
    @C12579k
    /* renamed from: e */
    public static final VectorPainter m66826e(float f, float f2, float f3, float f4, @C12580l String str, long j, int i, boolean z, @C12579k C11306r<? super Float, ? super Float, ? super C8592o, ? super Integer, C11079d2> rVar, @C12580l C8592o oVar, int i2, int i3) {
        float f5;
        String str2;
        long j2;
        int i4;
        boolean z2;
        C15249k2 k2Var;
        C8592o oVar2 = oVar;
        int i5 = i2;
        int i6 = i3;
        Intrinsics.checkNotNullParameter(rVar, "content");
        oVar2.mo14918M(1068590786);
        float f6 = Float.NaN;
        if ((i6 & 4) != 0) {
            f5 = Float.NaN;
        } else {
            f5 = f3;
        }
        if ((i6 & 8) == 0) {
            f6 = f4;
        }
        if ((i6 & 16) != 0) {
            str2 = f37804a;
        } else {
            str2 = str;
        }
        if ((i6 & 32) != 0) {
            j2 = C15240j2.f37547b.mo42851u();
        } else {
            j2 = j;
        }
        if ((i6 & 64) != 0) {
            i4 = C15325u1.f37708b.mo43042z();
        } else {
            i4 = i;
        }
        if ((i6 & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1068590786, i5, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
        float g5 = dVar.mo7425g5(f);
        float g52 = dVar.mo7425g5(f2);
        if (Float.isNaN(f5)) {
            f5 = g5;
        }
        if (Float.isNaN(f6)) {
            f6 = g52;
        }
        C15240j2 n = C15240j2.m66071n(j2);
        C15325u1 D = C15325u1.m66577D(i4);
        int i7 = i5 >> 15;
        oVar2.mo14918M(511388516);
        boolean n0 = oVar2.mo15006n0(n) | oVar2.mo15006n0(D);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            if (!C15240j2.m66082y(j2, C15240j2.f37547b.mo42851u())) {
                k2Var = C15249k2.f37569b.mo42868c(j2, i4);
            } else {
                k2Var = null;
            }
            N = k2Var;
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        C15249k2 k2Var2 = (C15249k2) N;
        oVar2.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        if (N2 == C8592o.f23032a.mo16277a()) {
            N2 = new VectorPainter();
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        VectorPainter vectorPainter = (VectorPainter) N2;
        vectorPainter.mo43130z(C15106n.m65033a(g5, g52));
        vectorPainter.mo43127w(z2);
        vectorPainter.mo43129y(k2Var2);
        vectorPainter.mo43121o(str2, f5, f6, rVar, oVar, ((i5 >> 12) & 14) | 32768 | (i7 & 7168));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return vectorPainter;
    }
}

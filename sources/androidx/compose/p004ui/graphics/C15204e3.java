package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15088a;
import androidx.compose.p004ui.geometry.C15090b;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15101k;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15197l;
import com.google.maps.android.data.kml.C33866p;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,307:1\n245#1,16:308\n245#1,16:324\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:308,16\n195#1:324,16\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.e3 */
public final class C15204e3 {
    /* renamed from: b */
    public static final void m65902b(@C12579k C15231i3 i3Var, @C12579k C15174d3 d3Var) {
        Intrinsics.checkNotNullParameter(i3Var, "<this>");
        Intrinsics.checkNotNullParameter(d3Var, C33866p.f82159k);
        if (d3Var instanceof C15174d3.C15176b) {
            i3Var.mo42814o(((C15174d3.C15176b) d3Var).mo42649b());
        } else if (d3Var instanceof C15174d3.C15177c) {
            i3Var.mo42817r(((C15174d3.C15177c) d3Var).mo42652b());
        } else if (d3Var instanceof C15174d3.C15175a) {
            C15231i3.m66005m(i3Var, ((C15174d3.C15175a) d3Var).mo42646b(), 0, 2, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public static final void m65903c(@C12579k C15118b2 b2Var, @C12579k C15174d3 d3Var, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        Intrinsics.checkNotNullParameter(d3Var, C33866p.f82159k);
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        if (d3Var instanceof C15174d3.C15176b) {
            b2Var.mo42428K(((C15174d3.C15176b) d3Var).mo42649b(), f3Var);
        } else if (d3Var instanceof C15174d3.C15177c) {
            C15174d3.C15177c cVar = (C15174d3.C15177c) d3Var;
            C15231i3 c = cVar.mo42653c();
            if (c != null) {
                b2Var.mo42427J(c, f3Var);
                return;
            }
            b2Var.mo42430P(cVar.mo42652b().mo42302q(), cVar.mo42652b().mo42304s(), cVar.mo42652b().mo42303r(), cVar.mo42652b().mo42298m(), C15088a.m64833m(cVar.mo42652b().mo42299n()), C15088a.m64835o(cVar.mo42652b().mo42299n()), f3Var);
        } else if (d3Var instanceof C15174d3.C15175a) {
            b2Var.mo42427J(((C15174d3.C15175a) d3Var).mo42646b(), f3Var);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static final void m65904d(@C12579k C15187e eVar, @C12579k C15174d3 d3Var, @C12579k C15421z1 z1Var, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15231i3 i3Var;
        C15174d3 d3Var2 = d3Var;
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(d3Var, C33866p.f82159k);
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        Intrinsics.checkNotNullParameter(hVar, "style");
        if (d3Var2 instanceof C15174d3.C15176b) {
            C15098i b = ((C15174d3.C15176b) d3Var2).mo42649b();
            eVar.mo42686y3(z1Var, m65912l(b), m65910j(b), f, hVar, k2Var, i);
            return;
        }
        if (d3Var2 instanceof C15174d3.C15177c) {
            C15174d3.C15177c cVar = (C15174d3.C15177c) d3Var2;
            i3Var = cVar.mo42653c();
            if (i3Var == null) {
                C15101k b2 = cVar.mo42652b();
                float m = C15088a.m64833m(b2.mo42299n());
                eVar.mo42668O4(z1Var, m65913m(b2), m65911k(b2), C15090b.m64846b(m, 0.0f, 2, (Object) null), f, hVar, k2Var, i);
                return;
            }
        } else if (d3Var2 instanceof C15174d3.C15175a) {
            i3Var = ((C15174d3.C15175a) d3Var2).mo42646b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        eVar.mo42659F1(i3Var, z1Var, f, hVar, k2Var, i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m65905e(C15187e eVar, C15174d3 d3Var, C15421z1 z1Var, float f, C15192h hVar, C15249k2 k2Var, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            hVar = C15197l.f37504a;
        }
        C15192h hVar2 = hVar;
        if ((i2 & 16) != 0) {
            k2Var = null;
        }
        C15249k2 k2Var2 = k2Var;
        if ((i2 & 32) != 0) {
            i = C15187e.f37500l.mo42719a();
        }
        m65904d(eVar, d3Var, z1Var, f2, hVar2, k2Var2, i);
    }

    /* renamed from: f */
    public static final void m65906f(@C12579k C15187e eVar, @C12579k C15174d3 d3Var, long j, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15231i3 i3Var;
        C15174d3 d3Var2 = d3Var;
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(d3Var2, C33866p.f82159k);
        Intrinsics.checkNotNullParameter(hVar, "style");
        if (d3Var2 instanceof C15174d3.C15176b) {
            C15098i b = ((C15174d3.C15176b) d3Var2).mo42649b();
            eVar.mo42663J3(j, m65912l(b), m65910j(b), f, hVar, k2Var, i);
            return;
        }
        if (d3Var2 instanceof C15174d3.C15177c) {
            C15174d3.C15177c cVar = (C15174d3.C15177c) d3Var2;
            i3Var = cVar.mo42653c();
            if (i3Var == null) {
                C15101k b2 = cVar.mo42652b();
                C15187e eVar3 = eVar;
                long j2 = j;
                eVar3.mo42657A2(j2, m65913m(b2), m65911k(b2), C15090b.m64846b(C15088a.m64833m(b2.mo42299n()), 0.0f, 2, (Object) null), hVar, f, k2Var, i);
                return;
            }
        } else if (d3Var2 instanceof C15174d3.C15175a) {
            i3Var = ((C15174d3.C15175a) d3Var2).mo42646b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        eVar.mo42661G3(i3Var, j, f, hVar, k2Var, i);
    }

    /* renamed from: g */
    public static /* synthetic */ void m65907g(C15187e eVar, C15174d3 d3Var, long j, float f, C15192h hVar, C15249k2 k2Var, int i, int i2, Object obj) {
        float f2;
        C15197l lVar;
        C15249k2 k2Var2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            lVar = C15197l.f37504a;
        } else {
            lVar = hVar;
        }
        if ((i2 & 16) != 0) {
            k2Var2 = null;
        } else {
            k2Var2 = k2Var;
        }
        if ((i2 & 32) != 0) {
            i3 = C15187e.f37500l.mo42719a();
        } else {
            i3 = i;
        }
        m65906f(eVar, d3Var, j, f2, lVar, k2Var2, i3);
    }

    /* renamed from: h */
    public static final void m65908h(C15187e eVar, C15174d3 d3Var, C11304p<? super C15187e, ? super C15098i, C11079d2> pVar, C11304p<? super C15187e, ? super C15101k, C11079d2> pVar2, C11304p<? super C15187e, ? super C15231i3, C11079d2> pVar3) {
        if (d3Var instanceof C15174d3.C15176b) {
            pVar.invoke(eVar, ((C15174d3.C15176b) d3Var).mo42649b());
        } else if (d3Var instanceof C15174d3.C15177c) {
            C15174d3.C15177c cVar = (C15174d3.C15177c) d3Var;
            C15231i3 c = cVar.mo42653c();
            if (c != null) {
                pVar3.invoke(eVar, c);
            } else {
                pVar2.invoke(eVar, cVar.mo42652b());
            }
        } else if (d3Var instanceof C15174d3.C15175a) {
            pVar3.invoke(eVar, ((C15174d3.C15175a) d3Var).mo42646b());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[ADDED_TO_REGION] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m65909i(androidx.compose.p004ui.geometry.C15101k r6) {
        /*
            long r0 = r6.mo42299n()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64833m(r0)
            long r1 = r6.mo42300o()
            float r1 = androidx.compose.p004ui.geometry.C15088a.m64833m(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r0 = r1
            goto L_0x0019
        L_0x0018:
            r0 = r2
        L_0x0019:
            if (r0 == 0) goto L_0x004f
            long r3 = r6.mo42300o()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64833m(r3)
            long r3 = r6.mo42307u()
            float r3 = androidx.compose.p004ui.geometry.C15088a.m64833m(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0031
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r0 = r2
        L_0x0032:
            if (r0 == 0) goto L_0x004f
            long r3 = r6.mo42307u()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64833m(r3)
            long r3 = r6.mo42305t()
            float r3 = androidx.compose.p004ui.geometry.C15088a.m64833m(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            r0 = r1
            goto L_0x004b
        L_0x004a:
            r0 = r2
        L_0x004b:
            if (r0 == 0) goto L_0x004f
            r0 = r1
            goto L_0x0050
        L_0x004f:
            r0 = r2
        L_0x0050:
            long r3 = r6.mo42299n()
            float r3 = androidx.compose.p004ui.geometry.C15088a.m64835o(r3)
            long r4 = r6.mo42300o()
            float r4 = androidx.compose.p004ui.geometry.C15088a.m64835o(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0066
            r3 = r1
            goto L_0x0067
        L_0x0066:
            r3 = r2
        L_0x0067:
            if (r3 == 0) goto L_0x009d
            long r3 = r6.mo42300o()
            float r3 = androidx.compose.p004ui.geometry.C15088a.m64835o(r3)
            long r4 = r6.mo42307u()
            float r4 = androidx.compose.p004ui.geometry.C15088a.m64835o(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x007f
            r3 = r1
            goto L_0x0080
        L_0x007f:
            r3 = r2
        L_0x0080:
            if (r3 == 0) goto L_0x009d
            long r3 = r6.mo42307u()
            float r3 = androidx.compose.p004ui.geometry.C15088a.m64835o(r3)
            long r4 = r6.mo42305t()
            float r6 = androidx.compose.p004ui.geometry.C15088a.m64835o(r4)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0098
            r6 = r1
            goto L_0x0099
        L_0x0098:
            r6 = r2
        L_0x0099:
            if (r6 == 0) goto L_0x009d
            r6 = r1
            goto L_0x009e
        L_0x009d:
            r6 = r2
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r1 = r2
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.C15204e3.m65909i(androidx.compose.ui.geometry.k):boolean");
    }

    /* renamed from: j */
    public static final long m65910j(C15098i iVar) {
        return C15106n.m65033a(iVar.mo42253G(), iVar.mo42278r());
    }

    /* renamed from: k */
    public static final long m65911k(C15101k kVar) {
        return C15106n.m65033a(kVar.mo42308v(), kVar.mo42301p());
    }

    /* renamed from: l */
    public static final long m65912l(C15098i iVar) {
        return C15096g.m64898a(iVar.mo42279t(), iVar.mo42249B());
    }

    /* renamed from: m */
    public static final long m65913m(C15101k kVar) {
        return C15096g.m64898a(kVar.mo42302q(), kVar.mo42304s());
    }
}

package androidx.compose.p004ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.platform.C16383l;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16445q;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16507v;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.platform.extensions.d */
public final class C16373d {
    @C12580l
    /* renamed from: a */
    public static final C16151c0 m73917a(@C12579k C16383l lVar, @C12579k C16151c0 c0Var, @C12579k C11306r<? super C16242u, ? super C16209i0, ? super C16190e0, ? super C16194f0, ? extends Typeface> rVar, @C12579k C16479d dVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(c0Var, "style");
        Intrinsics.checkNotNullParameter(rVar, "resolveTypeface");
        Intrinsics.checkNotNullParameter(dVar, "density");
        long m = C16504t.m74686m(c0Var.mo46615t());
        C16507v.C16508a aVar = C16507v.f40911b;
        if (C16507v.m74732g(m, aVar.mo47909b())) {
            lVar.setTextSize(dVar.mo7415C2(c0Var.mo46615t()));
        } else if (C16507v.m74732g(m, aVar.mo47908a())) {
            lVar.setTextSize(lVar.getTextSize() * C16504t.m74687n(c0Var.mo46615t()));
        }
        if (m73921e(c0Var)) {
            C16242u r = c0Var.mo46613r();
            C16209i0 w = c0Var.mo46619w();
            if (w == null) {
                w = C16209i0.f40292b.mo46952m();
            }
            C16190e0 u = c0Var.mo46617u();
            if (u != null) {
                i = u.mo46880j();
            } else {
                i = C16190e0.f40252b.mo46883b();
            }
            C16190e0 c = C16190e0.m72948c(i);
            C16194f0 v = c0Var.mo46618v();
            if (v != null) {
                i2 = v.mo46893m();
            } else {
                i2 = C16194f0.f40257b.mo46895a();
            }
            lVar.setTypeface((Typeface) rVar.invoke(r, w, c, C16194f0.m72968e(i2)));
        }
        if (c0Var.mo46621y() != null && !Intrinsics.areEqual((Object) c0Var.mo46621y(), (Object) C16342f.f40571c.mo47385a())) {
            C16371b.f40632a.mo47540b(lVar, c0Var.mo46621y());
        }
        if (c0Var.mo46614s() != null && !Intrinsics.areEqual((Object) c0Var.mo46614s(), (Object) "")) {
            lVar.setFontFeatureSettings(c0Var.mo46614s());
        }
        if (c0Var.mo46594D() != null && !Intrinsics.areEqual((Object) c0Var.mo46594D(), (Object) C16439m.f40739c.mo47699a())) {
            lVar.setTextScaleX(lVar.getTextScaleX() * c0Var.mo46594D().mo47694d());
            lVar.setTextSkewX(lVar.getTextSkewX() + c0Var.mo46594D().mo47695e());
        }
        lVar.mo47551h(c0Var.mo46611o());
        lVar.mo47550f(c0Var.mo46610m(), C15104m.f37280b.mo42316a(), c0Var.mo46607i());
        lVar.mo47553j(c0Var.mo46591A());
        lVar.mo47555l(c0Var.mo46592B());
        lVar.mo47552i(c0Var.mo46612p());
        if (C16507v.m74732g(C16504t.m74686m(c0Var.mo46620x()), aVar.mo47909b())) {
            boolean z3 = true;
            if (C16504t.m74687n(c0Var.mo46620x()) == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                float textSize = lVar.getTextSize() * lVar.getTextScaleX();
                float C2 = dVar.mo7415C2(c0Var.mo46620x());
                if (textSize != 0.0f) {
                    z3 = false;
                }
                if (!z3) {
                    lVar.setLetterSpacing(C2 / textSize);
                }
                return m73920d(c0Var.mo46620x(), z, c0Var.mo46608k(), c0Var.mo46609l());
            }
        }
        if (C16507v.m74732g(C16504t.m74686m(c0Var.mo46620x()), aVar.mo47908a())) {
            lVar.setLetterSpacing(C16504t.m74687n(c0Var.mo46620x()));
        }
        return m73920d(c0Var.mo46620x(), z, c0Var.mo46608k(), c0Var.mo46609l());
    }

    /* renamed from: b */
    public static /* synthetic */ C16151c0 m73918b(C16383l lVar, C16151c0 c0Var, C11306r rVar, C16479d dVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return m73917a(lVar, c0Var, rVar, dVar, z);
    }

    /* renamed from: c */
    public static final float m73919c(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (androidx.compose.p004ui.text.style.C16410a.m74024g(r35.mo47589k(), androidx.compose.p004ui.text.style.C16410a.f40667b.mo47591a()) == false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.text.C16151c0 m73920d(long r30, boolean r32, long r33, androidx.compose.p004ui.text.style.C16410a r35) {
        /*
            r0 = r33
            r2 = 1
            r3 = 0
            if (r32 == 0) goto L_0x0026
            long r4 = androidx.compose.p004ui.unit.C16504t.m74686m(r30)
            androidx.compose.ui.unit.v$a r6 = androidx.compose.p004ui.unit.C16507v.f40911b
            long r6 = r6.mo47909b()
            boolean r4 = androidx.compose.p004ui.unit.C16507v.m74732g(r4, r6)
            if (r4 == 0) goto L_0x0026
            float r4 = androidx.compose.p004ui.unit.C16504t.m74687n(r30)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0021
            r4 = r2
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r4 != 0) goto L_0x0026
            r4 = r2
            goto L_0x0027
        L_0x0026:
            r4 = r3
        L_0x0027:
            androidx.compose.ui.graphics.j2$a r5 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r6 = r5.mo42851u()
            boolean r6 = androidx.compose.p004ui.graphics.C15240j2.m66082y(r0, r6)
            if (r6 != 0) goto L_0x003f
            long r6 = r5.mo42850s()
            boolean r6 = androidx.compose.p004ui.graphics.C15240j2.m66082y(r0, r6)
            if (r6 != 0) goto L_0x003f
            r6 = r2
            goto L_0x0040
        L_0x003f:
            r6 = r3
        L_0x0040:
            if (r35 == 0) goto L_0x0053
            androidx.compose.ui.text.style.a$a r7 = androidx.compose.p004ui.text.style.C16410a.f40667b
            float r7 = r7.mo47591a()
            float r8 = r35.mo47589k()
            boolean r7 = androidx.compose.p004ui.text.style.C16410a.m74024g(r8, r7)
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            r3 = 0
            if (r4 != 0) goto L_0x005c
            if (r6 != 0) goto L_0x005c
            if (r2 != 0) goto L_0x005c
            goto L_0x0097
        L_0x005c:
            if (r4 == 0) goto L_0x0061
            r19 = r30
            goto L_0x0069
        L_0x0061:
            androidx.compose.ui.unit.t$a r4 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r7 = r4.mo47903b()
            r19 = r7
        L_0x0069:
            if (r6 == 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            long r0 = r5.mo42851u()
        L_0x0070:
            r24 = r0
            if (r2 == 0) goto L_0x0077
            r21 = r35
            goto L_0x0079
        L_0x0077:
            r21 = r3
        L_0x0079:
            androidx.compose.ui.text.c0 r3 = new androidx.compose.ui.text.c0
            r9 = r3
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 13951(0x367f, float:1.955E-41)
            r29 = 0
            r9.<init>((long) r10, (long) r12, (androidx.compose.p004ui.text.font.C16209i0) r14, (androidx.compose.p004ui.text.font.C16190e0) r15, (androidx.compose.p004ui.text.font.C16194f0) r16, (androidx.compose.p004ui.text.font.C16242u) r17, (java.lang.String) r18, (long) r19, (androidx.compose.p004ui.text.style.C16410a) r21, (androidx.compose.p004ui.text.style.C16439m) r22, (androidx.compose.p004ui.text.intl.C16342f) r23, (long) r24, (androidx.compose.p004ui.text.style.C16434j) r26, (androidx.compose.p004ui.graphics.C15205e4) r27, (int) r28, (kotlin.jvm.internal.DefaultConstructorMarker) r29)
        L_0x0097:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.platform.extensions.C16373d.m73920d(long, boolean, long, androidx.compose.ui.text.style.a):androidx.compose.ui.text.c0");
    }

    /* renamed from: e */
    public static final boolean m73921e(@C12579k C16151c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (c0Var.mo46613r() == null && c0Var.mo46617u() == null && c0Var.mo46619w() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final void m73922f(@C12579k C16383l lVar, @C12580l C16445q qVar) {
        int i;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (qVar == null) {
            qVar = C16445q.f40749c.mo47714b();
        }
        if (qVar.mo47710f()) {
            i = lVar.getFlags() | 128;
        } else {
            i = lVar.getFlags() & -129;
        }
        lVar.setFlags(i);
        int e = qVar.mo47708e();
        C16445q.C16447b.C16448a aVar = C16445q.C16447b.f40755b;
        if (C16445q.C16447b.m74250g(e, aVar.mo47720b())) {
            lVar.setFlags(lVar.getFlags() | 64);
            lVar.setHinting(0);
        } else if (C16445q.C16447b.m74250g(e, aVar.mo47719a())) {
            lVar.getFlags();
            lVar.setHinting(1);
        } else if (C16445q.C16447b.m74250g(e, aVar.mo47721c())) {
            lVar.getFlags();
            lVar.setHinting(0);
        } else {
            lVar.getFlags();
        }
    }
}

package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.colorspace.C15135b;
import androidx.compose.p004ui.graphics.colorspace.C15155m;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.Arrays;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,339:1\n34#2:340\n41#2:341\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n162#1:340\n163#1:341\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.h */
public class C15145h {
    @C12579k

    /* renamed from: g */
    public static final C15146a f37432g;
    @C12579k

    /* renamed from: h */
    public static final C15145h f37433h;
    @C12579k

    /* renamed from: i */
    public static final C15145h f37434i;
    @C12579k

    /* renamed from: j */
    public static final C15145h f37435j;
    @C12579k

    /* renamed from: a */
    public final C15138c f37436a;
    @C12579k

    /* renamed from: b */
    public final C15138c f37437b;
    @C12579k

    /* renamed from: c */
    public final C15138c f37438c;
    @C12579k

    /* renamed from: d */
    public final C15138c f37439d;

    /* renamed from: e */
    public final int f37440e;
    @C12580l

    /* renamed from: f */
    public final float[] f37441f;

    /* renamed from: androidx.compose.ui.graphics.colorspace.h$a */
    public static final class C15146a {

        /* renamed from: androidx.compose.ui.graphics.colorspace.h$a$a */
        public static final class C15147a extends C15145h {
            public C15147a(C15138c cVar, int i) {
                super(cVar, cVar, i, (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: h */
            public float[] mo42619h(@C12579k float[] fArr) {
                Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
                return fArr;
            }

            /* renamed from: i */
            public long mo42620i(float f, float f2, float f3, float f4) {
                return C15258l2.m66176a(f, f2, f3, f4, mo42615d());
            }
        }

        public /* synthetic */ C15146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final float[] mo42621b(C15138c cVar, C15138c cVar2, int i) {
            float[] fArr;
            float[] fArr2;
            if (!C15155m.m65537h(i, C15155m.f37466b.mo42641a())) {
                return null;
            }
            long g = cVar.mo42585g();
            C15135b.C15136a aVar = C15135b.f37394b;
            boolean h = C15135b.m65390h(g, aVar.mo42571c());
            boolean h2 = C15135b.m65390h(cVar2.mo42585g(), aVar.mo42571c());
            if (h && h2) {
                return null;
            }
            if (!h && !h2) {
                return null;
            }
            if (!h) {
                cVar = cVar2;
            }
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) cVar;
            if (h) {
                fArr = rgb.mo42520i0().mo42579g();
            } else {
                fArr = C15150j.f37445a.mo42631e();
            }
            if (h2) {
                fArr2 = rgb.mo42520i0().mo42579g();
            } else {
                fArr2 = C15150j.f37445a.mo42631e();
            }
            return new float[]{fArr[0] / fArr2[0], fArr[1] / fArr2[1], fArr[2] / fArr2[2]};
        }

        @C12579k
        /* renamed from: c */
        public final C15145h mo42622c() {
            return C15145h.f37435j;
        }

        @C12579k
        /* renamed from: d */
        public final C15145h mo42623d() {
            return C15145h.f37433h;
        }

        @C12579k
        /* renamed from: e */
        public final C15145h mo42624e() {
            return C15145h.f37434i;
        }

        @C12579k
        /* renamed from: f */
        public final C15145h mo42625f(@C12579k C15138c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "source");
            return new C15147a(cVar, C15155m.f37466b.mo42643c());
        }

        public C15146a() {
        }
    }

    /* renamed from: androidx.compose.ui.graphics.colorspace.h$b */
    public static final class C15148b extends C15145h {
        @C12579k

        /* renamed from: k */
        public final Rgb f37442k;
        @C12579k

        /* renamed from: l */
        public final Rgb f37443l;
        @C12579k

        /* renamed from: m */
        public final float[] f37444m;

        public /* synthetic */ C15148b(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        @C12579k
        /* renamed from: h */
        public float[] mo42619h(@C12579k float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
            fArr[0] = (float) this.f37442k.mo42499T().mo42590a((double) fArr[0]);
            fArr[1] = (float) this.f37442k.mo42499T().mo42590a((double) fArr[1]);
            fArr[2] = (float) this.f37442k.mo42499T().mo42590a((double) fArr[2]);
            C15141d.m65445o(this.f37444m, fArr);
            fArr[0] = (float) this.f37443l.mo42505Z().mo42590a((double) fArr[0]);
            fArr[1] = (float) this.f37443l.mo42505Z().mo42590a((double) fArr[1]);
            fArr[2] = (float) this.f37443l.mo42505Z().mo42590a((double) fArr[2]);
            return fArr;
        }

        /* renamed from: i */
        public long mo42620i(float f, float f2, float f3, float f4) {
            float a = (float) this.f37442k.mo42499T().mo42590a((double) f);
            float a2 = (float) this.f37442k.mo42499T().mo42590a((double) f2);
            float a3 = (float) this.f37442k.mo42499T().mo42590a((double) f3);
            return C15258l2.m66176a((float) this.f37443l.mo42505Z().mo42590a((double) C15141d.m65446p(this.f37444m, a, a2, a3)), (float) this.f37443l.mo42505Z().mo42590a((double) C15141d.m65447q(this.f37444m, a, a2, a3)), (float) this.f37443l.mo42505Z().mo42590a((double) C15141d.m65448r(this.f37444m, a, a2, a3)), f4, this.f37443l);
        }

        /* renamed from: j */
        public final float[] mo42626j(Rgb rgb, Rgb rgb2, int i) {
            if (C15141d.m65438h(rgb.mo42520i0(), rgb2.mo42520i0())) {
                return C15141d.m65443m(rgb2.mo42503X(), rgb.mo42517h0());
            }
            float[] h0 = rgb.mo42517h0();
            float[] X = rgb2.mo42503X();
            float[] g = rgb.mo42520i0().mo42579g();
            float[] g2 = rgb2.mo42520i0().mo42579g();
            C15137b0 i0 = rgb.mo42520i0();
            C15150j jVar = C15150j.f37445a;
            if (!C15141d.m65438h(i0, jVar.mo42630d())) {
                float[] d = C15129a.f37382b.mo42544a().mo42540d();
                float[] e = jVar.mo42631e();
                float[] copyOf = Arrays.copyOf(e, e.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                h0 = C15141d.m65443m(C15141d.m65436f(d, g, copyOf), rgb.mo42517h0());
            }
            if (!C15141d.m65438h(rgb2.mo42520i0(), jVar.mo42630d())) {
                float[] d2 = C15129a.f37382b.mo42544a().mo42540d();
                float[] e2 = jVar.mo42631e();
                float[] copyOf2 = Arrays.copyOf(e2, e2.length);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                X = C15141d.m65442l(C15141d.m65443m(C15141d.m65436f(d2, g2, copyOf2), rgb2.mo42517h0()));
            }
            if (C15155m.m65537h(i, C15155m.f37466b.mo42641a())) {
                h0 = C15141d.m65444n(new float[]{g[0] / g2[0], g[1] / g2[1], g[2] / g2[2]}, h0);
            }
            return C15141d.m65443m(X, h0);
        }

        public C15148b(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, (float[]) null, (DefaultConstructorMarker) null);
            this.f37442k = rgb;
            this.f37443l = rgb2;
            this.f37444m = mo42626j(rgb, rgb2, i);
        }
    }

    static {
        C15146a aVar = new C15146a((DefaultConstructorMarker) null);
        f37432g = aVar;
        C15144g gVar = C15144g.f37408a;
        f37433h = aVar.mo42625f(gVar.mo42612x());
        Rgb x = gVar.mo42612x();
        C15138c u = gVar.mo42609u();
        C15155m.C15156a aVar2 = C15155m.f37466b;
        f37434i = new C15145h(x, u, aVar2.mo42642b(), (DefaultConstructorMarker) null);
        f37435j = new C15145h(gVar.mo42609u(), gVar.mo42612x(), aVar2.mo42642b(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ C15145h(C15138c cVar, C15138c cVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i);
    }

    @C12579k
    /* renamed from: d */
    public final C15138c mo42615d() {
        return this.f37437b;
    }

    /* renamed from: e */
    public final int mo42616e() {
        return this.f37440e;
    }

    @C12579k
    /* renamed from: f */
    public final C15138c mo42617f() {
        return this.f37436a;
    }

    @C12579k
    /* renamed from: g */
    public final float[] mo42618g(float f, float f2, float f3) {
        return mo42619h(new float[]{f, f2, f3});
    }

    @C12579k
    /* renamed from: h */
    public float[] mo42619h(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        float[] m = this.f37438c.mo42525m(fArr);
        float[] fArr2 = this.f37441f;
        if (fArr2 != null) {
            m[0] = m[0] * fArr2[0];
            m[1] = m[1] * fArr2[1];
            m[2] = m[2] * fArr2[2];
        }
        return this.f37439d.mo42507b(m);
    }

    /* renamed from: i */
    public long mo42620i(float f, float f2, float f3, float f4) {
        long k = this.f37438c.mo42522k(f, f2, f3);
        C11377x xVar = C11377x.f28521a;
        float intBitsToFloat = Float.intBitsToFloat((int) (k >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (k & 4294967295L));
        float n = this.f37438c.mo42526n(f, f2, f3);
        float[] fArr = this.f37441f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            n *= fArr[2];
        }
        float f5 = intBitsToFloat2;
        float f6 = intBitsToFloat;
        return this.f37439d.mo42527o(f6, f5, n, f4, this.f37437b);
    }

    public /* synthetic */ C15145h(C15138c cVar, C15138c cVar2, C15138c cVar3, C15138c cVar4, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i, fArr);
    }

    public C15145h(C15138c cVar, C15138c cVar2, C15138c cVar3, C15138c cVar4, int i, float[] fArr) {
        this.f37436a = cVar;
        this.f37437b = cVar2;
        this.f37438c = cVar3;
        this.f37439d = cVar4;
        this.f37440e = i;
        this.f37441f = fArr;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15145h(androidx.compose.p004ui.graphics.colorspace.C15138c r13, androidx.compose.p004ui.graphics.colorspace.C15138c r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.mo42585g()
            androidx.compose.ui.graphics.colorspace.b$a r2 = androidx.compose.p004ui.graphics.colorspace.C15135b.f37394b
            long r3 = r2.mo42571c()
            boolean r0 = androidx.compose.p004ui.graphics.colorspace.C15135b.m65390h(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001e
            androidx.compose.ui.graphics.colorspace.j r0 = androidx.compose.p004ui.graphics.colorspace.C15150j.f37445a
            androidx.compose.ui.graphics.colorspace.b0 r0 = r0.mo42630d()
            androidx.compose.ui.graphics.colorspace.c r0 = androidx.compose.p004ui.graphics.colorspace.C15141d.m65435e(r13, r0, r3, r1, r3)
            r7 = r0
            goto L_0x001f
        L_0x001e:
            r7 = r13
        L_0x001f:
            long r4 = r14.mo42585g()
            long r8 = r2.mo42571c()
            boolean r0 = androidx.compose.p004ui.graphics.colorspace.C15135b.m65390h(r4, r8)
            if (r0 == 0) goto L_0x0039
            androidx.compose.ui.graphics.colorspace.j r0 = androidx.compose.p004ui.graphics.colorspace.C15150j.f37445a
            androidx.compose.ui.graphics.colorspace.b0 r0 = r0.mo42630d()
            androidx.compose.ui.graphics.colorspace.c r0 = androidx.compose.p004ui.graphics.colorspace.C15141d.m65435e(r14, r0, r3, r1, r3)
            r8 = r0
            goto L_0x003a
        L_0x0039:
            r8 = r14
        L_0x003a:
            androidx.compose.ui.graphics.colorspace.h$a r0 = f37432g
            float[] r10 = r0.mo42621b(r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.C15145h.<init>(androidx.compose.ui.graphics.colorspace.c, androidx.compose.ui.graphics.colorspace.c, int):void");
    }
}

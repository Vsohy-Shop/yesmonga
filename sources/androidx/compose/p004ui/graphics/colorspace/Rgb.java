package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.p004ui.graphics.C15258l2;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.Arrays;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1396:1\n25#2,3:1397\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n915#1:1397,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb */
public final class Rgb extends C15138c {
    @C12579k

    /* renamed from: v */
    public static final C15128a f37365v = new C15128a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: w */
    public static final C15149i f37366w = new C15158o();
    @C12579k

    /* renamed from: g */
    public final C15137b0 f37367g;

    /* renamed from: h */
    public final float f37368h;

    /* renamed from: i */
    public final float f37369i;
    @C12580l

    /* renamed from: j */
    public final C15134a0 f37370j;
    @C12579k

    /* renamed from: k */
    public final float[] f37371k;
    @C12579k

    /* renamed from: l */
    public final float[] f37372l;
    @C12579k

    /* renamed from: m */
    public final float[] f37373m;
    @C12579k

    /* renamed from: n */
    public final C15149i f37374n;
    @C12579k

    /* renamed from: o */
    public final C11300l<Double, Double> f37375o;
    @C12579k

    /* renamed from: p */
    public final C15149i f37376p;
    @C12579k

    /* renamed from: q */
    public final C15149i f37377q;
    @C12579k

    /* renamed from: r */
    public final C11300l<Double, Double> f37378r;
    @C12579k

    /* renamed from: s */
    public final C15149i f37379s;

    /* renamed from: t */
    public final boolean f37380t;

    /* renamed from: u */
    public final boolean f37381u;

    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$a */
    public static final class C15128a {
        public /* synthetic */ C15128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: f */
        public final float mo42528f(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < 0.0f) {
                return -f7;
            }
            return f7;
        }

        /* renamed from: g */
        public final boolean mo42529g(double d, C15149i iVar, C15149i iVar2) {
            if (Math.abs(iVar.mo42590a(d) - iVar2.mo42590a(d)) <= 0.001d) {
                return true;
            }
            return false;
        }

        @C12579k
        /* renamed from: h */
        public final float[] mo42530h(@C12579k float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, "toXYZ");
            float[] o = C15141d.m65445o(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] o2 = C15141d.m65445o(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] o3 = C15141d.m65445o(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f = o[0];
            float f2 = o[1];
            float f3 = f + f2 + o[2];
            float f4 = o2[0] + o2[1] + o2[2];
            float f5 = o3[0] + o3[1] + o3[2];
            return new float[]{f / f3, f2 / f3, o2[0] / f4, o2[1] / f4, o3[0] / f5, o3[1] / f5};
        }

        /* renamed from: i */
        public final C15137b0 mo42531i(float[] fArr) {
            float[] o = C15141d.m65445o(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f = o[0];
            float f2 = o[1];
            float f3 = f + f2 + o[2];
            return new C15137b0(f / f3, f2 / f3);
        }

        /* renamed from: j */
        public final float[] mo42532j(float[] fArr, C15137b0 b0Var) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float e = b0Var.mo42576e();
            float f7 = b0Var.mo42578f();
            float f8 = (float) 1;
            float f9 = (f8 - f) / f2;
            float f10 = f / f2;
            float f11 = (f3 / f4) - f10;
            float f12 = (e / f7) - f10;
            float f13 = ((f8 - f3) / f4) - f9;
            float f14 = (f5 / f6) - f10;
            float f15 = (((((f8 - e) / f7) - f9) * f11) - (f12 * f13)) / (((((f8 - f5) / f6) - f9) * f11) - (f13 * f14));
            float f16 = (f12 - (f14 * f15)) / f11;
            float f17 = (1.0f - f16) - f15;
            float f18 = f17 / f2;
            float f19 = f16 / f4;
            float f20 = f15 / f6;
            return new float[]{f18 * f, f17, f18 * ((1.0f - f) - f2), f19 * f3, f16, f19 * ((1.0f - f3) - f4), f20 * f5, f15, f20 * ((1.0f - f5) - f6)};
        }

        /* renamed from: k */
        public final boolean mo42533k(float[] fArr, float[] fArr2) {
            float f = fArr[0] - fArr2[0];
            float f2 = fArr[1] - fArr2[1];
            float[] fArr3 = {f, f2, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (mo42534l(f, f2, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || mo42534l(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || mo42534l(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || mo42534l(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || mo42534l(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || mo42534l(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        /* renamed from: l */
        public final float mo42534l(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: m */
        public final boolean mo42535m(float[] fArr, C15137b0 b0Var, C15149i iVar, C15149i iVar2, float f, float f2, int i) {
            boolean z;
            boolean z2;
            if (i == 0) {
                return true;
            }
            C15144g gVar = C15144g.f37408a;
            if (!C15141d.m65439i(fArr, gVar.mo42613y()) || !C15141d.m65438h(b0Var, C15150j.f37445a.mo42634h())) {
                return false;
            }
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (f2 == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            Rgb x = gVar.mo42612x();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!mo42529g(d, iVar, x.mo42506a0()) || !mo42529g(d, iVar2, x.mo42500U())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: n */
        public final boolean mo42536n(float[] fArr, float f, float f2) {
            float f3 = mo42528f(fArr);
            C15144g gVar = C15144g.f37408a;
            if ((f3 / mo42528f(gVar.mo42608t()) <= 0.9f || !mo42533k(fArr, gVar.mo42613y())) && (f >= 0.0f || f2 <= 1.0f)) {
                return false;
            }
            return true;
        }

        /* renamed from: o */
        public final float[] mo42537o(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                C10956m.m41219i1(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        public C15128a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k float[] r17, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15137b0 r18, @org.jetbrains.annotations.C12580l float[] r19, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15149i r20, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15149i r21, float r22, float r23, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.colorspace.C15134a0 r24, int r25) {
        /*
            r15 = this;
            r6 = r15
            r7 = r17
            r9 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            java.lang.String r0 = "name"
            r1 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "primaries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "whitePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "oetf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "eotf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.compose.ui.graphics.colorspace.b$a r0 = androidx.compose.p004ui.graphics.colorspace.C15135b.f37394b
            long r2 = r0.mo42571c()
            r5 = 0
            r0 = r15
            r4 = r25
            r0.<init>(r1, r2, r4, r5)
            r6.f37367g = r9
            r6.f37368h = r12
            r6.f37369i = r13
            r0 = r24
            r6.f37370j = r0
            r6.f37374n = r10
            androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            r0.<init>(r15)
            r6.f37375o = r0
            androidx.compose.ui.graphics.colorspace.u r0 = new androidx.compose.ui.graphics.colorspace.u
            r0.<init>(r15)
            r6.f37376p = r0
            r6.f37377q = r11
            androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            r0.<init>(r15)
            r6.f37378r = r0
            androidx.compose.ui.graphics.colorspace.v r0 = new androidx.compose.ui.graphics.colorspace.v
            r0.<init>(r15)
            r6.f37379s = r0
            int r0 = r7.length
            r1 = 6
            r2 = 9
            if (r0 == r1) goto L_0x0073
            int r0 = r7.length
            if (r0 != r2) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r0.<init>(r1)
            throw r0
        L_0x0073:
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c8
            androidx.compose.ui.graphics.colorspace.Rgb$a r0 = f37365v
            float[] r1 = r0.mo42537o(r7)
            r6.f37371k = r1
            if (r8 != 0) goto L_0x0088
            float[] r2 = r0.mo42532j(r1, r9)
            r6.f37372l = r2
            goto L_0x008d
        L_0x0088:
            int r3 = r8.length
            if (r3 != r2) goto L_0x00b0
            r6.f37372l = r8
        L_0x008d:
            float[] r2 = r6.f37372l
            float[] r2 = androidx.compose.p004ui.graphics.colorspace.C15141d.m65442l(r2)
            r6.f37373m = r2
            boolean r2 = r0.mo42536n(r1, r12, r13)
            r6.f37380t = r2
            r7 = r0
            r8 = r1
            r9 = r18
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r25
            boolean r0 = r7.mo42535m(r8, r9, r10, r11, r12, r13, r14)
            r6.f37381u = r0
            return
        L_0x00b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Transform must have 9 entries! Has "
            r1.append(r2)
            int r2 = r8.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid range: min="
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ", max="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "; min must be strictly < max"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.b0, float[], androidx.compose.ui.graphics.colorspace.i, androidx.compose.ui.graphics.colorspace.i, float, float, androidx.compose.ui.graphics.colorspace.a0, int):void");
    }

    /* renamed from: C */
    public static final double m65287C(double d) {
        return d;
    }

    /* renamed from: D */
    public static final double m65288D(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* renamed from: E */
    public static final double m65289E(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* renamed from: F */
    public static final double m65290F(C11300l lVar, double d) {
        Intrinsics.checkNotNullParameter(lVar, "$oetf");
        return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: G */
    public static final double m65291G(C11300l lVar, double d) {
        Intrinsics.checkNotNullParameter(lVar, "$eotf");
        return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: H */
    public static final double m65292H(C11300l lVar, double d) {
        Intrinsics.checkNotNullParameter(lVar, "$oetf");
        return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: I */
    public static final double m65293I(C11300l lVar, double d) {
        Intrinsics.checkNotNullParameter(lVar, "$eotf");
        return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: J */
    public static final double m65294J(C15134a0 a0Var, double d) {
        Intrinsics.checkNotNullParameter(a0Var, "$function");
        return C15141d.m65449s(d, a0Var.mo42557j(), a0Var.mo42558k(), a0Var.mo42559l(), a0Var.mo42560m(), a0Var.mo42563p());
    }

    /* renamed from: K */
    public static final double m65295K(C15134a0 a0Var, double d) {
        Intrinsics.checkNotNullParameter(a0Var, "$function");
        return C15141d.m65450t(d, a0Var.mo42557j(), a0Var.mo42558k(), a0Var.mo42559l(), a0Var.mo42560m(), a0Var.mo42561n(), a0Var.mo42562o(), a0Var.mo42563p());
    }

    /* renamed from: L */
    public static final double m65296L(C15134a0 a0Var, double d) {
        Intrinsics.checkNotNullParameter(a0Var, "$function");
        return C15141d.m65451u(d, a0Var.mo42557j(), a0Var.mo42558k(), a0Var.mo42559l(), a0Var.mo42560m(), a0Var.mo42563p());
    }

    /* renamed from: M */
    public static final double m65297M(C15134a0 a0Var, double d) {
        Intrinsics.checkNotNullParameter(a0Var, "$function");
        return C15141d.m65452v(d, a0Var.mo42557j(), a0Var.mo42558k(), a0Var.mo42559l(), a0Var.mo42560m(), a0Var.mo42561n(), a0Var.mo42562o(), a0Var.mo42563p());
    }

    /* renamed from: P */
    public static final double m65300P(Rgb rgb, double d) {
        Intrinsics.checkNotNullParameter(rgb, "this$0");
        return rgb.f37377q.mo42590a(C11479u.m44328G(d, (double) rgb.f37368h, (double) rgb.f37369i));
    }

    /* renamed from: j0 */
    public static final double m65301j0(Rgb rgb, double d) {
        Intrinsics.checkNotNullParameter(rgb, "this$0");
        return C11479u.m44328G(rgb.f37374n.mo42590a(d), (double) rgb.f37368h, (double) rgb.f37369i);
    }

    @C12579k
    /* renamed from: Q */
    public final float[] mo42496Q(float f, float f2, float f3) {
        return mo42497R(new float[]{f, f2, f3});
    }

    @C12579k
    /* renamed from: R */
    public final float[] mo42497R(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        fArr[0] = (float) this.f37376p.mo42590a((double) fArr[0]);
        fArr[1] = (float) this.f37376p.mo42590a((double) fArr[1]);
        fArr[2] = (float) this.f37376p.mo42590a((double) fArr[2]);
        return fArr;
    }

    @C12579k
    /* renamed from: S */
    public final C11300l<Double, Double> mo42498S() {
        return this.f37378r;
    }

    @C12579k
    /* renamed from: T */
    public final C15149i mo42499T() {
        return this.f37379s;
    }

    @C12579k
    /* renamed from: U */
    public final C15149i mo42500U() {
        return this.f37377q;
    }

    @C12579k
    /* renamed from: V */
    public final float[] mo42501V() {
        float[] fArr = this.f37373m;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C12579k
    /* renamed from: W */
    public final float[] mo42502W(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "inverseTransform");
        return C10956m.m41219i1(this.f37373m, fArr, 0, 0, 0, 14, (Object) null);
    }

    @C12579k
    /* renamed from: X */
    public final float[] mo42503X() {
        return this.f37373m;
    }

    @C12579k
    /* renamed from: Y */
    public final C11300l<Double, Double> mo42504Y() {
        return this.f37375o;
    }

    @C12579k
    /* renamed from: Z */
    public final C15149i mo42505Z() {
        return this.f37376p;
    }

    @C12579k
    /* renamed from: a0 */
    public final C15149i mo42506a0() {
        return this.f37374n;
    }

    @C12579k
    /* renamed from: b */
    public float[] mo42507b(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        C15141d.m65445o(this.f37373m, fArr);
        fArr[0] = (float) this.f37376p.mo42590a((double) fArr[0]);
        fArr[1] = (float) this.f37376p.mo42590a((double) fArr[1]);
        fArr[2] = (float) this.f37376p.mo42590a((double) fArr[2]);
        return fArr;
    }

    @C12579k
    /* renamed from: b0 */
    public final float[] mo42508b0() {
        float[] fArr = this.f37371k;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C12579k
    /* renamed from: c0 */
    public final float[] mo42509c0(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "primaries");
        return C10956m.m41219i1(this.f37371k, fArr, 0, 0, 0, 14, (Object) null);
    }

    @C12579k
    /* renamed from: d0 */
    public final float[] mo42510d0() {
        return this.f37371k;
    }

    /* renamed from: e */
    public float mo42511e(int i) {
        return this.f37369i;
    }

    @C12580l
    /* renamed from: e0 */
    public final C15134a0 mo42512e0() {
        return this.f37370j;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f37368h, this.f37368h) != 0 || Float.compare(rgb.f37369i, this.f37369i) != 0 || !Intrinsics.areEqual((Object) this.f37367g, (Object) rgb.f37367g) || !Arrays.equals(this.f37371k, rgb.f37371k)) {
            return false;
        }
        C15134a0 a0Var = this.f37370j;
        if (a0Var != null) {
            return Intrinsics.areEqual((Object) a0Var, (Object) rgb.f37370j);
        }
        if (rgb.f37370j == null) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) this.f37374n, (Object) rgb.f37374n)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f37377q, (Object) rgb.f37377q);
    }

    /* renamed from: f */
    public float mo42514f(int i) {
        return this.f37368h;
    }

    @C12579k
    /* renamed from: f0 */
    public final float[] mo42515f0() {
        float[] fArr = this.f37372l;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C12579k
    /* renamed from: g0 */
    public final float[] mo42516g0(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "transform");
        return C10956m.m41219i1(this.f37372l, fArr, 0, 0, 0, 14, (Object) null);
    }

    @C12579k
    /* renamed from: h0 */
    public final float[] mo42517h0() {
        return this.f37372l;
    }

    public int hashCode() {
        boolean z;
        int i;
        int i2;
        int hashCode = ((((super.hashCode() * 31) + this.f37367g.hashCode()) * 31) + Arrays.hashCode(this.f37371k)) * 31;
        float f = this.f37368h;
        boolean z2 = true;
        int i3 = 0;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        float f2 = this.f37369i;
        if (f2 != 0.0f) {
            z2 = false;
        }
        if (!z2) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        C15134a0 a0Var = this.f37370j;
        if (a0Var != null) {
            i3 = a0Var.hashCode();
        }
        int i6 = i5 + i3;
        if (this.f37370j == null) {
            return (((i6 * 31) + this.f37374n.hashCode()) * 31) + this.f37377q.hashCode();
        }
        return i6;
    }

    /* renamed from: i */
    public boolean mo42519i() {
        return this.f37381u;
    }

    @C12579k
    /* renamed from: i0 */
    public final C15137b0 mo42520i0() {
        return this.f37367g;
    }

    /* renamed from: j */
    public boolean mo42521j() {
        return this.f37380t;
    }

    /* renamed from: k */
    public long mo42522k(float f, float f2, float f3) {
        float a = (float) this.f37379s.mo42590a((double) f);
        float a2 = (float) this.f37379s.mo42590a((double) f2);
        float a3 = (float) this.f37379s.mo42590a((double) f3);
        return (((long) Float.floatToIntBits(C15141d.m65446p(this.f37372l, a, a2, a3))) << 32) | (((long) Float.floatToIntBits(C15141d.m65447q(this.f37372l, a, a2, a3))) & 4294967295L);
    }

    @C12579k
    /* renamed from: k0 */
    public final float[] mo42523k0(float f, float f2, float f3) {
        return mo42524l0(new float[]{f, f2, f3});
    }

    @C12579k
    /* renamed from: l0 */
    public final float[] mo42524l0(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        fArr[0] = (float) this.f37379s.mo42590a((double) fArr[0]);
        fArr[1] = (float) this.f37379s.mo42590a((double) fArr[1]);
        fArr[2] = (float) this.f37379s.mo42590a((double) fArr[2]);
        return fArr;
    }

    @C12579k
    /* renamed from: m */
    public float[] mo42525m(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        fArr[0] = (float) this.f37379s.mo42590a((double) fArr[0]);
        fArr[1] = (float) this.f37379s.mo42590a((double) fArr[1]);
        fArr[2] = (float) this.f37379s.mo42590a((double) fArr[2]);
        return C15141d.m65445o(this.f37372l, fArr);
    }

    /* renamed from: n */
    public float mo42526n(float f, float f2, float f3) {
        return C15141d.m65448r(this.f37372l, (float) this.f37379s.mo42590a((double) f), (float) this.f37379s.mo42590a((double) f2), (float) this.f37379s.mo42590a((double) f3));
    }

    /* renamed from: o */
    public long mo42527o(float f, float f2, float f3, float f4, @C12579k C15138c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        return C15258l2.m66176a((float) this.f37376p.mo42590a((double) C15141d.m65446p(this.f37373m, f, f2, f3)), (float) this.f37376p.mo42590a((double) C15141d.m65447q(this.f37373m, f, f2, f3)), (float) this.f37376p.mo42590a((double) C15141d.m65448r(this.f37373m, f, f2, f3)), f4, cVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k float[] r17, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Double, java.lang.Double> r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Double, java.lang.Double> r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "name"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.lang.String r3 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "oetf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "eotf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            androidx.compose.ui.graphics.colorspace.Rgb$a r3 = f37365v
            float[] r6 = r3.mo42530h(r0)
            androidx.compose.ui.graphics.colorspace.b0 r7 = r3.mo42531i(r0)
            r8 = 0
            androidx.compose.ui.graphics.colorspace.s r9 = new androidx.compose.ui.graphics.colorspace.s
            r9.<init>(r1)
            androidx.compose.ui.graphics.colorspace.t r10 = new androidx.compose.ui.graphics.colorspace.t
            r10.<init>(r2)
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r14 = -1
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], kotlin.jvm.functions.l, kotlin.jvm.functions.l):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(@org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12579k float[] r16, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15137b0 r17, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Double, java.lang.Double> r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Double, java.lang.Double> r19, float r20, float r21) {
        /*
            r14 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "name"
            r4 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "primaries"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "whitePoint"
            r6 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = "oetf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "eotf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r7 = 0
            androidx.compose.ui.graphics.colorspace.n r8 = new androidx.compose.ui.graphics.colorspace.n
            r8.<init>(r0)
            androidx.compose.ui.graphics.colorspace.r r9 = new androidx.compose.ui.graphics.colorspace.r
            r9.<init>(r1)
            r12 = 0
            r13 = -1
            r3 = r14
            r10 = r20
            r11 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.b0, kotlin.jvm.functions.l, kotlin.jvm.functions.l, float, float):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(@org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12579k float[] r9, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15134a0 r10) {
        /*
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$a r0 = f37365v
            float[] r3 = r0.mo42530h(r9)
            androidx.compose.ui.graphics.colorspace.b0 r4 = r0.mo42531i(r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.a0):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(@C12579k String str, @C12579k float[] fArr, @C12579k C15137b0 b0Var, @C12579k C15134a0 a0Var) {
        this(str, fArr, b0Var, a0Var, -1);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(fArr, "primaries");
        Intrinsics.checkNotNullParameter(b0Var, "whitePoint");
        Intrinsics.checkNotNullParameter(a0Var, "function");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(@org.jetbrains.annotations.C12579k java.lang.String r14, @org.jetbrains.annotations.C12579k float[] r15, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15137b0 r16, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15134a0 r17, int r18) {
        /*
            r13 = this;
            r9 = r17
            java.lang.String r0 = "name"
            r1 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "primaries"
            r2 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r4 = 0
            double r5 = r17.mo42561n()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L_0x0029
            r0 = r5
            goto L_0x002a
        L_0x0029:
            r0 = r6
        L_0x002a:
            if (r0 == 0) goto L_0x003f
            double r10 = r17.mo42562o()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
            r0 = r5
            goto L_0x0037
        L_0x0036:
            r0 = r6
        L_0x0037:
            if (r0 == 0) goto L_0x003f
            androidx.compose.ui.graphics.colorspace.w r0 = new androidx.compose.ui.graphics.colorspace.w
            r0.<init>(r9)
            goto L_0x0044
        L_0x003f:
            androidx.compose.ui.graphics.colorspace.x r0 = new androidx.compose.ui.graphics.colorspace.x
            r0.<init>(r9)
        L_0x0044:
            r10 = r0
            double r11 = r17.mo42561n()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
            r0 = r5
            goto L_0x0050
        L_0x004f:
            r0 = r6
        L_0x0050:
            if (r0 == 0) goto L_0x0064
            double r11 = r17.mo42562o()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r5 = r6
        L_0x005c:
            if (r5 == 0) goto L_0x0064
            androidx.compose.ui.graphics.colorspace.y r0 = new androidx.compose.ui.graphics.colorspace.y
            r0.<init>(r9)
            goto L_0x0069
        L_0x0064:
            androidx.compose.ui.graphics.colorspace.z r0 = new androidx.compose.ui.graphics.colorspace.z
            r0.<init>(r9)
        L_0x0069:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r10
            r9 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.b0, androidx.compose.ui.graphics.colorspace.a0, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k float[] r12, double r13) {
        /*
            r10 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$a r0 = f37365v
            float[] r3 = r0.mo42530h(r12)
            androidx.compose.ui.graphics.colorspace.b0 r4 = r0.mo42531i(r12)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>((java.lang.String) r2, (float[]) r3, (androidx.compose.p004ui.graphics.colorspace.C15137b0) r4, (double) r5, (float) r7, (float) r8, (int) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(@C12579k String str, @C12579k float[] fArr, @C12579k C15137b0 b0Var, double d) {
        this(str, fArr, b0Var, d, 0.0f, 1.0f, -1);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(fArr, "primaries");
        Intrinsics.checkNotNullParameter(b0Var, "whitePoint");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(@org.jetbrains.annotations.C12579k java.lang.String r24, @org.jetbrains.annotations.C12579k float[] r25, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15137b0 r26, double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            r1 = r27
            java.lang.String r0 = "name"
            r15 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0023
            r5 = r3
            goto L_0x0024
        L_0x0023:
            r5 = r4
        L_0x0024:
            if (r5 == 0) goto L_0x0029
            androidx.compose.ui.graphics.colorspace.i r5 = f37366w
            goto L_0x002e
        L_0x0029:
            androidx.compose.ui.graphics.colorspace.p r5 = new androidx.compose.ui.graphics.colorspace.p
            r5.<init>(r1)
        L_0x002e:
            r18 = r5
            if (r0 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = r4
        L_0x0034:
            if (r3 == 0) goto L_0x0039
            androidx.compose.ui.graphics.colorspace.i r0 = f37366w
            goto L_0x003e
        L_0x0039:
            androidx.compose.ui.graphics.colorspace.q r0 = new androidx.compose.ui.graphics.colorspace.q
            r0.<init>(r1)
        L_0x003e:
            r19 = r0
            androidx.compose.ui.graphics.colorspace.a0 r20 = new androidx.compose.ui.graphics.colorspace.a0
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r13 = r21
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r27
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r29
            r9 = r30
            r10 = r20
            r11 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.b0, double, float, float, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(@C12579k Rgb rgb, @C12579k float[] fArr, @C12579k C15137b0 b0Var) {
        this(rgb.mo42586h(), rgb.f37371k, b0Var, fArr, rgb.f37374n, rgb.f37377q, rgb.f37368h, rgb.f37369i, rgb.f37370j, -1);
        Intrinsics.checkNotNullParameter(rgb, "colorSpace");
        Intrinsics.checkNotNullParameter(fArr, "transform");
        Intrinsics.checkNotNullParameter(b0Var, "whitePoint");
    }
}

package androidx.constraintlayout.compose;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.constraintlayout.core.state.C16772o;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C16778b;
import com.urbanairship.iam.C9168d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
public class Measurer implements C16778b.C16780b, C16624r {
    @C12579k

    /* renamed from: a */
    public String f41169a = "";
    @C12580l

    /* renamed from: b */
    public C16592e0 f41170b;
    @C12579k

    /* renamed from: c */
    public final C16798d f41171c;
    @C12579k

    /* renamed from: d */
    public final Map<C15557e0, C15611w0> f41172d;
    @C12579k

    /* renamed from: e */
    public final Map<C15557e0, Integer[]> f41173e;
    @C12579k

    /* renamed from: f */
    public final Map<C15557e0, C16772o> f41174f;

    /* renamed from: g */
    public C16479d f41175g;

    /* renamed from: h */
    public C15568h0 f41176h;
    @C12579k

    /* renamed from: i */
    public final C11677z f41177i;
    @C12579k

    /* renamed from: j */
    public final int[] f41178j;
    @C12579k

    /* renamed from: k */
    public final int[] f41179k;

    /* renamed from: l */
    public float f41180l;

    /* renamed from: m */
    public int f41181m;

    /* renamed from: n */
    public int f41182n;
    @C12579k

    /* renamed from: o */
    public ArrayList<C16620p> f41183o;

    /* renamed from: androidx.constraintlayout.compose.Measurer$a */
    public /* synthetic */ class C16579a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Measurer() {
        C16798d dVar = new C16798d(0, 0);
        dVar.mo49736U2(this);
        C11079d2 d2Var = C11079d2.f28267a;
        this.f41171c = dVar;
        this.f41172d = new LinkedHashMap();
        this.f41173e = new LinkedHashMap();
        this.f41174f = new LinkedHashMap();
        this.f41177i = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new Measurer$state$2(this));
        this.f41178j = new int[2];
        this.f41179k = new int[2];
        this.f41180l = Float.NaN;
        this.f41183o = new ArrayList<>();
    }

    /* renamed from: k */
    public static /* synthetic */ long m75306k(Measurer measurer, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = C15240j2.f37547b.mo42841a();
            }
            return measurer.mo48395j(str, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
    }

    /* renamed from: A */
    public final void mo48379A() {
        this.f41172d.clear();
        this.f41173e.clear();
        this.f41174f.clear();
    }

    /* renamed from: B */
    public final void mo48380B(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f41175g = dVar;
    }

    /* renamed from: C */
    public final void mo48381C(float f) {
        this.f41180l = f;
    }

    /* renamed from: D */
    public final void mo48382D(int i) {
        this.f41182n = i;
    }

    /* renamed from: E */
    public final void mo48383E(int i) {
        this.f41181m = i;
    }

    /* renamed from: F */
    public final void mo48384F(@C12580l C16592e0 e0Var) {
        this.f41170b = e0Var;
    }

    /* renamed from: G */
    public final void mo48385G(@C12579k C15568h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<set-?>");
        this.f41176h = h0Var;
    }

    /* renamed from: a */
    public void mo48386a() {
    }

    @C12579k
    /* renamed from: b */
    public String mo48387b(int i, int i2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "args");
        return C16613m0.m75578i(this.f41171c, mo48405u(), i, i2, str);
    }

    /* renamed from: c */
    public void mo48388c(@C12579k ConstraintWidget constraintWidget, @C12579k C16778b.C16779a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        Integer num;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        Integer num2;
        Integer num3;
        ConstraintWidget constraintWidget2 = constraintWidget;
        C16778b.C16779a aVar2 = aVar;
        Intrinsics.checkNotNullParameter(constraintWidget2, "constraintWidget");
        Intrinsics.checkNotNullParameter(aVar2, "measure");
        Object w = constraintWidget.mo49599w();
        if (w instanceof C15557e0) {
            if (ConstraintLayoutKt.f41138a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Measuring ");
                sb.append(C15594q.m69317a((C15557e0) w));
                sb.append(" with: ");
                sb.append(ConstraintLayoutKt.m75200F(constraintWidget));
                sb.append(10);
                sb.append(ConstraintLayoutKt.m75201G(aVar));
            }
            Integer[] numArr = this.f41173e.get(w);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar2.f42842a;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour2, "measure.horizontalBehavior");
            int i6 = aVar2.f42844c;
            int i7 = constraintWidget2.f42766w;
            int i8 = aVar2.f42851j;
            if (numArr == null || (num3 = numArr[1]) == null) {
                i = 0;
            } else {
                i = num3.intValue();
            }
            if (i == constraintWidget.mo49456D()) {
                z = true;
            } else {
                z = false;
            }
            boolean z10 = false;
            mo48407w(dimensionBehaviour2, i6, i7, i8, z, constraintWidget.mo49466G0(), C16476b.m74362p(mo48405u().mo48542H()), this.f41178j);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar2.f42843b;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour3, "measure.verticalBehavior");
            int i9 = aVar2.f42845d;
            int i10 = constraintWidget2.f42768x;
            int i11 = aVar2.f42851j;
            if (numArr == null || (num2 = numArr[0]) == null) {
                i2 = 0;
            } else {
                i2 = num2.intValue();
            }
            if (i2 == constraintWidget.mo49569m0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo48407w(dimensionBehaviour3, i9, i10, i11, z2, constraintWidget.mo49469H0(), C16476b.m74361o(mo48405u().mo48542H()), this.f41179k);
            int[] iArr = this.f41178j;
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = this.f41179k;
            long a = C16478c.m74376a(i12, i13, iArr2[0], iArr2[1]);
            int i14 = aVar2.f42851j;
            Integer num4 = null;
            if (!(i14 != C16778b.C16779a.f42840l && i14 != C16778b.C16779a.f42841m && aVar2.f42842a == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget2.f42766w == 0 && aVar2.f42843b == dimensionBehaviour && constraintWidget2.f42768x == 0)) {
                if (ConstraintLayoutKt.f41138a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Measuring ");
                    sb2.append(C15594q.m69317a((C15557e0) w));
                    sb2.append(" with ");
                    sb2.append(C16476b.m74369w(a));
                }
                C15557e0 e0Var = (C15557e0) w;
                C15611w0 t0 = e0Var.mo44324t0(a);
                mo48403s().put(w, t0);
                constraintWidget2.mo49488N1(false);
                if (ConstraintLayoutKt.f41138a) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(C15594q.m69317a(e0Var));
                    sb3.append(" is size ");
                    sb3.append(t0.mo44471K0());
                    sb3.append(' ');
                    sb3.append(t0.mo44468G0());
                }
                Integer valueOf = Integer.valueOf(t0.mo44471K0());
                Integer valueOf2 = Integer.valueOf(constraintWidget2.f42772z);
                if (valueOf2.intValue() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    valueOf2 = null;
                }
                Integer valueOf3 = Integer.valueOf(constraintWidget2.f42676A);
                if (valueOf3.intValue() > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    valueOf3 = null;
                }
                int intValue = ((Number) C11479u.m44346M(valueOf, valueOf2, valueOf3)).intValue();
                Integer valueOf4 = Integer.valueOf(t0.mo44468G0());
                Integer valueOf5 = Integer.valueOf(constraintWidget2.f42680C);
                if (valueOf5.intValue() > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    valueOf5 = null;
                }
                Integer valueOf6 = Integer.valueOf(constraintWidget2.f42682D);
                if (valueOf6.intValue() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    valueOf6 = null;
                }
                int intValue2 = ((Number) C11479u.m44346M(valueOf4, valueOf5, valueOf6)).intValue();
                if (intValue != t0.mo44471K0()) {
                    a = C16478c.m74376a(intValue, intValue, C16476b.m74363q(a), C16476b.m74361o(a));
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (intValue2 != t0.mo44468G0()) {
                    a = C16478c.m74376a(C16476b.m74364r(a), C16476b.m74362p(a), intValue2, intValue2);
                    z9 = true;
                }
                if (z9) {
                    if (ConstraintLayoutKt.f41138a) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Remeasuring coerced ");
                        sb4.append(C15594q.m69317a(e0Var));
                        sb4.append(" with ");
                        sb4.append(C16476b.m74369w(a));
                    }
                    mo48403s().put(w, e0Var.mo44324t0(a));
                    constraintWidget2.mo49488N1(false);
                }
            }
            C15611w0 w0Var = this.f41172d.get(w);
            if (w0Var == null) {
                num = null;
            } else {
                num = Integer.valueOf(w0Var.mo44471K0());
            }
            if (num == null) {
                i3 = constraintWidget.mo49569m0();
            } else {
                i3 = num.intValue();
            }
            aVar2.f42846e = i3;
            if (w0Var != null) {
                num4 = Integer.valueOf(w0Var.mo44468G0());
            }
            if (num4 == null) {
                i4 = constraintWidget.mo49456D();
            } else {
                i4 = num4.intValue();
            }
            aVar2.f42847f = i4;
            if (w0Var == null || !mo48405u().mo48543I(constraintWidget2)) {
                i5 = Integer.MIN_VALUE;
            } else {
                i5 = w0Var.mo44325A(AlignmentLineKt.m68885a());
            }
            if (i5 != Integer.MIN_VALUE) {
                z3 = true;
            } else {
                z3 = false;
            }
            aVar2.f42849h = z3;
            aVar2.f42848g = i5;
            Map<C15557e0, Integer[]> map = this.f41173e;
            Integer[] numArr2 = map.get(w);
            if (numArr2 == null) {
                z4 = true;
                numArr2 = new Integer[]{0, 0, Integer.MIN_VALUE};
                map.put(w, numArr2);
            } else {
                z4 = true;
            }
            mo48392g(numArr2, aVar2);
            if (!(aVar2.f42846e == aVar2.f42844c && aVar2.f42847f == aVar2.f42845d)) {
                z10 = z4;
            }
            aVar2.f42850i = z10;
        }
    }

    /* renamed from: d */
    public final void mo48389d(@C12580l C16592e0 e0Var) {
        this.f41170b = e0Var;
        if (e0Var != null) {
            e0Var.mo48484h(this.f41169a);
        }
    }

    /* renamed from: e */
    public final void mo48390e(long j) {
        Integer num;
        this.f41171c.mo49533c2(C16476b.m74362p(j));
        this.f41171c.mo49607y1(C16476b.m74361o(j));
        this.f41180l = Float.NaN;
        C16592e0 e0Var = this.f41170b;
        Integer num2 = null;
        float f = 1.0f;
        if (e0Var != null) {
            if (e0Var == null) {
                num = null;
            } else {
                num = Integer.valueOf(e0Var.mo48486p());
            }
            if (num == null || num.intValue() != Integer.MIN_VALUE) {
                C16592e0 e0Var2 = this.f41170b;
                Intrinsics.checkNotNull(e0Var2);
                int p = e0Var2.mo48486p();
                if (p > this.f41171c.mo49569m0()) {
                    this.f41180l = ((float) this.f41171c.mo49569m0()) / ((float) p);
                } else {
                    this.f41180l = 1.0f;
                }
                this.f41171c.mo49533c2(p);
            }
        }
        C16592e0 e0Var3 = this.f41170b;
        if (e0Var3 != null) {
            if (e0Var3 != null) {
                num2 = Integer.valueOf(e0Var3.mo48483g());
            }
            if (num2 == null || num2.intValue() != Integer.MIN_VALUE) {
                C16592e0 e0Var4 = this.f41170b;
                Intrinsics.checkNotNull(e0Var4);
                int g = e0Var4.mo48483g();
                if (Float.isNaN(this.f41180l)) {
                    this.f41180l = 1.0f;
                }
                if (g > this.f41171c.mo49456D()) {
                    f = ((float) this.f41171c.mo49456D()) / ((float) g);
                }
                if (f < this.f41180l) {
                    this.f41180l = f;
                }
                this.f41171c.mo49607y1(g);
            }
        }
        this.f41181m = this.f41171c.mo49569m0();
        this.f41182n = this.f41171c.mo49456D();
    }

    /* renamed from: f */
    public void mo48391f() {
        ConstraintWidget constraintWidget;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.f41171c.mo49569m0() + " ,");
        sb.append("  bottom:  " + this.f41171c.mo49456D() + " ,");
        sb.append(" } }");
        Iterator<ConstraintWidget> it = this.f41171c.mo49843l2().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object w = next.mo49599w();
            if (w instanceof C15557e0) {
                C16772o oVar = null;
                if (next.f42750o == null) {
                    C15557e0 e0Var = (C15557e0) w;
                    Object a = C15594q.m69317a(e0Var);
                    if (a == null) {
                        a = ConstraintLayoutTagKt.m75268a(e0Var);
                    }
                    if (a == null) {
                        str = null;
                    } else {
                        str = a.toString();
                    }
                    next.f42750o = str;
                }
                C16772o oVar2 = this.f41174f.get(w);
                if (!(oVar2 == null || (constraintWidget = oVar2.f42602a) == null)) {
                    oVar = constraintWidget.f42748n;
                }
                if (oVar != null) {
                    sb.append(' ' + next.f42750o + ": {");
                    sb.append(" interpolated : ");
                    oVar.mo49410t(sb, true);
                    sb.append("}, ");
                }
            } else if (next instanceof C16801f) {
                sb.append(' ' + next.f42750o + ": {");
                C16801f fVar = (C16801f) next;
                if (fVar.mo49795m2() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + fVar.mo49575o0() + ", top: " + fVar.mo49578p0() + ", right: " + (fVar.mo49575o0() + fVar.mo49569m0()) + ", bottom: " + (fVar.mo49578p0() + fVar.mo49456D()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "json.toString()");
        this.f41169a = sb2;
        C16592e0 e0Var2 = this.f41170b;
        if (e0Var2 != null) {
            e0Var2.mo48484h(sb2);
        }
    }

    /* renamed from: g */
    public final void mo48392g(Integer[] numArr, C16778b.C16779a aVar) {
        numArr[0] = Integer.valueOf(aVar.f42846e);
        numArr[1] = Integer.valueOf(aVar.f42847f);
        numArr[2] = Integer.valueOf(aVar.f42848g);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.compose.runtime.C8540g
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48393h(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = -186576797(0xfffffffff4e11063, float:-1.4265126E32)
            r2 = r23
            androidx.compose.runtime.o r1 = r2.mo15009o(r1)
            java.util.ArrayList<androidx.constraintlayout.compose.p> r2 = r0.f41183o
            java.util.Iterator r21 = r2.iterator()
        L_0x0011:
            boolean r2 = r21.hasNext()
            if (r2 == 0) goto L_0x029d
            java.lang.Object r2 = r21.next()
            androidx.constraintlayout.compose.p r2 = (androidx.constraintlayout.compose.C16620p) r2
            java.lang.String r3 = r2.mo48556f()
            androidx.constraintlayout.compose.q r4 = androidx.constraintlayout.compose.C16622q.f41299a
            java.util.HashMap r4 = r4.mo48568b()
            java.lang.String r5 = r2.mo48558h()
            java.lang.Object r4 = r4.get(r5)
            kotlin.jvm.functions.r r4 = (kotlin.jvm.functions.C11306r) r4
            if (r4 == 0) goto L_0x004a
            r5 = -186576600(0xfffffffff4e11128, float:-1.4265317E32)
            r1.mo14918M(r5)
            java.util.HashMap r2 = r2.mo48557g()
            r5 = 64
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.invoke(r3, r2, r1, r5)
            r1.mo15002m0()
            goto L_0x0011
        L_0x004a:
            r4 = -186576534(0xfffffffff4e1116a, float:-1.4265381E32)
            r1.mo14918M(r4)
            java.lang.String r4 = r2.mo48558h()
            int r5 = r4.hashCode()
            r6 = 8
            java.lang.String r7 = "backgroundColor"
            r8 = 0
            r9 = 2
            java.lang.String r10 = "text"
            r11 = 0
            switch(r5) {
                case -1377687758: goto L_0x021e;
                case -1031434259: goto L_0x01dc;
                case 97739: goto L_0x00d7;
                case 3556653: goto L_0x0096;
                case 100313435: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x028f
        L_0x0066:
            java.lang.String r2 = "image"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0070
            goto L_0x028f
        L_0x0070:
            r2 = -186574667(0xfffffffff4e118b5, float:-1.4267186E32)
            r1.mo14918M(r2)
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r4 = androidx.constraintlayout.compose.ConstraintLayoutTagKt.m75271d(r2, r3, r11, r9, r11)
            r2 = 17301567(0x108003f, float:2.4979432E-38)
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.p004ui.res.C16015f.m71849d(r2, r1, r8)
            java.lang.String r3 = "Placeholder Image"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 56
            r11 = 120(0x78, float:1.68E-43)
            r9 = r1
            androidx.compose.foundation.ImageKt.m8967b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.mo15002m0()
            goto L_0x0298
        L_0x0096:
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x009e
            goto L_0x028f
        L_0x009e:
            r4 = -186575281(0xfffffffff4e1164f, float:-1.4266593E32)
            r1.mo14918M(r4)
            java.util.HashMap r4 = r2.mo48557g()
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00b1
            r4 = r10
        L_0x00b1:
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r3 = androidx.constraintlayout.compose.ConstraintLayoutTagKt.m75271d(r5, r3, r11, r9, r11)
            java.util.HashMap r2 = r2.mo48557g()
            androidx.compose.ui.text.p0 r5 = r0.mo48406v(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 32768(0x8000, float:4.5918E-41)
            r11 = 120(0x78, float:1.68E-43)
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            androidx.compose.foundation.text.BasicTextKt.m12208c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.mo15002m0()
            goto L_0x0298
        L_0x00d7:
            java.lang.String r5 = "box"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00e1
            goto L_0x028f
        L_0x00e1:
            r4 = -186575900(0xfffffffff4e113e4, float:-1.4265994E32)
            r1.mo14918M(r4)
            java.util.HashMap r4 = r2.mo48557g()
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00f5
            java.lang.String r4 = ""
        L_0x00f5:
            java.util.HashMap r5 = r2.mo48557g()
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            androidx.compose.ui.graphics.j2$a r7 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r12 = r7.mo42847m()
            long r15 = r0.mo48395j(r5, r12)
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r14 = androidx.constraintlayout.compose.ConstraintLayoutTagKt.m75271d(r5, r3, r11, r9, r11)
            r17 = 0
            r18 = 2
            r19 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.BackgroundKt.m8825d(r14, r15, r17, r18, r19)
            r7 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r1.mo14918M(r7)
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r7 = r7.mo17061C()
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.BoxKt.m9849k(r7, r8, r1, r8)
            r9 = 1376089335(0x520574f7, float:1.43298249E11)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x0158
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0158:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x0165
            r1.mo14947W(r12)
            goto L_0x0168
        L_0x0165:
            r1.mo14888A()
        L_0x0168:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r13)
            kotlin.jvm.functions.p r7 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r7)
            kotlin.jvm.functions.p r7 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r7)
            r1.mo14972e()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r7 = androidx.compose.runtime.C8684u1.m31905a(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.invoke(r7, r1, r8)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r3)
            r3 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r1.mo14918M(r3)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            float r3 = (float) r6
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r5, r3)
            java.util.HashMap r2 = r2.mo48557g()
            androidx.compose.ui.text.p0 r5 = r0.mo48406v(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 32816(0x8030, float:4.5985E-41)
            r11 = 120(0x78, float:1.68E-43)
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            androidx.compose.foundation.text.BasicTextKt.m12208c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo15002m0()
            goto L_0x0298
        L_0x01dc:
            java.lang.String r5 = "textfield"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01e6
            goto L_0x028f
        L_0x01e6:
            r4 = -186575007(0xfffffffff4e11761, float:-1.4266858E32)
            r1.mo14918M(r4)
            java.util.HashMap r2 = r2.mo48557g()
            java.lang.Object r2 = r2.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x01f9
            r2 = r10
        L_0x01f9:
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r4 = androidx.constraintlayout.compose.ConstraintLayoutTagKt.m75271d(r4, r3, r11, r9, r11)
            androidx.constraintlayout.compose.Measurer$createDesignElements$2 r3 = androidx.constraintlayout.compose.Measurer$createDesignElements$2.f41184f
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 32760(0x7ff8, float:4.5907E-41)
            r17 = r1
            androidx.compose.foundation.text.BasicTextFieldKt.m12191d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.mo15002m0()
            goto L_0x0298
        L_0x021e:
            java.lang.String r5 = "button"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0227
            goto L_0x028f
        L_0x0227:
            r4 = -186576462(0xfffffffff4e111b2, float:-1.426545E32)
            r1.mo14918M(r4)
            java.util.HashMap r4 = r2.mo48557g()
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x023a
            r4 = r10
        L_0x023a:
            java.util.HashMap r5 = r2.mo48557g()
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            androidx.compose.ui.graphics.j2$a r7 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r7 = r7.mo42847m()
            long r13 = r0.mo48395j(r5, r7)
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r3 = androidx.constraintlayout.compose.ConstraintLayoutTagKt.m75271d(r5, r3, r11, r9, r11)
            r5 = 20
            androidx.compose.foundation.shape.n r5 = androidx.compose.foundation.shape.C2694o.m12161c(r5)
            androidx.compose.ui.m r12 = androidx.compose.p004ui.draw.C8744d.m32514a(r3, r5)
            r15 = 0
            r16 = 2
            r17 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.BackgroundKt.m8825d(r12, r13, r15, r16, r17)
            float r5 = (float) r6
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r3, r5)
            java.util.HashMap r2 = r2.mo48557g()
            androidx.compose.ui.text.p0 r5 = r0.mo48406v(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 32768(0x8000, float:4.5918E-41)
            r11 = 120(0x78, float:1.68E-43)
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            androidx.compose.foundation.text.BasicTextKt.m12208c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.mo15002m0()
            goto L_0x0298
        L_0x028f:
            r2 = -186574342(0xfffffffff4e119fa, float:-1.4267501E32)
            r1.mo14918M(r2)
            r1.mo15002m0()
        L_0x0298:
            r1.mo15002m0()
            goto L_0x0011
        L_0x029d:
            androidx.compose.runtime.t1 r1 = r1.mo15020s()
            if (r1 != 0) goto L_0x02a4
            goto L_0x02ae
        L_0x02a4:
            androidx.constraintlayout.compose.Measurer$createDesignElements$3 r2 = new androidx.constraintlayout.compose.Measurer$createDesignElements$3
            r3 = r24
            r2.<init>(r0, r3)
            r1.mo15202a(r2)
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer.mo48393h(androidx.compose.runtime.o, int):void");
    }

    @C8540g
    /* renamed from: i */
    public final void mo48394i(@C12579k C2362h hVar, float f, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        C8592o o = oVar.mo15009o(-756996390);
        CanvasKt.m8873b(hVar.mo7702e(C8767m.f23478j), new Measurer$drawDebugBounds$1(this, f), o, 0);
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new Measurer$drawDebugBounds$2(this, hVar, f, i));
        }
    }

    /* renamed from: j */
    public final long mo48395j(String str, long j) {
        if (str != null && StringsKt__StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            if (substring.length() == 6) {
                substring = Intrinsics.stringPlus("FF", substring);
            }
            try {
                return C15258l2.m66177b((int) Long.parseLong(substring, 16));
            } catch (Exception unused) {
            }
        }
        return j;
    }

    @C12579k
    /* renamed from: l */
    public final C16479d mo48396l() {
        C16479d dVar = this.f41175g;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("density");
        throw null;
    }

    /* renamed from: m */
    public final float mo48397m() {
        return this.f41180l;
    }

    @C12579k
    /* renamed from: n */
    public final Map<C15557e0, C16772o> mo48398n() {
        return this.f41174f;
    }

    /* renamed from: o */
    public final int mo48399o() {
        return this.f41182n;
    }

    /* renamed from: p */
    public final int mo48400p() {
        return this.f41181m;
    }

    @C12580l
    /* renamed from: q */
    public final C16592e0 mo48401q() {
        return this.f41170b;
    }

    @C12579k
    /* renamed from: r */
    public final C15568h0 mo48402r() {
        C15568h0 h0Var = this.f41176h;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("measureScope");
        throw null;
    }

    @C12579k
    /* renamed from: s */
    public final Map<C15557e0, C15611w0> mo48403s() {
        return this.f41172d;
    }

    @C12579k
    /* renamed from: t */
    public final C16798d mo48404t() {
        return this.f41171c;
    }

    @C12579k
    /* renamed from: u */
    public final C16611l0 mo48405u() {
        return (C16611l0) this.f41177i.getValue();
    }

    /* renamed from: v */
    public final C16361p0 mo48406v(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = hashMap;
        String str = hashMap2.get(C9168d0.f24889w);
        long b = C16504t.f40903b.mo47903b();
        if (str != null) {
            b = C16506u.m74711l(Float.parseFloat(str));
        }
        return new C16361p0(m75306k(this, hashMap2.get("color"), 0, 2, (Object) null), b, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, (C16432i) null, (C16436k) null, 0, (C16442o) null, 262140, (DefaultConstructorMarker) null);
    }

    /* renamed from: w */
    public final boolean mo48407w(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        boolean z3;
        int i5;
        int i6 = C16579a.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i6 == 1) {
            iArr[0] = i;
            iArr[1] = i;
        } else if (i6 == 2) {
            iArr[0] = 0;
            iArr[1] = i4;
            return true;
        } else if (i6 == 3) {
            if (ConstraintLayoutKt.f41138a) {
                Intrinsics.stringPlus("Measure strategy ", Integer.valueOf(i3));
                Intrinsics.stringPlus("DW ", Integer.valueOf(i2));
                Intrinsics.stringPlus("ODR ", Boolean.valueOf(z));
                Intrinsics.stringPlus("IRH ", Boolean.valueOf(z2));
            }
            if (z2 || ((i3 == C16778b.C16779a.f42840l || i3 == C16778b.C16779a.f42841m) && (i3 == C16778b.C16779a.f42841m || i2 != 1 || z))) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ConstraintLayoutKt.f41138a) {
                Intrinsics.stringPlus("UD ", Boolean.valueOf(z3));
            }
            if (z3) {
                i5 = i;
            } else {
                i5 = 0;
            }
            iArr[0] = i5;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            if (!z3) {
                return true;
            }
        } else if (i6 == 4) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
        return false;
    }

    /* renamed from: x */
    public final void mo48408x(@C12579k C16602j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "constraintSet");
        if (jVar instanceof C16588c0) {
            ((C16588c0) jVar).mo48463J(this.f41183o);
        }
    }

    /* renamed from: y */
    public final void mo48409y(@C12579k C15611w0.C15612a aVar, @C12579k List<? extends C15557e0> list) {
        LayoutInfoFlags layoutInfoFlags;
        float f;
        List<? extends C15557e0> list2 = list;
        C15611w0.C15612a aVar2 = aVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        if (this.f41174f.isEmpty()) {
            Iterator<ConstraintWidget> it = this.f41171c.mo49843l2().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                Object w = next.mo49599w();
                if (w instanceof C15557e0) {
                    this.f41174f.put(w, new C16772o(next.f42748n.mo49391B()));
                }
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                C15557e0 e0Var = (C15557e0) list2.get(i);
                C16772o oVar = mo48398n().get(e0Var);
                if (oVar != null) {
                    if (oVar.mo49405o()) {
                        C16772o oVar2 = mo48398n().get(e0Var);
                        Intrinsics.checkNotNull(oVar2);
                        int i3 = oVar2.f42603b;
                        C16772o oVar3 = mo48398n().get(e0Var);
                        Intrinsics.checkNotNull(oVar3);
                        int i4 = oVar3.f42604c;
                        C15611w0 w0Var = mo48403s().get(e0Var);
                        if (w0Var != null) {
                            C15611w0.C15612a.m69413r(aVar, w0Var, C16496n.m74593a(i3, i4), 0.0f, 2, (Object) null);
                        }
                    } else {
                        Measurer$performLayout$1$layerBlock$1 measurer$performLayout$1$layerBlock$1 = new Measurer$performLayout$1$layerBlock$1(oVar);
                        C16772o oVar4 = mo48398n().get(e0Var);
                        Intrinsics.checkNotNull(oVar4);
                        int i5 = oVar4.f42603b;
                        C16772o oVar5 = mo48398n().get(e0Var);
                        Intrinsics.checkNotNull(oVar5);
                        int i6 = oVar5.f42604c;
                        if (Float.isNaN(oVar.f42614m)) {
                            f = 0.0f;
                        } else {
                            f = oVar.f42614m;
                        }
                        float f2 = f;
                        C15611w0 w0Var2 = mo48403s().get(e0Var);
                        if (w0Var2 != null) {
                            aVar.mo44476C(w0Var2, i5, i6, f2, measurer$performLayout$1$layerBlock$1);
                        }
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                } else {
                    return;
                }
            }
        }
        C16592e0 e0Var2 = this.f41170b;
        if (e0Var2 == null) {
            layoutInfoFlags = null;
        } else {
            layoutInfoFlags = e0Var2.mo48485j();
        }
        if (layoutInfoFlags == LayoutInfoFlags.BOUNDS) {
            mo48391f();
        }
    }

    /* renamed from: z */
    public final long mo48410z(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16602j jVar, @C12579k List<? extends C15557e0> list, int i, @C12579k C15568h0 h0Var) {
        Dimension dimension;
        Dimension dimension2;
        Integer num;
        Integer num2;
        C15557e0 e0Var;
        Object obj;
        String obj2;
        LayoutDirection layoutDirection2 = layoutDirection;
        C16602j jVar2 = jVar;
        List<? extends C15557e0> list2 = list;
        C15568h0 h0Var2 = h0Var;
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        Intrinsics.checkNotNullParameter(jVar2, "constraintSet");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Intrinsics.checkNotNullParameter(h0Var2, "measureScope");
        mo48380B(h0Var2);
        mo48385G(h0Var2);
        C16611l0 u = mo48405u();
        if (C16476b.m74360n(j)) {
            dimension = Dimension.m76548a(C16476b.m74362p(j));
        } else {
            dimension = Dimension.m76556i().mo49295q(C16476b.m74364r(j));
        }
        u.mo49303B(dimension);
        C16611l0 u2 = mo48405u();
        if (C16476b.m74358l(j)) {
            dimension2 = Dimension.m76548a(C16476b.m74361o(j));
        } else {
            dimension2 = Dimension.m76556i().mo49295q(C16476b.m74363q(j));
        }
        u2.mo49314l(dimension2);
        long j2 = j;
        mo48405u().mo48545K(j);
        mo48405u().mo48544J(layoutDirection2);
        mo48379A();
        if (jVar.mo48356c(list)) {
            mo48405u().mo48547s();
            jVar2.mo48354a(mo48405u(), list2);
            ConstraintLayoutKt.m75225x(mo48405u(), list2);
            mo48405u().mo49304a(this.f41171c);
        } else {
            ConstraintLayoutKt.m75225x(mo48405u(), list2);
        }
        mo48390e(j);
        this.f41171c.mo49742a3();
        if (ConstraintLayoutKt.f41138a) {
            this.f41171c.mo49560j1("ConstraintLayout");
            ArrayList<ConstraintWidget> l2 = this.f41171c.mo49843l2();
            Intrinsics.checkNotNullExpressionValue(l2, "root.children");
            for (ConstraintWidget constraintWidget : l2) {
                Object w = constraintWidget.mo49599w();
                if (w instanceof C15557e0) {
                    e0Var = (C15557e0) w;
                } else {
                    e0Var = null;
                }
                if (e0Var == null) {
                    obj = null;
                } else {
                    obj = C15594q.m69317a(e0Var);
                }
                String str = "NOTAG";
                if (!(obj == null || (obj2 = obj.toString()) == null)) {
                    str = obj2;
                }
                constraintWidget.mo49560j1(str);
            }
            Intrinsics.stringPlus("ConstraintLayout is asked to measure with ", C16476b.m74369w(j));
            String unused = ConstraintLayoutKt.m75200F(this.f41171c);
            Iterator<ConstraintWidget> it = this.f41171c.mo49843l2().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "child");
                String unused2 = ConstraintLayoutKt.m75200F(next);
            }
        }
        this.f41171c.mo49737V2(i);
        C16798d dVar = this.f41171c;
        dVar.mo49733Q2(dVar.mo49724H2(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator<ConstraintWidget> it2 = this.f41171c.mo49843l2().iterator();
        while (it2.hasNext()) {
            ConstraintWidget next2 = it2.next();
            Object w2 = next2.mo49599w();
            if (w2 instanceof C15557e0) {
                C15611w0 w0Var = this.f41172d.get(w2);
                if (w0Var == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(w0Var.mo44471K0());
                }
                if (w0Var == null) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(w0Var.mo44468G0());
                }
                int m0 = next2.mo49569m0();
                if (num != null && m0 == num.intValue()) {
                    int D = next2.mo49456D();
                    if (num2 != null && D == num2.intValue()) {
                    }
                }
                if (ConstraintLayoutKt.f41138a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Final measurement for ");
                    sb.append(C15594q.m69317a((C15557e0) w2));
                    sb.append(" to confirm size ");
                    sb.append(next2.mo49569m0());
                    sb.append(' ');
                    sb.append(next2.mo49456D());
                }
                mo48403s().put(w2, ((C15557e0) w2).mo44324t0(C16476b.f40850b.mo47810c(next2.mo49569m0(), next2.mo49456D())));
            }
        }
        if (ConstraintLayoutKt.f41138a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ConstraintLayout is at the end ");
            sb2.append(this.f41171c.mo49569m0());
            sb2.append(' ');
            sb2.append(this.f41171c.mo49456D());
        }
        return C16502r.m74668a(this.f41171c.mo49569m0(), this.f41171c.mo49456D());
    }
}

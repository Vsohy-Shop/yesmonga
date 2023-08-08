package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15208f0;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.constraintlayout.core.state.C16769n;
import androidx.constraintlayout.core.state.C16772o;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
public final class MotionMeasurer extends Measurer {

    /* renamed from: p */
    public float f41197p;
    @C12579k

    /* renamed from: q */
    public final C16769n f41198q = new C16769n();

    /* renamed from: I */
    public final void mo48426I() {
        this.f41198q.mo49377t();
        mo48398n().clear();
    }

    @C8540g
    /* renamed from: J */
    public final void mo48427J(@C12579k C2362h hVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        C8592o o = oVar.mo15009o(436942847);
        CanvasKt.m8873b(hVar.mo7702e(C8767m.f23478j), new MotionMeasurer$drawDebug$1(this), o, 0);
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MotionMeasurer$drawDebug$2(this, hVar, i));
        }
    }

    /* renamed from: K */
    public final void mo48428K(C15187e eVar, C16772o oVar, C15242j3 j3Var, long j) {
        float f;
        C16772o oVar2 = oVar;
        if (oVar.mo49405o()) {
            C15187e.m65710e5(eVar, j, C15096g.m64898a((float) oVar2.f42603b, (float) oVar2.f42604c), C15106n.m65033a((float) oVar.mo49394E(), (float) oVar.mo49404l()), 0.0f, new C15198m(3.0f, 0.0f, 0, 0, j3Var, 14, (DefaultConstructorMarker) null), (C15249k2) null, 0, 104, (Object) null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(oVar2.f42611j)) {
            matrix.preRotate(oVar2.f42611j, oVar.mo49397e(), oVar.mo49398f());
        }
        float f2 = 1.0f;
        if (Float.isNaN(oVar2.f42615n)) {
            f = 1.0f;
        } else {
            f = oVar2.f42615n;
        }
        if (!Float.isNaN(oVar2.f42616o)) {
            f2 = oVar2.f42616o;
        }
        matrix.preScale(f, f2, oVar.mo49397e(), oVar.mo49398f());
        int i = oVar2.f42603b;
        int i2 = oVar2.f42604c;
        int i3 = oVar2.f42605d;
        int i4 = oVar2.f42606e;
        float[] fArr = {(float) i, (float) i2, (float) i3, (float) i2, (float) i3, (float) i4, (float) i, (float) i4};
        matrix.mapPoints(fArr);
        C15187e eVar2 = eVar;
        long j2 = j;
        C15242j3 j3Var2 = j3Var;
        C15187e.m65695K2(eVar2, j2, C15096g.m64898a(fArr[0], fArr[1]), C15096g.m64898a(fArr[2], fArr[3]), 3.0f, 0, j3Var2, 0.0f, (C15249k2) null, 0, 464, (Object) null);
        C15187e.m65695K2(eVar2, j2, C15096g.m64898a(fArr[2], fArr[3]), C15096g.m64898a(fArr[4], fArr[5]), 3.0f, 0, j3Var2, 0.0f, (C15249k2) null, 0, 464, (Object) null);
        C15187e eVar3 = eVar;
        long j3 = j;
        C15242j3 j3Var3 = j3Var;
        C15187e.m65695K2(eVar3, j3, C15096g.m64898a(fArr[4], fArr[5]), C15096g.m64898a(fArr[6], fArr[7]), 3.0f, 0, j3Var3, 0.0f, (C15249k2) null, 0, 464, (Object) null);
        C15187e.m65695K2(eVar3, j3, C15096g.m64898a(fArr[6], fArr[7]), C15096g.m64898a(fArr[0], fArr[1]), 3.0f, 0, j3Var3, 0.0f, (C15249k2) null, 0, 464, (Object) null);
    }

    /* renamed from: L */
    public final void mo48429L(C15187e eVar, float f, float f2, C16772o oVar, C16772o oVar2, C15242j3 j3Var, long j) {
        float f3 = f;
        float f4 = f2;
        C16772o oVar3 = oVar;
        C15187e eVar2 = eVar;
        C15242j3 j3Var2 = j3Var;
        long j2 = j;
        mo48428K(eVar2, oVar, j3Var2, j2);
        mo48428K(eVar2, oVar2, j3Var2, j2);
        int H = this.f41198q.mo49360H(oVar3);
        new C16599h0(23.0f).mo48518a(C15208f0.m65929d(eVar.mo42683q5().mo42705c()), this.f41198q.mo49359G(oVar3.f42602a.f42750o), 1000, 1, (int) f3, (int) f4);
        if (H != 0) {
            float[] fArr = new float[H];
            float[] fArr2 = new float[H];
            float[] fArr3 = new float[H];
            this.f41198q.mo49379v(oVar3, fArr, fArr2, fArr3);
            oVar.mo49397e();
            oVar.mo49398f();
            int i = H - 1;
            if (i >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    float f5 = fArr3[i2] / 100.0f;
                    float f6 = ((float) 1) - f5;
                    float E = (((float) oVar.mo49394E()) * f6) + (((float) oVar2.mo49394E()) * f5);
                    float l = (f6 * ((float) oVar.mo49404l())) + (f5 * ((float) oVar2.mo49404l()));
                    float f7 = (fArr[i2] * f3) + (E / 2.0f);
                    float f8 = (fArr2[i2] * f4) + (l / 2.0f);
                    C15231i3 a = C15318t0.m66550a();
                    a.mo42815p(f7 - 20.0f, f8);
                    a.mo42823w(f7, f8 + 20.0f);
                    a.mo42823w(f7 + 20.0f, f8);
                    a.mo42823w(f7, f8 - 20.0f);
                    a.close();
                    C15187e.m65698O1(eVar, a, j, 1.0f, new C15198m(3.0f, 0.0f, 0, 0, (C15242j3) null, 30, (DefaultConstructorMarker) null), (C15249k2) null, 0, 48, (Object) null);
                    if (i2 != i) {
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: M */
    public final void mo48430M(StringBuilder sb, float[] fArr, int[] iArr, int[] iArr2, int i) {
        if (i != 0) {
            sb.append("keyTypes : [");
            int i2 = 0;
            if (i > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    int i5 = iArr[i3];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(' ');
                    sb2.append(i5);
                    sb2.append(',');
                    sb.append(sb2.toString());
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                }
            }
            sb.append("],\n");
            sb.append("keyPos : [");
            int i6 = i * 2;
            if (i6 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    float f = fArr[i7];
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(' ');
                    sb3.append(f);
                    sb3.append(',');
                    sb.append(sb3.toString());
                    if (i8 >= i6) {
                        break;
                    }
                    i7 = i8;
                }
            }
            sb.append("],\n ");
            sb.append("keyFrames : [");
            if (i > 0) {
                while (true) {
                    int i9 = i2 + 1;
                    int i10 = iArr2[i2];
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(' ');
                    sb4.append(i10);
                    sb4.append(',');
                    sb.append(sb4.toString());
                    if (i9 >= i) {
                        break;
                    }
                    i2 = i9;
                }
            }
            sb.append("],\n ");
        }
    }

    /* renamed from: N */
    public final void mo48431N(@C12579k StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "json");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + mo48404t().mo49569m0() + " ,");
        sb.append("  bottom:  " + mo48404t().mo49456D() + " ,");
        sb.append(" } }");
    }

    /* renamed from: O */
    public final long mo48432O(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        if (!this.f41198q.mo49378u(str)) {
            return C15240j2.f37547b.mo42841a();
        }
        this.f41198q.mo49367O(mo48404t().mo49569m0(), mo48404t().mo49456D(), this.f41197p);
        return C15258l2.m66177b(this.f41198q.mo49356C(str).mo49401i(str2));
    }

    /* renamed from: P */
    public final float mo48433P(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        if (!this.f41198q.mo49378u(str)) {
            return 0.0f;
        }
        C16772o K = this.f41198q.mo49363K(str);
        C16772o A = this.f41198q.mo49354A(str);
        float j = K.mo49402j(str2);
        float j2 = A.mo49402j(str2);
        float f = this.f41197p;
        return ((1.0f - f) * j) + (f * j2);
    }

    /* renamed from: Q */
    public final float mo48434Q() {
        return this.f41197p;
    }

    @C12579k
    /* renamed from: R */
    public final C16769n mo48435R() {
        return this.f41198q;
    }

    /* renamed from: S */
    public final void mo48436S(@C12579k C16602j jVar, @C12579k C16602j jVar2, @C12580l C16615n0 n0Var, float f) {
        Intrinsics.checkNotNullParameter(jVar, "start");
        Intrinsics.checkNotNullParameter(jVar2, "end");
        mo48426I();
        jVar.mo48355b(this.f41198q, 0);
        jVar2.mo48355b(this.f41198q, 1);
        this.f41198q.mo49367O(0, 0, f);
        if (n0Var != null) {
            n0Var.mo48418b(this.f41198q, 0);
        }
    }

    /* renamed from: T */
    public final void mo48437T(int i, C16602j jVar, List<? extends C15557e0> list, long j) {
        C15557e0 e0Var;
        Object obj;
        String str;
        C15557e0 e0Var2;
        Object obj2;
        String obj3;
        mo48405u().mo48547s();
        jVar.mo48354a(mo48405u(), list);
        mo48405u().mo49304a(mo48404t());
        ArrayList<ConstraintWidget> l2 = mo48404t().mo49843l2();
        Intrinsics.checkNotNullExpressionValue(l2, "root.children");
        int size = l2.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                l2.get(i2).mo49544f1(true);
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        mo48390e(j);
        mo48404t().mo49742a3();
        if (MotionLayoutKt.f41189a) {
            mo48404t().mo49560j1("ConstraintLayout");
            ArrayList<ConstraintWidget> l22 = mo48404t().mo49843l2();
            Intrinsics.checkNotNullExpressionValue(l22, "root.children");
            for (ConstraintWidget constraintWidget : l22) {
                Object w = constraintWidget.mo49599w();
                if (w instanceof C15557e0) {
                    e0Var2 = (C15557e0) w;
                } else {
                    e0Var2 = null;
                }
                if (e0Var2 == null) {
                    obj2 = null;
                } else {
                    obj2 = C15594q.m69317a(e0Var2);
                }
                String str2 = "NOTAG";
                if (!(obj2 == null || (obj3 = obj2.toString()) == null)) {
                    str2 = obj3;
                }
                constraintWidget.mo49560j1(str2);
            }
        }
        ArrayList<ConstraintWidget> l23 = mo48404t().mo49843l2();
        Intrinsics.checkNotNullExpressionValue(l23, "root.children");
        for (ConstraintWidget constraintWidget2 : l23) {
            Object w2 = constraintWidget2.mo49599w();
            if (w2 instanceof C15557e0) {
                e0Var = (C15557e0) w2;
            } else {
                e0Var = null;
            }
            if (e0Var == null) {
                obj = null;
            } else {
                obj = C15594q.m69317a(e0Var);
            }
            if (obj == null) {
                if (e0Var == null) {
                    obj = null;
                } else {
                    obj = ConstraintLayoutTagKt.m75268a(e0Var);
                }
            }
            if (obj == null) {
                str = null;
            } else {
                str = obj.toString();
            }
            constraintWidget2.f42750o = str;
        }
        mo48404t().mo49737V2(i);
        mo48404t().mo49733Q2(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3 A[SYNTHETIC] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48438U(long r8) {
        /*
            r7 = this;
            androidx.constraintlayout.core.state.n r0 = r7.f41198q
            boolean r0 = r0.mo49368P()
            r1 = 1
            if (r0 != 0) goto L_0x00a3
            java.util.Map r0 = r7.mo48398n()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0015
            goto L_0x00a3
        L_0x0015:
            boolean r0 = androidx.compose.p004ui.unit.C16476b.m74358l(r8)
            if (r0 == 0) goto L_0x0029
            androidx.constraintlayout.compose.l0 r0 = r7.mo48405u()
            int r2 = androidx.compose.p004ui.unit.C16476b.m74361o(r8)
            boolean r0 = r0.mo49321t(r2)
            if (r0 == 0) goto L_0x003d
        L_0x0029:
            boolean r0 = androidx.compose.p004ui.unit.C16476b.m74360n(r8)
            if (r0 == 0) goto L_0x003e
            androidx.constraintlayout.compose.l0 r0 = r7.mo48405u()
            int r8 = androidx.compose.p004ui.unit.C16476b.m74362p(r8)
            boolean r8 = r0.mo49322u(r8)
            if (r8 != 0) goto L_0x003e
        L_0x003d:
            return r1
        L_0x003e:
            androidx.constraintlayout.core.widgets.d r8 = r7.mo48404t()
            java.util.ArrayList r8 = r8.mo49843l2()
            java.lang.String r9 = "root.children"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            int r9 = r8.size()
            int r9 = r9 + -1
            r0 = 0
            if (r9 < 0) goto L_0x00a2
            r2 = r0
        L_0x0055:
            int r3 = r2 + 1
            java.lang.Object r2 = r8.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            java.lang.Object r4 = r2.mo49599w()
            boolean r5 = r4 instanceof androidx.compose.p004ui.layout.C15557e0
            if (r5 == 0) goto L_0x0068
            androidx.compose.ui.layout.e0 r4 = (androidx.compose.p004ui.layout.C15557e0) r4
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r4 != 0) goto L_0x006d
        L_0x006b:
            r2 = r0
            goto L_0x009a
        L_0x006d:
            androidx.constraintlayout.core.state.n r5 = r7.mo48435R()
            androidx.constraintlayout.core.state.o r2 = r5.mo49355B(r2)
            if (r2 != 0) goto L_0x0078
            goto L_0x006b
        L_0x0078:
            java.util.Map r5 = r7.mo48403s()
            java.lang.Object r4 = r5.get(r4)
            androidx.compose.ui.layout.w0 r4 = (androidx.compose.p004ui.layout.C15611w0) r4
            if (r4 != 0) goto L_0x0085
            goto L_0x006b
        L_0x0085:
            int r5 = r4.mo44471K0()
            int r4 = r4.mo44468G0()
            int r6 = r2.mo49394E()
            if (r5 != r6) goto L_0x0099
            int r2 = r2.mo49404l()
            if (r4 == r2) goto L_0x006b
        L_0x0099:
            r2 = r1
        L_0x009a:
            if (r2 == 0) goto L_0x009d
            goto L_0x00a3
        L_0x009d:
            if (r3 <= r9) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r2 = r3
            goto L_0x0055
        L_0x00a2:
            r1 = r0
        L_0x00a3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionMeasurer.mo48438U(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.intValue() != Integer.MIN_VALUE) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r10 != false) goto L_0x006e;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo48439V(long r13, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.LayoutDirection r15, @org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16602j r16, @org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16602j r17, @org.jetbrains.annotations.C12580l androidx.constraintlayout.compose.C16615n0 r18, @org.jetbrains.annotations.C12579k java.util.List<? extends androidx.compose.p004ui.layout.C15557e0> r19, int r20, float r21, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15568h0 r22) {
        /*
            r12 = this;
            r11 = r12
            r0 = r22
            java.lang.String r1 = "layoutDirection"
            r3 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "constraintSetStart"
            r4 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.lang.String r1 = "constraintSetEnd"
            r5 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r1 = "measurables"
            r7 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "measureScope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r12.mo48380B(r0)
            r12.mo48385G(r0)
            boolean r10 = r12.mo48438U(r13)
            float r0 = r11.f41197p
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 == 0) goto L_0x006e
            androidx.constraintlayout.compose.e0 r0 = r12.mo48401q()
            r1 = 0
            if (r0 != 0) goto L_0x0041
            r0 = r1
            goto L_0x0049
        L_0x0041:
            int r0 = r0.mo48486p()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0049:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x004e
            goto L_0x0054
        L_0x004e:
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x006c
        L_0x0054:
            androidx.constraintlayout.compose.e0 r0 = r12.mo48401q()
            if (r0 != 0) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            int r0 = r0.mo48483g()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0063:
            if (r1 != 0) goto L_0x0066
            goto L_0x006e
        L_0x0066:
            int r0 = r1.intValue()
            if (r0 != r2) goto L_0x006e
        L_0x006c:
            if (r10 == 0) goto L_0x0080
        L_0x006e:
            r0 = r12
            r1 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r0.mo48440W(r1, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0080:
            androidx.constraintlayout.core.widgets.d r0 = r12.mo48404t()
            int r0 = r0.mo49569m0()
            androidx.constraintlayout.core.widgets.d r1 = r12.mo48404t()
            int r1 = r1.mo49456D()
            long r0 = androidx.compose.p004ui.unit.C16502r.m74668a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionMeasurer.mo48439V(long, androidx.compose.ui.unit.LayoutDirection, androidx.constraintlayout.compose.j, androidx.constraintlayout.compose.j, androidx.constraintlayout.compose.n0, java.util.List, int, float, androidx.compose.ui.layout.h0):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0125, code lost:
        if (r9.intValue() != r7) goto L_0x0127;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48440W(long r13, androidx.compose.p004ui.unit.LayoutDirection r15, androidx.constraintlayout.compose.C16602j r16, androidx.constraintlayout.compose.C16602j r17, androidx.constraintlayout.compose.C16615n0 r18, java.util.List<? extends androidx.compose.p004ui.layout.C15557e0> r19, int r20, float r21, boolean r22) {
        /*
            r12 = this;
            r6 = r12
            r7 = r18
            r8 = r21
            r6.f41197p = r8
            r9 = 0
            if (r22 == 0) goto L_0x009b
            androidx.constraintlayout.core.state.n r0 = r6.f41198q
            r0.mo49377t()
            r12.mo48379A()
            androidx.constraintlayout.compose.l0 r0 = r12.mo48405u()
            r0.mo48547s()
            androidx.constraintlayout.compose.l0 r0 = r12.mo48405u()
            boolean r1 = androidx.compose.p004ui.unit.C16476b.m74360n(r13)
            if (r1 == 0) goto L_0x002c
            int r1 = androidx.compose.p004ui.unit.C16476b.m74362p(r13)
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.m76548a(r1)
            goto L_0x0038
        L_0x002c:
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.m76556i()
            int r2 = androidx.compose.p004ui.unit.C16476b.m74364r(r13)
            androidx.constraintlayout.core.state.Dimension r1 = r1.mo49295q(r2)
        L_0x0038:
            r0.mo49303B(r1)
            androidx.constraintlayout.compose.l0 r0 = r12.mo48405u()
            boolean r1 = androidx.compose.p004ui.unit.C16476b.m74358l(r13)
            if (r1 == 0) goto L_0x004e
            int r1 = androidx.compose.p004ui.unit.C16476b.m74361o(r13)
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.m76548a(r1)
            goto L_0x005a
        L_0x004e:
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.m76556i()
            int r2 = androidx.compose.p004ui.unit.C16476b.m74363q(r13)
            androidx.constraintlayout.core.state.Dimension r1 = r1.mo49295q(r2)
        L_0x005a:
            r0.mo49314l(r1)
            androidx.constraintlayout.compose.l0 r0 = r12.mo48405u()
            r10 = r13
            r0.mo48545K(r13)
            androidx.constraintlayout.compose.l0 r0 = r12.mo48405u()
            r1 = r15
            r0.mo48544J(r15)
            r0 = r12
            r1 = r20
            r2 = r16
            r3 = r19
            r4 = r13
            r0.mo48437T(r1, r2, r3, r4)
            androidx.constraintlayout.core.state.n r0 = r6.f41198q
            androidx.constraintlayout.core.widgets.d r1 = r12.mo48404t()
            r0.mo49370Z(r1, r9)
            r0 = r12
            r1 = r20
            r2 = r17
            r0.mo48437T(r1, r2, r3, r4)
            androidx.constraintlayout.core.state.n r0 = r6.f41198q
            androidx.constraintlayout.core.widgets.d r1 = r12.mo48404t()
            r2 = 1
            r0.mo49370Z(r1, r2)
            if (r7 != 0) goto L_0x0096
            goto L_0x009b
        L_0x0096:
            androidx.constraintlayout.core.state.n r0 = r6.f41198q
            r7.mo48418b(r0, r9)
        L_0x009b:
            androidx.constraintlayout.core.state.n r0 = r6.f41198q
            androidx.constraintlayout.core.widgets.d r1 = r12.mo48404t()
            int r1 = r1.mo49569m0()
            androidx.constraintlayout.core.widgets.d r2 = r12.mo48404t()
            int r2 = r2.mo49456D()
            r0.mo49367O(r1, r2, r8)
            androidx.constraintlayout.core.widgets.d r0 = r12.mo48404t()
            java.util.ArrayList r0 = r0.mo49843l2()
            java.lang.String r1 = "root.children"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r0.size()
            int r1 = r1 + -1
            r2 = 0
            if (r1 < 0) goto L_0x014d
        L_0x00c6:
            int r3 = r9 + 1
            java.lang.Object r4 = r0.get(r9)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r4
            java.lang.Object r5 = r4.mo49599w()
            boolean r7 = r5 instanceof androidx.compose.p004ui.layout.C15557e0
            if (r7 == 0) goto L_0x00d9
            androidx.compose.ui.layout.e0 r5 = (androidx.compose.p004ui.layout.C15557e0) r5
            goto L_0x00da
        L_0x00d9:
            r5 = r2
        L_0x00da:
            if (r5 != 0) goto L_0x00de
            goto L_0x0147
        L_0x00de:
            androidx.constraintlayout.core.state.n r7 = r12.mo48435R()
            androidx.constraintlayout.core.state.o r4 = r7.mo49355B(r4)
            if (r4 != 0) goto L_0x00e9
            goto L_0x0147
        L_0x00e9:
            java.util.Map r7 = r12.mo48403s()
            java.lang.Object r7 = r7.get(r5)
            androidx.compose.ui.layout.w0 r7 = (androidx.compose.p004ui.layout.C15611w0) r7
            if (r7 != 0) goto L_0x00f7
            r8 = r2
            goto L_0x00ff
        L_0x00f7:
            int r8 = r7.mo44471K0()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
        L_0x00ff:
            if (r7 != 0) goto L_0x0103
            r9 = r2
            goto L_0x010b
        L_0x0103:
            int r9 = r7.mo44468G0()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L_0x010b:
            if (r7 == 0) goto L_0x0127
            int r7 = r4.mo49394E()
            if (r8 != 0) goto L_0x0114
            goto L_0x0127
        L_0x0114:
            int r8 = r8.intValue()
            if (r8 != r7) goto L_0x0127
            int r7 = r4.mo49404l()
            if (r9 != 0) goto L_0x0121
            goto L_0x0127
        L_0x0121:
            int r8 = r9.intValue()
            if (r8 == r7) goto L_0x0140
        L_0x0127:
            androidx.compose.ui.unit.b$a r7 = androidx.compose.p004ui.unit.C16476b.f40850b
            int r8 = r4.mo49394E()
            int r9 = r4.mo49404l()
            long r7 = r7.mo47810c(r8, r9)
            androidx.compose.ui.layout.w0 r7 = r5.mo44324t0(r7)
            java.util.Map r8 = r12.mo48403s()
            r8.put(r5, r7)
        L_0x0140:
            java.util.Map r7 = r12.mo48398n()
            r7.put(r5, r4)
        L_0x0147:
            if (r3 <= r1) goto L_0x014a
            goto L_0x014d
        L_0x014a:
            r9 = r3
            goto L_0x00c6
        L_0x014d:
            androidx.constraintlayout.compose.e0 r0 = r12.mo48401q()
            if (r0 != 0) goto L_0x0154
            goto L_0x0158
        L_0x0154:
            androidx.constraintlayout.compose.LayoutInfoFlags r2 = r0.mo48485j()
        L_0x0158:
            androidx.constraintlayout.compose.LayoutInfoFlags r0 = androidx.constraintlayout.compose.LayoutInfoFlags.BOUNDS
            if (r2 != r0) goto L_0x015f
            r12.mo48391f()
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionMeasurer.mo48440W(long, androidx.compose.ui.unit.LayoutDirection, androidx.constraintlayout.compose.j, androidx.constraintlayout.compose.j, androidx.constraintlayout.compose.n0, java.util.List, int, float, boolean):void");
    }

    /* renamed from: f */
    public void mo48391f() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        mo48431N(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        Iterator<ConstraintWidget> it = mo48404t().mo49843l2().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            C16772o K = this.f41198q.mo49363K(next.f42750o);
            C16772o A = this.f41198q.mo49354A(next.f42750o);
            C16772o C = this.f41198q.mo49356C(next.f42750o);
            float[] I = this.f41198q.mo49361I(next.f42750o);
            int F = this.f41198q.mo49358F(next.f42750o, fArr, iArr, iArr2);
            sb.append(' ' + next.f42750o + ": {");
            sb.append(" interpolated : ");
            C.mo49410t(sb, true);
            sb.append(", start : ");
            K.mo49409s(sb);
            sb.append(", end : ");
            A.mo49409s(sb);
            mo48430M(sb, fArr, iArr, iArr2, F);
            sb.append(" path : [");
            Intrinsics.checkNotNullExpressionValue(I, "path");
            int length = I.length;
            int i = 0;
            while (i < length) {
                float f = I[i];
                i++;
                sb.append(' ' + f + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
        }
        sb.append(" }");
        C16592e0 q = mo48401q();
        if (q != null) {
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "json.toString()");
            q.mo48484h(sb2);
        }
    }
}

package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.s0 */
public final class C2407s0 {
    @C12579k

    /* renamed from: a */
    public final LayoutOrientation f6345a;
    @C12579k

    /* renamed from: b */
    public final C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> f6346b;

    /* renamed from: c */
    public final float f6347c;
    @C12579k

    /* renamed from: d */
    public final SizeMode f6348d;
    @C12579k

    /* renamed from: e */
    public final C2380m f6349e;
    @C12579k

    /* renamed from: f */
    public final List<C15557e0> f6350f;
    @C12579k

    /* renamed from: g */
    public final C15611w0[] f6351g;
    @C12579k

    /* renamed from: h */
    public final C2409t0[] f6352h;

    public /* synthetic */ C2407s0(LayoutOrientation layoutOrientation, C11307s sVar, float f, SizeMode sizeMode, C2380m mVar, List list, C15611w0[] w0VarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, sVar, f, sizeMode, mVar, list, w0VarArr);
    }

    /* renamed from: a */
    public final int mo8164a(@C12579k C15611w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        if (this.f6345a == LayoutOrientation.Horizontal) {
            return w0Var.mo44468G0();
        }
        return w0Var.mo44471K0();
    }

    @C12579k
    /* renamed from: b */
    public final C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> mo8165b() {
        return this.f6346b;
    }

    /* renamed from: c */
    public final float mo8166c() {
        return this.f6347c;
    }

    @C12579k
    /* renamed from: d */
    public final C2380m mo8167d() {
        return this.f6349e;
    }

    /* renamed from: e */
    public final int mo8168e(C15611w0 w0Var, C2409t0 t0Var, int i, LayoutDirection layoutDirection, int i2) {
        C2380m mVar;
        if (t0Var == null || (mVar = t0Var.mo8187f()) == null) {
            mVar = this.f6349e;
        }
        int a = i - mo8164a(w0Var);
        if (this.f6345a == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return mVar.mo8117d(a, layoutDirection, w0Var, i2);
    }

    @C12579k
    /* renamed from: f */
    public final SizeMode mo8169f() {
        return this.f6348d;
    }

    @C12579k
    /* renamed from: g */
    public final List<C15557e0> mo8170g() {
        return this.f6350f;
    }

    @C12579k
    /* renamed from: h */
    public final LayoutOrientation mo8171h() {
        return this.f6345a;
    }

    @C12579k
    /* renamed from: i */
    public final C15611w0[] mo8172i() {
        return this.f6351g;
    }

    /* renamed from: j */
    public final int[] mo8173j(int i, int[] iArr, int[] iArr2, C15568h0 h0Var) {
        this.f6346b.mo7709v5(Integer.valueOf(i), iArr, h0Var.getLayoutDirection(), h0Var, iArr2);
        return iArr2;
    }

    /* renamed from: k */
    public final int mo8174k(@C12579k C15611w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        if (this.f6345a == LayoutOrientation.Horizontal) {
            return w0Var.mo44471K0();
        }
        return w0Var.mo44468G0();
    }

    @C12579k
    /* renamed from: l */
    public final C2404r0 mo8175l(@C12579k C15568h0 h0Var, long j, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num;
        int i9;
        float f;
        float f2;
        boolean z;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        C15568h0 h0Var2 = h0Var;
        int i15 = i2;
        Intrinsics.checkNotNullParameter(h0Var2, "measureScope");
        C2363h0 h0Var3 = new C2363h0(j, this.f6345a, (DefaultConstructorMarker) null);
        int n2 = h0Var2.mo7429n2(this.f6347c);
        int i16 = i15 - i;
        float f3 = 0.0f;
        int i17 = i;
        float f4 = 0.0f;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z3 = false;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i17 >= i15) {
                break;
            }
            C15557e0 e0Var = this.f6350f.get(i17);
            C2409t0 t0Var = this.f6352h[i17];
            float m = RowColumnImplKt.m10056m(t0Var);
            if (m > 0.0f) {
                f4 += m;
                i20++;
                i11 = i17;
            } else {
                int i22 = h0Var3.mo8078i();
                C15611w0 w0Var = this.f6351g[i17];
                if (w0Var == null) {
                    if (i22 == Integer.MAX_VALUE) {
                        i14 = Integer.MAX_VALUE;
                    } else {
                        i14 = i22 - i21;
                    }
                    int i23 = i14;
                    i12 = i22;
                    i13 = i19;
                    i11 = i17;
                    w0Var = e0Var.mo44324t0(C2363h0.m10414f(h0Var3, 0, i23, 0, 0, 8, (Object) null).mo8083n(this.f6345a));
                } else {
                    i12 = i22;
                    i13 = i19;
                    i11 = i17;
                }
                int min = Math.min(n2, (i12 - i21) - mo8174k(w0Var));
                i21 += mo8174k(w0Var) + min;
                i19 = Math.max(i13, mo8164a(w0Var));
                if (z3 || RowColumnImplKt.m10060q(t0Var)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f6351g[i11] = w0Var;
                i18 = min;
            }
            i17 = i11 + 1;
        }
        int i24 = i19;
        if (i20 == 0) {
            i21 -= i18;
            i5 = i24;
            i4 = 0;
        } else {
            int i25 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i25 <= 0 || h0Var3.mo8078i() == Integer.MAX_VALUE) {
                i9 = h0Var3.mo8079j();
            } else {
                i9 = h0Var3.mo8078i();
            }
            int i26 = n2 * (i20 - 1);
            int i27 = (i9 - i21) - i26;
            if (i25 > 0) {
                f = ((float) i27) / f4;
            } else {
                f = 0.0f;
            }
            Iterator it = C11479u.m44378W1(i, i2).iterator();
            int i28 = 0;
            while (it.hasNext()) {
                i28 += C11409d.m43851L0(RowColumnImplKt.m10056m(this.f6352h[((C10953k0) it).mo6374c()]) * f);
            }
            int i29 = i27 - i28;
            int i30 = i;
            i5 = i24;
            int i31 = 0;
            while (i30 < i15) {
                if (this.f6351g[i30] == null) {
                    C15557e0 e0Var2 = this.f6350f.get(i30);
                    C2409t0 t0Var2 = this.f6352h[i30];
                    float m2 = RowColumnImplKt.m10056m(t0Var2);
                    if (m2 > f3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int U = C11409d.m43868U(i29);
                        int i32 = i29 - U;
                        int max = Math.max(0, C11409d.m43851L0(m2 * f) + U);
                        if (!RowColumnImplKt.m10054k(t0Var2) || max == i3) {
                            f2 = f;
                            i10 = 0;
                        } else {
                            f2 = f;
                            i10 = max;
                        }
                        int i33 = i32;
                        C15611w0 t0 = e0Var2.mo44324t0(new C2363h0(i10, max, 0, h0Var3.mo8075g()).mo8083n(this.f6345a));
                        i31 += mo8174k(t0);
                        i5 = Math.max(i5, mo8164a(t0));
                        if (z3 || RowColumnImplKt.m10060q(t0Var2)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f6351g[i30] = t0;
                        i29 = i33;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    f2 = f;
                }
                i30++;
                f = f2;
                i3 = Integer.MAX_VALUE;
                f3 = 0.0f;
            }
            i4 = C11479u.m44313B(i31 + i26, h0Var3.mo8078i() - i21);
        }
        if (z3) {
            int i34 = 0;
            i7 = 0;
            for (int i35 = i; i35 < i15; i35++) {
                C15611w0 w0Var2 = this.f6351g[i35];
                Intrinsics.checkNotNull(w0Var2);
                C2380m j2 = RowColumnImplKt.m10053j(this.f6352h[i35]);
                if (j2 != null) {
                    num = j2.mo8118e(w0Var2);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i34 = Math.max(i34, intValue);
                    int a = mo8164a(w0Var2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = mo8164a(w0Var2);
                    }
                    i7 = Math.max(i7, a - intValue2);
                }
            }
            i6 = i34;
        } else {
            i7 = 0;
            i6 = 0;
        }
        int max2 = Math.max(i21 + i4, h0Var3.mo8079j());
        if (h0Var3.mo8075g() == Integer.MAX_VALUE || this.f6348d != SizeMode.Expand) {
            i8 = Math.max(i5, Math.max(h0Var3.mo8076h(), i7 + i6));
        } else {
            i8 = h0Var3.mo8075g();
        }
        int[] iArr = new int[i16];
        for (int i36 = 0; i36 < i16; i36++) {
            iArr[i36] = 0;
        }
        int[] iArr2 = new int[i16];
        for (int i37 = 0; i37 < i16; i37++) {
            C15611w0 w0Var3 = this.f6351g[i37 + i];
            Intrinsics.checkNotNull(w0Var3);
            iArr2[i37] = mo8174k(w0Var3);
        }
        return new C2404r0(i8, max2, i, i2, i6, mo8173j(max2, iArr2, iArr, h0Var2));
    }

    /* renamed from: m */
    public final void mo8176m(@C12579k C15611w0.C15612a aVar, @C12579k C2404r0 r0Var, int i, @C12579k LayoutDirection layoutDirection) {
        C2409t0 t0Var;
        Intrinsics.checkNotNullParameter(aVar, "placeableScope");
        Intrinsics.checkNotNullParameter(r0Var, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int c = r0Var.mo8157c();
        for (int f = r0Var.mo8160f(); f < c; f++) {
            C15611w0 w0Var = this.f6351g[f];
            Intrinsics.checkNotNull(w0Var);
            int[] d = r0Var.mo8158d();
            Object c2 = this.f6350f.get(f).mo44319c();
            if (c2 instanceof C2409t0) {
                t0Var = (C2409t0) c2;
            } else {
                t0Var = null;
            }
            int e = mo8168e(w0Var, t0Var, r0Var.mo8156b(), layoutDirection, r0Var.mo8155a()) + i;
            if (this.f6345a == LayoutOrientation.Horizontal) {
                C15611w0.C15612a.m69412p(aVar, w0Var, d[f - r0Var.mo8160f()], e, 0.0f, 4, (Object) null);
            } else {
                C15611w0.C15612a.m69412p(aVar, w0Var, e, d[f - r0Var.mo8160f()], 0.0f, 4, (Object) null);
            }
        }
    }

    public C2407s0(LayoutOrientation layoutOrientation, C11307s<? super Integer, ? super int[], ? super LayoutDirection, ? super C16479d, ? super int[], C11079d2> sVar, float f, SizeMode sizeMode, C2380m mVar, List<? extends C15557e0> list, C15611w0[] w0VarArr) {
        this.f6345a = layoutOrientation;
        this.f6346b = sVar;
        this.f6347c = f;
        this.f6348d = sizeMode;
        this.f6349e = mVar;
        this.f6350f = list;
        this.f6351g = w0VarArr;
        int size = list.size();
        C2409t0[] t0VarArr = new C2409t0[size];
        for (int i = 0; i < size; i++) {
            t0VarArr[i] = RowColumnImplKt.m10055l(this.f6350f.get(i));
        }
        this.f6352h = t0VarArr;
    }
}

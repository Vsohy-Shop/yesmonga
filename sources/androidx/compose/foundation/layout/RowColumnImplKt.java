package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,769:1\n32#2,6:770\n32#2,6:776\n32#2,6:782\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n532#1:770,6\n556#1:776,6\n582#1:782,6\n*E\n"})
public final class RowColumnImplKt {
    /* renamed from: a */
    public static final C11305q<List<? extends C15580l>, Integer, Integer, Integer> m10044a(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.f6090a.mo7769a();
        }
        return IntrinsicMeasureBlocks.f6090a.mo7773e();
    }

    /* renamed from: b */
    public static final C11305q<List<? extends C15580l>, Integer, Integer, Integer> m10045b(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.f6090a.mo7770b();
        }
        return IntrinsicMeasureBlocks.f6090a.mo7774f();
    }

    /* renamed from: c */
    public static final C11305q<List<? extends C15580l>, Integer, Integer, Integer> m10046c(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.f6090a.mo7771c();
        }
        return IntrinsicMeasureBlocks.f6090a.mo7775g();
    }

    /* renamed from: d */
    public static final C11305q<List<? extends C15580l>, Integer, Integer, Integer> m10047d(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.f6090a.mo7772d();
        }
        return IntrinsicMeasureBlocks.f6090a.mo7776h();
    }

    @C12580l
    /* renamed from: j */
    public static final C2380m m10053j(@C12580l C2409t0 t0Var) {
        if (t0Var != null) {
            return t0Var.mo8187f();
        }
        return null;
    }

    /* renamed from: k */
    public static final boolean m10054k(@C12580l C2409t0 t0Var) {
        if (t0Var != null) {
            return t0Var.mo8188g();
        }
        return true;
    }

    @C12580l
    /* renamed from: l */
    public static final C2409t0 m10055l(@C12579k C15580l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Object c = lVar.mo44319c();
        if (c instanceof C2409t0) {
            return (C2409t0) c;
        }
        return null;
    }

    /* renamed from: m */
    public static final float m10056m(@C12580l C2409t0 t0Var) {
        if (t0Var != null) {
            return t0Var.mo8189h();
        }
        return 0.0f;
    }

    /* renamed from: n */
    public static final int m10057n(List<? extends C15580l> list, C11304p<? super C15580l, ? super Integer, Integer> pVar, C11304p<? super C15580l, ? super Integer, Integer> pVar2, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2 = true;
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i5 = 0;
        float f = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            C15580l lVar = (C15580l) list.get(i6);
            float m = m10056m(m10055l(lVar));
            if (m == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int min2 = Math.min(pVar.invoke(lVar, Integer.MAX_VALUE).intValue(), i - min);
                min += min2;
                i5 = Math.max(i5, pVar2.invoke(lVar, Integer.valueOf(min2)).intValue());
            } else if (m > 0.0f) {
                f += m;
            }
        }
        if (f != 0.0f) {
            z2 = false;
        }
        if (z2) {
            i3 = 0;
        } else if (i == Integer.MAX_VALUE) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = C11409d.m43851L0(((float) Math.max(i - min, 0)) / f);
        }
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            C15580l lVar2 = (C15580l) list.get(i7);
            float m2 = m10056m(m10055l(lVar2));
            if (m2 > 0.0f) {
                if (i3 != Integer.MAX_VALUE) {
                    i4 = C11409d.m43851L0(((float) i3) * m2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                i5 = Math.max(i5, pVar2.invoke(lVar2, Integer.valueOf(i4)).intValue());
            }
        }
        return i5;
    }

    /* renamed from: o */
    public static final int m10058o(List<? extends C15580l> list, C11304p<? super C15580l, ? super Integer, Integer> pVar, int i, int i2) {
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f = 0.0f;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                return C11409d.m43851L0(((float) i4) * f) + i5 + ((list.size() - 1) * i2);
            }
            C15580l lVar = (C15580l) list.get(i3);
            float m = m10056m(m10055l(lVar));
            int intValue = pVar.invoke(lVar, Integer.valueOf(i)).intValue();
            if (m != 0.0f) {
                z = false;
            }
            if (z) {
                i5 += intValue;
            } else if (m > 0.0f) {
                f += m;
                i4 = Math.max(i4, C11409d.m43851L0(((float) intValue) / m));
            }
            i3++;
        }
    }

    /* renamed from: p */
    public static final int m10059p(List<? extends C15580l> list, C11304p<? super C15580l, ? super Integer, Integer> pVar, C11304p<? super C15580l, ? super Integer, Integer> pVar2, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return m10058o(list, pVar, i, i2);
        }
        return m10057n(list, pVar2, pVar, i, i2);
    }

    /* renamed from: q */
    public static final boolean m10060q(@C12580l C2409t0 t0Var) {
        C2380m j = m10053j(t0Var);
        if (j != null) {
            return j.mo8119f();
        }
        return false;
    }

    @C12579k
    /* renamed from: r */
    public static final C15560f0 m10061r(@C12579k LayoutOrientation layoutOrientation, @C12579k C11307s<? super Integer, ? super int[], ? super LayoutDirection, ? super C16479d, ? super int[], C11079d2> sVar, float f, @C12579k SizeMode sizeMode, @C12579k C2380m mVar) {
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        Intrinsics.checkNotNullParameter(sVar, "arrangement");
        Intrinsics.checkNotNullParameter(sizeMode, "crossAxisSize");
        Intrinsics.checkNotNullParameter(mVar, "crossAxisAlignment");
        return new RowColumnImplKt$rowColumnMeasurePolicy$1(layoutOrientation, sVar, f, sizeMode, mVar);
    }
}

package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,193:1\n186#1:194\n86#2:195\n86#2:196\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n*L\n170#1:194\n177#1:195\n179#1:196\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.r */
public final class C2574r implements C2517l {

    /* renamed from: a */
    public final int f6781a;

    /* renamed from: b */
    public final int f6782b;
    @C12579k

    /* renamed from: c */
    public final Object f6783c;

    /* renamed from: d */
    public final int f6784d;

    /* renamed from: e */
    public final int f6785e;

    /* renamed from: f */
    public final int f6786f;

    /* renamed from: g */
    public final boolean f6787g;
    @C12579k

    /* renamed from: h */
    public final List<C2573q> f6788h;
    @C12579k

    /* renamed from: i */
    public final LazyListItemPlacementAnimator f6789i;

    /* renamed from: j */
    public final long f6790j;

    /* renamed from: k */
    public final boolean f6791k;

    /* renamed from: l */
    public final int f6792l;

    /* renamed from: m */
    public final boolean f6793m;

    public /* synthetic */ C2574r(int i, int i2, Object obj, int i3, int i4, int i5, boolean z, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, obj, i3, i4, i5, z, list, lazyListItemPlacementAnimator, j, z2, i6);
    }

    /* renamed from: a */
    public final long mo8823a(long j, C11300l<? super Integer, Integer> lVar) {
        int m = this.f6787g ? C16494m.m74581m(j) : lVar.invoke(Integer.valueOf(C16494m.m74581m(j))).intValue();
        boolean z = this.f6787g;
        int o = C16494m.m74583o(j);
        if (z) {
            o = lVar.invoke(Integer.valueOf(o)).intValue();
        }
        return C16496n.m74593a(m, o);
    }

    @C12580l
    /* renamed from: b */
    public final C1956d0<C16494m> mo8824b(int i) {
        Object c = this.f6788h.get(i).mo8822b().mo44417c();
        if (c instanceof C1956d0) {
            return (C1956d0) c;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo8825c() {
        return this.f6793m;
    }

    /* renamed from: d */
    public final int mo8826d(int i) {
        return mo8827e(this.f6788h.get(i).mo8822b());
    }

    /* renamed from: e */
    public final int mo8827e(C15611w0 w0Var) {
        return this.f6787g ? w0Var.mo44468G0() : w0Var.mo44471K0();
    }

    /* renamed from: f */
    public final long mo8828f(int i) {
        return this.f6788h.get(i).mo8821a();
    }

    /* renamed from: g */
    public final int mo8829g() {
        return this.f6788h.size();
    }

    public int getIndex() {
        return this.f6782b;
    }

    @C12579k
    public Object getKey() {
        return this.f6783c;
    }

    public int getOffset() {
        return this.f6781a;
    }

    public int getSize() {
        return this.f6784d;
    }

    /* renamed from: h */
    public final void mo8830h(@C12579k C15611w0.C15612a aVar) {
        long j;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(aVar, "scope");
        int g = mo8829g();
        for (int i3 = 0; i3 < g; i3++) {
            C15611w0 b = this.f6788h.get(i3).mo8822b();
            int e = this.f6785e - mo8827e(b);
            int i4 = this.f6786f;
            if (mo8824b(i3) != null) {
                j = this.f6789i.mo8275d(getKey(), i3, e, i4, mo8828f(i3));
            } else {
                j = mo8828f(i3);
            }
            if (this.f6791k) {
                if (this.f6787g) {
                    i = C16494m.m74581m(j);
                } else {
                    i = (this.f6792l - C16494m.m74581m(j)) - mo8827e(b);
                }
                if (this.f6787g) {
                    i2 = (this.f6792l - C16494m.m74583o(j)) - mo8827e(b);
                } else {
                    i2 = C16494m.m74583o(j);
                }
                j = C16496n.m74593a(i, i2);
            }
            if (this.f6787g) {
                long j2 = this.f6790j;
                C15611w0.C15612a.m69400F(aVar, b, C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(j2), C16494m.m74583o(j) + C16494m.m74583o(j2)), 0.0f, (C11300l) null, 6, (Object) null);
            } else {
                long j3 = this.f6790j;
                C15611w0.C15612a.m69398B(aVar, b, C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(j3), C16494m.m74583o(j) + C16494m.m74583o(j3)), 0.0f, (C11300l) null, 6, (Object) null);
            }
        }
    }

    public C2574r(int i, int i2, Object obj, int i3, int i4, int i5, boolean z, List<C2573q> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, boolean z2, int i6) {
        this.f6781a = i;
        this.f6782b = i2;
        this.f6783c = obj;
        this.f6784d = i3;
        this.f6785e = i4;
        this.f6786f = i5;
        this.f6787g = z;
        this.f6788h = list;
        this.f6789i = lazyListItemPlacementAnimator;
        this.f6790j = j;
        this.f6791k = z2;
        this.f6792l = i6;
        int g = mo8829g();
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= g) {
                break;
            } else if (mo8824b(i7) != null) {
                z3 = true;
                break;
            } else {
                i7++;
            }
        }
        this.f6793m = z3;
    }
}

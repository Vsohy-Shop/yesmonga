package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,196:1\n194#1:197\n86#2:198\n86#2:199\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n*L\n178#1:197\n185#1:198\n187#1:199\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.q */
public final class C2502q implements C2492h {

    /* renamed from: d */
    public final long f6644d;

    /* renamed from: e */
    public final int f6645e;
    @C12579k

    /* renamed from: f */
    public final Object f6646f;

    /* renamed from: g */
    public final int f6647g;

    /* renamed from: h */
    public final int f6648h;

    /* renamed from: i */
    public final long f6649i;

    /* renamed from: j */
    public final int f6650j;

    /* renamed from: k */
    public final int f6651k;

    /* renamed from: l */
    public final boolean f6652l;
    @C12579k

    /* renamed from: m */
    public final List<C15611w0> f6653m;
    @C12579k

    /* renamed from: n */
    public final LazyGridItemPlacementAnimator f6654n;

    /* renamed from: o */
    public final long f6655o;

    /* renamed from: p */
    public final int f6656p;

    /* renamed from: q */
    public final boolean f6657q;

    /* renamed from: r */
    public final boolean f6658r;

    public /* synthetic */ C2502q(long j, int i, Object obj, int i2, int i3, long j2, int i4, int i5, boolean z, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j3, int i6, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, obj, i2, i3, j2, i4, i5, z, list, lazyGridItemPlacementAnimator, j3, i6, z2);
    }

    /* renamed from: a */
    public long mo8581a() {
        return this.f6649i;
    }

    /* renamed from: b */
    public long mo8582b() {
        return this.f6644d;
    }

    /* renamed from: c */
    public int mo8583c() {
        return this.f6647g;
    }

    /* renamed from: d */
    public int mo8584d() {
        return this.f6648h;
    }

    /* renamed from: e */
    public final long mo8609e(long j, C11300l<? super Integer, Integer> lVar) {
        int m = this.f6652l ? C16494m.m74581m(j) : lVar.invoke(Integer.valueOf(C16494m.m74581m(j))).intValue();
        boolean z = this.f6652l;
        int o = C16494m.m74583o(j);
        if (z) {
            o = lVar.invoke(Integer.valueOf(o)).intValue();
        }
        return C16496n.m74593a(m, o);
    }

    @C12580l
    /* renamed from: f */
    public final C1956d0<C16494m> mo8610f(int i) {
        Object c = this.f6653m.get(i).mo44417c();
        if (c instanceof C1956d0) {
            return (C1956d0) c;
        }
        return null;
    }

    /* renamed from: g */
    public final int mo8611g() {
        return this.f6652l ? C16494m.m74581m(mo8582b()) : C16494m.m74583o(mo8582b());
    }

    public int getIndex() {
        return this.f6645e;
    }

    @C12579k
    public Object getKey() {
        return this.f6646f;
    }

    /* renamed from: h */
    public final int mo8612h() {
        return this.f6652l ? C16500q.m74662m(mo8581a()) : C16500q.m74659j(mo8581a());
    }

    /* renamed from: i */
    public final boolean mo8613i() {
        return this.f6658r;
    }

    /* renamed from: j */
    public final int mo8614j() {
        return this.f6652l ? C16500q.m74659j(mo8581a()) : C16500q.m74662m(mo8581a());
    }

    /* renamed from: k */
    public final int mo8615k(int i) {
        return mo8616l(this.f6653m.get(i));
    }

    /* renamed from: l */
    public final int mo8616l(C15611w0 w0Var) {
        return this.f6652l ? w0Var.mo44468G0() : w0Var.mo44471K0();
    }

    /* renamed from: m */
    public final int mo8617m() {
        return this.f6653m.size();
    }

    /* renamed from: n */
    public final void mo8618n(@C12579k C15611w0.C15612a aVar) {
        long j;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(aVar, "scope");
        int m = mo8617m();
        for (int i3 = 0; i3 < m; i3++) {
            C15611w0 w0Var = this.f6653m.get(i3);
            int l = this.f6650j - mo8616l(w0Var);
            int i4 = this.f6651k;
            if (mo8610f(i3) != null) {
                j = this.f6654n.mo8433d(getKey(), i3, l, i4, mo8582b());
            } else {
                j = mo8582b();
            }
            if (this.f6657q) {
                if (this.f6652l) {
                    i = C16494m.m74581m(j);
                } else {
                    i = (this.f6656p - C16494m.m74581m(j)) - mo8616l(w0Var);
                }
                if (this.f6652l) {
                    i2 = (this.f6656p - C16494m.m74583o(j)) - mo8616l(w0Var);
                } else {
                    i2 = C16494m.m74583o(j);
                }
                j = C16496n.m74593a(i, i2);
            }
            if (this.f6652l) {
                long j2 = this.f6655o;
                C15611w0.C15612a.m69400F(aVar, w0Var, C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(j2), C16494m.m74583o(j) + C16494m.m74583o(j2)), 0.0f, (C11300l) null, 6, (Object) null);
            } else {
                long j3 = this.f6655o;
                C15611w0.C15612a.m69398B(aVar, w0Var, C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(j3), C16494m.m74583o(j) + C16494m.m74583o(j3)), 0.0f, (C11300l) null, 6, (Object) null);
            }
        }
    }

    public C2502q(long j, int i, Object obj, int i2, int i3, long j2, int i4, int i5, boolean z, List<? extends C15611w0> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j3, int i6, boolean z2) {
        this.f6644d = j;
        this.f6645e = i;
        this.f6646f = obj;
        this.f6647g = i2;
        this.f6648h = i3;
        this.f6649i = j2;
        this.f6650j = i4;
        this.f6651k = i5;
        this.f6652l = z;
        this.f6653m = list;
        this.f6654n = lazyGridItemPlacementAnimator;
        this.f6655o = j3;
        this.f6656p = i6;
        this.f6657q = z2;
        int m = mo8617m();
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= m) {
                break;
            } else if (mo8610f(i7) != null) {
                z3 = true;
                break;
            } else {
                i7++;
            }
        }
        this.f6658r = z3;
    }
}

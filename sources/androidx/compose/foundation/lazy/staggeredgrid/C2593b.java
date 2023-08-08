package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.foundation.lazy.layout.C2542e;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
@C11363r0({"SMAP\nLazyStaggeredGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,70:1\n132#2,3:71\n33#2,4:74\n135#2,2:78\n38#2:80\n137#2:81\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n*L\n55#1:71,3\n55#1:74,4\n55#1:78,2\n55#1:80\n55#1:81\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.b */
public final class C2593b implements C2542e {
    @C12579k

    /* renamed from: a */
    public final LazyStaggeredGridState f6860a;

    public C2593b(@C12579k LazyStaggeredGridState lazyStaggeredGridState) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState, "state");
        this.f6860a = lazyStaggeredGridState;
    }

    /* renamed from: a */
    public int mo8383a() {
        return this.f6860a.mo8933z().mo8945e();
    }

    /* renamed from: b */
    public void mo8384b(@C12579k C2201l lVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        this.f6860a.mo8919W(lVar, i, i2);
    }

    /* renamed from: c */
    public int mo8385c() {
        C2596e eVar = (C2596e) CollectionsKt___CollectionsKt.m40677q3(this.f6860a.mo8933z().mo8949i());
        if (eVar != null) {
            return eVar.getIndex();
        }
        return 0;
    }

    /* renamed from: d */
    public float mo8386d(int i, int i2) {
        int i3;
        List<C2596e> i4 = this.f6860a.mo8933z().mo8949i();
        int size = i4.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C2596e eVar = i4.get(i6);
            if (this.f6860a.mo8907J()) {
                i3 = C16500q.m74659j(eVar.mo8952a());
            } else {
                i3 = C16500q.m74662m(eVar.mo8952a());
            }
            i5 += i3;
        }
        int size2 = i5 / (i4.size() * this.f6860a.mo8930w());
        int i7 = i - mo8392i();
        int min = Math.min(Math.abs(i2), size2);
        if (i2 < 0) {
            min *= -1;
        }
        return (((float) (size2 * i7)) + ((float) min)) - ((float) mo8391h());
    }

    @C12580l
    /* renamed from: e */
    public Integer mo8387e(int i) {
        int i2;
        C2596e a = LazyStaggeredGridMeasureResultKt.m11664a(this.f6860a.mo8933z(), i);
        if (a == null) {
            return null;
        }
        long b = a.mo8953b();
        if (this.f6860a.mo8907J()) {
            i2 = C16494m.m74583o(b);
        } else {
            i2 = C16494m.m74581m(b);
        }
        return Integer.valueOf(i2);
    }

    @C12580l
    /* renamed from: f */
    public Object mo8388f(@C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object c = C2203n.m9563c(this.f6860a, (MutatePriority) null, pVar, cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* renamed from: g */
    public int mo8389g() {
        return this.f6860a.mo8930w() * 100;
    }

    @C12579k
    public C16479d getDensity() {
        return this.f6860a.mo8926s();
    }

    /* renamed from: h */
    public int mo8391h() {
        return this.f6860a.mo8928u();
    }

    /* renamed from: i */
    public int mo8392i() {
        return this.f6860a.mo8927t();
    }
}

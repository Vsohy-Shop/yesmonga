package androidx.compose.foundation.lazy.grid;

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

@C11363r0({"SMAP\nLazyGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n116#2,2:123\n33#2,6:125\n118#2:131\n*S KotlinDebug\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n*L\n42#1:123,2\n42#1:125,6\n42#1:131\n*E\n"})
public final class LazyGridAnimateScrollScope implements C2542e {
    @C12579k

    /* renamed from: a */
    public final LazyGridState f6476a;

    public LazyGridAnimateScrollScope(@C12579k LazyGridState lazyGridState) {
        Intrinsics.checkNotNullParameter(lazyGridState, "state");
        this.f6476a = lazyGridState;
    }

    /* renamed from: a */
    public int mo8383a() {
        return this.f6476a.mo8523u().mo8550e();
    }

    /* renamed from: b */
    public void mo8384b(@C12579k C2201l lVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        this.f6476a.mo8512T(i, i2);
    }

    /* renamed from: c */
    public int mo8385c() {
        C2492h hVar = (C2492h) CollectionsKt___CollectionsKt.m40677q3(this.f6476a.mo8523u().mo8554i());
        if (hVar != null) {
            return hVar.getIndex();
        }
        return 0;
    }

    /* renamed from: d */
    public float mo8386d(int i, int i2) {
        boolean z;
        List<C2492h> i3 = this.f6476a.mo8523u().mo8554i();
        int E = this.f6476a.mo8498E();
        int j = mo8406j(i3, this.f6476a.mo8499F());
        int i4 = 1;
        if (i < mo8392i()) {
            z = true;
        } else {
            z = false;
        }
        int i5 = i - mo8392i();
        int i6 = E - 1;
        if (z) {
            i4 = -1;
        }
        int i7 = (i5 + (i6 * i4)) / E;
        int min = Math.min(Math.abs(i2), j);
        if (i2 < 0) {
            min *= -1;
        }
        return (((float) (j * i7)) + ((float) min)) - ((float) mo8391h());
    }

    @C12580l
    /* renamed from: e */
    public Integer mo8387e(int i) {
        C2492h hVar;
        int i2;
        boolean z;
        List<C2492h> i3 = this.f6476a.mo8523u().mo8554i();
        int size = i3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                hVar = null;
                break;
            }
            hVar = i3.get(i4);
            if (hVar.getIndex() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i4++;
        }
        C2492h hVar2 = hVar;
        if (hVar2 == null) {
            return null;
        }
        if (this.f6476a.mo8499F()) {
            i2 = C16494m.m74583o(hVar2.mo8582b());
        } else {
            i2 = C16494m.m74581m(hVar2.mo8582b());
        }
        return Integer.valueOf(i2);
    }

    @C12580l
    /* renamed from: f */
    public Object mo8388f(@C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object c = C2203n.m9563c(this.f6476a, (MutatePriority) null, pVar, cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* renamed from: g */
    public int mo8389g() {
        return this.f6476a.mo8498E() * 100;
    }

    @C12579k
    public C16479d getDensity() {
        return this.f6476a.mo8518p();
    }

    /* renamed from: h */
    public int mo8391h() {
        return this.f6476a.mo8520r();
    }

    /* renamed from: i */
    public int mo8392i() {
        return this.f6476a.mo8519q();
    }

    /* renamed from: j */
    public final int mo8406j(List<? extends C2492h> list, boolean z) {
        int i;
        C2460x964d917a lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 = new C2460x964d917a(z, list);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < list.size()) {
            int intValue = ((Number) lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke(Integer.valueOf(i2))).intValue();
            if (intValue == -1) {
                i2++;
            } else {
                int i5 = 0;
                while (i2 < list.size() && ((Number) lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke(Integer.valueOf(i2))).intValue() == intValue) {
                    if (z) {
                        i = C16500q.m74659j(((C2492h) list.get(i2)).mo8581a());
                    } else {
                        i = C16500q.m74662m(((C2492h) list.get(i2)).mo8581a());
                    }
                    i5 = Math.max(i5, i);
                    i2++;
                }
                i3 += i5;
                i4++;
            }
        }
        return i3 / i4;
    }
}

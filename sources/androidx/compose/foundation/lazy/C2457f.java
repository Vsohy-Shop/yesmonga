package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.foundation.lazy.layout.C2542e;
import androidx.compose.p004ui.unit.C16479d;
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

@C11363r0({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,65:1\n116#2,2:66\n33#2,6:68\n118#2:74\n132#2,3:75\n33#2,4:78\n135#2,2:82\n38#2:84\n137#2:85\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n44#1:66,2\n44#1:68,6\n44#1:74\n54#1:75,3\n54#1:78,4\n54#1:82,2\n54#1:84\n54#1:85\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.f */
public final class C2457f implements C2542e {
    @C12579k

    /* renamed from: a */
    public final LazyListState f6471a;

    /* renamed from: b */
    public final int f6472b = 100;

    public C2457f(@C12579k LazyListState lazyListState) {
        Intrinsics.checkNotNullParameter(lazyListState, "state");
        this.f6471a = lazyListState;
    }

    /* renamed from: a */
    public int mo8383a() {
        return this.f6471a.mo8343u().mo8374e();
    }

    /* renamed from: b */
    public void mo8384b(@C12579k C2201l lVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        this.f6471a.mo8332P(i, i2);
    }

    /* renamed from: c */
    public int mo8385c() {
        C2517l lVar = (C2517l) CollectionsKt___CollectionsKt.m40677q3(this.f6471a.mo8343u().mo8378i());
        if (lVar != null) {
            return lVar.getIndex();
        }
        return 0;
    }

    /* renamed from: d */
    public float mo8386d(int i, int i2) {
        List<C2517l> i3 = this.f6471a.mo8343u().mo8378i();
        int size = i3.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += i3.get(i5).getSize();
        }
        int size2 = i4 / i3.size();
        int i6 = i - mo8392i();
        int min = Math.min(Math.abs(i2), size2);
        if (i2 < 0) {
            min *= -1;
        }
        return (((float) (size2 * i6)) + ((float) min)) - ((float) mo8391h());
    }

    @C12580l
    /* renamed from: e */
    public Integer mo8387e(int i) {
        C2517l lVar;
        boolean z;
        List<C2517l> i2 = this.f6471a.mo8343u().mo8378i();
        int size = i2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                lVar = null;
                break;
            }
            lVar = i2.get(i3);
            if (lVar.getIndex() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i3++;
        }
        C2517l lVar2 = lVar;
        if (lVar2 != null) {
            return Integer.valueOf(lVar2.getOffset());
        }
        return null;
    }

    @C12580l
    /* renamed from: f */
    public Object mo8388f(@C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object c = C2203n.m9563c(this.f6471a, (MutatePriority) null, pVar, cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* renamed from: g */
    public int mo8389g() {
        return this.f6472b;
    }

    @C12579k
    public C16479d getDensity() {
        return this.f6471a.mo8338p();
    }

    /* renamed from: h */
    public int mo8391h() {
        return this.f6471a.mo8340r();
    }

    /* renamed from: i */
    public int mo8392i() {
        return this.f6471a.mo8339q();
    }
}

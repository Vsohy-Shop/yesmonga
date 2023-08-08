package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1673:1\n766#2:1674\n857#2,2:1675\n1549#2:1677\n1620#2,3:1678\n1#3:1681\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1\n*L\n1508#1:1674\n1508#1:1675,2\n1510#1:1677\n1510#1:1678,3\n*E\n"})
public final class TimePickerKt$CircularLayout$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ float f19909a;

    public TimePickerKt$CircularLayout$1(float f) {
        this.f19909a = f;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Object obj;
        Object obj2;
        C15611w0 w0Var;
        C15611w0 w0Var2;
        boolean z;
        boolean z2;
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        float g5 = h0Var2.mo7425g5(this.f19909a);
        long e = C16476b.m74351e(j, 0, 0, 0, 0, 10, (Object) null);
        Iterable iterable = list2;
        ArrayList<C15557e0> arrayList = new ArrayList<>();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C15557e0 e0Var = (C15557e0) next;
            if (C15594q.m69317a(e0Var) == LayoutId.Selector || C15594q.m69317a(e0Var) == LayoutId.InnerCircle) {
                z3 = false;
            }
            if (z3) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (C15557e0 t0 : arrayList) {
            arrayList2.add(t0.mo44324t0(e));
        }
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (C15594q.m69317a((C15557e0) obj) == LayoutId.Selector) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C15557e0 e0Var2 = (C15557e0) obj;
        Iterator it3 = iterable.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (C15594q.m69317a((C15557e0) obj2) == LayoutId.InnerCircle) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C15557e0 e0Var3 = (C15557e0) obj2;
        float size = 6.2831855f / ((float) arrayList2.size());
        if (e0Var2 != null) {
            w0Var = e0Var2.mo44324t0(e);
        } else {
            w0Var = null;
        }
        if (e0Var3 != null) {
            w0Var2 = e0Var3.mo44324t0(e);
        } else {
            w0Var2 = null;
        }
        return C15568h0.m69206r2(h0Var, C16476b.m74364r(j), C16476b.m74363q(j), (Map) null, new TimePickerKt$CircularLayout$1$measure$1(w0Var, arrayList2, w0Var2, j, g5, size), 4, (Object) null);
    }
}

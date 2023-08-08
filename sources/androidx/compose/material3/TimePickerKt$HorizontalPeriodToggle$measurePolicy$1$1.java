package androidx.compose.material3;

import androidx.compose.material3.tokens.C8306g1;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1673:1\n223#2,2:1674\n766#2:1676\n857#2,2:1677\n1549#2:1679\n1620#2,3:1680\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1\n*L\n886#1:1674,2\n894#1:1676\n894#1:1677,2\n894#1:1679\n894#1:1680,3\n*E\n"})
public final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 implements C15560f0 {

    /* renamed from: a */
    public static final TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 f19912a = new TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1();

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<C15557e0> iterable = list2;
        for (C15557e0 e0Var : iterable) {
            if (Intrinsics.areEqual(C15594q.m69317a(e0Var), (Object) "Spacer")) {
                C15611w0 t0 = e0Var.mo44324t0(C16476b.m74351e(j, 0, C11409d.m43851L0(h0Var.mo7425g5(C8306g1.f21226a.mo13654y())), 0, 0, 12, (Object) null));
                ArrayList<C15557e0> arrayList = new ArrayList<>();
                for (Object next : iterable) {
                    if (!Intrinsics.areEqual(C15594q.m69317a((C15557e0) next), (Object) "Spacer")) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
                for (C15557e0 t02 : arrayList) {
                    arrayList2.add(t02.mo44324t0(C16476b.m74351e(j, 0, C16476b.m74362p(j) / 2, 0, 0, 12, (Object) null)));
                }
                return C15568h0.m69206r2(h0Var, C16476b.m74362p(j), C16476b.m74361o(j), (Map) null, new TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$measure$1(arrayList2, t0), 4, (Object) null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

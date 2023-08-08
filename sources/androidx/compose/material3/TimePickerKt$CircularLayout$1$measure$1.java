package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$measure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1673:1\n1864#2,3:1674\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$measure$1\n*L\n1523#1:1674,3\n*E\n"})
public final class TimePickerKt$CircularLayout$1$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ long $constraints;
    final /* synthetic */ C15611w0 $innerCirclePlaceable;
    final /* synthetic */ List<C15611w0> $placeables;
    final /* synthetic */ float $radiusPx;
    final /* synthetic */ C15611w0 $selectorPlaceable;
    final /* synthetic */ float $theta;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$CircularLayout$1$measure$1(C15611w0 w0Var, List<? extends C15611w0> list, C15611w0 w0Var2, long j, float f, float f2) {
        super(1);
        this.$selectorPlaceable = w0Var;
        this.$placeables = list;
        this.$innerCirclePlaceable = w0Var2;
        this.$constraints = j;
        this.$radiusPx = f;
        this.$theta = f2;
    }

    /* renamed from: a */
    public final void mo12268a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0 w0Var = this.$selectorPlaceable;
        if (w0Var != null) {
            C15611w0.C15612a.m69412p(aVar, w0Var, 0, 0, 0.0f, 4, (Object) null);
        }
        long j = this.$constraints;
        float f = this.$radiusPx;
        float f2 = this.$theta;
        Iterator it = this.$placeables.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C15611w0 w0Var2 = (C15611w0) next;
            double d = (double) f;
            Iterator it2 = it;
            double d2 = ((double) (((float) i) * f2)) - 1.5707963267948966d;
            C15611w0.C15612a aVar2 = aVar;
            C15611w0.C15612a.m69412p(aVar2, w0Var2, C11409d.m43849K0((Math.cos(d2) * d) + ((double) ((C16476b.m74362p(j) / 2) - (w0Var2.mo44471K0() / 2)))), C11409d.m43849K0((d * Math.sin(d2)) + ((double) ((C16476b.m74361o(j) / 2) - (w0Var2.mo44468G0() / 2)))), 0.0f, 4, (Object) null);
            C15611w0.C15612a aVar3 = aVar;
            i = i2;
            it = it2;
        }
        C15611w0 w0Var3 = this.$innerCirclePlaceable;
        if (w0Var3 != null) {
            C15611w0.C15612a.m69412p(aVar, w0Var3, (C16476b.m74364r(this.$constraints) - this.$innerCirclePlaceable.mo44471K0()) / 2, (C16476b.m74363q(this.$constraints) - this.$innerCirclePlaceable.mo44468G0()) / 2, 0.0f, 4, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12268a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}

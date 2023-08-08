package androidx.compose.material;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,517:1\n1549#2:518\n1620#2,3:519\n1963#2,14:522\n92#3:536\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n*L\n156#1:518\n156#1:519,3\n160#1:522,14\n163#1:536\n*E\n"})
public final class TabRowKt$TabRow$2$1$1 extends Lambda implements C11304p<C15562f1, C16476b, C15564g0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $divider;
    final /* synthetic */ C11305q<List<C7906r1>, C8592o, Integer, C11079d2> $indicator;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2$1$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11305q<? super List<C7906r1>, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
        this.$$dirty = i;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo10623a(@C12579k C15562f1 f1Var, long j) {
        Object obj;
        int i;
        C15562f1 f1Var2 = f1Var;
        Intrinsics.checkNotNullParameter(f1Var2, "$this$SubcomposeLayout");
        int p = C16476b.m74362p(j);
        List<C15557e0> k0 = f1Var2.mo44296k0(TabSlots.Tabs, this.$tabs);
        int size = k0.size();
        int i2 = p / size;
        Iterable<C15557e0> iterable = k0;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C15557e0 t0 : iterable) {
            arrayList.add(t0.mo44324t0(C16476b.m74351e(j, i2, i2, 0, 0, 12, (Object) null)));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int G0 = ((C15611w0) obj).mo44468G0();
                do {
                    Object next = it.next();
                    int G02 = ((C15611w0) next).mo44468G0();
                    if (G0 < G02) {
                        obj = next;
                        G0 = G02;
                    }
                } while (it.hasNext());
            }
        }
        C15611w0 w0Var = (C15611w0) obj;
        if (w0Var != null) {
            i = w0Var.mo44468G0();
        } else {
            i = 0;
        }
        final ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(new C7906r1(C16483g.m74435M(f1Var2.mo7416L(i2) * ((float) i3)), f1Var2.mo7416L(i2), (DefaultConstructorMarker) null));
        }
        final C11304p<C8592o, Integer, C11079d2> pVar = this.$divider;
        final C11305q<List<C7906r1>, C8592o, Integer, C11079d2> qVar = this.$indicator;
        final ArrayList arrayList3 = arrayList;
        final C15562f1 f1Var3 = f1Var;
        final int i4 = i2;
        final long j2 = j;
        final int i5 = this.$$dirty;
        final int i6 = i;
        final int i7 = p;
        return C15568h0.m69206r2(f1Var, p, i, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* renamed from: a */
            public final void mo10624a(@C12579k C15611w0.C15612a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                int i = i4;
                int i2 = 0;
                for (Object next : arrayList3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    int i4 = i2 * i;
                    C15611w0.C15612a.m69414v(aVar, (C15611w0) next, i4, 0, 0.0f, 4, (Object) null);
                    i2 = i3;
                }
                long j = j2;
                int i5 = i6;
                for (C15557e0 t0 : f1Var3.mo44296k0(TabSlots.Divider, pVar)) {
                    C15611w0 t02 = t0.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null));
                    C15611w0.C15612a.m69414v(aVar, t02, 0, i5 - t02.mo44468G0(), 0.0f, 4, (Object) null);
                    i5 = i5;
                    j = j;
                }
                C15562f1 f1Var = f1Var3;
                TabSlots tabSlots = TabSlots.Indicator;
                final C11305q<List<C7906r1>, C8592o, Integer, C11079d2> qVar = qVar;
                final List<C7906r1> list = arrayList2;
                final int i6 = i5;
                int i7 = i7;
                int i8 = i6;
                for (C15557e0 t03 : f1Var.mo44296k0(tabSlots, C8553b.m31049c(-1341594997, true, new C11304p<C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        if ((i & 11) != 2 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(-1341594997, i, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                            }
                            qVar.invoke(list, oVar, Integer.valueOf(((i6 >> 9) & 112) | 8));
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        oVar.mo14958a0();
                    }
                }))) {
                    C15611w0.C15612a.m69414v(aVar, t03.mo44324t0(C16476b.f40850b.mo47810c(i7, i8)), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo10624a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo10623a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}

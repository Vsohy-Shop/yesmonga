package androidx.compose.material3;

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
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRow$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,505:1\n1789#2,3:506\n1549#2:509\n1620#2,3:510\n92#3:513\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRow$2$1$1\n*L\n156#1:506,3\n160#1:509\n160#1:510,3\n172#1:513\n*E\n"})
public final class TabRowKt$TabRow$2$1$1 extends Lambda implements C11304p<C15562f1, C16476b, C15564g0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $divider;
    final /* synthetic */ C11305q<List<C8184c3>, C8592o, Integer, C11079d2> $indicator;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2$1$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11305q<? super List<C8184c3>, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
        this.$$dirty = i;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo12167a(@C12579k C15562f1 f1Var, long j) {
        C15562f1 f1Var2 = f1Var;
        Intrinsics.checkNotNullParameter(f1Var2, "$this$SubcomposeLayout");
        int p = C16476b.m74362p(j);
        List<C15557e0> k0 = f1Var2.mo44296k0(TabSlots.Tabs, this.$tabs);
        int size = k0.size();
        final Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.element = p / size;
        }
        Iterable<C15557e0> iterable = k0;
        int i = 0;
        for (C15557e0 d : iterable) {
            i = Math.max(d.mo44320d(intRef.element), i);
        }
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C15557e0 t0 : iterable) {
            int i2 = intRef.element;
            arrayList.add(t0.mo44324t0(C16476b.m74350d(j, i2, i2, i, i)));
        }
        final ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(new C8184c3(C16483g.m74435M(f1Var2.mo7416L(intRef.element) * ((float) i3)), f1Var2.mo7416L(intRef.element), (DefaultConstructorMarker) null));
        }
        final C11304p<C8592o, Integer, C11079d2> pVar = this.$divider;
        final C11305q<List<C8184c3>, C8592o, Integer, C11079d2> qVar = this.$indicator;
        final int i4 = this.$$dirty;
        final ArrayList arrayList3 = arrayList;
        final C15562f1 f1Var3 = f1Var;
        final long j2 = j;
        final int i5 = i;
        final int i6 = p;
        return C15568h0.m69206r2(f1Var, p, i, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* renamed from: a */
            public final void mo12168a(@C12579k C15611w0.C15612a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                Ref.IntRef intRef = intRef;
                int i = 0;
                for (Object next : arrayList3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    int i3 = intRef.element * i;
                    C15611w0.C15612a.m69414v(aVar, (C15611w0) next, i3, 0, 0.0f, 4, (Object) null);
                    i = i2;
                }
                long j = j2;
                int i4 = i5;
                for (C15557e0 t0 : f1Var3.mo44296k0(TabSlots.Divider, pVar)) {
                    C15611w0 t02 = t0.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null));
                    C15611w0.C15612a.m69414v(aVar, t02, 0, i4 - t02.mo44468G0(), 0.0f, 4, (Object) null);
                    i4 = i4;
                    j = j;
                }
                C15562f1 f1Var = f1Var3;
                TabSlots tabSlots = TabSlots.Indicator;
                final C11305q<List<C8184c3>, C8592o, Integer, C11079d2> qVar = qVar;
                final List<C8184c3> list = arrayList2;
                final int i5 = i4;
                int i6 = i6;
                int i7 = i5;
                for (C15557e0 t03 : f1Var.mo44296k0(tabSlots, C8553b.m31049c(-976887453, true, new C11304p<C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        if ((i & 11) != 2 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(-976887453, i, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:184)");
                            }
                            qVar.invoke(list, oVar, Integer.valueOf(((i5 >> 9) & 112) | 8));
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        oVar.mo14958a0();
                    }
                }))) {
                    C15611w0.C15612a.m69414v(aVar, t03.mo44324t0(C16476b.f40850b.mo47810c(i6, i7)), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12168a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo12167a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}

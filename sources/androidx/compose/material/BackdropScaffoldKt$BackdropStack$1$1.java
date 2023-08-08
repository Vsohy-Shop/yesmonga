package androidx.compose.material;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8553b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,522:1\n151#2,3:523\n33#2,4:526\n154#2,2:530\n38#2:532\n156#2:533\n33#2,6:534\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1\n*L\n468#1:523,3\n468#1:526,4\n468#1:530,2\n468#1:532\n468#1:533\n472#1:534,6\n*E\n"})
public final class BackdropScaffoldKt$BackdropStack$1$1 extends Lambda implements C11304p<C15562f1, C16476b, C15564g0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $backLayer;
    final /* synthetic */ C11300l<C16476b, C16476b> $calculateBackLayerConstraints;
    final /* synthetic */ C11306r<C16476b, Float, C8592o, Integer, C11079d2> $frontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$1$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11300l<? super C16476b, C16476b> lVar, C11306r<? super C16476b, ? super Float, ? super C8592o, ? super Integer, C11079d2> rVar, int i) {
        super(2);
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$frontLayer = rVar;
        this.$$dirty = i;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo9985a(@C12579k C15562f1 f1Var, long j) {
        Intrinsics.checkNotNullParameter(f1Var, "$this$SubcomposeLayout");
        final C15611w0 t0 = ((C15557e0) CollectionsKt___CollectionsKt.m40706w2(f1Var.mo44296k0(BackdropLayers.Back, this.$backLayer))).mo44324t0(this.$calculateBackLayerConstraints.invoke(C16476b.m74348b(j)).mo47807x());
        List<C15557e0> k0 = f1Var.mo44296k0(BackdropLayers.Front, C8553b.m31049c(-1222642649, true, new BackdropScaffoldKt$BackdropStack$1$1$placeables$1(this.$frontLayer, j, (float) t0.mo44468G0(), this.$$dirty)));
        final ArrayList arrayList = new ArrayList(k0.size());
        int size = k0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(k0.get(i).mo44324t0(j));
        }
        int max = Math.max(C16476b.m74364r(j), t0.mo44471K0());
        int max2 = Math.max(C16476b.m74363q(j), t0.mo44468G0());
        int size2 = arrayList.size();
        int i2 = max2;
        int i3 = max;
        for (int i4 = 0; i4 < size2; i4++) {
            C15611w0 w0Var = (C15611w0) arrayList.get(i4);
            i3 = Math.max(i3, w0Var.mo44471K0());
            i2 = Math.max(i2, w0Var.mo44468G0());
        }
        return C15568h0.m69206r2(f1Var, i3, i2, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* renamed from: a */
            public final void mo9986a(@C12579k C15611w0.C15612a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                C15611w0.C15612a.m69414v(aVar, t0, 0, 0, 0.0f, 4, (Object) null);
                List<C15611w0> list = arrayList;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C15611w0.C15612a.m69414v(aVar, list.get(i), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9986a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo9985a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}

package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberRowHeightSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,493:1\n51#2:494\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberRowHeightSums$1$1\n*L\n194#1:494\n*E\n"})
public final class LazyGridDslKt$rememberRowHeightSums$1$1 extends Lambda implements C11304p<C16479d, C16476b, List<Integer>> {
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C2485c $rows;
    final /* synthetic */ Arrangement.C2279l $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberRowHeightSums$1$1(C2366i0 i0Var, C2485c cVar, Arrangement.C2279l lVar) {
        super(2);
        this.$contentPadding = i0Var;
        this.$rows = cVar;
        this.$verticalArrangement = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final List<Integer> mo8431a(@C12579k C16479d dVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(dVar, "$this$null");
        if (C16476b.m74361o(j) != Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<Integer> T5 = CollectionsKt___CollectionsKt.m40572T5(this.$rows.mo8556a(dVar, C16476b.m74361o(j) - dVar.mo7429n2(C16483g.m74435M(this.$contentPadding.mo8093d() + this.$contentPadding.mo8090a())), dVar.mo7429n2(this.$verticalArrangement.mo7658a())));
            int size = T5.size();
            for (int i = 1; i < size; i++) {
                T5.set(i, Integer.valueOf(T5.get(i).intValue() + T5.get(i - 1).intValue()));
            }
            return T5;
        }
        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo8431a((C16479d) obj, ((C16476b) obj2).mo47807x());
    }
}

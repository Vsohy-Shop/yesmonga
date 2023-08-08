package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreExceptionalOpeningsComponent$1 */
public final class C25363xd99384ce extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ List<C38154g> $openings;
    final /* synthetic */ boolean $showHorizontally;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25363xd99384ce(C8767m mVar, boolean z, List<C38154g> list, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$showHorizontally = z;
        this.$openings = list;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PhysicalStoreInfoOpeningsComponentKt.m109606c(this.$modifier, this.$showHorizontally, this.$openings, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

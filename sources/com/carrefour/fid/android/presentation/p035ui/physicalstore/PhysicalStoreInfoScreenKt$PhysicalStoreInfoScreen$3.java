package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27136a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27152g;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27156h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27160i;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27164j;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$3 */
public final class PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<C27136a, C11079d2> $actioner;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C27152g $petrolState;
    final /* synthetic */ C27156h $reviewState;
    final /* synthetic */ C27160i $servicesState;
    final /* synthetic */ C27164j.C27167c $storeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$3(C8767m mVar, C27164j.C27167c cVar, C27160i iVar, C27152g gVar, C27156h hVar, C11300l<? super C27136a, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$storeState = cVar;
        this.$servicesState = iVar;
        this.$petrolState = gVar;
        this.$reviewState = hVar;
        this.$actioner = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PhysicalStoreInfoScreenKt.m109436a(this.$modifier, this.$storeState, this.$servicesState, this.$petrolState, this.$reviewState, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

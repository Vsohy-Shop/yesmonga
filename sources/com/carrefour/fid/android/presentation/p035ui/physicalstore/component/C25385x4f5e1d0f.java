package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.platform.C16007z3;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.RepairabilityKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolComponentKt$PhysicalStorePetrolSourceComponent$3 */
public final class C25385x4f5e1d0f extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ String $link;
    final /* synthetic */ C11289a<C11079d2> $onPetrolSourceClicked;
    final /* synthetic */ C16007z3 $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25385x4f5e1d0f(C11289a<C11079d2> aVar, C16007z3 z3Var, String str) {
        super(0);
        this.$onPetrolSourceClicked = aVar;
        this.$uriHandler = z3Var;
        this.$link = str;
    }

    public final void invoke() {
        this.$onPetrolSourceClicked.invoke();
        RepairabilityKt.m117277t(this.$uriHandler, this.$link);
    }
}

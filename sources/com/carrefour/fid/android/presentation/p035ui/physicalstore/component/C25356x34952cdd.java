package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.platform.C16007z3;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.RepairabilityKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3$1$2 */
public final class C25356x34952cdd extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ String $directionUri;
    final /* synthetic */ C11289a<C11079d2> $onDirectionClicked;
    final /* synthetic */ C16007z3 $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25356x34952cdd(C11289a<C11079d2> aVar, C16007z3 z3Var, String str) {
        super(0);
        this.$onDirectionClicked = aVar;
        this.$uriHandler = z3Var;
        this.$directionUri = str;
    }

    public final void invoke() {
        this.$onDirectionClicked.invoke();
        RepairabilityKt.m117277t(this.$uriHandler, this.$directionUri);
    }
}

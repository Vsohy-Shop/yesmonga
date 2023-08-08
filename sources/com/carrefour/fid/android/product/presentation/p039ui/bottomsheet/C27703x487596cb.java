package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$5 */
public final class C27703x487596cb extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C28892e<List<C38114b>> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27703x487596cb(C28892e<? extends List<C38114b>> eVar) {
        super(0);
        this.$state = eVar;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$state instanceof C28892e.C28893a);
    }
}

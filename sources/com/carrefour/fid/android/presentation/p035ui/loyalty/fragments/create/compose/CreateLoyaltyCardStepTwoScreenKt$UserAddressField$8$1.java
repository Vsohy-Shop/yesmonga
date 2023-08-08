package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24396c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$8$1 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserAddressField$8$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C11300l<C24396c, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserAddressField$8$1(C11300l<? super C24396c, C11079d2> lVar) {
        super(1);
        this.$actioner = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        this.$actioner.invoke(new C24396c.C24401e(str));
        if (str.length() == 0) {
            this.$actioner.invoke(new C24396c.C24403g(CreateLoyaltyCardStepTwoScreenKt.f60832d, C24390b.C24392b.f60851a));
        }
    }
}

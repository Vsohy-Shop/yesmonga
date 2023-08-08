package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.p004ui.focus.C15087z;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24396c;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$9 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserAddressField$9 extends Lambda implements C11300l<C15087z, C11079d2> {
    final /* synthetic */ C11300l<C24396c, C11079d2> $actioner;
    final /* synthetic */ String $city;
    final /* synthetic */ Map<String, C24390b> $textFieldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserAddressField$9(String str, C11300l<? super C24396c, C11079d2> lVar, Map<String, ? extends C24390b> map) {
        super(1);
        this.$city = str;
        this.$actioner = lVar;
        this.$textFieldState = map;
    }

    /* renamed from: a */
    public final void mo71315a(@C12579k C15087z zVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(zVar, "it");
        boolean z2 = true;
        if (!zVar.mo42156g()) {
            if (this.$city.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.$actioner.invoke(new C24396c.C24403g(CreateLoyaltyCardStepTwoScreenKt.f60833e, C24390b.C24395e.f60857a));
                return;
            }
        }
        if (zVar.mo42156g()) {
            if (this.$city.length() != 0) {
                z2 = false;
            }
            if (z2) {
                this.$actioner.invoke(new C24396c.C24403g(CreateLoyaltyCardStepTwoScreenKt.f60833e, C24390b.C24391a.f60849a));
                return;
            }
        }
        if (!zVar.mo42156g() && (this.$textFieldState.get(CreateLoyaltyCardStepTwoScreenKt.f60833e) instanceof C24390b.C24391a)) {
            this.$actioner.invoke(new C24396c.C24403g(CreateLoyaltyCardStepTwoScreenKt.f60833e, C24390b.C24392b.f60851a));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo71315a((C15087z) obj);
        return C11079d2.f28267a;
    }
}

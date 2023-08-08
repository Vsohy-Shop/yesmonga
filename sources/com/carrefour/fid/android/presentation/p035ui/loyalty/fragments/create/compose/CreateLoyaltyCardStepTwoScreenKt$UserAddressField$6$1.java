package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCreateLoyaltyCardStepTwoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateLoyaltyCardStepTwoScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,838:1\n136#2,12:839\n*S KotlinDebug\n*F\n+ 1 CreateLoyaltyCardStepTwoScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1\n*L\n498#1:839,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C24396c, C11079d2> $actioner;
    final /* synthetic */ List<DQEAddressModel> $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1(List<DQEAddressModel> list, C11300l<? super C24396c, C11079d2> lVar, int i) {
        super(1);
        this.$it = list;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        List<DQEAddressModel> list = this.$it;
        C11300l<C24396c, C11079d2> lVar = this.$actioner;
        int i = this.$$dirty;
        lazyListScope.mo8310k(list.size(), (C11300l<? super Integer, ? extends Object>) null, new C24376x7f648690(C24374x7f64868e.f60834f, list), C8553b.m31049c(-632812321, true, new C24377x7f648691(list, lVar, i, list)));
    }
}

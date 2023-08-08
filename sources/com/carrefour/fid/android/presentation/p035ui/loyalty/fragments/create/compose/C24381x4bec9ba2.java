package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.snapshots.C8667t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$3$1 */
public final class C24381x4bec9ba2 extends Lambda implements C11304p<String, C24390b, C11079d2> {
    final /* synthetic */ C8667t<String, C24390b> $inputLoyaltyFieldStateMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24381x4bec9ba2(C8667t<String, C24390b> tVar) {
        super(2);
        this.$inputLoyaltyFieldStateMap = tVar;
    }

    /* renamed from: a */
    public final void mo71282a(@C12579k String str, @C12579k C24390b bVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(bVar, "value");
        this.$inputLoyaltyFieldStateMap.put(str, bVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo71282a((String) obj, (C24390b) obj2);
        return C11079d2.f28267a;
    }
}

package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24166a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$WithLoyaltyCard$1$1$1 */
public final class LoyaltyBlocStatefullKt$WithLoyaltyCard$1$1$1 extends Lambda implements C11305q<String, String, String, C11079d2> {
    final /* synthetic */ C11300l<C24166a, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBlocStatefullKt$WithLoyaltyCard$1$1$1(C11300l<? super C24166a, C11079d2> lVar) {
        super(3);
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo70715a(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "opCode");
        Intrinsics.checkNotNullParameter(str2, "webViewUrl");
        Intrinsics.checkNotNullParameter(str3, "webViewTitle");
        this.$actioner.invoke(new C24166a.C24171e(str, str2, str3));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo70715a((String) obj, (String) obj2, (String) obj3);
        return C11079d2.f28267a;
    }
}

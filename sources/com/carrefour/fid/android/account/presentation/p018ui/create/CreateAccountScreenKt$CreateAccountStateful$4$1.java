package com.carrefour.fid.android.account.presentation.p018ui.create;

import com.carrefour.fid.android.account.presentation.p018ui.create.C13488a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$4$1 */
public final class CreateAccountScreenKt$CreateAccountStateful$4$1 extends Lambda implements C11300l<C13488a, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11300l<String, C11079d2> $onExternalLinkClicked;
    final /* synthetic */ C11289a<C11079d2> $onSignInClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAccountScreenKt$CreateAccountStateful$4$1(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11300l<? super String, C11079d2> lVar) {
        super(1);
        this.$onSignInClicked = aVar;
        this.$onBackPressed = aVar2;
        this.$onExternalLinkClicked = lVar;
    }

    /* renamed from: a */
    public final void mo32048a(@C12579k C13488a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (Intrinsics.areEqual((Object) aVar, (Object) C13488a.C13491c.f32968a)) {
            this.$onSignInClicked.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C13488a.C13489a.f32964a)) {
            this.$onBackPressed.invoke();
        } else if (aVar instanceof C13488a.C13490b) {
            this.$onExternalLinkClicked.invoke(((C13488a.C13490b) aVar).mo32052d());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo32048a((C13488a) obj);
        return C11079d2.f28267a;
    }
}

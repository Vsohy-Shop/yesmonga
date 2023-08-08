package com.carrefour.fid.android.presentation.p035ui.home.arsenalGame;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBottomBannersHomeStateful$1$1 */
public final class C24116x6f953c6a extends Lambda implements C11305q<String, String, String, C11079d2> {
    final /* synthetic */ C11305q<String, String, String, C11079d2> $OnArsenalBannerClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24116x6f953c6a(C11305q<? super String, ? super String, ? super String, C11079d2> qVar) {
        super(3);
        this.$OnArsenalBannerClicked = qVar;
    }

    /* renamed from: a */
    public final void mo70493a(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "gameUrl");
        Intrinsics.checkNotNullParameter(str3, "webViewTitle");
        this.$OnArsenalBannerClicked.invoke(str, str2, str3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo70493a((String) obj, (String) obj2, (String) obj3);
        return C11079d2.f28267a;
    }
}

package com.carrefour.fid.android.presentation.p035ui.home;

import android.os.Bundle;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/d2;", "a", "(Ljava/lang/String;Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$showUserConsent$1 */
public final class HomePageFragment$showUserConsent$1 extends Lambda implements C11304p<String, Bundle, C11079d2> {
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$showUserConsent$1(HomePageFragment homePageFragment) {
        super(2);
        this.this$0 = homePageFragment;
    }

    /* renamed from: a */
    public final void mo70488a(@C12579k String str, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.this$0.mo70419t1().sendIntent(C26406a.C26407a.C26427o.f64641a);
        this.this$0.mo70370C1(bundle);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo70488a((String) obj, (Bundle) obj2);
        return C11079d2.f28267a;
    }
}

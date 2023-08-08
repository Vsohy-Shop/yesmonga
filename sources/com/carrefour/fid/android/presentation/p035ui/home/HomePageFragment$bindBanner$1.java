package com.carrefour.fid.android.presentation.p035ui.home;

import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "redirectUrl", "onClickBeacon", "Lkotlin/d2;", "a", "(Ljava/lang/String;Ljava/lang/String;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$bindBanner$1 */
public final class HomePageFragment$bindBanner$1 extends Lambda implements C11304p<String, String, C11079d2> {
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$bindBanner$1(HomePageFragment homePageFragment) {
        super(2);
        this.this$0 = homePageFragment;
    }

    /* renamed from: a */
    public final void mo70449a(@C12579k final String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, "redirectUrl");
        if (C11622t.startsWith$default(str, "http", false, 2, (Object) null)) {
            final HomePageFragment homePageFragment = this.this$0;
            FragmentKt.m118829q(homePageFragment, (String) null, (String) null, new C11289a<C11079d2>() {
                public final void invoke() {
                    FragmentKt.m118812C(homePageFragment, str);
                }
            }, 3, (Object) null);
        } else {
            FragmentExtensionKt.m58767r(this.this$0, str);
        }
        if (str2 != null) {
            this.this$0.mo70419t1().sendIntent(new C26406a.C26407a.C26429q(str2));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo70449a((String) obj, (String) obj2);
        return C11079d2.f28267a;
    }
}

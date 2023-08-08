package com.carrefour.fid.android.presentation.p035ui.home;

import com.carrefour.fid.android.presentation.models.C38492i;
import com.carrefour.fid.android.storelocator.utils.C28992a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nHomePageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePageFragment.kt\ncom/carrefour/fid/android/presentation/ui/home/HomePageFragment$displayOrderStatus$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1284:1\n1#2:1285\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$displayOrderStatus$1 */
public final class HomePageFragment$displayOrderStatus$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C38492i $homeOrderModel;
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$displayOrderStatus$1(C38492i iVar, HomePageFragment homePageFragment) {
        super(0);
        this.$homeOrderModel = iVar;
        this.this$0 = homePageFragment;
    }

    public final void invoke() {
        String n = this.$homeOrderModel.mo122079n();
        if (n != null) {
            this.this$0.startActivity(C28992a.f71082a.mo84427a(n));
        }
    }
}

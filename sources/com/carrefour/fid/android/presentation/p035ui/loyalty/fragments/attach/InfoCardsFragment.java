package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.attach;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36711h2;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAnalyticsInterfaceDelegate;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24224b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/attach/InfoCardsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/h2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "initListeners", "X0", "W0", "", "position", "Landroid/content/Context;", "context", "T0", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;", "f", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;", "S0", "()Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;", "V0", "(Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;)V", "loyaltyAnalytics", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.InfoCardsFragment */
public final class InfoCardsFragment extends C24275m<C36711h2> {

    /* renamed from: g */
    public static final int f60650g = 8;
    @Inject

    /* renamed from: f */
    public LoyaltyAnalyticsInterfaceDelegate f60651f;

    @C11363r0({"SMAP\nInfoCardsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoCardsFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/attach/InfoCardsFragment$setUpPagerListener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.InfoCardsFragment$a */
    public static final class C24259a implements ViewPager.C20779j {

        /* renamed from: a */
        public final /* synthetic */ InfoCardsFragment f60653a;

        public C24259a(InfoCardsFragment infoCardsFragment) {
            this.f60653a = infoCardsFragment;
        }

        /* renamed from: d */
        public void mo30672d(int i, float f, int i2) {
        }

        /* renamed from: e */
        public void mo30673e(int i) {
        }

        /* renamed from: f */
        public void mo30674f(int i) {
            Context context = this.f60653a.getContext();
            if (context != null) {
                this.f60653a.mo70988T0(i, context);
            }
        }
    }

    public InfoCardsFragment() {
        super(C242581.f60652a);
    }

    /* renamed from: U0 */
    public static final void m106744U0(InfoCardsFragment infoCardsFragment, View view) {
        Intrinsics.checkNotNullParameter(infoCardsFragment, "this$0");
        C19232h activity = infoCardsFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @C12579k
    /* renamed from: S0 */
    public final LoyaltyAnalyticsInterfaceDelegate mo70987S0() {
        LoyaltyAnalyticsInterfaceDelegate loyaltyAnalyticsInterfaceDelegate = this.f60651f;
        if (loyaltyAnalyticsInterfaceDelegate != null) {
            return loyaltyAnalyticsInterfaceDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loyaltyAnalytics");
        return null;
    }

    /* renamed from: T0 */
    public final void mo70988T0(int i, Context context) {
        if (i == 0) {
            ((C36711h2) getBinding()).f90940b.setImageDrawable(C17318d.m79726i(context, R.drawable.selected_dot));
            ((C36711h2) getBinding()).f90944f.setImageDrawable(C17318d.m79726i(context, R.drawable.ic_icon_carte_pass));
            ((C36711h2) getBinding()).f90941c.setImageDrawable(C17318d.m79726i(context, R.drawable.unselected_dot));
            ((C36711h2) getBinding()).f90943e.setImageDrawable(C17318d.m79726i(context, R.drawable.ic_icon_carte_grey));
            mo70987S0().sendScreenViewPassCard();
            return;
        }
        ((C36711h2) getBinding()).f90941c.setImageDrawable(C17318d.m79726i(context, R.drawable.selected_dot));
        ((C36711h2) getBinding()).f90944f.setImageDrawable(C17318d.m79726i(context, R.drawable.ic_icon_carte_pass_grey));
        ((C36711h2) getBinding()).f90940b.setImageDrawable(C17318d.m79726i(context, R.drawable.unselected_dot));
        ((C36711h2) getBinding()).f90943e.setImageDrawable(C17318d.m79726i(context, R.drawable.ic_icon_carte_fid));
        mo70987S0().sendScreenViewLoyaltyCard();
    }

    /* renamed from: V0 */
    public final void mo70989V0(@C12579k LoyaltyAnalyticsInterfaceDelegate loyaltyAnalyticsInterfaceDelegate) {
        Intrinsics.checkNotNullParameter(loyaltyAnalyticsInterfaceDelegate, "<set-?>");
        this.f60651f = loyaltyAnalyticsInterfaceDelegate;
    }

    /* renamed from: W0 */
    public final void mo70990W0() {
        ((C36711h2) getBinding()).f90942d.mo62329c(new C24259a(this));
    }

    /* renamed from: X0 */
    public final void mo70991X0() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        ((C36711h2) getBinding()).f90942d.setAdapter(new C24224b(childFragmentManager, CollectionsKt__CollectionsKt.m40463r(C24278o.f60689a.mo71032a(), C24276n.f60687a.mo71031a())));
        ((C36711h2) getBinding()).f90942d.setOffscreenPageLimit(2);
    }

    public final void initListeners() {
        ((C36711h2) getBinding()).f90945g.setOnClickListener(new C24280p(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
        mo70991X0();
        mo70990W0();
        initListeners();
        mo70987S0().sendScreenViewLoyaltyCard();
    }
}

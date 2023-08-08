package com.carrefour.fid.android.rgpd.cookies.p040ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36758m;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25805g;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/rgpd/cookies/ui/CookiesTracersPolicyFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "K0", "Lcom/carrefour/fid/android/presentation/viewmodels/account/home/g;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/account/home/g;", "J0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/home/g;", "L0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/home/g;)V", "viewModel", "Lcom/carrefour/fid/android/databinding/m;", "g", "Lkotlin/z;", "I0", "()Lcom/carrefour/fid/android/databinding/m;", "binding", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.rgpd.cookies.ui.CookiesTracersPolicyFragment */
public final class CookiesTracersPolicyFragment extends C28231c {

    /* renamed from: v */
    public static final int f68358v = 8;
    @Inject

    /* renamed from: f */
    public C25805g f68359f;
    @C12579k

    /* renamed from: g */
    public final C11677z f68360g = C10864b0.m38748c(new CookiesTracersPolicyFragment$binding$2(this));

    /* renamed from: I0 */
    public final C36758m mo82184I0() {
        return (C36758m) this.f68360g.getValue();
    }

    @C12579k
    /* renamed from: J0 */
    public final C25805g mo82185J0() {
        C25805g gVar = this.f68359f;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    /* renamed from: K0 */
    public final void mo82186K0() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.politique_des_cookies);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
        mo82184I0().f91232b.loadUrl(C28547h2.f69324l);
    }

    /* renamed from: L0 */
    public final void mo82187L0(@C12579k C25805g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f68359f = gVar;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        WebView b = mo82184I0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo82186K0();
        mo82185J0().mo74907a();
    }
}

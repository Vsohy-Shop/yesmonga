package com.carrefour.fid.android.presentation.p035ui.account.menu;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28909d;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/menu/AccountMenuFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "", "userHasMessages", "N0", "O0", "Lcom/carrefour/fid/android/presentation/viewmodels/account/home/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/account/home/a;", "K0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/home/a;", "P0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/home/a;)V", "accountMenuAnalyticsHandler", "Lcom/carrefour/fid/android/shared/util/d;", "g", "Lcom/carrefour/fid/android/shared/util/d;", "M0", "()Lcom/carrefour/fid/android/shared/util/d;", "R0", "(Lcom/carrefour/fid/android/shared/util/d;)V", "applicationBuildInfo", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "v", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "L0", "()Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "Q0", "(Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;)V", "appPreferencesStorage", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuFragment */
public final class AccountMenuFragment extends C23140d {

    /* renamed from: w */
    public static final int f58759w = 8;
    @Inject

    /* renamed from: f */
    public C25796a f58760f;
    @Inject

    /* renamed from: g */
    public C28909d f58761g;
    @Inject

    /* renamed from: v */
    public AppPreferencesStorage f58762v;

    @C12579k
    /* renamed from: K0 */
    public final C25796a mo67813K0() {
        C25796a aVar = this.f58760f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountMenuAnalyticsHandler");
        return null;
    }

    @C12579k
    /* renamed from: L0 */
    public final AppPreferencesStorage mo67814L0() {
        AppPreferencesStorage appPreferencesStorage = this.f58762v;
        if (appPreferencesStorage != null) {
            return appPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appPreferencesStorage");
        return null;
    }

    @C12579k
    /* renamed from: M0 */
    public final C28909d mo67815M0() {
        C28909d dVar = this.f58761g;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationBuildInfo");
        return null;
    }

    /* renamed from: N0 */
    public final void mo67816N0(boolean z) {
        if (z) {
            mo67813K0().mo74884e();
            FragmentKt.m118823k(this, C23104a.f58763a.mo67834j());
            return;
        }
        NotificationComponent.Variant variant = NotificationComponent.Variant.WARNING;
        String string = getString(R.string.inbox_notif_empty_messages_retry_later);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.inbox…pty_messages_retry_later)");
        FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: O0 */
    public final void mo67817O0() {
        NotificationComponent.Variant variant = NotificationComponent.Variant.SUCCESS;
        String string = getString(R.string.inbox_notif_opt_out_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.inbox_notif_opt_out_message)");
        FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: P0 */
    public final void mo67818P0(@C12579k C25796a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58760f = aVar;
    }

    /* renamed from: Q0 */
    public final void mo67819Q0(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "<set-?>");
        this.f58762v = appPreferencesStorage;
    }

    /* renamed from: R0 */
    public final void mo67820R0(@C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f58761g = dVar;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(1419664610, true, new AccountMenuFragment$onCreateView$1$1(this, composeView)));
        return composeView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
    }
}

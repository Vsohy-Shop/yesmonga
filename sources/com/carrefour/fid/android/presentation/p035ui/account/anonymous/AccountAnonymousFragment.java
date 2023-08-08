package com.carrefour.fid.android.presentation.p035ui.account.anonymous;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36877y;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.viewmodels.account.anonymous.C25755a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28909d;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/anonymous/AccountAnonymousFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/y;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "Lcom/carrefour/fid/android/presentation/viewmodels/account/anonymous/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/account/anonymous/a;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/anonymous/a;", "Z0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/anonymous/a;)V", "accountAnonymousAnalyticsViewModel", "Lcom/carrefour/fid/android/shared/util/d;", "g", "Lcom/carrefour/fid/android/shared/util/d;", "U0", "()Lcom/carrefour/fid/android/shared/util/d;", "a1", "(Lcom/carrefour/fid/android/shared/util/d;)V", "applicationBuildInfo", "Lcom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage;", "v", "Lcom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage;", "V0", "()Lcom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage;", "b1", "(Lcom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage;)V", "baseAppPreferencesStorage", "<init>", "()V", "w", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.anonymous.AccountAnonymousFragment */
public final class AccountAnonymousFragment extends C22886g<C36877y> {
    @C12579k

    /* renamed from: w */
    public static final C22878a f58460w = new C22878a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f58461x = 8;
    @C12579k

    /* renamed from: y */
    public static final String f58462y = "AccountAnonymousFragment";
    @Inject

    /* renamed from: f */
    public C25755a f58463f;
    @Inject

    /* renamed from: g */
    public C28909d f58464g;
    @Inject

    /* renamed from: v */
    public BaseAppPreferencesStorage f58465v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.anonymous.AccountAnonymousFragment$a */
    public static final class C22878a {
        public /* synthetic */ C22878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C22878a() {
        }
    }

    public AccountAnonymousFragment() {
        super(C228771.f58466a);
    }

    /* renamed from: W0 */
    public static final void m103175W0(AccountAnonymousFragment accountAnonymousFragment, View view) {
        Intrinsics.checkNotNullParameter(accountAnonymousFragment, "this$0");
        view.setEnabled(false);
        accountAnonymousFragment.mo67344T0().mo74790c("mon-compte");
        FragmentExtensionKt.m58770u(accountAnonymousFragment, false, R.anim.slide_in_up, R.anim.no_change, 0, (Bundle) null, 24, (Object) null);
    }

    /* renamed from: X0 */
    public static final void m103176X0(AccountAnonymousFragment accountAnonymousFragment, View view) {
        Intrinsics.checkNotNullParameter(accountAnonymousFragment, "this$0");
        view.setEnabled(false);
        accountAnonymousFragment.mo67344T0().mo74789b();
        FragmentKt.m118823k(accountAnonymousFragment, C22882d.f58472a.mo67356a());
    }

    /* renamed from: Y0 */
    public static final boolean m103177Y0(AccountAnonymousFragment accountAnonymousFragment, TextView textView, View view) {
        Intrinsics.checkNotNullParameter(accountAnonymousFragment, "this$0");
        Intrinsics.checkNotNullParameter(textView, "$this_apply");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(accountAnonymousFragment), (CoroutineContext) null, (CoroutineStart) null, new AccountAnonymousFragment$onViewCreated$4$1$1(accountAnonymousFragment, textView, (C11045c<? super AccountAnonymousFragment$onViewCreated$4$1$1>) null), 3, (Object) null);
        return true;
    }

    @C12579k
    /* renamed from: T0 */
    public final C25755a mo67344T0() {
        C25755a aVar = this.f58463f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountAnonymousAnalyticsViewModel");
        return null;
    }

    @C12579k
    /* renamed from: U0 */
    public final C28909d mo67345U0() {
        C28909d dVar = this.f58464g;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationBuildInfo");
        return null;
    }

    @C12579k
    /* renamed from: V0 */
    public final BaseAppPreferencesStorage mo67346V0() {
        BaseAppPreferencesStorage baseAppPreferencesStorage = this.f58465v;
        if (baseAppPreferencesStorage != null) {
            return baseAppPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseAppPreferencesStorage");
        return null;
    }

    /* renamed from: Z0 */
    public final void mo67347Z0(@C12579k C25755a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58463f = aVar;
    }

    /* renamed from: a1 */
    public final void mo67348a1(@C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f58464g = dVar;
    }

    /* renamed from: b1 */
    public final void mo67349b1(@C12579k BaseAppPreferencesStorage baseAppPreferencesStorage) {
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "<set-?>");
        this.f58465v = baseAppPreferencesStorage;
    }

    public void onResume() {
        super.onResume();
        ((C36877y) getBinding()).f91940c.setEnabled(true);
        ((C36877y) getBinding()).f91939b.setEnabled(true);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h requireActivity = requireActivity();
        if (requireActivity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) requireActivity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, AccountAnonymousFragment$onViewCreated$1$1.f58467f, 1, (Object) null);
        }
        mo67344T0().mo74788a();
        ((C36877y) getBinding()).f91940c.setOnClickListener(new C22879a(this));
        ((C36877y) getBinding()).f91939b.setOnClickListener(new C22880b(this));
        TextView textView = ((C36877y) getBinding()).f91944g;
        textView.setText(mo67345U0().mo84152c());
        textView.setOnLongClickListener(new C22881c(this, textView));
    }
}

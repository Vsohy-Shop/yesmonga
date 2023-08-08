package com.carrefour.fid.android.account.presentation.p018ui.success;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19499w;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13217d;
import com.carrefour.fid.android.account.presentation.analytics.C13294h;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.C28755g;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.tracking.C28994a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/success/AccountUpdateSuccessFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "a1", "Lkotlin/Pair;", "", "Y0", "initListeners", "b1", "Z0", "U0", "Lcom/carrefour/fid/android/account/presentation/analytics/h;", "f", "Lcom/carrefour/fid/android/account/presentation/analytics/h;", "W0", "()Lcom/carrefour/fid/android/account/presentation/analytics/h;", "c1", "(Lcom/carrefour/fid/android/account/presentation/analytics/h;)V", "analyticsDelegate", "Lcom/carrefour/fid/android/tracking/a;", "g", "Lcom/carrefour/fid/android/tracking/a;", "X0", "()Lcom/carrefour/fid/android/tracking/a;", "d1", "(Lcom/carrefour/fid/android/tracking/a;)V", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/account/presentation/ui/success/a;", "w", "Landroidx/navigation/m;", "V0", "()Lcom/carrefour/fid/android/account/presentation/ui/success/a;", "accountUpdateSuccessFragmentArgs", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountUpdateSuccessFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountUpdateSuccessFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/success/AccountUpdateSuccessFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,125:1\n42#2,3:126\n75#3,2:129\n75#3,2:131\n*S KotlinDebug\n*F\n+ 1 AccountUpdateSuccessFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/success/AccountUpdateSuccessFragment\n*L\n40#1:126,3\n77#1:129,2\n90#1:131,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment */
public final class AccountUpdateSuccessFragment extends C13561e<C13217d> {
    @Inject

    /* renamed from: f */
    public C13294h f33039f;
    @Inject

    /* renamed from: g */
    public C28994a f33040g;
    @Inject

    /* renamed from: v */
    public C28796c f33041v;
    @C12579k

    /* renamed from: w */
    public final C19766m f33042w = new C19766m(C11342l0.m43547d(C13555a.class), new AccountUpdateSuccessFragment$special$$inlined$navArgs$1(this));

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment$a */
    public /* synthetic */ class C13551a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.account.presentation.models.NameLastView[] r0 = com.carrefour.fid.android.account.presentation.models.NameLastView.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.account.presentation.models.NameLastView r1 = com.carrefour.fid.android.account.presentation.models.NameLastView.FORGOTPASSWORD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.account.presentation.models.NameLastView r1 = com.carrefour.fid.android.account.presentation.models.NameLastView.UPDATEEMAIL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.p018ui.success.AccountUpdateSuccessFragment.C13551a.<clinit>():void");
        }
    }

    public AccountUpdateSuccessFragment() {
        super(C135501.f33043a);
    }

    /* renamed from: U0 */
    public final void mo32153U0() {
        C19232h activity = getActivity();
        if (activity != null) {
            C28755g.m119048b(activity, -1, C13144b.C13145a.no_change, C13144b.C13145a.slide_out_down, (Intent) null, 8, (Object) null);
        }
    }

    /* renamed from: V0 */
    public final C13555a mo32154V0() {
        return (C13555a) this.f33042w.getValue();
    }

    @C12579k
    /* renamed from: W0 */
    public final C13294h mo32155W0() {
        C13294h hVar = this.f33039f;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsDelegate");
        return null;
    }

    @C12579k
    /* renamed from: X0 */
    public final C28994a mo32156X0() {
        C28994a aVar = this.f33040g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audienceTrackingAdapter");
        return null;
    }

    /* renamed from: Y0 */
    public final Pair<String, String> mo32157Y0() {
        int i = C13551a.$EnumSwitchMapping$0[mo32154V0().mo32176g().ordinal()];
        if (i == 1) {
            return new Pair<>(getString(C13144b.C13163s.sign_in_authentication_pwd_forgotten_success, mo32154V0().mo32177h()), getString(C13144b.C13163s.sign_in_authentication_pwd_forgotten_success_title));
        } else if (i == 2) {
            return new Pair<>(getString(C13144b.C13163s.account_update_user_email_updated_message, mo32154V0().mo32177h()), getString(C13144b.C13163s.account_update_user_email_updated_title));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: Z0 */
    public final void mo32158Z0() {
        if (C13551a.$EnumSwitchMapping$0[mo32154V0().mo32176g().ordinal()] == 2) {
            getNavigator().mo83833i(C19736g.m91827a(this));
            getNavigator().mo83841q(this);
            return;
        }
        mo32153U0();
    }

    /* renamed from: a1 */
    public final void mo32159a1() {
        C13217d dVar = (C13217d) getBinding();
        Pair<String, String> Y0 = mo32157Y0();
        dVar.f32430c.setText(Y0.mo21849e());
        dVar.f32431d.setText(Y0.mo21851f());
    }

    /* renamed from: b1 */
    public final void mo32160b1() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        startActivity(Intent.createChooser(intent, getResources().getString(C13144b.C13163s.account_my_identifiers_btn_update_open_mail_success)));
        mo32155W0().mo31596b(mo32154V0().mo32176g());
    }

    /* renamed from: c1 */
    public final void mo32161c1(@C12579k C13294h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f33039f = hVar;
    }

    /* renamed from: d1 */
    public final void mo32162d1(@C12579k C28994a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f33040g = aVar;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f33041v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void initListeners() {
        C13217d dVar = (C13217d) getBinding();
        TextView textView = dVar.f32433f;
        Intrinsics.checkNotNullExpressionValue(textView, "successOpenMailTxt");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(textView), new AccountUpdateSuccessFragment$initListeners$1$1(this, (C11045c<? super AccountUpdateSuccessFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C13552xc61f7103((C11045c) null));
        Button button = dVar.f32432e;
        Intrinsics.checkNotNullExpressionValue(button, "btnSuccessMeConnecter");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(button), new AccountUpdateSuccessFragment$initListeners$1$2(this, (C11045c<? super AccountUpdateSuccessFragment$initListeners$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C13553xc61f7104((C11045c) null));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new AccountUpdateSuccessFragment$onViewCreated$1(this));
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo32155W0().mo31597c(mo32154V0().mo32176g());
        mo32159a1();
        initListeners();
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f33041v = cVar;
    }
}

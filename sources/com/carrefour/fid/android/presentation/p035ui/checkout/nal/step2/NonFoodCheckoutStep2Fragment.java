package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23660d;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068FX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8FX\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006D"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2Fragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "", "externalPickupPrice", "U0", "Lcom/carrefour/fid/android/domain/models/account/Address;", "billingAddress", "deliveryAddress", "Lcom/carrefour/fid/android/domain/models/AddressCategory;", "category", "", "phone", "V0", "bundle", "subBasketId", "T0", "S0", "R0", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/a;", "g", "Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/a;", "N0", "()Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/a;", "W0", "(Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/a;)V", "analytics", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "v", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "P0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "X0", "(Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;)V", "otpAnalytics", "Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/c;", "w", "Landroidx/navigation/m;", "O0", "()Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/c;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel;", "x", "Lkotlin/z;", "Q0", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNonFoodCheckoutStep2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2Fragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n*L\n1#1,189:1\n42#2,3:190\n48#3,9:193\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2Fragment\n*L\n42#1:190,3\n43#1:193,9\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment */
public final class NonFoodCheckoutStep2Fragment extends C23613a {
    @Inject

    /* renamed from: f */
    public C28796c f59555f;
    @Inject

    /* renamed from: g */
    public C23614a f59556g;
    @Inject

    /* renamed from: v */
    public C24603a f59557v;
    @C12579k

    /* renamed from: w */
    public final C19766m f59558w = new C19766m(C11342l0.m43547d(C23637c.class), new NonFoodCheckoutStep2Fragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: x */
    public final C11677z f59559x;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment$a */
    public /* synthetic */ class C23572a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.AddressCategory[] r0 = com.carrefour.fid.android.domain.models.AddressCategory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment.C23572a.<clinit>():void");
        }
    }

    public NonFoodCheckoutStep2Fragment() {
        C11677z c = C10864b0.m38748c(new C23573x37620223(this, R.id.checkout_non_food_step_graph));
        this.f59559x = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(NonFoodCheckoutStep2ViewModel.class), new C23574x37620224(c, (C11510n) null), new C23575x37620225(this, c, (C11510n) null));
    }

    @C12579k
    /* renamed from: N0 */
    public final C23614a mo69070N0() {
        C23614a aVar = this.f59556g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @C12579k
    /* renamed from: O0 */
    public final C23637c mo69071O0() {
        return (C23637c) this.f59558w.getValue();
    }

    @C12579k
    /* renamed from: P0 */
    public final C24603a mo69072P0() {
        C24603a aVar = this.f59557v;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpAnalytics");
        return null;
    }

    @C12579k
    /* renamed from: Q0 */
    public final NonFoodCheckoutStep2ViewModel mo69073Q0() {
        return (NonFoodCheckoutStep2ViewModel) this.f59559x.getValue();
    }

    /* renamed from: R0 */
    public final void mo69074R0() {
        FragmentKt.m118823k(this, C23660d.f59701a.mo69406g());
    }

    /* renamed from: S0 */
    public final void mo69075S0(Bundle bundle, String str) {
        FragmentKt.m118823k(this, C23660d.f59701a.mo69405e(str, bundle, mo69071O0().mo69212f()));
    }

    /* renamed from: T0 */
    public final void mo69076T0(Bundle bundle, String str) {
        FragmentKt.m118823k(this, C23660d.C23666f.m105116i(C23660d.f59701a, str, bundle, (SlotExpress) null, (Bundle) null, 8, (Object) null));
    }

    /* renamed from: U0 */
    public final void mo69077U0(double d) {
        FragmentKt.m118823k(this, C23660d.f59701a.mo69404c((float) d));
    }

    /* renamed from: V0 */
    public final void mo69078V0(Address address, Address address2, AddressCategory addressCategory, String str) {
        int i = C23572a.$EnumSwitchMapping$0[addressCategory.ordinal()];
        if (i == 1) {
            C28796c.C28797a.m119188b(getNavigator(), C19736g.m91827a(this), false, false, address2, str, 4, (Object) null);
        } else if (i == 2) {
            C28796c.C28797a.m119187a(getNavigator(), C19736g.m91827a(this), false, false, address2, address, str, 4, (Object) null);
        }
    }

    /* renamed from: W0 */
    public final void mo69079W0(@C12579k C23614a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59556g = aVar;
    }

    /* renamed from: X0 */
    public final void mo69080X0(@C12579k C24603a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59557v = aVar;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f59555f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getBoolean(OtpOrigination.f61094c)) {
            z = true;
        }
        if (z) {
            mo69073Q0().mo75993X0();
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(848515063, true, new NonFoodCheckoutStep2Fragment$onCreateView$view$1$1(this)));
        FragmentKt.m118814b(this);
        return composeView;
    }

    public void onDestroyView() {
        FragmentKt.m118832t(this);
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f59555f = cVar;
    }
}

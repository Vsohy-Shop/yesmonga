package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus;

import android.content.Context;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.UrlPrimeCmsResponse;
import com.carrefour.fid.android.databinding.C36751l2;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24229f;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateSecretCodeFragment;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.widget.StepBarView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001=B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\u0019\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b#\u0010\"J\u0016\u0010&\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$H\u0002J\u0016\u0010(\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0$H\u0002R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u00108¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/LoyaltyBonusListFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/l2;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/f$a;", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "h0", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "prime", "sendTagPrimeAdded", "sendTagPrimeRemoved", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$c;", "state", "i1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$b;", "event", "h1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$a;", "error", "Z0", "", "enabled", "c1", "initListener", "initUi", "V0", "isLoading", "a1", "(Ljava/lang/Boolean;)V", "d1", "", "primes", "g1", "data", "b1", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/f;", "f", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/f;", "adapter", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/e;", "g", "Landroidx/navigation/m;", "X0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/e;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel;", "v", "Y0", "()Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel;", "viewModel", "<init>", "()V", "w", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLoyaltyBonusListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyBonusListFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/LoyaltyBonusListFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n42#2,3:192\n106#3,15:195\n168#4,7:210\n183#4,6:217\n262#5,2:223\n37#6,2:225\n1549#7:227\n1620#7,3:228\n*S KotlinDebug\n*F\n+ 1 LoyaltyBonusListFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/LoyaltyBonusListFragment\n*L\n48#1:192,3\n49#1:195,15\n63#1:210,7\n64#1:217,6\n165#1:223,2\n178#1:225,2\n184#1:227\n184#1:228,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.LoyaltyBonusListFragment */
public final class LoyaltyBonusListFragment extends C24306a<C36751l2> implements C24229f.C24230a {
    @C12579k

    /* renamed from: w */
    public static final C24288a f60701w = new C24288a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f60702x = 8;

    /* renamed from: y */
    public static final int f60703y = 196;

    /* renamed from: z */
    public static final int f60704z = 303;
    @C12579k

    /* renamed from: f */
    public final C11677z f60705f = C10864b0.m38748c(new LoyaltyBonusListFragment$adapter$2(this));
    @C12579k

    /* renamed from: g */
    public final C19766m f60706g = new C19766m(C11342l0.m43547d(C24310e.class), new LoyaltyBonusListFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f60707v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.LoyaltyBonusListFragment$a */
    public static final class C24288a {
        public /* synthetic */ C24288a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24288a() {
        }
    }

    public LoyaltyBonusListFragment() {
        super(C242871.f60708a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new LoyaltyBonusListFragment$special$$inlined$viewModels$default$2(new LoyaltyBonusListFragment$special$$inlined$viewModels$default$1(this)));
        this.f60707v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(PrimeFidListViewModel.class), new LoyaltyBonusListFragment$special$$inlined$viewModels$default$3(b), new LoyaltyBonusListFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new LoyaltyBonusListFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: e1 */
    public static final void m106807e1(LoyaltyBonusListFragment loyaltyBonusListFragment, View view) {
        Intrinsics.checkNotNullParameter(loyaltyBonusListFragment, "this$0");
        loyaltyBonusListFragment.mo71059Y0().sendIntent(new C26522a.C26533d.C26540g(loyaltyBonusListFragment.mo71057W0().mo70912l()));
    }

    /* renamed from: f1 */
    public static final void m106808f1(LoyaltyBonusListFragment loyaltyBonusListFragment, View view) {
        Intrinsics.checkNotNullParameter(loyaltyBonusListFragment, "this$0");
        loyaltyBonusListFragment.mo71059Y0().sendLoyaltyIgnoreBonusTag();
        loyaltyBonusListFragment.mo71059Y0().sendIntent(C26522a.C26533d.C26537d.f64848a);
    }

    /* renamed from: V0 */
    public final void mo71056V0() {
        Context context = getContext();
        if (context != null) {
            TextView textView = ((C36751l2) getBinding()).f91188c;
            String string = getString(R.string.loyalty_bonus_description);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loyalty_bonus_description)");
            textView.setText(StringKt.m118902K(string, C17318d.m79723f(context, R.color.ds_grey_10), new StyleSpan(1), f60703y, 303));
        }
    }

    /* renamed from: W0 */
    public final C24229f mo71057W0() {
        return (C24229f) this.f60705f.getValue();
    }

    /* renamed from: X0 */
    public final C24310e mo71058X0() {
        return (C24310e) this.f60706g.getValue();
    }

    /* renamed from: Y0 */
    public final PrimeFidListViewModel mo71059Y0() {
        return (PrimeFidListViewModel) this.f60707v.getValue();
    }

    /* renamed from: Z0 */
    public final void mo71060Z0(C26522a.C26523a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C26522a.C26523a.C26526c.f64826a)) {
            Context context = getContext();
            if (context != null) {
                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                String string = context.getString(R.string.general_error_parameters_server_not_responding_01);
                Intrinsics.checkNotNullExpressionValue(string, "it.getString(R.string.ge…server_not_responding_01)");
                FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                return;
            }
            return;
        }
        C28935i.m119705e(C28935i.f70940a, aVar.toString(), (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: a1 */
    public final void mo71061a1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            ((C36751l2) getBinding()).f91187b.setVisibility(8);
            showLoading();
            return;
        }
        ((C36751l2) getBinding()).f91187b.setVisibility(0);
        hideLoading();
    }

    /* renamed from: b1 */
    public final void mo71062b1(List<DataPrimeCmsResponse> list) {
        C24229f W0 = mo71057W0();
        Iterable<DataPrimeCmsResponse> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DataPrimeCmsResponse copy$default : iterable) {
            arrayList.add(DataPrimeCmsResponse.copy$default(copy$default, (String) null, (String) null, (PictoPrimeCmsResponse) null, (PictoPrimeCmsResponse) null, (UrlPrimeCmsResponse) null, (String) null, (String) null, false, 255, (Object) null));
        }
        W0.mo70915o(arrayList);
        RecyclerView recyclerView = ((C36751l2) getBinding()).f91194i;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(mo71057W0());
    }

    /* renamed from: c1 */
    public final void mo71063c1(boolean z) {
        ((C36751l2) getBinding()).f91192g.setEnabled(z);
    }

    /* renamed from: d1 */
    public final void mo71064d1(Boolean bool) {
        int i;
        ProgressBar progressBar = ((C36751l2) getBinding()).f91196k;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressFragmentAttachCardSubmit");
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: g1 */
    public final void mo71065g1(List<DataPrimeCmsResponse> list) {
        PrimeFidListViewModel Y0 = mo71059Y0();
        Y0.sendSubscribeLoyaltyEvent(list);
        Y0.sendTagPrimeFid(mo71057W0().mo70911k());
        Y0.sendAppsFlyerTagPrime(list);
        FragmentKt.m118823k(this, C24312f.f60747a.mo71134a((DataPrimeCmsResponse[]) mo71057W0().mo70911k().toArray(new DataPrimeCmsResponse[0]), mo71058X0().mo71118e()));
    }

    /* renamed from: h0 */
    public void mo70916h0() {
        mo71059Y0().sendIntent(new C26522a.C26533d.C26539f(mo71057W0().mo70911k()));
    }

    /* renamed from: h1 */
    public final void mo71066h1(C26522a.C26527b bVar) {
        if (bVar instanceof C26522a.C26527b.C26528a) {
            mo71060Z0(((C26522a.C26527b.C26528a) bVar).mo77130d());
        } else if (bVar instanceof C26522a.C26527b.C26531d) {
            mo71065g1(((C26522a.C26527b.C26531d) bVar).mo77145f());
        } else if (!Intrinsics.areEqual((Object) bVar, (Object) C26522a.C26527b.C26529b.f64830a)) {
            boolean z = bVar instanceof C26522a.C26527b.C26530c;
        }
    }

    /* renamed from: i1 */
    public final void mo71067i1(C26522a.C26532c cVar) {
        mo71061a1(Boolean.valueOf(cVar.isLoading()));
        mo71062b1(cVar.mo77156k());
        mo71064d1(Boolean.valueOf(cVar.mo77158m()));
        mo71063c1(cVar.mo77157l());
    }

    public final void initListener() {
        ((C36751l2) getBinding()).f91192g.setOnClickListener(new C24308c(this));
        ((C36751l2) getBinding()).f91193h.setOnClickListener(new C24309d(this));
    }

    public final void initUi() {
        CreateSecretCodeFragment createSecretCodeFragment = (CreateSecretCodeFragment) com.carrefour.fid.android.core.extension.FragmentKt.m148916b(this, CreateSecretCodeFragment.class);
        if (createSecretCodeFragment != null) {
            createSecretCodeFragment.mo71219Y0(true);
            createSecretCodeFragment.mo71220Z0(true);
            createSecretCodeFragment.mo71221a1(true);
            createSecretCodeFragment.mo71222b1(StepBarView.STEP.STEP_THREE);
            String string = createSecretCodeFragment.getString(R.string.loyalty_bonus_title_page);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loyalty_bonus_title_page)");
            createSecretCodeFragment.mo71223c1(string);
        }
        mo71056V0();
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36751l2) getBinding()).f91191f;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.loyaltyBonusShimmer");
        return shimmerFrameLayout;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        initUi();
        initListener();
        mo71059Y0().sendScreenView();
        PrimeFidListViewModel Y0 = mo71059Y0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new LoyaltyBonusListFragment$onViewCreated$$inlined$processState$1(this, Y0, (C11045c) null, this), 3, (Object) null);
        PrimeFidListViewModel Y02 = mo71059Y0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new LoyaltyBonusListFragment$onViewCreated$$inlined$processEvent$1(this, Y02, (C11045c) null, this), 3, (Object) null);
        C19501x.m90847a(this).mo57477c(new LoyaltyBonusListFragment$onViewCreated$3(this, (C11045c<? super LoyaltyBonusListFragment$onViewCreated$3>) null));
    }

    public void sendTagPrimeAdded(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
    }

    public void sendTagPrimeRemoved(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
    }
}

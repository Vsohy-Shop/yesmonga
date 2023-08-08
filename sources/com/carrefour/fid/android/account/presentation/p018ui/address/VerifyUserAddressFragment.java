package com.carrefour.fid.android.account.presentation.p018ui.address;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13224k;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.account.presentation.p018ui.address.adapter.C13454k;
import com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
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
@C11076d0(mo22515d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001%\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/address/VerifyUserAddressFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/k;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Y0", "initHeader", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/b$a;", "uiEvent", "Z0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/b$b;", "uiState", "a1", "initListeners", "", "loading", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "W0", "(Ljava/lang/Boolean;)Lcom/facebook/shimmer/ShimmerFrameLayout;", "Lcom/carrefour/fid/android/account/presentation/ui/address/k;", "f", "Landroidx/navigation/m;", "U0", "()Lcom/carrefour/fid/android/account/presentation/ui/address/k;", "args", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "com/carrefour/fid/android/account/presentation/ui/address/VerifyUserAddressFragment$a", "v", "Lcom/carrefour/fid/android/account/presentation/ui/address/VerifyUserAddressFragment$a;", "adapterCallback", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/VerifyUserAddressViewModel;", "w", "Lkotlin/z;", "V0", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/address/VerifyUserAddressViewModel;", "viewModel", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nVerifyUserAddressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyUserAddressFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/address/VerifyUserAddressFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,152:1\n42#2,3:153\n56#3,10:156\n168#4,7:166\n183#4,6:173\n*S KotlinDebug\n*F\n+ 1 VerifyUserAddressFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/address/VerifyUserAddressFragment\n*L\n35#1:153,3\n61#1:156,10\n69#1:166,7\n70#1:173,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.VerifyUserAddressFragment */
public final class VerifyUserAddressFragment extends C13457b<C13224k> {
    @C12579k

    /* renamed from: f */
    public final C19766m f32850f = new C19766m(C11342l0.m43547d(C13469k.class), new VerifyUserAddressFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: g */
    public C28936j f32851g;
    @C12579k

    /* renamed from: v */
    public final C13427a f32852v = new C13427a(this);
    @C12579k

    /* renamed from: w */
    public final C11677z f32853w;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.VerifyUserAddressFragment$a */
    public static final class C13427a implements C13454k.C13455a {

        /* renamed from: a */
        public final /* synthetic */ VerifyUserAddressFragment f32855a;

        public C13427a(VerifyUserAddressFragment verifyUserAddressFragment) {
            this.f32855a = verifyUserAddressFragment;
        }

        /* renamed from: a */
        public void mo31864a() {
            this.f32855a.mo31854V0().sendIntent(new C13673b.C13679c.C13682c(C13673b.C13683d.C13685b.f33286a));
        }

        /* renamed from: b */
        public void mo31865b() {
            this.f32855a.mo31854V0().sendIntent(new C13673b.C13679c.C13682c(C13673b.C13683d.C13684a.f33284a));
        }

        /* renamed from: c */
        public void mo31866c(@C12579k DQEAddressModel dQEAddressModel) {
            Intrinsics.checkNotNullParameter(dQEAddressModel, "dqeAddress");
            this.f32855a.mo31854V0().sendIntent(new C13673b.C13679c.C13682c(new C13673b.C13683d.C13686c(dQEAddressModel)));
        }
    }

    public VerifyUserAddressFragment() {
        super(C134261.f32854a);
        VerifyUserAddressFragment$special$$inlined$viewModels$default$1 verifyUserAddressFragment$special$$inlined$viewModels$default$1 = new VerifyUserAddressFragment$special$$inlined$viewModels$default$1(this);
        this.f32853w = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(VerifyUserAddressViewModel.class), new VerifyUserAddressFragment$special$$inlined$viewModels$default$2(verifyUserAddressFragment$special$$inlined$viewModels$default$1), new VerifyUserAddressFragment$special$$inlined$viewModels$default$3(verifyUserAddressFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: X0 */
    public static final void m57847X0(VerifyUserAddressFragment verifyUserAddressFragment, View view) {
        Intrinsics.checkNotNullParameter(verifyUserAddressFragment, "this$0");
        verifyUserAddressFragment.mo31854V0().sendIntent(new C13673b.C13679c.C13680a(verifyUserAddressFragment.mo31853U0().mo31954i()));
    }

    /* renamed from: U0 */
    public final C13469k mo31853U0() {
        return (C13469k) this.f32850f.getValue();
    }

    /* renamed from: V0 */
    public final VerifyUserAddressViewModel mo31854V0() {
        return (VerifyUserAddressViewModel) this.f32853w.getValue();
    }

    /* renamed from: W0 */
    public final ShimmerFrameLayout mo31855W0(Boolean bool) {
        ShimmerFrameLayout shimmerFrameLayout;
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            shimmerFrameLayout = ((C13224k) getBinding()).f32526f;
            shimmerFrameLayout.mo36996g();
            shimmerFrameLayout.setVisibility(0);
        } else {
            shimmerFrameLayout = ((C13224k) getBinding()).f32526f;
            shimmerFrameLayout.mo36997h();
            shimmerFrameLayout.setVisibility(8);
        }
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "if (loading == true) {\n …View.GONE\n        }\n    }");
        return shimmerFrameLayout;
    }

    /* renamed from: Y0 */
    public final void mo31856Y0() {
        initHeader();
        ((C13224k) getBinding()).f32523c.setAdapter(new C13454k(this.f32852v, mo31853U0().mo31956k(), (List) null, 4, (DefaultConstructorMarker) null));
    }

    /* renamed from: Z0 */
    public final void mo31857Z0(C13673b.C13674a aVar) {
        C13673b.C13674a aVar2 = aVar;
        if (aVar2 instanceof C13673b.C13674a.C13676b) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C13144b.C13163s.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_02)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (Intrinsics.areEqual((Object) aVar2, (Object) C13673b.C13674a.C13677c.f33269a)) {
            C19736g.m91827a(this).mo58152q0();
        } else if (Intrinsics.areEqual((Object) aVar2, (Object) C13673b.C13674a.C13675a.f33265a)) {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.SUCCESS;
            String string2 = getString(C13144b.C13163s.account_infos_updated);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.account_infos_updated)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: a1 */
    public final void mo31858a1(C13673b.C13678b bVar) {
        C13454k kVar;
        mo31855W0(Boolean.valueOf(bVar.isLoading()));
        if (bVar.mo32552m() != null) {
            RecyclerView recyclerView = ((C13224k) getBinding()).f32523c;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof C13454k) {
                kVar = (C13454k) adapter;
            } else {
                kVar = null;
            }
            if (kVar != null) {
                kVar.mo31901m(C13673b.f33264a.mo32533a(bVar), bVar.mo32540a(), bVar.mo32552m());
            }
            Intrinsics.checkNotNullExpressionValue(recyclerView, "renderUiState$lambda$1");
            ViewKt.m152123e(recyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f32851g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C13224k) getBinding()).f32527g.setContent(C8553b.m31049c(1894359652, true, new VerifyUserAddressFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ((C13224k) getBinding()).f32524d.setOnClickListener(new C13468j(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo31856Y0();
        initListeners();
        VerifyUserAddressViewModel V0 = mo31854V0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new VerifyUserAddressFragment$onViewCreated$$inlined$processState$1(this, V0, (C11045c) null, this), 3, (Object) null);
        VerifyUserAddressViewModel V02 = mo31854V0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new VerifyUserAddressFragment$onViewCreated$$inlined$processEvent$1(this, V02, (C11045c) null, this), 3, (Object) null);
        mo31854V0().sendIntent(new C13673b.C13679c.C13681b(mo31853U0().mo31952h(), mo31853U0().mo31955j()));
        mo31854V0().mo31589V();
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32851g = jVar;
    }
}

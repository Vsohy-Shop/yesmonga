package com.carrefour.fid.android.account.presentation.p018ui.create;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.account.presentation.analytics.C13300m;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/create/CreateAccountFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "onDetach", "M0", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "K0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "O0", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Lcom/carrefour/fid/android/account/presentation/analytics/m;", "g", "Lcom/carrefour/fid/android/account/presentation/analytics/m;", "J0", "()Lcom/carrefour/fid/android/account/presentation/analytics/m;", "N0", "(Lcom/carrefour/fid/android/account/presentation/analytics/m;)V", "analytics", "Lcom/carrefour/fid/android/shared/util/d;", "v", "Lcom/carrefour/fid/android/shared/util/d;", "L0", "()Lcom/carrefour/fid/android/shared/util/d;", "P0", "(Lcom/carrefour/fid/android/shared/util/d;)V", "applicationBuildInfo", "Lcom/carrefour/fid/android/shared/util/j;", "w", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountFragment */
public final class CreateAccountFragment extends C13496e {
    @Inject

    /* renamed from: f */
    public AppEnvironment f32955f;
    @Inject

    /* renamed from: g */
    public C13300m f32956g;
    @Inject

    /* renamed from: v */
    public C28909d f32957v;
    @Inject

    /* renamed from: w */
    public C28936j f32958w;

    @C12579k
    /* renamed from: J0 */
    public final C13300m mo32027J0() {
        C13300m mVar = this.f32956g;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @C12579k
    /* renamed from: K0 */
    public final AppEnvironment mo32028K0() {
        AppEnvironment appEnvironment = this.f32955f;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    @C12579k
    /* renamed from: L0 */
    public final C28909d mo32029L0() {
        C28909d dVar = this.f32957v;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationBuildInfo");
        return null;
    }

    /* renamed from: M0 */
    public final void mo32030M0() {
        C19501x.m90847a(this).mo57477c(new CreateAccountFragment$handleOnBackPressed$1(this, (C11045c<? super CreateAccountFragment$handleOnBackPressed$1>) null));
    }

    /* renamed from: N0 */
    public final void mo32031N0(@C12579k C13300m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f32956g = mVar;
    }

    /* renamed from: O0 */
    public final void mo32032O0(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f32955f = appEnvironment;
    }

    /* renamed from: P0 */
    public final void mo32033P0(@C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f32957v = dVar;
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f32958w;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
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
        composeView.setContent(C8553b.m31049c(-724785377, true, new CreateAccountFragment$onCreateView$view$1$1(this)));
        return composeView;
    }

    public void onDetach() {
        super.onDetach();
        mo32027J0().mo31605d();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        getFragmentUtil().mo32776b(this);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32958w = jVar;
    }
}

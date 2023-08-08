package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.core.p027os.C17779d;
import androidx.lifecycle.C19499w;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.C25331b;
import com.carrefour.fid.android.shared.constant.C28555j2;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b8\u00109J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0002J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0002R\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "", "number", "a1", "url", "Z0", "gameUrl", "webViewTitle", "secureTokenValue", "Y0", "", "isInStoreOnly", "X0", "", "balanceInCents", "V0", "W0", "T0", "U0", "S0", "Lcom/carrefour/fid/android/tracking/physicalstore/a;", "f", "Lcom/carrefour/fid/android/tracking/physicalstore/a;", "R0", "()Lcom/carrefour/fid/android/tracking/physicalstore/a;", "b1", "(Lcom/carrefour/fid/android/tracking/physicalstore/a;)V", "analytics", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreFragment */
public final class PhysicalStoreFragment extends C25330a {

    /* renamed from: w */
    public static final int f62370w = 8;
    @Inject

    /* renamed from: f */
    public C29018a f62371f;
    @Inject

    /* renamed from: g */
    public C28936j f62372g;
    @Inject

    /* renamed from: v */
    public C28796c f62373v;

    @C12579k
    /* renamed from: R0 */
    public final C29018a mo73765R0() {
        C29018a aVar = this.f62371f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    /* renamed from: S0 */
    public final void mo73766S0() {
        FragmentKt.m118823k(this, C25331b.C25337f.m109503b(C25331b.f62389a, false, 1, (Object) null));
    }

    /* renamed from: T0 */
    public final void mo73767T0() {
        FragmentKt.m118823k(this, C25331b.f62389a.mo73888e("accueil-magasin", "magasin"));
    }

    /* renamed from: U0 */
    public final void mo73768U0() {
        getNavigator().mo83846v(C19736g.m91827a(this), R.id.physical_store_graph);
    }

    /* renamed from: V0 */
    public final void mo73769V0(int i) {
        FragmentKt.m118823k(this, C25331b.f62389a.mo73890h(String.valueOf(i)));
    }

    /* renamed from: W0 */
    public final void mo73770W0() {
        FragmentKt.m118823k(this, C25331b.f62389a.mo73891i());
    }

    /* renamed from: X0 */
    public final void mo73771X0(boolean z) {
        FragmentKt.m118823k(this, C25331b.f62389a.mo73889f(z));
    }

    /* renamed from: Y0 */
    public final void mo73772Y0(String str, String str2, String str3) {
        FragmentKt.m118823k(this, C25331b.f62389a.mo73893l(str, str2, C28555j2.f69460a, str3));
    }

    /* renamed from: Z0 */
    public final void mo73773Z0(String str) {
        C19736g.m91827a(this).mo58142g0(C25331b.C25337f.m109506k(C25331b.f62389a, str, (String) null, (String) null, 6, (Object) null));
    }

    /* renamed from: a1 */
    public final void mo73774a1(String str) {
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel: " + str));
            C17318d.m79740w(requireContext(), intent, C17779d.m81163a());
        } catch (ActivityNotFoundException unused) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.INFO;
            String string = getString(R.string.general_info_no_action_dial);
            Intrinsics.checkNotNullExpressionValue(string, "getString(com.carrefour.…eral_info_no_action_dial)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: b1 */
    public final void mo73775b1(@C12579k C29018a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f62371f = aVar;
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f62372g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f62373v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
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
        composeView.setContent(C8553b.m31049c(1568523746, true, new PhysicalStoreFragment$onCreateView$1$1(this)));
        return composeView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        getFragmentUtil().mo32776b(this);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f62372g = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f62373v = cVar;
    }
}

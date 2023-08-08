package com.carrefour.fid.android.legalnotice.p059ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C20171k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.listeners.C13830b;
import com.carrefour.fid.android.databinding.C36661c2;
import com.carrefour.fid.android.legalnotice.p059ui.fragments.adapter.C38236a;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.shared.util.FragmentViewBindingDelegate;
import com.carrefour.fid.android.shared.util.FragmentViewBindingDelegateKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/legalnotice/ui/fragments/EmbeddedSoftwareLicensingFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "Lcom/carrefour/fid/android/databinding/c2;", "a", "Lcom/carrefour/fid/android/shared/util/FragmentViewBindingDelegate;", "I0", "()Lcom/carrefour/fid/android/databinding/c2;", "binding", "Lcom/carrefour/fid/android/app/listeners/b;", "b", "Lcom/carrefour/fid/android/app/listeners/b;", "itemClickListener", "Lcom/carrefour/fid/android/app/listeners/b$a;", "c", "Lcom/carrefour/fid/android/app/listeners/b$a;", "clickListener", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.legalnotice.ui.fragments.EmbeddedSoftwareLicensingFragment */
public final class EmbeddedSoftwareLicensingFragment extends Fragment {

    /* renamed from: d */
    public static final /* synthetic */ C11510n<Object>[] f96881d = {C11342l0.m43564u(new PropertyReference1Impl(EmbeddedSoftwareLicensingFragment.class, "binding", "getBinding()Lcom/carrefour/fid/android/databinding/FragmentEmbeddedSoftwareLicencingBinding;", 0))};

    /* renamed from: e */
    public static final int f96882e = 8;
    @C12579k

    /* renamed from: a */
    public final FragmentViewBindingDelegate f96883a = FragmentViewBindingDelegateKt.m119491b(this, EmbeddedSoftwareLicensingFragment$binding$2.f96886a);
    @C12580l

    /* renamed from: b */
    public C13830b f96884b;
    @C12579k

    /* renamed from: c */
    public final C13830b.C13831a f96885c = new EmbeddedSoftwareLicensingFragment$clickListener$1(this);

    /* renamed from: I0 */
    public final C36661c2 mo119688I0() {
        return (C36661c2) this.f96883a.mo22938a(this, f96881d[0]);
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        RecyclerView b = mo119688I0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f96884b = null;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        RecyclerView b = mo119688I0().getRoot();
        String[] stringArray = b.getResources().getStringArray(R.array.embedded_software_licencing_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray…_software_licencing_list)");
        b.setAdapter(new C38236a(ArraysKt___ArraysKt.m40265uz(stringArray)));
        b.setLayoutManager(new LinearLayoutManager(getActivity()));
        b.mo59589n(new C20171k(b.getContext(), 1));
        Intrinsics.checkNotNullExpressionValue(b, "this");
        C13830b bVar = new C13830b(b, this.f96885c, (C13830b.C13832b) null, 4, (DefaultConstructorMarker) null);
        b.mo59607p(bVar);
        this.f96884b = bVar;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.account_not_logged_link_licences_logicielles);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
    }
}

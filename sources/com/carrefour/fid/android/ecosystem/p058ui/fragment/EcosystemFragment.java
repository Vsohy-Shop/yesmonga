package com.carrefour.fid.android.ecosystem.p058ui.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.C20171k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.app.extensions.C13828c;
import com.carrefour.fid.android.databinding.C36651b2;
import com.carrefour.fid.android.ecosystem.C38220a;
import com.carrefour.fid.android.ecosystem.contrat.C38221a;
import com.carrefour.fid.android.ecosystem.p058ui.C38223a;
import com.carrefour.fid.android.ecosystem.presentation.C38222a;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/ecosystem/ui/fragment/EcosystemFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/b2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "W0", "Z0", "Y0", "initListener", "Lcom/google/android/material/tabs/TabLayout$i;", "tab", "a1", "X0", "b1", "c1", "Lcom/carrefour/fid/android/ecosystem/ui/fragment/a;", "f", "Landroidx/navigation/m;", "V0", "()Lcom/carrefour/fid/android/ecosystem/ui/fragment/a;", "args", "Ljava/util/ArrayList;", "Lcom/carrefour/fid/android/ecosystem/a;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "mMobileSiteList", "v", "mAppsList", "Lcom/carrefour/fid/android/ecosystem/contrat/a;", "w", "Lcom/carrefour/fid/android/ecosystem/contrat/a;", "mPresenter", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nEcosystemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcosystemFragment.kt\ncom/carrefour/fid/android/ecosystem/ui/fragment/EcosystemFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,185:1\n42#2,3:186\n*S KotlinDebug\n*F\n+ 1 EcosystemFragment.kt\ncom/carrefour/fid/android/ecosystem/ui/fragment/EcosystemFragment\n*L\n27#1:186,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.ecosystem.ui.fragment.EcosystemFragment */
public final class EcosystemFragment extends C38230c<C36651b2> {

    /* renamed from: x */
    public static final int f96858x = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f96859f = new C19766m(C11342l0.m43547d(C38227a.class), new EcosystemFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public ArrayList<C38220a> f96860g = new ArrayList<>();
    @C12579k

    /* renamed from: v */
    public ArrayList<C38220a> f96861v = new ArrayList<>();

    /* renamed from: w */
    public C38221a f96862w;

    /* renamed from: com.carrefour.fid.android.ecosystem.ui.fragment.EcosystemFragment$a */
    public static final class C38226a implements TabLayout.C31610f {

        /* renamed from: a */
        public final /* synthetic */ EcosystemFragment f96864a;

        public C38226a(EcosystemFragment ecosystemFragment) {
            this.f96864a = ecosystemFragment;
        }

        /* renamed from: a */
        public void mo67964a(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
            this.f96864a.mo119658a1(iVar);
        }

        /* renamed from: b */
        public void mo67965b(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
        }

        /* renamed from: c */
        public void mo67966c(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
        }
    }

    public EcosystemFragment() {
        super(C382251.f96863a);
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C36651b2 m158469Q0(EcosystemFragment ecosystemFragment) {
        return (C36651b2) ecosystemFragment.getBinding();
    }

    /* renamed from: V0 */
    public final C38227a mo119653V0() {
        return (C38227a) this.f96859f.getValue();
    }

    /* renamed from: W0 */
    public final void mo119654W0() {
        ArrayList<C38220a> arrayList = this.f96861v;
        String string = getString(R.string.banque_et_assurance_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.banque_et_assurance_name)");
        arrayList.add(new C38220a(string, getString(R.string.banque_et_assurance_intent), R.drawable.ic_crf_banque));
        ArrayList<C38220a> arrayList2 = this.f96860g;
        String string2 = getString(R.string.carrefour_voyage_name);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.carrefour_voyage_name)");
        arrayList2.add(new C38220a(string2, getString(R.string.carrefour_voyage_intent), R.drawable.ic_crf_voyage));
        ArrayList<C38220a> arrayList3 = this.f96860g;
        String string3 = getString(R.string.carrefour_location_name);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.carrefour_location_name)");
        arrayList3.add(new C38220a(string3, getString(R.string.carrefour_location_intent), R.drawable.carrefour_location_foreground));
        ArrayList<C38220a> arrayList4 = this.f96860g;
        String string4 = getString(R.string.optique_et_audition_name);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.optique_et_audition_name)");
        arrayList4.add(new C38220a(string4, getString(R.string.optique_et_audition_intent), R.drawable.carrefour_optique_audition_foreground));
        ArrayList<C38220a> arrayList5 = this.f96860g;
        String string5 = getString(R.string.cartes_cadeaux_name);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.cartes_cadeaux_name)");
        arrayList5.add(new C38220a(string5, getString(R.string.cartes_cadeaux_intent), R.drawable.carrefour_cartes_cadeaux_foreground));
        ArrayList<C38220a> arrayList6 = this.f96860g;
        String string6 = getString(R.string.carrefour_caterer_name);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.carrefour_caterer_name)");
        arrayList6.add(new C38220a(string6, getString(R.string.carrefour_caterer_intent), R.drawable.ds_caterer_foreground));
        ArrayList<C38220a> arrayList7 = this.f96860g;
        String string7 = getString(R.string.natiloo_name);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.natiloo_name)");
        arrayList7.add(new C38220a(string7, getString(R.string.natiloo_intent), R.drawable.ic_logo_natiloo));
        ArrayList<C38220a> arrayList8 = this.f96860g;
        String string8 = getString(R.string.croquetteland_name);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.croquetteland_name)");
        arrayList8.add(new C38220a(string8, getString(R.string.croquetteland_intent), R.drawable.ic_logo_croquetteland));
    }

    /* renamed from: X0 */
    public final void mo119655X0() {
        if (mo119653V0().mo119665e()) {
            ((C36651b2) getBinding()).f90597c.setScrollPosition(1, 0.0f, true);
            mo119660c1();
            return;
        }
        mo119659b1();
    }

    /* renamed from: Y0 */
    public final void mo119656Y0() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.ecosystem_title);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
    }

    /* renamed from: Z0 */
    public final void mo119657Z0() {
        C36651b2 b2Var = (C36651b2) getBinding();
        TabLayout tabLayout = b2Var.f90597c;
        tabLayout.mo91299e(tabLayout.mo91277E().mo91419D(getString(R.string.ecosystem_carrefour_tab_apps)));
        TabLayout tabLayout2 = b2Var.f90597c;
        tabLayout2.mo91299e(tabLayout2.mo91277E().mo91419D(getString(R.string.ecosystem_carrefour_tab_site)));
        b2Var.f90596b.setLayoutManager(new LinearLayoutManager(getContext()));
        b2Var.f90596b.setAdapter(new C38223a(this.f96861v));
        b2Var.f90596b.mo59589n(new C20171k(getContext(), 1));
        C38221a aVar = this.f96862w;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            aVar = null;
        }
        aVar.sendScreenView();
    }

    /* renamed from: a1 */
    public final void mo119658a1(TabLayout.C31615i iVar) {
        if (iVar.mo91427k() == 0) {
            mo119659b1();
        } else {
            mo119660c1();
        }
    }

    /* renamed from: b1 */
    public final void mo119659b1() {
        RecyclerView.Adapter adapter = ((C36651b2) getBinding()).f90596b.getAdapter();
        C38223a aVar = adapter instanceof C38223a ? (C38223a) adapter : null;
        if (aVar != null) {
            aVar.mo119651m(this.f96861v);
        }
    }

    /* renamed from: c1 */
    public final void mo119660c1() {
        RecyclerView.Adapter adapter = ((C36651b2) getBinding()).f90596b.getAdapter();
        C38223a aVar = adapter instanceof C38223a ? (C38223a) adapter : null;
        if (aVar != null) {
            aVar.mo119651m(this.f96860g);
        }
    }

    public final void initListener() {
        ((C36651b2) getBinding()).f90597c.mo91298d(new C38226a(this));
        RecyclerView recyclerView = ((C36651b2) getBinding()).f90596b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.ecosystemRecycler");
        C13828c.m58799a(recyclerView, new EcosystemFragment$initListener$2(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        this.f96862w = new C38222a((C13783a) null, 1, (DefaultConstructorMarker) null);
        mo119654W0();
        mo119657Z0();
        mo119656Y0();
        initListener();
        mo119655X0();
    }
}

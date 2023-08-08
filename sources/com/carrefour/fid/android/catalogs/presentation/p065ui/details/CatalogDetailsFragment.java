package com.carrefour.fid.android.catalogs.presentation.p065ui.details;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39417h;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.CatalogProductListFragment;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.CatalogPagerFragment;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/ui/details/CatalogDetailsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/catalogs/databinding/h;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "catalog", "V0", "Landroidx/fragment/app/Fragment;", "fragment", "X0", "Lcom/carrefour/fid/android/catalogs/presentation/ui/details/b;", "f", "Landroidx/navigation/m;", "U0", "()Lcom/carrefour/fid/android/catalogs/presentation/ui/details/b;", "args", "g", "Landroidx/fragment/app/Fragment;", "activeFragment", "Lcom/carrefour/fid/android/shared/util/j;", "v", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCatalogDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogDetailsFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/CatalogDetailsFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,91:1\n42#2,3:92\n*S KotlinDebug\n*F\n+ 1 CatalogDetailsFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/CatalogDetailsFragment\n*L\n28#1:92,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.CatalogDetailsFragment */
public final class CatalogDetailsFragment extends C39497f<C39417h> {

    /* renamed from: w */
    public static final int f100994w = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f100995f = new C19766m(C11342l0.m43547d(C39490b.class), new CatalogDetailsFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public Fragment f100996g = new CatalogPagerFragment();
    @Inject

    /* renamed from: v */
    public C28936j f100997v;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.CatalogDetailsFragment$a */
    public static final class C39488a implements TabLayout.C31610f {

        /* renamed from: a */
        public final /* synthetic */ CatalogDetailsFragment f100999a;

        /* renamed from: b */
        public final /* synthetic */ Catalog f101000b;

        public C39488a(CatalogDetailsFragment catalogDetailsFragment, Catalog catalog) {
            this.f100999a = catalogDetailsFragment;
            this.f101000b = catalog;
        }

        /* renamed from: a */
        public void mo67964a(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
            if (iVar.mo91427k() == 0) {
                this.f100999a.f100996g = new CatalogPagerFragment();
                this.f100999a.f100996g.setArguments(C17779d.m81164b(C11078d1.m42659a("catalog", this.f101000b)));
            } else {
                this.f100999a.f100996g = new CatalogProductListFragment();
                this.f100999a.f100996g.setArguments(C17779d.m81164b(C11078d1.m42659a("catalog", this.f101000b)));
            }
            CatalogDetailsFragment catalogDetailsFragment = this.f100999a;
            catalogDetailsFragment.mo130633X0(catalogDetailsFragment.f100996g);
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

    public CatalogDetailsFragment() {
        super(C394871.f100998a);
    }

    /* renamed from: W0 */
    public static final void m161755W0(CatalogDetailsFragment catalogDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(catalogDetailsFragment, "this$0");
        C19736g.m91827a(catalogDetailsFragment).mo58152q0();
    }

    /* renamed from: U0 */
    public final C39490b mo130631U0() {
        return (C39490b) this.f100995f.getValue();
    }

    /* renamed from: V0 */
    public final void mo130632V0(Catalog catalog) {
        getFragmentUtil().mo32776b(this);
        C39417h hVar = (C39417h) getBinding();
        hVar.f100827e.setText(catalog.mo117075w());
        TextView textView = hVar.f100826d;
        int i = C39364b.C39383s.catalog_date_validity_formatter;
        C28932h.C28933a aVar = C28932h.f70914a;
        textView.setText(getString(i, aVar.mo84228S(catalog.mo117049F()), aVar.mo84228S(catalog.mo117048E())));
        hVar.f100828f.setOnClickListener(new C39489a(this));
        TabLayout tabLayout = hVar.f100824b;
        tabLayout.mo91299e(tabLayout.mo91277E().mo91419D(getString(C39364b.C39383s.catalog_tab_page)));
        tabLayout.mo91299e(tabLayout.mo91277E().mo91419D(getString(C39364b.C39383s.catalog_tab_list)));
        hVar.f100824b.mo91298d(new C39488a(this, catalog));
        Fragment fragment = this.f100996g;
        if (fragment instanceof CatalogProductListFragment) {
            TabLayout.C31615i z = hVar.f100824b.mo91367z(1);
            if (z != null) {
                z.mo91434r();
            }
            this.f100996g.setArguments(C17779d.m81164b(C11078d1.m42659a("catalog", catalog)));
        } else {
            fragment.setArguments(C17779d.m81164b(C11078d1.m42659a("catalog", catalog)));
        }
        mo130633X0(this.f100996g);
    }

    /* renamed from: X0 */
    public final void mo130633X0(Fragment fragment) {
        C19234h0 u = getChildFragmentManager().mo56909u();
        u.mo57201C(C39364b.C39374j.details_frame_container, fragment);
        u.mo57052q();
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f100997v;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo130632V0(mo130631U0().mo130640e());
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f100997v = jVar;
    }
}

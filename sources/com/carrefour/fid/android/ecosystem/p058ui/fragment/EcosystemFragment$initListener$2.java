package com.carrefour.fid.android.ecosystem.p058ui.fragment;

import android.view.View;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.listeners.C13830b;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.ecosystem.C38220a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.ecosystem.ui.fragment.EcosystemFragment$initListener$2 */
public final class EcosystemFragment$initListener$2 implements C13830b.C13831a {

    /* renamed from: a */
    public final /* synthetic */ EcosystemFragment f96865a;

    public EcosystemFragment$initListener$2(EcosystemFragment ecosystemFragment) {
        this.f96865a = ecosystemFragment;
    }

    /* renamed from: a */
    public final void mo32762a(int i, @C12579k View view) {
        int i2 = i;
        View view2 = view;
        Intrinsics.checkNotNullParameter(view2, C40383c.f102945c);
        if (EcosystemFragment.m158469Q0(this.f96865a).f90597c.getSelectedTabPosition() == 0) {
            TabLayout tabLayout = EcosystemFragment.m158469Q0(this.f96865a).f90597c;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "binding.tabLayoutEcosystem");
            EcosystemFragment ecosystemFragment = this.f96865a;
            String string = ecosystemFragment.getString(R.string.accessibility_eco_system, ((C38220a) ecosystemFragment.f96861v.get(i2)).mo119641a());
            Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …ame\n                    )");
            ViewKt.m152121c(tabLayout, string, false, 2, (Object) null);
            EcosystemFragment ecosystemFragment2 = this.f96865a;
            FragmentKt.m118829q(ecosystemFragment2, (String) null, (String) null, new EcosystemFragment$initListener$2$onItemClick$1(view2, ecosystemFragment2, i2), 3, (Object) null);
            return;
        }
        TabLayout tabLayout2 = EcosystemFragment.m158469Q0(this.f96865a).f90597c;
        Intrinsics.checkNotNullExpressionValue(tabLayout2, "binding.tabLayoutEcosystem");
        EcosystemFragment ecosystemFragment3 = this.f96865a;
        String string2 = ecosystemFragment3.getString(R.string.accessibility_eco_system, ((C38220a) ecosystemFragment3.f96860g.get(i2)).mo119641a());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(\n             …ame\n                    )");
        ViewKt.m152121c(tabLayout2, string2, false, 2, (Object) null);
        EcosystemFragment ecosystemFragment4 = this.f96865a;
        FragmentKt.m118829q(ecosystemFragment4, (String) null, (String) null, new EcosystemFragment$initListener$2$onItemClick$2(view2, ecosystemFragment4, i2), 3, (Object) null);
    }
}

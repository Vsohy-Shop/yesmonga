package com.usabilla.sdk.ubform.sdk.campaign;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.eventengine.C9832b;
import com.usabilla.sdk.ubform.eventengine.EventResult;
import com.usabilla.sdk.ubform.sdk.C9911a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfiguration;
import com.usabilla.sdk.ubform.sdk.banner.BannerFragment;
import com.usabilla.sdk.ubform.sdk.banner.contract.C9924a;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class CampaignManager {
    @C12579k

    /* renamed from: a */
    public final C9832b f27340a;
    @C12579k

    /* renamed from: b */
    public final CampaignStore f27341b;
    @C12579k

    /* renamed from: c */
    public final CampaignSubmissionManager f27342c;
    @C12580l

    /* renamed from: d */
    public final String f27343d;

    /* renamed from: e */
    public final boolean f27344e;
    @C12580l

    /* renamed from: f */
    public WeakReference<FragmentManager> f27345f;

    public CampaignManager(@C12579k C9832b bVar, @C12579k CampaignStore campaignStore, @C12579k CampaignSubmissionManager campaignSubmissionManager, @C12580l String str, boolean z) {
        Intrinsics.checkNotNullParameter(bVar, "eventEngine");
        Intrinsics.checkNotNullParameter(campaignStore, "store");
        Intrinsics.checkNotNullParameter(campaignSubmissionManager, "submissionManager");
        this.f27340a = bVar;
        this.f27341b = campaignStore;
        this.f27342c = campaignSubmissionManager;
        this.f27343d = str;
        this.f27344e = z;
    }

    /* renamed from: f */
    public static /* synthetic */ void m37440f(CampaignManager campaignManager, FormModel formModel, String str, BannerConfiguration bannerConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            bannerConfiguration = null;
        }
        campaignManager.mo20740e(formModel, str, bannerConfiguration);
    }

    /* renamed from: d */
    public final boolean mo20739d() {
        FragmentManager fragmentManager;
        C9911a aVar;
        WeakReference<FragmentManager> weakReference = this.f27345f;
        if (weakReference == null || (fragmentManager = weakReference.get()) == null) {
            return false;
        }
        Fragment r0 = fragmentManager.mo56900r0(16908290);
        if (r0 instanceof C9911a) {
            aVar = (C9911a) r0;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return false;
        }
        aVar.mo20561y0();
        return true;
    }

    /* renamed from: e */
    public final void mo20740e(@C12579k FormModel formModel, @C12579k String str, @C12580l BannerConfiguration bannerConfiguration) {
        C9924a.C9926b bVar;
        FragmentManager fragmentManager;
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        Intrinsics.checkNotNullParameter(str, "campaignId");
        this.f27342c.mo20786h(str);
        Object obj = null;
        if (bannerConfiguration == null) {
            bVar = null;
        } else {
            bVar = BannerConfigurableFragment.f27262y.mo20651b(this.f27344e, this, formModel, str, bannerConfiguration);
        }
        if (bVar == null) {
            bVar = BannerFragment.f27310z.mo20699b(this.f27344e, this, formModel, str);
        }
        WeakReference<FragmentManager> weakReference = this.f27345f;
        if (weakReference != null && (fragmentManager = weakReference.get()) != null) {
            List<Fragment> I0 = fragmentManager.mo56807I0();
            Intrinsics.checkNotNullExpressionValue(I0, "fm.fragments");
            Iterator it = I0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual((Object) ((Fragment) next).getTag(), (Object) BannerFragment.f27303E0)) {
                    obj = next;
                    break;
                }
            }
            if (obj == null) {
                Logger.f26647a.logInfo("Fragment not present, we can show it");
                bVar.mo20630K(fragmentManager, 16908290);
            }
        }
    }

    @C12579k
    /* renamed from: g */
    public final C11907e<List<C9831a>> mo20741g() {
        String str = this.f27343d;
        if (str == null) {
            return C11909g.m47385M0(CollectionsKt__CollectionsKt.m40441E());
        }
        return this.f27341b.mo20775k(str);
    }

    @C12579k
    /* renamed from: h */
    public final C11907e<C11079d2> mo20742h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return C11909g.m47494u(this.f27341b.mo20778n(str), new CampaignManager$incrementCampaignViews$1((C11045c<? super CampaignManager$incrementCampaignViews$1>) null));
    }

    @C12579k
    /* renamed from: i */
    public final C11907e<List<C9831a>> mo20743i() {
        return new CampaignManager$resetData$$inlined$map$1(this.f27341b.mo20777m(), this);
    }

    @C12579k
    /* renamed from: j */
    public final C11907e<EventResult> mo20744j(@C12579k String str, boolean z, @C12579k ConcurrentMap<String, String> concurrentMap, @C12580l UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        Intrinsics.checkNotNullParameter(concurrentMap, "customVars");
        return new CampaignManager$sendEvent$$inlined$map$1(this.f27341b.mo20776l(), str, concurrentMap, this, z, ubInternalTheme);
    }

    /* renamed from: k */
    public final void mo20745k(@C12579k FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        this.f27345f = new WeakReference<>(fragmentManager);
    }
}

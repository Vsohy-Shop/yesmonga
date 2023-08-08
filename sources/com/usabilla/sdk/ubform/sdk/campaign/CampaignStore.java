package com.usabilla.sdk.ubform.sdk.campaign;

import com.google.android.gms.measurement.api.C30638a;
import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel;
import com.usabilla.sdk.ubform.p007db.campaign.C9779a;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class CampaignStore {
    @C12579k

    /* renamed from: a */
    public final CampaignService f27380a;
    @C12579k

    /* renamed from: b */
    public final C9779a f27381b;
    @C12579k

    /* renamed from: c */
    public final String f27382c = C30638a.C30639a.f73205n;

    public CampaignStore(@C12579k CampaignService campaignService, @C12579k C9779a aVar) {
        Intrinsics.checkNotNullParameter(campaignService, "service");
        Intrinsics.checkNotNullParameter(aVar, "dao");
        this.f27380a = campaignService;
        this.f27381b = aVar;
    }

    /* renamed from: g */
    public final List<C9831a> mo20771g(List<C9831a> list, List<TargetingOptionsModel> list2) {
        C9831a aVar;
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (C9831a aVar2 : list) {
            Iterator it = list2.iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((TargetingOptionsModel) obj).mo20191f(), (Object) aVar2.mo20215s())) {
                    break;
                }
            }
            TargetingOptionsModel targetingOptionsModel = (TargetingOptionsModel) obj;
            if (targetingOptionsModel != null) {
                aVar = C9831a.m36799k(aVar2, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (BannerPosition) null, targetingOptionsModel, 255, (Object) null);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C11907e<List<C9831a>> mo20772h(List<C9831a> list) {
        CampaignService campaignService = this.f27380a;
        Iterable<C9831a> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C9831a s : iterable) {
            arrayList.add(s.mo20215s());
        }
        return new CampaignStore$applyTargetingOptions$$inlined$map$1(campaignService.mo20752h(arrayList), this, list);
    }

    @C12579k
    /* renamed from: i */
    public final C11907e<FormModel> mo20773i(@C12579k String str, @C12579k ConcurrentMap<String, String> concurrentMap) {
        Intrinsics.checkNotNullParameter(str, "campaignFormId");
        Intrinsics.checkNotNullParameter(concurrentMap, "customVars");
        return this.f27380a.mo20749e(str, concurrentMap);
    }

    @C12579k
    /* renamed from: j */
    public final C11907e<Boolean> mo20774j(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return C11909g.m47494u(new CampaignStore$getCampaignIsActive$$inlined$map$1(this.f27380a.mo20750f(str), this), new CampaignStore$getCampaignIsActive$2(this, str, (C11045c<? super CampaignStore$getCampaignIsActive$2>) null));
    }

    @C12579k
    /* renamed from: k */
    public final C11907e<List<C9831a>> mo20775k(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "appId");
        return C11909g.m47494u(new CampaignStore$getCampaigns$$inlined$map$3(new CampaignStore$getCampaigns$$inlined$map$2(new CampaignStore$getCampaigns$$inlined$map$1(this.f27380a.mo20751g(str), this), this), this), new CampaignStore$getCampaigns$4(this, (C11045c<? super CampaignStore$getCampaigns$4>) null));
    }

    @C12579k
    /* renamed from: l */
    public final C11907e<List<C9831a>> mo20776l() {
        return this.f27381b.mo20020b();
    }

    @C12579k
    /* renamed from: m */
    public final C11907e<Integer> mo20777m() {
        return this.f27381b.mo20019a();
    }

    @C12579k
    /* renamed from: n */
    public final C11907e<C11079d2> mo20778n(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return C11909g.m47352B0(this.f27381b.mo20023e(str, 1), new CampaignStore$updateCampaignViews$1(this, str, (C11045c<? super CampaignStore$updateCampaignViews$1>) null));
    }

    /* renamed from: o */
    public final C11907e<Integer> mo20779o(List<C9831a> list) {
        return this.f27381b.mo20024f(list);
    }

    @C12579k
    /* renamed from: p */
    public final C11907e<Integer> mo20780p(@C12579k List<C9831a> list) {
        Intrinsics.checkNotNullParameter(list, "campaigns");
        return this.f27381b.mo20022d(list);
    }
}

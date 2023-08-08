package com.usabilla.sdk.ubform.eventengine;

import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import com.usabilla.sdk.ubform.p007db.campaign.CampaignTable;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.eventengine.a */
public final class C9831a {
    @C12579k

    /* renamed from: a */
    public final String f26886a;
    @C12579k

    /* renamed from: b */
    public final String f26887b;

    /* renamed from: c */
    public final int f26888c;
    @C12579k

    /* renamed from: d */
    public final String f26889d;
    @C12579k

    /* renamed from: e */
    public final String f26890e;
    @C12579k

    /* renamed from: f */
    public final String f26891f;
    @C12579k

    /* renamed from: g */
    public final String f26892g;
    @C12579k

    /* renamed from: h */
    public final BannerPosition f26893h;
    @C12580l

    /* renamed from: i */
    public TargetingOptionsModel f26894i;

    /* renamed from: j */
    public final int f26895j;

    public C9831a(@C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k BannerPosition bannerPosition, @C12580l TargetingOptionsModel targetingOptionsModel) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(str2, "campaignStatus");
        Intrinsics.checkNotNullParameter(str3, CampaignTable.f26810j);
        Intrinsics.checkNotNullParameter(str4, "campaignFormId");
        Intrinsics.checkNotNullParameter(str5, CampaignTable.f26811k);
        Intrinsics.checkNotNullParameter(str6, CampaignTable.f26812l);
        Intrinsics.checkNotNullParameter(bannerPosition, CampaignTable.f26813m);
        this.f26886a = str;
        this.f26887b = str2;
        this.f26888c = i;
        this.f26889d = str3;
        this.f26890e = str4;
        this.f26891f = str5;
        this.f26892g = str6;
        this.f26893h = bannerPosition;
        this.f26894i = targetingOptionsModel;
        this.f26895j = 1;
    }

    /* renamed from: k */
    public static /* synthetic */ C9831a m36799k(C9831a aVar, String str, String str2, int i, String str3, String str4, String str5, String str6, BannerPosition bannerPosition, TargetingOptionsModel targetingOptionsModel, int i2, Object obj) {
        C9831a aVar2 = aVar;
        int i3 = i2;
        return aVar.mo20207j((i3 & 1) != 0 ? aVar2.f26886a : str, (i3 & 2) != 0 ? aVar2.f26887b : str2, (i3 & 4) != 0 ? aVar2.f26888c : i, (i3 & 8) != 0 ? aVar2.f26889d : str3, (i3 & 16) != 0 ? aVar2.f26890e : str4, (i3 & 32) != 0 ? aVar2.f26891f : str5, (i3 & 64) != 0 ? aVar2.f26892g : str6, (i3 & 128) != 0 ? aVar2.f26893h : bannerPosition, (i3 & 256) != 0 ? aVar2.f26894i : targetingOptionsModel);
    }

    @C12579k
    /* renamed from: a */
    public final String mo20196a() {
        return this.f26886a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo20197b() {
        return this.f26887b;
    }

    /* renamed from: c */
    public final int mo20198c() {
        return this.f26888c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo20199d() {
        return this.f26889d;
    }

    @C12579k
    /* renamed from: e */
    public final String mo20200e() {
        return this.f26890e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9831a)) {
            return false;
        }
        C9831a aVar = (C9831a) obj;
        return Intrinsics.areEqual((Object) this.f26886a, (Object) aVar.f26886a) && Intrinsics.areEqual((Object) this.f26887b, (Object) aVar.f26887b) && this.f26888c == aVar.f26888c && Intrinsics.areEqual((Object) this.f26889d, (Object) aVar.f26889d) && Intrinsics.areEqual((Object) this.f26890e, (Object) aVar.f26890e) && Intrinsics.areEqual((Object) this.f26891f, (Object) aVar.f26891f) && Intrinsics.areEqual((Object) this.f26892g, (Object) aVar.f26892g) && this.f26893h == aVar.f26893h && Intrinsics.areEqual((Object) this.f26894i, (Object) aVar.f26894i);
    }

    @C12579k
    /* renamed from: f */
    public final String mo20202f() {
        return this.f26891f;
    }

    @C12579k
    /* renamed from: g */
    public final String mo20203g() {
        return this.f26892g;
    }

    @C12579k
    /* renamed from: h */
    public final BannerPosition mo20204h() {
        return this.f26893h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f26886a.hashCode() * 31) + this.f26887b.hashCode()) * 31) + Integer.hashCode(this.f26888c)) * 31) + this.f26889d.hashCode()) * 31) + this.f26890e.hashCode()) * 31) + this.f26891f.hashCode()) * 31) + this.f26892g.hashCode()) * 31) + this.f26893h.hashCode()) * 31;
        TargetingOptionsModel targetingOptionsModel = this.f26894i;
        return hashCode + (targetingOptionsModel == null ? 0 : targetingOptionsModel.hashCode());
    }

    @C12580l
    /* renamed from: i */
    public final TargetingOptionsModel mo20206i() {
        return this.f26894i;
    }

    @C12579k
    /* renamed from: j */
    public final C9831a mo20207j(@C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k BannerPosition bannerPosition, @C12580l TargetingOptionsModel targetingOptionsModel) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(str2, "campaignStatus");
        Intrinsics.checkNotNullParameter(str3, CampaignTable.f26810j);
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "campaignFormId");
        String str8 = str5;
        Intrinsics.checkNotNullParameter(str8, CampaignTable.f26811k);
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, CampaignTable.f26812l);
        BannerPosition bannerPosition2 = bannerPosition;
        Intrinsics.checkNotNullParameter(bannerPosition2, CampaignTable.f26813m);
        return new C9831a(str, str2, i, str3, str7, str8, str9, bannerPosition2, targetingOptionsModel);
    }

    @C12579k
    /* renamed from: l */
    public final BannerPosition mo20208l() {
        return this.f26893h;
    }

    @C12579k
    /* renamed from: m */
    public final String mo20209m() {
        return this.f26890e;
    }

    @C12579k
    /* renamed from: n */
    public final String mo20210n() {
        return this.f26886a;
    }

    @C12579k
    /* renamed from: o */
    public final String mo20211o() {
        return this.f26887b;
    }

    /* renamed from: p */
    public final int mo20212p() {
        return this.f26888c;
    }

    @C12579k
    /* renamed from: q */
    public final String mo20213q() {
        return this.f26891f;
    }

    @C12579k
    /* renamed from: r */
    public final String mo20214r() {
        return this.f26892g;
    }

    @C12579k
    /* renamed from: s */
    public final String mo20215s() {
        return this.f26889d;
    }

    @C12580l
    /* renamed from: t */
    public final TargetingOptionsModel mo20216t() {
        return this.f26894i;
    }

    @C12579k
    public String toString() {
        return "CampaignModel(campaignId=" + this.f26886a + ", campaignStatus=" + this.f26887b + ", campaignTimesShown=" + this.f26888c + ", targetingId=" + this.f26889d + ", campaignFormId=" + this.f26890e + ", createdAt=" + this.f26891f + ", lastModified=" + this.f26892g + ", bannerPosition=" + this.f26893h + ", targetingOptions=" + this.f26894i + ')';
    }

    /* renamed from: u */
    public final boolean mo20218u(@C12579k C9827Event event) {
        Rule h;
        Intrinsics.checkNotNullParameter(event, "event");
        TargetingOptionsModel targetingOptionsModel = this.f26894i;
        if (targetingOptionsModel == null || (h = targetingOptionsModel.mo20193h()) == null) {
            return false;
        }
        return h.mo20235j0(event);
    }

    /* renamed from: v */
    public final void mo20219v(@C12580l TargetingOptionsModel targetingOptionsModel) {
        this.f26894i = targetingOptionsModel;
    }

    /* renamed from: w */
    public final boolean mo20220w(@C12579k C9827Event event, @C12579k Map<String, String> map) {
        TargetingOptionsModel targetingOptionsModel;
        Rule h;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(map, "activeStatuses");
        if (this.f26888c >= this.f26895j || (targetingOptionsModel = this.f26894i) == null || (h = targetingOptionsModel.mo20193h()) == null) {
            return false;
        }
        return h.mo20236E1(event, map);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9831a(String str, String str2, int i, String str3, String str4, String str5, String str6, BannerPosition bannerPosition, TargetingOptionsModel targetingOptionsModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, str5, str6, bannerPosition, (i2 & 256) != 0 ? null : targetingOptionsModel);
    }
}

package com.carrefour.fid.android.domain.models.consent.extension;

import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentName;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.consent.extension.a */
public final class C37997a {
    @C12579k

    /* renamed from: a */
    public static final ConsentName f95645a;
    @C12579k

    /* renamed from: b */
    public static final ConsentName f95646b;
    @C12579k

    /* renamed from: c */
    public static final List<ConsentName> f95647c;
    @C12579k

    /* renamed from: d */
    public static final List<ConsentName> f95648d;
    @C12579k

    /* renamed from: e */
    public static final List<ConsentName> f95649e;
    @C12579k

    /* renamed from: f */
    public static final List<ConsentName> f95650f;
    @C12579k

    /* renamed from: g */
    public static final List<ConsentName> f95651g;

    static {
        ConsentName consentName = ConsentName.OPTIN_CARREFOUR_EMAIL;
        f95645a = consentName;
        ConsentName consentName2 = ConsentName.OPTIN_CARREFOUR_SMS;
        f95646b = consentName2;
        ConsentName consentName3 = ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING;
        ConsentName consentName4 = ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING;
        List<ConsentName> L = CollectionsKt__CollectionsKt.m40448L(consentName3, consentName4);
        f95647c = L;
        f95648d = CollectionsKt__CollectionsKt.m40448L(consentName3, consentName4, ConsentName.CGU_CLIENT, ConsentName.DATA_NO_CARD, ConsentName.DATA_CARD);
        List<ConsentName> L2 = CollectionsKt__CollectionsKt.m40448L(ConsentName.OPTIN_FID_EMAIL, ConsentName.OPTIN_FID_SMS, ConsentName.OPTIN_FID_POST, ConsentName.OPTIN_FID_CARREFOUR_GROUP, ConsentName.OPTIN_FID_TIERS);
        f95649e = L2;
        f95650f = CollectionsKt___CollectionsKt.m40718y4(CollectionsKt___CollectionsKt.m40718y4(C10976s.m41419k(consentName), C10976s.m41419k(consentName2)), L);
        f95651g = CollectionsKt___CollectionsKt.m40718y4(CollectionsKt___CollectionsKt.m40718y4(CollectionsKt___CollectionsKt.m40718y4(C10976s.m41419k(consentName), C10976s.m41419k(consentName2)), L), L2);
    }

    @C12579k
    /* renamed from: a */
    public static final List<ConsentName> m156415a() {
        return f95650f;
    }

    @C12579k
    /* renamed from: b */
    public static final List<ConsentName> m156416b() {
        return f95647c;
    }

    @C12579k
    /* renamed from: c */
    public static final List<ConsentName> m156417c() {
        return f95651g;
    }

    @C12579k
    /* renamed from: d */
    public static final List<ConsentName> m156418d() {
        return f95648d;
    }

    @C12579k
    /* renamed from: e */
    public static final ConsentName m156419e() {
        return f95645a;
    }

    @C12579k
    /* renamed from: f */
    public static final List<ConsentName> m156420f() {
        return f95649e;
    }

    @C12579k
    /* renamed from: g */
    public static final ConsentName m156421g() {
        return f95646b;
    }

    @C12579k
    /* renamed from: h */
    public static final ChoiceOptIn m156422h(@C12580l ChoiceOptIn choiceOptIn) {
        return choiceOptIn == null ? ChoiceOptIn.f95635a.mo117317b() : choiceOptIn;
    }
}

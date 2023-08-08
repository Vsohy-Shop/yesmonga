package com.carrefour.fid.android.various.tracking;

import android.content.Context;
import com.carrefour.fid.android.domain.models.usabilla.UsabillaEventType;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.privacy.C28874a;
import com.carrefour.fid.android.tracking.C28995b;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11970i;
import org.jetbrains.annotations.C12579k;

public final class ThirdPartyUsabillaEventDispatcher implements C28995b, C28874a {
    @C12579k

    /* renamed from: a */
    public final Context f58400a;
    @C12579k

    /* renamed from: b */
    public final BaseAppPreferencesStorage f58401b;
    @C12579k

    /* renamed from: c */
    public final List<String> f58402c = CollectionsKt__CollectionsKt.m40448L("basket", "basket-vide", "recapitulatif", "paiement", "payer-en-ligne", "order-confirmation", "order-confirmation-erreur", "basket", "paiement-fidelite", "paiement", "order-confirmation", "order-confirmation-error");

    @Inject
    public ThirdPartyUsabillaEventDispatcher(@C10255b @C12579k Context context, @C12579k BaseAppPreferencesStorage baseAppPreferencesStorage) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferences");
        this.f58400a = context;
        this.f58401b = baseAppPreferencesStorage;
    }

    /* renamed from: b */
    public void mo67287b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        if (mo32689f(this.f58400a) && !this.f58402c.contains(str)) {
            mo67288d(UsabillaEventType.EVENT_PAGE_VIEWED);
        }
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.USABILLA.mo83424q();
    }

    /* renamed from: d */
    public void mo67288d(@C12579k UsabillaEventType usabillaEventType) {
        Intrinsics.checkNotNullParameter(usabillaEventType, "event");
        Object unused = C11970i.m47708b((CoroutineContext) null, new ThirdPartyUsabillaEventDispatcher$sendEvent$1(this, usabillaEventType, (C11045c<? super ThirdPartyUsabillaEventDispatcher$sendEvent$1>) null), 1, (Object) null);
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28874a.C28875a.m119430a(this, context);
    }
}

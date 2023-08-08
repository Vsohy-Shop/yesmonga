package com.carrefour.fid.android.utils.tagging.inbox;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import com.carrefour.fid.android.tracking.C28994a;
import com.urbanairship.iam.events.C9175a;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class AudienceTrackingManager implements C13747e {

    /* renamed from: e */
    public static final int f58221e = 8;
    @C12579k

    /* renamed from: a */
    public final C12074o0 f58222a;
    @C12579k

    /* renamed from: b */
    public final AccountRepository f58223b;
    @C12579k

    /* renamed from: c */
    public final C37835r f58224c;
    @C12579k

    /* renamed from: d */
    public final C28994a f58225d;

    /* renamed from: com.carrefour.fid.android.utils.tagging.inbox.AudienceTrackingManager$a */
    public /* synthetic */ class C22721a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.account.CivilityTitle[] r0 = com.carrefour.fid.android.domain.models.account.CivilityTitle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.account.CivilityTitle r1 = com.carrefour.fid.android.domain.models.account.CivilityTitle.MR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.account.CivilityTitle r1 = com.carrefour.fid.android.domain.models.account.CivilityTitle.MRS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.tagging.inbox.AudienceTrackingManager.C22721a.<clinit>():void");
        }
    }

    @Inject
    public AudienceTrackingManager(@C28659c @C12579k C12074o0 o0Var, @C12579k AccountRepository accountRepository, @C12579k C37835r rVar, @C12579k C28994a aVar) {
        Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(rVar, "observeServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(aVar, "audienceTrackingAdapter");
        this.f58222a = o0Var;
        this.f58223b = accountRepository;
        this.f58224c = rVar;
        this.f58225d = aVar;
    }

    /* renamed from: a */
    public void mo32672a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C11723c2 unused = C12038j.m48061f(this.f58222a, (CoroutineContext) null, (CoroutineStart) null, new AudienceTrackingManager$registerPreferenceListener$1(this, (C11045c<? super AudienceTrackingManager$registerPreferenceListener$1>) null), 3, (Object) null);
        C11723c2 unused2 = C12038j.m48061f(this.f58222a, (CoroutineContext) null, (CoroutineStart) null, new AudienceTrackingManager$registerPreferenceListener$2(this, (C11045c<? super AudienceTrackingManager$registerPreferenceListener$2>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: b */
    public C28994a mo32673b() {
        return this.f58225d;
    }

    /* renamed from: g */
    public final void mo67136g(C38162k kVar) {
        StoreServiceType storeServiceType;
        StoreService f = kVar.mo119354f();
        if (f != null) {
            storeServiceType = f.mo119176T();
        } else {
            storeServiceType = null;
        }
        if (Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.H1h3.INSTANCE)) {
            this.f58225d.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33467q0, "Oui")));
        }
    }

    /* renamed from: h */
    public final void mo67137h(AccountInfo accountInfo) {
        int i;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CivilityTitle p = accountInfo.mo116661p();
        if (p == null) {
            i = -1;
        } else {
            i = C22721a.$EnumSwitchMapping$0[p.ordinal()];
        }
        if (i == 1) {
            str = C13758b.f33440d;
        } else if (i != 2) {
            str = new String();
        } else {
            str = C13758b.f33450i;
        }
        linkedHashMap.put(C13758b.f33448h, str);
        this.f58225d.mo32670e(linkedHashMap);
    }
}

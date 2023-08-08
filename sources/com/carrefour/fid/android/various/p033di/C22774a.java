package com.carrefour.fid.android.various.p033di;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37806a;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37809c;
import com.carrefour.fid.android.tracking.C28995b;
import com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore;
import com.carrefour.fid.android.various.data.repository.FirebaseRemoteConfigImpl;
import com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl;
import com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase;
import com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckRemoteConfigUseCase;
import com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase;
import com.carrefour.fid.android.various.domain.repository.C22796c;
import com.carrefour.fid.android.various.domain.repository.C22798d;
import com.carrefour.fid.android.various.tracking.ThirdPartyUsabillaEventDispatcher;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.android.qualifiers.C10255b;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.various.di.a */
public interface C22774a {
    @C12579k

    /* renamed from: a */
    public static final C22775a f58325a = C22775a.f58326a;

    /* renamed from: com.carrefour.fid.android.various.di.a$a */
    public static final class C22775a {

        /* renamed from: a */
        public static final /* synthetic */ C22775a f58326a = new C22775a();

        @Singleton
        @C10315i
        @C12579k
        /* renamed from: a */
        public final AppMessageDataStore mo67189a(@C10255b @C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, "appContext");
            return new AppMessageDataStore(context);
        }
    }

    /* renamed from: com.carrefour.fid.android.various.di.a$b */
    public static final class C22776b {
        @Singleton
        /* renamed from: a */
        public static /* synthetic */ void m102995a(RemoteConfigRepositoryImpl remoteConfigRepositoryImpl) {
        }
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    C37807b mo67183a(@C12579k ThirdPartyCheckRemoteConfigUseCase thirdPartyCheckRemoteConfigUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C22798d mo67184b(@C12579k RemoteConfigRepositoryImpl remoteConfigRepositoryImpl);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37809c mo67185c(@C12579k ThirdPartyFetchRemoteConfigUseCase thirdPartyFetchRemoteConfigUseCase);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37806a mo67186d(@C12579k ThirdPartyCheckAppMessageUseCase thirdPartyCheckAppMessageUseCase);

    @C10147a
    @C12579k
    /* renamed from: e */
    C28995b mo67187e(@C12579k ThirdPartyUsabillaEventDispatcher thirdPartyUsabillaEventDispatcher);

    @C10147a
    @C12579k
    /* renamed from: f */
    C22796c mo67188f(@C12579k FirebaseRemoteConfigImpl firebaseRemoteConfigImpl);
}

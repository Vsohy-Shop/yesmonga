package com.carrefour.fid.android.logm.p060di;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.interactors.logm.C37695b;
import com.carrefour.fid.android.logm.data.datasource.LogMDataSource;
import com.carrefour.fid.android.logm.data.repositories.LoggerRepository;
import com.carrefour.fid.android.logm.data.service.C38276a;
import com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase;
import com.carrefour.fid.android.logm.domain.interactors.LogMSendAllRemoteLogsUseCase;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.constant.C28587r0;
import com.carrefour.fid.android.shared.extension.C28763k;
import com.carrefour.fid.android.shared.network.GenericNetworkService;
import com.carrefour.fid.android.shared.network.interceptors.C28816c;
import com.carrefour.fid.android.shared.network.interceptors.C28822g;
import com.carrefour.fid.android.shared.network.pinStorage.C28835a;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.urbanairship.iam.events.C9175a;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.android.qualifiers.C10255b;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.logm.di.b */
public interface C38278b {
    @C12579k

    /* renamed from: a */
    public static final C38279a f96962a = C38279a.f96963a;

    /* renamed from: com.carrefour.fid.android.logm.di.b$a */
    public static final class C38279a {

        /* renamed from: a */
        public static final /* synthetic */ C38279a f96963a = new C38279a();

        @C10315i
        @C12579k
        /* renamed from: a */
        public final C38276a mo119875a(@C10255b @C12579k Context context, @C12579k AppEnvironment appEnvironment, @C12579k C28909d dVar) {
            String str;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
            Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
            if (C28763k.m119071a(appEnvironment)) {
                str = C28587r0.f69783c;
            } else {
                str = C28587r0.f69784d;
            }
            GenericNetworkService.Builder i = new GenericNetworkService.Builder(context, (C28835a) null, (C28816c) null, 6, (DefaultConstructorMarker) null).mo83857i(C28587r0.f69785e);
            Object g = i.mo83855g(CollectionsKt__CollectionsKt.m40449M(C28822g.m119250a(C10977s0.m41456W(C11078d1.m42659a(C28534f.f69113B, "Basic " + str), C11078d1.m42659a("Content-Type", "application/json"), C11078d1.m42659a("User-Agent", dVar.mo84151b()))))).mo83854f(new Pair[0]).mo83869v(true).mo83859k(appEnvironment.mo32753a()).mo30586g(C38276a.class);
            Intrinsics.checkNotNullExpressionValue(g, "Builder(context = contex…gMApiService::class.java)");
            return (C38276a) g;
        }

        @Singleton
        @C10315i
        @C12579k
        /* renamed from: b */
        public final LoggerRepository mo119876b(@C12579k LogMDataSource logMDataSource, @C12579k C28909d dVar) {
            Intrinsics.checkNotNullParameter(logMDataSource, "network");
            Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
            return new LoggerRepository(logMDataSource, (CoroutineDispatcher) null, dVar, 2, (DefaultConstructorMarker) null);
        }
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    C37694a mo119873a(@C12579k LogMLogToLogMUseCase logMLogToLogMUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37695b mo119874b(@C12579k LogMSendAllRemoteLogsUseCase logMSendAllRemoteLogsUseCase);
}

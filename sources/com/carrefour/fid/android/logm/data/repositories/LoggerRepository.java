package com.carrefour.fid.android.logm.data.repositories;

import com.carrefour.fid.android.domain.models.logm.LogMAction;
import com.carrefour.fid.android.domain.models.logm.LogMEntry;
import com.carrefour.fid.android.domain.models.logm.LogMSeverity;
import com.carrefour.fid.android.logm.data.datasource.LogMDataSource;
import com.carrefour.fid.android.logm.utils.C38284a;
import com.carrefour.fid.android.shared.util.C28909d;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
public final class LoggerRepository {
    @C12579k

    /* renamed from: e */
    public static final C38273a f96952e = new C38273a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f96953f = 50;

    /* renamed from: g */
    public static final int f96954g = 1000;
    @C12579k

    /* renamed from: a */
    public final LogMDataSource f96955a;
    @C12579k

    /* renamed from: b */
    public final CoroutineDispatcher f96956b;
    @C12579k

    /* renamed from: c */
    public final C28909d f96957c;
    @C12579k

    /* renamed from: d */
    public final ConcurrentLinkedQueue<LogMEntry> f96958d;

    /* renamed from: com.carrefour.fid.android.logm.data.repositories.LoggerRepository$a */
    public static final class C38273a {
        public /* synthetic */ C38273a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C38273a() {
        }
    }

    @Inject
    public LoggerRepository(@C12579k LogMDataSource logMDataSource, @C12579k CoroutineDispatcher coroutineDispatcher, @C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(logMDataSource, "network");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
        this.f96955a = logMDataSource;
        this.f96956b = coroutineDispatcher;
        this.f96957c = dVar;
        this.f96958d = new ConcurrentLinkedQueue<>(CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: f */
    public final LogMEntry mo119864f(LogMEntry logMEntry, C28909d dVar) {
        C38284a aVar = C38284a.f96975a;
        return LogMEntry.copy$default(logMEntry, (String) null, (LogMAction) null, (String) null, (String) null, (String) null, (String) null, aVar.mo119882a(logMEntry.getResponseAt(), logMEntry.getTimestamp()), (String) null, (String) null, (LogMSeverity) null, (String) null, (String) null, dVar.mo84151b(), (String) null, aVar.mo119884c(logMEntry.getValue()), (String) null, (String) null, 110527, (Object) null);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo119865g(@C12579k LogMEntry logMEntry, @C12579k C11045c<? super C11079d2> cVar) {
        Object h = C11965h.m47673h(this.f96956b, new LoggerRepository$log$2(this, logMEntry, (C11045c<? super LoggerRepository$log$2>) null), cVar);
        return h == C11063b.m42612h() ? h : C11079d2.f28267a;
    }

    /* renamed from: h */
    public final void mo119866h() {
        LogMEntry logMEntry = (LogMEntry) CollectionsKt___CollectionsKt.m40644i3(this.f96958d);
        this.f96958d.remove(logMEntry);
        LogMAction logMAction = LogMAction.LOGM;
        Intrinsics.checkNotNullExpressionValue(logMEntry, "lastElement");
        this.f96958d.add(LogMEntry.copy$default(logMEntry, (String) null, logMAction, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (LogMSeverity) null, (String) null, (String) null, (String) null, (String) null, "Truncated", (String) null, (String) null, 114685, (Object) null));
    }

    @C12580l
    /* renamed from: i */
    public final Object mo119867i(@C12579k C11045c<? super List<LogMEntry>> cVar) {
        return C11965h.m47673h(this.f96956b, new LoggerRepository$sendAll$2(this, (C11045c<? super LoggerRepository$sendAll$2>) null), cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoggerRepository(LogMDataSource logMDataSource, CoroutineDispatcher coroutineDispatcher, C28909d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(logMDataSource, (i & 2) != 0 ? C11768d1.m46781c().mo23566V(1) : coroutineDispatcher, dVar);
    }
}

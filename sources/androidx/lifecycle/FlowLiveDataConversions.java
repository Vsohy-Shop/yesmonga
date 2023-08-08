package androidx.lifecycle;

import androidx.annotation.C0376v0;
import androidx.arch.core.executor.C0829c;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import p073j$.time.Duration;

@C11314h(name = "FlowLiveDataConversions")
public final class FlowLiveDataConversions {
    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m90501a(@C12579k LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        return C11909g.m47414W(C11909g.m47488s(new FlowLiveDataConversions$asFlow$1(liveData, (C11045c<? super FlowLiveDataConversions$asFlow$1>) null)));
    }

    @C12579k
    @C11315i
    /* renamed from: b */
    public static final <T> LiveData<T> m90502b(@C12579k C11907e<? extends T> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return m90506f(eVar, (CoroutineContext) null, 0, 3, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: c */
    public static final <T> LiveData<T> m90503c(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        return m90506f(eVar, coroutineContext, 0, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: d */
    public static final <T> LiveData<T> m90504d(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext, long j) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        LiveData<T> b = CoroutineLiveDataKt.m90487b(coroutineContext, j, new FlowLiveDataConversions$asLiveData$1(eVar, (C11045c<? super FlowLiveDataConversions$asLiveData$1>) null));
        if (eVar instanceof C11952u) {
            if (C0829c.m3971h().mo3796c()) {
                b.mo57496r(((C11952u) eVar).getValue());
            } else {
                b.mo57493o(((C11952u) eVar).getValue());
            }
        }
        return b;
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: e */
    public static final <T> LiveData<T> m90505e(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext, @C12579k Duration duration) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(duration, "timeout");
        return m90504d(eVar, coroutineContext, C19396c.f49778a.mo57560a(duration));
    }

    /* renamed from: f */
    public static /* synthetic */ LiveData m90506f(C11907e eVar, CoroutineContext coroutineContext, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return m90504d(eVar, coroutineContext, j);
    }

    /* renamed from: g */
    public static /* synthetic */ LiveData m90507g(C11907e eVar, CoroutineContext coroutineContext, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        return m90505e(eVar, coroutineContext, duration);
    }
}

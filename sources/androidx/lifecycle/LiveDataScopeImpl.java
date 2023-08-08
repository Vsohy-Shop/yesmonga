package androidx.lifecycle;

import android.annotation.SuppressLint;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C11965h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LiveDataScopeImpl<T> implements C19403d0<T> {
    @C12579k

    /* renamed from: a */
    public CoroutineLiveData<T> f49714a;
    @C12579k

    /* renamed from: b */
    public final CoroutineContext f49715b;

    public LiveDataScopeImpl(@C12579k CoroutineLiveData<T> coroutineLiveData, @C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineLiveData, "target");
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        this.f49714a = coroutineLiveData;
        this.f49715b = coroutineContext.mo7443Q(C11768d1.m46783e().mo23706a0());
    }

    @C12580l
    /* renamed from: a */
    public Object mo57502a(@C12579k LiveData<T> liveData, @C12579k C11045c<? super C11962g1> cVar) {
        return C11965h.m47673h(this.f49715b, new LiveDataScopeImpl$emitSource$2(this, liveData, (C11045c<? super LiveDataScopeImpl$emitSource$2>) null), cVar);
    }

    @C12580l
    /* renamed from: b */
    public T mo57503b() {
        return this.f49714a.mo4610f();
    }

    @C12579k
    /* renamed from: c */
    public final CoroutineLiveData<T> mo57504c() {
        return this.f49714a;
    }

    /* renamed from: d */
    public final void mo57505d(@C12579k CoroutineLiveData<T> coroutineLiveData) {
        Intrinsics.checkNotNullParameter(coroutineLiveData, "<set-?>");
        this.f49714a = coroutineLiveData;
    }

    @C12580l
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object h = C11965h.m47673h(this.f49715b, new LiveDataScopeImpl$emit$2(this, t, (C11045c<? super LiveDataScopeImpl$emit$2>) null), cVar);
        return h == C11063b.m42612h() ? h : C11079d2.f28267a;
    }
}

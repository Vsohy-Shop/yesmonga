package androidx.lifecycle;

import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.time.Duration;

public final class CoroutineLiveDataKt {

    /* renamed from: a */
    public static final long f49672a = 5000;

    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$a */
    public static final class C19362a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f49673a;

        public C19362a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f49673a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f49673a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f49673a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @C12580l
    /* renamed from: a */
    public static final <T> Object m90486a(@C12579k C19406e0<T> e0Var, @C12579k LiveData<T> liveData, @C12579k C11045c<? super EmittedSource> cVar) {
        return C11965h.m47673h(C11768d1.m46783e().mo23706a0(), new CoroutineLiveDataKt$addDisposableSource$2(e0Var, liveData, (C11045c<? super CoroutineLiveDataKt$addDisposableSource$2>) null), cVar);
    }

    @C12579k
    /* renamed from: b */
    public static final <T> LiveData<T> m90487b(@C12579k CoroutineContext coroutineContext, long j, @C12579k C11304p<? super C19403d0<T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        return new CoroutineLiveData(coroutineContext, j, pVar);
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: c */
    public static final <T> LiveData<T> m90488c(@C12579k CoroutineContext coroutineContext, @C12579k Duration duration, @C12579k C11304p<? super C19403d0<T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(duration, "timeout");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        return new CoroutineLiveData(coroutineContext, C19396c.f49778a.mo57560a(duration), pVar);
    }

    /* renamed from: d */
    public static /* synthetic */ LiveData m90489d(CoroutineContext coroutineContext, long j, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return m90487b(coroutineContext, j, pVar);
    }

    /* renamed from: e */
    public static /* synthetic */ LiveData m90490e(CoroutineContext coroutineContext, Duration duration, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        return m90488c(coroutineContext, duration, pVar);
    }
}

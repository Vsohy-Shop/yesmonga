package androidx.lifecycle;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

public abstract class LifecycleCoroutineScope implements C12074o0 {
    @C12579k
    /* renamed from: a */
    public abstract Lifecycle mo57475a();

    @C11395k(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    @C12579k
    /* renamed from: b */
    public final C11723c2 mo57476b(@C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        return C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenCreated$1(this, pVar, (C11045c<? super LifecycleCoroutineScope$launchWhenCreated$1>) null), 3, (Object) null);
    }

    @C11395k(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    @C12579k
    /* renamed from: c */
    public final C11723c2 mo57477c(@C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        return C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenResumed$1(this, pVar, (C11045c<? super LifecycleCoroutineScope$launchWhenResumed$1>) null), 3, (Object) null);
    }

    @C11395k(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    @C12579k
    /* renamed from: d */
    public final C11723c2 mo57478d(@C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        return C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenStarted$1(this, pVar, (C11045c<? super LifecycleCoroutineScope$launchWhenStarted$1>) null), 3, (Object) null);
    }
}

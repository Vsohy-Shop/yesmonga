package androidx.lifecycle;

import androidx.camera.view.C1814q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.u */
public final class C19473u {
    @C12579k
    /* renamed from: a */
    public static final LifecycleCoroutineScope m90802a(@C12579k Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.mo57466c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, C11719b3.m46155c((C11723c2) null, 1, (Object) null).mo7443Q(C11768d1.m46783e().mo23706a0()));
        } while (!C1814q.m7242a(lifecycle.mo57466c(), (Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.mo57482e();
        return lifecycleCoroutineScopeImpl;
    }
}

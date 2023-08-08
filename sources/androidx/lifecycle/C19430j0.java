package androidx.lifecycle;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.j0 */
public final class C19430j0 extends CoroutineDispatcher {
    @C12579k
    @C11287e

    /* renamed from: c */
    public final C19431k f49808c = new C19431k();

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(runnable, C28534f.f69159i0);
        this.f49808c.mo57588c(coroutineContext, runnable);
    }

    /* renamed from: U */
    public boolean mo23565U(@C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        if (C11768d1.m46783e().mo23706a0().mo23565U(coroutineContext)) {
            return true;
        }
        return !this.f49808c.mo57587b();
    }
}

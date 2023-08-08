package androidx.navigation.compose;

import androidx.compose.runtime.saveable.C8623b;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.navigation.compose.a */
public final class C19709a extends C19476v0 {
    @C12579k

    /* renamed from: a */
    public final String f50510a = "SaveableStateHolder_BackStackEntryKey";
    @C12579k

    /* renamed from: b */
    public final UUID f50511b;

    /* renamed from: c */
    public WeakReference<C8623b> f50512c;

    public C19709a(@C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "handle");
        UUID uuid = (UUID) p0Var.mo57648h("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            p0Var.mo57656q("SaveableStateHolder_BackStackEntryKey", uuid);
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().also { handle.set(IdKey, it) }");
        }
        this.f50511b = uuid;
    }

    @C12579k
    /* renamed from: c0 */
    public final UUID mo58372c0() {
        return this.f50511b;
    }

    @C12579k
    /* renamed from: d0 */
    public final WeakReference<C8623b> mo58373d0() {
        WeakReference<C8623b> weakReference = this.f50512c;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
        return null;
    }

    /* renamed from: e0 */
    public final void mo58374e0(@C12579k WeakReference<C8623b> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f50512c = weakReference;
    }

    public void onCleared() {
        super.onCleared();
        C8623b bVar = mo58373d0().get();
        if (bVar != null) {
            bVar.mo8710c(this.f50511b);
        }
        mo58373d0().clear();
    }
}

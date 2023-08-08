package androidx.datastore.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.datastore.core.f */
public final class C18572f<T> extends C18578j<T> {
    @C12579k

    /* renamed from: a */
    public final Throwable f47423a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18572f(@C12579k Throwable th) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(th, "finalException");
        this.f47423a = th;
    }

    @C12579k
    /* renamed from: a */
    public final Throwable mo53586a() {
        return this.f47423a;
    }
}

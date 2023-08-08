package androidx.datastore.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.datastore.core.h */
public final class C18574h<T> extends C18578j<T> {
    @C12579k

    /* renamed from: a */
    public final Throwable f47424a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18574h(@C12579k Throwable th) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(th, "readException");
        this.f47424a = th;
    }

    @C12579k
    /* renamed from: a */
    public final Throwable mo53587a() {
        return this.f47424a;
    }
}

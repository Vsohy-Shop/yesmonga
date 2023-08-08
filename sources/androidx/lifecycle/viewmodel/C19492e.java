package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.C19477a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.viewmodel.e */
public final class C19492e extends C19477a {
    public C19492e() {
        this((C19477a) null, 1, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: a */
    public <T> T mo57677a(@C12579k C19477a.C19479b<T> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        return mo57678b().get(bVar);
    }

    /* renamed from: c */
    public final <T> void mo57690c(@C12579k C19477a.C19479b<T> bVar, T t) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        mo57678b().put(bVar, t);
    }

    public C19492e(@C12579k C19477a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "initialExtras");
        mo57678b().putAll(aVar.mo57678b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19492e(C19477a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C19477a.C19478a.f49866b : aVar);
    }
}

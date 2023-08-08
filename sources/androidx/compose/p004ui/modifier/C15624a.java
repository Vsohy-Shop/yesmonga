package androidx.compose.p004ui.modifier;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.modifier.a */
public final class C15624a extends C15631g {
    @C12579k

    /* renamed from: b */
    public C15634j<?> f38767b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15624a(@C12579k C15634j<?> jVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(jVar, "element");
        this.f38767b = jVar;
    }

    /* renamed from: a */
    public boolean mo44508a(@C12579k C15626c<?> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "key");
        if (cVar == this.f38767b.getKey()) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: b */
    public <T> T mo44509b(@C12579k C15626c<T> cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "key");
        if (cVar == this.f38767b.getKey()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f38767b.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public <T> void mo44510c(@C12579k C15626c<T> cVar, T t) {
        Intrinsics.checkNotNullParameter(cVar, "key");
        throw new IllegalStateException("Set is not allowed on a backwards compat provider".toString());
    }

    @C12579k
    /* renamed from: d */
    public final C15634j<?> mo44511d() {
        return this.f38767b;
    }

    /* renamed from: e */
    public final void mo44512e(@C12579k C15634j<?> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f38767b = jVar;
    }
}

package androidx.compose.p004ui.modifier;

import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.snapshots.C8667t;
import com.google.firebase.remoteconfig.C33585u;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.modifier.l */
public final class C15637l extends C15631g {
    @C12579k

    /* renamed from: b */
    public final C8667t<C15626c<?>, Object> f38773b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15637l(@C12579k Pair<? extends C15626c<?>, ? extends Object>... pairArr) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(pairArr, C33585u.C33588c.f81747z3);
        C8667t<C15626c<?>, Object> h = C8415c2.m30239h();
        this.f38773b = h;
        h.putAll(C10977s0.m41438H0(pairArr));
    }

    /* renamed from: a */
    public boolean mo44508a(@C12579k C15626c<?> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "key");
        return this.f38773b.containsKey(cVar);
    }

    @C12580l
    /* renamed from: b */
    public <T> T mo44509b(@C12579k C15626c<T> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "key");
        T t = this.f38773b.get(cVar);
        if (t == null) {
            return null;
        }
        return t;
    }

    /* renamed from: c */
    public <T> void mo44510c(@C12579k C15626c<T> cVar, T t) {
        Intrinsics.checkNotNullParameter(cVar, "key");
        this.f38773b.put(cVar, t);
    }
}

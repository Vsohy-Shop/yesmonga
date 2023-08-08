package androidx.window.embedding;

import androidx.window.core.C20994d;
import com.carrefour.fid.android.presentation.p035ui.coupons.filter.C23812d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.b */
public final class C21000b extends C21013m {

    /* renamed from: a */
    public final boolean f54172a;
    @C12579k

    /* renamed from: b */
    public final Set<C20999a> f54173b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21000b(Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? false : z);
    }

    /* renamed from: a */
    public final boolean mo62794a() {
        return this.f54172a;
    }

    @C12579k
    /* renamed from: b */
    public final Set<C20999a> mo62795b() {
        return this.f54173b;
    }

    @C12579k
    /* renamed from: c */
    public final C21000b mo62796c(@C12579k C20999a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f54173b);
        linkedHashSet.add(aVar);
        return new C21000b(CollectionsKt___CollectionsKt.m40582V5(linkedHashSet), this.f54172a);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21000b)) {
            return false;
        }
        C21000b bVar = (C21000b) obj;
        if (Intrinsics.areEqual((Object) this.f54173b, (Object) bVar.f54173b) && this.f54172a == bVar.f54172a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f54173b.hashCode() * 31) + Boolean.hashCode(this.f54172a);
    }

    public C21000b(@C12579k Set<C20999a> set, boolean z) {
        Intrinsics.checkNotNullParameter(set, C23812d.f59917a);
        this.f54172a = z;
        this.f54173b = CollectionsKt___CollectionsKt.m40582V5(set);
    }
}

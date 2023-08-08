package androidx.window.embedding;

import android.content.Intent;
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
/* renamed from: androidx.window.embedding.w */
public final class C21027w extends C21029y {
    @C12579k

    /* renamed from: e */
    public final Intent f54225e;
    @C12579k

    /* renamed from: f */
    public final Set<C20999a> f54226f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21027w(Set set, Intent intent, int i, int i2, float f, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, intent, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0.5f : f, (i4 & 32) != 0 ? 3 : i3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21027w) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        C21027w wVar = (C21027w) obj;
        if (Intrinsics.areEqual((Object) this.f54226f, (Object) wVar.f54226f) && Intrinsics.areEqual((Object) this.f54225e, (Object) wVar.f54225e)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final Set<C20999a> mo62883f() {
        return this.f54226f;
    }

    @C12579k
    /* renamed from: g */
    public final Intent mo62884g() {
        return this.f54225e;
    }

    @C12579k
    /* renamed from: h */
    public final C21027w mo62885h(@C12579k C20999a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f54226f);
        linkedHashSet.add(aVar);
        return new C21027w(CollectionsKt___CollectionsKt.m40582V5(linkedHashSet), this.f54225e, mo62889d(), mo62888c(), mo62890e(), mo62887b());
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.f54226f.hashCode()) * 31) + this.f54225e.hashCode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21027w(@C12579k Set<C20999a> set, @C12579k Intent intent, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        Intrinsics.checkNotNullParameter(set, C23812d.f59917a);
        Intrinsics.checkNotNullParameter(intent, "placeholderIntent");
        this.f54225e = intent;
        this.f54226f = CollectionsKt___CollectionsKt.m40582V5(set);
    }
}

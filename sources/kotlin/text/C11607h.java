package kotlin.text;

import com.urbanairship.automation.C8970v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.text.h */
public final class C11607h {
    @C12579k

    /* renamed from: a */
    public final String f28887a;
    @C12579k

    /* renamed from: b */
    public final C11466l f28888b;

    public C11607h(@C12579k String str, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(str, "value");
        Intrinsics.checkNotNullParameter(lVar, C8970v.f24100k);
        this.f28887a = str;
        this.f28888b = lVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C11607h m45229d(C11607h hVar, String str, C11466l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.f28887a;
        }
        if ((i & 2) != 0) {
            lVar = hVar.f28888b;
        }
        return hVar.mo23391c(str, lVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo23389a() {
        return this.f28887a;
    }

    @C12579k
    /* renamed from: b */
    public final C11466l mo23390b() {
        return this.f28888b;
    }

    @C12579k
    /* renamed from: c */
    public final C11607h mo23391c(@C12579k String str, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(str, "value");
        Intrinsics.checkNotNullParameter(lVar, C8970v.f24100k);
        return new C11607h(str, lVar);
    }

    @C12579k
    /* renamed from: e */
    public final C11466l mo23392e() {
        return this.f28888b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11607h)) {
            return false;
        }
        C11607h hVar = (C11607h) obj;
        return Intrinsics.areEqual((Object) this.f28887a, (Object) hVar.f28887a) && Intrinsics.areEqual((Object) this.f28888b, (Object) hVar.f28888b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo23394f() {
        return this.f28887a;
    }

    public int hashCode() {
        return (this.f28887a.hashCode() * 31) + this.f28888b.hashCode();
    }

    @C12579k
    public String toString() {
        return "MatchGroup(value=" + this.f28887a + ", range=" + this.f28888b + ')';
    }
}

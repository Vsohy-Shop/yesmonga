package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.room.C20340m0;
import androidx.room.C20351p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20351p
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.d */
public final class C21221d {
    @C20340m0
    @C20305f(name = "key")
    @C12579k

    /* renamed from: a */
    public final String f54764a;
    @C12580l
    @C20305f(name = "long_value")

    /* renamed from: b */
    public final Long f54765b;

    public C21221d(@C12579k String str, @C12580l Long l) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f54764a = str;
        this.f54765b = l;
    }

    /* renamed from: d */
    public static /* synthetic */ C21221d m98027d(C21221d dVar, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f54764a;
        }
        if ((i & 2) != 0) {
            l = dVar.f54765b;
        }
        return dVar.mo63397c(str, l);
    }

    @C12579k
    /* renamed from: a */
    public final String mo63395a() {
        return this.f54764a;
    }

    @C12580l
    /* renamed from: b */
    public final Long mo63396b() {
        return this.f54765b;
    }

    @C12579k
    /* renamed from: c */
    public final C21221d mo63397c(@C12579k String str, @C12580l Long l) {
        Intrinsics.checkNotNullParameter(str, "key");
        return new C21221d(str, l);
    }

    @C12579k
    /* renamed from: e */
    public final String mo63398e() {
        return this.f54764a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21221d)) {
            return false;
        }
        C21221d dVar = (C21221d) obj;
        return Intrinsics.areEqual((Object) this.f54764a, (Object) dVar.f54764a) && Intrinsics.areEqual((Object) this.f54765b, (Object) dVar.f54765b);
    }

    @C12580l
    /* renamed from: f */
    public final Long mo63400f() {
        return this.f54765b;
    }

    public int hashCode() {
        int hashCode = this.f54764a.hashCode() * 31;
        Long l = this.f54765b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    @C12579k
    public String toString() {
        return "Preference(key=" + this.f54764a + ", value=" + this.f54765b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21221d(@C12579k String str, boolean z) {
        this(str, Long.valueOf(z ? 1 : 0));
        Intrinsics.checkNotNullParameter(str, "key");
    }
}

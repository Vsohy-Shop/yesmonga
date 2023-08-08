package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11621s;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.C12227i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.internal.u0 */
public abstract class C12316u0 implements C12217f {
    @C12579k

    /* renamed from: a */
    public final String f30130a;
    @C12579k

    /* renamed from: b */
    public final C12217f f30131b;
    @C12579k

    /* renamed from: c */
    public final C12217f f30132c;

    /* renamed from: d */
    public final int f30133d;

    public /* synthetic */ C12316u0(String str, C12217f fVar, C12217f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
    }

    @C12579k
    /* renamed from: a */
    public final C12217f mo25185a() {
        return this.f30131b;
    }

    /* renamed from: b */
    public boolean mo24821b() {
        return C12217f.C12218a.m48902h(this);
    }

    /* renamed from: c */
    public int mo24822c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Integer intOrNull = C11621s.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus(str, " is not a valid map index"));
    }

    /* renamed from: d */
    public int mo24823d() {
        return this.f30133d;
    }

    @C12579k
    /* renamed from: e */
    public String mo24824e(int i) {
        return String.valueOf(i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12316u0)) {
            return false;
        }
        C12316u0 u0Var = (C12316u0) obj;
        if (Intrinsics.areEqual((Object) mo24830h(), (Object) u0Var.mo24830h()) && Intrinsics.areEqual((Object) this.f30131b, (Object) u0Var.f30131b) && Intrinsics.areEqual((Object) this.f30132c, (Object) u0Var.f30132c)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public List<Annotation> mo24826f(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo24830h() + " expects only non-negative indices").toString());
    }

    @C12579k
    /* renamed from: g */
    public C12217f mo24827g(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.f30131b;
            }
            if (i2 == 1) {
                return this.f30132c;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo24830h() + " expects only non-negative indices").toString());
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        return C12217f.C12218a.m48895a(this);
    }

    @C12579k
    public C12224h getKind() {
        return C12227i.C12230c.f30013a;
    }

    @C12579k
    /* renamed from: h */
    public String mo24830h() {
        return this.f30130a;
    }

    public int hashCode() {
        return (((mo24830h().hashCode() * 31) + this.f30131b.hashCode()) * 31) + this.f30132c.hashCode();
    }

    /* renamed from: i */
    public boolean mo24832i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo24830h() + " expects only non-negative indices").toString());
    }

    public boolean isInline() {
        return C12217f.C12218a.m48900f(this);
    }

    @C12579k
    /* renamed from: j */
    public final C12217f mo25188j() {
        return this.f30132c;
    }

    @C12579k
    public String toString() {
        return mo24830h() + '(' + this.f30131b + ", " + this.f30132c + ')';
    }

    public C12316u0(String str, C12217f fVar, C12217f fVar2) {
        this.f30130a = str;
        this.f30131b = fVar;
        this.f30132c = fVar2;
        this.f30133d = 2;
    }
}

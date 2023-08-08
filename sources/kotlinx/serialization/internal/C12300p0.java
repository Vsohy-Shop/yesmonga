package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11621s;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.C12227i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12200d
/* renamed from: kotlinx.serialization.internal.p0 */
public abstract class C12300p0 implements C12217f {
    @C12579k

    /* renamed from: a */
    public final C12217f f30097a;

    /* renamed from: b */
    public final int f30098b;

    public /* synthetic */ C12300p0(C12217f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @C12579k
    /* renamed from: a */
    public final C12217f mo25128a() {
        return this.f30097a;
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
        throw new IllegalArgumentException(Intrinsics.stringPlus(str, " is not a valid list index"));
    }

    /* renamed from: d */
    public int mo24823d() {
        return this.f30098b;
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
        if (!(obj instanceof C12300p0)) {
            return false;
        }
        C12300p0 p0Var = (C12300p0) obj;
        if (!Intrinsics.areEqual((Object) this.f30097a, (Object) p0Var.f30097a) || !Intrinsics.areEqual((Object) mo24830h(), (Object) p0Var.mo24830h())) {
            return false;
        }
        return true;
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
            return this.f30097a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo24830h() + " expects only non-negative indices").toString());
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        return C12217f.C12218a.m48895a(this);
    }

    @C12579k
    public C12224h getKind() {
        return C12227i.C12229b.f30012a;
    }

    public int hashCode() {
        return (this.f30097a.hashCode() * 31) + mo24830h().hashCode();
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
    public String toString() {
        return mo24830h() + '(' + this.f30097a + ')';
    }

    public C12300p0(C12217f fVar) {
        this.f30097a = fVar;
        this.f30098b = 1;
    }
}

package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlin.text.C11626x;
import kotlinx.serialization.C12200d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.descriptors.c */
public final class C12203c implements C12217f {
    @C12579k

    /* renamed from: a */
    public final C12217f f29989a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public final C11494d<?> f29990b;
    @C12579k

    /* renamed from: c */
    public final String f29991c;

    public C12203c(@C12579k C12217f fVar, @C12579k C11494d<?> dVar) {
        Intrinsics.checkNotNullParameter(fVar, "original");
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        this.f29989a = fVar;
        this.f29990b = dVar;
        this.f29991c = fVar.mo24830h() + C11626x.f28914e + dVar.mo22848s() + C11626x.f28915f;
    }

    /* renamed from: b */
    public boolean mo24821b() {
        return this.f29989a.mo24821b();
    }

    @C12200d
    /* renamed from: c */
    public int mo24822c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.f29989a.mo24822c(str);
    }

    /* renamed from: d */
    public int mo24823d() {
        return this.f29989a.mo24823d();
    }

    @C12200d
    @C12579k
    /* renamed from: e */
    public String mo24824e(int i) {
        return this.f29989a.mo24824e(i);
    }

    public boolean equals(@C12580l Object obj) {
        C12203c cVar;
        if (obj instanceof C12203c) {
            cVar = (C12203c) obj;
        } else {
            cVar = null;
        }
        if (cVar != null && Intrinsics.areEqual((Object) this.f29989a, (Object) cVar.f29989a) && Intrinsics.areEqual((Object) cVar.f29990b, (Object) this.f29990b)) {
            return true;
        }
        return false;
    }

    @C12200d
    @C12579k
    /* renamed from: f */
    public List<Annotation> mo24826f(int i) {
        return this.f29989a.mo24826f(i);
    }

    @C12200d
    @C12579k
    /* renamed from: g */
    public C12217f mo24827g(int i) {
        return this.f29989a.mo24827g(i);
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        return this.f29989a.getAnnotations();
    }

    @C12579k
    public C12224h getKind() {
        return this.f29989a.getKind();
    }

    @C12579k
    /* renamed from: h */
    public String mo24830h() {
        return this.f29991c;
    }

    public int hashCode() {
        return (this.f29990b.hashCode() * 31) + mo24830h().hashCode();
    }

    @C12200d
    /* renamed from: i */
    public boolean mo24832i(int i) {
        return this.f29989a.mo24832i(i);
    }

    public boolean isInline() {
        return this.f29989a.isInline();
    }

    @C12579k
    public String toString() {
        return "ContextDescriptor(kClass: " + this.f29990b + ", original: " + this.f29989a + ')';
    }
}

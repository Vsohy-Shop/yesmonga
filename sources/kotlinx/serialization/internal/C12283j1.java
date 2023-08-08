package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.internal.j1 */
public final class C12283j1 implements C12217f {
    @C12579k

    /* renamed from: a */
    public final String f30077a;
    @C12579k

    /* renamed from: b */
    public final C12207e f30078b;

    public C12283j1(@C12579k String str, @C12579k C12207e eVar) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(eVar, "kind");
        this.f30077a = str;
        this.f30078b = eVar;
    }

    /* renamed from: a */
    public final Void mo25078a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    /* renamed from: b */
    public boolean mo24821b() {
        return C12217f.C12218a.m48902h(this);
    }

    /* renamed from: c */
    public int mo24822c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        mo25078a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public int mo24823d() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public String mo24824e(int i) {
        mo25078a();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: f */
    public List<Annotation> mo24826f(int i) {
        mo25078a();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: g */
    public C12217f mo24827g(int i) {
        mo25078a();
        throw new KotlinNothingValueException();
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        return C12217f.C12218a.m48895a(this);
    }

    @C12579k
    /* renamed from: h */
    public String mo24830h() {
        return this.f30077a;
    }

    /* renamed from: i */
    public boolean mo24832i(int i) {
        mo25078a();
        throw new KotlinNothingValueException();
    }

    public boolean isInline() {
        return C12217f.C12218a.m48900f(this);
    }

    @C12579k
    /* renamed from: j */
    public C12207e getKind() {
        return this.f30078b;
    }

    @C12579k
    public String toString() {
        return "PrimitiveDescriptor(" + mo24830h() + ')';
    }
}

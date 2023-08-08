package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.internal.m1 */
public final class C12292m1 implements C12217f, C12290m {
    @C12579k

    /* renamed from: a */
    public final C12217f f30088a;
    @C12579k

    /* renamed from: b */
    public final String f30089b;
    @C12579k

    /* renamed from: c */
    public final Set<String> f30090c;

    public C12292m1(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "original");
        this.f30088a = fVar;
        this.f30089b = Intrinsics.stringPlus(fVar.mo24830h(), "?");
        this.f30090c = C12258b1.m49228a(fVar);
    }

    @C12579k
    /* renamed from: a */
    public Set<String> mo24820a() {
        return this.f30090c;
    }

    /* renamed from: b */
    public boolean mo24821b() {
        return true;
    }

    @C12200d
    /* renamed from: c */
    public int mo24822c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.f30088a.mo24822c(str);
    }

    /* renamed from: d */
    public int mo24823d() {
        return this.f30088a.mo24823d();
    }

    @C12200d
    @C12579k
    /* renamed from: e */
    public String mo24824e(int i) {
        return this.f30088a.mo24824e(i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C12292m1) && Intrinsics.areEqual((Object) this.f30088a, (Object) ((C12292m1) obj).f30088a)) {
            return true;
        }
        return false;
    }

    @C12200d
    @C12579k
    /* renamed from: f */
    public List<Annotation> mo24826f(int i) {
        return this.f30088a.mo24826f(i);
    }

    @C12200d
    @C12579k
    /* renamed from: g */
    public C12217f mo24827g(int i) {
        return this.f30088a.mo24827g(i);
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        return this.f30088a.getAnnotations();
    }

    @C12579k
    public C12224h getKind() {
        return this.f30088a.getKind();
    }

    @C12579k
    /* renamed from: h */
    public String mo24830h() {
        return this.f30089b;
    }

    public int hashCode() {
        return this.f30088a.hashCode() * 31;
    }

    @C12200d
    /* renamed from: i */
    public boolean mo24832i(int i) {
        return this.f30088a.mo24832i(i);
    }

    public boolean isInline() {
        return this.f30088a.isInline();
    }

    @C12579k
    /* renamed from: j */
    public final C12217f mo25108j() {
        return this.f30088a;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30088a);
        sb.append('?');
        return sb.toString();
    }
}

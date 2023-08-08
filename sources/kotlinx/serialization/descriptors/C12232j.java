package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.descriptors.j */
public final class C12232j implements C12217f {
    @C12579k

    /* renamed from: a */
    public final String f30015a;

    /* renamed from: b */
    public final /* synthetic */ C12217f f30016b;

    public C12232j(@C12579k String str, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(fVar, "original");
        this.f30015a = str;
        this.f30016b = fVar;
    }

    /* renamed from: b */
    public boolean mo24821b() {
        return this.f30016b.mo24821b();
    }

    @C12200d
    /* renamed from: c */
    public int mo24822c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.f30016b.mo24822c(str);
    }

    /* renamed from: d */
    public int mo24823d() {
        return this.f30016b.mo24823d();
    }

    @C12200d
    @C12579k
    /* renamed from: e */
    public String mo24824e(int i) {
        return this.f30016b.mo24824e(i);
    }

    @C12200d
    @C12579k
    /* renamed from: f */
    public List<Annotation> mo24826f(int i) {
        return this.f30016b.mo24826f(i);
    }

    @C12200d
    @C12579k
    /* renamed from: g */
    public C12217f mo24827g(int i) {
        return this.f30016b.mo24827g(i);
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        return this.f30016b.getAnnotations();
    }

    @C12579k
    public C12224h getKind() {
        return this.f30016b.getKind();
    }

    @C12579k
    /* renamed from: h */
    public String mo24830h() {
        return this.f30015a;
    }

    @C12200d
    /* renamed from: i */
    public boolean mo24832i(int i) {
        return this.f30016b.mo24832i(i);
    }

    public boolean isInline() {
        return this.f30016b.isInline();
    }
}

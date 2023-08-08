package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.descriptors.a */
public final class C12201a {
    @C12579k

    /* renamed from: a */
    public final String f29981a;

    /* renamed from: b */
    public boolean f29982b;
    @C12579k

    /* renamed from: c */
    public List<? extends Annotation> f29983c = CollectionsKt__CollectionsKt.m40441E();
    @C12579k

    /* renamed from: d */
    public final List<String> f29984d = new ArrayList();
    @C12579k

    /* renamed from: e */
    public final Set<String> f29985e = new HashSet();
    @C12579k

    /* renamed from: f */
    public final List<C12217f> f29986f = new ArrayList();
    @C12579k

    /* renamed from: g */
    public final List<List<Annotation>> f29987g = new ArrayList();
    @C12579k

    /* renamed from: h */
    public final List<Boolean> f29988h = new ArrayList();

    public C12201a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        this.f29981a = str;
    }

    /* renamed from: b */
    public static /* synthetic */ void m48861b(C12201a aVar, String str, C12217f fVar, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        aVar.mo24839a(str, fVar, list, z);
    }

    @C12200d
    /* renamed from: d */
    public static /* synthetic */ void m48862d() {
    }

    @C12200d
    /* renamed from: k */
    public static /* synthetic */ void m48863k() {
    }

    /* renamed from: a */
    public final void mo24839a(@C12579k String str, @C12579k C12217f fVar, @C12579k List<? extends Annotation> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "elementName");
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(list, "annotations");
        if (this.f29985e.add(str)) {
            this.f29984d.add(str);
            this.f29986f.add(fVar);
            this.f29987g.add(list);
            this.f29988h.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered").toString());
    }

    @C12579k
    /* renamed from: c */
    public final List<Annotation> mo24840c() {
        return this.f29983c;
    }

    @C12579k
    /* renamed from: e */
    public final List<List<Annotation>> mo24841e() {
        return this.f29987g;
    }

    @C12579k
    /* renamed from: f */
    public final List<C12217f> mo24842f() {
        return this.f29986f;
    }

    @C12579k
    /* renamed from: g */
    public final List<String> mo24843g() {
        return this.f29984d;
    }

    @C12579k
    /* renamed from: h */
    public final List<Boolean> mo24844h() {
        return this.f29988h;
    }

    @C12579k
    /* renamed from: i */
    public final String mo24845i() {
        return this.f29981a;
    }

    /* renamed from: j */
    public final boolean mo24846j() {
        return this.f29982b;
    }

    /* renamed from: l */
    public final void mo24847l(@C12579k List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f29983c = list;
    }

    /* renamed from: m */
    public final void mo24848m(boolean z) {
        this.f29982b = z;
    }
}

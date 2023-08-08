package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10864b0;
import kotlin.C11078d1;
import kotlin.C11677z;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10942h0;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.internal.C12258b1;
import kotlinx.serialization.internal.C12290m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SerialDescriptorImpl implements C12217f, C12290m {
    @C12579k

    /* renamed from: a */
    public final String f29967a;
    @C12579k

    /* renamed from: b */
    public final C12224h f29968b;

    /* renamed from: c */
    public final int f29969c;
    @C12579k

    /* renamed from: d */
    public final List<Annotation> f29970d;
    @C12579k

    /* renamed from: e */
    public final Set<String> f29971e;
    @C12579k

    /* renamed from: f */
    public final String[] f29972f;
    @C12579k

    /* renamed from: g */
    public final C12217f[] f29973g;
    @C12579k

    /* renamed from: h */
    public final List<Annotation>[] f29974h;
    @C12579k

    /* renamed from: i */
    public final boolean[] f29975i;
    @C12579k

    /* renamed from: j */
    public final Map<String, Integer> f29976j;
    @C12579k

    /* renamed from: k */
    public final C12217f[] f29977k;
    @C12579k

    /* renamed from: l */
    public final C11677z f29978l;

    public SerialDescriptorImpl(@C12579k String str, @C12579k C12224h hVar, int i, @C12579k List<? extends C12217f> list, @C12579k C12201a aVar) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(hVar, "kind");
        Intrinsics.checkNotNullParameter(list, "typeParameters");
        Intrinsics.checkNotNullParameter(aVar, "builder");
        this.f29967a = str;
        this.f29968b = hVar;
        this.f29969c = i;
        this.f29970d = aVar.mo24840c();
        this.f29971e = CollectionsKt___CollectionsKt.m40547O5(aVar.mo24843g());
        Object[] array = aVar.mo24843g().toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            this.f29972f = strArr;
            this.f29973g = C12258b1.m49232e(aVar.mo24842f());
            Object[] array2 = aVar.mo24841e().toArray(new List[0]);
            if (array2 != null) {
                this.f29974h = (List[]) array2;
                this.f29975i = CollectionsKt___CollectionsKt.m40517I5(aVar.mo24844h());
                Iterable<C10942h0> fA = ArraysKt___ArraysKt.m39772fA(strArr);
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(fA, 10));
                for (C10942h0 h0Var : fA) {
                    arrayList.add(C11078d1.m42659a(h0Var.mo22281f(), Integer.valueOf(h0Var.mo22279e())));
                }
                this.f29976j = C10977s0.m41426B0(arrayList);
                this.f29977k = C12258b1.m49232e(list);
                this.f29978l = C10864b0.m38748c(new SerialDescriptorImpl$_hashCode$2(this));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @C12579k
    /* renamed from: a */
    public Set<String> mo24820a() {
        return this.f29971e;
    }

    /* renamed from: b */
    public boolean mo24821b() {
        return C12217f.C12218a.m48902h(this);
    }

    /* renamed from: c */
    public int mo24822c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Integer num = this.f29976j.get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public int mo24823d() {
        return this.f29969c;
    }

    @C12579k
    /* renamed from: e */
    public String mo24824e(int i) {
        return this.f29972f[i];
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            C12217f fVar = (C12217f) obj;
            if (Intrinsics.areEqual((Object) mo24830h(), (Object) fVar.mo24830h()) && Arrays.equals(this.f29977k, ((SerialDescriptorImpl) obj).f29977k) && mo24823d() == fVar.mo24823d()) {
                int d = mo24823d();
                int i = 0;
                while (i < d) {
                    int i2 = i + 1;
                    if (Intrinsics.areEqual((Object) mo24827g(i).mo24830h(), (Object) fVar.mo24827g(i).mo24830h()) && Intrinsics.areEqual((Object) mo24827g(i).getKind(), (Object) fVar.mo24827g(i).getKind())) {
                        i = i2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public List<Annotation> mo24826f(int i) {
        return this.f29974h[i];
    }

    @C12579k
    /* renamed from: g */
    public C12217f mo24827g(int i) {
        return this.f29973g[i];
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        return this.f29970d;
    }

    @C12579k
    public C12224h getKind() {
        return this.f29968b;
    }

    @C12579k
    /* renamed from: h */
    public String mo24830h() {
        return this.f29967a;
    }

    public int hashCode() {
        return mo24834k();
    }

    /* renamed from: i */
    public boolean mo24832i(int i) {
        return this.f29975i[i];
    }

    public boolean isInline() {
        return C12217f.C12218a.m48900f(this);
    }

    /* renamed from: k */
    public final int mo24834k() {
        return ((Number) this.f29978l.getValue()).intValue();
    }

    @C12579k
    public String toString() {
        return CollectionsKt___CollectionsKt.m40639h3(C11479u.m44378W1(0, mo24823d()), ", ", Intrinsics.stringPlus(mo24830h(), "("), ")", 0, (CharSequence) null, new SerialDescriptorImpl$toString$1(this), 24, (Object) null);
    }
}

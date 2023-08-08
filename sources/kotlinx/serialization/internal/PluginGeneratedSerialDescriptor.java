package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10864b0;
import kotlin.C11532s0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.C12227i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
public class PluginGeneratedSerialDescriptor implements C12217f, C12290m {
    @C12579k

    /* renamed from: a */
    public final String f30035a;
    @C12580l

    /* renamed from: b */
    public final C12327y<?> f30036b;

    /* renamed from: c */
    public final int f30037c;

    /* renamed from: d */
    public int f30038d;
    @C12579k

    /* renamed from: e */
    public final String[] f30039e;
    @C12579k

    /* renamed from: f */
    public final List<Annotation>[] f30040f;
    @C12580l

    /* renamed from: g */
    public List<Annotation> f30041g;
    @C12579k

    /* renamed from: h */
    public final boolean[] f30042h;
    @C12579k

    /* renamed from: i */
    public Map<String, Integer> f30043i;
    @C12579k

    /* renamed from: j */
    public final C11677z f30044j;
    @C12579k

    /* renamed from: k */
    public final C11677z f30045k;
    @C12579k

    /* renamed from: l */
    public final C11677z f30046l;

    public PluginGeneratedSerialDescriptor(@C12579k String str, @C12580l C12327y<?> yVar, int i) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        this.f30035a = str;
        this.f30036b = yVar;
        this.f30037c = i;
        this.f30038d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f30039e = strArr;
        int i3 = this.f30037c;
        this.f30040f = new List[i3];
        this.f30042h = new boolean[i3];
        this.f30043i = C10977s0.m41492z();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f30044j = C10864b0.m38747b(lazyThreadSafetyMode, new PluginGeneratedSerialDescriptor$childSerializers$2(this));
        this.f30045k = C10864b0.m38747b(lazyThreadSafetyMode, new PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(this));
        this.f30046l = C10864b0.m38747b(lazyThreadSafetyMode, new PluginGeneratedSerialDescriptor$_hashCode$2(this));
    }

    /* renamed from: l */
    public static /* synthetic */ void m49098l(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            pluginGeneratedSerialDescriptor.mo24966k(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    @C12579k
    /* renamed from: a */
    public Set<String> mo24820a() {
        return this.f30043i.keySet();
    }

    /* renamed from: b */
    public boolean mo24821b() {
        return C12217f.C12218a.m48902h(this);
    }

    /* renamed from: c */
    public int mo24822c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Integer num = this.f30043i.get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public final int mo24823d() {
        return this.f30037c;
    }

    @C12579k
    /* renamed from: e */
    public String mo24824e(int i) {
        return this.f30039e[i];
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            C12217f fVar = (C12217f) obj;
            if (Intrinsics.areEqual((Object) mo24830h(), (Object) fVar.mo24830h()) && Arrays.equals(mo24969o(), ((PluginGeneratedSerialDescriptor) obj).mo24969o()) && mo24823d() == fVar.mo24823d()) {
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
        List<Annotation> list = this.f30040f[i];
        if (list == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return list;
    }

    @C12579k
    /* renamed from: g */
    public C12217f mo24827g(int i) {
        return mo24968n()[i].getDescriptor();
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f30041g;
        return list == null ? CollectionsKt__CollectionsKt.m40441E() : list;
    }

    @C12579k
    public C12224h getKind() {
        return C12227i.C12228a.f30011a;
    }

    @C12579k
    /* renamed from: h */
    public String mo24830h() {
        return this.f30035a;
    }

    public int hashCode() {
        return mo24970p();
    }

    /* renamed from: i */
    public boolean mo24832i(int i) {
        return this.f30042h[i];
    }

    public boolean isInline() {
        return C12217f.C12218a.m48900f(this);
    }

    /* renamed from: k */
    public final void mo24966k(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        String[] strArr = this.f30039e;
        int i = this.f30038d + 1;
        this.f30038d = i;
        strArr[i] = str;
        this.f30042h[i] = z;
        this.f30040f[i] = null;
        if (i == this.f30037c - 1) {
            this.f30043i = mo24967m();
        }
    }

    /* renamed from: m */
    public final Map<String, Integer> mo24967m() {
        HashMap hashMap = new HashMap();
        int length = this.f30039e.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(this.f30039e[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: n */
    public final C12248g<?>[] mo24968n() {
        return (C12248g[]) this.f30044j.getValue();
    }

    @C12579k
    /* renamed from: o */
    public final C12217f[] mo24969o() {
        return (C12217f[]) this.f30045k.getValue();
    }

    /* renamed from: p */
    public final int mo24970p() {
        return ((Number) this.f30046l.getValue()).intValue();
    }

    /* renamed from: q */
    public final void mo24971q(@C12579k Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List<Annotation> list = this.f30040f[this.f30038d];
        if (list == null) {
            list = new ArrayList<>(1);
            this.f30040f[this.f30038d] = list;
        }
        list.add(annotation);
    }

    /* renamed from: r */
    public final void mo24972r(@C12579k Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "a");
        if (this.f30041g == null) {
            this.f30041g = new ArrayList(1);
        }
        List<Annotation> list = this.f30041g;
        Intrinsics.checkNotNull(list);
        list.add(annotation);
    }

    @C12579k
    public String toString() {
        return CollectionsKt___CollectionsKt.m40639h3(C11479u.m44378W1(0, this.f30037c), ", ", Intrinsics.stringPlus(mo24830h(), "("), ")", 0, (CharSequence) null, new PluginGeneratedSerialDescriptor$toString$1(this), 24, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, C12327y yVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : yVar, i);
    }
}

package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11532s0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10929d0;
import kotlin.collections.C10956m;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12256b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12247f
public final class SealedClassSerializer<T> extends C12256b<T> {
    @C12579k

    /* renamed from: a */
    public final C11494d<T> f29959a;
    @C12579k

    /* renamed from: b */
    public List<? extends Annotation> f29960b;
    @C12579k

    /* renamed from: c */
    public final C11677z f29961c;
    @C12579k

    /* renamed from: d */
    public final Map<C11494d<? extends T>, C12248g<? extends T>> f29962d;
    @C12579k

    /* renamed from: e */
    public final Map<String, C12248g<? extends T>> f29963e;

    /* renamed from: kotlinx.serialization.SealedClassSerializer$a */
    public static final class C12193a implements C10929d0<Map.Entry<? extends C11494d<? extends T>, ? extends C12248g<? extends T>>, String> {

        /* renamed from: a */
        public final /* synthetic */ Iterable f29964a;

        public C12193a(Iterable iterable) {
            this.f29964a = iterable;
        }

        /* renamed from: a */
        public String mo21944a(Map.Entry<? extends C11494d<? extends T>, ? extends C12248g<? extends T>> entry) {
            return ((C12248g) entry.getValue()).getDescriptor().mo24830h();
        }

        @C12579k
        /* renamed from: b */
        public Iterator<Map.Entry<? extends C11494d<? extends T>, ? extends C12248g<? extends T>>> mo21945b() {
            return this.f29964a.iterator();
        }
    }

    public SealedClassSerializer(@C12579k String str, @C12579k C11494d<T> dVar, @C12579k C11494d<? extends T>[] dVarArr, @C12579k C12248g<? extends T>[] gVarArr) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(dVarArr, "subclasses");
        Intrinsics.checkNotNullParameter(gVarArr, "subclassSerializers");
        this.f29959a = dVar;
        this.f29960b = CollectionsKt__CollectionsKt.m40441E();
        this.f29961c = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, new SealedClassSerializer$descriptor$2(str, this, gVarArr));
        if (dVarArr.length == gVarArr.length) {
            Map<C11494d<? extends T>, C12248g<? extends T>> B0 = C10977s0.m41426B0(ArraysKt___ArraysKt.m39422UA(dVarArr, gVarArr));
            this.f29962d = B0;
            C12193a aVar = new C12193a(B0.entrySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator b = aVar.mo21945b();
            while (b.hasNext()) {
                Object next = b.next();
                Object a = aVar.mo21944a(next);
                Object obj = linkedHashMap.get(a);
                if (obj == null) {
                    boolean containsKey = linkedHashMap.containsKey(a);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str2 = (String) a;
                if (entry2 == null) {
                    linkedHashMap.put(a, entry);
                } else {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + mo24807d() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (C12248g) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f29963e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + mo24807d().mo22848s() + " should be marked @Serializable");
    }

    @C12580l
    /* renamed from: b */
    public C12199c<? extends T> mo24811b(@C12579k C12236c cVar, @C12580l String str) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        C12248g gVar = this.f29963e.get(str);
        if (gVar == null) {
            return super.mo24811b(cVar, str);
        }
        return gVar;
    }

    @C12580l
    /* renamed from: c */
    public C12440p<T> mo24812c(@C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        C12440p<T> pVar = this.f29962d.get(C11342l0.m43547d(t.getClass()));
        if (pVar == null) {
            pVar = super.mo24812c(gVar, t);
        }
        if (pVar == null) {
            return null;
        }
        return pVar;
    }

    @C12579k
    /* renamed from: d */
    public C11494d<T> mo24807d() {
        return this.f29959a;
    }

    @C12579k
    public C12217f getDescriptor() {
        return (C12217f) this.f29961c.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11532s0
    public SealedClassSerializer(@C12579k String str, @C12579k C11494d<T> dVar, @C12579k C11494d<? extends T>[] dVarArr, @C12579k C12248g<? extends T>[] gVarArr, @C12579k Annotation[] annotationArr) {
        this(str, dVar, dVarArr, gVarArr);
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(dVarArr, "subclasses");
        Intrinsics.checkNotNullParameter(gVarArr, "subclassSerializers");
        Intrinsics.checkNotNullParameter(annotationArr, "classAnnotations");
        this.f29960b = C10956m.m41290t(annotationArr);
    }
}

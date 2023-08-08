package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11532s0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.internal.C12256b;
import org.jetbrains.annotations.C12579k;

public final class PolymorphicSerializer<T> extends C12256b<T> {
    @C12579k

    /* renamed from: a */
    public final C11494d<T> f29956a;
    @C12579k

    /* renamed from: b */
    public List<? extends Annotation> f29957b;
    @C12579k

    /* renamed from: c */
    public final C11677z f29958c;

    public PolymorphicSerializer(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        this.f29956a = dVar;
        this.f29957b = CollectionsKt__CollectionsKt.m40441E();
        this.f29958c = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, new PolymorphicSerializer$descriptor$2(this));
    }

    @C12579k
    /* renamed from: d */
    public C11494d<T> mo24807d() {
        return this.f29956a;
    }

    @C12579k
    public C12217f getDescriptor() {
        return (C12217f) this.f29958c.getValue();
    }

    @C12579k
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo24807d() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11532s0
    public PolymorphicSerializer(@C12579k C11494d<T> dVar, @C12579k Annotation[] annotationArr) {
        this(dVar);
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(annotationArr, "classAnnotations");
        this.f29957b = C10956m.m41290t(annotationArr);
    }
}

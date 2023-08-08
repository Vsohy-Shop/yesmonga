package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11532s0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
public final class ObjectSerializer<T> implements C12248g<T> {
    @C12579k

    /* renamed from: a */
    public final T f30031a;
    @C12579k

    /* renamed from: b */
    public List<? extends Annotation> f30032b;
    @C12579k

    /* renamed from: c */
    public final C11677z f30033c;

    public ObjectSerializer(@C12579k String str, @C12579k T t) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(t, "objectInstance");
        this.f30031a = t;
        this.f30032b = CollectionsKt__CollectionsKt.m40441E();
        this.f30033c = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, new ObjectSerializer$descriptor$2(str, this));
    }

    @C12579k
    public T deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        eVar.mo24875b(getDescriptor()).mo24876c(getDescriptor());
        return this.f30031a;
    }

    @C12579k
    public C12217f getDescriptor() {
        return (C12217f) this.f30033c.getValue();
    }

    public void serialize(@C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        gVar.mo24906b(getDescriptor()).mo24907c(getDescriptor());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11532s0
    public ObjectSerializer(@C12579k String str, @C12579k T t, @C12579k Annotation[] annotationArr) {
        this(str, t);
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(t, "objectInstance");
        Intrinsics.checkNotNullParameter(annotationArr, "classAnnotations");
        this.f30032b = C10956m.m41290t(annotationArr);
    }
}

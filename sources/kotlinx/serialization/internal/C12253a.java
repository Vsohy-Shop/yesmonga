package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12247f
/* renamed from: kotlinx.serialization.internal.a */
public abstract class C12253a<Element, Collection, Builder> implements C12248g<Collection> {
    public /* synthetic */ C12253a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m49180i(C12253a aVar, C12236c cVar, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 8) != 0) {
                z = true;
            }
            aVar.mo25010h(cVar, i, obj, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    /* renamed from: a */
    public abstract Builder mo25003a();

    /* renamed from: b */
    public abstract int mo25004b(Builder builder);

    /* renamed from: c */
    public abstract void mo25005c(Builder builder, int i);

    @C12579k
    /* renamed from: d */
    public abstract Iterator<Element> mo25006d(Collection collection);

    public Collection deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return mo25008f(eVar, (Object) null);
    }

    /* renamed from: e */
    public abstract int mo25007e(Collection collection);

    @C12247f
    /* renamed from: f */
    public final Collection mo25008f(@C12579k C12241e eVar, @C12580l Collection collection) {
        Object obj;
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        if (collection == null) {
            obj = null;
        } else {
            obj = mo25012k(collection);
        }
        if (obj == null) {
            obj = mo25003a();
        }
        int b = mo25004b(obj);
        C12236c b2 = eVar.mo24875b(getDescriptor());
        if (b2.mo24886p()) {
            mo25009g(b2, obj, b, mo25011j(b2, obj));
        } else {
            while (true) {
                int o = b2.mo24931o(getDescriptor());
                if (o == -1) {
                    break;
                }
                m49180i(this, b2, b + o, obj, false, 8, (Object) null);
            }
        }
        b2.mo24876c(getDescriptor());
        return mo25013l(obj);
    }

    /* renamed from: g */
    public abstract void mo25009g(@C12579k C12236c cVar, Builder builder, int i, int i2);

    /* renamed from: h */
    public abstract void mo25010h(@C12579k C12236c cVar, int i, Builder builder, boolean z);

    /* renamed from: j */
    public final int mo25011j(C12236c cVar, Builder builder) {
        int k = cVar.mo24882k(getDescriptor());
        mo25005c(builder, k);
        return k;
    }

    /* renamed from: k */
    public abstract Builder mo25012k(Collection collection);

    /* renamed from: l */
    public abstract Collection mo25013l(Builder builder);

    public abstract void serialize(@C12579k C12244g gVar, Collection collection);

    public C12253a() {
    }
}

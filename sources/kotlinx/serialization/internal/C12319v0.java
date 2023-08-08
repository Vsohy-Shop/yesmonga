package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11463j;
import kotlin.ranges.C11479u;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C12247f
/* renamed from: kotlinx.serialization.internal.v0 */
public abstract class C12319v0<Key, Value, Collection, Builder extends Map<Key, Value>> extends C12253a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    @C12579k

    /* renamed from: a */
    public final C12248g<Key> f30138a;
    @C12579k

    /* renamed from: b */
    public final C12248g<Value> f30139b;

    public /* synthetic */ C12319v0(C12248g gVar, C12248g gVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, gVar2);
    }

    @C12579k
    public abstract C12217f getDescriptor();

    @C12579k
    /* renamed from: m */
    public final C12248g<Key> mo25192m() {
        return this.f30138a;
    }

    @C12579k
    /* renamed from: n */
    public final C12248g<Value> mo25193n() {
        return this.f30139b;
    }

    /* renamed from: o */
    public abstract void mo25014o(@C12579k Builder builder, int i, Key key, Value value);

    /* renamed from: p */
    public final void mo25009g(@C12579k C12236c cVar, @C12579k Builder builder, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, i2 * 2), 2);
            int r = B1.mo23049r();
            int w = B1.mo23051w();
            int y = B1.mo23052y();
            if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
                while (true) {
                    int i3 = r + y;
                    mo25010h(cVar, i + r, builder, false);
                    if (r != w) {
                        r = i3;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* renamed from: q */
    public final void mo25010h(@C12579k C12236c cVar, int i, @C12579k Builder builder, boolean z) {
        int i2;
        Value value;
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object d = C12236c.C12238b.m49005d(cVar, getDescriptor(), i, this.f30138a, (Object) null, 8, (Object) null);
        boolean z2 = true;
        if (z) {
            i2 = cVar.mo24931o(getDescriptor());
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        if (!builder.containsKey(d) || (this.f30139b.getDescriptor().getKind() instanceof C12207e)) {
            value = C12236c.C12238b.m49005d(cVar, getDescriptor(), i3, this.f30139b, (Object) null, 8, (Object) null);
        } else {
            value = cVar.mo24895y(getDescriptor(), i3, this.f30139b, C10977s0.m41443K(builder, d));
        }
        builder.put(d, value);
    }

    public void serialize(@C12579k C12244g gVar, Collection collection) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        int e = mo25007e(collection);
        C12217f descriptor = getDescriptor();
        C12239d j = gVar.mo24913j(descriptor, e);
        Iterator d = mo25006d(collection);
        int i = 0;
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            j.mo24899D(getDescriptor(), i, mo25192m(), key);
            j.mo24899D(getDescriptor(), i2, mo25193n(), value);
            i = i2 + 1;
        }
        j.mo24907c(descriptor);
    }

    public C12319v0(C12248g<Key> gVar, C12248g<Value> gVar2) {
        super((DefaultConstructorMarker) null);
        this.f30138a = gVar;
        this.f30139b = gVar2;
    }
}

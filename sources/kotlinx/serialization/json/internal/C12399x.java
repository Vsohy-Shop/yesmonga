package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12344b;
import kotlinx.serialization.json.C12403k;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.x */
public final class C12399x extends C12363c {
    @C12579k

    /* renamed from: i */
    public final C12344b f30336i;

    /* renamed from: j */
    public final int f30337j = mo25399A0().size();

    /* renamed from: k */
    public int f30338k = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12399x(@C12579k C12341a aVar, @C12579k C12344b bVar) {
        super(aVar, bVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(bVar, "value");
        this.f30336i = bVar;
    }

    @C12579k
    /* renamed from: D0 */
    public C12344b mo25399A0() {
        return this.f30336i;
    }

    @C12579k
    /* renamed from: g0 */
    public String mo25204g0(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "desc");
        return String.valueOf(i);
    }

    @C12579k
    /* renamed from: k0 */
    public C12403k mo25403k0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        return mo25399A0().get(Integer.parseInt(str));
    }

    /* renamed from: o */
    public int mo24931o(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        int i = this.f30338k;
        if (i >= this.f30337j - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f30338k = i2;
        return i2;
    }
}

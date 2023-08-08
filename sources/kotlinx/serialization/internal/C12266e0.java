package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12327y;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.internal.e0 */
public final class C12266e0 {

    /* renamed from: kotlinx.serialization.internal.e0$a */
    public static final class C12267a implements C12327y<T> {

        /* renamed from: a */
        public final /* synthetic */ C12248g<T> f30057a;

        public C12267a(C12248g<T> gVar) {
            this.f30057a = gVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: kotlinx.serialization.g<?>[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public kotlinx.serialization.C12248g<?>[] childSerializers() {
            /*
                r3 = this;
                r0 = 1
                kotlinx.serialization.g[] r0 = new kotlinx.serialization.C12248g[r0]
                r1 = 0
                kotlinx.serialization.g<T> r2 = r3.f30057a
                r0[r1] = r2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.C12266e0.C12267a.childSerializers():kotlinx.serialization.g[]");
        }

        public T deserialize(@C12579k C12241e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @C12579k
        public C12217f getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        public void serialize(@C12579k C12244g gVar, T t) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final <T> C12217f m49261a(@C12579k String str, @C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(gVar, "primitiveSerializer");
        return new C12263d0(str, new C12267a(gVar));
    }
}

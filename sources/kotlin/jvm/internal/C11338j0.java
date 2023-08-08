package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.C11665v0;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.C11492c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.1")
/* renamed from: kotlin.jvm.internal.j0 */
public final class C11338j0 implements C11362r {
    @C12579k

    /* renamed from: a */
    public final Class<?> f28457a;
    @C12579k

    /* renamed from: b */
    public final String f28458b;

    public C11338j0(@C12579k Class<?> cls, @C12579k String str) {
        Intrinsics.checkNotNullParameter(cls, "jClass");
        Intrinsics.checkNotNullParameter(str, "moduleName");
        this.f28457a = cls;
        this.f28458b = str;
    }

    @C12579k
    /* renamed from: a */
    public Collection<C11492c<?>> mo22784a() {
        throw new KotlinReflectionNotSupportedError();
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof C11338j0) && Intrinsics.areEqual((Object) mo22787o(), (Object) ((C11338j0) obj).mo22787o());
    }

    public int hashCode() {
        return mo22787o().hashCode();
    }

    @C12579k
    /* renamed from: o */
    public Class<?> mo22787o() {
        return this.f28457a;
    }

    @C12579k
    public String toString() {
        return mo22787o().toString() + C11342l0.f28466b;
    }
}

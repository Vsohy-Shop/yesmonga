package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.C11429q;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11429q
/* renamed from: kotlin.reflect.a */
public final class C11490a implements GenericArrayType, C11526u {
    @C12579k

    /* renamed from: a */
    public final Type f28654a;

    public C11490a(@C12579k Type type) {
        Intrinsics.checkNotNullParameter(type, "elementType");
        this.f28654a = type;
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof GenericArrayType) && Intrinsics.areEqual((Object) getGenericComponentType(), (Object) ((GenericArrayType) obj).getGenericComponentType());
    }

    @C12579k
    public Type getGenericComponentType() {
        return this.f28654a;
    }

    @C12579k
    public String getTypeName() {
        return TypesJVMKt.m44501j(this.f28654a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @C12579k
    public String toString() {
        return getTypeName();
    }
}

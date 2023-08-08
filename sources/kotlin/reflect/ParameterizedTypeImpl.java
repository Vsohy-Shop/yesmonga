package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.C11429q;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11429q
@C11363r0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
public final class ParameterizedTypeImpl implements ParameterizedType, C11526u {
    @C12579k

    /* renamed from: a */
    public final Class<?> f28649a;
    @C12580l

    /* renamed from: b */
    public final Type f28650b;
    @C12579k

    /* renamed from: c */
    public final Type[] f28651c;

    public ParameterizedTypeImpl(@C12579k Class<?> cls, @C12580l Type type, @C12579k List<? extends Type> list) {
        Intrinsics.checkNotNullParameter(cls, "rawType");
        Intrinsics.checkNotNullParameter(list, "typeArguments");
        this.f28649a = cls;
        this.f28650b = type;
        this.f28651c = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!Intrinsics.areEqual((Object) this.f28649a, (Object) parameterizedType.getRawType()) || !Intrinsics.areEqual((Object) this.f28650b, (Object) parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @C12579k
    public Type[] getActualTypeArguments() {
        return this.f28651c;
    }

    @C12580l
    public Type getOwnerType() {
        return this.f28650b;
    }

    @C12579k
    public Type getRawType() {
        return this.f28649a;
    }

    @C12579k
    public String getTypeName() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Type type = this.f28650b;
        if (type != null) {
            sb.append(TypesJVMKt.m44501j(type));
            sb.append("$");
            sb.append(this.f28649a.getSimpleName());
        } else {
            sb.append(TypesJVMKt.m44501j(this.f28649a));
        }
        Type[] typeArr = this.f28651c;
        if (typeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArraysKt___ArraysKt.m40247uh(typeArr, sb, (CharSequence) null, "<", ">", 0, (CharSequence) null, ParameterizedTypeImpl$getTypeName$1$1.f28652a, 50, (Object) null);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f28649a.hashCode();
        Type type = this.f28650b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @C12579k
    public String toString() {
        return getTypeName();
    }
}

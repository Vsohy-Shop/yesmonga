package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements C11300l<Type, String> {

    /* renamed from: a */
    public static final ParameterizedTypeImpl$getTypeName$1$1 f28652a = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @C12579k
    /* renamed from: d */
    public final String invoke(@C12579k Type type) {
        Intrinsics.checkNotNullParameter(type, "p0");
        return TypesJVMKt.m44501j(type);
    }
}

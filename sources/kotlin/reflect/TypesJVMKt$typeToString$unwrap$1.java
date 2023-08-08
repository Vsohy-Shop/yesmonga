package kotlin.reflect;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements C11300l<Class<?>, Class<?>> {

    /* renamed from: a */
    public static final TypesJVMKt$typeToString$unwrap$1 f28653a = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    /* renamed from: d */
    public final Class<?> invoke(@C12579k Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "p0");
        return cls.getComponentType();
    }
}

package kotlinx.serialization.modules;

import androidx.core.app.C17075f2;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, mo22516d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "msg", "<init>", "(Ljava/lang/String;)V", "Lkotlin/reflect/d;", "baseClass", "concreteClass", "(Lkotlin/reflect/d;Lkotlin/reflect/d;)V", "kotlinx-serialization-core"}, mo22517k = 1, mo22518mv = {1, 6, 0})
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(@C12579k String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, C17075f2.f45108s0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(@C12579k C11494d<?> dVar, @C12579k C11494d<?> dVar2) {
        this("Serializer for " + dVar2 + " already registered in the scope of " + dVar);
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(dVar2, "concreteClass");
    }
}

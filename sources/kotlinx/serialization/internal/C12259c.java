package kotlinx.serialization.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.internal.c */
public final class C12259c {
    @C11314h(name = "throwSubtypeNotRegistered")
    @C12579k
    /* renamed from: a */
    public static final Void m49237a(@C12580l String str, @C12579k C11494d<?> dVar) {
        String str2;
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        String str3 = "in the scope of '" + dVar.mo22848s() + '\'';
        if (str == null) {
            str2 = Intrinsics.stringPlus("Class discriminator was missing and no default polymorphic serializers were registered ", str3);
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new SerializationException(str2);
    }

    @C11314h(name = "throwSubtypeNotRegistered")
    @C12579k
    /* renamed from: b */
    public static final Void m49238b(@C12579k C11494d<?> dVar, @C12579k C11494d<?> dVar2) {
        Intrinsics.checkNotNullParameter(dVar, "subClass");
        Intrinsics.checkNotNullParameter(dVar2, "baseClass");
        String s = dVar.mo22848s();
        if (s == null) {
            s = String.valueOf(dVar);
        }
        m49237a(s, dVar2);
        throw new KotlinNothingValueException();
    }
}

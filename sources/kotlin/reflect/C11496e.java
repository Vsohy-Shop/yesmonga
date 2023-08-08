package kotlin.reflect;

import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.internal.C11112h;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "KClasses")
@C11363r0({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
/* renamed from: kotlin.reflect.e */
public final class C11496e {
    @C11665v0(version = "1.4")
    @C11112h
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: a */
    public static final <T> T m44538a(@C12579k C11494d<T> dVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.mo22844n(obj)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.mo22845p());
    }

    @C12580l
    @C11665v0(version = "1.4")
    @C11112h
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: b */
    public static final <T> T m44539b(@C12579k C11494d<T> dVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!dVar.mo22844n(obj)) {
            return null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}

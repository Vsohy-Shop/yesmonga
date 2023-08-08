package kotlinx.serialization;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12256b;
import kotlinx.serialization.internal.C12259c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.i */
public final class C12250i {
    @C12247f
    @C12579k
    /* renamed from: a */
    public static final <T> C12199c<? extends T> m49067a(@C12579k C12256b<T> bVar, @C12579k C12236c cVar, @C12580l String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        C12199c<? extends T> b = bVar.mo24811b(cVar, str);
        if (b != null) {
            return b;
        }
        C12259c.m49237a(str, bVar.mo24807d());
        throw new KotlinNothingValueException();
    }

    @C12247f
    @C12579k
    /* renamed from: b */
    public static final <T> C12440p<T> m49068b(@C12579k C12256b<T> bVar, @C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        C12440p<T> c = bVar.mo24812c(gVar, t);
        if (c != null) {
            return c;
        }
        C12259c.m49238b(C11342l0.m43547d(t.getClass()), bVar.mo24807d());
        throw new KotlinNothingValueException();
    }
}

package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2539c;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.layout.i */
public final class C2550i {
    @C2855v
    @C12579k
    /* renamed from: a */
    public static final C2549h m11423a(@C12579k C8578k2<? extends C2549h> k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "delegate");
        return new DefaultDelegatingLazyLayoutItemProvider(k2Var);
    }

    @C2855v
    @C12579k
    /* renamed from: b */
    public static final <T extends LazyLayoutIntervalContent> C2549h m11424b(@C12579k C2539c<? extends T> cVar, @C12579k C11466l lVar, @C12579k C11306r<? super C2539c.C2540a<? extends T>, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(cVar, "intervals");
        Intrinsics.checkNotNullParameter(lVar, "nearestItemsRange");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        return new DefaultLazyLayoutItemsProvider(rVar, cVar, lVar);
    }

    @C2855v
    /* renamed from: c */
    public static final int m11425c(@C12579k C2549h hVar, @C12580l Object obj, int i) {
        Integer num;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (obj == null) {
            return i;
        }
        if ((i >= hVar.mo8288a() || !Intrinsics.areEqual(obj, hVar.mo8293g(i))) && (num = hVar.mo8292f().get(obj)) != null) {
            return num.intValue();
        }
        return i;
    }
}

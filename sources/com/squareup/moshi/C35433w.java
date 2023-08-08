package com.squareup.moshi;

import androidx.exifinterface.media.C19135a;
import com.squareup.moshi.C35410s;
import com.squareup.moshi.internal.C35391a;
import com.squareup.moshi.internal.C35392b;
import kotlin.C11429q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11520r;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.squareup.moshi.w */
public final class C35433w {
    @C11429q
    /* renamed from: a */
    public static final /* synthetic */ <T> C35384h<T> m146031a(C35410s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "$this$adapter");
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return m146032b(sVar, (C11520r) null);
    }

    @C11429q
    @C12579k
    /* renamed from: b */
    public static final <T> C35384h<T> m146032b(@C12579k C35410s sVar, @C12579k C11520r rVar) {
        Intrinsics.checkNotNullParameter(sVar, "$this$adapter");
        Intrinsics.checkNotNullParameter(rVar, "ktype");
        C35384h<T> d = sVar.mo106086d(TypesJVMKt.m44497f(rVar));
        if (!(d instanceof C35392b) && !(d instanceof C35391a)) {
            if (rVar.mo22754e()) {
                d = d.nullSafe();
            } else {
                d = d.nonNull();
            }
            Intrinsics.checkNotNullExpressionValue(d, "if (ktype.isMarkedNullab…    adapter.nonNull()\n  }");
        }
        return d;
    }

    @C11429q
    /* renamed from: c */
    public static final /* synthetic */ <T> C35410s.C35413c m146033c(C35410s.C35413c cVar, C35384h<T> hVar) {
        Intrinsics.checkNotNullParameter(cVar, "$this$addAdapter");
        Intrinsics.checkNotNullParameter(hVar, "adapter");
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        C35410s.C35413c c = cVar.mo106096c(TypesJVMKt.m44497f((C11520r) null), hVar);
        Intrinsics.checkNotNullExpressionValue(c, "add(typeOf<T>().javaType, adapter)");
        return c;
    }
}

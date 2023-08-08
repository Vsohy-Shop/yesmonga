package com.squareup.moshi;

import androidx.exifinterface.media.C19135a;
import com.squareup.moshi.internal.C35393c;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Set;
import kotlin.C11429q;
import kotlin.jvm.C11283a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11520r;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.squareup.moshi.x */
public final class C35434x {
    @C12579k
    /* renamed from: a */
    public static final GenericArrayType m146034a(@C12579k Type type) {
        Intrinsics.checkNotNullParameter(type, "$this$asArrayType");
        GenericArrayType b = C35431v.m146015b(type);
        Intrinsics.checkNotNullExpressionValue(b, "Types.arrayOf(this)");
        return b;
    }

    @C12579k
    /* renamed from: b */
    public static final GenericArrayType m146035b(@C12579k C11494d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "$this$asArrayType");
        return m146034a(C11283a.m43409e(dVar));
    }

    @C11429q
    @C12579k
    /* renamed from: c */
    public static final GenericArrayType m146036c(@C12579k C11520r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "$this$asArrayType");
        return m146034a(TypesJVMKt.m44497f(rVar));
    }

    @C12579k
    /* renamed from: d */
    public static final Class<?> m146037d(@C12579k Type type) {
        Intrinsics.checkNotNullParameter(type, "$this$rawType");
        Class<?> j = C35431v.m146023j(type);
        Intrinsics.checkNotNullExpressionValue(j, "Types.getRawType(this)");
        return j;
    }

    /* renamed from: e */
    public static final /* synthetic */ <T extends Annotation> Set<Annotation> m146038e(Set<? extends Annotation> set) {
        Intrinsics.checkNotNullParameter(set, "$this$nextAnnotations");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return C35431v.m146028o(set, Annotation.class);
    }

    @C11429q
    /* renamed from: f */
    public static final /* synthetic */ <T> WildcardType m146039f() {
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        Type f = TypesJVMKt.m44497f((C11520r) null);
        if (f instanceof Class) {
            f = C35393c.m145802a((Class) f);
            Intrinsics.checkNotNullExpressionValue(f, "Util.boxIfPrimitive(type)");
        }
        WildcardType p = C35431v.m146029p(f);
        Intrinsics.checkNotNullExpressionValue(p, "Types.subtypeOf(type)");
        return p;
    }

    @C11429q
    /* renamed from: g */
    public static final /* synthetic */ <T> WildcardType m146040g() {
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        Type f = TypesJVMKt.m44497f((C11520r) null);
        if (f instanceof Class) {
            f = C35393c.m145802a((Class) f);
            Intrinsics.checkNotNullExpressionValue(f, "Util.boxIfPrimitive(type)");
        }
        WildcardType q = C35431v.m146030q(f);
        Intrinsics.checkNotNullExpressionValue(q, "Types.supertypeOf(type)");
        return q;
    }
}

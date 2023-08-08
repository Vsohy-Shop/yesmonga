package com.urbanairship.android.layout.util;

import androidx.exifinterface.media.C19135a;
import androidx.lifecycle.C19456p0;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.util.i */
public final class C35915i {
    @C12579k
    /* renamed from: a */
    public static final C9322a m148077a(@C12579k Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, C19456p0.f49833g);
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object L : objArr) {
            arrayList.add(JsonValue.m34966L(L));
        }
        return new C9322a(arrayList);
    }

    @C12579k
    /* renamed from: b */
    public static final C9323b m148078b(@C12579k Pair<String, ?>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "fields");
        C9323b.C9325b y = C9323b.m35017y();
        for (Pair<String, ?> pair : pairArr) {
            y.mo18822f(pair.mo21846a(), JsonValue.m34966L(pair.mo21847b()));
        }
        C9323b a = y.mo18817a();
        Intrinsics.checkNotNullExpressionValue(a, "newBuilder().apply {\n   …)\n        }\n    }.build()");
        return a;
    }

    /* renamed from: c */
    public static final /* synthetic */ <T> T m148079c(C9323b bVar, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        JsonValue k = bVar.mo18812k(str);
        if (k == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        Class<Object> cls = Object.class;
        C11494d d = C11342l0.m43547d(cls);
        if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(String.class))) {
            T B = k.mo18750B();
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return B;
        } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
            T valueOf = Boolean.valueOf(k.mo18757c(false));
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return valueOf;
        } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
            T valueOf2 = Long.valueOf(k.mo18766i(0));
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return valueOf2;
        } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
            T valueOf3 = Double.valueOf(k.mo18758d(0.0d));
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return valueOf3;
        } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
            T valueOf4 = Integer.valueOf(k.mo18762f(0));
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return valueOf4;
        } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
            T z = k.mo18784z();
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return z;
        } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
            T A = k.mo18749A();
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return A;
        } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
            T q = k.mo17264q();
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return q;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid type '");
            Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
            sb.append(cls.getSimpleName());
            sb.append("' for field '");
            sb.append(str);
            sb.append('\'');
            throw new JsonException(sb.toString());
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ <T> T m148080d(C9323b bVar, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        JsonValue k = bVar.mo18812k(str);
        if (k != null) {
            Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
            Class<Object> cls = Object.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(String.class))) {
                T B = k.mo18750B();
                Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
                return B;
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                T valueOf = Boolean.valueOf(k.mo18757c(false));
                Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
                return valueOf;
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                T valueOf2 = Long.valueOf(k.mo18766i(0));
                Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
                return valueOf2;
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                T valueOf3 = Double.valueOf(k.mo18758d(0.0d));
                Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
                return valueOf3;
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                T valueOf4 = Integer.valueOf(k.mo18762f(0));
                Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
                return valueOf4;
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                T z = k.mo18784z();
                Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
                return z;
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                T A = k.mo18749A();
                Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
                return A;
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
                T q = k.mo17264q();
                Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
                return q;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid type '");
                Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
                sb.append(cls.getSimpleName());
                sb.append("' for field '");
                sb.append(str);
                sb.append('\'');
                throw new JsonException(sb.toString());
            }
        } else {
            throw new JsonException("Missing required field: '" + str + '\'');
        }
    }

    @C12579k
    /* renamed from: e */
    public static final C9322a m148081e(@C12579k List<? extends C9323b> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<C9323b> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C9323b q : iterable) {
            arrayList.add(q.mo17264q());
        }
        return new C9322a(arrayList);
    }

    @C12579k
    /* renamed from: f */
    public static final C9323b m148082f(@C12579k Map<String, ? extends JsonValue> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new C9323b(map);
    }
}

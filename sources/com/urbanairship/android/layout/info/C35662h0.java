package com.urbanairship.android.layout.info;

import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.h0 */
public final class C35662h0 extends C35659g {
    @C12579k

    /* renamed from: e */
    public final JsonValue f88152e;
    @C12580l

    /* renamed from: f */
    public final JsonValue f88153f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35662h0(@C12579k C9323b bVar) {
        super(bVar);
        JsonValue jsonValue;
        JsonValue jsonValue2;
        C9323b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "json");
        JsonValue k = bVar2.mo18812k("reporting_value");
        if (k != null) {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
            Class<JsonValue> cls = JsonValue.class;
            C11494d d = C11342l0.m43547d(cls);
            Class<String> cls2 = String.class;
            Class<C9323b> cls3 = C9323b.class;
            Class<C9322a> cls4 = C9322a.class;
            Class<Integer> cls5 = Integer.class;
            Class<JsonValue> cls6 = cls;
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls2))) {
                String B = k.mo18750B();
                if (B != null) {
                    jsonValue = (JsonValue) B;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonValue");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                jsonValue = (JsonValue) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                jsonValue = (JsonValue) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                jsonValue = (JsonValue) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls5))) {
                jsonValue = (JsonValue) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls4))) {
                C9322a z = k.mo18784z();
                if (z != null) {
                    jsonValue = (JsonValue) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonValue");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls3))) {
                C9323b A = k.mo18749A();
                if (A != null) {
                    jsonValue = (JsonValue) A;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonValue");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls6))) {
                jsonValue = k.mo17264q();
                if (jsonValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonValue");
                }
            } else {
                throw new JsonException("Invalid type '" + cls6.getSimpleName() + "' for field '" + "reporting_value" + '\'');
            }
            this.f88152e = jsonValue;
            JsonValue k2 = bVar2.mo18812k("attribute_value");
            if (k2 == null) {
                jsonValue2 = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(k2, "get(key) ?: return null");
                C11494d d2 = C11342l0.m43547d(cls6);
                if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls2))) {
                    jsonValue2 = (JsonValue) k2.mo18750B();
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    jsonValue2 = (JsonValue) Boolean.valueOf(k2.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Long.TYPE))) {
                    jsonValue2 = (JsonValue) Long.valueOf(k2.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Double.TYPE))) {
                    jsonValue2 = (JsonValue) Double.valueOf(k2.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls5))) {
                    jsonValue2 = (JsonValue) Integer.valueOf(k2.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls4))) {
                    jsonValue2 = (JsonValue) k2.mo18784z();
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls3))) {
                    jsonValue2 = (JsonValue) k2.mo18749A();
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls6))) {
                    jsonValue2 = k2.mo17264q();
                } else {
                    throw new JsonException("Invalid type '" + cls6.getSimpleName() + "' for field '" + "attribute_value" + '\'');
                }
            }
            this.f88153f = jsonValue2;
            return;
        }
        throw new JsonException("Missing required field: '" + "reporting_value" + '\'');
    }

    @C12580l
    /* renamed from: k */
    public final JsonValue mo106808k() {
        return this.f88153f;
    }

    @C12579k
    /* renamed from: l */
    public final JsonValue mo106809l() {
        return this.f88152e;
    }
}

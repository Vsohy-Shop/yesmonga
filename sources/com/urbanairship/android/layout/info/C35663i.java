package com.urbanairship.android.layout.info;

import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.info.i */
public final class C35663i extends C35659g {
    @C12579k

    /* renamed from: e */
    public final JsonValue f88154e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35663i(@C12579k C9323b bVar) {
        super(bVar);
        JsonValue jsonValue;
        Intrinsics.checkNotNullParameter(bVar, "json");
        JsonValue k = bVar.mo18812k("reporting_value");
        if (k != null) {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
            Class<JsonValue> cls = JsonValue.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(String.class))) {
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
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                jsonValue = (JsonValue) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                C9322a z = k.mo18784z();
                if (z != null) {
                    jsonValue = (JsonValue) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonValue");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                C9323b A = k.mo18749A();
                if (A != null) {
                    jsonValue = (JsonValue) A;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonValue");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                jsonValue = k.mo17264q();
                if (jsonValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonValue");
                }
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "reporting_value" + '\'');
            }
            this.f88154e = jsonValue;
            return;
        }
        throw new JsonException("Missing required field: '" + "reporting_value" + '\'');
    }

    @C12579k
    /* renamed from: k */
    public final JsonValue mo106810k() {
        return this.f88154e;
    }
}

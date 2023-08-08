package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.o0 */
public final class C35676o0 extends C35659g implements C35681r, C35678p0 {

    /* renamed from: e */
    public final /* synthetic */ C35681r f88188e;

    /* renamed from: f */
    public final /* synthetic */ C35680q0 f88189f;
    @C12580l

    /* renamed from: g */
    public final C35865a f88190g;
    @C12580l

    /* renamed from: h */
    public final JsonValue f88191h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35676o0(@C12579k C9323b bVar) {
        super(bVar);
        JsonValue jsonValue;
        Intrinsics.checkNotNullParameter(bVar, "json");
        this.f88188e = C35691u0.m147168i(bVar);
        this.f88189f = C35691u0.m147170k(bVar);
        this.f88190g = C35865a.m147925a(bVar);
        JsonValue k = bVar.mo18812k("attribute_value");
        if (k == null) {
            jsonValue = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: return null");
            Class<JsonValue> cls = JsonValue.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(String.class))) {
                jsonValue = (JsonValue) k.mo18750B();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                jsonValue = (JsonValue) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                jsonValue = (JsonValue) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                jsonValue = (JsonValue) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                jsonValue = (JsonValue) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                jsonValue = (JsonValue) k.mo18784z();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                jsonValue = (JsonValue) k.mo18749A();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                jsonValue = k.mo17264q();
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "attribute_value" + '\'');
            }
        }
        this.f88191h = jsonValue;
    }

    @C12579k
    /* renamed from: a */
    public String mo106791a() {
        return this.f88188e.mo106791a();
    }

    public boolean isRequired() {
        return this.f88189f.isRequired();
    }

    @C12580l
    /* renamed from: k */
    public final C35865a mo106827k() {
        return this.f88190g;
    }

    @C12580l
    /* renamed from: l */
    public final JsonValue mo106828l() {
        return this.f88191h;
    }
}

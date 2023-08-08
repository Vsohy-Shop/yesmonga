package com.urbanairship.android.layout.info;

import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.info.v */
public final class C35692v extends C35655e {
    @C12579k

    /* renamed from: g */
    public final C35694w f88204g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35692v(@C12579k C9323b bVar) {
        super(bVar);
        C9323b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "json");
        JsonValue k = bVar.mo18812k("label");
        if (k != null) {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
            Class<C9323b> cls = C9323b.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(String.class))) {
                String B = k.mo18750B();
                if (B != null) {
                    bVar2 = (C9323b) B;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                bVar2 = (C9323b) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                bVar2 = (C9323b) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                bVar2 = (C9323b) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                bVar2 = (C9323b) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                C9322a z = k.mo18784z();
                if (z != null) {
                    bVar2 = (C9323b) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                bVar2 = k.mo18749A();
                if (bVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
                JsonValue q = k.mo17264q();
                if (q != null) {
                    bVar2 = (C9323b) q;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                }
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "label" + '\'');
            }
            this.f88204g = new C35694w(bVar2);
            return;
        }
        throw new JsonException("Missing required field: '" + "label" + '\'');
    }

    @C12579k
    /* renamed from: k */
    public final C35694w mo106838k() {
        return this.f88204g;
    }
}

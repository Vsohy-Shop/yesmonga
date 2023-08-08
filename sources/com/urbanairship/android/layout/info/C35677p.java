package com.urbanairship.android.layout.info;

import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.info.C35686t0;
import com.urbanairship.android.layout.info.C35689u;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.info.p */
public final class C35677p extends C35679q {
    @C12579k

    /* renamed from: f */
    public final C35686t0 f88192f;
    @C12579k

    /* renamed from: g */
    public final List<C35689u.C35690a> f88193g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35677p(@C12579k C9323b bVar) {
        super(bVar);
        C9323b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "json");
        C35686t0.C35687a aVar = C35686t0.f88201a;
        JsonValue k = bVar.mo18812k(C40383c.f102945c);
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
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + C40383c.f102945c + '\'');
            }
            this.f88192f = aVar.mo106835a(bVar2);
            this.f88193g = C10976s.m41419k(new C35689u.C35690a(getView()));
            return;
        }
        throw new JsonException("Missing required field: '" + C40383c.f102945c + '\'');
    }

    @C12579k
    public C35686t0 getView() {
        return this.f88192f;
    }

    @C12579k
    /* renamed from: k */
    public List<C35689u.C35690a> mo106789k() {
        return this.f88193g;
    }
}

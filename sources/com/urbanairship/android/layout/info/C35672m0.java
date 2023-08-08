package com.urbanairship.android.layout.info;

import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.info.C35686t0;
import com.urbanairship.android.layout.info.C35689u;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.m0 */
public final class C35672m0 extends C35684s0<C35689u.C35690a> implements C35682r0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88177b;
    @C12579k

    /* renamed from: c */
    public final C35686t0 f88178c;
    @C12579k

    /* renamed from: d */
    public final List<C35689u.C35690a> f88179d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35672m0(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        C9323b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "json");
        this.f88177b = C35691u0.m147171l(bVar);
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
            C35686t0 a = aVar.mo106835a(bVar2);
            this.f88178c = a;
            this.f88179d = C10976s.m41419k(new C35689u.C35690a(a));
            return;
        }
        throw new JsonException("Missing required field: '" + C40383c.f102945c + '\'');
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88177b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88177b.getBackgroundColor();
    }

    @C12579k
    public ViewType getType() {
        return this.f88177b.getType();
    }

    @C12579k
    public final C35686t0 getView() {
        return this.f88178c;
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88177b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88177b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88177b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public List<C35689u.C35690a> mo106789k() {
        return this.f88179d;
    }
}

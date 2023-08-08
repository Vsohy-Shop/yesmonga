package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.C35844o;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.List;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.k0 */
public final class C35668k0 extends C35686t0 implements C35682r0, C35681r, C35645a, C35678p0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88163b;

    /* renamed from: c */
    public final /* synthetic */ C35681r f88164c;

    /* renamed from: d */
    public final /* synthetic */ C35645a f88165d;

    /* renamed from: e */
    public final /* synthetic */ C35680q0 f88166e;
    @C12579k

    /* renamed from: f */
    public final C35844o f88167f;
    @C12580l

    /* renamed from: g */
    public final C35865a f88168g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35668k0(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        C9323b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "json");
        this.f88163b = C35691u0.m147171l(bVar);
        this.f88164c = C35691u0.m147168i(bVar);
        this.f88165d = C35691u0.m147166g(bVar);
        this.f88166e = C35691u0.m147170k(bVar);
        JsonValue k = bVar.mo18812k("style");
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
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "style" + '\'');
            }
            C35844o a = C35844o.m147789a(bVar2);
            Intrinsics.checkNotNullExpressionValue(a, "fromJson(json.requireField(\"style\"))");
            this.f88167f = a;
            this.f88168g = C35865a.m147925a(bVar);
            return;
        }
        throw new JsonException("Missing required field: '" + "style" + '\'');
    }

    @C12579k
    /* renamed from: a */
    public String mo106791a() {
        return this.f88164c.mo106791a();
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88163b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88163b.getBackgroundColor();
    }

    @C12580l
    public String getContentDescription() {
        return this.f88165d.getContentDescription();
    }

    @C12579k
    public ViewType getType() {
        return this.f88163b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88163b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88163b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88163b.mo106779i();
    }

    public boolean isRequired() {
        return this.f88166e.isRequired();
    }

    @C12580l
    /* renamed from: k */
    public final C35865a mo106816k() {
        return this.f88168g;
    }

    @C12579k
    /* renamed from: l */
    public final C35844o mo106817l() {
        return this.f88167f;
    }
}

package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.j */
public final class C35665j extends C35684s0<C35667k> implements C35682r0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88155b;
    @C12579k

    /* renamed from: c */
    public final List<C35667k> f88156c;
    @C12579k

    /* renamed from: d */
    public final List<C35667k> f88157d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35665j(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        C9322a<JsonValue> aVar;
        Intrinsics.checkNotNullParameter(bVar, "json");
        this.f88155b = C35691u0.m147171l(bVar);
        JsonValue k = bVar.mo18812k("items");
        if (k != null) {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
            Class<C9322a> cls = C9322a.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(String.class))) {
                String B = k.mo18750B();
                if (B != null) {
                    aVar = (C9322a) B;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                aVar = (C9322a) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                aVar = (C9322a) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                aVar = (C9322a) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                aVar = (C9322a) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                aVar = k.mo18784z();
                if (aVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                C9323b A = k.mo18749A();
                if (A != null) {
                    aVar = (C9322a) A;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
                JsonValue q = k.mo17264q();
                if (q != null) {
                    aVar = (C9322a) q;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                }
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "items" + '\'');
            }
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(aVar, 10));
            for (JsonValue E : aVar) {
                C9323b E2 = E.mo18752E();
                Intrinsics.checkNotNullExpressionValue(E2, "it.requireMap()");
                arrayList.add(new C35667k(E2));
            }
            this.f88156c = arrayList;
            this.f88157d = arrayList;
            return;
        }
        throw new JsonException("Missing required field: '" + "items" + '\'');
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88155b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88155b.getBackgroundColor();
    }

    @C12579k
    public ViewType getType() {
        return this.f88155b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88155b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88155b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88155b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public List<C35667k> mo106789k() {
        return this.f88157d;
    }

    @C12579k
    /* renamed from: l */
    public final List<C35667k> mo106812l() {
        return this.f88156c;
    }
}

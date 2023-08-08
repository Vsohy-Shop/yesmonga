package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.C35852s;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
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

/* renamed from: com.urbanairship.android.layout.info.g */
public class C35659g extends C35686t0 implements C35657f, C35682r0, C35645a {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88138b;

    /* renamed from: c */
    public final /* synthetic */ C35645a f88139c;
    @C12579k

    /* renamed from: d */
    public final C35852s f88140d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35659g(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        C9323b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "json");
        this.f88138b = C35691u0.m147171l(bVar);
        this.f88139c = C35691u0.m147166g(bVar);
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
            C35852s a = C35852s.m147813a(bVar2);
            Intrinsics.checkNotNullExpressionValue(a, "fromJson(json.requireField(\"style\"))");
            this.f88140d = a;
            return;
        }
        throw new JsonException("Missing required field: '" + "style" + '\'');
    }

    @C12579k
    /* renamed from: c */
    public C35852s mo106802c() {
        return this.f88140d;
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88138b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88138b.getBackgroundColor();
    }

    @C12580l
    public String getContentDescription() {
        return this.f88139c.getContentDescription();
    }

    @C12579k
    public ViewType getType() {
        return this.f88138b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88138b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88138b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88138b.mo106779i();
    }
}

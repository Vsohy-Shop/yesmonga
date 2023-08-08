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
import java.util.List;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.w0 */
public final class C35695w0 extends C35686t0 implements C35682r0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88211b;
    @C12579k

    /* renamed from: c */
    public final String f88212c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35695w0(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        String str;
        Intrinsics.checkNotNullParameter(bVar, "json");
        this.f88211b = C35691u0.m147171l(bVar);
        JsonValue k = bVar.mo18812k("url");
        if (k != null) {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
            Class<String> cls = String.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                str = k.mo18750B();
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                str = (String) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                str = (String) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                str = (String) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                str = (String) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                C9322a z = k.mo18784z();
                if (z != null) {
                    str = (String) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                C9323b A = k.mo18749A();
                if (A != null) {
                    str = (String) A;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
                JsonValue q = k.mo17264q();
                if (q != null) {
                    str = (String) q;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "url" + '\'');
            }
            this.f88212c = str;
            return;
        }
        throw new JsonException("Missing required field: '" + "url" + '\'');
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88211b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88211b.getBackgroundColor();
    }

    @C12579k
    public ViewType getType() {
        return this.f88211b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88211b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88211b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88211b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public final String mo106849k() {
        return this.f88212c;
    }
}

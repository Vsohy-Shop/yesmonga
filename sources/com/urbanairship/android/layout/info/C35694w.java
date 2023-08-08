package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.C35850q;
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

/* renamed from: com.urbanairship.android.layout.info.w */
public final class C35694w extends C35686t0 implements C35682r0, C35645a {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88207b;

    /* renamed from: c */
    public final /* synthetic */ C35645a f88208c;
    @C12579k

    /* renamed from: d */
    public final String f88209d;
    @C12579k

    /* renamed from: e */
    public final C35850q f88210e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35694w(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        String str;
        C9323b bVar2;
        C9323b bVar3 = bVar;
        Intrinsics.checkNotNullParameter(bVar3, "json");
        this.f88207b = C35691u0.m147171l(bVar);
        this.f88208c = C35691u0.m147166g(bVar);
        JsonValue k = bVar3.mo18812k("text");
        if (k != null) {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
            Class<String> cls = String.class;
            C11494d d = C11342l0.m43547d(cls);
            Class<JsonValue> cls2 = JsonValue.class;
            Class<C9322a> cls3 = C9322a.class;
            Class<Integer> cls4 = Integer.class;
            String str2 = "get(key) ?: throw JsonEx… required field: '$key'\")";
            Class<C9323b> cls5 = C9323b.class;
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
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls4))) {
                str = (String) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls3))) {
                C9322a z = k.mo18784z();
                if (z != null) {
                    str = (String) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls5))) {
                C9323b A = k.mo18749A();
                if (A != null) {
                    str = (String) A;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls2))) {
                JsonValue q = k.mo17264q();
                if (q != null) {
                    str = (String) q;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "text" + '\'');
            }
            this.f88209d = str;
            JsonValue k2 = bVar3.mo18812k("text_appearance");
            if (k2 != null) {
                Intrinsics.checkNotNullExpressionValue(k2, str2);
                C11494d d2 = C11342l0.m43547d(cls5);
                if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls))) {
                    String B = k2.mo18750B();
                    if (B != null) {
                        bVar2 = (C9323b) B;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    bVar2 = (C9323b) Boolean.valueOf(k2.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Long.TYPE))) {
                    bVar2 = (C9323b) Long.valueOf(k2.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Double.TYPE))) {
                    bVar2 = (C9323b) Double.valueOf(k2.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls4))) {
                    bVar2 = (C9323b) Integer.valueOf(k2.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls3))) {
                    C9322a z2 = k2.mo18784z();
                    if (z2 != null) {
                        bVar2 = (C9323b) z2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls5))) {
                    bVar2 = k2.mo18749A();
                    if (bVar2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls2))) {
                    JsonValue q2 = k2.mo17264q();
                    if (q2 != null) {
                        bVar2 = (C9323b) q2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else {
                    throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "text_appearance" + '\'');
                }
                C35850q a = C35850q.m147805a(bVar2);
                Intrinsics.checkNotNullExpressionValue(a, "fromJson(json.requireField(\"text_appearance\"))");
                this.f88210e = a;
                return;
            }
            throw new JsonException("Missing required field: '" + "text_appearance" + '\'');
        }
        throw new JsonException("Missing required field: '" + "text" + '\'');
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88207b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88207b.getBackgroundColor();
    }

    @C12580l
    public String getContentDescription() {
        return this.f88208c.getContentDescription();
    }

    @C12579k
    public ViewType getType() {
        return this.f88207b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88207b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88207b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88207b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public final String mo106847k() {
        return this.f88209d;
    }

    @C12579k
    /* renamed from: l */
    public final C35850q mo106848l() {
        return this.f88210e;
    }
}

package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.info.C35689u;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.FormBehaviorType;
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

/* renamed from: com.urbanairship.android.layout.info.q */
public abstract class C35679q extends C35684s0<C35689u.C35690a> implements C35675o, C35669l {

    /* renamed from: b */
    public final /* synthetic */ C35669l f88194b;
    @C12580l

    /* renamed from: c */
    public final String f88195c;
    @C12580l

    /* renamed from: d */
    public final FormBehaviorType f88196d;
    @C12580l

    /* renamed from: e */
    public final List<EnableBehaviorType> f88197e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35679q(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        String str;
        String str2;
        FormBehaviorType formBehaviorType;
        C9322a<JsonValue> aVar;
        ArrayList arrayList;
        C9323b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "json");
        this.f88194b = C35691u0.m147167h(bVar);
        JsonValue k = bVar2.mo18812k("response_type");
        Class<JsonValue> cls = JsonValue.class;
        Class<C9323b> cls2 = C9323b.class;
        Class<Integer> cls3 = Integer.class;
        Class<C9322a> cls4 = C9322a.class;
        Class<String> cls5 = String.class;
        if (k == null) {
            str = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: return null");
            C11494d d = C11342l0.m43547d(cls5);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls5))) {
                str = k.mo18750B();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                str = (String) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                str = (String) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                str = (String) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls3))) {
                str = (String) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls4))) {
                str = (String) k.mo18784z();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls2))) {
                str = (String) k.mo18749A();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                str = (String) k.mo17264q();
            } else {
                throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "response_type" + '\'');
            }
        }
        this.f88195c = str;
        JsonValue k2 = bVar2.mo18812k("submit");
        if (k2 == null) {
            str2 = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k2, "get(key) ?: return null");
            C11494d d2 = C11342l0.m43547d(cls5);
            if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls5))) {
                str2 = k2.mo18750B();
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                str2 = (String) Boolean.valueOf(k2.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Long.TYPE))) {
                str2 = (String) Long.valueOf(k2.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Double.TYPE))) {
                str2 = (String) Double.valueOf(k2.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls3))) {
                str2 = (String) Integer.valueOf(k2.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls4))) {
                C9322a z = k2.mo18784z();
                if (z != null) {
                    str2 = (String) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls2))) {
                C9323b A = k2.mo18749A();
                if (A != null) {
                    str2 = (String) A;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls))) {
                JsonValue q = k2.mo17264q();
                if (q != null) {
                    str2 = (String) q;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "submit" + '\'');
            }
        }
        if (str2 != null) {
            formBehaviorType = FormBehaviorType.m147659b(str2);
        } else {
            formBehaviorType = null;
        }
        this.f88196d = formBehaviorType;
        JsonValue k3 = bVar2.mo18812k("form_enabled");
        if (k3 == null) {
            aVar = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k3, "get(key) ?: return null");
            C11494d d3 = C11342l0.m43547d(cls4);
            if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls5))) {
                String B = k3.mo18750B();
                if (B != null) {
                    aVar = (C9322a) B;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                }
            } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                aVar = (C9322a) Boolean.valueOf(k3.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(Long.TYPE))) {
                aVar = (C9322a) Long.valueOf(k3.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(Double.TYPE))) {
                aVar = (C9322a) Double.valueOf(k3.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls3))) {
                aVar = (C9322a) Integer.valueOf(k3.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls4))) {
                aVar = k3.mo18784z();
                if (aVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                }
            } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls2))) {
                C9323b A2 = k3.mo18749A();
                if (A2 != null) {
                    aVar = (C9322a) A2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                }
            } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls))) {
                JsonValue q2 = k3.mo17264q();
                if (q2 != null) {
                    aVar = (C9322a) q2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                }
            } else {
                throw new JsonException("Invalid type '" + cls4.getSimpleName() + "' for field '" + "form_enabled" + '\'');
            }
        }
        if (aVar != null) {
            arrayList = new ArrayList(C10978t.m41495Y(aVar, 10));
            for (JsonValue B2 : aVar) {
                EnableBehaviorType.C35814a aVar2 = EnableBehaviorType.f88453a;
                String B3 = B2.mo18750B();
                Intrinsics.checkNotNullExpressionValue(B3, "it.optString()");
                arrayList.add(aVar2.mo107260a(B3));
            }
        } else {
            arrayList = null;
        }
        this.f88197e = arrayList;
    }

    @C12579k
    /* renamed from: a */
    public String mo106791a() {
        return this.f88194b.mo106791a();
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88194b.mo106774d();
    }

    @C12580l
    /* renamed from: e */
    public List<EnableBehaviorType> mo106824e() {
        return this.f88197e;
    }

    @C12580l
    /* renamed from: g */
    public FormBehaviorType mo106825g() {
        return this.f88196d;
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88194b.getBackgroundColor();
    }

    @C12580l
    public String getResponseType() {
        return this.f88195c;
    }

    @C12579k
    public ViewType getType() {
        return this.f88194b.getType();
    }

    @C12579k
    public C35686t0 getView() {
        return this.f88194b.getView();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88194b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88194b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88194b.mo106779i();
    }
}

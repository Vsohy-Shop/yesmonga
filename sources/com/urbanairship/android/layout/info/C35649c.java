package com.urbanairship.android.layout.info;

import androidx.compose.material.OutlinedTextFieldKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.c */
public final class C35649c implements C35682r0 {
    @C12579k

    /* renamed from: a */
    public final ViewType f88111a;
    @C12580l

    /* renamed from: b */
    public final C35835f f88112b;
    @C12580l

    /* renamed from: c */
    public final C35830c f88113c;
    @C12580l

    /* renamed from: d */
    public final C35693v0 f88114d;
    @C12580l

    /* renamed from: e */
    public final List<EventHandler> f88115e;
    @C12580l

    /* renamed from: f */
    public final List<EnableBehaviorType> f88116f;

    public C35649c(@C12579k C9323b bVar) {
        String str;
        C9323b bVar2;
        C35835f fVar;
        C9323b bVar3;
        C35830c cVar;
        C9323b bVar4;
        C35693v0 v0Var;
        C9322a<JsonValue> aVar;
        ArrayList arrayList;
        C9322a<JsonValue> aVar2;
        ArrayList arrayList2;
        C9323b bVar5 = bVar;
        Intrinsics.checkNotNullParameter(bVar5, "json");
        JsonValue k = bVar5.mo18812k("type");
        if (k != null) {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
            Class<String> cls = String.class;
            C11494d d = C11342l0.m43547d(cls);
            Class<JsonValue> cls2 = JsonValue.class;
            Class<Integer> cls3 = Integer.class;
            Class<String> cls4 = cls;
            Class<C9322a> cls5 = C9322a.class;
            Class<C9323b> cls6 = C9323b.class;
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
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls3))) {
                str = (String) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls5))) {
                C9322a z = k.mo18784z();
                if (z != null) {
                    str = (String) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls6))) {
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
                throw new JsonException("Invalid type '" + cls4.getSimpleName() + "' for field '" + "type" + '\'');
            }
            ViewType g = ViewType.m147723g(str);
            Intrinsics.checkNotNullExpressionValue(g, "from(json.requireField<String>(\"type\"))");
            this.f88111a = g;
            JsonValue k2 = bVar5.mo18812k("background_color");
            if (k2 == null) {
                bVar2 = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(k2, "get(key) ?: return null");
                C11494d d2 = C11342l0.m43547d(cls6);
                if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls4))) {
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
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls3))) {
                    bVar2 = (C9323b) Integer.valueOf(k2.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls5))) {
                    C9322a z2 = k2.mo18784z();
                    if (z2 != null) {
                        bVar2 = (C9323b) z2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls6))) {
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
                    throw new JsonException("Invalid type '" + cls6.getSimpleName() + "' for field '" + "background_color" + '\'');
                }
            }
            if (bVar2 != null) {
                fVar = C35835f.m147756b(bVar2);
            } else {
                fVar = null;
            }
            this.f88112b = fVar;
            JsonValue k3 = bVar5.mo18812k(OutlinedTextFieldKt.f7748c);
            if (k3 == null) {
                bVar3 = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(k3, "get(key) ?: return null");
                C11494d d3 = C11342l0.m43547d(cls6);
                if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls4))) {
                    String B2 = k3.mo18750B();
                    if (B2 != null) {
                        bVar3 = (C9323b) B2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    bVar3 = (C9323b) Boolean.valueOf(k3.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(Long.TYPE))) {
                    bVar3 = (C9323b) Long.valueOf(k3.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(Double.TYPE))) {
                    bVar3 = (C9323b) Double.valueOf(k3.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls3))) {
                    bVar3 = (C9323b) Integer.valueOf(k3.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls5))) {
                    C9322a z3 = k3.mo18784z();
                    if (z3 != null) {
                        bVar3 = (C9323b) z3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls6))) {
                    bVar3 = k3.mo18749A();
                    if (bVar3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d3, (Object) C11342l0.m43547d(cls2))) {
                    JsonValue q3 = k3.mo17264q();
                    if (q3 != null) {
                        bVar3 = (C9323b) q3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else {
                    throw new JsonException("Invalid type '" + cls6.getSimpleName() + "' for field '" + OutlinedTextFieldKt.f7748c + '\'');
                }
            }
            if (bVar3 != null) {
                cVar = C35830c.m147737a(bVar3);
            } else {
                cVar = null;
            }
            this.f88113c = cVar;
            JsonValue k4 = bVar5.mo18812k("visibility");
            if (k4 == null) {
                bVar4 = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(k4, "get(key) ?: return null");
                C11494d d4 = C11342l0.m43547d(cls6);
                if (Intrinsics.areEqual((Object) d4, (Object) C11342l0.m43547d(cls4))) {
                    String B3 = k4.mo18750B();
                    if (B3 != null) {
                        bVar4 = (C9323b) B3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d4, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    bVar4 = (C9323b) Boolean.valueOf(k4.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d4, (Object) C11342l0.m43547d(Long.TYPE))) {
                    bVar4 = (C9323b) Long.valueOf(k4.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d4, (Object) C11342l0.m43547d(Double.TYPE))) {
                    bVar4 = (C9323b) Double.valueOf(k4.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d4, (Object) C11342l0.m43547d(cls3))) {
                    bVar4 = (C9323b) Integer.valueOf(k4.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d4, (Object) C11342l0.m43547d(cls5))) {
                    C9322a z4 = k4.mo18784z();
                    if (z4 != null) {
                        bVar4 = (C9323b) z4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d4, (Object) C11342l0.m43547d(cls6))) {
                    bVar4 = k4.mo18749A();
                    if (bVar4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else if (Intrinsics.areEqual((Object) d4, (Object) C11342l0.m43547d(cls2))) {
                    JsonValue q4 = k4.mo17264q();
                    if (q4 != null) {
                        bVar4 = (C9323b) q4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                    }
                } else {
                    throw new JsonException("Invalid type '" + cls6.getSimpleName() + "' for field '" + "visibility" + '\'');
                }
            }
            if (bVar4 != null) {
                v0Var = new C35693v0(bVar4);
            } else {
                v0Var = null;
            }
            this.f88114d = v0Var;
            JsonValue k5 = bVar5.mo18812k("event_handlers");
            if (k5 == null) {
                aVar = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(k5, "get(key) ?: return null");
                C11494d d5 = C11342l0.m43547d(cls5);
                if (Intrinsics.areEqual((Object) d5, (Object) C11342l0.m43547d(cls4))) {
                    String B4 = k5.mo18750B();
                    if (B4 != null) {
                        aVar = (C9322a) B4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d5, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    aVar = (C9322a) Boolean.valueOf(k5.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d5, (Object) C11342l0.m43547d(Long.TYPE))) {
                    aVar = (C9322a) Long.valueOf(k5.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d5, (Object) C11342l0.m43547d(Double.TYPE))) {
                    aVar = (C9322a) Double.valueOf(k5.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d5, (Object) C11342l0.m43547d(cls3))) {
                    aVar = (C9322a) Integer.valueOf(k5.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d5, (Object) C11342l0.m43547d(cls5))) {
                    aVar = k5.mo18784z();
                    if (aVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d5, (Object) C11342l0.m43547d(cls6))) {
                    C9323b A2 = k5.mo18749A();
                    if (A2 != null) {
                        aVar = (C9322a) A2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d5, (Object) C11342l0.m43547d(cls2))) {
                    JsonValue q5 = k5.mo17264q();
                    if (q5 != null) {
                        aVar = (C9322a) q5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else {
                    throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "event_handlers" + '\'');
                }
            }
            if (aVar != null) {
                arrayList = new ArrayList(C10978t.m41495Y(aVar, 10));
                for (JsonValue E : aVar) {
                    C9323b E2 = E.mo18752E();
                    Intrinsics.checkNotNullExpressionValue(E2, "it.requireMap()");
                    arrayList.add(new EventHandler(E2));
                }
            } else {
                arrayList = null;
            }
            this.f88115e = arrayList;
            JsonValue k6 = bVar5.mo18812k("enabled");
            if (k6 == null) {
                aVar2 = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(k6, "get(key) ?: return null");
                C11494d d6 = C11342l0.m43547d(cls5);
                if (Intrinsics.areEqual((Object) d6, (Object) C11342l0.m43547d(cls4))) {
                    String B5 = k6.mo18750B();
                    if (B5 != null) {
                        aVar2 = (C9322a) B5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d6, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    aVar2 = (C9322a) Boolean.valueOf(k6.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d6, (Object) C11342l0.m43547d(Long.TYPE))) {
                    aVar2 = (C9322a) Long.valueOf(k6.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d6, (Object) C11342l0.m43547d(Double.TYPE))) {
                    aVar2 = (C9322a) Double.valueOf(k6.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d6, (Object) C11342l0.m43547d(cls3))) {
                    aVar2 = (C9322a) Integer.valueOf(k6.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d6, (Object) C11342l0.m43547d(cls5))) {
                    aVar2 = k6.mo18784z();
                    if (aVar2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d6, (Object) C11342l0.m43547d(cls6))) {
                    C9323b A3 = k6.mo18749A();
                    if (A3 != null) {
                        aVar2 = (C9322a) A3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d6, (Object) C11342l0.m43547d(cls2))) {
                    JsonValue q6 = k6.mo17264q();
                    if (q6 != null) {
                        aVar2 = (C9322a) q6;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else {
                    throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "enabled" + '\'');
                }
            }
            if (aVar2 != null) {
                arrayList2 = new ArrayList(C10978t.m41495Y(aVar2, 10));
                for (JsonValue F : aVar2) {
                    EnableBehaviorType.C35814a aVar3 = EnableBehaviorType.f88453a;
                    String F2 = F.mo18753F();
                    Intrinsics.checkNotNullExpressionValue(F2, "it.requireString()");
                    arrayList2.add(aVar3.mo107260a(F2));
                }
            } else {
                arrayList2 = null;
            }
            this.f88116f = arrayList2;
            return;
        }
        throw new JsonException("Missing required field: '" + "type" + '\'');
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88116f;
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88112b;
    }

    @C12579k
    public ViewType getType() {
        return this.f88111a;
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88114d;
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88113c;
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88115e;
    }
}

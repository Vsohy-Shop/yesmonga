package com.urbanairship.android.layout.info;

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

/* renamed from: com.urbanairship.android.layout.info.h */
public final class C35661h extends C35684s0<C35689u.C35690a> implements C35669l, C35678p0, C35645a {

    /* renamed from: b */
    public final /* synthetic */ C35669l f88146b;

    /* renamed from: c */
    public final /* synthetic */ C35680q0 f88147c;

    /* renamed from: d */
    public final /* synthetic */ C35645a f88148d;

    /* renamed from: e */
    public final int f88149e;

    /* renamed from: f */
    public final int f88150f;
    @C12579k

    /* renamed from: g */
    public final List<C35689u.C35690a> f88151g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35661h(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        Integer num;
        int i;
        Integer num2;
        int i2;
        Integer num3;
        C9323b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "json");
        this.f88146b = C35691u0.m147167h(bVar);
        this.f88147c = C35691u0.m147170k(bVar);
        this.f88148d = C35691u0.m147166g(bVar);
        JsonValue k = bVar2.mo18812k("min_selection");
        Class<JsonValue> cls = JsonValue.class;
        Class<C9323b> cls2 = C9323b.class;
        Class<C9322a> cls3 = C9322a.class;
        Class<String> cls4 = String.class;
        Class<Integer> cls5 = Integer.class;
        if (k == null) {
            num = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: return null");
            C11494d d = C11342l0.m43547d(cls5);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls4))) {
                String B = k.mo18750B();
                if (B != null) {
                    num = (Integer) B;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                num = (Integer) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                num = (Integer) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                num = (Integer) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls5))) {
                num = Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls3))) {
                C9322a z = k.mo18784z();
                if (z != null) {
                    num = (Integer) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls2))) {
                C9323b A = k.mo18749A();
                if (A != null) {
                    num = (Integer) A;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                JsonValue q = k.mo17264q();
                if (q != null) {
                    num = (Integer) q;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "min_selection" + '\'');
            }
        }
        if (num != null) {
            i = num.intValue();
        } else if (isRequired()) {
            i = 1;
        } else {
            i = 0;
        }
        this.f88149e = i;
        JsonValue k2 = bVar2.mo18812k("max_selection");
        if (k2 == null) {
            num2 = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k2, "get(key) ?: return null");
            C11494d d2 = C11342l0.m43547d(cls5);
            if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls4))) {
                String B2 = k2.mo18750B();
                if (B2 != null) {
                    num3 = (Integer) B2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                num3 = (Integer) Boolean.valueOf(k2.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Long.TYPE))) {
                num3 = (Integer) Long.valueOf(k2.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Double.TYPE))) {
                num3 = (Integer) Double.valueOf(k2.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls5))) {
                num3 = Integer.valueOf(k2.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls3))) {
                C9322a z2 = k2.mo18784z();
                if (z2 != null) {
                    num3 = (Integer) z2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls2))) {
                C9323b A2 = k2.mo18749A();
                if (A2 != null) {
                    num3 = (Integer) A2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls))) {
                JsonValue q2 = k2.mo17264q();
                if (q2 != null) {
                    num3 = (Integer) q2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "max_selection" + '\'');
            }
            num2 = num3;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = Integer.MAX_VALUE;
        }
        this.f88150f = i2;
        this.f88151g = C10976s.m41419k(new C35689u.C35690a(getView()));
    }

    @C12579k
    /* renamed from: a */
    public String mo106791a() {
        return this.f88146b.mo106791a();
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88146b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88146b.getBackgroundColor();
    }

    @C12580l
    public String getContentDescription() {
        return this.f88148d.getContentDescription();
    }

    @C12579k
    public ViewType getType() {
        return this.f88146b.getType();
    }

    @C12579k
    public C35686t0 getView() {
        return this.f88146b.getView();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88146b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88146b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88146b.mo106779i();
    }

    public boolean isRequired() {
        return this.f88147c.isRequired();
    }

    @C12579k
    /* renamed from: k */
    public List<C35689u.C35690a> mo106789k() {
        return this.f88151g;
    }

    /* renamed from: l */
    public final int mo106806l() {
        return this.f88150f;
    }

    /* renamed from: m */
    public final int mo106807m() {
        return this.f88149e;
    }
}

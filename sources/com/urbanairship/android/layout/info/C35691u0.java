package com.urbanairship.android.layout.info;

import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;

/* renamed from: com.urbanairship.android.layout.info.u0 */
public final class C35691u0 {
    /* renamed from: g */
    public static final C35645a m147166g(C9323b bVar) {
        String str;
        JsonValue k = bVar.mo18812k("content_description");
        if (k == null) {
            str = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: return null");
            Class<String> cls = String.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                str = k.mo18750B();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                str = (String) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                str = (String) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                str = (String) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                str = (String) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                str = (String) k.mo18784z();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                str = (String) k.mo18749A();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
                str = (String) k.mo17264q();
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "content_description" + '\'');
            }
        }
        return new C35647b(str);
    }

    /* renamed from: h */
    public static final C35669l m147167h(C9323b bVar) {
        return new C35671m(bVar);
    }

    /* renamed from: i */
    public static final C35681r m147168i(C9323b bVar) {
        String str;
        JsonValue k = bVar.mo18812k("identifier");
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
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "identifier" + '\'');
            }
            return new C35683s(str);
        }
        throw new JsonException("Missing required field: '" + "identifier" + '\'');
    }

    /* renamed from: j */
    public static final C35664i0 m147169j(C9323b bVar) {
        Boolean bool;
        JsonValue k = bVar.mo18812k("ignore_safe_area");
        boolean z = false;
        if (k == null) {
            bool = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: return null");
            Class<Boolean> cls = Boolean.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(String.class))) {
                bool = (Boolean) k.mo18750B();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                bool = Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                bool = (Boolean) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                bool = (Boolean) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                bool = (Boolean) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                bool = (Boolean) k.mo18784z();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                bool = (Boolean) k.mo18749A();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
                bool = (Boolean) k.mo17264q();
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "ignore_safe_area" + '\'');
            }
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        return new C35666j0(z);
    }

    /* renamed from: k */
    public static final C35680q0 m147170k(C9323b bVar) {
        Boolean bool;
        JsonValue k = bVar.mo18812k(FieldModel.f27475X);
        boolean z = false;
        if (k == null) {
            bool = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: return null");
            Class<Boolean> cls = Boolean.class;
            C11494d d = C11342l0.m43547d(cls);
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(String.class))) {
                bool = (Boolean) k.mo18750B();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                bool = Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                bool = (Boolean) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                bool = (Boolean) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                bool = (Boolean) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                bool = (Boolean) k.mo18784z();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                bool = (Boolean) k.mo18749A();
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
                bool = (Boolean) k.mo17264q();
            } else {
                throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + FieldModel.f27475X + '\'');
            }
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        return new C35680q0(z);
    }

    /* renamed from: l */
    public static final C35682r0 m147171l(C9323b bVar) {
        return new C35649c(bVar);
    }
}

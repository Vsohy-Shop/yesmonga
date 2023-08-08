package kotlinx.serialization.json;

import kotlin.C11532s0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11620r;
import kotlin.text.C11621s;
import kotlinx.serialization.json.internal.C12382k0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.m */
public final class C12406m {
    @C12579k
    /* renamed from: a */
    public static final C12421x m50166a(@C12580l Boolean bool) {
        if (bool == null) {
            return JsonNull.INSTANCE;
        }
        return new C12413r(bool, false);
    }

    @C12579k
    /* renamed from: b */
    public static final C12421x m50167b(@C12580l Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new C12413r(number, false);
    }

    @C12579k
    /* renamed from: c */
    public static final C12421x m50168c(@C12580l String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new C12413r(str, true);
    }

    /* renamed from: d */
    public static final Void m50169d(C12403k kVar, String str) {
        throw new IllegalArgumentException("Element " + C11342l0.m43547d(kVar.getClass()) + " is not a " + str);
    }

    /* renamed from: e */
    public static final boolean m50170e(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Boolean f = C12382k0.m50086f(xVar.mo25231e());
        if (f != null) {
            return f.booleanValue();
        }
        throw new IllegalStateException(xVar + " does not represent a Boolean");
    }

    @C12580l
    /* renamed from: f */
    public static final Boolean m50171f(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return C12382k0.m50086f(xVar.mo25231e());
    }

    @C12580l
    /* renamed from: g */
    public static final String m50172g(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (xVar instanceof JsonNull) {
            return null;
        }
        return xVar.mo25231e();
    }

    /* renamed from: h */
    public static final double m50173h(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return Double.parseDouble(xVar.mo25231e());
    }

    @C12580l
    /* renamed from: i */
    public static final Double m50174i(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return C11620r.toDoubleOrNull(xVar.mo25231e());
    }

    /* renamed from: j */
    public static final float m50175j(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return Float.parseFloat(xVar.mo25231e());
    }

    @C12580l
    /* renamed from: k */
    public static final Float m50176k(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return C11620r.toFloatOrNull(xVar.mo25231e());
    }

    /* renamed from: l */
    public static final int m50177l(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return Integer.parseInt(xVar.mo25231e());
    }

    @C12580l
    /* renamed from: m */
    public static final Integer m50178m(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return C11621s.toIntOrNull(xVar.mo25231e());
    }

    @C12579k
    /* renamed from: n */
    public static final C12344b m50179n(@C12579k C12403k kVar) {
        C12344b bVar;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof C12344b) {
            bVar = (C12344b) kVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        m50169d(kVar, "JsonArray");
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: o */
    public static final JsonNull m50180o(@C12579k C12403k kVar) {
        JsonNull jsonNull;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof JsonNull) {
            jsonNull = (JsonNull) kVar;
        } else {
            jsonNull = null;
        }
        if (jsonNull != null) {
            return jsonNull;
        }
        m50169d(kVar, "JsonNull");
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: p */
    public static final JsonObject m50181p(@C12579k C12403k kVar) {
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof JsonObject) {
            jsonObject = (JsonObject) kVar;
        } else {
            jsonObject = null;
        }
        if (jsonObject != null) {
            return jsonObject;
        }
        m50169d(kVar, "JsonObject");
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: q */
    public static final C12421x m50182q(@C12579k C12403k kVar) {
        C12421x xVar;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof C12421x) {
            xVar = (C12421x) kVar;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        m50169d(kVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    /* renamed from: r */
    public static final long m50183r(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return Long.parseLong(xVar.mo25231e());
    }

    @C12580l
    /* renamed from: s */
    public static final Long m50184s(@C12579k C12421x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return C11621s.toLongOrNull(xVar.mo25231e());
    }

    @C12579k
    @C11532s0
    /* renamed from: t */
    public static final Void m50185t(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "expected");
        throw new IllegalArgumentException("Element " + str + " is not a " + str2);
    }
}

package kotlinx.serialization.json;

import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import org.jetbrains.annotations.C12579k;

@C12439o(with = C12417u.class)
public final class JsonNull extends C12421x {
    @C12579k
    public static final JsonNull INSTANCE = new JsonNull();
    @C12579k

    /* renamed from: a */
    public static final String f30169a = "null";

    /* renamed from: b */
    public static final /* synthetic */ C11677z<C12248g<Object>> f30170b = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, JsonNull$$cachedSerializer$delegate$1.f30171f);

    public JsonNull() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    private final /* synthetic */ C11677z m49662i() {
        return f30170b;
    }

    @C12579k
    /* renamed from: e */
    public String mo25231e() {
        return f30169a;
    }

    /* renamed from: h */
    public boolean mo25232h() {
        return false;
    }

    @C12579k
    public final C12248g<JsonNull> serializer() {
        return (C12248g) m49662i().getValue();
    }
}

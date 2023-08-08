package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import org.jetbrains.annotations.C12579k;

@C12439o(with = C12423y.class)
/* renamed from: kotlinx.serialization.json.x */
public abstract class C12421x extends C12403k {
    @C12579k
    public static final C12422a Companion = new C12422a((DefaultConstructorMarker) null);

    /* renamed from: kotlinx.serialization.json.x$a */
    public static final class C12422a {
        public /* synthetic */ C12422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<C12421x> serializer() {
            return C12423y.f30363a;
        }

        public C12422a() {
        }
    }

    public /* synthetic */ C12421x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    /* renamed from: e */
    public abstract String mo25231e();

    /* renamed from: h */
    public abstract boolean mo25232h();

    @C12579k
    public String toString() {
        return mo25231e();
    }

    public C12421x() {
        super((DefaultConstructorMarker) null);
    }
}

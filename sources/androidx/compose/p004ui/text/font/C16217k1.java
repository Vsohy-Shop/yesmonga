package androidx.compose.p004ui.text.font;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.font.k1 */
public interface C16217k1 extends C8578k2<Object> {

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.text.font.k1$a */
    public static final class C16218a implements C16217k1, C8578k2<Object> {

        /* renamed from: b */
        public static final int f40314b = 0;
        @C12579k

        /* renamed from: a */
        public final AsyncFontListLoader f40315a;

        public C16218a(@C12579k AsyncFontListLoader asyncFontListLoader) {
            Intrinsics.checkNotNullParameter(asyncFontListLoader, "current");
            this.f40315a = asyncFontListLoader;
        }

        /* renamed from: b */
        public boolean mo46977b() {
            return this.f40315a.mo46759g();
        }

        @C12579k
        /* renamed from: e */
        public final AsyncFontListLoader mo46978e() {
            return this.f40315a;
        }

        @C12579k
        public Object getValue() {
            return this.f40315a.getValue();
        }
    }

    /* renamed from: b */
    boolean mo46977b();

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.text.font.k1$b */
    public static final class C16219b implements C16217k1 {

        /* renamed from: c */
        public static final int f40316c = 0;
        @C12579k

        /* renamed from: a */
        public final Object f40317a;

        /* renamed from: b */
        public final boolean f40318b;

        public C16219b(@C12579k Object obj, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "value");
            this.f40317a = obj;
            this.f40318b = z;
        }

        /* renamed from: b */
        public boolean mo46977b() {
            return this.f40318b;
        }

        @C12579k
        public Object getValue() {
            return this.f40317a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16219b(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}

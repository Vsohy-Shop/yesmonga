package androidx.compose.p004ui.text;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.x */
public final class C16457x {
    @C12579k

    /* renamed from: c */
    public static final C16458a f40794c = new C16458a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f40795d = 0;
    @C12579k

    /* renamed from: e */
    public static final C16457x f40796e = new C16457x();

    /* renamed from: a */
    public final boolean f40797a;

    /* renamed from: b */
    public final int f40798b;

    /* renamed from: androidx.compose.ui.text.x$a */
    public static final class C16458a {
        public /* synthetic */ C16458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16457x mo47779a() {
            return C16457x.f40796e;
        }

        public C16458a() {
        }
    }

    public /* synthetic */ C16457x(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @C11395k(message = "Sets includeFontPadding parameter for transitioning. Will be removed.")
    /* renamed from: d */
    public static /* synthetic */ void m74329d() {
    }

    /* renamed from: b */
    public final int mo47773b() {
        return this.f40798b;
    }

    /* renamed from: c */
    public final boolean mo47774c() {
        return this.f40797a;
    }

    @C12579k
    /* renamed from: e */
    public final C16457x mo47775e(@C12580l C16457x xVar) {
        return xVar == null ? this : xVar;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16457x)) {
            return false;
        }
        C16457x xVar = (C16457x) obj;
        if (this.f40797a == xVar.f40797a && C16256g.m73212f(this.f40798b, xVar.f40798b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f40797a) * 31) + C16256g.m73213g(this.f40798b);
    }

    @C12579k
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f40797a + ", emojiSupportMatch=" + C16256g.m73214h(this.f40798b) + ')';
    }

    @C11395k(message = "Provides configuration options for behavior compatibility.")
    public /* synthetic */ C16457x(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    @C11395k(message = "Provides configuration options for behavior compatibility.")
    public C16457x(boolean z) {
        this.f40797a = z;
        this.f40798b = C16256g.f40358b.mo47025a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16457x(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16457x(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C16256g.f40358b.mo47025a() : i, (i2 & 2) != 0 ? true : z, (DefaultConstructorMarker) null);
    }

    public C16457x(int i, boolean z) {
        this.f40797a = z;
        this.f40798b = i;
    }

    public C16457x(int i) {
        this.f40797a = true;
        this.f40798b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16457x(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C16256g.f40358b.mo47025a() : i, (DefaultConstructorMarker) null);
    }

    public C16457x() {
        this(C16256g.f40358b.mo47025a(), true, (DefaultConstructorMarker) null);
    }
}

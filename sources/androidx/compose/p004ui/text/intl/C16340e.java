package androidx.compose.p004ui.text.intl;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.text.intl.e */
public final class C16340e {
    @C12579k

    /* renamed from: b */
    public static final C16341a f40568b = new C16341a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40569c = 0;
    @C12579k

    /* renamed from: a */
    public final C16344g f40570a;

    /* renamed from: androidx.compose.ui.text.intl.e$a */
    public static final class C16341a {
        public /* synthetic */ C16341a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16340e mo47362a() {
            return C16346i.m73631a().mo47352a().mo47372i(0);
        }

        public C16341a() {
        }
    }

    public C16340e(@C12579k C16344g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "platformLocale");
        this.f40570a = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final String mo47354a() {
        return this.f40570a.mo47349c();
    }

    @C12579k
    /* renamed from: b */
    public final C16344g mo47355b() {
        return this.f40570a;
    }

    @C12579k
    /* renamed from: c */
    public final String mo47356c() {
        return this.f40570a.mo47350d();
    }

    @C12579k
    /* renamed from: d */
    public final String mo47357d() {
        return this.f40570a.mo47347a();
    }

    @C12579k
    /* renamed from: e */
    public final String mo47358e() {
        return this.f40570a.mo47348b();
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == null || !(obj instanceof C16340e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual((Object) mo47358e(), (Object) ((C16340e) obj).mo47358e());
    }

    public int hashCode() {
        return mo47358e().hashCode();
    }

    @C12579k
    public String toString() {
        return mo47358e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16340e(@C12579k String str) {
        this(C16346i.m73631a().mo47353b(str));
        Intrinsics.checkNotNullParameter(str, "languageTag");
    }
}

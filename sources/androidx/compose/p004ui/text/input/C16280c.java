package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.c */
public final class C16280c implements C16293h {

    /* renamed from: c */
    public static final int f40464c = 0;
    @C12579k

    /* renamed from: a */
    public final C16156d f40465a;

    /* renamed from: b */
    public final int f40466b;

    public C16280c(@C12579k C16156d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "annotatedString");
        this.f40465a = dVar;
        this.f40466b = i;
    }

    /* renamed from: a */
    public void mo47162a(@C12579k C16297j jVar) {
        int i;
        Intrinsics.checkNotNullParameter(jVar, "buffer");
        if (jVar.mo47212m()) {
            jVar.mo47214o(jVar.mo47206g(), jVar.mo47205f(), mo47172d());
        } else {
            jVar.mo47214o(jVar.mo47211l(), jVar.mo47210k(), mo47172d());
        }
        int h = jVar.mo47207h();
        int i2 = this.f40466b;
        if (i2 > 0) {
            i = (h + i2) - 1;
        } else {
            i = (h + i2) - mo47172d().length();
        }
        jVar.mo47216q(C11479u.m44334I(i, 0, jVar.mo47208i()));
    }

    @C12579k
    /* renamed from: b */
    public final C16156d mo47170b() {
        return this.f40465a;
    }

    /* renamed from: c */
    public final int mo47171c() {
        return this.f40466b;
    }

    @C12579k
    /* renamed from: d */
    public final String mo47172d() {
        return this.f40465a.mo46683j();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16280c)) {
            return false;
        }
        C16280c cVar = (C16280c) obj;
        if (Intrinsics.areEqual((Object) mo47172d(), (Object) cVar.mo47172d()) && this.f40466b == cVar.f40466b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (mo47172d().hashCode() * 31) + this.f40466b;
    }

    @C12579k
    public String toString() {
        return "CommitTextCommand(text='" + mo47172d() + "', newCursorPosition=" + this.f40466b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16280c(@C12579k String str, int i) {
        this(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), i);
        Intrinsics.checkNotNullParameter(str, "text");
    }
}

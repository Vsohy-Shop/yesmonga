package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.text.input.TextFieldValue */
public final class TextFieldValue {
    @C12579k

    /* renamed from: d */
    public static final C16268a f40411d = new C16268a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f40412e = 0;
    @C12579k

    /* renamed from: f */
    public static final C8628e<TextFieldValue, Object> f40413f = SaverKt.m31375a(TextFieldValue$Companion$Saver$1.f40417f, TextFieldValue$Companion$Saver$2.f40418f);
    @C12579k

    /* renamed from: a */
    public final C16156d f40414a;

    /* renamed from: b */
    public final long f40415b;
    @C12580l

    /* renamed from: c */
    public final C16356n0 f40416c;

    /* renamed from: androidx.compose.ui.text.input.TextFieldValue$a */
    public static final class C16268a {
        public /* synthetic */ C16268a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<TextFieldValue, Object> mo47117a() {
            return TextFieldValue.f40413f;
        }

        public C16268a() {
        }
    }

    public /* synthetic */ TextFieldValue(C16156d dVar, long j, C16356n0 n0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j, n0Var);
    }

    /* renamed from: d */
    public static /* synthetic */ TextFieldValue m73307d(TextFieldValue textFieldValue, C16156d dVar, long j, C16356n0 n0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = textFieldValue.f40414a;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.f40415b;
        }
        if ((i & 4) != 0) {
            n0Var = textFieldValue.f40416c;
        }
        return textFieldValue.mo47108b(dVar, j, n0Var);
    }

    /* renamed from: e */
    public static /* synthetic */ TextFieldValue m73308e(TextFieldValue textFieldValue, String str, long j, C16356n0 n0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.f40415b;
        }
        if ((i & 4) != 0) {
            n0Var = textFieldValue.f40416c;
        }
        return textFieldValue.mo47109c(str, j, n0Var);
    }

    @C12579k
    /* renamed from: b */
    public final TextFieldValue mo47108b(@C12579k C16156d dVar, long j, @C12580l C16356n0 n0Var) {
        Intrinsics.checkNotNullParameter(dVar, "annotatedString");
        return new TextFieldValue(dVar, j, n0Var, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: c */
    public final TextFieldValue mo47109c(@C12579k String str, long j, @C12580l C16356n0 n0Var) {
        Intrinsics.checkNotNullParameter(str, "text");
        return new TextFieldValue(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j, n0Var, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (!C16356n0.m73735g(this.f40415b, textFieldValue.f40415b) || !Intrinsics.areEqual((Object) this.f40416c, (Object) textFieldValue.f40416c) || !Intrinsics.areEqual((Object) this.f40414a, (Object) textFieldValue.f40414a)) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: f */
    public final C16156d mo47111f() {
        return this.f40414a;
    }

    @C12580l
    /* renamed from: g */
    public final C16356n0 mo47112g() {
        return this.f40416c;
    }

    /* renamed from: h */
    public final long mo47113h() {
        return this.f40415b;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f40414a.hashCode() * 31) + C16356n0.m73743o(this.f40415b)) * 31;
        C16356n0 n0Var = this.f40416c;
        if (n0Var != null) {
            i = C16356n0.m73743o(n0Var.mo47427r());
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @C12579k
    /* renamed from: i */
    public final String mo47115i() {
        return this.f40414a.mo46683j();
    }

    @C12579k
    public String toString() {
        return "TextFieldValue(text='" + this.f40414a + "', selection=" + C16356n0.m73745q(this.f40415b) + ", composition=" + this.f40416c + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j, C16356n0 n0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, n0Var);
    }

    public TextFieldValue(C16156d dVar, long j, C16356n0 n0Var) {
        this.f40414a = dVar;
        this.f40415b = C16359o0.m73781c(j, 0, mo47115i().length());
        this.f40416c = n0Var != null ? C16356n0.m73730b(C16359o0.m73781c(n0Var.mo47427r(), 0, mo47115i().length())) : null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(C16156d dVar, long j, C16356n0 n0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i & 2) != 0 ? C16356n0.f40590b.mo47429a() : j, (i & 4) != 0 ? null : n0Var, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(String str, long j, C16356n0 n0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C16356n0.f40590b.mo47429a() : j, (i & 4) != 0 ? null : n0Var, (DefaultConstructorMarker) null);
    }

    public TextFieldValue(String str, long j, C16356n0 n0Var) {
        this(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j, n0Var, (DefaultConstructorMarker) null);
    }
}

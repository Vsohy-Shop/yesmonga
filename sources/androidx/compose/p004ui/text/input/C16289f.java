package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.f */
public final class C16289f implements C16293h {

    /* renamed from: c */
    public static final int f40482c = 0;

    /* renamed from: a */
    public final int f40483a;

    /* renamed from: b */
    public final int f40484b;

    public C16289f(int i, int i2) {
        boolean z;
        this.f40483a = i;
        this.f40484b = i2;
        if (i < 0 || i2 < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    /* renamed from: a */
    public void mo47162a(@C12579k C16297j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "buffer");
        jVar.mo47202c(jVar.mo47210k(), Math.min(jVar.mo47210k() + this.f40484b, jVar.mo47208i()));
        jVar.mo47202c(Math.max(0, jVar.mo47211l() - this.f40483a), jVar.mo47211l());
    }

    /* renamed from: b */
    public final int mo47189b() {
        return this.f40484b;
    }

    /* renamed from: c */
    public final int mo47190c() {
        return this.f40483a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16289f)) {
            return false;
        }
        C16289f fVar = (C16289f) obj;
        if (this.f40483a == fVar.f40483a && this.f40484b == fVar.f40484b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40483a * 31) + this.f40484b;
    }

    @C12579k
    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f40483a + ", lengthAfterCursor=" + this.f40484b + ')';
    }
}

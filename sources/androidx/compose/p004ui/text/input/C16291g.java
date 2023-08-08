package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.g */
public final class C16291g implements C16293h {

    /* renamed from: c */
    public static final int f40485c = 0;

    /* renamed from: a */
    public final int f40486a;

    /* renamed from: b */
    public final int f40487b;

    public C16291g(int i, int i2) {
        boolean z;
        this.f40486a = i;
        this.f40487b = i2;
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
        int i = this.f40486a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            if (jVar.mo47211l() > i2 && C16295i.m73427b(jVar.mo47203d((jVar.mo47211l() - i2) - 1), jVar.mo47203d(jVar.mo47211l() - i2))) {
                i2++;
            }
            if (i2 == jVar.mo47211l()) {
                break;
            }
        }
        int i4 = this.f40487b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5++;
            if (jVar.mo47210k() + i5 < jVar.mo47208i() && C16295i.m73427b(jVar.mo47203d((jVar.mo47210k() + i5) - 1), jVar.mo47203d(jVar.mo47210k() + i5))) {
                i5++;
            }
            if (jVar.mo47210k() + i5 == jVar.mo47208i()) {
                break;
            }
        }
        jVar.mo47202c(jVar.mo47210k(), jVar.mo47210k() + i5);
        jVar.mo47202c(jVar.mo47211l() - i2, jVar.mo47211l());
    }

    /* renamed from: b */
    public final int mo47194b() {
        return this.f40487b;
    }

    /* renamed from: c */
    public final int mo47195c() {
        return this.f40486a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16291g)) {
            return false;
        }
        C16291g gVar = (C16291g) obj;
        if (this.f40486a == gVar.f40486a && this.f40487b == gVar.f40487b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40486a * 31) + this.f40487b;
    }

    @C12579k
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f40486a + ", lengthAfterCursor=" + this.f40487b + ')';
    }
}

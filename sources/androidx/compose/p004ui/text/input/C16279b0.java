package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16347j;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.b0 */
public final class C16279b0 implements C16293h {

    /* renamed from: b */
    public static final int f40462b = 0;

    /* renamed from: a */
    public final int f40463a;

    public C16279b0(int i) {
        this.f40463a = i;
    }

    /* renamed from: a */
    public void mo47162a(@C12579k C16297j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "buffer");
        if (jVar.mo47207h() == -1) {
            jVar.mo47216q(jVar.mo47211l());
        }
        int l = jVar.mo47211l();
        String jVar2 = jVar.toString();
        int i = this.f40463a;
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int b = C16347j.m73633b(jVar2, l);
                if (b == -1) {
                    break;
                }
                i2++;
                l = b;
            }
        } else {
            while (i2 < i) {
                int a = C16347j.m73632a(jVar2, l);
                if (a == -1) {
                    break;
                }
                i2++;
                l = a;
            }
        }
        jVar.mo47216q(l);
    }

    /* renamed from: b */
    public final int mo47166b() {
        return this.f40463a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16279b0) && this.f40463a == ((C16279b0) obj).f40463a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f40463a;
    }

    @C12579k
    public String toString() {
        return "MoveCursorCommand(amount=" + this.f40463a + ')';
    }
}

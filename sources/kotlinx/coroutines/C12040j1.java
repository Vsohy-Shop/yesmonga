package kotlinx.coroutines;

import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.j1 */
public final class C12040j1 implements C12166w1 {

    /* renamed from: a */
    public final boolean f29670a;

    public C12040j1(boolean z) {
        this.f29670a = z;
    }

    @C12580l
    /* renamed from: a */
    public C12070n2 mo23671a() {
        return null;
    }

    /* renamed from: d */
    public boolean mo23674d() {
        return this.f29670a;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo23674d() ? "Active" : "New");
        sb.append(C12361b.f30259j);
        return sb.toString();
    }
}

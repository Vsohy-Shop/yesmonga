package androidx.compose.p004ui.platform;

import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.platform.b4 */
public final class C15857b4 implements C11559m<C15846a4> {

    /* renamed from: b */
    public static final int f39511b = 8;
    @C12579k

    /* renamed from: a */
    public final List<C15846a4> f39512a = new ArrayList();

    /* renamed from: c */
    public final void mo45707c(@C12579k String str, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f39512a.add(new C15846a4(str, obj));
    }

    @C12579k
    public Iterator<C15846a4> iterator() {
        return this.f39512a.iterator();
    }
}

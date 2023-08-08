package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.layout.C15565g1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
/* renamed from: androidx.compose.foundation.lazy.layout.j */
public final class C2551j implements C15565g1 {
    @C12579k

    /* renamed from: a */
    public final LazyLayoutItemContentFactory f6727a;
    @C12579k

    /* renamed from: b */
    public final Map<Object, Integer> f6728b = new LinkedHashMap();

    public C2551j(@C12579k LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        Intrinsics.checkNotNullParameter(lazyLayoutItemContentFactory, "factory");
        this.f6727a = lazyLayoutItemContentFactory;
    }

    /* renamed from: a */
    public void mo8738a(@C12579k C15565g1.C15566a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(aVar, "slotIds");
        this.f6728b.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object c = this.f6727a.mo8679c(it.next());
            Integer num = this.f6728b.get(c);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (i == 7) {
                it.remove();
            } else {
                this.f6728b.put(c, Integer.valueOf(i + 1));
            }
        }
    }

    /* renamed from: b */
    public boolean mo8739b(@C12580l Object obj, @C12580l Object obj2) {
        return Intrinsics.areEqual(this.f6727a.mo8679c(obj), this.f6727a.mo8679c(obj2));
    }
}

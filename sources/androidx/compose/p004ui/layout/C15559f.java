package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.layout.C15565g1;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.f */
public final class C15559f implements C15565g1 {

    /* renamed from: a */
    public final int f38715a;

    public C15559f(int i) {
        this.f38715a = i;
    }

    /* renamed from: a */
    public void mo8738a(@C12579k C15565g1.C15566a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "slotIds");
        if (aVar.size() > this.f38715a) {
            Iterator<Object> it = aVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
                if (i > this.f38715a) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo8739b(@C12580l Object obj, @C12580l Object obj2) {
        return true;
    }
}

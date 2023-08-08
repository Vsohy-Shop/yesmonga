package androidx.navigation;

import androidx.core.app.C17125i;
import androidx.navigation.ActivityNavigator;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.e */
public final class C19721e {
    @C12579k
    /* renamed from: a */
    public static final ActivityNavigator.C19668c m91761a(@C12580l C17125i iVar, int i) {
        ActivityNavigator.C19668c.C19669a aVar = new ActivityNavigator.C19668c.C19669a();
        if (iVar != null) {
            aVar.mo58060c(iVar);
        }
        aVar.mo58058a(i);
        return aVar.mo58059b();
    }

    /* renamed from: b */
    public static /* synthetic */ ActivityNavigator.C19668c m91762b(C17125i iVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m91761a(iVar, i);
    }
}

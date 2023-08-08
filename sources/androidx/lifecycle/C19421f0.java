package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.f0 */
public class C19421f0 {
    @C12579k

    /* renamed from: a */
    public final Map<String, Integer> f49796a = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public boolean mo57575a(@C12579k String str, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "name");
        Integer num = this.f49796a.get(str);
        boolean z = false;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        }
        this.f49796a.put(str, Integer.valueOf(i | i2));
        return !z;
    }
}

package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.C19737h;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.navigation.fragment.k */
public final class C19744k {
    @C12579k
    /* renamed from: a */
    public static final C19737h.C19740c m91849a(@C12579k Pair<? extends View, String>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "sharedElements");
        C19737h.C19740c.C19741a aVar = new C19737h.C19740c.C19741a();
        int length = pairArr.length;
        int i = 0;
        while (i < length) {
            Pair<? extends View, String> pair = pairArr[i];
            i++;
            aVar.mo58424a((View) pair.mo21846a(), pair.mo21847b());
        }
        return aVar.mo58426c();
    }
}

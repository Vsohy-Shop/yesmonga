package androidx.compose.foundation.pager;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.C8547h2;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C2855v
/* renamed from: androidx.compose.foundation.pager.d */
public interface C2655d {
    @C12579k

    /* renamed from: a */
    public static final C2656a f7027a = C2656a.f7028a;

    /* renamed from: androidx.compose.foundation.pager.d$a */
    public static final class C2656a {

        /* renamed from: a */
        public static final /* synthetic */ C2656a f7028a = new C2656a();

        @C12579k
        /* renamed from: a */
        public final C2655d mo9116a(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C2657e(i);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i + '.').toString());
        }
    }

    /* renamed from: a */
    int mo9115a(int i, int i2, float f, int i3, int i4);
}

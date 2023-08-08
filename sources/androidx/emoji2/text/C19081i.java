package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.emoji2.text.i */
public class C19081i {

    @C0376v0(34)
    /* renamed from: androidx.emoji2.text.i$a */
    public static class C19082a {
        @C0359n0
        @C0373u
        /* renamed from: a */
        public static Set<int[]> m89341a() {
            return C19083b.m89342a();
        }
    }

    /* renamed from: androidx.emoji2.text.i$b */
    public static class C19083b {
        @SuppressLint({"BanUncheckedReflection"})
        @C0359n0
        /* renamed from: a */
        public static Set<int[]> m89342a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke((Object) null, new Object[0]);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) invoke;
                for (int[] iArr : set) {
                    if (!(iArr instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public static Set<int[]> m89340a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C19082a.m89341a();
        }
        return C19083b.m89342a();
    }
}

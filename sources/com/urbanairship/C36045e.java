package com.urbanairship;

import android.os.Looper;
import androidx.annotation.C0359n0;
import com.urbanairship.util.C9641c;

/* renamed from: com.urbanairship.e */
public class C36045e {

    /* renamed from: a */
    public static Looper f89052a;

    @C0359n0
    /* renamed from: a */
    public static Looper m148371a() {
        if (f89052a == null) {
            synchronized (C36045e.class) {
                if (f89052a == null) {
                    C9641c cVar = new C9641c("background");
                    cVar.start();
                    f89052a = cVar.getLooper();
                }
            }
        }
        return f89052a;
    }
}

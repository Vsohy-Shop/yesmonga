package com.urbanairship.util;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.urbanairship.C36059m;
import com.urbanairship.google.C9109b;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.m */
public class C9663m {

    /* renamed from: a */
    public static boolean f26478a = false;

    /* renamed from: b */
    public static boolean f26479b = false;

    @C0348i1
    /* renamed from: a */
    public static synchronized boolean m36192a(@C0359n0 Context context) {
        synchronized (C9663m.class) {
            if (f26478a) {
                boolean z = f26479b;
                return z;
            } else if (!C9640b0.m36128f()) {
                f26478a = true;
                boolean z2 = f26479b;
                return z2;
            } else {
                int a = C9109b.m34010a(context);
                if (a == 0) {
                    C36059m.m148413i("Network Security Provider installed.", new Object[0]);
                    f26478a = true;
                    f26479b = true;
                } else if (a == 1) {
                    C36059m.m148413i("Network Security Provider failed to install with a recoverable error.", new Object[0]);
                } else if (a == 2) {
                    C36059m.m148413i("Network Security Provider failed to install.", new Object[0]);
                    f26478a = true;
                }
                boolean z3 = f26479b;
                return z3;
            }
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: b */
    public static URLConnection m36193b(@C0359n0 Context context, @C0359n0 URL url) throws IOException {
        m36192a(context);
        return (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
    }
}

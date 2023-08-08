package com.urbanairship;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.util.C9643d;
import com.urbanairship.util.C9661l0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.d */
public class C36044d {
    @C0359n0

    /* renamed from: a */
    public static final ExecutorService f89051a = Executors.newCachedThreadPool(C9643d.f26421c);

    @C0359n0
    /* renamed from: a */
    public static Executor m148369a() {
        return new C9661l0(f89051a);
    }

    @C0359n0
    /* renamed from: b */
    public static ExecutorService m148370b() {
        return f89051a;
    }
}

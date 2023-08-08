package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.UAirship;
import java.util.concurrent.Callable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.b */
public class C9638b {

    /* renamed from: com.urbanairship.util.b$a */
    public class C9639a implements Callable<T> {

        /* renamed from: a */
        public final /* synthetic */ Class f26414a;

        public C9639a(Class cls) {
            this.f26414a = cls;
        }

        /* renamed from: a */
        public T call() {
            return UAirship.m146188Y().mo106211R(this.f26414a);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static <T extends C36040b> Callable<T> m36121a(@C0359n0 Class<T> cls) {
        return new C9639a(cls);
    }
}

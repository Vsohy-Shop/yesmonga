package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.C40120d;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.android.datatransport.runtime.r */
public abstract class C40203r {

    @C32455c.C32456a
    /* renamed from: com.google.android.datatransport.runtime.r$a */
    public static abstract class C40204a {
        /* renamed from: a */
        public abstract C40203r mo132742a();

        /* renamed from: b */
        public abstract C40204a mo132743b(String str);

        /* renamed from: c */
        public abstract C40204a mo132744c(@C0363p0 byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: d */
        public abstract C40204a mo132745d(Priority priority);
    }

    /* renamed from: a */
    public static C40204a m163518a() {
        return new C40120d.C40122b().mo132745d(Priority.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo132737b();

    @C0363p0
    /* renamed from: c */
    public abstract byte[] mo132738c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract Priority mo132739d();

    /* renamed from: e */
    public boolean mo132850e() {
        return mo132738c() != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public C40203r mo132851f(Priority priority) {
        return m163518a().mo132743b(mo132737b()).mo132745d(priority).mo132744c(mo132738c()).mo132742a();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = mo132737b();
        objArr[1] = mo132739d();
        if (mo132738c() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(mo132738c(), 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}

package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32608v;

/* renamed from: com.google.firebase.platforminfo.h */
public class C33507h {

    /* renamed from: com.google.firebase.platforminfo.h$a */
    public interface C33508a<T> {
        /* renamed from: a */
        String mo95732a(T t);
    }

    /* renamed from: b */
    public static C32580g<?> m135086b(String str, String str2) {
        return C32580g.m131639p(C33505f.m135081a(str, str2), C33505f.class);
    }

    /* renamed from: c */
    public static C32580g<?> m135087c(String str, C33508a<Context> aVar) {
        return C32580g.m131641r(C33505f.class).mo94693b(C32608v.m131747m(Context.class)).mo94697f(new C33506g(str, aVar)).mo94695d();
    }
}

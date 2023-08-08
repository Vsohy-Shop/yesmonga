package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import com.google.firebase.abt.C32515c;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.inject.C33058b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.abt.component.a */
public class C32517a {
    @C0323b0("this")

    /* renamed from: a */
    public final Map<String, C32515c> f78866a = new HashMap();

    /* renamed from: b */
    public final Context f78867b;

    /* renamed from: c */
    public final C33058b<C32537a> f78868c;

    @C0344h1(otherwise = 3)
    public C32517a(Context context, C33058b<C32537a> bVar) {
        this.f78867b = context;
        this.f78868c = bVar;
    }

    @C0344h1
    /* renamed from: a */
    public C32515c mo94627a(String str) {
        return new C32515c(this.f78867b, this.f78868c, str);
    }

    /* renamed from: b */
    public synchronized C32515c mo94628b(String str) {
        if (!this.f78866a.containsKey(str)) {
            this.f78866a.put(str, mo94627a(str));
        }
        return this.f78866a.get(str);
    }
}

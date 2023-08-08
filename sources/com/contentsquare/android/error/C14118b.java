package com.contentsquare.android.error;

import com.contentsquare.android.error.CsError;
import com.contentsquare.android.sdk.C14453jf;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.error.b */
public final class C14118b {

    /* renamed from: a */
    public final C14453jf f34920a = new C14453jf("NetworkMetric");

    /* renamed from: b */
    public Long f34921b;

    /* renamed from: c */
    public Integer f34922c;

    /* renamed from: d */
    public Long f34923d;

    /* renamed from: e */
    public Long f34924e;

    /* renamed from: f */
    public final String f34925f;

    /* renamed from: g */
    public final String f34926g;

    /* renamed from: h */
    public final C11289a<Long> f34927h;

    /* renamed from: i */
    public final C11300l<C14117a, C11079d2> f34928i;

    public C14118b(String str, String str2, C11289a<Long> aVar, C11300l<? super C14117a, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "httpMethod");
        Intrinsics.checkNotNullParameter(aVar, "timer");
        Intrinsics.checkNotNullParameter(lVar, "publisher");
        this.f34925f = str;
        this.f34926g = str2;
        this.f34927h = aVar;
        this.f34928i = lVar;
    }

    /* renamed from: a */
    public final String mo34376a(String str) {
        if (CsError.C14115e.f34893T.mo34359a().contains(str)) {
            return str;
        }
        throw new IllegalArgumentException("Invalid http method: " + str);
    }

    /* renamed from: b */
    public final void mo34377b(int i) {
        this.f34922c = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo34378c() {
        long longValue = this.f34927h.invoke().longValue();
        this.f34921b = Long.valueOf(longValue);
        this.f34923d = Long.valueOf(longValue);
    }

    /* renamed from: d */
    public final void mo34379d() {
        this.f34924e = this.f34927h.invoke();
        try {
            String str = this.f34925f;
            String a = mo34376a(this.f34926g);
            Long l = this.f34921b;
            if (l != null) {
                long longValue = l.longValue();
                Integer num = this.f34922c;
                if (num != null) {
                    int intValue = num.intValue();
                    Long l2 = this.f34923d;
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        Long l3 = this.f34924e;
                        if (l3 != null) {
                            this.f34928i.invoke(new C14117a(longValue, a, str, intValue, longValue2, l3.longValue()));
                            return;
                        }
                        throw new IllegalArgumentException("Response time cannot be null, start method needs to be called".toString());
                    }
                    throw new IllegalArgumentException("Request time cannot be null, start method needs to be called".toString());
                }
                throw new IllegalArgumentException("Status code cannot be null, setStatusCode method needs to be called".toString());
            }
            throw new IllegalArgumentException("Timestamp cannot be null, start method needs to be called".toString());
        } catch (IllegalArgumentException e) {
            this.f34920a.mo35680j(e, "Cannot create NetworkEvent", new Object[0]);
        }
    }
}

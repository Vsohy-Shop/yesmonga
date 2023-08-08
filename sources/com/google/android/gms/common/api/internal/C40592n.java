package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.concurrent.C40969a;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.n */
public final class C40592n<L> {

    /* renamed from: a */
    public final Executor f103489a;
    @C0363p0

    /* renamed from: b */
    public volatile Object f103490b;
    @C0363p0

    /* renamed from: c */
    public volatile C40593a f103491c;

    @C40473a
    /* renamed from: com.google.android.gms.common.api.internal.n$a */
    public static final class C40593a<L> {

        /* renamed from: a */
        public final Object f103492a;

        /* renamed from: b */
        public final String f103493b;

        @C40473a
        public C40593a(L l, String str) {
            this.f103492a = l;
            this.f103493b = str;
        }

        @C40473a
        @C0359n0
        /* renamed from: a */
        public String mo133991a() {
            String str = this.f103493b;
            int identityHashCode = System.identityHashCode(this.f103492a);
            return str + "@" + identityHashCode;
        }

        @C40473a
        public boolean equals(@C0363p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C40593a)) {
                return false;
            }
            C40593a aVar = (C40593a) obj;
            if (this.f103492a != aVar.f103492a || !this.f103493b.equals(aVar.f103493b)) {
                return false;
            }
            return true;
        }

        @C40473a
        public int hashCode() {
            return (System.identityHashCode(this.f103492a) * 31) + this.f103493b.hashCode();
        }
    }

    @C40473a
    /* renamed from: com.google.android.gms.common.api.internal.n$b */
    public interface C40594b<L> {
        @C40473a
        /* renamed from: a */
        void mo133900a(@C0359n0 L l);

        @C40473a
        /* renamed from: b */
        void mo133901b();
    }

    @C40473a
    public C40592n(@C0359n0 Looper looper, @C0359n0 L l, @C0359n0 String str) {
        this.f103489a = new C40969a(looper);
        this.f103490b = C40843u.m166203m(l, "Listener must not be null");
        this.f103491c = new C40593a(l, C40843u.m166198h(str));
    }

    @C40473a
    /* renamed from: a */
    public void mo133986a() {
        this.f103490b = null;
        this.f103491c = null;
    }

    @C0363p0
    @C40473a
    /* renamed from: b */
    public C40593a<L> mo133987b() {
        return this.f103491c;
    }

    @C40473a
    /* renamed from: c */
    public boolean mo133988c() {
        return this.f103490b != null;
    }

    @C40473a
    /* renamed from: d */
    public void mo133989d(@C0359n0 C40594b<? super L> bVar) {
        C40843u.m166203m(bVar, "Notifier must not be null");
        this.f103489a.execute(new C40561h2(this, bVar));
    }

    /* renamed from: e */
    public final void mo133990e(C40594b bVar) {
        Object obj = this.f103490b;
        if (obj == null) {
            bVar.mo133901b();
            return;
        }
        try {
            bVar.mo133900a(obj);
        } catch (RuntimeException e) {
            bVar.mo133901b();
            throw e;
        }
    }

    @C40473a
    public C40592n(@C0359n0 Executor executor, @C0359n0 L l, @C0359n0 String str) {
        this.f103489a = (Executor) C40843u.m166203m(executor, "Executor must not be null");
        this.f103490b = C40843u.m166203m(l, "Listener must not be null");
        this.f103491c = new C40593a(l, C40843u.m166198h(str));
    }
}

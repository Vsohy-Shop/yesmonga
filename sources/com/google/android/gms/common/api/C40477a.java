package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a.C40481d;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.internal.C40546f;
import com.google.android.gms.common.api.internal.C40609q;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40785m;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C40477a<O extends C40481d> {

    /* renamed from: a */
    public final C40478a f103195a;

    /* renamed from: b */
    public final C40490g f103196b;

    /* renamed from: c */
    public final String f103197c;

    @C40473a
    @C40974d0
    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C40478a<T extends C40489f, O> extends C40488e<T, O> {
        @C40473a
        @C0359n0
        @Deprecated
        /* renamed from: c */
        public T mo85653c(@C0359n0 Context context, @C0359n0 Looper looper, @C0359n0 C40756f fVar, @C0359n0 O o, @C0359n0 C40507i.C40509b bVar, @C0359n0 C40507i.C40510c cVar) {
            return mo133664d(context, looper, fVar, o, bVar, cVar);
        }

        @C40473a
        @C0359n0
        /* renamed from: d */
        public T mo133664d(@C0359n0 Context context, @C0359n0 Looper looper, @C0359n0 C40756f fVar, @C0359n0 O o, @C0359n0 C40546f fVar2, @C0359n0 C40609q qVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @C40473a
    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C40479b {
    }

    @C40473a
    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C40480c<C extends C40479b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C40481d {
        @C0359n0

        /* renamed from: G */
        public static final C40485d f103198G = new C40485d((C40674w) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C40482a extends C40484c, C40486e {
            @C0359n0
            /* renamed from: y */
            Account mo133665y();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C40483b extends C40484c {
            @C0363p0
            /* renamed from: w */
            GoogleSignInAccount mo133666w();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C40484c extends C40481d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public static final class C40485d implements C40486e {
            public C40485d() {
            }

            public /* synthetic */ C40485d(C40674w wVar) {
            }
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C40486e extends C40481d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$f */
        public interface C40487f extends C40484c, C40486e {
        }
    }

    @C40473a
    @C40974d0
    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C40488e<T extends C40479b, O> {
        @C40473a

        /* renamed from: a */
        public static final int f103199a = 1;
        @C40473a

        /* renamed from: b */
        public static final int f103200b = 2;
        @C40473a

        /* renamed from: c */
        public static final int f103201c = Integer.MAX_VALUE;

        @C40473a
        @C0359n0
        /* renamed from: a */
        public List<Scope> mo133667a(@C0363p0 O o) {
            return Collections.emptyList();
        }

        @C40473a
        /* renamed from: b */
        public int mo133668b() {
            return Integer.MAX_VALUE;
        }
    }

    @C40473a
    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C40489f extends C40479b {
        @C40473a
        /* renamed from: a */
        boolean mo133669a();

        @C40473a
        /* renamed from: b */
        boolean mo133670b();

        @C40473a
        /* renamed from: c */
        boolean mo133671c();

        @C40473a
        /* renamed from: d */
        void mo133672d(@C0359n0 String str);

        @C40473a
        /* renamed from: e */
        boolean mo133673e();

        @C40473a
        /* renamed from: f */
        void mo133674f();

        @C40473a
        @C0359n0
        /* renamed from: g */
        String mo133675g();

        @C40473a
        /* renamed from: h */
        void mo133676h(@C0359n0 C40747e.C40750c cVar);

        @C40473a
        @C0359n0
        /* renamed from: j */
        Feature[] mo133677j();

        @C40473a
        /* renamed from: l */
        boolean mo133678l();

        @C40473a
        /* renamed from: m */
        boolean mo87660m();

        @C0363p0
        @C40473a
        /* renamed from: n */
        IBinder mo133679n();

        @C40473a
        @C0359n0
        /* renamed from: o */
        Set<Scope> mo133680o();

        @C40473a
        /* renamed from: p */
        void mo133681p(@C0363p0 C40785m mVar, @C0363p0 Set<Scope> set);

        @C40473a
        /* renamed from: q */
        void mo133682q(@C0359n0 C40747e.C40752e eVar);

        @C40473a
        /* renamed from: r */
        void mo133683r(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr);

        @C40473a
        /* renamed from: t */
        int mo87439t();

        @C40473a
        @C0359n0
        /* renamed from: u */
        Feature[] mo133684u();

        @C0363p0
        @C40473a
        /* renamed from: w */
        String mo133685w();

        @C40473a
        @C0359n0
        /* renamed from: x */
        Intent mo133686x();
    }

    @C40473a
    @C40974d0
    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C40490g<C extends C40489f> extends C40480c<C> {
    }

    @C40473a
    public <C extends C40489f> C40477a(@C0359n0 String str, @C0359n0 C40478a<C, O> aVar, @C0359n0 C40490g<C> gVar) {
        C40843u.m166203m(aVar, "Cannot construct an Api with a null ClientBuilder");
        C40843u.m166203m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f103197c = str;
        this.f103195a = aVar;
        this.f103196b = gVar;
    }

    @C0359n0
    /* renamed from: a */
    public final C40478a mo133660a() {
        return this.f103195a;
    }

    @C0359n0
    /* renamed from: b */
    public final C40480c mo133661b() {
        return this.f103196b;
    }

    @C0359n0
    /* renamed from: c */
    public final C40488e mo133662c() {
        return this.f103195a;
    }

    @C0359n0
    /* renamed from: d */
    public final String mo133663d() {
        return this.f103197c;
    }
}

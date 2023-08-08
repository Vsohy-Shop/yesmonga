package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.auto.value.C32455c;
import com.google.firebase.crashlytics.internal.model.C32830b;
import com.google.firebase.crashlytics.internal.model.C32834c;
import com.google.firebase.crashlytics.internal.model.C32841d;
import com.google.firebase.crashlytics.internal.model.C32844e;
import com.google.firebase.crashlytics.internal.model.C32847f;
import com.google.firebase.crashlytics.internal.model.C32850g;
import com.google.firebase.crashlytics.internal.model.C32853h;
import com.google.firebase.crashlytics.internal.model.C32856i;
import com.google.firebase.crashlytics.internal.model.C32859j;
import com.google.firebase.crashlytics.internal.model.C32862k;
import com.google.firebase.crashlytics.internal.model.C32865l;
import com.google.firebase.crashlytics.internal.model.C32868m;
import com.google.firebase.crashlytics.internal.model.C32871n;
import com.google.firebase.crashlytics.internal.model.C32874o;
import com.google.firebase.crashlytics.internal.model.C32877p;
import com.google.firebase.crashlytics.internal.model.C32880q;
import com.google.firebase.crashlytics.internal.model.C32883r;
import com.google.firebase.crashlytics.internal.model.C32886s;
import com.google.firebase.crashlytics.internal.model.C32898t;
import com.google.firebase.crashlytics.internal.model.C32901u;
import com.google.firebase.crashlytics.internal.model.C32904v;
import com.google.firebase.crashlytics.internal.model.C32907w;
import com.google.firebase.encoders.annotations.C32995a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;

@C32455c
@C32995a
public abstract class CrashlyticsReport {

    /* renamed from: a */
    public static final Charset f79551a = Charset.forName("UTF-8");

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @C32455c
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a */
    public static abstract class C32762a {

        @C32455c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a$a */
        public static abstract class C32763a {

            @C32455c.C32456a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a$a$a */
            public static abstract class C32764a {
                @C0359n0
                /* renamed from: a */
                public abstract C32763a mo95160a();

                @C0359n0
                /* renamed from: b */
                public abstract C32764a mo95161b(@C0359n0 String str);

                @C0359n0
                /* renamed from: c */
                public abstract C32764a mo95162c(@C0359n0 String str);

                @C0359n0
                /* renamed from: d */
                public abstract C32764a mo95163d(@C0359n0 String str);
            }

            @C0359n0
            /* renamed from: a */
            public static C32764a m132395a() {
                return new C32841d.C32843b();
            }

            @C0359n0
            /* renamed from: b */
            public abstract String mo95157b();

            @C0359n0
            /* renamed from: c */
            public abstract String mo95158c();

            @C0359n0
            /* renamed from: d */
            public abstract String mo95159d();
        }

        @C32455c.C32456a
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a$b */
        public static abstract class C32765b {
            @C0359n0
            /* renamed from: a */
            public abstract C32762a mo95164a();

            @C0359n0
            /* renamed from: b */
            public abstract C32765b mo95165b(@C0363p0 C32833b0<C32763a> b0Var);

            @C0359n0
            /* renamed from: c */
            public abstract C32765b mo95166c(@C0359n0 int i);

            @C0359n0
            /* renamed from: d */
            public abstract C32765b mo95167d(@C0359n0 int i);

            @C0359n0
            /* renamed from: e */
            public abstract C32765b mo95168e(@C0359n0 String str);

            @C0359n0
            /* renamed from: f */
            public abstract C32765b mo95169f(@C0359n0 long j);

            @C0359n0
            /* renamed from: g */
            public abstract C32765b mo95170g(@C0359n0 int i);

            @C0359n0
            /* renamed from: h */
            public abstract C32765b mo95171h(@C0359n0 long j);

            @C0359n0
            /* renamed from: i */
            public abstract C32765b mo95172i(@C0359n0 long j);

            @C0359n0
            /* renamed from: j */
            public abstract C32765b mo95173j(@C0363p0 String str);
        }

        @C0359n0
        /* renamed from: a */
        public static C32765b m132385a() {
            return new C32834c.C32836b();
        }

        @C0363p0
        /* renamed from: b */
        public abstract C32833b0<C32763a> mo95148b();

        @C0359n0
        /* renamed from: c */
        public abstract int mo95149c();

        @C0359n0
        /* renamed from: d */
        public abstract int mo95150d();

        @C0359n0
        /* renamed from: e */
        public abstract String mo95151e();

        @C0359n0
        /* renamed from: f */
        public abstract long mo95152f();

        @C0359n0
        /* renamed from: g */
        public abstract int mo95153g();

        @C0359n0
        /* renamed from: h */
        public abstract long mo95154h();

        @C0359n0
        /* renamed from: i */
        public abstract long mo95155i();

        @C0363p0
        /* renamed from: j */
        public abstract String mo95156j();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$b */
    public @interface C32766b {

        /* renamed from: R2 */
        public static final int f79556R2 = 5;

        /* renamed from: S2 */
        public static final int f79557S2 = 6;

        /* renamed from: T2 */
        public static final int f79558T2 = 9;

        /* renamed from: U2 */
        public static final int f79559U2 = 0;

        /* renamed from: V2 */
        public static final int f79560V2 = 1;

        /* renamed from: W2 */
        public static final int f79561W2 = 7;
    }

    @C32455c.C32456a
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c */
    public static abstract class C32767c {
        @C0359n0
        /* renamed from: a */
        public abstract CrashlyticsReport mo95174a();

        @C0359n0
        /* renamed from: b */
        public abstract C32767c mo95175b(@C0359n0 String str);

        @C0359n0
        /* renamed from: c */
        public abstract C32767c mo95176c(@C0359n0 String str);

        @C0359n0
        /* renamed from: d */
        public abstract C32767c mo95177d(@C0359n0 String str);

        @C0359n0
        /* renamed from: e */
        public abstract C32767c mo95178e(@C0359n0 String str);

        @C0359n0
        /* renamed from: f */
        public abstract C32767c mo95179f(C32770e eVar);

        @C0359n0
        /* renamed from: g */
        public abstract C32767c mo95180g(int i);

        @C0359n0
        /* renamed from: h */
        public abstract C32767c mo95181h(@C0359n0 String str);

        @C0359n0
        /* renamed from: i */
        public abstract C32767c mo95182i(@C0359n0 C32774f fVar);
    }

    @C32455c
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d */
    public static abstract class C32768d {

        @C32455c.C32456a
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a */
        public static abstract class C32769a {
            @C0359n0
            /* renamed from: a */
            public abstract C32768d mo95185a();

            @C0359n0
            /* renamed from: b */
            public abstract C32769a mo95186b(@C0359n0 String str);

            @C0359n0
            /* renamed from: c */
            public abstract C32769a mo95187c(@C0359n0 String str);
        }

        @C0359n0
        /* renamed from: a */
        public static C32769a m132422a() {
            return new C32844e.C32846b();
        }

        @C0359n0
        /* renamed from: b */
        public abstract String mo95183b();

        @C0359n0
        /* renamed from: c */
        public abstract String mo95184c();
    }

    @C32455c
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e */
    public static abstract class C32770e {

        @C32455c.C32456a
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a */
        public static abstract class C32771a {
            /* renamed from: a */
            public abstract C32770e mo95191a();

            /* renamed from: b */
            public abstract C32771a mo95192b(C32833b0<C32772b> b0Var);

            /* renamed from: c */
            public abstract C32771a mo95193c(String str);
        }

        @C32455c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$b */
        public static abstract class C32772b {

            @C32455c.C32456a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$b$a */
            public static abstract class C32773a {
                /* renamed from: a */
                public abstract C32772b mo95196a();

                /* renamed from: b */
                public abstract C32773a mo95197b(byte[] bArr);

                /* renamed from: c */
                public abstract C32773a mo95198c(String str);
            }

            @C0359n0
            /* renamed from: a */
            public static C32773a m132435a() {
                return new C32850g.C32852b();
            }

            @C0359n0
            /* renamed from: b */
            public abstract byte[] mo95194b();

            @C0359n0
            /* renamed from: c */
            public abstract String mo95195c();
        }

        @C0359n0
        /* renamed from: a */
        public static C32771a m132428a() {
            return new C32847f.C32849b();
        }

        @C0359n0
        /* renamed from: b */
        public abstract C32833b0<C32772b> mo95188b();

        @C0363p0
        /* renamed from: c */
        public abstract String mo95189c();

        /* renamed from: d */
        public abstract C32771a mo95190d();
    }

    @C32455c
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f */
    public static abstract class C32774f {

        @C32455c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a */
        public static abstract class C32775a {

            @C32455c.C32456a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a$a */
            public static abstract class C32776a {
                @C0359n0
                /* renamed from: a */
                public abstract C32775a mo95224a();

                @C0359n0
                /* renamed from: b */
                public abstract C32776a mo95225b(@C0363p0 String str);

                @C0359n0
                /* renamed from: c */
                public abstract C32776a mo95226c(@C0363p0 String str);

                @C0359n0
                /* renamed from: d */
                public abstract C32776a mo95227d(@C0359n0 String str);

                @C0359n0
                /* renamed from: e */
                public abstract C32776a mo95228e(@C0359n0 String str);

                @C0359n0
                /* renamed from: f */
                public abstract C32776a mo95229f(@C0359n0 String str);

                @C0359n0
                /* renamed from: g */
                public abstract C32776a mo95230g(@C0359n0 C32777b bVar);

                @C0359n0
                /* renamed from: h */
                public abstract C32776a mo95231h(@C0359n0 String str);
            }

            @C32455c
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a$b */
            public static abstract class C32777b {

                @C32455c.C32456a
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a$b$a */
                public static abstract class C32778a {
                    @C0359n0
                    /* renamed from: a */
                    public abstract C32777b mo95234a();

                    @C0359n0
                    /* renamed from: b */
                    public abstract C32778a mo95235b(@C0359n0 String str);
                }

                @C0359n0
                /* renamed from: a */
                public static C32778a m132476a() {
                    return new C32859j.C32861b();
                }

                @C0359n0
                /* renamed from: b */
                public abstract String mo95232b();

                @C0359n0
                /* renamed from: c */
                public abstract C32778a mo95233c();
            }

            @C0359n0
            /* renamed from: a */
            public static C32776a m132458a() {
                return new C32856i.C32858b();
            }

            @C0363p0
            /* renamed from: b */
            public abstract String mo95215b();

            @C0363p0
            /* renamed from: c */
            public abstract String mo95216c();

            @C0363p0
            /* renamed from: d */
            public abstract String mo95217d();

            @C0359n0
            /* renamed from: e */
            public abstract String mo95218e();

            @C0363p0
            /* renamed from: f */
            public abstract String mo95219f();

            @C0363p0
            /* renamed from: g */
            public abstract C32777b mo95220g();

            @C0359n0
            /* renamed from: h */
            public abstract String mo95221h();

            @C0359n0
            /* renamed from: i */
            public abstract C32776a mo95222i();

            @C0359n0
            /* renamed from: j */
            public C32775a mo95223j(@C0359n0 String str) {
                C32777b.C32778a aVar;
                C32777b g = mo95220g();
                if (g != null) {
                    aVar = g.mo95233c();
                } else {
                    aVar = C32777b.m132476a();
                }
                return mo95222i().mo95230g(aVar.mo95235b(str).mo95234a()).mo95224a();
            }
        }

        @C32455c.C32456a
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$b */
        public static abstract class C32779b {
            @C0359n0
            /* renamed from: a */
            public abstract C32774f mo95236a();

            @C0359n0
            /* renamed from: b */
            public abstract C32779b mo95237b(@C0359n0 C32775a aVar);

            @C0359n0
            /* renamed from: c */
            public abstract C32779b mo95238c(boolean z);

            @C0359n0
            /* renamed from: d */
            public abstract C32779b mo95239d(@C0359n0 C32780c cVar);

            @C0359n0
            /* renamed from: e */
            public abstract C32779b mo95240e(@C0359n0 Long l);

            @C0359n0
            /* renamed from: f */
            public abstract C32779b mo95241f(@C0359n0 C32833b0<C32782d> b0Var);

            @C0359n0
            /* renamed from: g */
            public abstract C32779b mo95242g(@C0359n0 String str);

            @C0359n0
            /* renamed from: h */
            public abstract C32779b mo95243h(int i);

            @C0359n0
            /* renamed from: i */
            public abstract C32779b mo95244i(@C0359n0 String str);

            @C0359n0
            /* renamed from: j */
            public C32779b mo95245j(@C0359n0 byte[] bArr) {
                return mo95244i(new String(bArr, CrashlyticsReport.f79551a));
            }

            @C0359n0
            /* renamed from: k */
            public abstract C32779b mo95246k(@C0359n0 C32802e eVar);

            @C0359n0
            /* renamed from: l */
            public abstract C32779b mo95247l(long j);

            @C0359n0
            /* renamed from: m */
            public abstract C32779b mo95248m(@C0359n0 C32804f fVar);
        }

        @C32455c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$c */
        public static abstract class C32780c {

            @C32455c.C32456a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$c$a */
            public static abstract class C32781a {
                @C0359n0
                /* renamed from: a */
                public abstract C32780c mo95258a();

                @C0359n0
                /* renamed from: b */
                public abstract C32781a mo95259b(int i);

                @C0359n0
                /* renamed from: c */
                public abstract C32781a mo95260c(int i);

                @C0359n0
                /* renamed from: d */
                public abstract C32781a mo95261d(long j);

                @C0359n0
                /* renamed from: e */
                public abstract C32781a mo95262e(@C0359n0 String str);

                @C0359n0
                /* renamed from: f */
                public abstract C32781a mo95263f(@C0359n0 String str);

                @C0359n0
                /* renamed from: g */
                public abstract C32781a mo95264g(@C0359n0 String str);

                @C0359n0
                /* renamed from: h */
                public abstract C32781a mo95265h(long j);

                @C0359n0
                /* renamed from: i */
                public abstract C32781a mo95266i(boolean z);

                @C0359n0
                /* renamed from: j */
                public abstract C32781a mo95267j(int i);
            }

            @C0359n0
            /* renamed from: a */
            public static C32781a m132494a() {
                return new C32862k.C32864b();
            }

            @C0359n0
            /* renamed from: b */
            public abstract int mo95249b();

            /* renamed from: c */
            public abstract int mo95250c();

            /* renamed from: d */
            public abstract long mo95251d();

            @C0359n0
            /* renamed from: e */
            public abstract String mo95252e();

            @C0359n0
            /* renamed from: f */
            public abstract String mo95253f();

            @C0359n0
            /* renamed from: g */
            public abstract String mo95254g();

            /* renamed from: h */
            public abstract long mo95255h();

            /* renamed from: i */
            public abstract int mo95256i();

            /* renamed from: j */
            public abstract boolean mo95257j();
        }

        @C32455c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d */
        public static abstract class C32782d {

            @C32455c
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a */
            public static abstract class C32783a {

                @C32455c.C32456a
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$a */
                public static abstract class C32784a {
                    @C0359n0
                    /* renamed from: a */
                    public abstract C32783a mo95280a();

                    @C0359n0
                    /* renamed from: b */
                    public abstract C32784a mo95281b(@C0363p0 Boolean bool);

                    @C0359n0
                    /* renamed from: c */
                    public abstract C32784a mo95282c(@C0359n0 C32833b0<C32768d> b0Var);

                    @C0359n0
                    /* renamed from: d */
                    public abstract C32784a mo95283d(@C0359n0 C32785b bVar);

                    @C0359n0
                    /* renamed from: e */
                    public abstract C32784a mo95284e(@C0359n0 C32833b0<C32768d> b0Var);

                    @C0359n0
                    /* renamed from: f */
                    public abstract C32784a mo95285f(int i);
                }

                @C32455c
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b */
                public static abstract class C32785b {

                    @C32455c
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$a */
                    public static abstract class C32786a {

                        @C32455c.C32456a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$a$a */
                        public static abstract class C32787a {
                            @C0359n0
                            /* renamed from: a */
                            public abstract C32786a mo95296a();

                            @C0359n0
                            /* renamed from: b */
                            public abstract C32787a mo95297b(long j);

                            @C0359n0
                            /* renamed from: c */
                            public abstract C32787a mo95298c(@C0359n0 String str);

                            @C0359n0
                            /* renamed from: d */
                            public abstract C32787a mo95299d(long j);

                            @C0359n0
                            /* renamed from: e */
                            public abstract C32787a mo95300e(@C0363p0 String str);

                            @C0359n0
                            /* renamed from: f */
                            public C32787a mo95301f(@C0359n0 byte[] bArr) {
                                return mo95300e(new String(bArr, CrashlyticsReport.f79551a));
                            }
                        }

                        @C0359n0
                        /* renamed from: a */
                        public static C32787a m132540a() {
                            return new C32874o.C32876b();
                        }

                        @C0359n0
                        /* renamed from: b */
                        public abstract long mo95291b();

                        @C0359n0
                        /* renamed from: c */
                        public abstract String mo95292c();

                        /* renamed from: d */
                        public abstract long mo95293d();

                        @C0363p0
                        @C32995a.C32997b
                        /* renamed from: e */
                        public abstract String mo95294e();

                        @C0363p0
                        @C32995a.C32996a(name = "uuid")
                        /* renamed from: f */
                        public byte[] mo95295f() {
                            String e = mo95294e();
                            if (e != null) {
                                return e.getBytes(CrashlyticsReport.f79551a);
                            }
                            return null;
                        }
                    }

                    @C32455c.C32456a
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$b */
                    public static abstract class C32788b {
                        @C0359n0
                        /* renamed from: a */
                        public abstract C32785b mo95302a();

                        @C0359n0
                        /* renamed from: b */
                        public abstract C32788b mo95303b(@C0359n0 C32762a aVar);

                        @C0359n0
                        /* renamed from: c */
                        public abstract C32788b mo95304c(@C0359n0 C32833b0<C32786a> b0Var);

                        @C0359n0
                        /* renamed from: d */
                        public abstract C32788b mo95305d(@C0359n0 C32789c cVar);

                        @C0359n0
                        /* renamed from: e */
                        public abstract C32788b mo95306e(@C0359n0 C32791d dVar);

                        @C0359n0
                        /* renamed from: f */
                        public abstract C32788b mo95307f(@C0359n0 C32833b0<C32793e> b0Var);
                    }

                    @C32455c
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$c */
                    public static abstract class C32789c {

                        @C32455c.C32456a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$c$a */
                        public static abstract class C32790a {
                            @C0359n0
                            /* renamed from: a */
                            public abstract C32789c mo95313a();

                            @C0359n0
                            /* renamed from: b */
                            public abstract C32790a mo95314b(@C0359n0 C32789c cVar);

                            @C0359n0
                            /* renamed from: c */
                            public abstract C32790a mo95315c(@C0359n0 C32833b0<C32793e.C32795b> b0Var);

                            @C0359n0
                            /* renamed from: d */
                            public abstract C32790a mo95316d(int i);

                            @C0359n0
                            /* renamed from: e */
                            public abstract C32790a mo95317e(@C0359n0 String str);

                            @C0359n0
                            /* renamed from: f */
                            public abstract C32790a mo95318f(@C0359n0 String str);
                        }

                        @C0359n0
                        /* renamed from: a */
                        public static C32790a m132558a() {
                            return new C32877p.C32879b();
                        }

                        @C0363p0
                        /* renamed from: b */
                        public abstract C32789c mo95308b();

                        @C0359n0
                        /* renamed from: c */
                        public abstract C32833b0<C32793e.C32795b> mo95309c();

                        /* renamed from: d */
                        public abstract int mo95310d();

                        @C0363p0
                        /* renamed from: e */
                        public abstract String mo95311e();

                        @C0359n0
                        /* renamed from: f */
                        public abstract String mo95312f();
                    }

                    @C32455c
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$d */
                    public static abstract class C32791d {

                        @C32455c.C32456a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$d$a */
                        public static abstract class C32792a {
                            @C0359n0
                            /* renamed from: a */
                            public abstract C32791d mo95322a();

                            @C0359n0
                            /* renamed from: b */
                            public abstract C32792a mo95323b(long j);

                            @C0359n0
                            /* renamed from: c */
                            public abstract C32792a mo95324c(@C0359n0 String str);

                            @C0359n0
                            /* renamed from: d */
                            public abstract C32792a mo95325d(@C0359n0 String str);
                        }

                        @C0359n0
                        /* renamed from: a */
                        public static C32792a m132570a() {
                            return new C32880q.C32882b();
                        }

                        @C0359n0
                        /* renamed from: b */
                        public abstract long mo95319b();

                        @C0359n0
                        /* renamed from: c */
                        public abstract String mo95320c();

                        @C0359n0
                        /* renamed from: d */
                        public abstract String mo95321d();
                    }

                    @C32455c
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e */
                    public static abstract class C32793e {

                        @C32455c.C32456a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$a */
                        public static abstract class C32794a {
                            @C0359n0
                            /* renamed from: a */
                            public abstract C32793e mo95329a();

                            @C0359n0
                            /* renamed from: b */
                            public abstract C32794a mo95330b(@C0359n0 C32833b0<C32795b> b0Var);

                            @C0359n0
                            /* renamed from: c */
                            public abstract C32794a mo95331c(int i);

                            @C0359n0
                            /* renamed from: d */
                            public abstract C32794a mo95332d(@C0359n0 String str);
                        }

                        @C32455c
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$b */
                        public static abstract class C32795b {

                            @C32455c.C32456a
                            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$b$a */
                            public static abstract class C32796a {
                                @C0359n0
                                /* renamed from: a */
                                public abstract C32795b mo95338a();

                                @C0359n0
                                /* renamed from: b */
                                public abstract C32796a mo95339b(@C0359n0 String str);

                                @C0359n0
                                /* renamed from: c */
                                public abstract C32796a mo95340c(int i);

                                @C0359n0
                                /* renamed from: d */
                                public abstract C32796a mo95341d(long j);

                                @C0359n0
                                /* renamed from: e */
                                public abstract C32796a mo95342e(long j);

                                @C0359n0
                                /* renamed from: f */
                                public abstract C32796a mo95343f(@C0359n0 String str);
                            }

                            @C0359n0
                            /* renamed from: a */
                            public static C32796a m132586a() {
                                return new C32886s.C32888b();
                            }

                            @C0363p0
                            /* renamed from: b */
                            public abstract String mo95333b();

                            /* renamed from: c */
                            public abstract int mo95334c();

                            /* renamed from: d */
                            public abstract long mo95335d();

                            /* renamed from: e */
                            public abstract long mo95336e();

                            @C0359n0
                            /* renamed from: f */
                            public abstract String mo95337f();
                        }

                        @C0359n0
                        /* renamed from: a */
                        public static C32794a m132578a() {
                            return new C32883r.C32885b();
                        }

                        @C0359n0
                        /* renamed from: b */
                        public abstract C32833b0<C32795b> mo95326b();

                        /* renamed from: c */
                        public abstract int mo95327c();

                        @C0359n0
                        /* renamed from: d */
                        public abstract String mo95328d();
                    }

                    @C0359n0
                    /* renamed from: a */
                    public static C32788b m132534a() {
                        return new C32871n.C32873b();
                    }

                    @C0363p0
                    /* renamed from: b */
                    public abstract C32762a mo95286b();

                    @C0359n0
                    /* renamed from: c */
                    public abstract C32833b0<C32786a> mo95287c();

                    @C0363p0
                    /* renamed from: d */
                    public abstract C32789c mo95288d();

                    @C0359n0
                    /* renamed from: e */
                    public abstract C32791d mo95289e();

                    @C0363p0
                    /* renamed from: f */
                    public abstract C32833b0<C32793e> mo95290f();
                }

                @C0359n0
                /* renamed from: a */
                public static C32784a m132521a() {
                    return new C32868m.C32870b();
                }

                @C0363p0
                /* renamed from: b */
                public abstract Boolean mo95274b();

                @C0363p0
                /* renamed from: c */
                public abstract C32833b0<C32768d> mo95275c();

                @C0359n0
                /* renamed from: d */
                public abstract C32785b mo95276d();

                @C0363p0
                /* renamed from: e */
                public abstract C32833b0<C32768d> mo95277e();

                /* renamed from: f */
                public abstract int mo95278f();

                @C0359n0
                /* renamed from: g */
                public abstract C32784a mo95279g();
            }

            @C32455c.C32456a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$b */
            public static abstract class C32797b {
                @C0359n0
                /* renamed from: a */
                public abstract C32782d mo95344a();

                @C0359n0
                /* renamed from: b */
                public abstract C32797b mo95345b(@C0359n0 C32783a aVar);

                @C0359n0
                /* renamed from: c */
                public abstract C32797b mo95346c(@C0359n0 C32798c cVar);

                @C0359n0
                /* renamed from: d */
                public abstract C32797b mo95347d(@C0359n0 C32800d dVar);

                @C0359n0
                /* renamed from: e */
                public abstract C32797b mo95348e(long j);

                @C0359n0
                /* renamed from: f */
                public abstract C32797b mo95349f(@C0359n0 String str);
            }

            @C32455c
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$c */
            public static abstract class C32798c {

                @C32455c.C32456a
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$c$a */
                public static abstract class C32799a {
                    @C0359n0
                    /* renamed from: a */
                    public abstract C32798c mo95356a();

                    @C0359n0
                    /* renamed from: b */
                    public abstract C32799a mo95357b(Double d);

                    @C0359n0
                    /* renamed from: c */
                    public abstract C32799a mo95358c(int i);

                    @C0359n0
                    /* renamed from: d */
                    public abstract C32799a mo95359d(long j);

                    @C0359n0
                    /* renamed from: e */
                    public abstract C32799a mo95360e(int i);

                    @C0359n0
                    /* renamed from: f */
                    public abstract C32799a mo95361f(boolean z);

                    @C0359n0
                    /* renamed from: g */
                    public abstract C32799a mo95362g(long j);
                }

                @C0359n0
                /* renamed from: a */
                public static C32799a m132604a() {
                    return new C32898t.C32900b();
                }

                @C0363p0
                /* renamed from: b */
                public abstract Double mo95350b();

                /* renamed from: c */
                public abstract int mo95351c();

                /* renamed from: d */
                public abstract long mo95352d();

                /* renamed from: e */
                public abstract int mo95353e();

                /* renamed from: f */
                public abstract long mo95354f();

                /* renamed from: g */
                public abstract boolean mo95355g();
            }

            @C32455c
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$d */
            public static abstract class C32800d {

                @C32455c.C32456a
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$d$a */
                public static abstract class C32801a {
                    @C0359n0
                    /* renamed from: a */
                    public abstract C32800d mo95364a();

                    @C0359n0
                    /* renamed from: b */
                    public abstract C32801a mo95365b(@C0359n0 String str);
                }

                @C0359n0
                /* renamed from: a */
                public static C32801a m132618a() {
                    return new C32901u.C32903b();
                }

                @C0359n0
                /* renamed from: b */
                public abstract String mo95363b();
            }

            @C0359n0
            /* renamed from: a */
            public static C32797b m132514a() {
                return new C32865l.C32867b();
            }

            @C0359n0
            /* renamed from: b */
            public abstract C32783a mo95268b();

            @C0359n0
            /* renamed from: c */
            public abstract C32798c mo95269c();

            @C0363p0
            /* renamed from: d */
            public abstract C32800d mo95270d();

            /* renamed from: e */
            public abstract long mo95271e();

            @C0359n0
            /* renamed from: f */
            public abstract String mo95272f();

            @C0359n0
            /* renamed from: g */
            public abstract C32797b mo95273g();
        }

        @C32455c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$e */
        public static abstract class C32802e {

            @C32455c.C32456a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$e$a */
            public static abstract class C32803a {
                @C0359n0
                /* renamed from: a */
                public abstract C32802e mo95370a();

                @C0359n0
                /* renamed from: b */
                public abstract C32803a mo95371b(@C0359n0 String str);

                @C0359n0
                /* renamed from: c */
                public abstract C32803a mo95372c(boolean z);

                @C0359n0
                /* renamed from: d */
                public abstract C32803a mo95373d(int i);

                @C0359n0
                /* renamed from: e */
                public abstract C32803a mo95374e(@C0359n0 String str);
            }

            @C0359n0
            /* renamed from: a */
            public static C32803a m132622a() {
                return new C32904v.C32906b();
            }

            @C0359n0
            /* renamed from: b */
            public abstract String mo95366b();

            /* renamed from: c */
            public abstract int mo95367c();

            @C0359n0
            /* renamed from: d */
            public abstract String mo95368d();

            /* renamed from: e */
            public abstract boolean mo95369e();
        }

        @C32455c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f */
        public static abstract class C32804f {

            @C32455c.C32456a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f$a */
            public static abstract class C32805a {
                @C0359n0
                /* renamed from: a */
                public abstract C32804f mo95376a();

                @C0359n0
                /* renamed from: b */
                public abstract C32805a mo95377b(@C0359n0 String str);
            }

            @C0359n0
            /* renamed from: a */
            public static C32805a m132632a() {
                return new C32907w.C32909b();
            }

            @C0359n0
            /* renamed from: b */
            public abstract String mo95375b();
        }

        @C0359n0
        /* renamed from: a */
        public static C32779b m132441a() {
            return new C32853h.C32855b().mo95238c(false);
        }

        @C0359n0
        /* renamed from: b */
        public abstract C32775a mo95199b();

        @C0363p0
        /* renamed from: c */
        public abstract C32780c mo95200c();

        @C0363p0
        /* renamed from: d */
        public abstract Long mo95201d();

        @C0363p0
        /* renamed from: e */
        public abstract C32833b0<C32782d> mo95202e();

        @C0359n0
        /* renamed from: f */
        public abstract String mo95203f();

        /* renamed from: g */
        public abstract int mo95204g();

        @C0359n0
        @C32995a.C32997b
        /* renamed from: h */
        public abstract String mo95205h();

        @C0359n0
        @C32995a.C32996a(name = "identifier")
        /* renamed from: i */
        public byte[] mo95206i() {
            return mo95205h().getBytes(CrashlyticsReport.f79551a);
        }

        @C0363p0
        /* renamed from: j */
        public abstract C32802e mo95207j();

        /* renamed from: k */
        public abstract long mo95208k();

        @C0363p0
        /* renamed from: l */
        public abstract C32804f mo95209l();

        /* renamed from: m */
        public abstract boolean mo95210m();

        @C0359n0
        /* renamed from: n */
        public abstract C32779b mo95211n();

        @C0359n0
        /* renamed from: o */
        public C32774f mo95212o(@C0359n0 C32833b0<C32782d> b0Var) {
            return mo95211n().mo95241f(b0Var).mo95236a();
        }

        @C0359n0
        /* renamed from: p */
        public C32774f mo95213p(@C0359n0 String str) {
            return mo95211n().mo95237b(mo95199b().mo95223j(str)).mo95236a();
        }

        @C0359n0
        /* renamed from: q */
        public C32774f mo95214q(long j, boolean z, @C0363p0 String str) {
            C32779b n = mo95211n();
            n.mo95240e(Long.valueOf(j));
            n.mo95238c(z);
            if (str != null) {
                n.mo95248m(C32804f.m132632a().mo95377b(str).mo95376a());
            }
            return n.mo95236a();
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C32767c m132370b() {
        return new C32830b.C32832b();
    }

    @C0359n0
    /* renamed from: c */
    public abstract String mo95134c();

    @C0359n0
    /* renamed from: d */
    public abstract String mo95135d();

    @C0359n0
    /* renamed from: e */
    public abstract String mo95136e();

    @C0359n0
    /* renamed from: f */
    public abstract String mo95137f();

    @C0363p0
    /* renamed from: g */
    public abstract C32770e mo95138g();

    /* renamed from: h */
    public abstract int mo95139h();

    @C0359n0
    /* renamed from: i */
    public abstract String mo95140i();

    @C0363p0
    /* renamed from: j */
    public abstract C32774f mo95141j();

    @C32995a.C32997b
    /* renamed from: k */
    public Type mo95142k() {
        if (mo95141j() != null) {
            return Type.JAVA;
        }
        if (mo95138g() != null) {
            return Type.NATIVE;
        }
        return Type.INCOMPLETE;
    }

    @C0359n0
    /* renamed from: l */
    public abstract C32767c mo95143l();

    @C0359n0
    /* renamed from: m */
    public CrashlyticsReport mo95144m(@C0359n0 C32833b0<C32774f.C32782d> b0Var) {
        if (mo95141j() != null) {
            return mo95143l().mo95182i(mo95141j().mo95212o(b0Var)).mo95174a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @C0359n0
    /* renamed from: n */
    public CrashlyticsReport mo95145n(@C0359n0 C32770e eVar) {
        return mo95143l().mo95182i((C32774f) null).mo95179f(eVar).mo95174a();
    }

    @C0359n0
    /* renamed from: o */
    public CrashlyticsReport mo95146o(@C0359n0 String str) {
        C32767c l = mo95143l();
        C32770e g = mo95138g();
        if (g != null) {
            l.mo95179f(g.mo95190d().mo95193c(str).mo95191a());
        }
        C32774f j = mo95141j();
        if (j != null) {
            l.mo95182i(j.mo95213p(str));
        }
        return l.mo95174a();
    }

    @C0359n0
    /* renamed from: p */
    public CrashlyticsReport mo95147p(long j, boolean z, @C0363p0 String str) {
        C32767c l = mo95143l();
        if (mo95141j() != null) {
            l.mo95182i(mo95141j().mo95214q(j, z, str));
        }
        return l.mo95174a();
    }
}

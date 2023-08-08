package com.contentsquare.android.error;

import com.contentsquare.android.sdk.C14443j6;
import com.contentsquare.android.sdk.C14466k4;
import com.contentsquare.android.sdk.C14538n0;
import com.contentsquare.android.sdk.C14699s7;
import com.contentsquare.android.sdk.C14731t1;
import com.google.android.gms.maps.internal.C30519p1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class CsError {

    /* renamed from: b */
    public static CsError f34887b = new CsError(C14110a.f34890f);

    /* renamed from: c */
    public static final C14114d f34888c = new C14114d((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C11300l<C14117a, Boolean> f34889a;

    @C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/contentsquare/android/error/a;", "event", "", "a", "(Lcom/contentsquare/android/error/a;)Z"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.error.CsError$a */
    public static final class C14110a extends Lambda implements C11300l<C14117a, Boolean> {

        /* renamed from: f */
        public static final C14110a f34890f = new C14110a();

        @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/k4$e;", "", "it", "", "a", "(Lcom/contentsquare/android/sdk/k4$e;Ljava/lang/String;)Z"}, mo22517k = 3, mo22518mv = {1, 4, 3})
        /* renamed from: com.contentsquare.android.error.CsError$a$a */
        public static final class C14111a extends Lambda implements C11304p<C14466k4.C14471e, String, Boolean> {

            /* renamed from: f */
            public static final C14111a f34891f = new C14111a();

            public C14111a() {
                super(2);
            }

            /* renamed from: a */
            public final boolean mo34355a(C14466k4.C14471e eVar, String str) {
                Intrinsics.checkNotNullParameter(eVar, "$receiver");
                Intrinsics.checkNotNullParameter(str, "it");
                return false;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(mo34355a((C14466k4.C14471e) obj, (String) obj2));
            }
        }

        public C14110a() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo34354a(com.contentsquare.android.error.C14117a r4) {
            /*
                r3 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                com.contentsquare.android.sdk.na r0 = com.contentsquare.android.sdk.C14549na.m62704d()
                r1 = 0
                if (r0 == 0) goto L_0x0011
                com.contentsquare.android.sdk.k4$e r0 = com.contentsquare.android.sdk.C14514m1.m62570a(r0)
                goto L_0x0012
            L_0x0011:
                r0 = r1
            L_0x0012:
                com.contentsquare.android.sdk.oe r2 = com.contentsquare.android.sdk.C14600oe.m62882k()
                if (r2 == 0) goto L_0x001e
                kotlin.jvm.functions.p r2 = com.contentsquare.android.sdk.C14514m1.m62571b(r2)
                if (r2 != 0) goto L_0x0020
            L_0x001e:
                com.contentsquare.android.error.CsError$a$a r2 = com.contentsquare.android.error.CsError.C14110a.C14111a.f34891f
            L_0x0020:
                boolean r4 = com.contentsquare.android.error.internal.C14120a.m60670a(r4)
                if (r4 == 0) goto L_0x003b
                if (r0 == 0) goto L_0x0031
                java.lang.String r4 = "api_errors"
                java.lang.Object r4 = r2.invoke(r0, r4)
                r1 = r4
                java.lang.Boolean r1 = (java.lang.Boolean) r1
            L_0x0031:
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x003b
                r4 = 1
                goto L_0x003c
            L_0x003b:
                r4 = 0
            L_0x003c:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.error.CsError.C14110a.mo34354a(com.contentsquare.android.error.a):boolean");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo34354a((C14117a) obj));
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"", "d", "()J"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.error.CsError$b */
    public static final /* synthetic */ class C14112b extends FunctionReferenceImpl implements C11289a<Long> {

        /* renamed from: a */
        public static final C14112b f34892a = new C14112b();

        public C14112b() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* renamed from: d */
        public final long mo34356d() {
            return System.currentTimeMillis();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return Long.valueOf(mo34356d());
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/contentsquare/android/error/a;", "p1", "Lkotlin/d2;", "d", "(Lcom/contentsquare/android/error/a;)V"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.error.CsError$c */
    public static final /* synthetic */ class C14113c extends FunctionReferenceImpl implements C11300l<C14117a, C11079d2> {
        public C14113c(CsError csError) {
            super(1, csError, CsError.class, "sendEvent", "sendEvent(Lcom/contentsquare/android/error/NetworkEvent;)V", 0);
        }

        /* renamed from: d */
        public final void mo34357d(C14117a aVar) {
            Intrinsics.checkNotNullParameter(aVar, C30519p1.f72971a);
            ((CsError) this.receiver).mo34353e(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34357d((C14117a) obj);
            return C11079d2.f28267a;
        }
    }

    /* renamed from: com.contentsquare.android.error.CsError$d */
    public static final class C14114d {
        public C14114d() {
        }

        @C11384m
        /* renamed from: a */
        public final CsError mo34358a() {
            return CsError.f34887b;
        }

        public /* synthetic */ C14114d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.contentsquare.android.error.CsError$e */
    public @interface C14115e {

        /* renamed from: T */
        public static final C14116a f34893T = C14116a.f34913k;

        /* renamed from: U */
        public static final String f34894U = "GET";

        /* renamed from: V */
        public static final String f34895V = "PUT";

        /* renamed from: W */
        public static final String f34896W = "POST";

        /* renamed from: X */
        public static final String f34897X = "DELETE";

        /* renamed from: Y */
        public static final String f34898Y = "HEAD";

        /* renamed from: Z */
        public static final String f34899Z = "PATCH";

        /* renamed from: a0 */
        public static final String f34900a0 = "OPTIONS";

        /* renamed from: b0 */
        public static final String f34901b0 = "TRACE";

        /* renamed from: c0 */
        public static final String f34902c0 = "CONNECT";

        /* renamed from: com.contentsquare.android.error.CsError$e$a */
        public static final class C14116a {

            /* renamed from: a */
            public static final String f34903a = "GET";

            /* renamed from: b */
            public static final String f34904b = "PUT";

            /* renamed from: c */
            public static final String f34905c = "POST";

            /* renamed from: d */
            public static final String f34906d = "DELETE";

            /* renamed from: e */
            public static final String f34907e = "HEAD";

            /* renamed from: f */
            public static final String f34908f = "PATCH";

            /* renamed from: g */
            public static final String f34909g = "OPTIONS";

            /* renamed from: h */
            public static final String f34910h = "TRACE";

            /* renamed from: i */
            public static final String f34911i = "CONNECT";

            /* renamed from: j */
            public static final List<String> f34912j = CollectionsKt__CollectionsKt.m40448L("GET", "PUT", "POST", "DELETE", "HEAD", "PATCH", "OPTIONS", "TRACE", "CONNECT");

            /* renamed from: k */
            public static final /* synthetic */ C14116a f34913k = new C14116a();

            /* renamed from: a */
            public final List<String> mo34359a() {
                return f34912j;
            }
        }
    }

    public CsError(C11300l<? super C14117a, Boolean> lVar) {
        this.f34889a = lVar;
    }

    @C11384m
    /* renamed from: c */
    public static final CsError m60642c() {
        return f34888c.mo34358a();
    }

    /* renamed from: d */
    public final C14118b mo34352d(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "httpMethod");
        return new C14118b(str, str2, C14112b.f34892a, new C14113c(this));
    }

    /* renamed from: e */
    public final void mo34353e(C14117a aVar) {
        C14699s7 e;
        Intrinsics.checkNotNullParameter(aVar, "event");
        if (this.f34889a.invoke(aVar).booleanValue()) {
            C14731t1 e2 = C14731t1.m63478e();
            if (e2 != null) {
                e2.mo36458c(new C14443j6(aVar));
            }
            C14538n0 c = C14538n0.m62672c();
            if (c != null && (e = c.mo35956e()) != null) {
                e.mo36387e(aVar);
            }
        }
    }
}

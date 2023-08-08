package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14590ob;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.q1 */
public final class C14628q1 {

    /* renamed from: a */
    public static final C14628q1 f36221a = new C14628q1();

    /* renamed from: com.contentsquare.android.sdk.q1$a */
    public static final class C14629a {

        /* renamed from: b */
        public static final C14630a f36222b = new C14630a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final C14590ob.C14591a f36223a;

        /* renamed from: com.contentsquare.android.sdk.q1$a$a */
        public static final class C14630a {
            public C14630a() {
            }

            /* renamed from: a */
            public final /* synthetic */ C14629a mo36191a(C14590ob.C14591a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "builder");
                return new C14629a(aVar, (DefaultConstructorMarker) null);
            }

            public /* synthetic */ C14630a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C14629a(C14590ob.C14591a aVar) {
            this.f36223a = aVar;
        }

        /* renamed from: a */
        public final /* synthetic */ C14590ob mo36186a() {
            C14359g4 n = this.f36223a.mo34703p();
            Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
            return (C14590ob) n;
        }

        /* renamed from: b */
        public final void mo36187b(long j) {
            this.f36223a.mo36093x(j);
        }

        /* renamed from: c */
        public final void mo36188c(C14590ob.C14592b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "value");
            this.f36223a.mo36090A(bVar);
        }

        /* renamed from: d */
        public final void mo36189d(C14590ob.C14594c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "value");
            this.f36223a.mo36091B(cVar);
        }

        /* renamed from: e */
        public final void mo36190e(C14590ob.C14596d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "value");
            this.f36223a.mo36092C(dVar);
        }

        public /* synthetic */ C14629a(C14590ob.C14591a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }
    }
}

package com.contentsquare.android.sdk;

import androidx.lifecycle.C19456p0;
import com.contentsquare.android.sdk.C14707sd;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.ed */
public final class C14309ed {

    /* renamed from: b */
    public static final C14310a f35330b = new C14310a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14707sd.C14708a f35331a;

    /* renamed from: com.contentsquare.android.sdk.ed$a */
    public static final class C14310a {
        public C14310a() {
        }

        /* renamed from: a */
        public final /* synthetic */ C14309ed mo35088a(C14707sd.C14708a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "builder");
            return new C14309ed(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14309ed(C14707sd.C14708a aVar) {
        this.f35331a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C14707sd mo35081a() {
        C14359g4 n = this.f35331a.mo34703p();
        Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
        return (C14707sd) n;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo35082b(C14589oa<Long, Object> oaVar, Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(oaVar, "$this$addAll");
        Intrinsics.checkNotNullParameter(iterable, C19456p0.f49833g);
        this.f35331a.mo36414x(iterable);
    }

    /* renamed from: c */
    public final /* synthetic */ C14589oa<Long, Object> mo35083c() {
        List<Long> C = this.f35331a.mo36411C();
        Intrinsics.checkNotNullExpressionValue(C, "_builder.getUnixTimestampsMsList()");
        return new C14589oa<>(C);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo35084d(C14589oa<Integer, Object> oaVar, Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(oaVar, "$this$addAll");
        Intrinsics.checkNotNullParameter(iterable, C19456p0.f49833g);
        this.f35331a.mo36409A(iterable);
    }

    /* renamed from: e */
    public final /* synthetic */ C14589oa<Integer, Object> mo35085e() {
        List<Integer> D = this.f35331a.mo36412D();
        Intrinsics.checkNotNullExpressionValue(D, "_builder.getXPositionsList()");
        return new C14589oa<>(D);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo35086f(C14589oa<Integer, Object> oaVar, Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(oaVar, "$this$addAll");
        Intrinsics.checkNotNullParameter(iterable, C19456p0.f49833g);
        this.f35331a.mo36410B(iterable);
    }

    /* renamed from: g */
    public final /* synthetic */ C14589oa<Integer, Object> mo35087g() {
        List<Integer> E = this.f35331a.mo36413E();
        Intrinsics.checkNotNullExpressionValue(E, "_builder.getYPositionsList()");
        return new C14589oa<>(E);
    }

    public /* synthetic */ C14309ed(C14707sd.C14708a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}

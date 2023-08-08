package com.chuckerteam.chucker.api;

import android.content.Context;
import com.urbanairship.iam.events.C9175a;
import java.io.IOException;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.chuckerteam.chucker.api.c */
public final class C22870c implements Interceptor {

    /* renamed from: com.chuckerteam.chucker.api.c$a */
    public static final class C22871a {
        @C12579k

        /* renamed from: a */
        public final Context f58452a;

        public C22871a(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            this.f58452a = context;
        }

        @C12579k
        /* renamed from: a */
        public final C22871a mo67328a(boolean z) {
            return this;
        }

        @C12579k
        /* renamed from: b */
        public final C22870c mo67329b() {
            return new C22870c(this.f58452a, (Object) null, (Object) null, (Object) null, (Object) null, 30, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: c */
        public final C22871a mo67330c(@C12579k C22869b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "collector");
            return this;
        }

        @C12579k
        /* renamed from: d */
        public final C22871a mo67331d(long j) {
            return this;
        }

        @C12579k
        /* renamed from: e */
        public final C22871a mo67332e(@C12579k Iterable<String> iterable) {
            Intrinsics.checkNotNullParameter(iterable, "headerNames");
            return this;
        }

        @C12579k
        /* renamed from: f */
        public final C22871a mo67333f(@C12579k String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "headerNames");
            return this;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C22870c(@C12579k Context context) {
        this(context, (Object) null, (Object) null, (Object) null, (Object) null, 30, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C12579k
    /* renamed from: a */
    public final C22870c mo67327a(@C12579k String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "names");
        return this;
    }

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C12451Response proceed = chain.proceed(chain.request());
        Intrinsics.checkNotNullExpressionValue(proceed, "chain.proceed(request)");
        return proceed;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C22870c(@C12579k Context context, @C12580l Object obj) {
        this(context, obj, (Object) null, (Object) null, (Object) null, 28, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C22870c(@C12579k Context context, @C12580l Object obj, @C12580l Object obj2) {
        this(context, obj, obj2, (Object) null, (Object) null, 24, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C22870c(@C12579k Context context, @C12580l Object obj, @C12580l Object obj2, @C12580l Object obj3) {
        this(context, obj, obj2, obj3, (Object) null, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C11315i
    public C22870c(@C12579k Context context, @C12580l Object obj, @C12580l Object obj2, @C12580l Object obj3, @C12580l Object obj4) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22870c(Context context, Object obj, Object obj2, Object obj3, Object obj4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? null : obj3, (i & 16) != 0 ? null : obj4);
    }
}

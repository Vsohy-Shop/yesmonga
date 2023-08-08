package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.p046io.C28792a;
import com.carrefour.fid.android.shared.p046io.C28793b;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0002\u0018\u0019B1\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/OneAppServiceException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lretrofit2/w;", "g", "Lcom/carrefour/fid/android/core/io/OneAppServiceException$Kind;", "e", "Lcom/carrefour/fid/android/shared/io/a;", "f", "kind", "Lkotlin/d2;", "h", "_response", "Lretrofit2/w;", "_kind", "Lcom/carrefour/fid/android/core/io/OneAppServiceException$Kind;", "_errorDataOneApp", "Lcom/carrefour/fid/android/shared/io/a;", "", "_message", "", "_exception", "<init>", "(Ljava/lang/String;Lretrofit2/w;Lcom/carrefour/fid/android/core/io/OneAppServiceException$Kind;Ljava/lang/Throwable;)V", "a", "Kind", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.OneAppServiceException */
public final class OneAppServiceException extends RuntimeException {
    @C12579k

    /* renamed from: a */
    public static final C36316a f89687a = new C36316a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f89688b = 8;

    /* renamed from: c */
    public static final int f89689c = 8888;

    /* renamed from: d */
    public static final int f89690d = 9999;
    /* access modifiers changed from: private */
    @C12580l
    public C28792a _errorDataOneApp;
    /* access modifiers changed from: private */
    @C12579k
    public Kind _kind;
    @C12580l
    private final C13091w<?> _response;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/OneAppServiceException$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.core.io.OneAppServiceException$Kind */
    public enum Kind {
        NETWORK,
        HTTP,
        HTTP_WITH_BODY,
        UNEXPECTED
    }

    /* renamed from: com.carrefour.fid.android.core.io.OneAppServiceException$a */
    public static final class C36316a {
        public /* synthetic */ C36316a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final OneAppServiceException mo108368a(@C12580l C13091w<?> wVar) {
            Integer num;
            String str;
            C28792a aVar = null;
            if (wVar != null) {
                num = Integer.valueOf(wVar.mo30573b());
            } else {
                num = null;
            }
            if (wVar != null) {
                str = wVar.mo30577h();
            } else {
                str = null;
            }
            Kind kind = Kind.HTTP;
            OneAppServiceException oneAppServiceException = new OneAppServiceException(num + " " + str, wVar, kind, (Throwable) null);
            if (wVar != null) {
                aVar = C28793b.m119157a(wVar);
            }
            oneAppServiceException._errorDataOneApp = aVar;
            if (oneAppServiceException.mo108365f() != null) {
                kind = Kind.HTTP_WITH_BODY;
            }
            oneAppServiceException._kind = kind;
            return oneAppServiceException;
        }

        @C12579k
        /* renamed from: b */
        public final OneAppServiceException mo108369b(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "exception");
            OneAppServiceException oneAppServiceException = new OneAppServiceException(th.getMessage(), (C13091w<?>) null, Kind.NETWORK, th);
            oneAppServiceException.mo108367h(oneAppServiceException._kind);
            return oneAppServiceException;
        }

        @C12579k
        /* renamed from: c */
        public final OneAppServiceException mo108370c(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "exception");
            OneAppServiceException oneAppServiceException = new OneAppServiceException(th.getMessage(), (C13091w<?>) null, Kind.UNEXPECTED, th);
            oneAppServiceException.mo108367h(oneAppServiceException._kind);
            return oneAppServiceException;
        }

        public C36316a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.core.io.OneAppServiceException$b */
    public /* synthetic */ class C36317b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneAppServiceException(@C12580l String str, @C12580l C13091w<?> wVar, @C12579k Kind kind, @C12580l Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(kind, "_kind");
        this._response = wVar;
        this._kind = kind;
    }

    @C12579k
    /* renamed from: e */
    public final Kind mo108364e() {
        return this._kind;
    }

    @C12580l
    /* renamed from: f */
    public final C28792a mo108365f() {
        return this._errorDataOneApp;
    }

    @C12580l
    /* renamed from: g */
    public final C13091w<?> mo108366g() {
        return this._response;
    }

    /* renamed from: h */
    public final void mo108367h(Kind kind) {
        C28792a aVar;
        if (C36317b.$EnumSwitchMapping$0[kind.ordinal()] == 1) {
            aVar = new C28792a((String) null, Integer.valueOf(f89689c), (String) null, (String) null, 13, (DefaultConstructorMarker) null);
        } else {
            aVar = new C28792a((String) null, 9999, (String) null, (String) null, 13, (DefaultConstructorMarker) null);
        }
        this._errorDataOneApp = aVar;
    }
}

package com.carrefour.fid.android.shared.util.cache;

import androidx.compose.runtime.internal.C8567o;
import androidx.exifinterface.media.C19135a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11636e;
import kotlin.time.C11639g;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class MemCache {

    /* renamed from: c */
    public static final int f70813c = 8;

    /* renamed from: a */
    public final long f70814a = C11639g.m45638m0(5, DurationUnit.MINUTES);
    @C12579k

    /* renamed from: b */
    public final ConcurrentHashMap<String, C28907a<?>> f70815b;

    @C11067d(mo22501c = "com.carrefour.fid.android.shared.util.cache.MemCache$1", mo22502f = "MemCache.kt", mo22503i = {}, mo22504l = {23}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.shared.util.cache.MemCache$1 */
    public static final class C289061 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ MemCache this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C289061(this.this$0, cVar);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002a A[RETURN] */
        @org.jetbrains.annotations.C12580l
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                kotlin.C11661u0.m45747n(r6)
                r6 = r5
                goto L_0x002b
            L_0x0010:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0018:
                kotlin.C11661u0.m45747n(r6)
                r6 = r5
            L_0x001c:
                com.carrefour.fid.android.shared.util.cache.MemCache r1 = r6.this$0
                long r3 = r1.mo84140g()
                r6.label = r2
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.m45926c(r3, r6)
                if (r1 != r0) goto L_0x002b
                return r0
            L_0x002b:
                com.carrefour.fid.android.shared.util.cache.MemCache r1 = r6.this$0
                r1.mo84144m()
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.util.cache.MemCache.C289061.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C289061) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    public MemCache(@C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        C11636e.C11637a aVar = C11636e.f28954b;
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C289061(this, (C11045c<? super C289061>) null), 3, (Object) null);
        this.f70815b = new ConcurrentHashMap<>();
    }

    @C11532s0
    /* renamed from: f */
    public static /* synthetic */ void m119546f() {
    }

    @C11532s0
    /* renamed from: h */
    public static /* synthetic */ void m119547h() {
    }

    /* renamed from: k */
    public static /* synthetic */ void m119548k(MemCache memCache, String str, Object obj, long j, int i, Object obj2) {
        if ((i & 4) != 0) {
            j = memCache.f70814a;
        }
        memCache.mo84142j(str, obj, j);
    }

    /* renamed from: n */
    public static final boolean m119549n(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* renamed from: c */
    public final void mo84137c() {
        this.f70815b.clear();
    }

    /* renamed from: d */
    public final /* synthetic */ <T> T mo84138d(String str) {
        T t;
        Intrinsics.checkNotNullParameter(str, "key");
        C28907a aVar = mo84139e().get(str);
        if (aVar != null) {
            t = aVar.mo84147a();
        } else {
            t = null;
        }
        Intrinsics.reifiedOperationMarker(2, C19135a.f48928d5);
        return t;
    }

    @C12579k
    /* renamed from: e */
    public final ConcurrentHashMap<String, C28907a<?>> mo84139e() {
        return this.f70815b;
    }

    /* renamed from: g */
    public final long mo84140g() {
        return this.f70814a;
    }

    /* renamed from: i */
    public final int mo84141i() {
        return this.f70815b.size();
    }

    /* renamed from: j */
    public final void mo84142j(@C12579k String str, @C12580l Object obj, long j) {
        Intrinsics.checkNotNullParameter(str, "key");
        if (C11636e.m45465Y1(j)) {
            this.f70815b.put(str, new C28907a(obj, j, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: l */
    public final void mo84143l(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f70815b.remove(str);
    }

    /* renamed from: m */
    public final void mo84144m() {
        this.f70815b.entrySet().removeIf(new C28908b(MemCache$removeExpired$1.f70816f));
    }
}

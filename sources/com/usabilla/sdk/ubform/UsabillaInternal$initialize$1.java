package com.usabilla.sdk.ubform;

import android.content.Context;
import androidx.localbroadcastmanager.content.C19552a;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import java.util.UUID;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "recorder", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$initialize$1 extends Lambda implements C11300l<C10110e, C11079d2> {
    final /* synthetic */ String $appId;
    final /* synthetic */ C9848g $callback;
    final /* synthetic */ C9870g $client;
    final /* synthetic */ Context $context;
    final /* synthetic */ UsabillaInternal this$0;

    @C11067d(mo22501c = "com.usabilla.sdk.ubform.UsabillaInternal$initialize$1$1", mo22502f = "UsabillaInternal.kt", mo22503i = {}, mo22504l = {366}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
    /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$initialize$1$1 */
    public static final class C97291 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C97291(usabillaInternal, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11907e<Integer> c = usabillaInternal.mo19852e0().mo21490c();
                this.label = 1;
                if (C11909g.m47503x(c, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C97291) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$initialize$1(String str, C9870g gVar, C9848g gVar2, UsabillaInternal usabillaInternal, Context context) {
        super(1);
        this.$appId = str;
        this.$client = gVar;
        this.$callback = gVar2;
        this.this$0 = usabillaInternal;
        this.$context = context;
    }

    /* renamed from: a */
    public final void mo19889a(@C12579k C10110e eVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(eVar, "recorder");
        String str = this.$appId;
        if (str == null) {
            str = "";
        }
        eVar.mo21540b(new C10096b.C10101b.C10105d("appId", str));
        boolean z2 = true;
        if (this.$client != null) {
            z = true;
        } else {
            z = false;
        }
        eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27785J, Boolean.valueOf(z)));
        if (this.$callback == null) {
            z2 = false;
        }
        eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27778C, Boolean.valueOf(z2)));
        this.this$0.mo19864k0(this.$context, this.$appId, this.$client);
        C12074o0 N = this.this$0.mo19856g0();
        final UsabillaInternal usabillaInternal = this.this$0;
        C11723c2 unused = C12038j.m48061f(N, (CoroutineContext) null, (CoroutineStart) null, new C97291((C11045c<? super C97291>) null), 3, (Object) null);
        this.this$0.mo19858h0().mo21525c(this.this$0.mo19843Y());
        this.this$0.mo19858h0().mo21530h(this.this$0.mo19846b0());
        this.this$0.mo19858h0().mo21526d(this.this$0.mo19860i0());
        C19552a.m91036b(this.$context).mo57834c(this.this$0.f26682u, this.this$0.f26681t);
        String str2 = this.$appId;
        if (str2 == null) {
            eVar.stop();
            this.this$0.mo19868m0(this.$appId);
            C9848g gVar = this.$callback;
            if (gVar != null) {
                gVar.mo20256a();
                return;
            }
            return;
        }
        UsabillaInternal usabillaInternal2 = this.this$0;
        C9848g gVar2 = this.$callback;
        try {
            UUID.fromString(str2);
            C11723c2 unused2 = C12038j.m48061f(usabillaInternal2.mo19856g0(), (CoroutineContext) null, (CoroutineStart) null, new UsabillaInternal$initialize$1$2$1(usabillaInternal2, eVar, str2, gVar2, (C11045c<? super UsabillaInternal$initialize$1$2$1>) null), 3, (Object) null);
        } catch (IllegalArgumentException unused3) {
            Logger.f26647a.logError("initialisation failed due to invalid AppId");
            eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27809l, "initialisation failed due to invalid AppId"));
            eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27808k, C10108c.f27797V));
            eVar.stop();
            usabillaInternal2.mo19868m0(str2);
            if (gVar2 != null) {
                gVar2.mo20256a();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo19889a((C10110e) obj);
        return C11079d2.f28267a;
    }
}

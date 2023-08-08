package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.urbanairship.analytics.location.C35560b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.t0 */
public class C19471t0 {
    @C12579k

    /* renamed from: a */
    public final C19512y f49859a;
    @C12579k

    /* renamed from: b */
    public final Handler f49860b = new Handler();
    @C12580l

    /* renamed from: c */
    public C19472a f49861c;

    /* renamed from: androidx.lifecycle.t0$a */
    public static final class C19472a implements Runnable {
        @C12579k

        /* renamed from: a */
        public final C19512y f49862a;
        @C12579k

        /* renamed from: b */
        public final Lifecycle.C19372Event f49863b;

        /* renamed from: c */
        public boolean f49864c;

        public C19472a(@C12579k C19512y yVar, @C12579k Lifecycle.C19372Event event) {
            Intrinsics.checkNotNullParameter(yVar, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f49862a = yVar;
            this.f49863b = event;
        }

        @C12579k
        /* renamed from: a */
        public final Lifecycle.C19372Event mo57671a() {
            return this.f49863b;
        }

        public void run() {
            if (!this.f49864c) {
                this.f49862a.mo57705l(this.f49863b);
                this.f49864c = true;
            }
        }
    }

    public C19471t0(@C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, C35560b.f87807Z0);
        this.f49859a = new C19512y(wVar);
    }

    @C12579k
    /* renamed from: a */
    public Lifecycle mo57665a() {
        return this.f49859a;
    }

    /* renamed from: b */
    public void mo57666b() {
        mo57670f(Lifecycle.C19372Event.ON_START);
    }

    /* renamed from: c */
    public void mo57667c() {
        mo57670f(Lifecycle.C19372Event.ON_CREATE);
    }

    /* renamed from: d */
    public void mo57668d() {
        mo57670f(Lifecycle.C19372Event.ON_STOP);
        mo57670f(Lifecycle.C19372Event.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo57669e() {
        mo57670f(Lifecycle.C19372Event.ON_START);
    }

    /* renamed from: f */
    public final void mo57670f(Lifecycle.C19372Event event) {
        C19472a aVar = this.f49861c;
        if (aVar != null) {
            aVar.run();
        }
        C19472a aVar2 = new C19472a(this.f49859a, event);
        this.f49861c = aVar2;
        Handler handler = this.f49860b;
        Intrinsics.checkNotNull(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }
}

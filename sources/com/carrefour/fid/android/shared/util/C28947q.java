package com.carrefour.fid.android.shared.util;

import androidx.annotation.C0353k0;
import androidx.annotation.C0363p0;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.q */
public final class C28947q<T> extends C19423g0<T> {
    @C12579k

    /* renamed from: n */
    public static final C28948a f70958n = new C28948a((DefaultConstructorMarker) null);

    /* renamed from: o */
    public static final int f70959o = 8;
    @C12579k

    /* renamed from: p */
    public static final String f70960p = "SingleLiveEvent";
    @C12579k

    /* renamed from: m */
    public final AtomicBoolean f70961m = new AtomicBoolean(false);

    /* renamed from: com.carrefour.fid.android.shared.util.q$a */
    public static final class C28948a {
        public /* synthetic */ C28948a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28948a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.util.q$b */
    public static final class C28949b implements C19426h0<T> {

        /* renamed from: a */
        public final /* synthetic */ C28947q<T> f70962a;

        /* renamed from: b */
        public final /* synthetic */ C19426h0<? super T> f70963b;

        public C28949b(C28947q<T> qVar, C19426h0<? super T> h0Var) {
            this.f70962a = qVar;
            this.f70963b = h0Var;
        }

        /* renamed from: a */
        public final void mo4590a(T t) {
            if (this.f70962a.f70961m.compareAndSet(true, false)) {
                this.f70963b.mo4590a(t);
            }
        }
    }

    @C0353k0
    /* renamed from: k */
    public void mo57491k(@C12579k C19499w wVar, @C12579k C19426h0<? super T> h0Var) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        Intrinsics.checkNotNullParameter(h0Var, "observer");
        mo57488h();
        super.mo57491k(wVar, new C28949b(this, h0Var));
    }

    @C0353k0
    /* renamed from: r */
    public void mo57496r(@C0363p0 @C12580l T t) {
        this.f70961m.set(true);
        super.mo57496r(t);
    }

    @C0353k0
    /* renamed from: t */
    public final void mo84274t() {
        mo57496r((Object) null);
    }
}

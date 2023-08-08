package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.C0353k0;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.savedstate.d */
public final class C20435d {
    @C12579k

    /* renamed from: d */
    public static final C20436a f52691d = new C20436a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C20437e f52692a;
    @C12579k

    /* renamed from: b */
    public final C20431c f52693b;

    /* renamed from: c */
    public boolean f52694c;

    /* renamed from: androidx.savedstate.d$a */
    public static final class C20436a {
        public /* synthetic */ C20436a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C20435d mo61299a(@C12579k C20437e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "owner");
            return new C20435d(eVar, (DefaultConstructorMarker) null);
        }

        public C20436a() {
        }
    }

    public /* synthetic */ C20435d(C20437e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar);
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final C20435d m95271a(@C12579k C20437e eVar) {
        return f52691d.mo61299a(eVar);
    }

    @C12579k
    /* renamed from: b */
    public final C20431c mo61295b() {
        return this.f52693b;
    }

    @C0353k0
    /* renamed from: c */
    public final void mo61296c() {
        boolean z;
        Lifecycle lifecycle = this.f52692a.getLifecycle();
        if (lifecycle.mo57465b() == Lifecycle.State.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.mo57464a(new Recreator(this.f52692a));
            this.f52693b.mo61288g(lifecycle);
            this.f52694c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    @C0353k0
    /* renamed from: d */
    public final void mo61297d(@C12580l Bundle bundle) {
        if (!this.f52694c) {
            mo61296c();
        }
        Lifecycle lifecycle = this.f52692a.getLifecycle();
        if (!lifecycle.mo57465b().mo57474q(Lifecycle.State.STARTED)) {
            this.f52693b.mo61289h(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo57465b()).toString());
    }

    @C0353k0
    /* renamed from: e */
    public final void mo61298e(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outBundle");
        this.f52693b.mo61290i(bundle);
    }

    public C20435d(C20437e eVar) {
        this.f52692a = eVar;
        this.f52693b = new C20431c();
    }
}

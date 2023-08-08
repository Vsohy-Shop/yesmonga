package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.C0353k0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10944i;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1747#2,3:318\n533#2,6:321\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n194#1:318,3\n209#1:321,6\n*E\n"})
public final class OnBackPressedDispatcher {
    @C12580l

    /* renamed from: a */
    public final Runnable f675a;
    @C12579k

    /* renamed from: b */
    public final C10944i<C0309t> f676b;
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f677c;
    @C12580l

    /* renamed from: d */
    public OnBackInvokedCallback f678d;
    @C12580l

    /* renamed from: e */
    public OnBackInvokedDispatcher f679e;

    /* renamed from: f */
    public boolean f680f;

    @C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo22516d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/t;", "Landroidx/activity/h;", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "i", "cancel", "Landroidx/lifecycle/Lifecycle;", "a", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/activity/t;", "b", "Landroidx/activity/t;", "onBackPressedCallback", "c", "Landroidx/activity/h;", "currentCancellable", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/t;)V", "activity_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public final class LifecycleOnBackPressedCancellable implements C19470t, C0240h {
        @C12579k

        /* renamed from: a */
        public final Lifecycle f681a;
        @C12579k

        /* renamed from: b */
        public final C0309t f682b;
        @C12580l

        /* renamed from: c */
        public C0240h f683c;

        /* renamed from: d */
        public final /* synthetic */ OnBackPressedDispatcher f684d;

        public LifecycleOnBackPressedCancellable(@C12579k OnBackPressedDispatcher onBackPressedDispatcher, @C12579k Lifecycle lifecycle, C0309t tVar) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(tVar, "onBackPressedCallback");
            this.f684d = onBackPressedDispatcher;
            this.f681a = lifecycle;
            this.f682b = tVar;
            lifecycle.mo57464a(this);
        }

        public void cancel() {
            this.f681a.mo57467d(this);
            this.f682b.mo969i(this);
            C0240h hVar = this.f683c;
            if (hVar != null) {
                hVar.cancel();
            }
            this.f683c = null;
        }

        /* renamed from: i */
        public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
            Intrinsics.checkNotNullParameter(wVar, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.C19372Event.ON_START) {
                this.f683c = this.f684d.mo765d(this.f682b);
            } else if (event == Lifecycle.C19372Event.ON_STOP) {
                C0240h hVar = this.f683c;
                if (hVar != null) {
                    hVar.cancel();
                }
            } else if (event == Lifecycle.C19372Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public static final class C0203a {
        @C12579k

        /* renamed from: a */
        public static final C0203a f685a = new C0203a();

        /* renamed from: c */
        public static final void m1250c(C11289a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        @C12579k
        @C0373u
        /* renamed from: b */
        public final OnBackInvokedCallback mo771b(@C12579k C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(aVar, "onBackInvoked");
            return new C0314y(aVar);
        }

        @C0373u
        /* renamed from: d */
        public final void mo772d(@C12579k Object obj, int i, @C12579k Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "dispatcher");
            Intrinsics.checkNotNullParameter(obj2, C10108c.f27778C);
            C0310u.m1557a(obj).registerOnBackInvokedCallback(i, C0311v.m1558a(obj2));
        }

        @C0373u
        /* renamed from: e */
        public final void mo773e(@C12579k Object obj, @C12579k Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "dispatcher");
            Intrinsics.checkNotNullParameter(obj2, C10108c.f27778C);
            C0310u.m1557a(obj).unregisterOnBackInvokedCallback(C0311v.m1558a(obj2));
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    public final class C0204b implements C0240h {
        @C12579k

        /* renamed from: a */
        public final C0309t f686a;

        /* renamed from: b */
        public final /* synthetic */ OnBackPressedDispatcher f687b;

        public C0204b(@C12579k OnBackPressedDispatcher onBackPressedDispatcher, C0309t tVar) {
            Intrinsics.checkNotNullParameter(tVar, "onBackPressedCallback");
            this.f687b = onBackPressedDispatcher;
            this.f686a = tVar;
        }

        public void cancel() {
            this.f687b.f676b.remove(this.f686a);
            this.f686a.mo969i(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f686a.mo971k((C11289a<C11079d2>) null);
                this.f687b.mo769h();
            }
        }
    }

    @C11315i
    public OnBackPressedDispatcher() {
        this((Runnable) null, 1, (DefaultConstructorMarker) null);
    }

    @C0353k0
    /* renamed from: b */
    public final void mo763b(@C12579k C0309t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "onBackPressedCallback");
        mo765d(tVar);
    }

    @C0353k0
    /* renamed from: c */
    public final void mo764c(@C12579k C19499w wVar, @C12579k C0309t tVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        Intrinsics.checkNotNullParameter(tVar, "onBackPressedCallback");
        Lifecycle lifecycle = wVar.getLifecycle();
        if (lifecycle.mo57465b() != Lifecycle.State.DESTROYED) {
            tVar.mo965d(new LifecycleOnBackPressedCancellable(this, lifecycle, tVar));
            if (Build.VERSION.SDK_INT >= 33) {
                mo769h();
                tVar.mo971k(this.f677c);
            }
        }
    }

    @C0353k0
    @C12579k
    /* renamed from: d */
    public final C0240h mo765d(@C12579k C0309t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "onBackPressedCallback");
        this.f676b.add(tVar);
        C0204b bVar = new C0204b(this, tVar);
        tVar.mo965d(bVar);
        if (Build.VERSION.SDK_INT >= 33) {
            mo769h();
            tVar.mo971k(this.f677c);
        }
        return bVar;
    }

    @C0353k0
    /* renamed from: e */
    public final boolean mo766e() {
        C10944i<C0309t> iVar = this.f676b;
        if ((iVar instanceof Collection) && iVar.isEmpty()) {
            return false;
        }
        for (C0309t g : iVar) {
            if (g.mo967g()) {
                return true;
            }
        }
        return false;
    }

    @C0353k0
    /* renamed from: f */
    public final void mo767f() {
        C0309t tVar;
        C10944i<C0309t> iVar = this.f676b;
        ListIterator<C0309t> listIterator = iVar.listIterator(iVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                tVar = null;
                break;
            }
            tVar = listIterator.previous();
            if (tVar.mo967g()) {
                break;
            }
        }
        C0309t tVar2 = tVar;
        if (tVar2 != null) {
            tVar2.mo792f();
            return;
        }
        Runnable runnable = this.f675a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @C0376v0(33)
    /* renamed from: g */
    public final void mo768g(@C12579k OnBackInvokedDispatcher onBackInvokedDispatcher) {
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "invoker");
        this.f679e = onBackInvokedDispatcher;
        mo769h();
    }

    @C0376v0(33)
    /* renamed from: h */
    public final void mo769h() {
        boolean e = mo766e();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f679e;
        OnBackInvokedCallback onBackInvokedCallback = this.f678d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (e && !this.f680f) {
                C0203a.f685a.mo772d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f680f = true;
            } else if (!e && this.f680f) {
                C0203a.f685a.mo773e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f680f = false;
            }
        }
    }

    @C11315i
    public OnBackPressedDispatcher(@C12580l Runnable runnable) {
        this.f675a = runnable;
        this.f676b = new C10944i<>();
        if (Build.VERSION.SDK_INT >= 33) {
            this.f677c = new C11289a<C11079d2>(this) {
                final /* synthetic */ OnBackPressedDispatcher this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.mo769h();
                }
            };
            this.f678d = C0203a.f685a.mo771b(new C11289a<C11079d2>(this) {
                final /* synthetic */ OnBackPressedDispatcher this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.mo767f();
                }
            });
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }
}

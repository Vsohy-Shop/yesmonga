package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.arch.core.executor.C0829c;
import androidx.arch.core.internal.C0835a;
import androidx.arch.core.internal.C0836b;
import androidx.lifecycle.Lifecycle;
import com.urbanairship.analytics.location.C35560b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.C11395k;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.y */
public class C19512y extends Lifecycle {
    @C12579k

    /* renamed from: j */
    public static final C19513a f49902j = new C19513a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public final boolean f49903b;
    @C12579k

    /* renamed from: c */
    public C0835a<C19475v, C19514b> f49904c;
    @C12579k

    /* renamed from: d */
    public Lifecycle.State f49905d;
    @C12579k

    /* renamed from: e */
    public final WeakReference<C19499w> f49906e;

    /* renamed from: f */
    public int f49907f;

    /* renamed from: g */
    public boolean f49908g;

    /* renamed from: h */
    public boolean f49909h;
    @C12579k

    /* renamed from: i */
    public ArrayList<Lifecycle.State> f49910i;

    /* renamed from: androidx.lifecycle.y$a */
    public static final class C19513a {
        public /* synthetic */ C19513a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C0344h1
        @C12579k
        @C11384m
        /* renamed from: a */
        public final C19512y mo57713a(@C12579k C19499w wVar) {
            Intrinsics.checkNotNullParameter(wVar, "owner");
            return new C19512y(wVar, false, (DefaultConstructorMarker) null);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final Lifecycle.State mo57714b(@C12579k Lifecycle.State state, @C12580l Lifecycle.State state2) {
            Intrinsics.checkNotNullParameter(state, "state1");
            if (state2 == null || state2.compareTo(state) >= 0) {
                return state;
            }
            return state2;
        }

        public C19513a() {
        }
    }

    /* renamed from: androidx.lifecycle.y$b */
    public static final class C19514b {
        @C12579k

        /* renamed from: a */
        public Lifecycle.State f49911a;
        @C12579k

        /* renamed from: b */
        public C19470t f49912b;

        public C19514b(@C12580l C19475v vVar, @C12579k Lifecycle.State state) {
            Intrinsics.checkNotNullParameter(state, "initialState");
            Intrinsics.checkNotNull(vVar);
            this.f49912b = C19394b0.m90659f(vVar);
            this.f49911a = state;
        }

        /* renamed from: a */
        public final void mo57715a(@C12580l C19499w wVar, @C12579k Lifecycle.C19372Event event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Lifecycle.State w = event.mo57469w();
            this.f49911a = C19512y.f49902j.mo57714b(this.f49911a, w);
            C19470t tVar = this.f49912b;
            Intrinsics.checkNotNull(wVar);
            tVar.mo750i(wVar, event);
            this.f49911a = w;
        }

        @C12579k
        /* renamed from: b */
        public final C19470t mo57716b() {
            return this.f49912b;
        }

        @C12579k
        /* renamed from: c */
        public final Lifecycle.State mo57717c() {
            return this.f49911a;
        }

        /* renamed from: d */
        public final void mo57718d(@C12579k C19470t tVar) {
            Intrinsics.checkNotNullParameter(tVar, "<set-?>");
            this.f49912b = tVar;
        }

        /* renamed from: e */
        public final void mo57719e(@C12579k Lifecycle.State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.f49911a = state;
        }
    }

    public /* synthetic */ C19512y(C19499w wVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, z);
    }

    @C0344h1
    @C12579k
    @C11384m
    /* renamed from: h */
    public static final C19512y m90869h(@C12579k C19499w wVar) {
        return f49902j.mo57713a(wVar);
    }

    @C12579k
    @C11384m
    /* renamed from: o */
    public static final Lifecycle.State m90870o(@C12579k Lifecycle.State state, @C12580l Lifecycle.State state2) {
        return f49902j.mo57714b(state, state2);
    }

    /* renamed from: a */
    public void mo57464a(@C12579k C19475v vVar) {
        C19499w wVar;
        boolean z;
        Intrinsics.checkNotNullParameter(vVar, "observer");
        mo57702i("addObserver");
        Lifecycle.State state = this.f49905d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        C19514b bVar = new C19514b(vVar, state2);
        if (this.f49904c.mo3803r(vVar, bVar) == null && (wVar = this.f49906e.get()) != null) {
            if (this.f49907f != 0 || this.f49908g) {
                z = true;
            } else {
                z = false;
            }
            Lifecycle.State g = mo57701g(vVar);
            this.f49907f++;
            while (bVar.mo57717c().compareTo(g) < 0 && this.f49904c.contains(vVar)) {
                mo57710r(bVar.mo57717c());
                Lifecycle.C19372Event c = Lifecycle.C19372Event.Companion.mo57472c(bVar.mo57717c());
                if (c != null) {
                    bVar.mo57715a(wVar, c);
                    mo57709q();
                    g = mo57701g(vVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar.mo57717c());
                }
            }
            if (!z) {
                mo57712t();
            }
            this.f49907f--;
        }
    }

    @C12579k
    /* renamed from: b */
    public Lifecycle.State mo57465b() {
        return this.f49905d;
    }

    /* renamed from: d */
    public void mo57467d(@C12579k C19475v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "observer");
        mo57702i("removeObserver");
        this.f49904c.mo3804w(vVar);
    }

    /* renamed from: f */
    public final void mo57700f(C19499w wVar) {
        Iterator<Map.Entry<C19475v, C19514b>> descendingIterator = this.f49904c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f49909h) {
            Map.Entry next = descendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(next, "next()");
            C19475v vVar = (C19475v) next.getKey();
            C19514b bVar = (C19514b) next.getValue();
            while (bVar.mo57717c().compareTo(this.f49905d) > 0 && !this.f49909h && this.f49904c.contains(vVar)) {
                Lifecycle.C19372Event a = Lifecycle.C19372Event.Companion.mo57470a(bVar.mo57717c());
                if (a != null) {
                    mo57710r(a.mo57469w());
                    bVar.mo57715a(wVar, a);
                    mo57709q();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.mo57717c());
                }
            }
        }
    }

    /* renamed from: g */
    public final Lifecycle.State mo57701g(C19475v vVar) {
        Lifecycle.State state;
        C19514b value;
        Map.Entry<C19475v, C19514b> y = this.f49904c.mo3805y(vVar);
        Lifecycle.State state2 = null;
        if (y == null || (value = y.getValue()) == null) {
            state = null;
        } else {
            state = value.mo57717c();
        }
        if (!this.f49910i.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.f49910i;
            state2 = arrayList.get(arrayList.size() - 1);
        }
        C19513a aVar = f49902j;
        return aVar.mo57714b(aVar.mo57714b(this.f49905d, state), state2);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: i */
    public final void mo57702i(String str) {
        if (this.f49903b && !C0829c.m3971h().mo3796c()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* renamed from: j */
    public final void mo57703j(C19499w wVar) {
        C0836b<K, V>.d i = this.f49904c.mo3810i();
        Intrinsics.checkNotNullExpressionValue(i, "observerMap.iteratorWithAdditions()");
        while (i.hasNext() && !this.f49909h) {
            Map.Entry entry = (Map.Entry) i.next();
            C19475v vVar = (C19475v) entry.getKey();
            C19514b bVar = (C19514b) entry.getValue();
            while (bVar.mo57717c().compareTo(this.f49905d) < 0 && !this.f49909h && this.f49904c.contains(vVar)) {
                mo57710r(bVar.mo57717c());
                Lifecycle.C19372Event c = Lifecycle.C19372Event.Companion.mo57472c(bVar.mo57717c());
                if (c != null) {
                    bVar.mo57715a(wVar, c);
                    mo57709q();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.mo57717c());
                }
            }
        }
    }

    /* renamed from: k */
    public int mo57704k() {
        mo57702i("getObserverCount");
        return this.f49904c.size();
    }

    /* renamed from: l */
    public void mo57705l(@C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mo57702i("handleLifecycleEvent");
        mo57708p(event.mo57469w());
    }

    /* renamed from: m */
    public final boolean mo57706m() {
        if (this.f49904c.size() == 0) {
            return true;
        }
        Map.Entry<C19475v, C19514b> e = this.f49904c.mo3807e();
        Intrinsics.checkNotNull(e);
        Lifecycle.State c = e.getValue().mo57717c();
        Map.Entry<C19475v, C19514b> k = this.f49904c.mo3812k();
        Intrinsics.checkNotNull(k);
        Lifecycle.State c2 = k.getValue().mo57717c();
        if (c == c2 && this.f49905d == c2) {
            return true;
        }
        return false;
    }

    @C11395k(message = "Override [currentState].")
    @C0353k0
    /* renamed from: n */
    public void mo57707n(@C12579k Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        mo57702i("markState");
        mo57711s(state);
    }

    /* renamed from: p */
    public final void mo57708p(Lifecycle.State state) {
        boolean z;
        Lifecycle.State state2 = this.f49905d;
        if (state2 != state) {
            if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f49905d = state;
                if (this.f49908g || this.f49907f != 0) {
                    this.f49909h = true;
                    return;
                }
                this.f49908g = true;
                mo57712t();
                this.f49908g = false;
                if (this.f49905d == Lifecycle.State.DESTROYED) {
                    this.f49904c = new C0835a<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f49905d + " in component " + this.f49906e.get()).toString());
        }
    }

    /* renamed from: q */
    public final void mo57709q() {
        ArrayList<Lifecycle.State> arrayList = this.f49910i;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: r */
    public final void mo57710r(Lifecycle.State state) {
        this.f49910i.add(state);
    }

    /* renamed from: s */
    public void mo57711s(@C12579k Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        mo57702i("setCurrentState");
        mo57708p(state);
    }

    /* renamed from: t */
    public final void mo57712t() {
        C19499w wVar = this.f49906e.get();
        if (wVar != null) {
            while (!mo57706m()) {
                this.f49909h = false;
                Lifecycle.State state = this.f49905d;
                Map.Entry<C19475v, C19514b> e = this.f49904c.mo3807e();
                Intrinsics.checkNotNull(e);
                if (state.compareTo(e.getValue().mo57717c()) < 0) {
                    mo57700f(wVar);
                }
                Map.Entry<C19475v, C19514b> k = this.f49904c.mo3812k();
                if (!this.f49909h && k != null && this.f49905d.compareTo(k.getValue().mo57717c()) > 0) {
                    mo57703j(wVar);
                }
            }
            this.f49909h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public C19512y(C19499w wVar, boolean z) {
        this.f49903b = z;
        this.f49904c = new C0835a<>();
        this.f49905d = Lifecycle.State.INITIALIZED;
        this.f49910i = new ArrayList<>();
        this.f49906e = new WeakReference<>(wVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19512y(@C12579k C19499w wVar) {
        this(wVar, true);
        Intrinsics.checkNotNullParameter(wVar, C35560b.f87807Z0);
    }
}

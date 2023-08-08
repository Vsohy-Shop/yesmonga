package androidx.window.embedding;

import android.app.Activity;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.appcompat.widget.C0696c;
import androidx.core.util.C17970d;
import androidx.window.core.C20994d;
import androidx.window.embedding.C21009k;
import androidx.window.embedding.C21011l;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.p */
public final class C21016p implements C21008j {
    @C12579k

    /* renamed from: e */
    public static final C21017a f54190e = new C21017a((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: f */
    public static volatile C21016p f54191f = null;
    @C12579k

    /* renamed from: g */
    public static final ReentrantLock f54192g = new ReentrantLock();
    @C12579k

    /* renamed from: h */
    public static final String f54193h = "EmbeddingBackend";
    @C0344h1
    @C12580l
    @C0323b0("globalLock")

    /* renamed from: a */
    public C21011l f54194a;
    @C12579k

    /* renamed from: b */
    public final CopyOnWriteArrayList<C21019c> f54195b = new CopyOnWriteArrayList<>();
    @C12579k

    /* renamed from: c */
    public final C21018b f54196c;
    @C12579k

    /* renamed from: d */
    public final CopyOnWriteArraySet<C21013m> f54197d;

    /* renamed from: androidx.window.embedding.p$a */
    public static final class C21017a {
        public /* synthetic */ C21017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C21016p mo62840a() {
            if (C21016p.f54191f == null) {
                ReentrantLock i = C21016p.f54192g;
                i.lock();
                try {
                    if (C21016p.f54191f == null) {
                        C21016p.f54191f = new C21016p(C21016p.f54190e.mo62841b());
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                } finally {
                    i.unlock();
                }
            }
            C21016p h = C21016p.f54191f;
            Intrinsics.checkNotNull(h);
            return h;
        }

        /* renamed from: b */
        public final C21011l mo62841b() {
            try {
                C21009k.C21010a aVar = C21009k.f54183c;
                if (!mo62842c(aVar.mo62830b()) || !aVar.mo62831c()) {
                    return null;
                }
                return new C21009k();
            } catch (Throwable th) {
                Intrinsics.stringPlus("Failed to load embedding extension: ", th);
                return null;
            }
        }

        @C0344h1
        /* renamed from: c */
        public final boolean mo62842c(@C12580l Integer num) {
            return num != null && num.intValue() >= 1;
        }

        public C21017a() {
        }
    }

    /* renamed from: androidx.window.embedding.p$b */
    public final class C21018b implements C21011l.C21012a {
        @C12580l

        /* renamed from: a */
        public List<C21024t> f54198a;

        /* renamed from: b */
        public final /* synthetic */ C21016p f54199b;

        public C21018b(C21016p pVar) {
            Intrinsics.checkNotNullParameter(pVar, "this$0");
            this.f54199b = pVar;
        }

        /* renamed from: a */
        public void mo62832a(@C12579k List<C21024t> list) {
            Intrinsics.checkNotNullParameter(list, "splitInfo");
            this.f54198a = list;
            Iterator<C21019c> it = this.f54199b.mo62838l().iterator();
            while (it.hasNext()) {
                it.next().mo62845b(list);
            }
        }

        @C12580l
        /* renamed from: b */
        public final List<C21024t> mo62843b() {
            return this.f54198a;
        }

        /* renamed from: c */
        public final void mo62844c(@C12580l List<C21024t> list) {
            this.f54198a = list;
        }
    }

    /* renamed from: androidx.window.embedding.p$c */
    public static final class C21019c {
        @C12579k

        /* renamed from: a */
        public final Activity f54200a;
        @C12579k

        /* renamed from: b */
        public final Executor f54201b;
        @C12579k

        /* renamed from: c */
        public final C17970d<List<C21024t>> f54202c;
        @C12580l

        /* renamed from: d */
        public List<C21024t> f54203d;

        public C21019c(@C12579k Activity activity, @C12579k Executor executor, @C12579k C17970d<List<C21024t>> dVar) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(dVar, C10108c.f27778C);
            this.f54200a = activity;
            this.f54201b = executor;
            this.f54202c = dVar;
        }

        /* renamed from: c */
        public static final void m97243c(C21019c cVar, List list) {
            Intrinsics.checkNotNullParameter(cVar, "this$0");
            Intrinsics.checkNotNullParameter(list, "$splitsWithActivity");
            cVar.f54202c.accept(list);
        }

        /* renamed from: b */
        public final void mo62845b(@C12579k List<C21024t> list) {
            Intrinsics.checkNotNullParameter(list, "splitInfoList");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((C21024t) next).mo62861a(this.f54200a)) {
                    arrayList.add(next);
                }
            }
            if (!Intrinsics.areEqual((Object) arrayList, (Object) this.f54203d)) {
                this.f54203d = arrayList;
                this.f54201b.execute(new C21020q(this, arrayList));
            }
        }

        @C12579k
        /* renamed from: d */
        public final C17970d<List<C21024t>> mo62846d() {
            return this.f54202c;
        }
    }

    @C0344h1
    public C21016p(@C12580l C21011l lVar) {
        this.f54194a = lVar;
        C21018b bVar = new C21018b(this);
        this.f54196c = bVar;
        C21011l lVar2 = this.f54194a;
        if (lVar2 != null) {
            lVar2.mo62828b(bVar);
        }
        this.f54197d = new CopyOnWriteArraySet<>();
    }

    @C0344h1
    /* renamed from: m */
    public static /* synthetic */ void m97225m() {
    }

    /* renamed from: a */
    public void mo62820a(@C12579k Set<? extends C21013m> set) {
        Intrinsics.checkNotNullParameter(set, "rules");
        this.f54197d.clear();
        this.f54197d.addAll(set);
        C21011l lVar = this.f54194a;
        if (lVar != null) {
            lVar.mo62827a(this.f54197d);
        }
    }

    @C12579k
    /* renamed from: b */
    public Set<C21013m> mo62821b() {
        return this.f54197d;
    }

    /* renamed from: c */
    public void mo62822c(@C12579k Activity activity, @C12579k Executor executor, @C12579k C17970d<List<C21024t>> dVar) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(dVar, C10108c.f27778C);
        ReentrantLock reentrantLock = f54192g;
        reentrantLock.lock();
        try {
            if (mo62837k() == null) {
                dVar.accept(CollectionsKt__CollectionsKt.m40441E());
                return;
            }
            C21019c cVar = new C21019c(activity, executor, dVar);
            mo62838l().add(cVar);
            if (this.f54196c.mo62843b() != null) {
                List<C21024t> b = this.f54196c.mo62843b();
                Intrinsics.checkNotNull(b);
                cVar.mo62845b(b);
            } else {
                cVar.mo62845b(CollectionsKt__CollectionsKt.m40441E());
            }
            C11079d2 d2Var = C11079d2.f28267a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public void mo62823d(@C12579k C21013m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "rule");
        if (!this.f54197d.contains(mVar)) {
            this.f54197d.add(mVar);
            C21011l lVar = this.f54194a;
            if (lVar != null) {
                lVar.mo62827a(this.f54197d);
            }
        }
    }

    /* renamed from: e */
    public void mo62824e(@C12579k C17970d<List<C21024t>> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "consumer");
        ReentrantLock reentrantLock = f54192g;
        reentrantLock.lock();
        try {
            Iterator<C21019c> it = mo62838l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C21019c next = it.next();
                if (Intrinsics.areEqual((Object) next.mo62846d(), (Object) dVar)) {
                    mo62838l().remove(next);
                    break;
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: f */
    public boolean mo62825f() {
        return this.f54194a != null;
    }

    /* renamed from: g */
    public void mo62826g(@C12579k C21013m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "rule");
        if (this.f54197d.contains(mVar)) {
            this.f54197d.remove(mVar);
            C21011l lVar = this.f54194a;
            if (lVar != null) {
                lVar.mo62827a(this.f54197d);
            }
        }
    }

    @C12580l
    /* renamed from: k */
    public final C21011l mo62837k() {
        return this.f54194a;
    }

    @C12579k
    /* renamed from: l */
    public final CopyOnWriteArrayList<C21019c> mo62838l() {
        return this.f54195b;
    }

    /* renamed from: n */
    public final void mo62839n(@C12580l C21011l lVar) {
        this.f54194a = lVar;
    }
}

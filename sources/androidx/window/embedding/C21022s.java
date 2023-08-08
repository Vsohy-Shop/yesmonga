package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.C0696c;
import androidx.core.util.C17970d;
import androidx.window.core.C20994d;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C11079d2;
import kotlin.collections.C10930d1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.s */
public final class C21022s {
    @C12579k

    /* renamed from: c */
    public static final C21023a f54209c = new C21023a((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: d */
    public static volatile C21022s f54210d = null;
    @C12579k

    /* renamed from: e */
    public static final ReentrantLock f54211e = new ReentrantLock();

    /* renamed from: f */
    public static final boolean f54212f = false;
    @C12579k

    /* renamed from: a */
    public final C21008j f54213a;
    @C12579k

    /* renamed from: b */
    public Set<? extends C21013m> f54214b;

    /* renamed from: androidx.window.embedding.s$a */
    public static final class C21023a {
        public /* synthetic */ C21023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C21022s mo62859a() {
            if (C21022s.f54210d == null) {
                ReentrantLock b = C21022s.f54211e;
                b.lock();
                try {
                    if (C21022s.f54210d == null) {
                        C21023a aVar = C21022s.f54209c;
                        C21022s.f54210d = new C21022s((DefaultConstructorMarker) null);
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                } finally {
                    b.unlock();
                }
            }
            C21022s a = C21022s.f54210d;
            Intrinsics.checkNotNull(a);
            return a;
        }

        @C11384m
        /* renamed from: b */
        public final void mo62860b(@C12579k Context context, int i) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Set<C21013m> g = new C21032z().mo62898g(context, i);
            C21022s a = mo62859a();
            if (g == null) {
                g = C10930d1.m40892k();
            }
            a.mo62857m(g);
        }

        public C21023a() {
        }
    }

    public /* synthetic */ C21022s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C21022s m97253g() {
        return f54209c.mo62859a();
    }

    @C11384m
    /* renamed from: i */
    public static final void m97254i(@C12579k Context context, int i) {
        f54209c.mo62860b(context, i);
    }

    /* renamed from: e */
    public final void mo62851e(@C12579k Activity activity, @C12579k Executor executor, @C12579k C17970d<List<C21024t>> dVar) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(dVar, "consumer");
        this.f54213a.mo62822c(activity, executor, dVar);
    }

    /* renamed from: f */
    public final void mo62852f() {
        this.f54213a.mo62820a(this.f54214b);
    }

    @C12579k
    /* renamed from: h */
    public final Set<C21013m> mo62853h() {
        return CollectionsKt___CollectionsKt.m40582V5(this.f54213a.mo62821b());
    }

    /* renamed from: j */
    public final boolean mo62854j() {
        return this.f54213a.mo62825f();
    }

    /* renamed from: k */
    public final void mo62855k(@C12579k C21013m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "rule");
        this.f54213a.mo62823d(mVar);
    }

    /* renamed from: l */
    public final void mo62856l(@C12579k C17970d<List<C21024t>> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "consumer");
        this.f54213a.mo62824e(dVar);
    }

    /* renamed from: m */
    public final void mo62857m(Set<? extends C21013m> set) {
        this.f54214b = set;
        this.f54213a.mo62820a(set);
    }

    /* renamed from: n */
    public final void mo62858n(@C12579k C21013m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "rule");
        this.f54213a.mo62826g(mVar);
    }

    public C21022s() {
        this.f54213a = C21016p.f54190e.mo62840a();
        this.f54214b = C10930d1.m40892k();
    }
}

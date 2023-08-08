package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.impl.constraints.C21137a;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.iam.events.C9175a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.h */
public abstract class C21164h<T> {
    @C12579k

    /* renamed from: a */
    public final C21345b f54611a;
    @C12579k

    /* renamed from: b */
    public final Context f54612b;
    @C12579k

    /* renamed from: c */
    public final Object f54613c = new Object();
    @C12579k

    /* renamed from: d */
    public final LinkedHashSet<C21137a<T>> f54614d = new LinkedHashSet<>();
    @C12580l

    /* renamed from: e */
    public T f54615e;

    public C21164h(@C12579k Context context, @C12579k C21345b bVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
        this.f54611a = bVar;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f54612b = applicationContext;
    }

    /* renamed from: b */
    public static final void m97862b(List list, C21164h hVar) {
        Intrinsics.checkNotNullParameter(list, "$listenersList");
        Intrinsics.checkNotNullParameter(hVar, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C21137a) it.next()).mo63275a(hVar.f54615e);
        }
    }

    /* renamed from: c */
    public final void mo63318c(@C12579k C21137a<T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
        synchronized (this.f54613c) {
            if (this.f54614d.add(aVar)) {
                if (this.f54614d.size() == 1) {
                    this.f54615e = mo63308e();
                    C21377l e = C21377l.m98582e();
                    String a = C21165i.f54616a;
                    e.mo63774a(a, getClass().getSimpleName() + ": initial state = " + this.f54615e);
                    mo63314i();
                }
                aVar.mo63275a(this.f54615e);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    @C12579k
    /* renamed from: d */
    public final Context mo63319d() {
        return this.f54612b;
    }

    /* renamed from: e */
    public abstract T mo63308e();

    /* renamed from: f */
    public final T mo63320f() {
        T t = this.f54615e;
        return t == null ? mo63308e() : t;
    }

    /* renamed from: g */
    public final void mo63321g(@C12579k C21137a<T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
        synchronized (this.f54613c) {
            if (this.f54614d.remove(aVar) && this.f54614d.isEmpty()) {
                mo63315j();
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: h */
    public final void mo63322h(T t) {
        synchronized (this.f54613c) {
            T t2 = this.f54615e;
            if (t2 == null || !Intrinsics.areEqual((Object) t2, (Object) t)) {
                this.f54615e = t;
                this.f54611a.mo63698a().execute(new C21163g(CollectionsKt___CollectionsKt.m40557Q5(this.f54614d), this));
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* renamed from: i */
    public abstract void mo63314i();

    /* renamed from: j */
    public abstract void mo63315j();
}

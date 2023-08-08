package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21091d;
import androidx.work.C21094f;
import androidx.work.C21379m;
import androidx.work.C21403p;
import androidx.work.C21411u;
import androidx.work.C21412v;
import androidx.work.C21414w;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.C21191g0;
import com.google.common.util.concurrent.C32487a;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.work.multiprocess.e */
public abstract class C21395e {
    @C0359n0
    /* renamed from: o */
    public static C21395e m98667o(@C0359n0 Context context) {
        C21395e M = C21191g0.m97937J(context).mo63360M();
        if (M != null) {
            return M;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @C0359n0
    /* renamed from: a */
    public final C21394d mo63824a(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 C21379m mVar) {
        return mo63825b(str, existingWorkPolicy, Collections.singletonList(mVar));
    }

    @C0359n0
    /* renamed from: b */
    public abstract C21394d mo63825b(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 List<C21379m> list);

    @C0359n0
    /* renamed from: c */
    public final C21394d mo63826c(@C0359n0 C21379m mVar) {
        return mo63827d(Collections.singletonList(mVar));
    }

    @C0359n0
    /* renamed from: d */
    public abstract C21394d mo63827d(@C0359n0 List<C21379m> list);

    @C0359n0
    /* renamed from: e */
    public abstract C32487a<Void> mo63828e();

    @C0359n0
    /* renamed from: f */
    public abstract C32487a<Void> mo63829f(@C0359n0 String str);

    @C0359n0
    /* renamed from: g */
    public abstract C32487a<Void> mo63830g(@C0359n0 String str);

    @C0359n0
    /* renamed from: h */
    public abstract C32487a<Void> mo63831h(@C0359n0 UUID uuid);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: i */
    public abstract C32487a<Void> mo63832i(@C0359n0 C21411u uVar);

    @C0359n0
    /* renamed from: j */
    public abstract C32487a<Void> mo63833j(@C0359n0 C21414w wVar);

    @C0359n0
    /* renamed from: k */
    public abstract C32487a<Void> mo63834k(@C0359n0 List<C21414w> list);

    @C0359n0
    /* renamed from: l */
    public abstract C32487a<Void> mo63835l(@C0359n0 String str, @C0359n0 ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @C0359n0 C21403p pVar);

    @C0359n0
    /* renamed from: m */
    public final C32487a<Void> mo63836m(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 C21379m mVar) {
        return mo63837n(str, existingWorkPolicy, Collections.singletonList(mVar));
    }

    @C0359n0
    /* renamed from: n */
    public abstract C32487a<Void> mo63837n(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 List<C21379m> list);

    @C0359n0
    /* renamed from: p */
    public abstract C32487a<List<WorkInfo>> mo63838p(@C0359n0 C21412v vVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: q */
    public abstract C32487a<Void> mo63839q(@C0359n0 String str, @C0359n0 C21094f fVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: r */
    public abstract C32487a<Void> mo63840r(@C0359n0 UUID uuid, @C0359n0 C21091d dVar);
}

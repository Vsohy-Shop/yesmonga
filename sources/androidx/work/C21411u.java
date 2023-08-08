package androidx.work;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C32487a;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.u */
public abstract class C21411u {
    @C0359n0
    /* renamed from: a */
    public static C21411u m98700a(@C0359n0 List<C21411u> list) {
        return list.get(0).mo63730b(list);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: b */
    public abstract C21411u mo63730b(@C0359n0 List<C21411u> list);

    @C0359n0
    /* renamed from: c */
    public abstract C21397o mo63731c();

    @C0359n0
    /* renamed from: d */
    public abstract C32487a<List<WorkInfo>> mo63732d();

    @C0359n0
    /* renamed from: e */
    public abstract LiveData<List<WorkInfo>> mo63733e();

    @C0359n0
    /* renamed from: f */
    public final C21411u mo63847f(@C0359n0 C21379m mVar) {
        return mo63734g(Collections.singletonList(mVar));
    }

    @C0359n0
    /* renamed from: g */
    public abstract C21411u mo63734g(@C0359n0 List<C21379m> list);
}

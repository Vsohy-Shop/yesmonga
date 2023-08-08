package androidx.work.multiprocess;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21379m;
import com.google.common.util.concurrent.C32487a;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.multiprocess.d */
public abstract class C21394d {
    @C0359n0
    /* renamed from: a */
    public static C21394d m98662a(@C0359n0 List<C21394d> list) {
        return list.get(0).mo63820b(list);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: b */
    public abstract C21394d mo63820b(@C0359n0 List<C21394d> list);

    @C0359n0
    /* renamed from: c */
    public abstract C32487a<Void> mo63821c();

    @C0359n0
    /* renamed from: d */
    public final C21394d mo63822d(@C0359n0 C21379m mVar) {
        return mo63823e(Collections.singletonList(mVar));
    }

    @C0359n0
    /* renamed from: e */
    public abstract C21394d mo63823e(@C0359n0 List<C21379m> list);
}

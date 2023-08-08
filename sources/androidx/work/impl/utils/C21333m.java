package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.utils.m */
public final class C21333m {
    @C12579k

    /* renamed from: a */
    public final WorkDatabase f55036a;

    public C21333m(@C12579k WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f55036a = workDatabase;
    }

    /* renamed from: d */
    public static final Integer m98442d(C21333m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "this$0");
        return Integer.valueOf(C21334n.m98449d(mVar.f55036a, C21334n.f55039c));
    }

    /* renamed from: f */
    public static final Integer m98443f(C21333m mVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(mVar, "this$0");
        int a = C21334n.m98449d(mVar.f55036a, C21334n.f55038b);
        boolean z = false;
        if (i <= a && a <= i2) {
            z = true;
        }
        if (!z) {
            C21334n.m98450e(mVar.f55036a, C21334n.f55038b, i + 1);
        } else {
            i = a;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    public final int mo63686c() {
        Object L = this.f55036a.mo60898L(new C21331k(this));
        Intrinsics.checkNotNullExpressionValue(L, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) L).intValue();
    }

    /* renamed from: e */
    public final int mo63687e(int i, int i2) {
        Object L = this.f55036a.mo60898L(new C21332l(this, i, i2));
        Intrinsics.checkNotNullExpressionValue(L, "workDatabase.runInTransa…            id\n        })");
        return ((Number) L).intValue();
    }
}

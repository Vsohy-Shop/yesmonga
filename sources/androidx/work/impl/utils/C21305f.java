package androidx.work.impl.utils;

import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.C21087c;
import androidx.work.C21091d;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.C21289t;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.workers.C21365c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.utils.f */
public final class C21305f {
    @C12579k
    /* renamed from: a */
    public static final C21249u m98380a(@C12579k C21249u uVar) {
        C21249u uVar2 = uVar;
        Intrinsics.checkNotNullParameter(uVar2, "workSpec");
        C21087c cVar = uVar2.f54813j;
        String str = uVar2.f54806c;
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        if (Intrinsics.areEqual((Object) str, (Object) cls.getName())) {
            return uVar2;
        }
        if (!cVar.mo63131f() && !cVar.mo63135i()) {
            return uVar2;
        }
        C21091d a = new C21091d.C21092a().mo63174c(uVar2.f54808e).mo63188q(C21365c.f55096b, str).mo63172a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = cls.getName();
        String str2 = name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return C21249u.m98121y(uVar, (String) null, (WorkInfo.State) null, str2, (String) null, a, (C21091d) null, 0, 0, 0, (C21087c) null, 0, (BackoffPolicy) null, 0, 0, 0, 0, false, (OutOfQuotaPolicy) null, 0, 0, 1048555, (Object) null);
    }

    /* renamed from: b */
    public static final boolean m98381b(List<? extends C21289t> list, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterable<C21289t> iterable = list;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (C21289t tVar : iterable) {
                if (cls.isAssignableFrom(tVar.getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @C12579k
    /* renamed from: c */
    public static final C21249u m98382c(@C12579k List<? extends C21289t> list, @C12579k C21249u uVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "schedulers");
        Intrinsics.checkNotNullParameter(uVar, "workSpec");
        if (Build.VERSION.SDK_INT < 26) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m98380a(uVar);
        }
        return uVar;
    }
}

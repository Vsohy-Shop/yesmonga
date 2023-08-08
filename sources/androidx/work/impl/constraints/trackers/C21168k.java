package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.core.net.C17761a;
import androidx.work.C21377l;
import androidx.work.impl.constraints.C21138b;
import androidx.work.impl.utils.C21338p;
import androidx.work.impl.utils.C21339q;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.constraints.trackers.k */
public final class C21168k {
    @C12579k

    /* renamed from: a */
    public static final String f54620a;

    static {
        String i = C21377l.m98584i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(i, "tagWithPrefix(\"NetworkStateTracker\")");
        f54620a = i;
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static final C21164h<C21138b> m97877a(@C12579k Context context, @C12579k C21345b bVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
        return new C21166j(context, bVar);
    }

    @C12579k
    /* renamed from: c */
    public static final C21138b m97879c(@C12579k ConnectivityManager connectivityManager) {
        boolean z;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        boolean e = m97881e(connectivityManager);
        boolean c = C17761a.m81117c(connectivityManager);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z2 = false;
        }
        return new C21138b(z, e, c, z2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m97880d(ConnectivityManager connectivityManager) {
    }

    /* renamed from: e */
    public static final boolean m97881e(@C12579k ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities a = C21338p.m98453a(connectivityManager, C21339q.m98456a(connectivityManager));
            if (a != null) {
                return C21338p.m98454b(a, 16);
            }
            return false;
        } catch (SecurityException e) {
            C21377l.m98582e().mo63777d(f54620a, "Unable to validate active network", e);
            return false;
        }
    }
}

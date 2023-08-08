package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.preference.C19965r;
import androidx.work.C21377l;
import androidx.work.impl.constraints.C21138b;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.constraints.trackers.l */
public final class C21169l extends C21160e<C21138b> {
    @C12579k

    /* renamed from: g */
    public final ConnectivityManager f54621g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21169l(@C12579k Context context, @C12579k C21345b bVar) {
        super(context, bVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
        Object systemService = mo63319d().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f54621g = (ConnectivityManager) systemService;
    }

    /* renamed from: n */
    public static /* synthetic */ void m97882n() {
    }

    @C12579k
    /* renamed from: k */
    public IntentFilter mo63309k() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* renamed from: l */
    public void mo63310l(@C12579k Intent intent) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        if (Intrinsics.areEqual((Object) intent.getAction(), (Object) "android.net.conn.CONNECTIVITY_CHANGE")) {
            C21377l.m98582e().mo63774a(C21168k.f54620a, "Network broadcast received");
            mo63322h(C21168k.m97879c(this.f54621g));
        }
    }

    @C12579k
    /* renamed from: m */
    public C21138b mo63308e() {
        return C21168k.m97879c(this.f54621g);
    }
}

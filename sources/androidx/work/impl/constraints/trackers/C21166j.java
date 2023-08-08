package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.C0376v0;
import androidx.work.C21377l;
import androidx.work.impl.constraints.C21138b;
import androidx.work.impl.utils.C21338p;
import androidx.work.impl.utils.C21340r;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(24)
/* renamed from: androidx.work.impl.constraints.trackers.j */
public final class C21166j extends C21164h<C21138b> {
    @C12579k

    /* renamed from: f */
    public final ConnectivityManager f54617f;
    @C12579k

    /* renamed from: g */
    public final C21167a f54618g = new C21167a(this);

    /* renamed from: androidx.work.impl.constraints.trackers.j$a */
    public static final class C21167a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ C21166j f54619a;

        public C21167a(C21166j jVar) {
            this.f54619a = jVar;
        }

        public void onCapabilitiesChanged(@C12579k Network network, @C12579k NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "capabilities");
            C21377l e = C21377l.m98582e();
            String b = C21168k.f54620a;
            e.mo63774a(b, "Network capabilities changed: " + networkCapabilities);
            C21166j jVar = this.f54619a;
            jVar.mo63322h(C21168k.m97879c(jVar.f54617f));
        }

        public void onLost(@C12579k Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C21377l.m98582e().mo63774a(C21168k.f54620a, "Network connection lost");
            C21166j jVar = this.f54619a;
            jVar.mo63322h(C21168k.m97879c(jVar.f54617f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21166j(@C12579k Context context, @C12579k C21345b bVar) {
        super(context, bVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
        Object systemService = mo63319d().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f54617f = (ConnectivityManager) systemService;
    }

    /* renamed from: i */
    public void mo63314i() {
        try {
            C21377l.m98582e().mo63774a(C21168k.f54620a, "Registering network callback");
            C21340r.m98457a(this.f54617f, this.f54618g);
        } catch (IllegalArgumentException e) {
            C21377l.m98582e().mo63777d(C21168k.f54620a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            C21377l.m98582e().mo63777d(C21168k.f54620a, "Received exception while registering network callback", e2);
        }
    }

    /* renamed from: j */
    public void mo63315j() {
        try {
            C21377l.m98582e().mo63774a(C21168k.f54620a, "Unregistering network callback");
            C21338p.m98455c(this.f54617f, this.f54618g);
        } catch (IllegalArgumentException e) {
            C21377l.m98582e().mo63777d(C21168k.f54620a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            C21377l.m98582e().mo63777d(C21168k.f54620a, "Received exception while unregistering network callback", e2);
        }
    }

    @C12579k
    /* renamed from: l */
    public C21138b mo63308e() {
        return C21168k.m97879c(this.f54617f);
    }
}

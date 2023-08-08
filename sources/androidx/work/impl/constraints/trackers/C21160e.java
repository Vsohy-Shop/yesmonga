package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.preference.C19965r;
import androidx.work.C21377l;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.e */
public abstract class C21160e<T> extends C21164h<T> {
    @C12579k

    /* renamed from: f */
    public final BroadcastReceiver f54606f = new C21161a(this);

    /* renamed from: androidx.work.impl.constraints.trackers.e$a */
    public static final class C21161a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C21160e<T> f54607a;

        public C21161a(C21160e<T> eVar) {
            this.f54607a = eVar;
        }

        public void onReceive(@C12579k Context context, @C12579k Intent intent) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
            this.f54607a.mo63310l(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21160e(@C12579k Context context, @C12579k C21345b bVar) {
        super(context, bVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
    }

    /* renamed from: i */
    public void mo63314i() {
        C21377l e = C21377l.m98582e();
        String a = C21162f.f54608a;
        e.mo63774a(a, getClass().getSimpleName() + ": registering receiver");
        mo63319d().registerReceiver(this.f54606f, mo63309k());
    }

    /* renamed from: j */
    public void mo63315j() {
        C21377l e = C21377l.m98582e();
        String a = C21162f.f54608a;
        e.mo63774a(a, getClass().getSimpleName() + ": unregistering receiver");
        mo63319d().unregisterReceiver(this.f54606f);
    }

    @C12579k
    /* renamed from: k */
    public abstract IntentFilter mo63309k();

    /* renamed from: l */
    public abstract void mo63310l(@C12579k Intent intent);
}

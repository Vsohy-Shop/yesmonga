package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.C0346i;
import androidx.preference.C19965r;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.a0 */
public class C19391a0 extends Service implements C19499w {
    @C12579k

    /* renamed from: a */
    public final C19471t0 f49770a = new C19471t0(this);

    @C12579k
    public Lifecycle getLifecycle() {
        return this.f49770a.mo57665a();
    }

    @C12580l
    @C0346i
    public IBinder onBind(@C12579k Intent intent) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        this.f49770a.mo57666b();
        return null;
    }

    @C0346i
    public void onCreate() {
        this.f49770a.mo57667c();
        super.onCreate();
    }

    @C0346i
    public void onDestroy() {
        this.f49770a.mo57668d();
        super.onDestroy();
    }

    @C11395k(message = "Deprecated in Java")
    @C0346i
    public void onStart(@C12580l Intent intent, int i) {
        this.f49770a.mo57669e();
        super.onStart(intent, i);
    }

    @C0346i
    public int onStartCommand(@C12580l Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}

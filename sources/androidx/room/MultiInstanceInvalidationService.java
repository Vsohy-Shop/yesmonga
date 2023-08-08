package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.preference.C19965r;
import androidx.room.C20417z;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001e"}, mo22516d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "a", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/y;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/z$b;", "Landroidx/room/z$b;", "binder", "<init>", "()V", "room-runtime_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
@C20370u
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    public int f52271a;
    @C12579k

    /* renamed from: b */
    public final Map<Integer, String> f52272b = new LinkedHashMap();
    @C12579k

    /* renamed from: c */
    public final RemoteCallbackList<C20410y> f52273c = new C20269b(this);
    @C12579k

    /* renamed from: d */
    public final C20417z.C20419b f52274d = new C20268a(this);

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public static final class C20268a extends C20417z.C20419b {

        /* renamed from: q */
        public final /* synthetic */ MultiInstanceInvalidationService f52275q;

        public C20268a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f52275q = multiInstanceInvalidationService;
        }

        /* renamed from: G4 */
        public void mo60884G4(int i, @C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "tables");
            RemoteCallbackList<C20410y> a = this.f52275q.mo60879a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f52275q;
            synchronized (a) {
                String str = multiInstanceInvalidationService.mo60880b().get(Integer.valueOf(i));
                if (str != null) {
                    int beginBroadcast = multiInstanceInvalidationService.mo60879a().beginBroadcast();
                    int i2 = 0;
                    while (i2 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.mo60879a().getBroadcastCookie(i2);
                            Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) broadcastCookie).intValue();
                            String str2 = multiInstanceInvalidationService.mo60880b().get(Integer.valueOf(intValue));
                            if (i != intValue && Intrinsics.areEqual((Object) str, (Object) str2)) {
                                try {
                                    multiInstanceInvalidationService.mo60879a().getBroadcastItem(i2).mo61107H1(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            multiInstanceInvalidationService.mo60879a().finishBroadcast();
                            throw th;
                        }
                    }
                    multiInstanceInvalidationService.mo60879a().finishBroadcast();
                    C11079d2 d2Var = C11079d2.f28267a;
                }
            }
        }

        /* renamed from: c6 */
        public int mo60885c6(@C12579k C20410y yVar, @C12580l String str) {
            Intrinsics.checkNotNullParameter(yVar, C10108c.f27778C);
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<C20410y> a = this.f52275q.mo60879a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f52275q;
            synchronized (a) {
                multiInstanceInvalidationService.mo60882d(multiInstanceInvalidationService.mo60881c() + 1);
                int c = multiInstanceInvalidationService.mo60881c();
                if (multiInstanceInvalidationService.mo60879a().register(yVar, Integer.valueOf(c))) {
                    multiInstanceInvalidationService.mo60880b().put(Integer.valueOf(c), str);
                    i = c;
                } else {
                    multiInstanceInvalidationService.mo60882d(multiInstanceInvalidationService.mo60881c() - 1);
                    multiInstanceInvalidationService.mo60881c();
                }
            }
            return i;
        }

        /* renamed from: x8 */
        public void mo60886x8(@C12579k C20410y yVar, int i) {
            Intrinsics.checkNotNullParameter(yVar, C10108c.f27778C);
            RemoteCallbackList<C20410y> a = this.f52275q.mo60879a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f52275q;
            synchronized (a) {
                multiInstanceInvalidationService.mo60879a().unregister(yVar);
                String remove = multiInstanceInvalidationService.mo60880b().remove(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public static final class C20269b extends RemoteCallbackList<C20410y> {

        /* renamed from: a */
        public final /* synthetic */ MultiInstanceInvalidationService f52276a;

        public C20269b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f52276a = multiInstanceInvalidationService;
        }

        /* renamed from: a */
        public void onCallbackDied(@C12579k C20410y yVar, @C12579k Object obj) {
            Intrinsics.checkNotNullParameter(yVar, C10108c.f27778C);
            Intrinsics.checkNotNullParameter(obj, "cookie");
            this.f52276a.mo60880b().remove((Integer) obj);
        }
    }

    @C12579k
    /* renamed from: a */
    public final RemoteCallbackList<C20410y> mo60879a() {
        return this.f52273c;
    }

    @C12579k
    /* renamed from: b */
    public final Map<Integer, String> mo60880b() {
        return this.f52272b;
    }

    /* renamed from: c */
    public final int mo60881c() {
        return this.f52271a;
    }

    /* renamed from: d */
    public final void mo60882d(int i) {
        this.f52271a = i;
    }

    @C12579k
    public IBinder onBind(@C12579k Intent intent) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        return this.f52274d;
    }
}

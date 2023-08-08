package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.camera.core.impl.i0 */
public final class C1461i0 {

    /* renamed from: androidx.camera.core.impl.i0$a */
    public class C1462a implements C1544c<List<Surface>> {

        /* renamed from: a */
        public final /* synthetic */ boolean f4217a;

        /* renamed from: b */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f4218b;

        /* renamed from: c */
        public final /* synthetic */ ScheduledFuture f4219c;

        public C1462a(boolean z, CallbackToFutureAdapter.C16559a aVar, ScheduledFuture scheduledFuture) {
            this.f4217a = z;
            this.f4218b = aVar;
            this.f4219c = scheduledFuture;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            this.f4218b.mo48125c(Collections.unmodifiableList(Collections.emptyList()));
            this.f4219c.cancel(true);
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f4217a) {
                arrayList.removeAll(Collections.singleton((Object) null));
            }
            this.f4218b.mo48125c(arrayList);
            this.f4219c.cancel(true);
        }
    }

    /* renamed from: e */
    public static void m6126e(@C0359n0 List<DeferrableSurface> list) {
        for (DeferrableSurface d : list) {
            d.mo5137d();
        }
    }

    /* renamed from: f */
    public static void m6127f(@C0359n0 List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).mo5141h();
                    i++;
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).mo5137d();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m6128g(C32487a aVar, CallbackToFutureAdapter.C16559a aVar2, long j) {
        if (!aVar.isDone()) {
            aVar2.mo48128f(new TimeoutException("Cannot complete surfaceList within " + j));
            aVar.cancel(true);
        }
    }

    /* renamed from: j */
    public static /* synthetic */ Object m6131j(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, boolean z, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        C32487a n = C1548f.m6485n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new C1449f0(executor, n, aVar, j), j, TimeUnit.MILLISECONDS);
        aVar.mo48123a(new C1454g0(n), executor);
        C1548f.m6473b(n, new C1462a(z, aVar, schedule), executor);
        return "surfaceList";
    }

    @C0359n0
    /* renamed from: k */
    public static C32487a<List<Surface>> m6132k(@C0359n0 Collection<DeferrableSurface> collection, boolean z, long j, @C0359n0 Executor executor, @C0359n0 ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface e : collection) {
            arrayList.add(e.mo5138e());
        }
        return CallbackToFutureAdapter.m74987a(new C1458h0(arrayList, scheduledExecutorService, executor, j, z));
    }

    /* renamed from: l */
    public static boolean m6133l(@C0359n0 List<DeferrableSurface> list) {
        try {
            m6127f(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}

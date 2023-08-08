package androidx.camera.view;

import androidx.camera.core.C1641m;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* renamed from: androidx.camera.view.m */
public final /* synthetic */ class C1807m implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ C1808n f4965a;

    /* renamed from: b */
    public final /* synthetic */ C1641m f4966b;

    /* renamed from: c */
    public final /* synthetic */ List f4967c;

    public /* synthetic */ C1807m(C1808n nVar, C1641m mVar, List list) {
        this.f4965a = nVar;
        this.f4966b = mVar;
        this.f4967c = list;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4965a.m7213i(this.f4966b, this.f4967c, aVar);
    }
}

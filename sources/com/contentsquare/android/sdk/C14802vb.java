package com.contentsquare.android.sdk;

import android.content.Context;
import android.util.LongSparseArray;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.vb */
public final class C14802vb {

    /* renamed from: a */
    public final Context f36697a;

    /* renamed from: b */
    public final C14621pd f36698b;

    public C14802vb(Context context, C14621pd pdVar) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(pdVar, "replayStorageManager");
        this.f36697a = context;
        this.f36698b = pdVar;
    }

    /* renamed from: a */
    public final LongSparseArray<C14754tf> mo36636a() {
        LongSparseArray<C14754tf> longSparseArray = new LongSparseArray<>();
        List<Long> f = this.f36698b.mo36171f();
        Intrinsics.checkNotNullExpressionValue(f, "replayStorageManager.storedFileIds");
        for (Long l : f) {
            Intrinsics.checkNotNullExpressionValue(l, "id");
            longSparseArray.append(l.longValue(), this.f36698b.mo36170e(l.longValue()));
        }
        return longSparseArray;
    }

    /* renamed from: b */
    public final void mo36637b(long j) {
        this.f36698b.mo36167b(j);
    }

    /* renamed from: c */
    public final void mo36638c(C14430id idVar) {
        Intrinsics.checkNotNullParameter(idVar, "eventBatch");
        C14273da a = idVar.mo35548a(this.f36697a);
        this.f36698b.mo36168c(new C14754tf(a.mo34915b(), a.mo34914a()));
        this.f36698b.mo36166a();
    }

    /* renamed from: d */
    public final void mo36639d(List<? extends C14430id> list) {
        Intrinsics.checkNotNullParameter(list, "eventBatches");
        for (C14430id c : list) {
            mo36638c(c);
        }
    }
}

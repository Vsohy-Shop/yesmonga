package com.carrefour.fid.android.checkout.data.datastore.datasources;

import android.content.Context;
import androidx.datastore.core.C18570d;
import com.carrefour.fid.android.SlotItem;
import com.carrefour.fid.android.checkout.data.datastore.protoserializer.C39840a;
import com.carrefour.fid.android.shared.data.datastore.proto.C28635b;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SlotDataStoreSource implements C28635b<SlotItem> {
    @C12579k

    /* renamed from: a */
    public final Context f101603a;

    @Inject
    public SlotDataStoreSource(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f101603a = context;
    }

    @C12579k
    /* renamed from: a */
    public C18570d<SlotItem> mo31121a() {
        return C39840a.f101605a.mo131394d(this.f101603a);
    }

    @C12580l
    /* renamed from: b */
    public Object mo31122b(@C12579k C11045c<? super C11907e<SlotItem>> cVar) {
        return mo31121a().getData();
    }

    @C12580l
    public Object clear(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo31121a().mo53543a(new SlotDataStoreSource$clear$2((C11045c<? super SlotDataStoreSource$clear$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: d */
    public Object mo31123c(@C12579k SlotItem slotItem, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo31121a().mo53543a(new SlotDataStoreSource$addOrReplace$2(slotItem, (C11045c<? super SlotDataStoreSource$addOrReplace$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: e */
    public final Context mo131389e() {
        return this.f101603a;
    }
}

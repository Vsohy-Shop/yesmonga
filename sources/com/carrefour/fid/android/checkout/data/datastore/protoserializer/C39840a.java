package com.carrefour.fid.android.checkout.data.datastore.protoserializer;

import android.content.Context;
import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.C18577i;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.handlers.C18576b;
import com.carrefour.fid.android.SlotItem;
import com.carrefour.fid.android.shared.data.datastore.proto.C28638e;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.checkout.data.datastore.protoserializer.a */
public final class C39840a implements C18577i<SlotItem> {
    @C12579k

    /* renamed from: a */
    public static final C39840a f101605a;

    /* renamed from: b */
    public static final /* synthetic */ C11510n<Object>[] f101606b = {C11342l0.m43565v(new PropertyReference2Impl(C39840a.class, "slotDataStore", "getSlotDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    @C12579k

    /* renamed from: c */
    public static final C11427e f101607c;

    static {
        C39840a aVar = new C39840a();
        f101605a = aVar;
        f101607c = DataStoreDelegateKt.m83990b(C28638e.f70224b, aVar, (C18576b) null, (C11300l) null, (C12074o0) null, 28, (Object) null);
    }

    @C12580l
    /* renamed from: b */
    public Object mo31157b(@C12579k InputStream inputStream, @C12579k C11045c<? super SlotItem> cVar) {
        try {
            SlotItem parseFrom = SlotItem.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @C12579k
    /* renamed from: c */
    public SlotItem getDefaultValue() {
        SlotItem defaultInstance = SlotItem.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        return defaultInstance;
    }

    @C12579k
    /* renamed from: d */
    public final C18570d<SlotItem> mo131394d(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (C18570d) f101607c.mo22938a(context, f101606b[0]);
    }

    @C12580l
    /* renamed from: e */
    public Object mo31156a(@C12579k SlotItem slotItem, @C12579k OutputStream outputStream, @C12579k C11045c<? super C11079d2> cVar) {
        slotItem.writeTo(outputStream);
        return C11079d2.f28267a;
    }
}

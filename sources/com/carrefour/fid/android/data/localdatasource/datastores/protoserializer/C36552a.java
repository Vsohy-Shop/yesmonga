package com.carrefour.fid.android.data.localdatasource.datastores.protoserializer;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.C18577i;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.handlers.C18576b;
import com.carrefour.fid.android.MemoItemList;
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

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.localdatasource.datastores.protoserializer.a */
public final class C36552a implements C18577i<MemoItemList> {
    @C12579k

    /* renamed from: a */
    public static final C36552a f90266a;

    /* renamed from: b */
    public static final /* synthetic */ C11510n<Object>[] f90267b = {C11342l0.m43565v(new PropertyReference2Impl(C36552a.class, "memosDataStore", "getMemosDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    @C12579k

    /* renamed from: c */
    public static final C11427e f90268c;

    /* renamed from: d */
    public static final int f90269d = 8;

    static {
        C36552a aVar = new C36552a();
        f90266a = aVar;
        f90268c = DataStoreDelegateKt.m83990b(C28638e.f70223a, aVar, (C18576b) null, (C11300l) null, (C12074o0) null, 28, (Object) null);
    }

    @C12580l
    /* renamed from: b */
    public Object mo31157b(@C12579k InputStream inputStream, @C12579k C11045c<? super MemoItemList> cVar) {
        try {
            MemoItemList parseFrom = MemoItemList.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @C12579k
    /* renamed from: c */
    public MemoItemList getDefaultValue() {
        MemoItemList defaultInstance = MemoItemList.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        return defaultInstance;
    }

    @C12579k
    /* renamed from: d */
    public final C18570d<MemoItemList> mo111398d(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (C18570d) f90268c.mo22938a(context, f90267b[0]);
    }

    @C12580l
    /* renamed from: e */
    public Object mo31156a(@C12579k MemoItemList memoItemList, @C12579k OutputStream outputStream, @C12579k C11045c<? super C11079d2> cVar) {
        memoItemList.writeTo(outputStream);
        return C11079d2.f28267a;
    }
}

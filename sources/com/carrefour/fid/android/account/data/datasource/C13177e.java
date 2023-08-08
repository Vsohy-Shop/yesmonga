package com.carrefour.fid.android.account.data.datasource;

import android.content.Context;
import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.C18577i;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.handlers.C18576b;
import com.carrefour.fid.android.UserInfo;
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

/* renamed from: com.carrefour.fid.android.account.data.datasource.e */
public final class C13177e implements C18577i<UserInfo> {
    @C12579k

    /* renamed from: a */
    public static final C13177e f32357a;

    /* renamed from: b */
    public static final /* synthetic */ C11510n<Object>[] f32358b = {C11342l0.m43565v(new PropertyReference2Impl(C13177e.class, "userDataStore", "getUserDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    @C12579k

    /* renamed from: c */
    public static final C11427e f32359c;

    static {
        C13177e eVar = new C13177e();
        f32357a = eVar;
        f32359c = DataStoreDelegateKt.m83990b(C28638e.f70225c, eVar, (C18576b) null, (C11300l) null, (C12074o0) null, 28, (Object) null);
    }

    @C12580l
    /* renamed from: b */
    public Object mo31157b(@C12579k InputStream inputStream, @C12579k C11045c<? super UserInfo> cVar) {
        try {
            UserInfo parseFrom = UserInfo.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @C12579k
    /* renamed from: c */
    public UserInfo getDefaultValue() {
        UserInfo defaultInstance = UserInfo.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        return defaultInstance;
    }

    @C12579k
    /* renamed from: d */
    public final C18570d<UserInfo> mo31159d(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (C18570d) f32359c.mo22938a(context, f32358b[0]);
    }

    @C12580l
    /* renamed from: e */
    public Object mo31156a(@C12579k UserInfo userInfo, @C12579k OutputStream outputStream, @C12579k C11045c<? super C11079d2> cVar) {
        userInfo.writeTo(outputStream);
        return C11079d2.f28267a;
    }
}

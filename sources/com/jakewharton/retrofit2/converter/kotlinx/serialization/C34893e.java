package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12195a;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12425k;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.C12442r;
import kotlinx.serialization.C12445u;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.jakewharton.retrofit2.converter.kotlinx.serialization.e */
public abstract class C34893e {

    /* renamed from: com.jakewharton.retrofit2.converter.kotlinx.serialization.e$a */
    public static final class C34894a extends C34893e {
        @C12579k

        /* renamed from: a */
        public final C12195a f84810a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34894a(@C12579k C12195a aVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(aVar, "format");
            this.f84810a = aVar;
        }

        /* renamed from: a */
        public <T> T mo103256a(@C12579k C12199c<T> cVar, @C12579k ResponseBody responseBody) {
            Intrinsics.checkNotNullParameter(cVar, "loader");
            Intrinsics.checkNotNullParameter(responseBody, "body");
            byte[] bytes = responseBody.bytes();
            Intrinsics.checkNotNullExpressionValue(bytes, "body.bytes()");
            return mo103257b().mo24817e(cVar, bytes);
        }

        @C12579k
        /* renamed from: e */
        public <T> RequestBody mo103259e(@C12579k MediaType mediaType, @C12579k C12440p<? super T> pVar, T t) {
            Intrinsics.checkNotNullParameter(mediaType, "contentType");
            Intrinsics.checkNotNullParameter(pVar, "saver");
            RequestBody create = RequestBody.create(mediaType, mo103257b().mo24816c(pVar, t));
            Intrinsics.checkNotNullExpressionValue(create, "RequestBody.create(contentType, bytes)");
            return create;
        }

        @C12579k
        /* renamed from: f */
        public C12195a mo103257b() {
            return this.f84810a;
        }
    }

    /* renamed from: com.jakewharton.retrofit2.converter.kotlinx.serialization.e$b */
    public static final class C34895b extends C34893e {
        @C12579k

        /* renamed from: a */
        public final C12445u f84811a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34895b(@C12579k C12445u uVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(uVar, "format");
            this.f84811a = uVar;
        }

        /* renamed from: a */
        public <T> T mo103256a(@C12579k C12199c<T> cVar, @C12579k ResponseBody responseBody) {
            Intrinsics.checkNotNullParameter(cVar, "loader");
            Intrinsics.checkNotNullParameter(responseBody, "body");
            String string = responseBody.string();
            Intrinsics.checkNotNullExpressionValue(string, "body.string()");
            return mo103257b().mo25278b(cVar, string);
        }

        @C12579k
        /* renamed from: e */
        public <T> RequestBody mo103259e(@C12579k MediaType mediaType, @C12579k C12440p<? super T> pVar, T t) {
            Intrinsics.checkNotNullParameter(mediaType, "contentType");
            Intrinsics.checkNotNullParameter(pVar, "saver");
            RequestBody create = RequestBody.create(mediaType, mo103257b().mo25279d(pVar, t));
            Intrinsics.checkNotNullExpressionValue(create, "RequestBody.create(contentType, string)");
            return create;
        }

        @C12579k
        /* renamed from: f */
        public C12445u mo103257b() {
            return this.f84811a;
        }
    }

    public C34893e() {
    }

    /* renamed from: c */
    public static /* synthetic */ void m142611c() {
    }

    /* renamed from: a */
    public abstract <T> T mo103256a(@C12579k C12199c<T> cVar, @C12579k ResponseBody responseBody);

    @C12579k
    /* renamed from: b */
    public abstract C12425k mo103257b();

    @C12200d
    @C12579k
    /* renamed from: d */
    public final C12248g<Object> mo103258d(@C12579k Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return C12442r.m50316g(mo103257b().mo25277a(), type);
    }

    @C12579k
    /* renamed from: e */
    public abstract <T> RequestBody mo103259e(@C12579k MediaType mediaType, @C12579k C12440p<? super T> pVar, T t);

    public /* synthetic */ C34893e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

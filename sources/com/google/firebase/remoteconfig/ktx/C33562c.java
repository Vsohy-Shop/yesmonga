package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.C33033f;
import com.google.firebase.ktx.C33135b;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.C33563l;
import com.google.firebase.remoteconfig.C33565n;
import com.google.firebase.remoteconfig.C33568o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.google.firebase.remoteconfig.ktx.c */
public final class C33562c {
    @C12579k

    /* renamed from: a */
    public static final String f81679a = "fire-cfg-ktx";

    @C12579k
    /* renamed from: a */
    public static final C33568o m135248a(@C12579k C33563l lVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        C33568o x = lVar.mo97405x(str);
        Intrinsics.checkNotNullExpressionValue(x, "this.getValue(key)");
        return x;
    }

    @C12579k
    /* renamed from: b */
    public static final C33563l m135249b(@C12579k C33135b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        C33563l s = C33563l.m135269s();
        Intrinsics.checkNotNullExpressionValue(s, "getInstance()");
        return s;
    }

    @C12579k
    /* renamed from: c */
    public static final C33563l m135250c(@C12579k C33135b bVar, @C12579k C33033f fVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, FirebaseMessaging.f80405r);
        C33563l t = C33563l.m135270t(fVar);
        Intrinsics.checkNotNullExpressionValue(t, "getInstance(app)");
        return t;
    }

    @C12579k
    /* renamed from: d */
    public static final C33565n m135251d(@C12579k C11300l<? super C33565n.C33567b, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        C33565n.C33567b bVar = new C33565n.C33567b();
        lVar.invoke(bVar);
        C33565n c = bVar.mo97409c();
        Intrinsics.checkNotNullExpressionValue(c, "builder.build()");
        return c;
    }
}

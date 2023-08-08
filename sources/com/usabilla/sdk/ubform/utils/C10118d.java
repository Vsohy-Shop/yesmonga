package com.usabilla.sdk.ubform.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.utils.d */
public interface C10118d {

    /* renamed from: com.usabilla.sdk.ubform.utils.d$a */
    public static final class C10119a {
        @C12579k
        /* renamed from: a */
        public static CoroutineDispatcher m38290a(@C12579k C10118d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "this");
            return C11768d1.m46779a();
        }

        @C12579k
        /* renamed from: b */
        public static CoroutineDispatcher m38291b(@C12579k C10118d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "this");
            return C11768d1.m46781c();
        }

        @C12579k
        /* renamed from: c */
        public static CoroutineDispatcher m38292c(@C12579k C10118d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "this");
            return C11768d1.m46783e();
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineDispatcher m38293d(@C12579k C10118d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "this");
            return C11768d1.m46785g();
        }
    }

    @C12579k
    /* renamed from: a */
    CoroutineDispatcher mo21561a();

    @C12579k
    /* renamed from: b */
    CoroutineDispatcher mo21562b();

    @C12579k
    /* renamed from: c */
    CoroutineDispatcher mo21563c();

    @C12579k
    /* renamed from: d */
    CoroutineDispatcher mo21564d();
}

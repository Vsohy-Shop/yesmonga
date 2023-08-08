package com.chuckerteam.chucker.api;

import android.content.Context;
import android.content.Intent;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.chuckerteam.chucker.api.a */
public final class C22868a {
    @C12579k

    /* renamed from: a */
    public static final C22868a f58447a = new C22868a();

    /* renamed from: b */
    public static final int f58448b = 1;

    /* renamed from: c */
    public static final int f58449c = 2;

    /* renamed from: d */
    public static final boolean f58450d = false;

    @C11384m
    /* renamed from: a */
    public static final void m103144a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C11384m
    /* renamed from: b */
    public static final void m103145b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C12579k
    @C11384m
    /* renamed from: c */
    public static final Intent m103146c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return new Intent();
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "This fun will be removed in 4.x release", replaceWith = @C11587t0(expression = "Chucker.getLaunchIntent(context)", imports = {}))
    @C12579k
    @C11384m
    /* renamed from: d */
    public static final Intent m103147d(@C12579k Context context, int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return new Intent();
    }

    @C11395k(message = "This variable will be removed in 4.x release")
    /* renamed from: e */
    public static /* synthetic */ void m103148e() {
    }

    @C11395k(message = "This variable will be removed in 4.x release")
    /* renamed from: f */
    public static /* synthetic */ void m103149f() {
    }

    /* renamed from: h */
    public static /* synthetic */ void m103150h() {
    }

    @C11384m
    /* renamed from: i */
    public static final void m103151i(@C12579k C22869b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "collector");
    }

    /* renamed from: g */
    public final boolean mo67323g() {
        return f58450d;
    }
}

package com.carrefour.fid.android.design.components.utils;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.internal.C40852x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.utils.l */
public final class C37145l implements C37141h {
    @C12579k

    /* renamed from: c */
    public static final C37146a f92982c = new C37146a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final long f92983d = 2000;
    @C12579k

    /* renamed from: a */
    public C37133a f92984a = new C37133a();
    @C12579k

    /* renamed from: b */
    public final Handler f92985b = new Handler(Looper.getMainLooper());

    /* renamed from: com.carrefour.fid.android.design.components.utils.l$a */
    public static final class C37146a {
        public /* synthetic */ C37146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C37146a() {
        }
    }

    /* renamed from: d */
    public static final void m152221d(C37145l lVar, View.OnClickListener onClickListener, View view, View view2) {
        Intrinsics.checkNotNullParameter(lVar, "this$0");
        Intrinsics.checkNotNullParameter(onClickListener, "$listener");
        Intrinsics.checkNotNullParameter(view, "$this_setLoadingDebouncedClickListener");
        if (lVar.getDebouncerState().mo112753d() == DebouncerValue.DISABLED) {
            onClickListener.onClick(view);
        }
        lVar.getDebouncerState().mo112752c();
    }

    /* renamed from: e */
    public static final void m152222e(C37145l lVar, View.OnClickListener onClickListener, View view, View view2) {
        Intrinsics.checkNotNullParameter(lVar, "this$0");
        Intrinsics.checkNotNullParameter(onClickListener, "$listener");
        Intrinsics.checkNotNullParameter(view, "$this_setTimeoutDebouncedClickListener");
        if (lVar.getDebouncerState().mo112753d() == DebouncerValue.DISABLED) {
            onClickListener.onClick(view);
            lVar.f92985b.postDelayed(new C37144k(lVar), 2000);
        }
        lVar.getDebouncerState().mo112752c();
    }

    /* renamed from: f */
    public static final void m152223f(C37145l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "this$0");
        C37133a.m152202b(lVar.getDebouncerState(), false, 1, (Object) null);
    }

    @C12579k
    public C37133a getDebouncerState() {
        return this.f92984a;
    }

    public void setDebouncerState(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f92984a = aVar;
    }

    public void setLoadingDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        view.setOnClickListener(new C37143j(this, onClickListener, view));
    }

    public void setTimeoutDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        view.setOnClickListener(new C37142i(this, onClickListener, view));
    }
}

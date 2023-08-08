package com.carrefour.fid.android.shared.extension;

import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNestedScrollView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollView.kt\ncom/carrefour/fid/android/shared/extension/NestedScrollViewKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,49:1\n314#2,11:50\n*S KotlinDebug\n*F\n+ 1 NestedScrollView.kt\ncom/carrefour/fid/android/shared/extension/NestedScrollViewKt\n*L\n12#1:50,11\n*E\n"})
public final class NestedScrollViewKt {

    /* renamed from: com.carrefour.fid.android.shared.extension.NestedScrollViewKt$a */
    public static final class C28723a implements NestedScrollView.C18456c {

        /* renamed from: a */
        public final /* synthetic */ C12072o<C11079d2> f70373a;

        /* renamed from: b */
        public final /* synthetic */ NestedScrollView f70374b;

        public C28723a(C12072o<? super C11079d2> oVar, NestedScrollView nestedScrollView) {
            this.f70373a = oVar;
            this.f70374b = nestedScrollView;
        }

        /* renamed from: a */
        public final void mo1055a(@C12579k NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(nestedScrollView, "<anonymous parameter 0>");
            if (i2 > i4 || this.f70373a.mo24539j()) {
                C12072o.C12073a.m48184a(this.f70373a, (Throwable) null, 1, (Object) null);
                return;
            }
            this.f70374b.setOnScrollChangeListener((NestedScrollView.C18456c) null);
            C12072o<C11079d2> oVar = this.f70373a;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m118857b(@org.jetbrains.annotations.C12579k androidx.core.widget.NestedScrollView r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            boolean r0 = r6 instanceof com.carrefour.fid.android.shared.extension.NestedScrollViewKt$awaitScrollEnd$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.shared.extension.NestedScrollViewKt$awaitScrollEnd$1 r0 = (com.carrefour.fid.android.shared.extension.NestedScrollViewKt$awaitScrollEnd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.shared.extension.NestedScrollViewKt$awaitScrollEnd$1 r0 = new com.carrefour.fid.android.shared.extension.NestedScrollViewKt$awaitScrollEnd$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r5 = r0.L$0
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            kotlin.C11661u0.m45747n(r6)
            goto L_0x007e
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            java.lang.Object r5 = r0.L$0
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004e
        L_0x0040:
            kotlin.C11661u0.m45747n(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = com.carrefour.fid.android.shared.extension.ViewKt.m118995h(r5, r0)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0.L$0 = r5
            r0.label = r3
            kotlinx.coroutines.p r6 = new kotlinx.coroutines.p
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)
            r6.<init>(r2, r4)
            r6.mo24537e0()
            com.carrefour.fid.android.shared.extension.NestedScrollViewKt$awaitScrollEnd$2$1 r2 = new com.carrefour.fid.android.shared.extension.NestedScrollViewKt$awaitScrollEnd$2$1
            r2.<init>(r5, r6)
            r6.mo24529C(r2)
            com.carrefour.fid.android.shared.extension.NestedScrollViewKt$a r2 = new com.carrefour.fid.android.shared.extension.NestedScrollViewKt$a
            r2.<init>(r6, r5)
            r5.setOnScrollChangeListener(r2)
            java.lang.Object r5 = r6.mo24572y()
            java.lang.Object r6 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r5 != r6) goto L_0x007b
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)
        L_0x007b:
            if (r5 != r1) goto L_0x007e
            return r1
        L_0x007e:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.NestedScrollViewKt.m118857b(androidx.core.widget.NestedScrollView, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: c */
    public static final boolean m118858c(@C12579k NestedScrollView nestedScrollView, @C12579k View view) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "<this>");
        Intrinsics.checkNotNullParameter(view, "child");
        Rect rect = new Rect();
        nestedScrollView.getHitRect(rect);
        if (!view.getLocalVisibleRect(rect) || rect.height() < view.getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final void m118859d(@C12579k NestedScrollView nestedScrollView, @C12579k View view, @C12579k C11300l<? super Rect, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "<this>");
        Intrinsics.checkNotNullParameter(view, "child");
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        Rect rect = new Rect();
        nestedScrollView.getHitRect(rect);
        nestedScrollView.setOnScrollChangeListener(new C28754f0(view, rect, nestedScrollView, lVar));
    }

    /* renamed from: e */
    public static final void m118860e(View view, Rect rect, NestedScrollView nestedScrollView, C11300l lVar, NestedScrollView nestedScrollView2, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "$child");
        Intrinsics.checkNotNullParameter(rect, "$scrollBounds");
        Intrinsics.checkNotNullParameter(nestedScrollView, "$this_setChildVisibilityListener");
        Intrinsics.checkNotNullParameter(lVar, "$callback");
        Intrinsics.checkNotNullParameter(nestedScrollView2, "<anonymous parameter 0>");
        if (view.getLocalVisibleRect(rect) && rect.height() >= view.getHeight()) {
            nestedScrollView.setOnScrollChangeListener((NestedScrollView.C18456c) null);
            lVar.invoke(rect);
        }
    }
}

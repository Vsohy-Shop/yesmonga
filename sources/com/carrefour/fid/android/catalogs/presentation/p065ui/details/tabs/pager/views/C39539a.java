package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.views;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.ortiz.touchview.TouchImageView;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.views.a */
public final class C39539a {

    @C11363r0({"SMAP\nTouchImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchImageView.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/pager/views/TouchImageViewKt$setSingleTapListener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.views.a$a */
    public static final class C39540a implements GestureDetector.OnDoubleTapListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l<MotionEvent, C11079d2> f101075a;

        public C39540a(C11300l<? super MotionEvent, C11079d2> lVar) {
            this.f101075a = lVar;
        }

        public boolean onDoubleTap(@C12579k MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "p0");
            return false;
        }

        public boolean onDoubleTapEvent(@C12579k MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "p0");
            return false;
        }

        public boolean onSingleTapConfirmed(@C12579k MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "event");
            this.f101075a.invoke(motionEvent);
            return false;
        }
    }

    /* renamed from: a */
    public static final void m161853a(@C12579k TouchImageView touchImageView, @C12579k C11300l<? super MotionEvent, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(touchImageView, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        touchImageView.setOnDoubleTapListener(new C39540a(lVar));
    }
}

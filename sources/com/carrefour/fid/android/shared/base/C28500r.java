package com.carrefour.fid.android.shared.base;

import android.view.ViewStub;
import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.base.r */
public interface C28500r {

    /* renamed from: com.carrefour.fid.android.shared.base.r$a */
    public static final class C28501a {
        /* renamed from: a */
        public static /* synthetic */ void m118419a(C28500r rVar, Integer num, Integer num2, Integer num3, Integer num4, boolean z, boolean z2, C11289a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = null;
                }
                if ((i & 2) != 0) {
                    num2 = null;
                }
                if ((i & 4) != 0) {
                    num3 = null;
                }
                if ((i & 8) != 0) {
                    num4 = null;
                }
                if ((i & 16) != 0) {
                    z = false;
                }
                if ((i & 32) != 0) {
                    z2 = false;
                }
                if ((i & 64) != 0) {
                    aVar = null;
                }
                rVar.setupEmptyView(num, num2, num3, num4, z, z2, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupEmptyView");
        }

        /* renamed from: b */
        public static /* synthetic */ void m118420b(C28500r rVar, MessageComponent.C37154a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    aVar2 = null;
                }
                if ((i & 4) != 0) {
                    aVar3 = null;
                }
                if ((i & 8) != 0) {
                    aVar4 = null;
                }
                rVar.setupMessageEmptyView(aVar, aVar2, aVar3, aVar4);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupMessageEmptyView");
        }

        /* renamed from: c */
        public static /* synthetic */ void m118421c(C28500r rVar, MessageComponent.C37154a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    aVar2 = null;
                }
                if ((i & 4) != 0) {
                    aVar3 = null;
                }
                if ((i & 8) != 0) {
                    aVar4 = null;
                }
                rVar.setupMessageErrorView(aVar, aVar2, aVar3, aVar4);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupMessageErrorView");
        }

        /* renamed from: d */
        public static /* synthetic */ void m118422d(C28500r rVar, int i, MessageComponent.C37154a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, int i2, Object obj) {
            if (obj == null) {
                rVar.setupMessageView(i, aVar, (i2 & 4) != 0 ? null : aVar2, (i2 & 8) != 0 ? null : aVar3, (i2 & 16) != 0 ? null : aVar4);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupMessageView");
        }

        /* renamed from: e */
        public static /* synthetic */ void m118423e(C28500r rVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                rVar.showMessageErrorView(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMessageErrorView");
        }
    }

    @C12580l
    ViewStub emptyLayout();

    @C12580l
    ViewStub emptyMessageLayout();

    @C12580l
    ViewStub errorMessageLayout();

    void hideEmpty();

    void hideErrorView();

    void hideLoading();

    @C12580l
    ShimmerFrameLayout loadingLayout();

    void setupEmptyView(@C0375v @C12580l Integer num, @C12580l @C0324b1 Integer num2, @C12580l @C0324b1 Integer num3, @C12580l @C0324b1 Integer num4, boolean z, boolean z2, @C12580l C11289a<C11079d2> aVar);

    void setupMessageEmptyView(@C12579k MessageComponent.C37154a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4);

    void setupMessageErrorView(@C12579k MessageComponent.C37154a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4);

    void setupMessageView(int i, @C12579k MessageComponent.C37154a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4);

    void showEmpty();

    void showLoading();

    void showMessageErrorView(boolean z);
}

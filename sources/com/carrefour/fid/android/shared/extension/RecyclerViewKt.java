package com.carrefour.fid.android.shared.extension;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.C0349j;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.C20115d0;
import androidx.recyclerview.widget.C20207r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerView.kt\ncom/carrefour/fid/android/shared/extension/RecyclerViewKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
public final class RecyclerViewKt {

    /* renamed from: a */
    public static final int f70375a = 500;

    /* renamed from: b */
    public static final float f70376b = 100.0f;

    /* renamed from: com.carrefour.fid.android.shared.extension.RecyclerViewKt$a */
    public static final class C28724a extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ C12074o0 f70377a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Integer, C11079d2> f70378b;

        public C28724a(C12074o0 o0Var, C11300l<? super Integer, C11079d2> lVar) {
            this.f70377a = o0Var;
            this.f70378b = lVar;
        }

        /* renamed from: a */
        public void mo30661a(@C12579k RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (C12079p0.m48270k(this.f70377a)) {
                this.f70378b.invoke(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.extension.RecyclerViewKt$b */
    public static final class C28725b extends C20207r {

        /* renamed from: x */
        public final /* synthetic */ int f70379x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28725b(Context context, int i) {
            super(context);
            this.f70379x = i;
        }

        /* renamed from: A */
        public int mo60651A() {
            return this.f70379x;
        }

        /* renamed from: C */
        public int mo60653C() {
            return this.f70379x;
        }

        /* renamed from: w */
        public float mo60285w(@C12580l DisplayMetrics displayMetrics) {
            return 100.0f / ((float) (displayMetrics != null ? displayMetrics.densityDpi : 500));
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.extension.RecyclerViewKt$c */
    public static final class C28726c extends RecyclerView.C20085t {

        /* renamed from: a */
        public int f70380a = -1;

        /* renamed from: b */
        public final /* synthetic */ C12074o0 f70381b;

        /* renamed from: c */
        public final /* synthetic */ C20115d0 f70382c;

        /* renamed from: d */
        public final /* synthetic */ C11300l<Integer, C11079d2> f70383d;

        public C28726c(C12074o0 o0Var, C20115d0 d0Var, C11300l<? super Integer, C11079d2> lVar) {
            this.f70381b = o0Var;
            this.f70382c = d0Var;
            this.f70383d = lVar;
        }

        /* renamed from: a */
        public void mo30661a(@C12579k RecyclerView recyclerView, int i) {
            boolean z;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (C12079p0.m48270k(this.f70381b) && i == 0) {
                int b = RecyclerViewKt.m118872k(this.f70382c, recyclerView);
                if (this.f70380a != b) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f70383d.invoke(Integer.valueOf(b));
                    this.f70380a = b;
                }
            }
        }
    }

    /* renamed from: e */
    public static final void m118866e(@C12579k RecyclerView recyclerView, @C12579k LifecycleCoroutineScope lifecycleCoroutineScope, long j) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleScope");
        lifecycleCoroutineScope.mo57477c(new RecyclerViewKt$autoScroll$1(recyclerView, j, (C11045c<? super RecyclerViewKt$autoScroll$1>) null));
    }

    @C0349j
    /* renamed from: f */
    public static final C28724a m118867f(C12074o0 o0Var, C11300l<? super Integer, C11079d2> lVar) {
        return new C28724a(o0Var, lVar);
    }

    /* renamed from: g */
    public static final int m118868g(@C12579k RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            return linearLayoutManager.mo59435y2() + 1;
        }
        return 0;
    }

    @C12580l
    /* renamed from: h */
    public static final View m118869h(@C12579k RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        try {
            return ViewGroupKt.m81807d(recyclerView, i);
        } catch (Exception e) {
            C28935i iVar = C28935i.f70940a;
            String message = e.getMessage();
            C28935i.m119706i(iVar, "Cannot get child at index " + i + ". " + message + " ", (Throwable) null, 0, 6, (Object) null);
            return null;
        }
    }

    /* renamed from: i */
    public static final C28725b m118870i(Context context, int i) {
        return new C28725b(context, i);
    }

    /* renamed from: j */
    public static /* synthetic */ C28725b m118871j(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return m118870i(context, i);
    }

    /* renamed from: k */
    public static final int m118872k(C20115d0 d0Var, RecyclerView recyclerView) {
        Integer num;
        RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
        View h = d0Var.mo60280h(layoutManager);
        if (h != null) {
            if (layoutManager != null) {
                num = Integer.valueOf(layoutManager.mo59978u0(h));
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* renamed from: l */
    public static final boolean m118873l(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        if (recyclerView.computeHorizontalScrollRange() > recyclerView.getWidth() || recyclerView.computeVerticalScrollRange() > recyclerView.getHeight()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m118874m(androidx.recyclerview.widget.RecyclerView r8, long r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            boolean r0 = r11 instanceof com.carrefour.fid.android.shared.extension.RecyclerViewKt$scrollIndefinitely$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.shared.extension.RecyclerViewKt$scrollIndefinitely$1 r0 = (com.carrefour.fid.android.shared.extension.RecyclerViewKt$scrollIndefinitely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.shared.extension.RecyclerViewKt$scrollIndefinitely$1 r0 = new com.carrefour.fid.android.shared.extension.RecyclerViewKt$scrollIndefinitely$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r11)
            goto L_0x008f
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            long r9 = r0.J$0
            java.lang.Object r8 = r0.L$0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            kotlin.C11661u0.m45747n(r11)
            goto L_0x004f
        L_0x003f:
            kotlin.C11661u0.m45747n(r11)
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.m45925b(r9, r0)
            if (r11 != r1) goto L_0x004f
            return r1
        L_0x004f:
            boolean r11 = r8.isFocusableInTouchMode()
            r2 = 0
            if (r11 != 0) goto L_0x0084
            androidx.recyclerview.widget.RecyclerView$Adapter r11 = r8.getAdapter()
            r5 = 0
            if (r11 == 0) goto L_0x0062
            int r11 = r11.getItemCount()
            goto L_0x0063
        L_0x0062:
            r11 = r5
        L_0x0063:
            if (r11 <= 0) goto L_0x0067
            int r11 = r11 - r4
            goto L_0x0068
        L_0x0067:
            r11 = r5
        L_0x0068:
            androidx.recyclerview.widget.RecyclerView$o r6 = r8.getLayoutManager()
            boolean r7 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r7 == 0) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            goto L_0x0074
        L_0x0073:
            r6 = r2
        L_0x0074:
            if (r6 == 0) goto L_0x007b
            int r6 = r6.mo59434x2()
            goto L_0x007c
        L_0x007b:
            r6 = r5
        L_0x007c:
            if (r6 != r11) goto L_0x0080
            r6 = r5
            goto L_0x0081
        L_0x0080:
            int r6 = r6 + r4
        L_0x0081:
            com.carrefour.fid.android.design.components.extension.C37114f.m152159d(r8, r6, r5, r3, r2)
        L_0x0084:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = m118874m(r8, r9, r0)
            if (r8 != r1) goto L_0x008f
            return r1
        L_0x008f:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.RecyclerViewKt.m118874m(androidx.recyclerview.widget.RecyclerView, long, kotlin.coroutines.c):java.lang.Object");
    }

    @C0349j
    @C12579k
    /* renamed from: n */
    public static final C11907e<Integer> m118875n(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        return C11909g.m47500w(new RecyclerViewKt$scrollStateChanges$1(recyclerView, (C11045c<? super RecyclerViewKt$scrollStateChanges$1>) null));
    }

    /* renamed from: o */
    public static final void m118876o(@C12579k RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            linearLayoutManager.mo59401d3(i, 0);
        }
    }

    @C12580l
    /* renamed from: p */
    public static final C11079d2 m118877p(@C12579k RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        C28725b i3 = m118870i(context, i2);
        i3.mo59709q(i);
        RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        layoutManager.mo59941g2(i3);
        return C11079d2.f28267a;
    }

    /* renamed from: q */
    public static /* synthetic */ C11079d2 m118878q(RecyclerView recyclerView, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return m118877p(recyclerView, i, i2);
    }

    @C0349j
    /* renamed from: r */
    public static final C28726c m118879r(C12074o0 o0Var, C20115d0 d0Var, C11300l<? super Integer, C11079d2> lVar) {
        return new C28726c(o0Var, d0Var, lVar);
    }

    @C0349j
    @C12579k
    /* renamed from: s */
    public static final C11907e<Integer> m118880s(@C12579k RecyclerView recyclerView, @C12579k C20115d0 d0Var) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(d0Var, "snapHelper");
        return C11909g.m47500w(new RecyclerViewKt$snapOnScrollChanges$1(d0Var, recyclerView, (C11045c<? super RecyclerViewKt$snapOnScrollChanges$1>) null));
    }
}

package com.carrefour.fid.android.design.components.widgets;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.utils.C37135b;
import com.carrefour.fid.android.design.components.utils.C37138e;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.j0 */
public final class C37248j0 extends BaseTransientBottomBar<C37248j0> {
    @C12579k

    /* renamed from: K */
    public static final C37249a f93415K = new C37249a((DefaultConstructorMarker) null);

    /* renamed from: L */
    public static final int f93416L = 8;

    /* renamed from: M */
    public static final int f93417M = -1;

    /* renamed from: N */
    public static final int f93418N = 0;

    /* renamed from: O */
    public static final int f93419O = -2;
    @C12579k

    /* renamed from: J */
    public final NotificationComponent f93420J;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.j0$a */
    public static final class C37249a {

        @C10861c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.j0$a$a */
        public @interface C37250a {
        }

        public /* synthetic */ C37249a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C37248j0 mo113415a(@C12579k View view, @C12579k NotificationComponent notificationComponent, int i) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(notificationComponent, "notificationComponent");
            ViewGroup i2 = ViewKt.m152127i(view);
            if (i2 != null) {
                C37248j0 j0Var = new C37248j0(i2, notificationComponent);
                j0Var.mo91146b0(i);
                return j0Var;
            }
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C37248j0 mo113416b(@C12579k ViewGroup viewGroup, @C12579k NotificationComponent notificationComponent, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(notificationComponent, "notificationComponent");
            C37248j0 j0Var = new C37248j0(viewGroup, notificationComponent);
            j0Var.mo91146b0(i);
            return j0Var;
        }

        public C37249a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public C37248j0(@C12579k ViewGroup viewGroup, @C12579k NotificationComponent notificationComponent) {
        super(viewGroup, notificationComponent, notificationComponent);
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(notificationComponent, "contentView");
        this.f93420J = notificationComponent;
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.f76617c;
        snackbarBaseLayout.setBackgroundColor(C17318d.m79723f(snackbarBaseLayout.getContext(), 17170445));
        Resources resources = this.f76617c.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.context.resources");
        int a = C37135b.m152206a(C37138e.m152212c(resources, C36896b.C36903g.ds_sizing_s));
        this.f76617c.setPadding(a, 0, a, a);
    }

    @C12579k
    @C11384m
    /* renamed from: q0 */
    public static final C37248j0 m152871q0(@C12579k View view, @C12579k NotificationComponent notificationComponent, int i) {
        return f93415K.mo113415a(view, notificationComponent, i);
    }

    @C12579k
    @C11384m
    /* renamed from: r0 */
    public static final C37248j0 m152872r0(@C12579k ViewGroup viewGroup, @C12579k NotificationComponent notificationComponent, int i) {
        return f93415K.mo113416b(viewGroup, notificationComponent, i);
    }

    @C12579k
    /* renamed from: o0 */
    public final C37248j0 mo113413o0(int i, int i2, int i3, int i4) {
        this.f76617c.setPadding(i, i2, i3, i4);
        return this;
    }

    @C12579k
    /* renamed from: p0 */
    public final NotificationComponent mo113414p0() {
        return this.f93420J;
    }
}

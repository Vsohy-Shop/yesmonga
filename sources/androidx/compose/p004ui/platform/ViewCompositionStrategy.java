package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.customview.poolingcontainer.C18537a;
import androidx.customview.poolingcontainer.C18538b;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy */
public interface ViewCompositionStrategy {
    @C12579k

    /* renamed from: a */
    public static final C15807a f39389a = C15807a.f39401a;

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        @C12579k

        /* renamed from: b */
        public static final DisposeOnDetachedFromWindow f39390b = new DisposeOnDetachedFromWindow();

        /* renamed from: c */
        public static final int f39391c = 0;

        /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$a */
        public static final class C15803a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f39392a;

            public C15803a(AbstractComposeView abstractComposeView) {
                this.f39392a = abstractComposeView;
            }

            public void onViewAttachedToWindow(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            }

            public void onViewDetachedFromWindow(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
                this.f39392a.mo45282g();
            }
        }

        @C12579k
        /* renamed from: a */
        public C11289a<C11079d2> mo45563a(@C12579k AbstractComposeView abstractComposeView) {
            Intrinsics.checkNotNullParameter(abstractComposeView, C40383c.f102945c);
            C15803a aVar = new C15803a(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(aVar);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(abstractComposeView, aVar);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        @C12579k

        /* renamed from: b */
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool f39393b = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        /* renamed from: c */
        public static final int f39394c = 0;

        /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$a */
        public static final class C15804a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f39395a;

            public C15804a(AbstractComposeView abstractComposeView) {
                this.f39395a = abstractComposeView;
            }

            public void onViewAttachedToWindow(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            }

            public void onViewDetachedFromWindow(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
                if (!C18537a.m83845f(this.f39395a)) {
                    this.f39395a.mo45282g();
                }
            }
        }

        /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$b */
        public static final class C15805b implements C18538b {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f39396a;

            public C15805b(AbstractComposeView abstractComposeView) {
                this.f39396a = abstractComposeView;
            }

            /* renamed from: g */
            public final void mo45568g() {
                this.f39396a.mo45282g();
            }
        }

        @C12579k
        /* renamed from: a */
        public C11289a<C11079d2> mo45563a(@C12579k AbstractComposeView abstractComposeView) {
            Intrinsics.checkNotNullParameter(abstractComposeView, C40383c.f102945c);
            C15804a aVar = new C15804a(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(aVar);
            C15805b bVar = new C15805b(abstractComposeView);
            C18537a.m83840a(abstractComposeView, bVar);
            return new C15809x11b1833b(abstractComposeView, aVar, bVar);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        @C12579k

        /* renamed from: b */
        public static final DisposeOnViewTreeLifecycleDestroyed f39397b = new DisposeOnViewTreeLifecycleDestroyed();

        /* renamed from: c */
        public static final int f39398c = 0;

        /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$a */
        public static final class C15806a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f39399a;

            /* renamed from: b */
            public final /* synthetic */ Ref.ObjectRef<C11289a<C11079d2>> f39400b;

            public C15806a(AbstractComposeView abstractComposeView, Ref.ObjectRef<C11289a<C11079d2>> objectRef) {
                this.f39399a = abstractComposeView;
                this.f39400b = objectRef;
            }

            public void onViewAttachedToWindow(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
                C19499w a = ViewTreeLifecycleOwner.m90620a(this.f39399a);
                AbstractComposeView abstractComposeView = this.f39399a;
                if (a != null) {
                    this.f39400b.element = ViewCompositionStrategy_androidKt.m71101b(abstractComposeView, a.getLifecycle());
                    this.f39399a.removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }

            public void onViewDetachedFromWindow(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            }
        }

        @C12579k
        /* renamed from: a */
        public C11289a<C11079d2> mo45563a(@C12579k AbstractComposeView abstractComposeView) {
            Intrinsics.checkNotNullParameter(abstractComposeView, C40383c.f102945c);
            if (abstractComposeView.isAttachedToWindow()) {
                C19499w a = ViewTreeLifecycleOwner.m90620a(abstractComposeView);
                if (a != null) {
                    return ViewCompositionStrategy_androidKt.m71101b(abstractComposeView, a.getLifecycle());
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C15806a aVar = new C15806a(abstractComposeView, objectRef);
            abstractComposeView.addOnAttachStateChangeListener(aVar);
            objectRef.element = new C15810x565475b(abstractComposeView, aVar);
            return new C15811x565475c(objectRef);
        }
    }

    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$a */
    public static final class C15807a {

        /* renamed from: a */
        public static final /* synthetic */ C15807a f39401a = new C15807a();

        @C12579k
        /* renamed from: a */
        public final ViewCompositionStrategy mo45571a() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.f39393b;
        }
    }

    @C12579k
    /* renamed from: a */
    C11289a<C11079d2> mo45563a(@C12579k AbstractComposeView abstractComposeView);

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$b */
    public static final class C15808b implements ViewCompositionStrategy {

        /* renamed from: c */
        public static final int f39402c = 8;
        @C12579k

        /* renamed from: b */
        public final Lifecycle f39403b;

        public C15808b(@C12579k Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f39403b = lifecycle;
        }

        @C12579k
        /* renamed from: a */
        public C11289a<C11079d2> mo45563a(@C12579k AbstractComposeView abstractComposeView) {
            Intrinsics.checkNotNullParameter(abstractComposeView, C40383c.f102945c);
            return ViewCompositionStrategy_androidKt.m71101b(abstractComposeView, this.f39403b);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C15808b(@C12579k C19499w wVar) {
            this(wVar.getLifecycle());
            Intrinsics.checkNotNullParameter(wVar, "lifecycleOwner");
        }
    }
}

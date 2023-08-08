package androidx.compose.p004ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.camera.view.C1814q;
import androidx.compose.p004ui.C8762h;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.C8567o;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12156u1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.android.C11713f;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C8762h
/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy */
public final class WindowRecomposerPolicy {
    @C12579k

    /* renamed from: a */
    public static final WindowRecomposerPolicy f39429a = new WindowRecomposerPolicy();
    @C12579k

    /* renamed from: b */
    public static final AtomicReference<C15935n4> f39430b = new AtomicReference<>(C15935n4.f39623a.mo45852a());

    /* renamed from: c */
    public static final int f39431c = 8;

    /* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$a */
    public static final class C15817a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C11723c2 f39432a;

        public C15817a(C11723c2 c2Var) {
            this.f39432a = c2Var;
        }

        public void onViewAttachedToWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
        }

        public void onViewDetachedFromWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            view.removeOnAttachStateChangeListener(this);
            C11723c2.C11724a.m46184b(this.f39432a, (CancellationException) null, 1, (Object) null);
        }
    }

    @C11532s0
    /* renamed from: a */
    public final boolean mo45594a(@C12579k C15935n4 n4Var, @C12579k C15935n4 n4Var2) {
        Intrinsics.checkNotNullParameter(n4Var, "expected");
        Intrinsics.checkNotNullParameter(n4Var2, "factory");
        return C1814q.m7242a(f39430b, n4Var, n4Var2);
    }

    @C12579k
    /* renamed from: b */
    public final Recomposer mo45595b(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "rootView");
        Recomposer a = f39430b.get().mo45851a(view);
        WindowRecomposer_androidKt.m71151j(view, a);
        C12156u1 u1Var = C12156u1.f29939a;
        Handler handler = view.getHandler();
        Intrinsics.checkNotNullExpressionValue(handler, "rootView.handler");
        view.addOnAttachStateChangeListener(new C15817a(C12038j.m48061f(u1Var, C11713f.m46120i(handler, "windowRecomposer cleanup").mo23707c0(), (CoroutineStart) null, new C15818xbfd085b3(a, view, (C11045c<? super C15818xbfd085b3>) null), 2, (Object) null)));
        return a;
    }

    @C12579k
    @C11532s0
    /* renamed from: c */
    public final C15935n4 mo45596c(@C12579k C15935n4 n4Var) {
        Intrinsics.checkNotNullParameter(n4Var, "factory");
        C15935n4 andSet = f39430b.getAndSet(n4Var);
        Intrinsics.checkNotNullExpressionValue(andSet, "factory.getAndSet(factory)");
        return andSet;
    }

    /* renamed from: d */
    public final void mo45597d(@C12579k C15935n4 n4Var) {
        Intrinsics.checkNotNullParameter(n4Var, "factory");
        f39430b.set(n4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (mo45594a(r5, r1) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        kotlin.C11414o.m43942a(r6, new java.lang.IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        throw r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R mo45598e(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.platform.C15935n4 r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<? extends R> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"
            java.lang.String r1 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            androidx.compose.ui.platform.n4 r1 = r4.mo45596c(r5)
            r2 = 1
            java.lang.Object r6 = r6.invoke()     // Catch:{ all -> 0x0028 }
            kotlin.jvm.internal.C11322b0.m43481d(r2)
            boolean r5 = r4.mo45594a(r5, r1)
            if (r5 == 0) goto L_0x0022
            kotlin.jvm.internal.C11322b0.m43480c(r2)
            return r6
        L_0x0022:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L_0x0028:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x002a }
        L_0x002a:
            r3 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r2)
            boolean r5 = r4.mo45594a(r5, r1)
            if (r5 != 0) goto L_0x003d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            kotlin.C11414o.m43942a(r6, r5)
            throw r6
        L_0x003d:
            kotlin.jvm.internal.C11322b0.m43480c(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.WindowRecomposerPolicy.mo45598e(androidx.compose.ui.platform.n4, kotlin.jvm.functions.a):java.lang.Object");
    }
}

package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.appcompat.widget.C0696c;
import androidx.window.core.SpecificationComputer;
import androidx.window.core.Version;
import androidx.window.layout.C21047i;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SidecarCompat implements C21047i {
    @C12579k

    /* renamed from: f */
    public static final C21034a f54242f = new C21034a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final String f54243g = "SidecarCompat";
    @C12580l

    /* renamed from: a */
    public final SidecarInterface f54244a;
    @C12579k

    /* renamed from: b */
    public final SidecarAdapter f54245b;
    @C12579k

    /* renamed from: c */
    public final Map<IBinder, Activity> f54246c;
    @C12579k

    /* renamed from: d */
    public final Map<Activity, ComponentCallbacks> f54247d;
    @C12580l

    /* renamed from: e */
    public C21047i.C21048a f54248e;

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo22516d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/d2;", "onDeviceStateChanged", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "Landroidx/window/layout/SidecarAdapter;", "a", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "b", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "d", "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "e", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "<init>", "(Landroidx/window/layout/SidecarAdapter;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "window_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        @C12579k

        /* renamed from: a */
        public final SidecarAdapter f54249a;
        @C12579k

        /* renamed from: b */
        public final SidecarInterface.SidecarCallback f54250b;
        @C12579k

        /* renamed from: c */
        public final ReentrantLock f54251c = new ReentrantLock();
        @C12580l
        @C0323b0("lock")

        /* renamed from: d */
        public SidecarDeviceState f54252d;
        @C0323b0("mLock")
        @C12579k

        /* renamed from: e */
        public final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f54253e = new WeakHashMap<>();

        public DistinctSidecarElementCallback(@C12579k SidecarAdapter sidecarAdapter, @C12579k SidecarInterface.SidecarCallback sidecarCallback) {
            Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
            Intrinsics.checkNotNullParameter(sidecarCallback, "callbackInterface");
            this.f54249a = sidecarAdapter;
            this.f54250b = sidecarCallback;
        }

        public void onDeviceStateChanged(@C12579k SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f54251c;
            reentrantLock.lock();
            try {
                if (!this.f54249a.mo62915a(this.f54252d, sidecarDeviceState)) {
                    this.f54252d = sidecarDeviceState;
                    this.f54250b.onDeviceStateChanged(sidecarDeviceState);
                    C11079d2 d2Var = C11079d2.f28267a;
                    reentrantLock.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@C12579k IBinder iBinder, @C12579k SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            Intrinsics.checkNotNullParameter(iBinder, "token");
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.f54251c) {
                if (!this.f54249a.mo62918d(this.f54253e.get(iBinder), sidecarWindowLayoutInfo)) {
                    SidecarWindowLayoutInfo put = this.f54253e.put(iBinder, sidecarWindowLayoutInfo);
                    this.f54250b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, mo22516d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/d2;", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a */
        public final /* synthetic */ SidecarCompat f54254a;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "this$0");
            this.f54254a = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@C12579k SidecarDeviceState sidecarDeviceState) {
            SidecarInterface h;
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "newDeviceState");
            SidecarCompat sidecarCompat = this.f54254a;
            for (Activity activity : this.f54254a.f54246c.values()) {
                IBinder a = SidecarCompat.f54242f.mo62944a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (!(a == null || (h = sidecarCompat.mo62935h()) == null)) {
                    sidecarWindowLayoutInfo = h.getWindowLayoutInfo(a);
                }
                C21047i.C21048a e = sidecarCompat.f54248e;
                if (e != null) {
                    e.mo62947a(activity, sidecarCompat.f54245b.mo62919e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@C12579k IBinder iBinder, @C12579k SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            Intrinsics.checkNotNullParameter(iBinder, "windowToken");
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f54254a.f54246c.get(iBinder);
            if (activity != null) {
                SidecarAdapter f = this.f54254a.f54245b;
                SidecarInterface h = this.f54254a.mo62935h();
                if (h == null) {
                    sidecarDeviceState = null;
                } else {
                    sidecarDeviceState = h.getDeviceState();
                }
                if (sidecarDeviceState == null) {
                    sidecarDeviceState = new SidecarDeviceState();
                }
                C21073t e = f.mo62919e(sidecarWindowLayoutInfo, sidecarDeviceState);
                C21047i.C21048a e2 = this.f54254a.f54248e;
                if (e2 != null) {
                    e2.mo62947a(activity, e);
                }
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$a */
    public static final class C21034a {
        public /* synthetic */ C21034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final IBinder mo62944a(@C12580l Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @C12580l
        /* renamed from: b */
        public final SidecarInterface mo62945b(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @C12580l
        /* renamed from: c */
        public final Version mo62946c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    return Version.f54142f.mo62761e(apiVersion);
                }
                return null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public C21034a() {
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$b */
    public static final class C21035b implements C21047i.C21048a {
        @C12579k

        /* renamed from: a */
        public final C21047i.C21048a f54255a;
        @C12579k

        /* renamed from: b */
        public final ReentrantLock f54256b = new ReentrantLock();
        @C0323b0("mLock")
        @C12579k

        /* renamed from: c */
        public final WeakHashMap<Activity, C21073t> f54257c = new WeakHashMap<>();

        public C21035b(@C12579k C21047i.C21048a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "callbackInterface");
            this.f54255a = aVar;
        }

        /* renamed from: a */
        public void mo62947a(@C12579k Activity activity, @C12579k C21073t tVar) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            Intrinsics.checkNotNullParameter(tVar, "newLayout");
            ReentrantLock reentrantLock = this.f54256b;
            reentrantLock.lock();
            try {
                if (!Intrinsics.areEqual((Object) tVar, (Object) this.f54257c.get(activity))) {
                    C21073t put = this.f54257c.put(activity, tVar);
                    reentrantLock.unlock();
                    this.f54255a.mo62947a(activity, tVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$c */
    public static final class C21036c implements View.OnAttachStateChangeListener {
        @C12579k

        /* renamed from: a */
        public final SidecarCompat f54258a;
        @C12579k

        /* renamed from: b */
        public final WeakReference<Activity> f54259b;

        public C21036c(@C12579k SidecarCompat sidecarCompat, @C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            this.f54258a = sidecarCompat;
            this.f54259b = new WeakReference<>(activity);
        }

        public void onViewAttachedToWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f54259b.get();
            IBinder a = SidecarCompat.f54242f.mo62944a(activity);
            if (activity != null && a != null) {
                this.f54258a.mo62937j(a, activity);
            }
        }

        public void onViewDetachedFromWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$d */
    public static final class C21037d implements ComponentCallbacks {

        /* renamed from: a */
        public final /* synthetic */ SidecarCompat f54260a;

        /* renamed from: b */
        public final /* synthetic */ Activity f54261b;

        public C21037d(SidecarCompat sidecarCompat, Activity activity) {
            this.f54260a = sidecarCompat;
            this.f54261b = activity;
        }

        public void onConfigurationChanged(@C12579k Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "newConfig");
            C21047i.C21048a e = this.f54260a.f54248e;
            if (e != null) {
                Activity activity = this.f54261b;
                e.mo62947a(activity, this.f54260a.mo62936i(activity));
            }
        }

        public void onLowMemory() {
        }
    }

    @C0344h1
    public SidecarCompat(@C0344h1 @C12580l SidecarInterface sidecarInterface, @C12579k SidecarAdapter sidecarAdapter) {
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.f54244a = sidecarInterface;
        this.f54245b = sidecarAdapter;
        this.f54246c = new LinkedHashMap();
        this.f54247d = new LinkedHashMap();
    }

    /* renamed from: a */
    public void mo62931a(@C12579k C21047i.C21048a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "extensionCallback");
        this.f54248e = new C21035b(aVar);
        SidecarInterface sidecarInterface = this.f54244a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f54245b, new TranslatingCallback(this)));
        }
    }

    /* renamed from: b */
    public void mo62932b(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        IBinder a = f54242f.mo62944a(activity);
        if (a != null) {
            mo62937j(a, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new C21036c(this, activity));
    }

    /* renamed from: c */
    public void mo62933c(@C12579k Activity activity) {
        boolean z;
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        IBinder a = f54242f.mo62944a(activity);
        if (a != null) {
            SidecarInterface sidecarInterface2 = this.f54244a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(a);
            }
            mo62939l(activity);
            if (this.f54246c.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f54246c.remove(a);
            if (z && (sidecarInterface = this.f54244a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:60|61|62|63|71|72|73|74|75|(4:77|(2:80|81)|79|98)(2:82|83)) */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r0v3, types: [int] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x010d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0057 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0059 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b2 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013c A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014e A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0166 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0172 A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017e A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018a A[Catch:{ NoSuchFieldError -> 0x00bb, all -> 0x0196 }] */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62934d() {
        /*
            r8 = this;
            r0 = 0
            androidx.window.sidecar.SidecarInterface r1 = r8.f54244a     // Catch:{ all -> 0x0196 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0009
        L_0x0007:
            r1 = r3
            goto L_0x001c
        L_0x0009:
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x0010
            goto L_0x0007
        L_0x0010:
            java.lang.String r4 = "setSidecarCallback"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ all -> 0x0196 }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r6 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            r5[r0] = r6     // Catch:{ all -> 0x0196 }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ all -> 0x0196 }
        L_0x001c:
            if (r1 != 0) goto L_0x0020
            r1 = r3
            goto L_0x0024
        L_0x0020:
            java.lang.Class r1 = r1.getReturnType()     // Catch:{ all -> 0x0196 }
        L_0x0024:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x0196 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x0196 }
            if (r4 == 0) goto L_0x018a
            androidx.window.sidecar.SidecarInterface r1 = r8.f54244a     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            r1.getDeviceState()     // Catch:{ all -> 0x0196 }
        L_0x0034:
            androidx.window.sidecar.SidecarInterface r1 = r8.f54244a     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r1.onDeviceStateListenersChanged(r2)     // Catch:{ all -> 0x0196 }
        L_0x003c:
            androidx.window.sidecar.SidecarInterface r1 = r8.f54244a     // Catch:{ all -> 0x0196 }
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r1 = r3
            goto L_0x0055
        L_0x0044:
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x004b
            goto L_0x0042
        L_0x004b:
            java.lang.String r5 = "getWindowLayoutInfo"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x0196 }
            r6[r0] = r4     // Catch:{ all -> 0x0196 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ all -> 0x0196 }
        L_0x0055:
            if (r1 != 0) goto L_0x0059
            r1 = r3
            goto L_0x005d
        L_0x0059:
            java.lang.Class r1 = r1.getReturnType()     // Catch:{ all -> 0x0196 }
        L_0x005d:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r5 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)     // Catch:{ all -> 0x0196 }
            if (r5 == 0) goto L_0x017e
            androidx.window.sidecar.SidecarInterface r1 = r8.f54244a     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x006b
        L_0x0069:
            r1 = r3
            goto L_0x007c
        L_0x006b:
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x0072
            goto L_0x0069
        L_0x0072:
            java.lang.String r5 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x0196 }
            r6[r0] = r4     // Catch:{ all -> 0x0196 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ all -> 0x0196 }
        L_0x007c:
            if (r1 != 0) goto L_0x0080
            r1 = r3
            goto L_0x0084
        L_0x0080:
            java.lang.Class r1 = r1.getReturnType()     // Catch:{ all -> 0x0196 }
        L_0x0084:
            java.lang.Class r5 = java.lang.Void.TYPE     // Catch:{ all -> 0x0196 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)     // Catch:{ all -> 0x0196 }
            if (r5 == 0) goto L_0x0172
            androidx.window.sidecar.SidecarInterface r1 = r8.f54244a     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x0092
        L_0x0090:
            r1 = r3
            goto L_0x00a3
        L_0x0092:
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x0099
            goto L_0x0090
        L_0x0099:
            java.lang.String r5 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x0196 }
            r6[r0] = r4     // Catch:{ all -> 0x0196 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ all -> 0x0196 }
        L_0x00a3:
            if (r1 != 0) goto L_0x00a6
            goto L_0x00aa
        L_0x00a6:
            java.lang.Class r3 = r1.getReturnType()     // Catch:{ all -> 0x0196 }
        L_0x00aa:
            java.lang.Class r1 = java.lang.Void.TYPE     // Catch:{ all -> 0x0196 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x0166
            androidx.window.sidecar.SidecarDeviceState r1 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x0196 }
            r1.<init>()     // Catch:{ all -> 0x0196 }
            r3 = 3
            r1.posture = r3     // Catch:{ NoSuchFieldError -> 0x00bb }
            goto L_0x00ee
        L_0x00bb:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "setPosture"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x0196 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0196 }
            r6[r0] = r7     // Catch:{ all -> 0x0196 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x0196 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0196 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r5[r0] = r6     // Catch:{ all -> 0x0196 }
            r4.invoke(r1, r5)     // Catch:{ all -> 0x0196 }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "getPosture"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0196 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x0196 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0196 }
            java.lang.Object r1 = r4.invoke(r1, r5)     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x015e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0196 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0196 }
            if (r1 != r3) goto L_0x0156
        L_0x00ee:
            androidx.window.sidecar.SidecarDisplayFeature r1 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x0196 }
            r1.<init>()     // Catch:{ all -> 0x0196 }
            android.graphics.Rect r3 = r1.getRect()     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = "displayFeature.rect"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch:{ all -> 0x0196 }
            r1.setRect(r3)     // Catch:{ all -> 0x0196 }
            r1.getType()     // Catch:{ all -> 0x0196 }
            r1.setType(r2)     // Catch:{ all -> 0x0196 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r3 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x0196 }
            r3.<init>()     // Catch:{ all -> 0x0196 }
            java.util.List r0 = r3.displayFeatures     // Catch:{ NoSuchFieldError -> 0x010d }
            goto L_0x0144
        L_0x010d:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0196 }
            r4.<init>()     // Catch:{ all -> 0x0196 }
            r4.add(r1)     // Catch:{ all -> 0x0196 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r1 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "setDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x0196 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r6[r0] = r7     // Catch:{ all -> 0x0196 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ all -> 0x0196 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0196 }
            r5[r0] = r4     // Catch:{ all -> 0x0196 }
            r1.invoke(r3, r5)     // Catch:{ all -> 0x0196 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r1 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "getDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0196 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ all -> 0x0196 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0196 }
            java.lang.Object r1 = r1.invoke(r3, r5)     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x014e
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0196 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x0146
        L_0x0144:
            r0 = r2
            goto L_0x0196
        L_0x0146:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "Invalid display feature getter/setter"
            r1.<init>(r2)     // Catch:{ all -> 0x0196 }
            throw r1     // Catch:{ all -> 0x0196 }
        L_0x014e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            r1.<init>(r2)     // Catch:{ all -> 0x0196 }
            throw r1     // Catch:{ all -> 0x0196 }
        L_0x0156:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "Invalid device posture getter/setter"
            r1.<init>(r2)     // Catch:{ all -> 0x0196 }
            throw r1     // Catch:{ all -> 0x0196 }
        L_0x015e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r1.<init>(r2)     // Catch:{ all -> 0x0196 }
            throw r1     // Catch:{ all -> 0x0196 }
        L_0x0166:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r3)     // Catch:{ all -> 0x0196 }
            r1.<init>(r2)     // Catch:{ all -> 0x0196 }
            throw r1     // Catch:{ all -> 0x0196 }
        L_0x0172:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0196 }
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r1)     // Catch:{ all -> 0x0196 }
            r2.<init>(r1)     // Catch:{ all -> 0x0196 }
            throw r2     // Catch:{ all -> 0x0196 }
        L_0x017e:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0196 }
            java.lang.String r3 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r1)     // Catch:{ all -> 0x0196 }
            r2.<init>(r1)     // Catch:{ all -> 0x0196 }
            throw r2     // Catch:{ all -> 0x0196 }
        L_0x018a:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0196 }
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r1)     // Catch:{ all -> 0x0196 }
            r2.<init>(r1)     // Catch:{ all -> 0x0196 }
            throw r2     // Catch:{ all -> 0x0196 }
        L_0x0196:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.mo62934d():boolean");
    }

    @C12580l
    /* renamed from: h */
    public final SidecarInterface mo62935h() {
        return this.f54244a;
    }

    @C0344h1
    @C12579k
    /* renamed from: i */
    public final C21073t mo62936i(@C12579k Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        IBinder a = f54242f.mo62944a(activity);
        if (a == null) {
            return new C21073t(CollectionsKt__CollectionsKt.m40441E());
        }
        SidecarInterface sidecarInterface = this.f54244a;
        SidecarDeviceState sidecarDeviceState = null;
        if (sidecarInterface == null) {
            sidecarWindowLayoutInfo = null;
        } else {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(a);
        }
        SidecarAdapter sidecarAdapter = this.f54245b;
        SidecarInterface sidecarInterface2 = this.f54244a;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.mo62919e(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    /* renamed from: j */
    public final void mo62937j(@C12579k IBinder iBinder, @C12579k Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(iBinder, "windowToken");
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        this.f54246c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f54244a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f54246c.size() == 1 && (sidecarInterface = this.f54244a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C21047i.C21048a aVar = this.f54248e;
        if (aVar != null) {
            aVar.mo62947a(activity, mo62936i(activity));
        }
        mo62938k(activity);
    }

    /* renamed from: k */
    public final void mo62938k(Activity activity) {
        if (this.f54247d.get(activity) == null) {
            C21037d dVar = new C21037d(this, activity);
            this.f54247d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    /* renamed from: l */
    public final void mo62939l(Activity activity) {
        activity.unregisterComponentCallbacks(this.f54247d.get(activity));
        this.f54247d.remove(activity);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@C12579k Context context) {
        this(f54242f.mo62945b(context), new SidecarAdapter((SpecificationComputer.VerificationMode) null, 1, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }
}

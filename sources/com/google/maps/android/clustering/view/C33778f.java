package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.C30456i;
import com.google.android.gms.maps.model.C30573a;
import com.google.android.gms.maps.model.C30575b;
import com.google.android.gms.maps.model.C30587h;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.badge.C31132a;
import com.google.maps.android.C33802d;
import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33763b;
import com.google.maps.android.clustering.C33764c;
import com.google.maps.android.collections.C33796d;
import com.google.maps.android.geometry.C33872b;
import com.google.maps.android.p050ui.C33890d;
import com.google.maps.android.p050ui.SquareTextView;
import com.google.maps.android.projection.C33881b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.maps.android.clustering.view.f */
public class C33778f<T extends C33763b> implements C33773a<T> {
    /* access modifiers changed from: private */
    public static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    /* access modifiers changed from: private */
    public boolean mAnimate;
    /* access modifiers changed from: private */
    public long mAnimationDurationMs;
    private C33764c.C33767c<T> mClickListener;
    /* access modifiers changed from: private */
    public final C33764c<T> mClusterManager;
    /* access modifiers changed from: private */
    public C33783e<C33750a<T>> mClusterMarkerCache = new C33783e<>((C33779a) null);
    /* access modifiers changed from: private */
    public Set<? extends C33750a<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    /* access modifiers changed from: private */
    public final Executor mExecutor = Executors.newSingleThreadExecutor();
    private final C33890d mIconGenerator;
    private SparseArray<C30573a> mIcons = new SparseArray<>();
    private C33764c.C33768d<T> mInfoWindowClickListener;
    private C33764c.C33769e<T> mInfoWindowLongClickListener;
    /* access modifiers changed from: private */
    public C33764c.C33770f<T> mItemClickListener;
    /* access modifiers changed from: private */
    public C33764c.C33771g<T> mItemInfoWindowClickListener;
    private C33764c.C33772h<T> mItemInfoWindowLongClickListener;
    /* access modifiers changed from: private */
    public final C30412c mMap;
    /* access modifiers changed from: private */
    public C33783e<T> mMarkerCache = new C33783e<>((C33779a) null);
    /* access modifiers changed from: private */
    public Set<C33785g> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private int mMinClusterSize = 4;
    private final C33778f<T>.i mViewModifier = new C33787i(this, (C33779a) null);
    /* access modifiers changed from: private */
    public float mZoom;

    /* renamed from: com.google.maps.android.clustering.view.f$a */
    public class C33779a implements C30412c.C30429q {
        public C33779a() {
        }

        /* renamed from: p0 */
        public boolean mo69449p0(@C0359n0 C30587h hVar) {
            return C33778f.this.mItemClickListener != null && C33778f.this.mItemClickListener.onClusterItemClick((C33763b) C33778f.this.mMarkerCache.mo98133b(hVar));
        }
    }

    /* renamed from: com.google.maps.android.clustering.view.f$b */
    public class C33780b implements C30412c.C30423k {
        public C33780b() {
        }

        /* renamed from: a */
        public void mo85943a(@C0359n0 C30587h hVar) {
            if (C33778f.this.mItemInfoWindowClickListener != null) {
                C33778f.this.mItemInfoWindowClickListener.mo98094a((C33763b) C33778f.this.mMarkerCache.mo98133b(hVar));
            }
        }
    }

    /* renamed from: com.google.maps.android.clustering.view.f$c */
    public class C33781c extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final C33785g f81936a;

        /* renamed from: b */
        public final C30587h f81937b;

        /* renamed from: c */
        public final LatLng f81938c;

        /* renamed from: d */
        public final LatLng f81939d;

        /* renamed from: e */
        public boolean f81940e;

        /* renamed from: f */
        public C33796d f81941f;

        public /* synthetic */ C33781c(C33778f fVar, C33785g gVar, LatLng latLng, LatLng latLng2, C33779a aVar) {
            this(gVar, latLng, latLng2);
        }

        /* renamed from: a */
        public void mo98127a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(C33778f.ANIMATION_INTERP);
            ofFloat.setDuration(C33778f.this.mAnimationDurationMs);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        /* renamed from: b */
        public void mo98128b(C33796d dVar) {
            this.f81941f = dVar;
            this.f81940e = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f81940e) {
                C33778f.this.mMarkerCache.mo98135d(this.f81937b);
                C33778f.this.mClusterMarkerCache.mo98135d(this.f81937b);
                this.f81941f.mo98158o(this.f81937b);
            }
            LatLng unused = this.f81936a.f81960b = this.f81939d;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f81939d;
            double d = latLng.f73028a;
            LatLng latLng2 = this.f81938c;
            double d2 = latLng2.f73028a;
            double d3 = (double) animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.f73029b - latLng2.f73029b;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.f81937b.mo86577u(new LatLng(d4, (d5 * d3) + this.f81938c.f73029b));
        }

        public C33781c(C33785g gVar, LatLng latLng, LatLng latLng2) {
            this.f81936a = gVar;
            this.f81937b = gVar.f81959a;
            this.f81938c = latLng;
            this.f81939d = latLng2;
        }
    }

    /* renamed from: com.google.maps.android.clustering.view.f$d */
    public class C33782d {

        /* renamed from: a */
        public final C33750a<T> f81943a;

        /* renamed from: b */
        public final Set<C33785g> f81944b;

        /* renamed from: c */
        public final LatLng f81945c;

        public C33782d(C33750a<T> aVar, Set<C33785g> set, LatLng latLng) {
            this.f81943a = aVar;
            this.f81944b = set;
            this.f81945c = latLng;
        }

        /* renamed from: b */
        public final void mo98131b(C33778f<T>.f fVar) {
            C33785g gVar;
            C33785g gVar2;
            if (!C33778f.this.shouldRenderAsCluster(this.f81943a)) {
                for (T t : this.f81943a.mo98032b()) {
                    C30587h a = C33778f.this.mMarkerCache.mo98132a(t);
                    if (a == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.f81945c;
                        if (latLng != null) {
                            markerOptions.mo86366Y1(latLng);
                        } else {
                            markerOptions.mo86366Y1(t.getPosition());
                            if (t.getZIndex() != null) {
                                markerOptions.mo86379y2(t.getZIndex().floatValue());
                            }
                        }
                        C33778f.this.onBeforeClusterItemRendered(t, markerOptions);
                        a = C33778f.this.mClusterManager.mo98072i().mo98190l(markerOptions);
                        gVar2 = new C33785g(a, (C33779a) null);
                        C33778f.this.mMarkerCache.mo98134c(t, a);
                        LatLng latLng2 = this.f81945c;
                        if (latLng2 != null) {
                            fVar.mo98137b(gVar2, latLng2, t.getPosition());
                        }
                    } else {
                        gVar2 = new C33785g(a, (C33779a) null);
                        C33778f.this.onClusterItemUpdated(t, a);
                    }
                    C33778f.this.onClusterItemRendered(t, a);
                    this.f81944b.add(gVar2);
                }
                return;
            }
            C30587h a2 = C33778f.this.mClusterMarkerCache.mo98132a(this.f81943a);
            if (a2 == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng3 = this.f81945c;
                if (latLng3 == null) {
                    latLng3 = this.f81943a.getPosition();
                }
                MarkerOptions Y1 = markerOptions2.mo86366Y1(latLng3);
                C33778f.this.onBeforeClusterRendered(this.f81943a, Y1);
                a2 = C33778f.this.mClusterManager.mo98071h().mo98190l(Y1);
                C33778f.this.mClusterMarkerCache.mo98134c(this.f81943a, a2);
                gVar = new C33785g(a2, (C33779a) null);
                LatLng latLng4 = this.f81945c;
                if (latLng4 != null) {
                    fVar.mo98137b(gVar, latLng4, this.f81943a.getPosition());
                }
            } else {
                gVar = new C33785g(a2, (C33779a) null);
                C33778f.this.onClusterUpdated(this.f81943a, a2);
            }
            C33778f.this.onClusterRendered(this.f81943a, a2);
            this.f81944b.add(gVar);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.maps.android.clustering.view.f$f */
    public class C33784f extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: j */
        public static final int f81949j = 0;

        /* renamed from: a */
        public final Lock f81950a;

        /* renamed from: b */
        public final Condition f81951b;

        /* renamed from: c */
        public Queue<C33778f<T>.d> f81952c;

        /* renamed from: d */
        public Queue<C33778f<T>.d> f81953d;

        /* renamed from: e */
        public Queue<C30587h> f81954e;

        /* renamed from: f */
        public Queue<C30587h> f81955f;

        /* renamed from: g */
        public Queue<C33778f<T>.c> f81956g;

        /* renamed from: h */
        public boolean f81957h;

        public /* synthetic */ C33784f(C33778f fVar, C33779a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo98136a(boolean z, C33778f<T>.d dVar) {
            this.f81950a.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f81953d.add(dVar);
            } else {
                this.f81952c.add(dVar);
            }
            this.f81950a.unlock();
        }

        /* renamed from: b */
        public void mo98137b(C33785g gVar, LatLng latLng, LatLng latLng2) {
            this.f81950a.lock();
            this.f81956g.add(new C33781c(C33778f.this, gVar, latLng, latLng2, (C33779a) null));
            this.f81950a.unlock();
        }

        /* renamed from: c */
        public void mo98138c(C33785g gVar, LatLng latLng, LatLng latLng2) {
            this.f81950a.lock();
            C33781c cVar = new C33781c(C33778f.this, gVar, latLng, latLng2, (C33779a) null);
            cVar.mo98128b(C33778f.this.mClusterManager.mo98073j());
            this.f81956g.add(cVar);
            this.f81950a.unlock();
        }

        /* renamed from: d */
        public boolean mo98139d() {
            boolean z;
            try {
                this.f81950a.lock();
                if (!this.f81952c.isEmpty() || !this.f81953d.isEmpty() || !this.f81955f.isEmpty() || !this.f81954e.isEmpty() || !this.f81956g.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f81950a.unlock();
            }
        }

        /* renamed from: e */
        public final void mo98140e() {
            if (!this.f81955f.isEmpty()) {
                mo98142g(this.f81955f.poll());
            } else if (!this.f81956g.isEmpty()) {
                this.f81956g.poll().mo98127a();
            } else if (!this.f81953d.isEmpty()) {
                this.f81953d.poll().mo98131b(this);
            } else if (!this.f81952c.isEmpty()) {
                this.f81952c.poll().mo98131b(this);
            } else if (!this.f81954e.isEmpty()) {
                mo98142g(this.f81954e.poll());
            }
        }

        /* renamed from: f */
        public void mo98141f(boolean z, C30587h hVar) {
            this.f81950a.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f81955f.add(hVar);
            } else {
                this.f81954e.add(hVar);
            }
            this.f81950a.unlock();
        }

        /* renamed from: g */
        public final void mo98142g(C30587h hVar) {
            C33778f.this.mMarkerCache.mo98135d(hVar);
            C33778f.this.mClusterMarkerCache.mo98135d(hVar);
            C33778f.this.mClusterManager.mo98073j().mo98158o(hVar);
        }

        /* renamed from: h */
        public void mo98143h() {
            while (mo98139d()) {
                sendEmptyMessage(0);
                this.f81950a.lock();
                try {
                    if (mo98139d()) {
                        this.f81951b.await();
                    }
                    this.f81950a.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.f81950a.unlock();
                    throw th;
                }
            }
        }

        public void handleMessage(Message message) {
            if (!this.f81957h) {
                Looper.myQueue().addIdleHandler(this);
                this.f81957h = true;
            }
            removeMessages(0);
            this.f81950a.lock();
            int i = 0;
            while (i < 10) {
                try {
                    mo98140e();
                    i++;
                } catch (Throwable th) {
                    this.f81950a.unlock();
                    throw th;
                }
            }
            if (!mo98139d()) {
                this.f81957h = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f81951b.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10);
            }
            this.f81950a.unlock();
        }

        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public C33784f() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f81950a = reentrantLock;
            this.f81951b = reentrantLock.newCondition();
            this.f81952c = new LinkedList();
            this.f81953d = new LinkedList();
            this.f81954e = new LinkedList();
            this.f81955f = new LinkedList();
            this.f81956g = new LinkedList();
        }
    }

    /* renamed from: com.google.maps.android.clustering.view.f$g */
    public static class C33785g {

        /* renamed from: a */
        public final C30587h f81959a;

        /* renamed from: b */
        public LatLng f81960b;

        public /* synthetic */ C33785g(C30587h hVar, C33779a aVar) {
            this(hVar);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C33785g) {
                return this.f81959a.equals(((C33785g) obj).f81959a);
            }
            return false;
        }

        public int hashCode() {
            return this.f81959a.hashCode();
        }

        public C33785g(C30587h hVar) {
            this.f81959a = hVar;
            this.f81960b = hVar.mo86557c();
        }
    }

    /* renamed from: com.google.maps.android.clustering.view.f$h */
    public class C33786h implements Runnable {

        /* renamed from: a */
        public final Set<? extends C33750a<T>> f81961a;

        /* renamed from: b */
        public Runnable f81962b;

        /* renamed from: c */
        public C30456i f81963c;

        /* renamed from: d */
        public C33881b f81964d;

        /* renamed from: e */
        public float f81965e;

        public /* synthetic */ C33786h(C33778f fVar, Set set, C33779a aVar) {
            this(set);
        }

        /* renamed from: a */
        public void mo98148a(Runnable runnable) {
            this.f81962b = runnable;
        }

        /* renamed from: b */
        public void mo98149b(float f) {
            this.f81965e = f;
            this.f81964d = new C33881b(Math.pow(2.0d, (double) Math.min(f, C33778f.this.mZoom)) * 256.0d);
        }

        /* renamed from: c */
        public void mo98150c(C30456i iVar) {
            this.f81963c = iVar;
        }

        @SuppressLint({"NewApi"})
        public void run() {
            boolean z;
            LatLngBounds latLngBounds;
            ArrayList arrayList;
            C33778f fVar = C33778f.this;
            if (!fVar.shouldRender(fVar.mo98109g(fVar.mClusters), C33778f.this.mo98109g(this.f81961a))) {
                this.f81962b.run();
                return;
            }
            ArrayList arrayList2 = null;
            C33784f fVar2 = new C33784f(C33778f.this, (C33779a) null);
            float f = this.f81965e;
            if (f > C33778f.this.mZoom) {
                z = true;
            } else {
                z = false;
            }
            float access$800 = f - C33778f.this.mZoom;
            Set<C33785g> access$1200 = C33778f.this.mMarkers;
            try {
                latLngBounds = this.f81963c.mo86007b().f73113e;
            } catch (Exception e) {
                e.printStackTrace();
                latLngBounds = LatLngBounds.m123046M().mo86351b(new LatLng(0.0d, 0.0d)).mo86350a();
            }
            if (C33778f.this.mClusters == null || !C33778f.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (C33750a aVar : C33778f.this.mClusters) {
                    if (C33778f.this.shouldRenderAsCluster(aVar) && latLngBounds.mo86342Q(aVar.getPosition())) {
                        arrayList.add(this.f81964d.mo98584b(aVar.getPosition()));
                    }
                }
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (C33750a aVar2 : this.f81961a) {
                boolean Q = latLngBounds.mo86342Q(aVar2.getPosition());
                if (!z || !Q || !C33778f.this.mAnimate) {
                    fVar2.mo98136a(Q, new C33782d(aVar2, newSetFromMap, (LatLng) null));
                } else {
                    C33872b access$1400 = C33778f.this.mo98108f(arrayList, this.f81964d.mo98584b(aVar2.getPosition()));
                    if (access$1400 != null) {
                        fVar2.mo98136a(true, new C33782d(aVar2, newSetFromMap, this.f81964d.mo98583a(access$1400)));
                    } else {
                        fVar2.mo98136a(true, new C33782d(aVar2, newSetFromMap, (LatLng) null));
                    }
                }
            }
            fVar2.mo98143h();
            access$1200.removeAll(newSetFromMap);
            if (C33778f.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (C33750a aVar3 : this.f81961a) {
                    if (C33778f.this.shouldRenderAsCluster(aVar3) && latLngBounds.mo86342Q(aVar3.getPosition())) {
                        arrayList2.add(this.f81964d.mo98584b(aVar3.getPosition()));
                    }
                }
            }
            for (C33785g gVar : access$1200) {
                boolean Q2 = latLngBounds.mo86342Q(gVar.f81960b);
                if (z || access$800 <= -3.0f || !Q2 || !C33778f.this.mAnimate) {
                    fVar2.mo98141f(Q2, gVar.f81959a);
                } else {
                    C33872b access$14002 = C33778f.this.mo98108f(arrayList2, this.f81964d.mo98584b(gVar.f81960b));
                    if (access$14002 != null) {
                        fVar2.mo98138c(gVar, gVar.f81960b, this.f81964d.mo98583a(access$14002));
                    } else {
                        fVar2.mo98141f(true, gVar.f81959a);
                    }
                }
            }
            fVar2.mo98143h();
            Set unused = C33778f.this.mMarkers = newSetFromMap;
            Set unused2 = C33778f.this.mClusters = this.f81961a;
            float unused3 = C33778f.this.mZoom = f;
            this.f81962b.run();
        }

        public C33786h(Set<? extends C33750a<T>> set) {
            this.f81961a = set;
        }
    }

    public C33778f(Context context, C30412c cVar, C33764c<T> cVar2) {
        this.mMap = cVar;
        this.mAnimate = true;
        this.mAnimationDurationMs = 300;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        C33890d dVar = new C33890d(context);
        this.mIconGenerator = dVar;
        dVar.mo98616l(mo98119m(context));
        dVar.mo98619o(C33802d.C33815m.amu_ClusterIcon_TextAppearance);
        dVar.mo98612h(mo98118l());
        this.mClusterManager = cVar2;
    }

    /* renamed from: e */
    public static double m135818e(C33872b bVar, C33872b bVar2) {
        double d = bVar.f82172a;
        double d2 = bVar2.f82172a;
        double d3 = (d - d2) * (d - d2);
        double d4 = bVar.f82173b;
        double d5 = bVar2.f82173b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m135819h(C30587h hVar) {
        C33764c.C33772h<T> hVar2 = this.mItemInfoWindowLongClickListener;
        if (hVar2 != null) {
            hVar2.mo98095a((C33763b) this.mMarkerCache.mo98133b(hVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ boolean m135820i(C30587h hVar) {
        C33764c.C33767c<T> cVar = this.mClickListener;
        return cVar != null && cVar.onClusterClick(this.mClusterMarkerCache.mo98133b(hVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m135821j(C30587h hVar) {
        C33764c.C33768d<T> dVar = this.mInfoWindowClickListener;
        if (dVar != null) {
            dVar.mo98092a(this.mClusterMarkerCache.mo98133b(hVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m135822k(C30587h hVar) {
        C33764c.C33769e<T> eVar = this.mInfoWindowLongClickListener;
        if (eVar != null) {
            eVar.mo98093a(this.mClusterMarkerCache.mo98133b(hVar));
        }
    }

    /* renamed from: f */
    public final C33872b mo98108f(List<C33872b> list, C33872b bVar) {
        C33872b bVar2 = null;
        if (list != null && !list.isEmpty()) {
            int k = this.mClusterManager.mo98070g().mo98045k();
            double d = (double) (k * k);
            for (C33872b next : list) {
                double e = m135818e(next, bVar);
                if (e < d) {
                    bVar2 = next;
                    d = e;
                }
            }
        }
        return bVar2;
    }

    /* renamed from: g */
    public final Set<? extends C33750a<T>> mo98109g(Set<? extends C33750a<T>> set) {
        return set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
    }

    public int getBucket(@C0359n0 C33750a<T> aVar) {
        int size = aVar.getSize();
        int i = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i2 = i + 1;
            if (size < iArr[i2]) {
                return iArr[i];
            }
            i = i2;
        }
    }

    public C33750a<T> getCluster(C30587h hVar) {
        return this.mClusterMarkerCache.mo98133b(hVar);
    }

    public T getClusterItem(C30587h hVar) {
        return (C33763b) this.mMarkerCache.mo98133b(hVar);
    }

    @C0359n0
    public String getClusterText(int i) {
        if (i < BUCKETS[0]) {
            return String.valueOf(i);
        }
        return i + C31132a.f74628J0;
    }

    @C0327c1
    public int getClusterTextAppearance(int i) {
        return C33802d.C33815m.amu_ClusterIcon_TextAppearance;
    }

    public int getColor(int i) {
        float min = 300.0f - Math.min((float) i, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    @C0359n0
    public C30573a getDescriptorForCluster(@C0359n0 C33750a<T> aVar) {
        int bucket = getBucket(aVar);
        C30573a aVar2 = this.mIcons.get(bucket);
        if (aVar2 != null) {
            return aVar2;
        }
        this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
        this.mIconGenerator.mo98619o(getClusterTextAppearance(bucket));
        C30573a d = C30575b.m123158d(this.mIconGenerator.mo98610f(getClusterText(bucket)));
        this.mIcons.put(bucket, d);
        return d;
    }

    public C30587h getMarker(T t) {
        return this.mMarkerCache.mo98132a(t);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    /* renamed from: l */
    public final LayerDrawable mo98118l() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    /* renamed from: m */
    public final SquareTextView mo98119m(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(C33802d.C33810h.amu_text);
        int i = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i, i, i, i);
        return squareTextView;
    }

    public void onAdd() {
        this.mClusterManager.mo98072i().mo98197s(new C33779a());
        this.mClusterManager.mo98072i().mo98195q(new C33780b());
        this.mClusterManager.mo98072i().mo98196r(new C33774b(this));
        this.mClusterManager.mo98071h().mo98197s(new C33775c(this));
        this.mClusterManager.mo98071h().mo98195q(new C33776d(this));
        this.mClusterManager.mo98071h().mo98196r(new C33777e(this));
    }

    public void onBeforeClusterItemRendered(@C0359n0 T t, @C0359n0 MarkerOptions markerOptions) {
        if (t.getTitle() != null && t.getSnippet() != null) {
            markerOptions.mo86373l2(t.getTitle());
            markerOptions.mo86369e2(t.getSnippet());
        } else if (t.getTitle() != null) {
            markerOptions.mo86373l2(t.getTitle());
        } else if (t.getSnippet() != null) {
            markerOptions.mo86373l2(t.getSnippet());
        }
    }

    public void onBeforeClusterRendered(@C0359n0 C33750a<T> aVar, @C0359n0 MarkerOptions markerOptions) {
        markerOptions.mo86354A1(getDescriptorForCluster(aVar));
    }

    public void onClusterItemRendered(@C0359n0 T t, @C0359n0 C30587h hVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClusterItemUpdated(@androidx.annotation.C0359n0 T r5, @androidx.annotation.C0359n0 com.google.android.gms.maps.model.C30587h r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getTitle()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r5.getSnippet()
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r5.getTitle()
            java.lang.String r3 = r6.mo86562g()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r5.getTitle()
            r6.mo86581y(r0)
            r2 = r1
        L_0x0024:
            java.lang.String r0 = r5.getSnippet()
            java.lang.String r3 = r6.mo86559e()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r5.getSnippet()
            r6.mo86579w(r0)
            goto L_0x0055
        L_0x003a:
            java.lang.String r0 = r5.getSnippet()
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r5.getSnippet()
            java.lang.String r3 = r6.mo86562g()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = r5.getSnippet()
            r6.mo86581y(r0)
        L_0x0055:
            r2 = r1
            goto L_0x0073
        L_0x0057:
            java.lang.String r0 = r5.getTitle()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r5.getTitle()
            java.lang.String r3 = r6.mo86562g()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r5.getTitle()
            r6.mo86581y(r0)
            goto L_0x0055
        L_0x0073:
            com.google.android.gms.maps.model.LatLng r0 = r6.mo86557c()
            com.google.android.gms.maps.model.LatLng r3 = r5.getPosition()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x009a
            com.google.android.gms.maps.model.LatLng r0 = r5.getPosition()
            r6.mo86577u(r0)
            java.lang.Float r0 = r5.getZIndex()
            if (r0 == 0) goto L_0x009b
            java.lang.Float r5 = r5.getZIndex()
            float r5 = r5.floatValue()
            r6.mo86553A(r5)
            goto L_0x009b
        L_0x009a:
            r1 = r2
        L_0x009b:
            if (r1 == 0) goto L_0x00a6
            boolean r5 = r6.mo86568l()
            if (r5 == 0) goto L_0x00a6
            r6.mo86554B()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.view.C33778f.onClusterItemUpdated(com.google.maps.android.clustering.b, com.google.android.gms.maps.model.h):void");
    }

    public void onClusterRendered(@C0359n0 C33750a<T> aVar, @C0359n0 C30587h hVar) {
    }

    public void onClusterUpdated(@C0359n0 C33750a<T> aVar, @C0359n0 C30587h hVar) {
        hVar.mo86575s(getDescriptorForCluster(aVar));
    }

    public void onClustersChanged(Set<? extends C33750a<T>> set) {
        this.mViewModifier.mo98152c(set);
    }

    public void onRemove() {
        this.mClusterManager.mo98072i().mo98197s((C30412c.C30429q) null);
        this.mClusterManager.mo98072i().mo98195q((C30412c.C30423k) null);
        this.mClusterManager.mo98072i().mo98196r((C30412c.C30425m) null);
        this.mClusterManager.mo98071h().mo98197s((C30412c.C30429q) null);
        this.mClusterManager.mo98071h().mo98195q((C30412c.C30423k) null);
        this.mClusterManager.mo98071h().mo98196r((C30412c.C30425m) null);
    }

    public void setAnimation(boolean z) {
        this.mAnimate = z;
    }

    public void setAnimationDuration(long j) {
        this.mAnimationDurationMs = j;
    }

    public void setMinClusterSize(int i) {
        this.mMinClusterSize = i;
    }

    public void setOnClusterClickListener(C33764c.C33767c<T> cVar) {
        this.mClickListener = cVar;
    }

    public void setOnClusterInfoWindowClickListener(C33764c.C33768d<T> dVar) {
        this.mInfoWindowClickListener = dVar;
    }

    public void setOnClusterInfoWindowLongClickListener(C33764c.C33769e<T> eVar) {
        this.mInfoWindowLongClickListener = eVar;
    }

    public void setOnClusterItemClickListener(C33764c.C33770f<T> fVar) {
        this.mItemClickListener = fVar;
    }

    public void setOnClusterItemInfoWindowClickListener(C33764c.C33771g<T> gVar) {
        this.mItemInfoWindowClickListener = gVar;
    }

    public void setOnClusterItemInfoWindowLongClickListener(C33764c.C33772h<T> hVar) {
        this.mItemInfoWindowLongClickListener = hVar;
    }

    public boolean shouldRender(@C0359n0 Set<? extends C33750a<T>> set, @C0359n0 Set<? extends C33750a<T>> set2) {
        return !set2.equals(set);
    }

    public boolean shouldRenderAsCluster(@C0359n0 C33750a<T> aVar) {
        return aVar.getSize() >= this.mMinClusterSize;
    }

    public C30587h getMarker(C33750a<T> aVar) {
        return this.mClusterMarkerCache.mo98132a(aVar);
    }

    /* renamed from: com.google.maps.android.clustering.view.f$e */
    public static class C33783e<T> {

        /* renamed from: a */
        public Map<T, C30587h> f81947a;

        /* renamed from: b */
        public Map<C30587h, T> f81948b;

        public C33783e() {
            this.f81947a = new HashMap();
            this.f81948b = new HashMap();
        }

        /* renamed from: a */
        public C30587h mo98132a(T t) {
            return this.f81947a.get(t);
        }

        /* renamed from: b */
        public T mo98133b(C30587h hVar) {
            return this.f81948b.get(hVar);
        }

        /* renamed from: c */
        public void mo98134c(T t, C30587h hVar) {
            this.f81947a.put(t, hVar);
            this.f81948b.put(hVar, t);
        }

        /* renamed from: d */
        public void mo98135d(C30587h hVar) {
            T t = this.f81948b.get(hVar);
            this.f81948b.remove(hVar);
            this.f81947a.remove(t);
        }

        public /* synthetic */ C33783e(C33779a aVar) {
            this();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.maps.android.clustering.view.f$i */
    public class C33787i extends Handler {

        /* renamed from: d */
        public static final int f81967d = 0;

        /* renamed from: e */
        public static final int f81968e = 1;

        /* renamed from: a */
        public boolean f81969a;

        /* renamed from: b */
        public C33778f<T>.h f81970b;

        public C33787i() {
            this.f81969a = false;
            this.f81970b = null;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m135852b() {
            sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void mo98152c(Set<? extends C33750a<T>> set) {
            synchronized (this) {
                this.f81970b = new C33786h(C33778f.this, set, (C33779a) null);
            }
            sendEmptyMessage(0);
        }

        public void handleMessage(Message message) {
            C33778f<T>.h hVar;
            if (message.what == 1) {
                this.f81969a = false;
                if (this.f81970b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (!this.f81969a && this.f81970b != null) {
                C30456i q = C33778f.this.mMap.mo85922q();
                synchronized (this) {
                    hVar = this.f81970b;
                    this.f81970b = null;
                    this.f81969a = true;
                }
                hVar.mo98148a(new C33788g(this));
                hVar.mo98150c(q);
                hVar.mo98149b(C33778f.this.mMap.mo85916k().f72991b);
                C33778f.this.mExecutor.execute(hVar);
            }
        }

        public /* synthetic */ C33787i(C33778f fVar, C33779a aVar) {
            this();
        }
    }
}

package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.t */
public class C17239t {

    /* renamed from: b */
    public static final int f45506b = 0;

    /* renamed from: c */
    public static final int f45507c = 1;

    /* renamed from: d */
    public static final int f45508d = 2;

    /* renamed from: e */
    public static final int f45509e = 3;

    /* renamed from: f */
    public static final int f45510f = 4;

    /* renamed from: g */
    public static final int f45511g = 5;

    /* renamed from: h */
    public static final int f45512h = 6;

    /* renamed from: i */
    public static final int f45513i = 7;

    /* renamed from: j */
    public static final int f45514j = 8;

    /* renamed from: k */
    public static final int f45515k = 8;

    /* renamed from: l */
    public static final int f45516l = 1;

    /* renamed from: m */
    public static final int f45517m = 2;

    /* renamed from: n */
    public static final int f45518n = 4;

    /* renamed from: o */
    public static final int f45519o = 8;

    /* renamed from: p */
    public static final int f45520p = 16;

    /* renamed from: q */
    public static final int f45521q = 32;

    /* renamed from: r */
    public static final int f45522r = 64;

    /* renamed from: s */
    public static final int f45523s = 128;

    /* renamed from: t */
    public static final int f45524t = 256;

    /* renamed from: u */
    public static final int f45525u = 511;

    /* renamed from: a */
    public final C17242b f45526a;

    @C0376v0(24)
    /* renamed from: androidx.core.app.t$a */
    public static class C17240a extends C17242b {

        /* renamed from: e */
        public static final int f45527e = 1000000;

        /* renamed from: f */
        public static final int f45528f = 500000;

        /* renamed from: g */
        public static HandlerThread f45529g;

        /* renamed from: h */
        public static Handler f45530h;

        /* renamed from: a */
        public int f45531a;

        /* renamed from: b */
        public SparseIntArray[] f45532b = new SparseIntArray[9];

        /* renamed from: c */
        public final ArrayList<WeakReference<Activity>> f45533c = new ArrayList<>();

        /* renamed from: d */
        public Window.OnFrameMetricsAvailableListener f45534d = new C17241a();

        /* renamed from: androidx.core.app.t$a$a */
        public class C17241a implements Window.OnFrameMetricsAvailableListener {
            public C17241a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C17240a aVar = C17240a.this;
                if ((aVar.f45531a & 1) != 0) {
                    aVar.mo51700f(aVar.f45532b[0], frameMetrics.getMetric(8));
                }
                C17240a aVar2 = C17240a.this;
                if ((aVar2.f45531a & 2) != 0) {
                    aVar2.mo51700f(aVar2.f45532b[1], frameMetrics.getMetric(1));
                }
                C17240a aVar3 = C17240a.this;
                if ((aVar3.f45531a & 4) != 0) {
                    aVar3.mo51700f(aVar3.f45532b[2], frameMetrics.getMetric(3));
                }
                C17240a aVar4 = C17240a.this;
                if ((aVar4.f45531a & 8) != 0) {
                    aVar4.mo51700f(aVar4.f45532b[3], frameMetrics.getMetric(4));
                }
                C17240a aVar5 = C17240a.this;
                if ((aVar5.f45531a & 16) != 0) {
                    aVar5.mo51700f(aVar5.f45532b[4], frameMetrics.getMetric(5));
                }
                C17240a aVar6 = C17240a.this;
                if ((aVar6.f45531a & 64) != 0) {
                    aVar6.mo51700f(aVar6.f45532b[6], frameMetrics.getMetric(7));
                }
                C17240a aVar7 = C17240a.this;
                if ((aVar7.f45531a & 32) != 0) {
                    aVar7.mo51700f(aVar7.f45532b[5], frameMetrics.getMetric(6));
                }
                C17240a aVar8 = C17240a.this;
                if ((aVar8.f45531a & 128) != 0) {
                    aVar8.mo51700f(aVar8.f45532b[7], frameMetrics.getMetric(0));
                }
                C17240a aVar9 = C17240a.this;
                if ((aVar9.f45531a & 256) != 0) {
                    aVar9.mo51700f(aVar9.f45532b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public C17240a(int i) {
            this.f45531a = i;
        }

        /* renamed from: a */
        public void mo51695a(Activity activity) {
            if (f45529g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f45529g = handlerThread;
                handlerThread.start();
                f45530h = new Handler(f45529g.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f45532b;
                if (sparseIntArrayArr[i] == null && (this.f45531a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f45534d, f45530h);
            this.f45533c.add(new WeakReference(activity));
        }

        /* renamed from: b */
        public SparseIntArray[] mo51696b() {
            return this.f45532b;
        }

        /* renamed from: c */
        public SparseIntArray[] mo51697c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f45533c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() == activity) {
                    this.f45533c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f45534d);
            return this.f45532b;
        }

        /* renamed from: d */
        public SparseIntArray[] mo51698d() {
            SparseIntArray[] sparseIntArrayArr = this.f45532b;
            this.f45532b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* renamed from: e */
        public SparseIntArray[] mo51699e() {
            for (int size = this.f45533c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = this.f45533c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f45534d);
                    this.f45533c.remove(size);
                }
            }
            return this.f45532b;
        }

        /* renamed from: f */
        public void mo51700f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.t$b */
    public static class C17242b {
        /* renamed from: a */
        public void mo51695a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo51696b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo51697c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo51698d() {
            return null;
        }

        /* renamed from: e */
        public SparseIntArray[] mo51699e() {
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.t$c */
    public @interface C17243c {
    }

    public C17239t() {
        this(1);
    }

    /* renamed from: a */
    public void mo51690a(@C0359n0 Activity activity) {
        this.f45526a.mo51695a(activity);
    }

    @C0363p0
    /* renamed from: b */
    public SparseIntArray[] mo51691b() {
        return this.f45526a.mo51696b();
    }

    @C0363p0
    /* renamed from: c */
    public SparseIntArray[] mo51692c(@C0359n0 Activity activity) {
        return this.f45526a.mo51697c(activity);
    }

    @C0363p0
    /* renamed from: d */
    public SparseIntArray[] mo51693d() {
        return this.f45526a.mo51698d();
    }

    @C0363p0
    /* renamed from: e */
    public SparseIntArray[] mo51694e() {
        return this.f45526a.mo51699e();
    }

    public C17239t(int i) {
        this.f45526a = new C17240a(i);
    }
}
